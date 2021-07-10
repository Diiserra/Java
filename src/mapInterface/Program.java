package mapInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\diegu\\IdeaProjects\\Java\\src\\mapInterface\\in.txt";
        Map<String, Integer> list = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] filds = line.split(",");
                String name = filds[0];
                int number = Integer.parseInt(filds[1]);

                if (list.containsKey(name)) {
                    int sum = list.get(name);
                    list.put(name, number + sum);
                }else {
                    list.put(name, number);
                }

                line = br.readLine();
            }

            for (String key : list.keySet()){
                System.out.println(key + ": " + list.get(key));
            }
        }catch (IOException e){

        }

    }
}
