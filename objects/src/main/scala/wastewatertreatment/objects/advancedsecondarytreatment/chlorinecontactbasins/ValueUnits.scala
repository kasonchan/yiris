package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import wastewatertreatment.core
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins._
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/10/15.
 */
object ValueUnits extends core.ValueUnits {

  /**
   * Bacterial removal rate
   * @param value Default value is 99.99.
   * @param unit Default unit is '''No unit'''.
   */
  case class BacterialRemovalRate(value: Option[Double] = Some(bacterialRemovalRate),
                                  unit: String = bacterialRemovalRateUnits.headOption.getOrElse("")) extends ValueUnit

}
