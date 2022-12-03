package tv.codely.mooc.course.domain

import java.util.UUID

import tv.codely.shared.domain.UuidMother

object CourseIdMother {
  def apply(value: String): CourseId = CourseIdMother(UuidMother(value))

  def apply(value: UUID): CourseId = CourseId(value)

  def random: CourseId = CourseId(UuidMother.random)
}
