package delimitedWilcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Retangle(3.0, 3.4));

        System.out.println(totalArea(myShapes));


    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape item : list){
            sum += item.area();
        }
        return sum;
    }




}
