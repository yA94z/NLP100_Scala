package chapter1

object Question01 extends App {
  val str = "パタトクカシー"
  println((for (i <- 0 to (6, 2)) yield str(i)).mkString)
}