package lambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Tablet", 900.00));
        products.add(new Product("Notebook", 900.00));
        products.add(new Product("Iphone", 900.00));

        //Collections.sort(products); -- Metodo sort organiza a lista de forma ASC.
        products.sort(new MyComparator()); //Metodo sort organiza a lista de forma ASC.


        //Classe anonima
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        products.sort(productComparator); //Metodo sort organiza a lista de forma ASC.


        //Expressoes Lambdas ou Arrow Function
        Comparator<Product> prod = (p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        products.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Product product : products){
            System.out.println(product.getName());
        }
    }
}
