package test2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    private List<T> list;
    private MyListener changed = new MyListenerImpl("List size is changed.");

    public MyList() {
        this.list = new ArrayList<>();
    }

    public MyList(List<T> l) {
        this.list = new ArrayList<>(l);
    }

    public void add(T a) {
        list.add(a);
        changed.onEvent();
    }

    public void remove(T a) {
        list.remove(a);
        changed.onEvent();
    }

    public T remove(int i) {
        T object = list.remove(i);
        changed.onEvent();
        return object;
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public int indexOf(T obj) {
        return list.indexOf(obj);
    }

    public void clear() {
        if (size() != 0) {
            list.clear();
            changed.onEvent();
        }
    }
}
