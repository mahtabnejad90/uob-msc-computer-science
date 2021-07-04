public class Frame extends BikePart {

    private String frameMaterial;
    private double frameWeight;
    public static final String bikePartName = "Frame";

    public Frame(String frameMaterial, double frameWeight, double bikePartCost, String comment) {
        super(bikePartName, bikePartCost, comment);

        this.frameMaterial = frameMaterial;
        this.frameWeight = frameWeight;
    }

    public String getFrameMaterial(){
        return frameMaterial;
    }

    public double getFrameWeight(){
        return frameWeight;
    }
}
