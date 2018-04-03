package project;

import java.util.Scanner;

public class door {
		public static void isOpen() {
			int x=1;
			while (x==1){
			  boolean doorOpen= false;
			Scanner sc= new Scanner(System.in);
			System.out.println("what would you like to do with the door");
			String command = sc.nextLine().toLowerCase();
			
			
			
			if(command.matches("open")||command.matches("open door")|| command.matches("let me slide in")|| command.matches("Open the door for me")&& doorOpen==false){
				authenticate();
				 doorOpen=true;
				x=2;}
				
			
			else if(command.matches("close")||command.matches("close door ")|| command.matches("close the door")||command.matches("lock it up")||command.matches("lock the door up")&& doorOpen!=true){
				
				System.out.println("Door is already closed");
				x=1;
			}
		else if(command.matches("close")||command.matches("close door ")|| command.matches("close the door")||command.matches("lock it up")||command.matches("lock the door up")&& doorOpen==true){
			System.out.println("Door closing");
			x=2;}
			
				
			else{
				System.out.println("what would like to do with the door? Open or close?");
			}
			}
	}
			
		public static void authenticate(){
			Scanner sc= new Scanner(System.in);
			int x=1;
			while(x==1){
			System.out.println("Please enter the password for the door");
			String pw= sc.nextLine();
			if(pw.matches("ParangD")||pw.matches("KrishnaT")||pw.matches("Kambiz")||pw.matches("DavidC")){
				System.out.println("Door is open");
				
				x=2;
				
			}
			else{
				System.out.println("Password didn't match");
				boolean doorOpen=false;
			}
			}
		}
		public static void commandsecond(){
			System.out.println("what equipment do you want to control ");
			
			
		}
		
				
			
			}
			
				
					
				
				
			
			
			



		
	 
			
		
