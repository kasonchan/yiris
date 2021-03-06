package yiris.objects.pretreatment.primaryclarifiers

import yiris.core.{fluent, ratios, removals}
import yiris.objects.pretreatment.primaryclarifiers.PrimaryClarifiers.{bod5Removal, tssRemoval}

/**
 * An object to represents primary clarifiers values and units.
 */
object ValueUnits extends fluent.ValueUnits with ratios.ValueUnits with removals.ValueUnits {

  /**
   * A case class to represent the default primary clarifiers.
   * tss the value of TSS removal. Default value and unit are 63.00%.
   * bod5 the value of BOD,,5,, removal. Default value and unit are 35.00%.
   * nh3n the value of NH,,3,,-N removal. Default value and unit are 0.00%.
   * tp the value of TP removal. Default value and unit are 0.00%.
   * fecalColiform the value of fecal coliform removal. Default value and unit are 0.00%.
   * enterococci the value of enterococci removal. Default value and unit are 0.00%.
   */
  val pcDefaultRemovals = MiscellaneousRemovals(tss = TSSRemoval(Some(tssRemoval)),
    bod5 = BOD5Removal(Some(bod5Removal)))

}
