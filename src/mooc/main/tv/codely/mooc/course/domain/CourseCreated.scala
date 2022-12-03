package tv.codely.mooc.course.domain

import tv.codely.mooc.shared.domain.user.UserId
import tv.codely.shared.domain.bus.Message

object CourseCreated {
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


  def apply(course: Course): CourseCreated = apply(course.id, course.title, course.description, course.author, course.category)
}

final case class CourseCreated(
    id: CourseId,
    title: CourseTitle,
    description: CourseDescription,
    author: UserId,
    category: CourseCategory
 ) extends Message {
  override val subType: String = "course_created"
}
