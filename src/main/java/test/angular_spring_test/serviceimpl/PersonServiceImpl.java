package test.angular_spring_test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.angular_spring_test.dto.Person;
import test.angular_spring_test.mapper.PersonMapper;
import test.angular_spring_test.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper pMapper;
	
	public List<Person> getAllPerson() {
		List<Person> person = pMapper.getAllPerson();
		return person;
	}

}
