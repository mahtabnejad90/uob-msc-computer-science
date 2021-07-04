public class BikePart {
    private String bikePartName;
    private double bikePartCost;
    private String comment;

    public BikePart(String bikePartName, double bikePartCost, String comment) {
        this.bikePartName = bikePartName;
        this.bikePartCost = bikePartCost;
        this.comment = comment;
    }

    public String getBikePartName() {
        return bikePartName;
    }

    public double getBikePartPrice() {
        return bikePartCost;
    }

    public String getComment() {
        return comment;
    }
}
