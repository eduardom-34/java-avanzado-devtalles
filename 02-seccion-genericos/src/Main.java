import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Gabriel");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>(10);
        System.out.println(integerBox.getValue());
    }
}