package lambdaFunction.functionArgs;

import lambdaFunction.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filterSum(List<Product> products, Predicate<Product> crit){
        double sum = 0;
        for (Product p : products){
            if (crit.test(p)){
                sum+= p.getPrice();
            }
        }
        return sum;
    }
}
