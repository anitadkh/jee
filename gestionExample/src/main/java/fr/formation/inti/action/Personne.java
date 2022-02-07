package fr.formation.inti.action;

import java.util.Date;

public class Personne {
	
	private String firstName;
	private String lastName;
	private String title;
	private Integer age;
	private Date date;
	private String gender;
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Personne [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", age=" + age
				+ ", date=" + date + ", gender=" + gender + ", email=" + email + "]";
	}

	
	
	
	
	
	
	

}
