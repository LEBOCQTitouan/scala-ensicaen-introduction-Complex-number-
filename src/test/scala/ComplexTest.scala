class ComplexTest extends UnitSpec {
  "Complex" should "be additionable" in {
    assert(Complex(2,2).equals(Complex(1,1) + Complex(1,1)))
  }

  it should "be subtractable" in {
    assert(Complex(1,1).equals(Complex(2,2) - Complex(1,1)))
  }

  it should "be reversible" in {
    assert(Complex(-1,-1).equals(-Complex(1,1)))
  }

  it should "be comparable to another complex based on it's module" in {
    val c1 = Complex(1, 1)
    val c2 = Complex(2, 2)
    assert(c1.maxModule(c2).equals(c2))
  }
}
