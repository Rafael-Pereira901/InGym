package com.lad_corp.ingym.payload;

import java.util.Objects;
import java.util.Set;

public class UserDTO {

	private long id;
	
	private String username;
	private String email;
	private Set<WorkoutDTO> workouts;
	
	public UserDTO(long id, String username, String email, Set<WorkoutDTO> workouts) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.workouts = workouts;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Set<WorkoutDTO> getWorkouts() {
		return workouts;
	}
	public void setWorkouts(Set<WorkoutDTO> workouts) {
		this.workouts = workouts;
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
		UserDTO other = (UserDTO) obj;
		return id == other.id;
	}
	
}
