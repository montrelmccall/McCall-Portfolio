package polymorphism;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		int choice;
		while (true) {
			System.out.println("What kind of animal?\n" + "1. Mammal\n" + "2. Reptile");
			str = scanner.next();

			while (!checkResponse(str)) {
					str = scanner.next();
			}
			
			choice = Integer.parseInt(str);
			Animal animal = null;
			System.out.print("What kind of ");
			switch(choice){
			
			case 1:
				System.out.println("mammal would you like?\n" + "1. Human\n" + "2. Cat");
				str = scanner.next();
				while(!checkResponse(str)){
					str = scanner.next();
				}
				choice = Integer.parseInt(str);
				switch (choice){
				case 1:
					animal = new Human();
					break;
				case 2:
					animal = new Cat();
					break;
				}
				break;
			case 2:
				System.out.println("reptile would you like?\n" + "1. Snake\n" + "2. Crocodile");
				str = scanner.next();
				while(!checkResponse(str)){
					str = scanner.next();
				}
				choice = Integer.parseInt(str);
				switch (choice){
				case 1:
					animal = new Snake();
					break;
				case 2:
					animal = new Crocodile();
					break;
				}
				break;
			}
			
			System.out.print("This is how you animal communicates: ");
			animal.communicate();
			System.out.print("This is how your animal gets around: ");
			animal.move();
			System.out.print("This is how your animal eats: ");
			animal.eat();
			System.out.println();
		}

	}
	
	public static boolean checkResponse(String str){
		
		
		
		if(!isAnInt(str)){
			System.out.println("Invalid response\n");
			System.out.println("Select either \"1\" or \"2\".\n");
		}else if(Integer.parseInt(str) > 2 || Integer.parseInt(str) < 1){
			System.out.println("Invalid response\n");
			System.out.println("Select either \"1\" or \"2\".\n");
		}
		
		return isAnInt(str) && Integer.parseInt(str) <= 2 && Integer.parseInt(str) >= 1;
	}

	public static boolean isAnInt(String str) {

		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
