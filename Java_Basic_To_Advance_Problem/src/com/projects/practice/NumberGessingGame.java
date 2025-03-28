package com.projects.practice;

import java.util.Random;
import java.util.Scanner;

public class NumberGessingGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an int from 1 to 10: ");
		int innum = keyboard.nextInt();
		int randNum = new Random().nextInt(10)+1;
		
		if (innum == randNum) {
			System.out.println("***************");
			System.out.println("****You Won****");
			System.out.println("***************");
		}else {
			System.out.println("You lose. ");
			System.out.println("The random number was ");
			System.out.println(randNum+".");
			
		}
		System.out.println("Thank You For Playing");
		keyboard.close();

	}

}
