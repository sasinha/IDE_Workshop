import java.util.Scanner;

class PrintNumber {
    public static void main(String[] args) {
        //Print numbers ?a? to ?b? (inclusive) where values are asked for by user.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers a and b where a < b");
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

