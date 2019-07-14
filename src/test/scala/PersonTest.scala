
import org.scalatest.WordSpec


class PersonTest extends  WordSpec {

  val personOne = new Person("testdhdj", 30)
  val personTwo = new Person("teshhu", 39)


 if( personOne < personTwo)
  "Person Name" should {
    "personOne<personTwo" in {
      assert(true)
    }
  }
  if( personOne > personTwo)
    "Person Name" should {
      "personOne>personTwo" in {
        assert(true)
      }
    }

}
