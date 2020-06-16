public class Main {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(3);
        array.insert(1);
        array.insert(2);
        array.insert(4);
        array.removeAt(2);
        System.out.println(array.indexOf(2));

        array.print();
    }
}
