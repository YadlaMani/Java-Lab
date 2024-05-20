import java.util.*;
public class HashSetDriver {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
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
