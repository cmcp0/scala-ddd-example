package tv.codely.mooc.course.infrastructure.repository

import org.scalamock.scalatest.MockFactory
import tv.codely.mooc.course.domain.{Course, CourseRepository}
import scala.concurrent.Future

import tv.codely.shared.infrastructure.unit.UnitTestCase

protected [course] trait CourseRepositoryMock extends MockFactory {
  this: UnitTestCase =>

  protected val repository: CourseRepository = mock[CourseRepository]

  protected def repositoryShouldSave(course: Course): Unit =
    (repository.save _)
      .expects(course)
      .returning(Future.unit)

  protected def repositoryShouldFind(courses: Seq[Course]): Unit =
    (repository.all _)
      .expects()
      .returning(Future.successful(courses))
}
