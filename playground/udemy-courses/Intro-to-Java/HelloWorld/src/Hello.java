public class Hello {

    public static void main(String[] args){
        System.out.println("Hello Mahtab");

        //datatype is int. = is an operator and 5 is the value. AKA declaration statement
        int myFirstNumber = (5 + 10) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        //int myLastOne = -883;

        //this is an expression > myFirstNumber + mySecondNumber + myThirdNumber
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        //prints out the value of myFirstNumber variable
        System.out.println("myFirstNumber value is: " + myFirstNumber);
        //prints out expression
        System.out.println("myTotal is: " + myTotal);

        // use - operator
        int myLastOne = 1000 - myTotal;
        System.out.println("myLastOne is: " + myLastOne);

    }
}
