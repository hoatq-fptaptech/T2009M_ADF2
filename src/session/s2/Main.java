package session.s2;

import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.util.*;

public class Main {
    public static void main(String[] args){
        DemoGeneric<String,String> dg = new DemoGeneric<>();
        dg.sendMessage("hello");
        dg.sendMessage(123);
        dg.name = "hello";
        DemoGeneric<Integer,String> dg2 = new DemoGeneric<>();
        dg2.name = 12;
        ArrayList<String> strArr =  new ArrayList<>();

        ArrayList ar = new ArrayList();

        HashMap<String,String> shm = new HashMap<>();

        SubGeneric s = new SubGeneric();
        s.name = "le van nam";
        s.age = 19;
        SubGeneric2 s2 = new SubGeneric2();
        s2.name = 20;
        s2.age = 20;
        DemoGeneric.tinhTong(1,5);
        DemoGeneric.tinhTong(3.14,5.11);

        ArrayList<Integer> arT = new ArrayList<>();
        ArrayList<Double> arD = new ArrayList<>();

        ArrayList<? super Number> arrNumber =  new ArrayList<>();
        arrNumber.add(1);
        arrNumber.add(1.6);
        arrNumber.add(1.2222222);
        ArrayList<? super Collection> arr = new ArrayList<>();
        arr.add(new ArrayList());
        arr.add(new HashSet());
        arr.add(new PriorityQueue());

    }
}
