package delimitedWilcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getPut {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> douList = Arrays.asList(3.2, 2.5);
        List<Object> objList = new ArrayList<>();

        copy(intList, objList);
        copy(douList, objList);
    }

    public static void copy(List<? extends Number> numbers, List<? super Number> destiny){
        for (Number item : numbers){
            destiny.add(item);
        }
    }
}
