import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of triangles:");
        int number_of_triangles = input.nextInt(); // number of triangles
        for (int i = 0; i < number_of_triangles; i++) { // this loop will ask the user for coordinates x and y for 3 sides.

            for (int j = 0; j < 3; j++) {
                System.out.println("Construction of a new point");
                System.out.print("Please enter x: ");
                double x = input.nextDouble();
                System.out.print("Please enter y: ");
                double y = input.nextDouble();
            }
        }

    }
}