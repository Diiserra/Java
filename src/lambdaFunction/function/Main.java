package lambdaFunction.function;

import lambdaFunction.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Tablet", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Iphone", 2000.00));


        /*A interface Function recebe dois tipos na declaração e possui o metodo apply que vai semprer retornar o segundo
        * tipo declarado*/
        Function<Product, Product> productFunction = new Function<Product, Product>() {
            @Override
            public Product apply(Product product) {
                product.setPrice(2000.00);
                return product;
            }
        };

        //Function<TipoParamentro, RetornorFunção>

        /*Exemplo usando a interface em conjunto com o map(), a função map percore a lista e retorna uma nova lista de
        * objetos ou valores manipulados*/
        List<Product> newProducts = products.stream().map(productFunction).collect(Collectors.toList());

        for (Product p : newProducts){
            System.out.println(p.getPrice());
        }

        List<Double> novoProducts = products.stream().map(prod -> prod.getPrice() + 200).collect(Collectors.toList());


        /**Como vimos, a função map recebe um Function<T, R> como parametro para ser execultada a cada item, porem o map
         * so pode ser usado por uma stream, entao primeiros temos que converter a list em stream para so assim usar o map
         * e ao final temos que converter a stream de volta para a lista.
         *
         * products.stream().map(função).collect(Collectors.toList());*/

    }
}
