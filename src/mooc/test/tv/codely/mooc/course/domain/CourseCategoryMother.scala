package tv.codely.mooc.course.domain

import tv.codely.shared.domain.IntMother
object CourseCategoryMother {
  private val categories = Seq("CourseC1", "CourseC2")

  def apply(value: String): CourseCategory = CourseCategory(value)

  def random: CourseCategory = CourseCategory(categories(IntMother.randomBetween(min = 0, max = categories.size - 1)))
}
