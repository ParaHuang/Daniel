package day2;

public class Main2 {

	public static void main(String[] args) {
		int score = 95;
		//<60,      not pass
		//60~69,	pass
		//70~79,	ok
		//80~89,	good
		//>=90,		great
		
//		not conside invalid score
		/*
		if(score<60) {
			System.out.println("not pass");
		}else if(score<=69) {
			System.out.println("pass");
		}else if(score<=79) {
			System.out.println("ok");
		}else if(score<=89) {
			System.out.println("good");
		}else {
			System.out.println("great");
		}
		*/
		
		//<0, >100 ->invalid score
		if(score>=0 && score<=100) {
			
			if(score<60) {
				System.out.println("not pass");
			}else if(score<=69) {
				System.out.println("pass");
			}else if(score<=79) {
				System.out.println("ok");
			}else if(score<=89) {
				System.out.println("good");
			}else {
				System.out.println("great");
			}
			
		}else {
			System.out.println("invalid score");
		}
		
		
		
	}

}














