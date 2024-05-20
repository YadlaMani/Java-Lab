import java.util.*;
public class TreeSetDriver {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(10);
        set.add(21);
        set.add(12);
        set.add(15);
        set.add(12);
        Iterator<Integer>it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
