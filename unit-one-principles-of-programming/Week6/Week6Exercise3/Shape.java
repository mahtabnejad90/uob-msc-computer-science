import java.util.ArrayList;
public class Shape{
    ArrayList<Integer> edges;
    public Shape(ArrayList<Integer> edges){
        this.edges = edges;
    }
    public String toString(){
        String toReturn = "This Shape has the edges, ";
        for(Integer i : edges){
            toReturn += i + ", ";
        }
        return toReturn;
    }
}
