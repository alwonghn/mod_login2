package demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

// @Table(name = "student")

@Entity
public class Student {
	@Id
	@Column(name="username")
	private String username;
	


	@Column(name="name")
	private String name;
	
	@Column(name="role")
	private String role;
	
	@Column(name="password")
	private String password;


	public Student() {
	}

	public Student(String name, String username, String role, String password) {
		this.username = username;
		this.name = name;		
		this.role = role;
		this.password = password;
	}

	public Student(String username, String name, String role) {
		this.username = username;
		this.name = name;
		this.role = role;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("Student [username=%s, name=%s,  role=%s, password=%s]", username, name, role, password);
	}
//	@Override
//	public String toString() {
//		return String.format("Student [name=%s, userName=%s, role=%s]", name, userName, role);
//	}
}
