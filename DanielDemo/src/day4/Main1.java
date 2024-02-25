package day4;

public class Main1 {

	public static void main(String[] args) {
		//5/3 = 1  89/10=8
		int score = 95;
		//0~60,      not pass				default
		//60~69,	pass   60,61,63,67,69   6X
		//70~79,	ok     70,74,78,79		7X
		//80~89,	good   80,81,82,87,89 	8X
		//90~100,	great  90,93,98,98,100  9X    10X	
		//others, invalid score
		
		switch(score/10) {
			case 9,10:
				System.out.println("great");
				break;
			case 6:
				System.out.println("pass");
				break;
			case 8:
				System.out.println("good");
				break;
			case 7:
				System.out.println("ok");
				break;
			case 0,1,2,3,4,5:
				System.out.println("not pass");
				break;
			default:
				System.out.println("invalid score");
				break;
				
		}
		
		
		
	}

}

