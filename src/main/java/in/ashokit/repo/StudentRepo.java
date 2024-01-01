package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
