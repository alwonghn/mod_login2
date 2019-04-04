package demo.service;

import demo.bean.Login;
import demo.model.Student;
import demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	public Student validateUser(Login login) {
		return repository.findById(login.getUsername()).get();
	}
}
