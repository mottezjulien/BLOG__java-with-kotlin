package fr.jmottez.lessons;


import fr.jmotter.lessons.UserKotlin;

public class HelloWorldJava {

	public static void main(String[] args) {
		UserKotlin userKotlin = new UserKotlin();
		userKotlin.setFirstName("John");
		userKotlin.setLastName("Doe");
		System.out.println(userKotlin.getFirstName() + " " + userKotlin.getLastName());
	}

}
