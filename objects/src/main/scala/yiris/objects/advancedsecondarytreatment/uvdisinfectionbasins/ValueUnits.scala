package yiris.objects.advancedsecondarytreatment.uvdisinfectionbasins

import yiris.core.{fluent, ratios, removals}
import yiris.objects.advancedsecondarytreatment.uvdisinfectionbasins.UVDisinfectionBasins.bacterialRemovalRate

/**
 * An object to represents uv disinfection basins values and units.
 */
object ValueUnits extends fluent.ValueUnits with ratios.ValueUnits with removals.ValueUnits {
  /**
   * A case class to represent the default UV disinfection basins.
   * tss the value of TSS removal. Default value and units are 0.00%.
   * bod5 the value of BOD,,5,, removal. Default value and units are 0.00%.
   * nh3n the value of NH,,3,,-N removal. Default value and units are 0.00%.
   * tp the value of TP removal. Default value and units are 0.00%.
   * fecalColiform the value of fecal coliform removal. Default value and units are 99.99%.
   * enterococci the value of enterococci removal. Default value and units are 99.99%.
   */
  val uvdbDefaultRemovals = MiscellaneousRemovals(fecalColiform = FecalColiformRemoval(Some(bacterialRemovalRate)),
    enterococci = EnterococciRemoval(Some(bacterialRemovalRate)))

}
