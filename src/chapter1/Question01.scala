package chapter1

object Question01 extends App {
  val str = "�p�^�g�N�J�V�["
  println((for (i <- 0 to (6, 2)) yield str(i)).mkString)
}