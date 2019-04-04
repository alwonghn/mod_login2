package demo.repository;

import demo.model.Student;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
	Optional<Student> findById(String username);
}
