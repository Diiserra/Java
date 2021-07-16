package lambdaFunction.predicate;

import lambdaFunction.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<lambdaFunction.Product> products = new ArrayList<>();
        products.add(new lambdaFunction.Product("TV", 900.00));
        products.add(new lambdaFunction.Product("Tablet", 900.00));
        products.add(new lambdaFunction.Product("Notebook", 1200.00));
        products.add(new Product("Iphone", 2000.00));

        products.removeIf((product) -> product.getPrice() > 1000); // Remove os produtos com preco maior que 1000.
        /*O metodo removeIf recebe uma arrow function Predicate, que vai testar os itens de lista e o que atender a condição e
        * e retornar true sera excluido da lista*/

        for (Product p : products){
            System.out.println(p.getName());
        }

        /*A interfaceFunction Predicade possui o metodo test, que deve ser implementado e retorna true caso a expressa for
        * atendida*/
        Predicate<Product> productPredicate = new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() > 100; // Retorna true se for maior que 100
            }
        };
    }
}
