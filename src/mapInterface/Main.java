package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> listProduct = new HashMap<>();

        listProduct.put("Arroz", 7891232);
        listProduct.put("Feijao", 7892343);
        listProduct.put("Macarrao", 7890334);

        System.out.println(listProduct.get("Arroz"));
        System.out.println(listProduct.remove("Feijao"));
        System.out.println(listProduct.containsKey("Feijao"));

        for (String key : listProduct.keySet()){
            System.out.println(key + " " + listProduct.get(key));
        }
    }

}
