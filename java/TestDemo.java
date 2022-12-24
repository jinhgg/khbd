import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.indexOf(2));
        

    }
}

class Car {
    String name;
    int number;

    class Engine {
        String engineName;
    }

}