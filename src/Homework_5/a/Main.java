package Homework_5.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        List<Integer> integersList = new ArrayList<>();

        integersList.add(200);
        integersList.add(300);
        integersList.add(400);
        integersList.add(500);
        integersList.add(600);

        List<String> stringsList = new ArrayList<>();

        stringsList.add("orasi");
        stringsList.add("samasi");
        stringsList.add("otxasi");
        stringsList.add("xutasi");
        stringsList.add("eqvsasi");

        Map<Integer,String> integerStringMap = new HashMap<>();

        for (int i=0;i<integersList.size();i++){
            integerStringMap.put(integersList.get(i),stringsList.get(i));
        }

    }
}
