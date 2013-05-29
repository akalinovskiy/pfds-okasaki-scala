package ch2

import org.scalatest.FunSuite
import ch2.exercise.Suffixes

class SuffixesTest extends FunSuite {

  test("suffixes on List(1,2,3,4)") {
    val expectedResult = List(1,2,3,4) :: List(2,3,4) :: List(3,4) :: List(4) :: Nil
    assert(Suffixes.suffixes(List(1,2,3,4)) == expectedResult)
  }

}
