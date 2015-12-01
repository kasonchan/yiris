package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.core
import wastewatertreatment.objects.pretreatment.screens.Screens.{bod5Removal, tssRemoval}
import wastewatertreatment.objects.pretreatment.screens.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 10/26/15.
 */
object ValueUnits extends core.ValueUnits {

  /**
   * TSS removal
   * @param value Default value is '''27.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class TSSRemoval(value: Option[Double] = Some(tssRemoval),
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * BOD,,5,, removal
   * @param value Default value is '''27.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class BOD5Removal(value: Option[Double] = Some(bod5Removal),
                         unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

}