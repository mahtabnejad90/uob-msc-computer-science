
/*
 * A deque (double-ended queue) is like a queue, except that 
 * it allows access at both ends. 
 *
 */ 

public interface DequeueInterface{

  //adds item o to the front of the deque
  public void addFront(Object o);

  //adds item o to the rear of the deque
  public void addRear(Object o);

  // removes the item at the front and returns it
  public Object removeFront ();

  // removes the item at the rear and returns it
  public Object removeRear();

}