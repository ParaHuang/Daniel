package day1;

import java.util.Scanner;
//every class in java.lang, you don't need to import
//#include<stdio.h>

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//alt+/   show code options
		//1.initialize Scanner object (to scan the input equipment of your system)
		Scanner scanner = new Scanner(System.in); 
		//2.enter data , save it in variable
		int num = scanner.nextInt();//allow you to enter an integer number
//		int num;
//		scanf("%d",&num);
//		System.out.println(num);
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}

}

