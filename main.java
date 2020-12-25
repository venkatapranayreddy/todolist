package com.company;
import java.util.Scanner;
public class main {

	private static Scanner scanner = new Scanner(System.in);
	private static todo mytodolist = new todo();
	public static void main(String[] args) {
		
		int command =0;
		
		boolean exit =false;
		
     
		printcommand();
	
	while(!exit) {
		System.out.println("Enter the Command/Choice:");
		command = scanner.nextInt();
		scanner.nextLine();
		
		switch(command) {
		
		
		case 0:
			printcommand();
			break;
			
		case 1:
			 mytodolist.printtodolist();
			 break;
			 
			 
		case 2:
			additem();
			
			break;
			
		case 3:
			updateitem();
			break;
			
		case 4:
			removeitem();
			break;
			
		case 5:
			searchitem();
			break;
			
		case 6:
			exit = true;
			break;
			
		default:
		     System.out.println("please enter the command only from given list");

		}
		
		}
	}
	
	public static void printcommand() {
		System.out.println("\n commands:"
				+  "\n Press 0: To Print Instrutions"
				+  "\n Press 1: To Print Complete TodoList"
				+  "\n Press 2: To add the list into your todo"
				+  "\n Press 3: To modify the list into your todo"
				+  "\n Press 4: To Remove the item from your todolist "
				+  "\n Press 5: To Search an Item from your todolist"
				+  "\n Press 6: To Exit app");
		
	}
	
	
	public static void additem() {
		System.out.println("Enter the item that you wanted to add in the todo list:");
		mytodolist.additem(scanner.nextLine());
		
	}

	public static void updateitem() {
		System.out.println("Enter the item number");
		int index = scanner.nextInt();
		mytodolist.additem(scanner.nextLine());
		System.out.println("Enter the item that you wanna add");
		String newitem = scanner.nextLine();
		mytodolist.updatetodolist(index -1, newitem);
		
	}

	public static void removeitem() {
		System.out.println("Enter the item number that you wanted to remove");
		int index = scanner.nextInt();
		scanner.nextLine();
		mytodolist.removeitem(index);
	}
	
	public static void searchitem() {
		System.out.println("Enter the item that you want to search");
		String searchitem = scanner.nextLine();
		
		if(mytodolist.finditem(searchitem)==null) {
			System.out.println("item not find in your todolist");
		}
		else {
			System.out.println(searchitem + "found in your todolist");
		}
		
	}

}
	
