package wildcardTypes;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        printList(list);
    }

    public static void printList(List<?> list){
        //list.add(3); - Gera error. Não é possivel fazer adições em lista de tipos coringas.
        for (Object item : list){
            System.out.println(item);
        }
    }
}
