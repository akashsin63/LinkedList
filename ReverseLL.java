class Node{
    int val;
    Node next;

    public Node(int val){
        this.val=val;
        next = null;
    }
}
class LinkedList{
   Node head;

   public void addNode(int val){
    Node newNode = new Node(val);
    if(head == null){
        head = newNode;
    }else{
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
   }

   //main logic
   public Node reverseLL(){
    Node prev = null;
    Node curr = head;
    //Node currPlus1 = curr.next;

    while(curr != null){
        Node currPl = curr.next;

        curr.next = prev;
        prev = curr;
        curr = currPl;
    }
    head = prev;
    return head;
   }

   public void display(){
    Node current = head;
      while(current != null){
        System.out.print(current.val + " ");
        current= current.next;
      }
      System.out.println();
   }
}

public class ReverseLL{
    public static void main(String[] args) {
       LinkedList myLList = new LinkedList();

       myLList.addNode(1);
       myLList.addNode(2);
       myLList.addNode(3);
       myLList.addNode(4);
       myLList.addNode(5);

       System.out.println("original list");
       myLList.display();

       Node myRevLinkedList =  myLList.reverseLL();

       System.out.println("reverse list");
       myLList.display();

    }
}