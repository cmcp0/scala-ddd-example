package tv.codely.mooc.course.domain

import tv.codely.shared.domain.{IntMother, StringMother}

object CourseTitleMother {
  private val minimumChars = 1
  private val maximumChars = 50

  def apply(value: String): CourseTitle = CourseTitle(value)

  def random: CourseTitle = CourseTitle(
    StringMother.random(numChars = IntMother.randomBetween(minimumChars, maximumChars))
  )
}
