package wastewatertreatment.massbalance

/**
 * Created by kasonchan on 11/14/15.
 */
case class MX(M: Option[Double], X: Option[Double], Removal: Option[Double] = None)

object MassBalance {

  /**
   * Returns the sum of multiplication of the mass balances.
   * @param inputs the list of mass balances.
   */
  private def multiplySum(inputs: List[MX]): Double = {
    inputs.foldLeft(0.0) {
      (m, n) => m + (n.M.getOrElse(0.0) * n.X.getOrElse(0.0) * ((100 - n.Removal.getOrElse(0.0)) / 100))
    }
  }

  /**
   * Returns the grouped sum of multiplication of the mass balances.
   * Otherwise, returns the mass balance.
   * @param puts the list of mass balances.
   */
  private def group(puts: List[MX]): Either[Double, (MX, Double)] = {
    val spanned = puts match {
      case List() => None
      case l: List[MX] =>
        val r = l span {
          mx => mx.M.isEmpty || mx.X.isEmpty
        }
        Some(r)
    }

    spanned match {
      case None => Left(0.0)
      case Some(x) => x match {
        case (List(), t) => Left(multiplySum(t))
        case (h, t) => Right(h.head, multiplySum(t))
      }
    }
  }

  /**
   * Solves the equation of mass balances and returns the result; otherwise
   * returns 0.0.
   * @param inputs the list of mass balances on the left hand side of equation.
   * @param outputs the list of mass balances on the right hand side of equation.
   */
  def solve(inputs: List[MX], outputs: List[MX]): Option[Double] = {
    val i = group(inputs)
    val o = group(outputs)

    println(i)
    println(o)

    o match {
      case Left(l) => None
      case Right(r) => r match {
        case (mx, sum) =>
          (mx.M, mx.X, mx.Removal) match {
            case (Some(x), None, _) =>
              val r = (i.left.getOrElse(0.0) - sum) / x
              Some(r)
            case (None, Some(x), _) =>
              val r = (i.left.getOrElse(0.0) - sum) / x
              Some(r)
            case _ => None
          }
        case _ => None
      }
      case _ => None
    }
  }

}
