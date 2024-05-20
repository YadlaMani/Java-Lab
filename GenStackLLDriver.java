import java.util.*;
interface GenStackLL<T>{
    void push(T ele);
    void pop();
    void top();
    void display();
    boolean isEmpty();
    boolean isFull();
}
class GenStackLLC<T> implements GenStackLL<T>{
    LinkedList<T> st;
    GenStackLLC(){
        st=new LinkedList<>();
    }
    public void push(T ele){
        st.addLast(ele);
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Element popped form the stack is:"+st.pollLast());
        }
    }
    public void top(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("The top element is:"+st.peekLast());
        }
    }
    public boolean isEmpty(){
        return st.size()==0; 
    }
    public boolean isFull(){
        return false;
    }
    public void display(){
        System.out.println("The elements of the stack are:");
        Iterator<T>it=st.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }

}
public class GenStackLLDriver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenStackLLC<Integer>st=new GenStackLLC<>();
        System.out.println("1.Push 2.Pop 3.Display 4.Top 5.Exit");
        while (true) { 
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to push:");
                int ele=sc.nextInt();
                st.push(ele);break;
                case 2:st.pop();break;
                case 3:st.display();break;
                case 4:st.top();break;
                case 5:System.exit(0);break;
                default:System.exit(0);
            }
        }
    }
}
