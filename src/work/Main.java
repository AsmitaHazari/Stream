package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Create a list and filter
              List<Integer> List1 =  List.of(2,4,21,32,8,3);
           //   List1.add(45);
        List<Integer> List2 = new ArrayList<>();
        List2.add(12);
        List2.add(23);
        List2.add(14);
        List2.add(56);

        List<Integer> list3 = Arrays.asList(45,57,23,44,22);

        //list1
        //without Stream
        List<Integer> evenList = new ArrayList<>();
        for (Integer i:List1)
        {
            if (i%2 == 0){
                evenList.add(i);
            }
        }
        System.out.println(List1);
        System.out.println(evenList);

        //using stream
        Stream<Integer> stream = List1.stream();
       List<Integer> newList =  stream.filter(e-> e%2 == 0).collect(Collectors.toList());
       System.out.println(newList);

       //optimized
       List<Integer> newList1 =  List1.stream().filter(e-> e%2 ==0).collect(Collectors.toList());
       System.out.println(newList1);

       List<Integer> newList2 = List1.stream().filter(e -> e > 12).collect(Collectors.toList());
       System.out.println(newList2);
    }
}