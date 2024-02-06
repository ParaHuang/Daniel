package day2;

import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//user vs computer:
		//rock paper scissors
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please choose:1-rock 2-paper 3-scissors");
		int user = scanner.nextInt();
		if(user==1) {
			System.out.println("you chose rock");
		}else if(user==2) {
			System.out.println("you chose paper");
		}else if(user==3) {
			System.out.println("you chose scissors");
		}else {
			System.out.println("invalid input");
			//end program
			return;		
			//keep input until it's in the correct range : loop
		}
		
		//random number
		//alt+/
		
	}

}

