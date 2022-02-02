package test2;

public class MyListenerImpl implements MyListener{

    private final String message;

    public MyListenerImpl(String message) {
        this.message = message;
    }

    @Override
    public void onEvent() {
        System.out.println(message);
    }
}
