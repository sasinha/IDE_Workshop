import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ssinha on 10/15/16.
 */
class LetterAssignment {
    public static void main(String[] args) {
        //Write a program that assigns letters to numbers (a=0,b=1, etc..)

        Scanner input = new Scanner(System.in);


        char[] alph = new char[26];
        int index = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            alph[index] = i;
            index++;
        }

        System.out.print("Enter a word: ");
        String word = input.next();
        char c = '\n';
        index = 0;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            index = Arrays.binarySearch(alph, c);
            System.out.print(index + " ");
        }

        System.out.println();
        System.out.println();


    }
}