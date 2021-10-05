/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Build an application that will step through some possible problems to restore Internet connectivity. 
 * Due: 9/12/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Muctarr Mansaray
*/


import java.util.Scanner;

public class WiFiDiagnosis {
	public static void main(String[] args) {
		String again;
		// Create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Fi Diagnosis might work.");
		// First step
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		again = keyboard.next();
		if (again.equals("yes"))
		{
			System.out.println("Rebooting your computer seemed to work");
		}
		else
		{
			if (again.equals("no"))
			{
				// Second step
				System.out.println("Second step: reboot your router");
				System.out.println("Now are you able to connect with the internet?");
				again = keyboard.next();
			}
			if (again.equals("yes"))
			{
				System.out.println("Rebooting your router seemed to work");
			}
			else
			{
				if (again.equals("no"))
				{
					// Third step
					System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
					System.out.println("Now are you able to connect with the internet?");
					again = keyboard.next();
				}
				if (again.equals("yes"))
				{
					System.out.println("checking the router's cables seemed to work");
				}
				else
				{
					if (again.equals("no"))
					{
						// Fourth step
						System.out.println("Fourth step: move your computer closer to your router");
						System.out.println("Now are you able to connect with the internet?");
						again = keyboard.next();
					}
					if (again.equals("yes"))
					{
						System.out.println("Moving your computer closer to your router seemed to work");
					}
					else
					{
						// Fifth step
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");
					}
				}
			}
		}
		keyboard.close();
		System.exit(0);
		}
	}


