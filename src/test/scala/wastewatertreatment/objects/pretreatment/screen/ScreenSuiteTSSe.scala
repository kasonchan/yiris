package wastewatertreatment.objects.pretreatment.screen

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.screen.Screen.calTSSe

/**
 * Created by kasonchan on 10/25/15.
 */
class ScreenSuiteTSSe extends FlatSpec with Matchers {

  "calTSSe(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSSe(-1, -1)
    }
  }

  "calTSSe(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSSe(-1, 0)
    }
  }

  "calTSSe(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSSe(0, -1)
    }
  }

  "calTSSe(0, 0)" should "= 0" in {
    calTSSe(0, 0) shouldBe 0.0
  }

  "calTSSe(223, 27)" should "= 162.79" in {
    calTSSe(223, 27) shouldBe 162.79
  }

  "calTSSe(223)" should "= 162.79" in {
    calTSSe(223) shouldBe 162.79
  }

}
