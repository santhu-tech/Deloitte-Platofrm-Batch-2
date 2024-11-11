import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);  //object creation for your scanner class

        System.out.println("Enter an integer number");
        int value=sc.nextInt();  // Take an input as integer

        System.out.println("Enter your name");
        sc.nextLine();
        String va=sc.nextLine();

        //float
        //nextFlaot()

        sc.close();
    }

}
