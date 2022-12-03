package tv.codely.mooc.course.application.create

import tv.codely.mooc.shared.domain.user.UserId
import tv.codely.mooc.shared.infrastructure.marshaller.DomainEventsMarshaller.MessageMarshaller
import tv.codely.mooc.course.domain._
import tv.codely.shared.domain.bus.MessagePublisher

final class CourseCreator(
    repository: CourseRepository,
    publisher: MessagePublisher
) {

  def create(
      id: CourseId,
      title: CourseTitle,
      description: CourseDescription,
      author: UserId,
      category: CourseCategory
  ): Unit = {
    val course = Course(
      id,
      title,
      description,
      author,
      category
    )

    repository.save(course)
    publisher.publish(
      CourseCreated(
        course
      )
    ) (MessageMarshaller)
  }
}
