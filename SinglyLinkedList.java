import java.lang.*;

public class SinglyLinkedList {
    private ListNode head;
    private  static  class ListNode {
        private int data ;
        private  ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null ;
        }
    }
    // count the of linked list
       public  int length(){
        if(head == null){
            return  0;
        }
        int count = 0;
        ListNode current = head ;
        while (current != null){
            count ++;
            current = current.next;

        }
        return  count;
       }
       // display linked list
       public  void display(){
        ListNode current = head ;
        while (current != null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
           System.out.println("null");
       }
       // insert a node in a  linked list
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
}
// insert a node at the end of singly linked list
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head ;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;

    }
   /* // insert a node given position
    public  void  insert(int position , int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node ;
        }else{
            ListNode previous = null;
            int count = 1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next =current;
        }
    }

    */
    // delete a node in a linked list
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next= null;
        return temp;
    }
    // delete last node in a linked list
   public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current= current.next;
        }
        previous.next=null;
        return current;


   }
   //delete node a given position
    public void delete(int  position){
        if(position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
    // seach an element linked list in java
    public boolean find(ListNode head, int searchKey){
        if(head == null){
         return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public ListNode reverseList(int n  ){
        if(head == null){
            return null;
        }
        ListNode mainPtr = head ;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            refPtr =refPtr.next;
            count ++;
        }
        while ( refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    // remove duplicate from sorted Link List

     public ListNode duplicateList() {
         if (head == null) {
             return null;
         }
         ListNode current = head;
         while (current != null && current.next != null) {
             if (current.data == current.next.data) {
                 current.next = current.next.next;
             } else {
                 current = current.next;
             }
         }

         return current;
     }
     public ListNode insertInSortedList( int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            return newNode;
        }
        ListNode current = head ;
        ListNode temp = null;
        while( current!= null && current.data< newNode.data){
            temp = current;
            current = current.next;

        }
         newNode.next = current;
         temp.next = newNode;
         return head;
     }
    public  ListNode deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key) {
            head = current.next;
            return  head;

        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null){
            return current;
        }
         temp.next = current.next;
        return current;
    }
    // detect loop in linked list
    public boolean containsloop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
  /*  public void createLoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }

   */
    public ListNode StartNodeInAlLoop (){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }
    public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while (temp != slowPtr){
            temp = temp.next;
            slowPtr= slowPtr.next;
        }
        return temp;//starting loop
    }
    public void createLoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }
    public void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while (temp .next!= slowPtr.next){
            temp = temp.next;
            slowPtr= slowPtr.next;
        }
        slowPtr.next = null;

    }
    public  ListNode merge(ListNode a , ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b!= null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if( a==null){
            tail.next =b;
        }else{
            tail.next = a;
        }
        return dummy.next;
    }
    // add two singly Linked list
    public ListNode addList( ListNode a , ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b!= null){
            int x= (a  != null) ?a.data:0;
            int y= (b  != null) ?b.data:0;
            int sum = carry+x+y;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            if(a!=null) a= a.next;
            if(b!=null) b= b.next;
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main( java.lang.String [] args) {
        SinglyLinkedList  sll = new SinglyLinkedList();
        sll.head =new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //sll.head.next = second;
        //second.next = third;
       // third.next = fourth;

       // sll.display();
        System.out.println("length is  -" + sll.length());
        sll.insertFirst(11);
        sll.insertFirst(1);
        sll.insertFirst( 1);
        sll.insertFirst(56);
        sll.display();





         sll.insertLast(11);
         sll.insertLast(8);
         sll.insertLast(1);
         sll.insertLast(8);
         sll.display();

      /*   sll.insert(1,50);
         sll.insert(2,45);
         sll.insert(3,25);
         sll.insert(4,8);

       */

        sll.display();
        System.out.println(sll.deleteFirst().data);
        System.out.println(sll.deleteFirst().data);
        sll.display();


       System.out.println(sll.deleteLast().data);
       sll.display();
       sll.delete(4);
       sll.delete(1);
       sll.display();

       sll.reverseList(1);
       ListNode nthNodeFromEnd = sll.reverseList(3);
       sll.display();

       sll.duplicateList();
       ListNode duplicate = sll.duplicateList();
       sll.display();

     //   System.out.println(sll.insertInSortedList(11));
        sll.display();
        sll.deleteNode(11);
        sll.display();
        //sll.createLoopInLinkedList();
       // System.out.println(sll.containsloop());

        sll.containsloop();
        System.out.println(sll.containsloop());
        sll.createLoopInLinkedList();

        sll.removeLoop();
        sll.display();
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);
       SinglyLinkedList sll2 = new SinglyLinkedList();
       sll2.insertLast(3);
       sll2.insertLast(5);
       sll2.insertLast(9);
       sll2.insertLast(14);
       sll2.insertLast(18);
       sll1.display();
       sll2.display();
       SinglyLinkedList result = new SinglyLinkedList();
       result.head=sll.merge(sll1.head , sll2.head);

       result.display();

       result.head=sll.addList(sll1.head , sll2.head);
       result.display();



    }
}