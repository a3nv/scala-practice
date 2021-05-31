package com.competitive.practice.leetcode.solutions.easy

import org.junit.Test
import collection.mutable.Stack
import org.scalatest.flatspec.AnyFlatSpec


class E709ToLowerCaseSpec extends AnyFlatSpec {

  behavior of "to lower case method"

  val sol = new E709ToLowerCase

  it should "return a result in a lower case from a string with a british capitalization letters" in {
    assert("leetcode".equals(sol.toLowerCase("LeetCode")))
  }

  it should "return a result in a lower case from a string in a lower case" in {
    assert("here".equals(sol.toLowerCase("here")))
  }

  it should "return a result in a lower case from a string in an upper case" in {
    assert("lovely".equals(sol.toLowerCase("LOVELY")))
  }

  it should "return a result in a lower case from a string with digits" in {
    assert("lo2vel3y".equals(sol.toLowerCase("LO2VEL3Y")))
  }

  it should "return a result in a lower case from a string with special signs" in {
    assert("lo%$vel$*'y".equals(sol.toLowerCase("LO%$VEL$*'Y")))
  }
}
