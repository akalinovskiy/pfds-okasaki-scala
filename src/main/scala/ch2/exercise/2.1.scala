package ch2.exercise

object Suffixes {
  def suffixes[T](list: List[T]): List[List[T]] = list match {
    case Nil => Nil
    case _   => list :: suffixes(list.tail)
  }

  1 :: Nil
}