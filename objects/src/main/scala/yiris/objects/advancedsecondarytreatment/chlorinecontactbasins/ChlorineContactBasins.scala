package yiris.objects.advancedsecondarytreatment.chlorinecontactbasins

import yiris.core.calculations.Calculations
import yiris.core.fluent.Fluent
import yiris.core.ratios.Ratios
import yiris.core.removals.Removals

/**
 * An object to represents chlorine contact basins.
 */
object ChlorineContactBasins extends Calculations with Fluent with Ratios with Removals {

  /**
   * Bacterial removal rate = 99.99%.
   */
  val bacterialRemovalRate = 99.99

  /**
   * A case class to represent the default chlorine contact basins.
   * tss the value of TSS removal. Default value is 0.00.
   * bod5 the value of BOD,,5,, removal. Default value is 0.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 0.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 99.99.
   * enterococci the value of enterococci removal. Default value is 99.99.
   */
  val ccbDefaultRemovals = Removals(fecalColiform = Some(bacterialRemovalRate),
    enterococci = Some(bacterialRemovalRate))

}
