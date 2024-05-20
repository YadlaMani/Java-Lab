import java.util.*;

class Person{
    private String name;
    private int age;
    private final double income;
    Person(String name,int age,double income){
        this.name=name;
        this.age=age;
        this.income=income;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getIncome(){
        return this.income;
    }
    @Override
    public String toString(){
        return this.name+" "+this.age+" "+this.income;
    }
}
public class Main {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
        set.add(new Person("Mani",18,20000));
        set.add(new Person("Sriram",61,10000));
        set.add(new Person("Akash",25,150000));
        Set<Person>setB=new HashSet<>();
        Set<Person>setC=new HashSet<>();
        for(Person p:set){
            if(p.getAge()>60){
                setB.add(p);
            }
        }
        for(Person p:set){
            if(p.getIncome()<100000){
                setC.add(p);
            }

        }
        Set<Person>intersection=new HashSet<>(setB);
        intersection.retainAll(setC);
        for(Person p:setB){
            System.out.println(p.toString());
        }
        for(Person p:setC){
            System.out.println(p.toString());
        }
        for(Person p:intersection){
            System.out.println(p.toString());
        }


        

    }
}
