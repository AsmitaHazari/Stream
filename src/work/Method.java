package work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Method {
    public static void main(String[] args) {
        List<String> cities =  List.of("Vapi", "Mumbai", "Pune", "Delhi");
        List<String> newCities = cities.stream().filter(e-> e.startsWith("P")).collect(Collectors.toList());
        System.out.println(newCities);

        List<Integer> num = List.of(2,3,4,5,6,7,8);
        List<Integer> squaredNumber = num.stream().map(e-> e*e).collect(Collectors.toList());
        System.out.println(squaredNumber);

        List<Integer> addednum = num.stream().map(e-> e+3).collect(Collectors.toList());
        System.out.println(addednum);
        //forEach

        cities.stream().forEach(System.out::println);

        num.stream().sorted().forEach(System.out::println);

        //min and max

        Integer integer = num.stream().max((x,y) -> x.compareTo(y) ).get();
        System.out.println("max"+ integer);
    }
}
