package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/9/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(45))" should "45.00%" in {
    ValueUnit(TSSRemoval(45)) shouldBe "45.00%"
  }

  "ValueUnit(TSSRemoval())" should "45.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "45.00%"
  }

  "ValueUnit(TSSRemoval(45, \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TSSRemoval(45, "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(BODRemoval(25))" should "25.00%" in {
    ValueUnit(BODRemoval(25)) shouldBe "25.00%"
  }

  "ValueUnit(BODRemoval())" should "25.00%" in {
    ValueUnit(BODRemoval()) shouldBe "25.00%"
  }

  "ValueUnit(BODRemoval(25, \"xyz/abc\"))" should "25.00xyz/abc" in {
    ValueUnit(BODRemoval(25, "xyz/abc")) shouldBe "25.00xyz/abc"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "25.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "25.00xyz/abc"
  }

  "ValueUnit(TSS(8000))" should "8000.00g/m^3" in {
    ValueUnit(TSS(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(TSS())" should "8000.00g/m^3" in {
    ValueUnit(TSS()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(TSS(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(TSS(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(TSS(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(TSS(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(PVSSRatio(0.02))" should "0.02" in {
    ValueUnit(PVSSRatio(0.02)) shouldBe "0.02"
  }

  "ValueUnit(PVSSRatio())" should "0.02" in {
    ValueUnit(PVSSRatio()) shouldBe "0.02"
  }

  "ValueUnit(PVSSRatio(0.02, \"xyz/abc\"))" should "0.02xyz/abc" in {
    ValueUnit(PVSSRatio(0.02, "xyz/abc")) shouldBe "0.02xyz/abc"
  }

  "ValueUnit(PVSSRatio(unit = \"xyz/abc\"))" should "0.02xyz/abc" in {
    ValueUnit(PVSSRatio(unit = "xyz/abc")) shouldBe "0.02xyz/abc"
  }

  "ValueUnit(Q(481131.12))" should "481131.12m^3/d" in {
    ValueUnit(Q(481131.12)) shouldBe "481131.12m^3/d"
  }

  "ValueUnit(Q(481131.12, \"xyz/abc\"))" should "481131.12xyz/abc" in {
    ValueUnit(Q(481131.12, "xyz/abc")) shouldBe "481131.12xyz/abc"
  }

  "ValueUnit(VSSTSSRatio(0.80))" should "0.80" in {
    ValueUnit(VSSTSSRatio(0.80)) shouldBe "0.80"
  }

  "ValueUnit(VSSTSSRatio())" should "0.80" in {
    ValueUnit(VSSTSSRatio()) shouldBe "0.80"
  }

  "ValueUnit(VSSTSSRatio(0.80, \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(VSSTSSRatio(0.80, "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(VSSTSSRatio(unit = \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(VSSTSSRatio(unit = "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(VSS(0.33))" should "0.33g/m^3" in {
    ValueUnit(VSS(0.33)) shouldBe "0.33g/m^3"
  }

  "ValueUnit(VSS(0.33, \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(VSS(0.33, "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(BOD5(0.33))" should "0.33g/m^3" in {
    ValueUnit(BOD5(0.33)) shouldBe "0.33g/m^3"
  }

  "ValueUnit(BOD5(0.33, \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(BOD5(0.33, "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(CBOD5(0.68))" should "0.68g/m^3" in {
    ValueUnit(CBOD5(0.68)) shouldBe "0.68g/m^3"
  }

  "ValueUnit(CBOD5(0.68, \"xyz/abc\"))" should "0.68xyz/abc" in {
    ValueUnit(CBOD5(0.68, "xyz/abc")) shouldBe "0.68xyz/abc"
  }

  "ValueUnit(BCODs(0.00))" should "0.00g/m^3" in {
    ValueUnit(BCODs(0.00)) shouldBe "0.00g/m^3"
  }

  "ValueUnit(BCODs(0.00, \"xyz/abc\"))" should "0.00xyz/abc" in {
    ValueUnit(BCODs(0.00, "xyz/abc")) shouldBe "0.00xyz/abc"
  }

  "ValueUnit(BCODp(0.38))" should "0.38g/m^3" in {
    ValueUnit(BCODp(0.38)) shouldBe "0.38g/m^3"
  }

  "ValueUnit(BCODp(0.38, \"xyz/abc\"))" should "0.38xyz/abc" in {
    ValueUnit(BCODp(0.38, "xyz/abc")) shouldBe "0.38xyz/abc"
  }

  "ValueUnit(BCOD(0.38))" should "0.38g/m^3" in {
    ValueUnit(BCOD(0.38)) shouldBe "0.38g/m^3"
  }

  "ValueUnit(BCOD(0.38, \"xyz/abc\"))" should "0.38xyz/abc" in {
    ValueUnit(BCOD(0.38, "xyz/abc")) shouldBe "0.38xyz/abc"
  }

  "ValueUnit(P(199613.87))" should "199613.87g-TSS/d" in {
    ValueUnit(P(199613.87)) shouldBe "199613.87g-TSS/d"
  }

  "ValueUnit(P(199613.87, \"xyz/abc\"))" should "199613.87xyz/abc" in {
    ValueUnit(P(199613.87, "xyz/abc")) shouldBe "199613.87xyz/abc"
  }

  "ValueUnit(TP(0.64))" should "0.64g/m^3" in {
    ValueUnit(TP(0.64)) shouldBe "0.64g/m^3"
  }

  "ValueUnit(TP(0.64, \"xyz/abc\"))" should "0.64xyz/abc" in {
    ValueUnit(TP(0.64, "xyz/abc")) shouldBe "0.64xyz/abc"
  }

}
