import java.util.*;
class SortedChain<T extends Comparable>{

    class Node{
        T data;
        Node next;
        Node(T ele){
            this.data=ele;
        }
    
    }
    Node head;
    SortedChain(){
        head=null;
    }
    public void insert(T ele){
        Node temp=new Node(ele);
        if(head==null ||head.data.compareTo(ele)>0){
            temp.next=head;
            head=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=null&&curr.next.data.compareTo(ele)<0){
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
    }
    public void display(){
        System.out.println("The elements in the chain:");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
class SortedChainDriver{
    public static void main(String args[]){
        SortedChain<Integer>ch=new SortedChain<>();
        ch.insert(20);
        ch.insert(12);
        ch.insert(40);
        ch.insert(25);
        ch.display();
    }
}