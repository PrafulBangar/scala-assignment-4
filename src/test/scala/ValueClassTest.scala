import org.scalatest.WordSpec


class ValueClassTest extends  WordSpec {


  val firstNameObject=new FirstName("Praful")
  val lastNameObject=new LastName("Bangar")
  val ageObject=new Age(21)
val result=println(s"($firstNameObject $lastNameObject is of $ageObject years)")
 val result1=displayDetails.displayDetails(firstNameObject,lastNameObject,ageObject)


  "Output requred" should {
    "Firstname+lastName+Age" in {
      assert(result.equals(result1))
    }
  }
}
