package com.competitive.practice.leetcode.solutions.easy


class E709ToLowerCase {
  def toLowerCase(s: String): String = {
    s.map(c => if (65 <= c & c <= 90) (c + 32).asInstanceOf[Char] else c)
  }
}
