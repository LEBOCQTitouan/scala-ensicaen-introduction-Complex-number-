import scala.math._

class Complex (val r: Int = 0, val i: Int = 0) {
  override def toString(): String = {
    if (r == 0 && i == 0) {
      return s"0"
    }

    if (r == 0) {
      return s"Complex[${i}*i]"
    }
    if (i == 0) {
      return s"Complex[$r]"
    }

    if (i < 0) {
      return s"Complex[$r - ${-i}*i]"
    }
    s"Complex[$r + ${i}*i]"
  }

  def module: Double = sqrt(r*r + i*i)

  def maxModule(c: Complex): Complex = {
    if (c.module > module)
      return c
    this
  }

  def +(that: Complex): Complex = Complex(r + that.r, i + that.i)
  def -(that: Complex): Complex = Complex(r - that.r, i - that.i)
  def unary_-(): Complex = Complex(-r, -i)
  def ==(c1 : Complex, c2 : Complex): Boolean = (c1.r == c2.r && c1.i == c2.i)

  override def equals(obj: Any): Boolean = {
    obj match {
      case complex : Complex => (this.i == complex.i && this.r == complex.r)
      case _ => false
    }
  }
}

object Complex {
  def apply(r: Int, i: Int): Complex = new Complex(r, i)
  implicit def doubleToComplex(n: Double) = new Complex(n.toInt)
}