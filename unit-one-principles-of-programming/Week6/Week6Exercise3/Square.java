import java.util.ArrayList;
public class Square extends Shape{
    ArrayList<Integer> edges;
    private int shapeSide;
    private int border;
    private int area;
    private String square;
    public Square(ArrayList<Integer> edges){
        super(edges);
        this.edges = edges;
    }
    @Override
    public String toString(){
        for (int i=0; i<edges.size(); i++){
            shapeSide = edges.get(0);
            if (edges.get(i) != shapeSide || edges.size()!= 4){
                square = "This shape is not a square.";
                return square;
            }
        }
        border = shapeSide*4;
        area = shapeSide*shapeSide;
        square = String.format("the square has %d sides, a distance all the way round of %d and a area of %d.", edges.size(), border, area);
        return square;
    }
}
