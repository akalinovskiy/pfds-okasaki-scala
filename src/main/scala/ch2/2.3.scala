package ch2

sealed trait CustomList[+T]
case object Empty extends CustomList[Nothing]
final case class Cons[T](head: T, tail: CustomList[T]) extends CustomList[T]

object CustomListBasedStack extends Stack[CustomList] {
  def empty[T]: CustomList[T] = Empty
  def isEmpty[T](stack: CustomList[T]): Boolean = stack == Empty
  def cons[T](head: T)(tail: CustomList[T]): CustomList[T] = Cons(head, tail)
  def head[T](stack: CustomList[T]): T = stack match {
    case Empty => sys.error("head of empty list")
    case Cons(head, _) => head
  }
  def tail[T](stack: CustomList[T]): CustomList[T] = stack match {
    case Empty => sys.error("tail of empty list")
    case Cons(_, tail) => tail
  }
}