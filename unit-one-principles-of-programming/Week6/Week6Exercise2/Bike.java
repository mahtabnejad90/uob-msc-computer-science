import java.util.ArrayList;

public class Bike {

    private ArrayList<BikePart> bikeParts;
    private static final double initial_price = 100;
    private double overall_price;

    public Bike(){
        bikeParts = new ArrayList<BikePart>();
        overall_price = initial_price;
    }

    public void addPart(BikePart bikePart){
        bikeParts.add(bikePart);
        overall_price += bikePart.getBikePartPrice();
    }

    public void showBikePriceInformation(){
        for(BikePart p : bikeParts){
            System.out.println(p.getBikePartName() + " " +"Price: " + p.getBikePartPrice());
            System.out.println();
        }
    }

    public void printCost(){
        System.out.println("The total price of this bike is: " + overall_price);
    }
}
