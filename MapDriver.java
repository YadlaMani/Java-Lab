import java.util.*;

public class MapDriver {
    public static void main(String[] args) {
        
        Map<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"Mani");
        hashMap.put(2,"Akash");
        hashMap.put(3,"Akhil");
        for(Map.Entry<Integer,String> Entry:hashMap.entrySet()){
            System.out.println(Entry.getKey()+" "+Entry.getValue());
        }
        Map<Integer,String>llMap=new LinkedHashMap<>();
        llMap.put(1,"Mani");
        llMap.put(2,"Sriram");
        llMap.put(3,"Vishal");
        for(Map.Entry<Integer,String>Entry:llMap.entrySet()){
            System.out.println(Entry.getKey()+" "+Entry.getValue());
        }
    }
}
