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
        public double perimeter() {
            double first_side = vertices[0].distance(vertices[1]);
            double second_side = vertices[1].distance(vertices[2]);
            double third_side = vertices[2].distance(vertices[0]);
            return first_side + second_side + third_side; // parameter of triangle
        }
        boolean verify_isosceles(){
            double first_side = vertices[0].distance(vertices[1]);
            double second_side = vertices[1].distance(vertices[2]);
            double third_side = vertices[2].distance(vertices[0]);
            return first_side == second_side || first_side == third_side || second_side == third_side;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of triangles:");
        int number_of_triangles = input.nextInt(); // number of triangles
        Triangle[] t = new Triangle[number_of_triangles];
        for (int i = 0; i < number_of_triangles; i++) { // this loop will ask the user for coordinates x and y for 3 sides.
            coorditanes[] vertices = new coorditanes[3];
            for (int j = 0; j < 3; j++) {
                System.out.println("Construction of a new point");
                System.out.print("Please enter x: ");
                double x = input.nextDouble();
                System.out.print("Please enter y: ");
                double y = input.nextDouble();
                vertices[j] = new coorditanes(x, y);
            }
            t[i] = new Triangle(vertices);
        }

    }
}