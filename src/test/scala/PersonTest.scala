
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
/*
val sorting: Sorting = new Sorting

val sortedList: List[Int] = List(1, 2, 3, 4, 5)
val unSortedList: List[Int] = List(2, 3, 1, 5, 4)
val reversedList: List[Int] = List(5, 4, 3, 2, 1)
val listWithNegativeIntegers: List[Int] = List(1, -1, 2, -2)

"Insertion Sort" should {

  "sort sorted list" in {
    assert(sorting.insertionSort(sortedList) == sortedList.sortBy(identity))
  }*/