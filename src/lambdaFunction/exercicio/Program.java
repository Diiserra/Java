package lambdaFunction.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter path locale: ");
        String path = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] filds = line.split(",");
                list.add(new Employee(filds[0], filds[1], Double.parseDouble(filds[2])));
                line = br.readLine();
            }

            System.out.println("Email of people whose salary is more than " + salary);

            Comparator<Employee> comparator = (e1, e2) -> e1.getName().toUpperCase().compareTo(e2.getName().toUpperCase());

            List<String> emails = list.stream()
                                    .filter(e -> e.getSalary() > salary)
                                    .map(e -> e.getEmail())
                                    .sorted()
                                    .collect(Collectors.toList());

            emails.forEach(System.out::println);


            double sum = list.stream().filter(e -> e.getName().charAt(0) == 'M')
                                        .map(e -> e.getSalary())
                                        .reduce(0.0, (x, y) -> x + y);

            System.out.println(sum);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
