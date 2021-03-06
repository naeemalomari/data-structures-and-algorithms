package ChallengeFive.stucture;

import ChallengeFive.data.LinkedListNode;

import java.io.IOException;
import java.util.ArrayList;


public class LinkedList {
  public LinkedListNode head;
  public LinkedListNode head1;
  private int size;
  private Exception IOException;

  public void insert(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);
    }
    size++;
  }

  public boolean include(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current != null) {
        if (current.getData() == data) {
          return true;
        }
        current = current.getNext();
      }
    }
    return false;
  }


  public void append(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);
    }
    size++;
  }


  public void insertBefore(String data, String before) {
    LinkedListNode node = new LinkedListNode(before);
    if (head == null) {
      System.out.println("this " + data + " Not Exist in the linked list ");
      return;
    } else if (data == head.getData()) {
      node.next = head;
      head = node;
      size++;
    } else {
      LinkedListNode temp = head;
      while (temp.next != null) {
        if (temp.next.getData() == data) {
          node.next = temp.next;
          temp.next = node;
          size++;
          return;
        }
        temp = temp.next;
      }
      System.out.println("this " + data + " Not Exist in the linked list ");
    }
  }

  public void insertAfter(String data, String after) {
    LinkedListNode node = new LinkedListNode(after);
    if (head == null) {
      System.out.println("this " + data + " Not Exist in the linked list ");
      return;
    } else {
      LinkedListNode temp = head;
      while (temp != null) {
        if (temp.getData() == data) {
          node.next = temp.next;
          temp.next = node;
          size++;
          return;
        }
        temp = temp.next;
      }
      System.out.println("this " + data + " Not Exist in the linked list ");
    }
  }

  public int getSize() {
    return size;
  }

  public String kth(int index) {
    LinkedListNode current = head;
    if (head == null) {
      System.out.println("The list is empty please insert node.");
    }
    if (index > getSize() - 1 || index < 0) {
      return "Exception";
    }
    int i = 0;
    while (i < (getSize() - index - 1)) {
      current = current.getNext();
      i++;
    }
    return current.getData();
  }


  public LinkedList zipLists(LinkedList list1, LinkedList list2){
    if(list1.head == null && list2.head == null){
      System.out.println("Both lists are empty");
      return null;
    }
    else if (list1.head == null) {
      return list2;
    } else if (list2.head == null) {
      return list1;
    } else {
      LinkedListNode current1 = list1.head;
      LinkedListNode current2 = list2.head;
      LinkedListNode ref1, ref2;
      while (current1.getNext() != null && current2 != null) {
      ref1=current1.getNext();
      ref2= current2.getNext();
      current1.setNext(current2);
      current2.setNext(ref1);
      current1=ref1;
//    (I can use one of them they are the same L:152)  current1=current1.getNext().getNext();
      current2=ref2;
      size++;
        if(current1.getNext() == null){
          current1.setNext(current2);
          break;
        }
      }
    }
return list1;
  }

  public LinkedList reversedLinkedList(LinkedList list){
    LinkedListNode current =list.head;
    LinkedListNode previous =null;
    LinkedListNode next =null;
    while(current != null){
      next=current.getNext();
      current.setNext(previous);
      previous= current;
      current=next;
    }
    list.head=previous;
    return list;
  }


public LinkedListNode reversedNode(LinkedListNode node){
    LinkedListNode prev =null;
    while(head !=null){
      LinkedListNode next = head.next;
      head.next=prev;
      prev=head;
      head=next;

    }
    return prev;
}



//
//  public boolean checkPalindrome(LinkedList list) {
//  int midIndex = (size-1)/2;
//  if(head==null){
//    System.out.println("the list is empty ");
//  }else{
//    LinkedListNode current=head;
//    while(current != null){
//      for(int i=0;i<= midIndex;i++){
//          current.getData();
//      }
//    }
//
//  }
//  }
  //I am loosing the ref


  public boolean palindrome() {
    if (this.head ==null){
      System.out.println("List is empty");
      return true ;
    }
    ArrayList<String> arr = new ArrayList<>();
    LinkedListNode current = this.head;
    while (current!=null){
      arr.add(current.getData());
      current = current.getNext();
    }
    for (int i = 0; i < arr.size()/2; i++) {
      if (!arr.get(i).equals(arr.get(arr.size()-i-1))){
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    String printing = "";
    if (head == null) {
      System.out.println("THE LIST IS EMPTY ");
    } else {
      LinkedListNode current = head;
      while (current != null) {
        printing = printing + " { " + current.getData() + " } " + " -> ";
        current = current.getNext();
      }
      printing = printing + " NULL ";
    }
    return printing;
  }

}

