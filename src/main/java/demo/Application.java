package demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import javax.annotation.Resource;

/*method #3: CONSUME REPO DIRECTLY IN APP CLASS*/
import demo.model.Student;
//import demo.repository.StudentRepository;

/*method #2: CONSUME REPO THROUGH SERVICE CLASS*/
import demo.service.IStudentService;

@SpringBootApplication

//public class Application { /*method #3: CONSUME REPO DIRECTLY IN APP CLASS*/

/*method #2: CONSUME REPO THROUGH SERVICE CLASS*/
public class Application implements CommandLineRunner{

	// SLF4J's logging instance for this class
	// We could have used LoggerFactory.getLogger(Application.class) as well
	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	/*method #3: CONSUME REPO DIRECTLY IN APP CLASS*/
	//@Autowired
	//private StudentRepository repository;

	@Autowired
	IStudentService studentService;

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
	}

	/*method #3: CONSUME REPO DIRECTLY IN APP CLASS*/
	/*
	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Student("Jack Bauer", "E3333333"));
			repository.save(new Student("Chloe O'Brian", "E4444444"));
			repository.save(new Student("Kim Bauer", "E55555555"));
			repository.save(new Student("David Palmer", "E6666666"));
			repository.save(new Student("Michelle Dessler", "E7777777"));

			// fetch all customers
			log.info("Students found with findAll():");
			log.info("-------------------------------");
			for (Student student : repository.findAll()) {
				log.info(student.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			//repository.findById(1L)
				//.ifPresent(student -> {
					//log.info("Student found with findById(1L):");
					//log.info("--------------------------------");
					//log.info(student.toString());
					//log.info("");
				//});

			// fetch customers by last name
			log.info("Student found with findByName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByName("Bauer").forEach(name -> {
				log.info(name.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}
	*/
	

	/*method #2: CONSUME REPO THROUGH SERVICE CLASS*/
	//@Resource
	//private StudentService studentService;

	//@Bean
	//public StudentService studentService(){
		//return  new StudentService();
	//}

	@Override
	public void run(String... args) throws Exception {
		//getHelloService().hello();
		//List<Student> retList = (List<Student>)studentService.findAll();
			// fetch all customers
			log.info("Students found with findAll():");
			log.info("-------------------------------");
			for (Student student : studentService.findAll()) {
				log.info(student.toString());
			}
			log.info("");

	}

}
