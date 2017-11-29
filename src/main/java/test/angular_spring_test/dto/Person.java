package test.angular_spring_test.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class Person implements Serializable{
	private String firstName;
	private String lastName;
	private String mName;
	private int age;
	private Date dateAdded;
}