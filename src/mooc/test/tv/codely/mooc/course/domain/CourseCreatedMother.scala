package tv.codely.mooc.course.domain

import tv.codely.mooc.shared.domain.user.UserId
import tv.codely.mooc.user.domain.UserIdMother

object CourseCreatedMother {
  def apply(
     id: CourseId = CourseIdMother.random,
     title: CourseTitle = CourseTitleMother.random,
     description: CourseDescription = CourseDescriptionMother.random,
     author: UserId = UserIdMother.random,
     category: CourseCategory = CourseCategoryMother.random
  ): CourseCreated = CourseCreated(id, title, description, author, category)

  def apply(course: Course): CourseCreated = apply(course.id, course.title, course.description, course.author, course.category)

  def random: CourseCreated = apply()
}
