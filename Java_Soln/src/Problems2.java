import java.util.Scanner;
import java.util.Arrays;



class Problems2{
    public static void main(String[] args){
    	//Print numbers ?a? to ?b? (inclusive) where values are asked for by user.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 numbers a and b where a < b");
		System.out.print("a: ");
		int a = input.nextInt();
		System.out.print("b: ");
		int b = input.nextInt();

		for(int i = a; i<=b; i++){
			System.out.print(i + " ");
		}
        System.out.println();
        System.out.println();
		System.out.println();

		//Write a program that assigns letters to numbers (a=0,b=1, etc..)

		char[] alph = new char[26];
		int index = 0;

		for(char i = 'a'; i<='z'; i++){
			alph[index] = i;
			index++;
		}

		System.out.print("Enter a word: ");
		String word = input.next();
		char c = '\n';
		index = 0;
		for(int i = 0; i<word.length(); i++){
			c = word.charAt(i);
			index = Arrays.binarySearch(alph,c);
			System.out.print(index + " ");
		}

		System.out.println();
		System.out.println();

		//Make a program that prints the next 20 leap years
		System.out.print("What year is it: ");
		int year = input.nextInt();

		if(year % 4 != 0){
			while(year % 4 != 0){
				year++;
			}
		}

		for(int i = 1; i<=20; i++){
			System.out.print((year+=4) + " ");
		}
		System.out.println();

    }
}