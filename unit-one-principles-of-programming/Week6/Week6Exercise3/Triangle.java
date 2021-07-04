import java.lang.Math;
import java.util.ArrayList;
public class Triangle extends Shape {
    ArrayList<Integer> edges;
    private int border = 0;
    private int sideLength = 1;
    private double area = 0.0;
    private String triangle;
    public Triangle(ArrayList<Integer> edges){
        super(edges);
        this.edges = edges;
    }

    //overrides superclass triangle if not true
    @Override
    public String toString(){
        if (edges.size()!=3){
            triangle = "Not a triangle shape.";
            return triangle;
        } else {
            for (Integer edges : edges){
                border += edges;
            }
            for (Integer edge : edges){
                sideLength *= (border/2)-edge;
            }
            area = Math.sqrt(border/2*sideLength);
        }
        triangle = String.format("The triangle has %d sides, a border of %d, and a area of %.1f.", edges.size(), border, area);
        return triangle;
    }
}
