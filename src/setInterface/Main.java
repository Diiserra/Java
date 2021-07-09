package setInterface;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Tanto a interface List quanto a Set, são utilizados para a criação de listas, uma das diferenças entre elas
        * é com a Set não e possivel adicionar dados iguais, evitando a repetição do mesmo dado.*/

        Set<String> stringSet = new LinkedHashSet<>(); // TreeSet<>(); HashSet<>();
        stringSet.add("TV");
        stringSet.add("Notebook");
        stringSet.add("Tablet");

        //stringSet.removeIf(item -> item.length() > 2);

        for (String item : stringSet){
            System.out.println(item);
        }


        //---------------------------------------------------------------//

        Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new TreeSet<>(Arrays.asList(0, 2, 4, 6));

        //Union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


        //----------------------------------------------------------------//
        //Comparando igualdade com Set<>

        /**Para comparar objetos em listas Set<> tem que implementar os metodos equals e hashCode na classe usada.*/

        Set<Product> products = new HashSet<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Tablet", 910.00));
        products.add(new Product("Note", 900.00));

        Product product = new Product("Note", 900.00);

        System.out.println(products.contains(product)); //O metodo contains() retorna true caso o objeto passado exista na lista.

        /*OBS: Se a classe nao possuir implementação do hashCode e equals, o metodo contains vai comparar a referencia
          em memoria e o retorna sempre sera false.*/



        //--------------------------------------------------------------------------//
        //





    }
}
