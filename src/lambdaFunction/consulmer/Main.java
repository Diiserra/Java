package lambdaFunction.consulmer;

import lambdaFunction.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Tablet", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Iphone", 2000.00));

        products.forEach(product -> product.setName("TrocaNome"));
        /*O medoto forEach receber uma arrow function Consulmer que vai ser execultada para cada item da lista podendo manipular
        * cada item da lista*/

        for (Product p : products){
            System.out.println(p.getName());
        }

        /*A interfaceFunction Consumer possui o metodo accept que é void e vai ser execultada a cada item da lista, a implementação
        * fica por conta do programador*/
        Consumer<Product> productConsumer = new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                if (product.getPrice() > 200){
                    product.setPrice(product.getPrice() + 20);
                }
            }
        };

        products.forEach(productConsumer);
        for (Product p : products){
            System.out.println(p.getPrice());
        }

    }
}
