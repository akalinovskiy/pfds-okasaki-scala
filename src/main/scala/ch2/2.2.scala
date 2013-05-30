package ch2

object ListBasedStack extends Stack[List] {
  def empty[T]: List[T] = Nil
  def isEmpty[T](stack: List[T]): Boolean = stack.isEmpty
  def cons[T](head: T)(tail: List[T]): List[T] = head :: tail
  def head[T](stack: List[T]): T = stack.head
  def tail[T](stack: List[T]): List[T] = stack.tail
}