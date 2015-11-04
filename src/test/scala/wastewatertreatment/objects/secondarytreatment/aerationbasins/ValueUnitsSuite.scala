package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 10/31/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(ForallT(423819)" should "423819.00m^3" in {
    ValueUnit(ForallT(423819)) shouldBe "423819.00m^3"
  }

  "ValueUnit(ForallT(423819, \"xyz/abc\")" should "423819.00xyz/abc" in {
    ValueUnit(ForallT(423819, "xyz/abc")) shouldBe "423819.00xyz/abc"
  }

  "ValueUnit(QPeak(1393027)" should "1393027.00m^3/d" in {
    ValueUnit(QPeak(1393027)) shouldBe "1393027.00m^3/d"
  }

  "ValueUnit(QPeak(1393027, \"xyz/abc\")" should "1393027.00xyz/abc" in {
    ValueUnit(QPeak(1393027, "xyz/abc")) shouldBe "1393027.00xyz/abc"
  }

  "ValueUnit(Theta(0.30))" should "0.30d" in {
    ValueUnit(Theta(0.30)) shouldBe "0.30d"
  }

  "ValueUnit(Theta(0.30, \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(Theta(0.30, "xyz/abc")) shouldBe "0.30xyz/abc"
  }

  "ValueUnit(BOD(103))" should "103.00g/m^3" in {
    ValueUnit(BOD(103)) shouldBe "103.00g/m^3"
  }

  "ValueUnit(BOD(103, \"xyz/abc\"))" should "103.00xyz/abc" in {
    ValueUnit(BOD(103, "xyz/abc")) shouldBe "103.00xyz/abc"
  }

  "ValueUnit(Q(242981))" should "242981.00m^3/d" in {
    ValueUnit(Q(242981)) shouldBe "242981.00m^3/d"
  }

  "ValueUnit(Q(242981, \"xyz/abc\"))" should "242981.00xyz/abc" in {
    ValueUnit(Q(242981, "xyz/abc")) shouldBe "242981.00xyz/abc"
  }

  "ValueUnit(BODLoading(25027.04))" should "25027.04kg-BOD/d" in {
    ValueUnit(BODLoading(25027.04)) shouldBe "25027.04kg-BOD/d"
  }

  "ValueUnit(BODLoading(25027.04, \"xyz/abc\"))" should "25027.04xyz/abc" in {
    ValueUnit(BODLoading(25027.04, "xyz/abc")) shouldBe "25027.04xyz/abc"
  }

  "ValueUnit(BODRemoval())" should "97.00%" in {
    ValueUnit(BODRemoval()) shouldBe "97.00%"
  }

  "ValueUnit(BODRemoval(97))" should "97.00%" in {
    ValueUnit(BODRemoval(97)) shouldBe "97.00%"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(BODRemoval(97,\"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(BODRemoval(97, "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(TSSRemoval())" should "94.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "94.00%"
  }

  "ValueUnit(TSSRemoval(94))" should "94.00%" in {
    ValueUnit(TSSRemoval(94)) shouldBe "94.00%"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "94.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "94.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(94, \"xyz/abc\"))" should "94.00xyz/abc" in {
    ValueUnit(TSSRemoval(94, "xyz/abc")) shouldBe "94.00xyz/abc"
  }

  "ValueUnit(TKNRemoval())" should "88.00%" in {
    ValueUnit(TKNRemoval()) shouldBe "88.00%"
  }

  "ValueUnit(TKNRemoval(88))" should "88.00%" in {
    ValueUnit(TKNRemoval(88)) shouldBe "88.00%"
  }

  "ValueUnit(TKNRemoval(unit = \"xyz/abc\"))" should "88.00xyz/abc" in {
    ValueUnit(TKNRemoval(unit = "xyz/abc")) shouldBe "88.00xyz/abc"
  }

  "ValueUnit(TKNRemoval(88, \"xyz/abc\"))" should "88.00xyz/abc" in {
    ValueUnit(TKNRemoval(88, "xyz/abc")) shouldBe "88.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval())" should "97.00%" in {
    ValueUnit(NH3NRemoval()) shouldBe "97.00%"
  }

  "ValueUnit(NH3NRemoval(97))" should "97.00%" in {
    ValueUnit(NH3NRemoval(97)) shouldBe "97.00%"
  }

  "ValueUnit(NH3NRemoval(unit = \"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(NH3NRemoval(unit = "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval(97,\"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(NH3NRemoval(97, "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval())" should "98.00%" in {
    ValueUnit(PhosphorousRemoval()) shouldBe "98.00%"
  }

  "ValueUnit(PhosphorousRemoval(98))" should "98.00%" in {
    ValueUnit(PhosphorousRemoval(98)) shouldBe "98.00%"
  }

  "ValueUnit(PhosphorousRemoval(unit = \"xyz/abc\"))" should "98.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(unit = "xyz/abc")) shouldBe "98.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval(98, \"xyz/abc\"))" should "98.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(98, "xyz/abc")) shouldBe "98.00xyz/abc"
  }

  "ValueUnit(BCODsRemoval())" should "100.00%" in {
    ValueUnit(BCODsRemoval()) shouldBe "100.00%"
  }

  "ValueUnit(BCODsRemoval(100))" should "100.00%" in {
    ValueUnit(BCODsRemoval(100)) shouldBe "100.00%"
  }

  "ValueUnit(BCODsRemoval(unit = \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(BCODsRemoval(unit = "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(BCODsRemoval(100, \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(BCODsRemoval(100, "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio())" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio()) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(0.33))" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio(0.33)) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(unit = \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(unit = "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(0.33, \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(0.33, "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(Sne())" should "0.50g/m^3" in {
    ValueUnit(Sne()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Sne(0.5))" should "0.50g/m^3" in {
    ValueUnit(Sne(0.5)) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Sne(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Sne(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Sne(0.5, \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Sne(0.5, "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Xvss())" should "3000.00g/m^3" in {
    ValueUnit(Xvss()) shouldBe "3000.00g/m^3"
  }

  "ValueUnit(Xvss(3000))" should "3000.00g/m^3" in {
    ValueUnit(Xvss(3000)) shouldBe "3000.00g/m^3"
  }

  "ValueUnit(Xvss(unit = \"xyz/abc\"))" should "3000.00xyz/abc" in {
    ValueUnit(Xvss(unit = "xyz/abc")) shouldBe "3000.00xyz/abc"
  }

  "ValueUnit(Xvss(3000, \"xyz/abc\"))" should "3000.00xyz/abc" in {
    ValueUnit(Xvss(3000, "xyz/abc")) shouldBe "3000.00xyz/abc"
  }

  "ValueUnit(SeBOD())" should "1.00g/m^3" in {
    ValueUnit(SeBOD()) shouldBe "1.00g/m^3"
  }

  "ValueUnit(SeBOD(1))" should "1.00g/m^3" in {
    ValueUnit(SeBOD(1)) shouldBe "1.00g/m^3"
  }

  "ValueUnit(SeBOD(unit = \"xyz/abc\"))" should "1.00xyz/abc" in {
    ValueUnit(SeBOD(unit = "xyz/abc")) shouldBe "1.00xyz/abc"
  }

  "ValueUnit(SeBOD(1, \"xyz/abc\"))" should "1.00xyz/abc" in {
    ValueUnit(SeBOD(1, "xyz/abc")) shouldBe "1.00xyz/abc"
  }

  "ValueUnit(NbvssVSSRatio())" should "0.20" in {
    ValueUnit(NbvssVSSRatio()) shouldBe "0.20"
  }

  "ValueUnit(NbvssVSSRatio(0.2))" should "0.20" in {
    ValueUnit(NbvssVSSRatio(0.2)) shouldBe "0.20"
  }

  "ValueUnit(NbvssVSSRatio(unit = \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbvssVSSRatio(unit = "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(NbvssVSSRatio(0.2, \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbvssVSSRatio(0.2, "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(Ko())" should "0.50g/m^3" in {
    ValueUnit(Ko()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Ko(0.5))" should "0.50g/m^3" in {
    ValueUnit(Ko(0.5)) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Ko(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Ko(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Ko(0.5, \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Ko(0.5, "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Do())" should "2.00g/m^3" in {
    ValueUnit(Do()) shouldBe "2.00g/m^3"
  }

  "ValueUnit(Do(2))" should "2.00g/m^3" in {
    ValueUnit(Do(2)) shouldBe "2.00g/m^3"
  }

  "ValueUnit(Do(unit = \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(Do(unit = "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Do(2, \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(Do(2, "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Fnd())" should "0.10" in {
    ValueUnit(Fnd()) shouldBe "0.10"
  }

  "ValueUnit(Fnd(0.1))" should "0.10" in {
    ValueUnit(Fnd(0.1)) shouldBe "0.10"
  }

  "ValueUnit(Fnd(unit = \"xyz/abc\"))" should "0.10xyz/abc" in {
    ValueUnit(Fnd(unit = "xyz/abc")) shouldBe "0.10xyz/abc"
  }

  "ValueUnit(Fnd(0.1, \"xyz/abc\"))" should "0.10xyz/abc" in {
    ValueUnit(Fnd(0.1, "xyz/abc")) shouldBe "0.10xyz/abc"
  }

  "ValueUnit(FactorOfSafety())" should "2.00" in {
    ValueUnit(FactorOfSafety()) shouldBe "2.00"
  }

  "ValueUnit(FactorOfSafety(2))" should "2.00" in {
    ValueUnit(FactorOfSafety(2)) shouldBe "2.00"
  }

  "ValueUnit(FactorOfSafety(unit = \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(FactorOfSafety(unit = "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(FactorOfSafety(2, \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(FactorOfSafety(2, "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Xr())" should "8000.00g/m^3" in {
    ValueUnit(Xr()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xr(8000))" should "8000.00g/m^3" in {
    ValueUnit(Xr(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xr(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xr(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xr(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xr(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xn())" should "8000.00g/m^3" in {
    ValueUnit(Xn()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xn(8000))" should "8000.00g/m^3" in {
    ValueUnit(Xn(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xn(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xn(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xn(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xn(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xe())" should "10.00g/m^3" in {
    ValueUnit(Xe()) shouldBe "10.00g/m^3"
  }

  "ValueUnit(Xe(10))" should "10.00g/m^3" in {
    ValueUnit(Xe(10)) shouldBe "10.00g/m^3"
  }

  "ValueUnit(Xe(unit = \"xyz/abc\"))" should "10.00xyz/abc" in {
    ValueUnit(Xe(unit = "xyz/abc")) shouldBe "10.00xyz/abc"
  }

  "ValueUnit(Xe(10, \"xyz/abc\"))" should "10.00xyz/abc" in {
    ValueUnit(Xe(10, "xyz/abc")) shouldBe "10.00xyz/abc"
  }

  "ValueUnit(NOxe())" should "6.00g/m^3" in {
    ValueUnit(NOxe()) shouldBe "6.00g/m^3"
  }

  "ValueUnit(NOxe(6))" should "6.00g/m^3" in {
    ValueUnit(NOxe(6)) shouldBe "6.00g/m^3"
  }

  "ValueUnit(NOxe(unit = \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(NOxe(unit = "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(NOxe(6, \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(NOxe(6, "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(RbCOD())" should "0.30g/m^3" in {
    ValueUnit(RbCOD()) shouldBe "0.30g/m^3"
  }

  "ValueUnit(RbCOD(0.3))" should "0.30g/m^3" in {
    ValueUnit(RbCOD(0.3)) shouldBe "0.30g/m^3"
  }

  "ValueUnit(RbCOD(unit = \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(RbCOD(unit = "xyz/abc")) shouldBe "0.30xyz/abc"
  }

  "ValueUnit(RbCOD(0.3, \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(RbCOD(0.3, "xyz/abc")) shouldBe "0.30xyz/abc"
  }



  "ValueUnit(U(6))" should "6.00d^-1" in {
    ValueUnit(U(6)) shouldBe "6.00d^-1"
  }

  "ValueUnit(U(6, \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(U(6, "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(Ks(20))" should "20.00g/m^3" in {
    ValueUnit(Ks(20)) shouldBe "20.00g/m^3"
  }

  "ValueUnit(Ks(20, \"xyz/abc\"))" should "20.00xyz/abc" in {
    ValueUnit(Ks(20, "xyz/abc")) shouldBe "20.00xyz/abc"
  }

  "ValueUnit(Y(0.12))" should "0.12" in {
    ValueUnit(Y(0.12)) shouldBe "0.12"
  }

  "ValueUnit(Y(0.12, \"xyz/abc\"))" should "0.12xyz/abc" in {
    ValueUnit(Y(0.12, "xyz/abc")) shouldBe "0.12xyz/abc"
  }

  "ValueUnit(Kd(6))" should "6.00d^-1" in {
    ValueUnit(Kd(6)) shouldBe "6.00d^-1"
  }

  "ValueUnit(Kd(6, \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(Kd(6, "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "Default Heterotrophs()" should "pass" in {
    val h = Heterotrophs()

    h.u shouldBe U(6.00, "d^-1")
    h.kS shouldBe Ks(20.00, "g/m^3")
    h.y shouldBe Y(0.40, "")
    h.kD shouldBe Kd(0.12, "d^-1")
    ValueUnit(h.u) shouldBe "6.00d^-1"
    ValueUnit(h.kS) shouldBe "20.00g/m^3"
    ValueUnit(h.y) shouldBe "0.40"
    ValueUnit(h.kD) shouldBe "0.12d^-1"
  }

  "Heterotrophs(U(1, \"a\"), Ks(2, \"b\"), kD = Kd(3, \"c\"))" should "pass" in {
    val h = Heterotrophs(U(1, "a"), Ks(2, "b"), kD = Kd(3, "c"))

    h.u shouldBe U(1.00, "a")
    h.kS shouldBe Ks(2.00, "b")
    h.y shouldBe Y(0.40, "")
    h.kD shouldBe Kd(3.00, "c")
    ValueUnit(h.u) shouldBe "1.00a"
    ValueUnit(h.kS) shouldBe "2.00b"
    ValueUnit(h.y) shouldBe "0.40"
    ValueUnit(h.kD) shouldBe "3.00c"
  }

  "Default Nitrifiers()" should "pass" in {
    val n = Nitrifiers()

    n.u shouldBe U(0.75, "d^-1")
    n.kS shouldBe Ks(0.74, "g/m^3")
    n.y shouldBe Y(0.12, "")
    n.kD shouldBe Kd(0.08, "d^-1")
    ValueUnit(n.u) shouldBe "0.75d^-1"
    ValueUnit(n.kS) shouldBe "0.74g/m^3"
    ValueUnit(n.y) shouldBe "0.12"
    ValueUnit(n.kD) shouldBe "0.08d^-1"
  }

  "Nitrifiers(kS = Ks(2, \"b\"), y = Y(1, \"a\"), kD = Kd(3, \"c\"))" should "pass" in {
    val h = Nitrifiers(kS = Ks(2, "b"), y = Y(1, "a"), kD = Kd(3, "c"))

    h.u shouldBe U(0.75, "d^-1")
    h.kS shouldBe Ks(2.00, "b")
    h.y shouldBe Y(1.00, "a")
    h.kD shouldBe Kd(3.00, "c")
    ValueUnit(h.u) shouldBe "0.75d^-1"
    ValueUnit(h.kS) shouldBe "2.00b"
    ValueUnit(h.y) shouldBe "1.00a"
    ValueUnit(h.kD) shouldBe "3.00c"
  }

  "ValueUnit(ForallAnoxic(904000))" should "904000.00m^3" in {
    ValueUnit(ForallAnoxic(904000)) shouldBe "904000.00m^3"
  }

  "ValueUnit(ForallAnoxic(904000, \"xyz/abc\"))" should "904000.00xyz/abc" in {
    ValueUnit(ForallAnoxic(904000, "xyz/abc")) shouldBe "904000.00xyz/abc"
  }

  "ValueUnit(ThetaAerobic(1.92))" should "1.92d" in {
    ValueUnit(ThetaAerobic(1.92)) shouldBe "1.92d"
  }

  "ValueUnit(ThetaAerobic(1.92, \"xyz/abc\"))" should "1.92xyz/abc" in {
    ValueUnit(ThetaAerobic(1.92, "xyz/abc")) shouldBe "1.92xyz/abc"
  }

  "ValueUnit(ThetaC(6.18))" should "6.18d" in {
    ValueUnit(ThetaC(6.18)) shouldBe "6.18d"
  }

  "ValueUnit(ThetaC(6.18, \"xyz/abc\"))" should "6.18xyz/abc" in {
    ValueUnit(ThetaC(6.18, "xyz/abc")) shouldBe "6.18xyz/abc"
  }

  "ValueUnit(S(119))" should "119.00g-BOD/m^3" in {
    ValueUnit(S(119)) shouldBe "119.00g-BOD/m^3"
  }

  "ValueUnit(S(119, \"xyz/abc\"))" should "119.00xyz/abc" in {
    ValueUnit(S(119, "xyz/abc")) shouldBe "119.00xyz/abc"
  }

  "ValueUnit(XActiveBiomass(2597447221))" should "2597447221.00g/d" in {
    ValueUnit(XActiveBiomass(2597447221.00)) shouldBe "2597447221.00g/d"
  }

  "ValueUnit(XActiveBiomass(2597447221, \"xyz/abc\"))" should "2597447221.00xyz/abc" in {
    ValueUnit(XActiveBiomass(2597447221.00, "xyz/abc")) shouldBe "2597447221.00xyz/abc"
  }

  "ValueUnit(XAppPiecesAndParts(1929343))" should "1929343.00g/d" in {
    ValueUnit(XAppPiecesAndParts(1929343.00)) shouldBe "1929343.00g/d"
  }

  "ValueUnit(XAppPiecesAndParts(1929343, \"xyz/abc\"))" should "1929343.00xyz/abc" in {
    ValueUnit(XAppPiecesAndParts(1929343.00, "xyz/abc")) shouldBe "1929343.00xyz/abc"
  }

  "ValueUnit(PXBio(27900739.07))" should "27900739.07g/d" in {
    ValueUnit(PXBio(27900739.07)) shouldBe "27900739.07g/d"
  }

  "ValueUnit(PXBio(27900739.07, \"xyz/abc\"))" should "27900739.07xyz/abc" in {
    ValueUnit(PXBio(27900739.07, "xyz/abc")) shouldBe "27900739.07xyz/abc"
  }

  "ValueUnit(Xb(58.58))" should "58.58g/m^3" in {
    ValueUnit(Xb(58.58)) shouldBe "58.58g/m^3"
  }

  "ValueUnit(Xb(58.58, \"xyz/abc\"))" should "58.58xyz/abc" in {
    ValueUnit(Xb(58.58, "xyz/abc")) shouldBe "58.58xyz/abc"
  }

  "ValueUnit(FMRatio(2.15))" should "2.15" in {
    ValueUnit(FMRatio(2.15)) shouldBe "2.15"
  }

  "ValueUnit(FMRatio(2.15, \"xyz/abc\"))" should "2.15xyz/abc" in {
    ValueUnit(FMRatio(2.15, "xyz/abc")) shouldBe "2.15xyz/abc"
  }

  "ValueUnit(SDNR(0.33))" should "0.33" in {
    ValueUnit(SDNR(0.33)) shouldBe "0.33"
  }

  "ValueUnit(SDNR(0.33, \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(SDNR(0.33, "xyz/abc")) shouldBe "0.33xyz/abc"
  }

}
