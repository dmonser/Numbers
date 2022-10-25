import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> filteredList = new ArrayList<>();

        for (int i : intList) {
            if (i > 0) {
                filteredList.add(i);
            }
        }

        for (int i = 0; i < filteredList.size(); i++) {
            if (filteredList.get(i) % 2 != 0){
                filteredList.remove(i);
                i = 0;
            }
        }

        for (int i : intList) {
            Collections.sort(filteredList);
        }

        System.out.println(filteredList);
    }
}