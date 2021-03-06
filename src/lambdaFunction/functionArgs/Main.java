package lambdaFunction.functionArgs;

import lambdaFunction.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Tablet", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Iphone", 2000.00));

        ProductService prod = new ProductService();

        double sum = prod.filterSum(products, p -> p.getName().charAt(0) == 'T');

        System.out.println(sum);
    }
}
