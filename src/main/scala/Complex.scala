import scala.math._

class Complex (val r: Int = 0, val i: Int = 0) {
  override def toString(): String = {
    if (r == 0 && i == 0) {
      return s"0"
    }

    if (r == 0) {
      return s"Complexe[${i}i]"
    }
    if (i == 0) {
      return s"Complexe[$r]"
    }

    if (i < 0) {
      return s"Complexe[$r-${-i} i]"
    }
    return s"Complexe[$r+${i}i]"
  }

  def module: Double = sqrt(r*r + i*i)

  def +(that: Complex): Complex = Complex(r + that.r, i + that.i)
  def -(that: Complex): Complex = Complex(r - that.r, i - that.i)
  def -(): Complex = Complex(-r, -i)
}

object Complex {
  def apply(r: Int, i: Int): Complex = new Complex(r, i)
}