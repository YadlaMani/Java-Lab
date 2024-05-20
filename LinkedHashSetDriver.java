import java.util.*;
public class LinkedHashSetDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Mani");
        set.add("Mani");
        set.add("Naidu");
        set.add("Naidu");
        set.add("Sriram");
        Iterator<String>it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
