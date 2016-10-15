import java.util.Scanner;

/**
 * Created by ssinha on 10/15/16.
 */
class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Make a program that prints the next 20 leap years
        System.out.print("What year is it: ");
        int year = input.nextInt();

        if (year % 4 != 0) {
            while (year % 4 != 0) {
                year++;
            }
        }

        for (int i = 1; i <= 20; i++) {
            System.out.print((year += 4) + " ");
        }
        System.out.println();

    }
}
