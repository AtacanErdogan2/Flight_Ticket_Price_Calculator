import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        double distance, normalPrice, salePrice;
        int age, type;

        // Retrieving data from the user
        System.out.print("Please enter the distance (in km) :");
        distance = input.nextDouble();
        System.out.print("Please enter your age :");
        age = input.nextInt();
        System.out.print("Please enter the flight type ( 1 -> One way 2 -> Round Trip ) :");
        type = input.nextInt();

        // Calculation Section
        normalPrice = (type == 1) ? (distance * 0.10) : (2 * 0.8 * (distance * 0.10));

        if (distance > 0 && age > 0 && (type == 1 || type == 2)) {
            if (age < 12) {
                salePrice = normalPrice * 0.50;
                System.out.println("Total Amount : " + salePrice + " TL");
            } else if (age < 24) {
                salePrice = normalPrice * 0.90;
                System.out.println("Total Amount : " + salePrice + " TL");
            } else if (age < 65) {
                salePrice = normalPrice;
                System.out.println("Total Amount : " + salePrice + " TL");
            } else {
                salePrice = normalPrice * 0.70;
                System.out.println("Total Amount : " + salePrice + " TL");
            }
        } else {
            System.out.println("You entered incorrect data !");
        }

    }
}