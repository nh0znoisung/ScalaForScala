package org.example
import org.example.App
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers



class TwoferTest extends AnyFunSuite with Matchers {
  test("no given name"){
    Twofer.twofer() should be ("One for you, one for me.")
  }

  test("a given name") {
    Twofer.twofer("Alice") should be ("One for Alice, one for me.")
  }

  test("another name given"){
    Twofer.twofer("Bob") should be ("One for Bob, one for me.")
  }
}