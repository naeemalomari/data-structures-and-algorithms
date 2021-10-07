/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ChallengeFive;
import ChallengeFive.LinkedList.LinkedList;
import ChallengeFive.Queue.Queue;
import ChallengeFive.stack.Stack;

public class App {
  public static void main(String[] args) {
    LinkedList();
    stack();
  }
  public static void LinkedList(){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("E");
    linkedList.insert("N");
    linkedList.insert("G");
    linkedList.insert("N");
    linkedList.insert("A");
    linkedList.insert("I");
    linkedList.insert("M.");
    System.out.println(linkedList);
    System.out.println(linkedList.include("N"));
    System.out.println(linkedList.include("P"));

  }
  public static void stack(){
    Stack stack = new Stack();
    stack.push("N");
    stack.push("A");
    stack.push("E");
    stack.push("E");
    stack.push("M");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();

    stack.peek();
  }
  public static void queue(){
    Queue queue =new Queue();


    queue.enqueue("N");
    queue.enqueue("A");
    queue.enqueue("E");
    queue.enqueue("E");
    queue.enqueue("M");
    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    queue.enqueue("4");


  }
}
