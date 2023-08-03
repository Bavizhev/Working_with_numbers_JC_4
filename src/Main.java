import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Main.listMain(intList);
        StreamMain.streamMain(intList);

    }

    public static void listMain(List intList) {
        List<Integer> list = new ArrayList<>(intList);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 0 || list.get(i) % 2 != 0) {
                list.remove(i);
                i -= 1;
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        /* for (int i = 0; i < list.size(); i++) { // <----- Или такой вывод, чтобы было одинаково.
            System.out.println(list.get(i));
        }  */
    }
}

