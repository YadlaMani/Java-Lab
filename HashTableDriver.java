import java.util.*;
class HashTable{
    private int[] table;
    private int size;
     HashTable(int size){
        table=new int[size];
        this.size=size;
        for(int i=0;i<size;i++){
            table[i]=-1;
        }
    }
    private int hash(int key){
        return key%size;
    }
    public void insert(int key){
        int idx=hash(key);
        int c=0;
            while(table[idx]!=-1&&c<size){
                idx=(idx+1)%size;
                c++;
                
            }
            if(table[idx]==-1){
                table[idx]=key;
            }
            else

        System.out.println("Hash Table is full");
        
        

    }
    public boolean search(int key){
        int idx=hash(key);
        while(table[idx]!=-1){
            if(table[idx]==key){
                return true;
            }
            idx=(idx+1)%size;
        }
        return false;
    }
    public void display(){
        System.out.println("The hashtable is:");
        for(int i=0;i<size;i++){
            System.out.println(i+" "+table[i]);
        }
    }



}
public class HashTableDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the hashTable:");
        int n=sc.nextInt();
        HashTable Obj=new HashTable(n);
        System.out.println("1.Insert 2.Display 3.Search");
        while(true){
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to insert:");
                        Obj.insert(sc.nextInt());
                        break;
                case 2:Obj.display();break;
                case 3:System.out.println("Enter the element to search:");
                        if(Obj.search(sc.nextInt())){
                            System.out.println("Element is present in the table");
                        }
                        else{
                            System.out.println("Element is not present in the table");
                        }break;
                default:System.exit(0);
            }
            
        }

    }
}
