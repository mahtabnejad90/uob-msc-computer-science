/*
 * Using the Database of Multimedia as inspiration...
 *
 * ... implement a Database of Bicycle Parts which can be combined
 * together so build a custom bike
 *
 * Demonstrate your code in the main method below
 */

class Main {
    public static void main(String[] args) {
        Bike b = new Bike();
        Frame f = new Frame("Aluminium", 7.5, 150.5, "Middle Range");
        Tyres t = new Tyres("Michelin", 6, 45.0, "Middle Range");
        b.addPart(f);
        b.addPart(t);
        b.printCost();
        b.showBikePriceInformation();
    }
}
