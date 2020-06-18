import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList<>();
        linkedList.add(20);
        linkedList.add(10);

        System.out.println(linkedList);

        System.out.println(Arrays.toString(reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"})));
    }

    public static String[] reorderLogFiles(String[] logs){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String[] res = new String[logs.length];
        for (int i = 0; i<logs.length; i++){
            int index = logs[i].indexOf(" ") + 1;
            if (logs[i].charAt(index) < 'a'){
                list1.add(logs[i]);
            }else {
                list2.add(logs[i]);
            }
        }
        Collections.sort(list2);
        for (int i=0; i<list2.size(); i++) res[i] = list2.get(i);
        for (int i=0; i<list1.size(); i++) res[list2.size()-i+1] = list1.get(i);
        return res;
    }

}
