
/*
 * Implement the DequeueInterface. It functionality is described in the
 * comments
 *
 * You should demonstrate the use of this data structure 
 * in the main method below
 */ 

class Main {
  public static void main(String[] args) {
    
    //System.out.println("Hello world!");

    Dequeue dequeue = new Dequeue();

    //test values
    dequeue.addFront(1);
    dequeue.addFront(2);
    dequeue.addFront(3);
    dequeue.addFront(4);
    dequeue.addRear(4);
    dequeue.addRear(7);
    dequeue.addRear(1);
    dequeue.addRear("dca");
    dequeue.addRear("b");

    //calling methods
    System.out.println(dequeue.removeFront());
    System.out.println(dequeue.removeFront());
    System.out.println(dequeue.removeRear());
  }
}