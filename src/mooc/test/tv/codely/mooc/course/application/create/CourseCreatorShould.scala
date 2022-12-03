package tv.codely.mooc.course.application.create

import tv.codely.mooc.shared.infrastructure.marshaller.DomainEventsMarshaller.MessageMarshaller
import tv.codely.mooc.course.domain.{CourseCreatedMother, CourseMother}
import tv.codely.mooc.course.infrastructure.repository.CourseRepositoryMock
import tv.codely.shared.infrastructure.rabbitmq.MessagePublisherMock
import tv.codely.shared.infrastructure.unit.UnitTestCase

final class CourseCreatorShould
  extends UnitTestCase
  with CourseRepositoryMock
  with MessagePublisherMock {

  private val courseCreator = new CourseCreator(
    repository,
    messagePublisher
  )

  "save a course" in {
    val course = CourseMother.random
    val courseCreated = CourseCreatedMother(course)

    repositoryShouldSave(course)

    publisherShouldPublish(courseCreated)(MessageMarshaller)

    courseCreator.create(
      course.id,
      course.title,
      course.description,
      course.author,
      course.category
    ).shouldBe(())
  }
}
