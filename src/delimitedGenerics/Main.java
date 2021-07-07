package delimitedGenerics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\diegu\\IdeaProjects\\Java\\src\\delimitedGenerics\\products.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] filds = line.split(",");
                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println(x);

        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}
