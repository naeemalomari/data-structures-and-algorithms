/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ChallengeFive;

import ChallengeFive.stucture.LinkedList;

public class App {
  public static void main(String[] args) throws Exception {
    LinkedList linkedList = new LinkedList();
    linkedList.append("N");
    linkedList.append("A");
    linkedList.append("f");

    linkedList.append("A");
    linkedList.append("N");
    System.out.println(linkedList.palindrome());
//    linkedList.append("N");
//    System.out.println(linkedList);
//    System.out.println(linkedList.include("N"));
//    System.out.println(linkedList.include("P"));
//    linkedList.insertBefore("A", "M");
//    linkedList.insertBefore("M", "E");
//    System.out.println(linkedList);
//    linkedList.insertAfter("N", "OOP");
//    System.out.println(linkedList);
//    System.out.println(linkedList.kth(-1));
    System.out.println(linkedList.kth(3));
//      LinkedList linkedList1 =new LinkedList();
//    linkedList1.append("E");
//      linkedList1.append("E");
//    System.out.println(linkedList);
//    System.out.println(linkedList1);

//    System.out.println("N E A E M");
//    System.out.println(linkedList.reversedLinkedList(linkedList));

  }
}
