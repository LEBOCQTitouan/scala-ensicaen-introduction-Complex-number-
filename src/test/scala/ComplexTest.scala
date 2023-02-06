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
}
