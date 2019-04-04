package demo.service;

import org.springframework.stereotype.Service;
import demo.bean.Login;
import demo.model.Student;

@Service
public interface StudentService {
	Student validateUser(Login login);
}
