package demo.controller;

import demo.bean.Login;
import demo.model.Student;
import demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@Autowired
	private StudentService studentService;

	@GetMapping({ "/", "/login" })
	public String login(Model model) {
		model.addAttribute("login", new Login());
		model.addAttribute("message", "Please Enter Your Login Details");
		return "login";
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") Login login, BindingResult bindingResult, ModelMap model) {
		Student user = studentService.validateUser(login);
		if (null != user && user.getUsername().equals(login.getUsername())) {
			if (user.getRole().toUpperCase().equals("MANAGER")) {
				model.addAttribute("username", user.getUsername());
				return "welcome";
			} else {
				model.addAttribute("message", "Only admin users are allowed!!");
				return "login";
			}
		} else {
			model.addAttribute("message", "Invalid Userid or Password!!");
			return "login";
		}
	}
}
