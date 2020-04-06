public class MyNode{
  private String data;
  public MyNode next;
  
  public MyNode() { //default constructor
    data = null;
    next = null;
  }
  
  public MyNode(String s){
    this();
    data = s;
  }
}
