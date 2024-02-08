package day3;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		//generate a random number from 1-15,print different content based on the value
		//1->you got a diamond Ace
		//2->you got a diamond 2
		//3->you got a diamond 3
		//......
		//10->you got a diamond 10
		//11->you got a diamond J
		//12->you got a diamond Q
		//13->you got a diamond K
		//14->you got a Joker
		//15->you got a Joker
		Random random = new Random();
//		int poker = random.nextInt(1,14);
		int poker = 1;
		
		switch (poker) {
		case 1:
			System.out.println("you got a diamond Ace");
			//interrupt the switch case.without, 
			//when it gets into this case, 
			//it will keep going into other case , 
			//until it meets a break, or the end of program
			break;	
		case 11:
			System.out.println("you got a diamond J");
			break;
		case 12:
			System.out.println("you got a diamond Q");
			break;
		case 13:
			System.out.println("you got a diamond K");
			break;
		case 14:
		case 15:
			System.out.println("you got Joker");
			break;
			
		default:
			System.out.println("you got a diamond "+poker);
			break;
		}
		
		if(poker==1) {
			
		}else if(poker==11) {
			
		}else if(poker==12) {
			
		}else if(poker==13) {
			
		}else if(poker==14 || poker==15) {
			
		}else {//2~10
			
		}
		
	}

}











