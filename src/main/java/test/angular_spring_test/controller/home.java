package test.angular_spring_test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.angular_spring_test.dto.Person;
import test.angular_spring_test.service.PersonService;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)
public class home {
	@Autowired
	PersonService pService;
	
	@RequestMapping("home")
	@ResponseBody
	public List<Person> getAllPerson() {
		List<Person> person = pService.getAllPerson();
		return person;
	}
}
