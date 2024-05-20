import java.util.*;
interface GenStack<T>{
    void push(T ele);
    void pop();
    void display();
    void  top();
    boolean isEmpty();
    boolean isFull();
}
class GenStackArray<T>implements GenStack<T>{
    T a[];
    int top=-1;
    GenStackArray(int n){
        this.a=(T[])new Object[n];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==a.length-1;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The elements in the stack are:");
            for(int i=0;i<=top;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
    public void push(T ele){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        else{
            a[++top]=ele;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            --top;
        }
    }
    public void top(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("The top element is:"+a[top]);
        }
    }
    
}
public class GenStackDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenStackArray<Integer>st=new GenStackArray<>(100);
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
