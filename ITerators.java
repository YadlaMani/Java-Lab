import java.util.*;
public class ITerators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Iterator<Integer> it=list.iterator();
        System.out.println("Printing the elements using iterator:");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        LinkedList<String>llist=new LinkedList<>();
        System.out.println("Enter the elements into the linked list:");
        for(int i=0;i<n;i++){
            llist.add(sc.next());
        }
        ListIterator<String>lit=llist.listIterator(llist.size());
        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");

        }
    }

}
