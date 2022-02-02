package test1;

public class TestClass {

    private static int counter;

    public TestClass() {
        counter++;
    }

    public static int count(){
        return counter;
    }
}
