package day4;

public class Main2 {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		

//		System.out.println(whatever is big between a and b);
		
		System.out.println(a>b?a:b);
		
		//print "even" is a is even, otherwise print "odd"
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		System.out.println(a%2==0?"even":"odd");
	}
}












