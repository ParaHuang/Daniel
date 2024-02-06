package day2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enter an integer number, take it as year
		//print if this year is leap year or not
		
		//leap year:
		//1000 no     2000yes
		//1. it's divisible by 4, but not divisible by 100		A
		//           A1                     A2
		//2. it's divisible by 400								B
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter year:");
		int year = scanner.nextInt();
		//1+2*3
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year");
		}
		
	}

}

