package work;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // empty stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });
        //
        String name[] = {"Asmita", "Ashi", "Hazari", "man", "women"};
        Stream<Object> getStream = Stream.of(name);
        getStream.forEach(e-> {
            System.out.println(e);
        });
        // builder then calling build function
        Stream<Object> streamNew = Stream.builder().build();

        //
        Integer numbers[] = {2,4,5,6,7};
        Stream<Object> numStream = Stream.of(numbers);
        numStream.forEach(e-> {
            System.out.println(e);
        });
    }
}
