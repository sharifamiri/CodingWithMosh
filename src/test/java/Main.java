import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        var list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }
        };


    }


}
