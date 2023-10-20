import java.util.Scanner;
public class Main {
    public static class coorditanes {
        double x;
        double y;

        public coorditanes(double x, double y) { // this method has constructor to get coordinates
            this.x = x;
            this.y = y;
        }
        double distance(coorditanes points) {
            return Math.sqrt(Math.pow(this.x - points.x, 2) + Math.pow(this.y - points.y, 2));
            // calculating distance between the 2 points that user has added.
        }
    }
    public static class Triangle { // class for triangles
        coorditanes[] vertices;

        Triangle(coorditanes[] vertices) { // this method has constructor for vertices of triangle
            this.vertices = vertices;
        }


    }

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