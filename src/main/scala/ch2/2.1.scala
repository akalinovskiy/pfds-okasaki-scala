package ch2

trait Stack[S[_]] {
  def empty[T]: S[T]
  def isEmpty[T](stack: S[T]): Boolean

  def cons[T](head: T)(tail: S[T]): S[T]
  def head[T](stack: S[T]): T
  def tail[T](stack: S[T]): S[T]
}


