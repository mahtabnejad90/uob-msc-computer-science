import java.util.ArrayList;

public class Dequeue implements DequeueInterface {

private ArrayList<Object> dList;

Dequeue() {
    dList = new ArrayList<Object>();
  }
  
  public void addFront(Object o) {
    dList.add(0, o);
  }
  public void addRear(Object o) {
    dList.add(o);
  }
  public Object removeFront() {
    return dList.remove(0);
  }
  public Object removeRear() {
    return dList.remove(dList.size()-1);
  }

  // Convert to string
  public String toString() {
    String x = "";
    for (Object o : dList) {
        x = x + o.toString();
    }
    return x;
  }
}