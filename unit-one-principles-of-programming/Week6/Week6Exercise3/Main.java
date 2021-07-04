import java.util.ArrayList;
/*
 * Implement different shapes by extending the Shape class.  For example,
 * implement a Triangle, Square and Circle.
 *
 * For each implementation, override the toString method to provide
 * a more specific description of the Shape.  For example, if you
 * implement a Circle you might return the String
 *
 * This Circle has a radius of 5 and a circumference of 31.42
 */
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> edges = new ArrayList<>();
        edges.add(3);
        edges.add(4);
        edges.add(5);
        Triangle t = new Triangle(edges);
        System.out.println(t.toString());
        edges.clear();
        edges.add(4);
        edges.add(4);
        edges.add(4);
        edges.add(4);
        Square s = new Square(edges);
        System.out.println(s.toString());
    }
}
