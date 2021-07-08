package hashCodeEequals;



public class Main {

    public static void main(String[] args) {

        Client c1 = new Client("Diego", "diego");
        Client c2 = new Client("Diego", "diego");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

    }
}
