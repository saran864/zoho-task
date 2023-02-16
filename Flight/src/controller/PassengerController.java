package controller;

import java.util.ArrayList;

import model.Passenger;

public class PassengerController {
	static ArrayList<Passenger> userregister = new ArrayList<>();

	Passenger p = new Passenger();

	public boolean userSignup(String name, int age, String username, String password) {

		userregister.add(new Passenger(name, age, username, password));
		return true;

	}

	public boolean userLogin(String username, String password) {
		boolean check = false;
		for (Passenger pk : userregister) {
			if (pk.getUsername().equals(username) && pk.getPassword().equals(password)) {
				check = true;
			}

		}

		return check;

	}
}
