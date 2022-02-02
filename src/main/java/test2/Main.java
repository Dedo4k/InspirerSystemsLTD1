package test2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        list.clear();
    }
}
