package tv.codely.mooc.course.domain

object CourseCategory {
  def apply(value: String): CourseCategory = value match {
    case "CourseC1" => CourseC1
    case "CourseC2"  => CourseC2
    case _            => throw new RuntimeException(s"course category not recognized <$value>.")
  }
}

sealed trait CourseCategory

case object CourseC1 extends CourseCategory
case object CourseC2  extends CourseCategory
