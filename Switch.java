package test;

import java.util.Scanner;

public class Switch {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("You are standing at a crossroads");
		System.out.println("Do you go left (1), right (2), or straight (3)?");
		int uIn = sc.nextInt();
		
		switch(uIn)
		{
			case 1:
			{
				System.out.println("You go left");
				break;
			}
			case 2:
			{
				System.out.println("You go right");
				break;
			}
			case 3:
			{
				System.out.println("You go stright");
				break;
			}
			default:
			{
				System.out.println("Uh oh");
				break;
			}
		}
	}
		
}


