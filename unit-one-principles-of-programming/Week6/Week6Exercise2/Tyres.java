public class Tyres extends BikePart {

    private String tyreModel;
    private double tyreDiameter;
    public static final String bikePartName = "Tyres";

    public Tyres(String tyreModel, double tyreDiameter, double bikePartCost, String comment) {
        super(bikePartName, bikePartCost, comment);

        this.tyreModel = tyreModel;
        this.tyreDiameter = tyreDiameter;
    }

    public String getBrand(){
        return tyreModel;
    }

    public double getDiameter(){
        return tyreDiameter;
    }
}
