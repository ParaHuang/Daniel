package day3;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

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
//		Math.random()	//generate a number from 0~1
//		1.create an object of Random
		Random random = new Random();
		
		//. -> of
//		int a = random.nextInt();		//generate a big integer number
//		int a = random.nextInt(n);		//0~n-1
		int cmp = random.nextInt(1, 4);	//nextInt(n,m)  ->   n~m-1
		
		if(cmp==1) {
			System.out.println("computer chose rock");
		}else if(cmp==2) {
			System.out.println("computer chose paper");
		}else {
			System.out.println("computer chose scissors");
		}
		
		//judge who wins the game
		if(user==cmp) {
			System.out.println("it's a tie");
		}else if(user==1 && cmp==2 || 
				user==2 && cmp==3 ||  
				user==3 && cmp==1) {
			System.out.println("computer wins");
		}else {
			System.out.println("you wins");
		}
		
	}

}

















