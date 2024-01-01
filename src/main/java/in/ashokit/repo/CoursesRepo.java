package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.dto.Courses;

public interface CoursesRepo extends JpaRepository<Courses, Integer> {

}
