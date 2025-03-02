package $package$

import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite {  
  
  test("toUpper is an alias to toUpperCase") {  
    assert("wonderful world".toUpper == "WONDERFUL WORLD")
  }

  test("double method should double integer") { 
    import Main._
    assert(double(2) == 4)
  }

}
