import org.scalatest.WordSpec


class QueueTest extends  WordSpec {

  val objectDouble=new ListDouble
  val objectSquare=new ListSquare
  val objectDequeue=new ListDouble

  val list :List[Int]=List(1,2,3,4)

  "Enqueue" should {
    "Add double of element to list" in {
      assert(objectDouble.performEnqueue(list,6)==List(1,2,3,4,12))
    }
  }

  "Enqueue" should {
    "Add square of element to list" in {
      assert(objectSquare.performEnqueue(list,6)==List(1,2,3,4,36))
    }
  }

  "Dequeue" should {
    "delete element from list" in {
      assert(objectDequeue.performDequeue(list)==List(2,3,4))
    }
  }


  // println( objectDouble.performEnqueue(List(1,22,3),6))
  //println( objectSquare.performEnqueue(List(1,3,1),6))
 // println( objectDouble.performDequeue(List(1,2,3,6)))

}
