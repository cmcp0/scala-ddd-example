package tv.codely.mooc.course.domain

import tv.codely.shared.domain.{IntMother, StringMother}

object CourseDescriptionMother {
  private val minimumChars = 1
  private val maximumChars = 50

  def apply(value: String): CourseDescription = CourseDescription(value)

  def random: CourseDescription = CourseDescription(
    StringMother.random(numChars = IntMother.randomBetween(minimumChars, maximumChars))
  )
}
