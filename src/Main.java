import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        String s = "I believe that the planet from which the little prince came is Asteroid B-612";
        String [] array = s.split(" ");
        List<String> list = Arrays.asList(array);
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}