package org.example.DOB;
import java.util.*;
class Pair{
    int day;
    int month;
    int year;
    String dob;
    public Pair(String dob){
        this.dob=dob;
        String[] parts=dob.split(":");
        this.day=Integer.parseInt(parts[0]);
        this.month=Integer.parseInt(parts[1]);
        this.year=Integer.parseInt(parts[2]);
    }
}
public class DOB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<Pair>list=new ArrayList<>();
        list.add(new Pair(s));
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.year!=p2.year){
                    return Integer.compare(p1.year,p2.year);
                }
                else if(p1.month!=p2.month){
                    return Integer.compare(p1.month,p2.month);
                }
                else{
                    return Integer.compare(p1.day,p2.day);
                }
            }
        });

Collections.sort(list,(p1,p2)->{
    if(p1.year!=p2.year){
        return Integer.compare(p1.year,p2.year);
    }
    else if(p1.month!=p2.month){
        return Integer.compare(p1.month,p2.month);
    }
    else{
        return Integer.compare(p1.day,p2.day);
    }
});

Collections.sort(list,Comparator.comparingInt((Pair p)->p.year).reversed()
        .thenComparingInt(p->p.month)
        .thenComparingInt(p->p.day));
        
        for(Pair p:list){
            System.out.println(p.dob);
        }
    }
}
