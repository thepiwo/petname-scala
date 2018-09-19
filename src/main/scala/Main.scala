import scala.io.Source
import scala.util.Random
import Complexity.Complexity

object Main extends App {
  def generatePetname(words: Int, separator: String = "-", complexity: Complexity): String = {
    implicit val complexityString: String = complexity.toString.toLowerCase

    val wordsList = words match {
      case 1 => List(getName)
      case 2 => List(getAdjective, getName)
      case x if x <= 0 => throw new Exception("only wordcounts > 0 allowed")
      case x => (for (_ <- 2 until x) yield getAdverb) ++ List(getAdjective, getName)
    }

    wordsList.mkString(separator)
  }

  private def readFile(part: String)(implicit complexity: String) = {
    val filePath = s"$complexity/${part}s.txt"
    val linesLength = Source.fromResource(filePath).getLines.length
    val random = Random.nextInt(linesLength)
    Source.fromResource(filePath).getLines.slice(linesLength - random, linesLength - random + 1).mkString
  }

  private def getAdjective(implicit complexity: String) = readFile("adjective")

  private def getName(implicit complexity: String) = readFile("name")

  private def getAdverb(implicit complexity: String) = readFile("adverb")
}

object Complexity {

  sealed trait Complexity

  case object Large extends Complexity

  case object Medium extends Complexity

  case object Small extends Complexity

}


