package com.lad_corp.ingym.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String username;
	private String email;
	private String password;
	
	private UtilInfo utilInfo;
	
	private Set<Workout> workouts= new HashSet<>();
	
	public User() {}

	public User(String id, String username, String email, String password, UtilInfo utilInfo) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.utilInfo = utilInfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UtilInfo getUtilInfo() {
		return utilInfo;
	}

	public void setUtilInfo(UtilInfo utilInfo) {
		this.utilInfo = utilInfo;
	}

	public Set<Workout> getWorkouts() {
		return workouts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
}
