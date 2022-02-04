import java.util.*;

public class Collections {
    public static void main(String[] args) {

//QUESTION 1

        TreeMap<Long, String> map = new TreeMap<>();
        map.put(46953787L,"Rahul");
        map.put(47865440L, "Shashank");
        map.put(76543680L, "Pooja");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
