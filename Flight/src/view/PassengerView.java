package view;

import java.util.Scanner;

import controller.PassengerController;
import model.Passenger;

class PassengerView {

	public static void main(String[] args) {

		PassengerController pc = new PassengerController();
		boolean setup = true;
		while (setup) {
			System.out.println(" Welcome to Flight Reservation \n 1.signup \n 2.Login \n 3.Exit");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter UserName");
				String username = sc.next();
				System.out.println("Enter Password");
				String password = sc.next();
				if (pc.userSignup(name, age, username, password))
					System.out.println("Successfully data added");
				else
					System.out.println("Successfully not added");
				break;
			}

			case 2: {
				System.out.println("Enter UserName");
				String username = sc.next();
				System.out.println("Enter Password");
				String password = sc.next();
				if (pc.userLogin(username, password)) {
					System.out.println("Successfully Login");
				}
					
				else
					System.out.println("Invalid Credentials");
				break;

			}
			case 3: {
				setup = false;
				break;

			}

			}

		}

	}
}
