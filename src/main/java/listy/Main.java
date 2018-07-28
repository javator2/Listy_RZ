package listy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();

        for(int i = 1; i < 20; i ++) {
            list.add(i);
        }
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
