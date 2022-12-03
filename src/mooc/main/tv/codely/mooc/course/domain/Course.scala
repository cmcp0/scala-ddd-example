package tv.codely.mooc.course.domain

import tv.codely.mooc.shared.domain.user.UserId

object Course {
  def apply(
     id: String,
     title: String,
     description: String,
     author: String,
     category: String
  ): Course = Course(
    CourseId(id),
    CourseTitle(title),
    CourseDescription(description),
    UserId(author),
    CourseCategory(category)
  )
}

case class Course(
    id: CourseId,
    title: CourseTitle,
    description: CourseDescription,
    author: UserId,
    category: CourseCategory
)
