package main.java.modulo1.exerc;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("\uD83D\uDC08");
        myList.add("\uD83D\uDC15");
        myList.add("\uD83D\uDC1F");
        myList.add("\uD83D\uDC22");

        System.out.println(myList);
myList.clear();
        System.out.println(myList);


    }
}
