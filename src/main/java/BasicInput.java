import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();


        System.out.println("Enter double: ");
        userDouble = scnr.nextDouble();


        System.out.println("Enter character: ");
        userChar = scnr.next().charAt(0);

        scnr.nextLine();
        System.out.println("Enter string: ");
        userString = scnr.nextLine();



        int intCast = (int) userDouble;

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString + " " );
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt + " " );
        System.out.println( userDouble + " cast to an integer is " + intCast);




    }
}
