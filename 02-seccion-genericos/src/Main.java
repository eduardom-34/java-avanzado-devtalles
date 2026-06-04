import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Box<String> name = new Box<>("Gabriel");

        //System.out.println(name.getValue());

        Utility.printItem("Gabriel", 2);
        Utility.printItem(10);

        MathUtils.saum(2, 2);
        MathUtils.saum(2, 4);

        List<String> names = new ArrayList<>();
        names.add("Cesar");
        names.add("Maria");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        printList(numbers);
        printList(names);

    }

    public static void printList(List<?> list){
        for (Object o: list){
            System.out.println(o);
        }
    }
}