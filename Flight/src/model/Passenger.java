package model;

public class Passenger {
	String name;
	int age;
	String username;
	String password;

	public Passenger() {

	}

	public Passenger(String name, int age, String username, String password) {

		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
