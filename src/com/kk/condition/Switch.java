package com.kk.condition;

public class Switch {

	static String food = "Roti";

	public void togetanswer() {

		switch (food) {

		case "Roti":
			System.out.println("You are wrong");
			break;
		case "chicken":
			System.out.println("you are very wrong");
			break;
		default:
			System.out.println("Roti is the right answer");
		}

	}

	public static void main(String[] args) {
		Switch result = new Switch();
		result.togetanswer();

	}

}
