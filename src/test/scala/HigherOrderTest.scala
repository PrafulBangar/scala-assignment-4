import HigherOrder.{sumOfCube, sumOfInt, sumOfSquare}
import org.scalatest.WordSpec


class HigherOrderTest extends  WordSpec {


  "HighOrder Integer Addition" should {
    "Add Numbers" in {
      assert(HigherOrder.sum(sumOfInt,4,3)==7)
    }
  }

  "HighOrder Square Addition" should {
    "Add Square" in {
      assert(HigherOrder.sum(sumOfSquare,4,3)==25)
    }
  }

  "HighOrder Cube Addition" should {
    "Add Cubes" in {
      assert(HigherOrder.sum(sumOfCube,4,3)==91)
    }
  }
}
