import java.util.*;
class GenLargest<T extends Number>{
    T a,b;
    GenLargest(T a,T b){
        this.a=a;
        this.b=b;
    }
    void compare(){
        double at=a.doubleValue();
        double bt=b.doubleValue();
        if(at>bt){
            System.out.println(a+"is the largest");
        }
        else if(at<bt){
            System.out.println(b+"is the largest");

        }
        else{
            System.out.println("Both are equal");
        }
        
        
    }
}
class BoundedTypeParam{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        GenLargest<Integer> obj=new GenLargest<Integer>(a,b);
        obj.compare();
    }
}