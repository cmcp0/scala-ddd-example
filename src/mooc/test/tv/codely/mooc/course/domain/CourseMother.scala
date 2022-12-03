package tv.codely.mooc.course.domain

import tv.codely.mooc.user.domain.UserIdMother

import tv.codely.shared.domain.SeqMother

object CourseMother {
  def apply(
     id: String = CourseIdMother.random.value.toString,
     title: String = CourseTitleMother.random.value.toString,
     description: String = CourseDescriptionMother.random.toString,
     author: String = UserIdMother.random.value.toString,
     category: String = CourseCategoryMother.random.toString
  ): Course = Course(
    id,
    title,
    description,
    author,
    category
  )

  def random: Course = apply()

  def randomSeq: Seq[Course] = SeqMother.randomOf(apply())
}
