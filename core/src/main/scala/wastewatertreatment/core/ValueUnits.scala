package wastewatertreatment.core

import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/16/15.
 */
trait ValueUnits extends Core with Units {

  /**
   * BOD,,5,,/cBOD,,5,,.
   * @param value Default value is '''1.10'''.
   * @param unit Default is '''No unit'''.
   */
  case class BOD5CBOD5Ratio(value: Option[Double] = Some(bod5cBOD5Ratio),
                            unit: String = bod5cBOD5RatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * COD/BOD.
   * @param value Default value is '''1.60'''.
   * @param unit Default is '''No unit'''.
   */
  case class CODBODRatio(value: Option[Double] = Some(codBODRatio),
                         unit: String = codBODRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * COD/VSS.
   * @param value Default value is '''1.42'''.
   * @param unit Default is '''No unit'''.
   */
  case class CODVSSRatio(value: Option[Double] = Some(codVSSRatio),
                         unit: String = codVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * VSS/TSS.
   * @param value Default value is '''0.80'''.
   * @param unit Default is '''No unit'''.
   */
  case class VSSTSSRatio(value: Option[Double] = Some(vssTSSRatio),
                         unit: String = vssTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * TN.
   * @param value Default value is '''0.40'''.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TN(value: Option[Double] = Some(tn),
                unit: String = tnUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Biodegradable VSS (bVSS/VSS).
   * @param value Default value is '''0.80'''.
   * @param unit Default is '''No unit'''.
   */
  case class BVSS(value: Option[Double] = Some(bVSS),
                  unit: String = bVSSVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Non biodegradable VSS (nbVSS/VSS).
   * @param value Default value is '''0.20'''.
   * @param unit Default is '''No unit'''.
   */
  case class NbVSS(value: Option[Double] = Some(nbVSS),
                   unit: String = nbVSSVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Q.
   * @param unit Default is '''m^3^/d'''.
   */
  case class Q(value: Option[Double] = None,
               unit: String = qUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * TSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TSS(value: Option[Double] = None,
                 unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * VSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class VSS(value: Option[Double] = None,
                 unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * BOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BOD5(value: Option[Double] = None,
                  unit: String = bod5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * cBOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class CBOD5(value: Option[Double] = None,
                   unit: String = cBOD5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCOD.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCOD(value: Option[Double] = None,
                  unit: String = bCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODs.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODs(value: Option[Double] = None,
                   unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODp.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODp(value: Option[Double] = None,
                   unit: String = bCODpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * NH,,3,,-N.
   * @param unit Default is '''g/m^3^'''.
   */
  case class NH3N(value: Option[Double] = None,
                  unit: String = nh3nUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * TP.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TP(value: Option[Double] = None,
                unit: String = tpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * P.
   * @param unit Default is '''g-TSS/d'''.
   */
  case class P(value: Option[Double] = None,
               unit: String = pUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit

  /**
   * Fecal Coliform.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class FecalColiform(value: Option[Double] = None,
                           unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Enterococci.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class Enterococci(value: Option[Double] = None,
                         unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Turbidity.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class Turbidity(value: Option[Double] = None,
                       unit: String = hazeUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Miscellaneous
   * @param flow the value of flow. Default unit is '''m^3^/d'''.
   * @param tss the value of TSS. Default unit is '''g/m^3^'''.
   * @param vss the value of VSS. Default unit is '''g/m^3^'''.
   * @param bod5 the value of bod5. Default unit is '''g/m^3^'''.
   * @param cBOD5 the value of cBOD5. Default unit is '''g/m^3^'''.
   * @param bCOD the value of bCOD. Default unit is '''g/m^3^'''.
   * @param bCODs the value of bCODs. Default unit is '''g/m^3^'''.
   * @param bCODp the value of bCODp. Default unit is '''g/m^3^'''.
   * @param nh3n the value NH,,3,,-N. Default unit is '''g/m^3^'''.
   * @param tp the value of TP. Default unit is '''g/m^3^'''.
   * @param p the value of P. Default unit is '''g-TSS/d'''
   * @param fecalColiform the value of fecal coliform.  Default unit is '''MPN/100mL'''.
   * @param enterococci the value of enterococci. Default unit is '''MPN/100mL'''.
   * @param turbidity the value of turbidity. Default unit is '''MPN/100mL'''.
   */
  case class Miscellaneous(flow: Q,
                           tss: TSS,
                           vss: VSS,
                           bod5: BOD5,
                           cBOD5: CBOD5,
                           bCOD: BCOD,
                           bCODs: BCODs,
                           bCODp: BCODp,
                           nh3n: NH3N,
                           tp: TP,
                           p: P,
                           fecalColiform: FecalColiform,
                           enterococci: Enterococci,
                           turbidity: Turbidity)

}
