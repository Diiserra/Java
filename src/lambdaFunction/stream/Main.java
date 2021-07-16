package lambdaFunction.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Criando uma lista de numeros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Criando uma stream a parti da lista de numeros
        Stream<Integer> stream1 = numbers.stream();

        //Exibindo os itens da stream
        System.out.println(Arrays.toString(stream1.toArray()));

        //Chamando o metodo map
        //stream1.map(item -> item * 2);

        //Criando uma stream a parti da classe Stream
        Stream<Integer> stream2 = Stream.iterate(2, x -> x + 3);
        System.out.println(Arrays.toString(stream2.limit(10).toArray()));

        //Usando reduce
        int sum = numbers.stream().reduce(0, (acum, next) -> acum + next);
        System.out.println(sum);

        //Usando filder
        List<Integer> pares = numbers.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        System.out.println(pares);






    }
}
