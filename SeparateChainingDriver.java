import java.util.*;
class SeparateChaining{
    private int size;
    private LinkedList<Integer>[] table;
    SeparateChaining(int size){
        table=new LinkedList[size];
        for(int i=0;i<size;i++){
            table[i]=new LinkedList<>();

        }
        
        this.size=size;
    }
    void insert(int key){
        int idx=hashing(key);
        table[idx].add(key);

    }
    int hashing(int key){
        return key%size;
    }
    void search(int key){
        int idx=hashing(key);

         if(table[idx].contains(key)){
            System.out.println("Element is in the array");
            return;
         }

         System.out.println("Element is not present in the array");
    }
    void delete(int key){
        int idx=hashing(key);
        table[idx].remove(Integer.valueOf(key));
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.println("index "+i);
            System.out.println("Elements:");
            for(int num:table[i]){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

}
public class SeparateChainingDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.insert 2.delete 3.display 4.search");
        SeparateChaining sp=new SeparateChaining(5);
        while(true){
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to insert:");
                        sp.insert(sc.nextInt());break;
                case 2: System.out.println("Enter the element to delete:");
                        sp.delete(sc.nextInt());break;
                case 3: System.out.println("Enter the element to search:");
                        sp.search(sc.nextInt());break;
                case 4: sp.display();break;
                default: System.exit(0);
            }
            

        }
    }
}
