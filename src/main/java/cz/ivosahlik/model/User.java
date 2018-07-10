package cz.ivosahlik.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Intellij Idea
 * Created by ivosahlik on 03/07/2018
 */
@XmlRootElement(name = "user")
public class User {

	private Long id;
	
	private String name;
	
	private String surname;
	
	public User() {
		
	}

	public User(Long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
