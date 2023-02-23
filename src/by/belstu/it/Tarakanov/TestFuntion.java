package by.belstu.it.Tarakanov;

public class TestFuntion {
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private int number = 0;
    @Override
    public String toString() {
        return "TestFuntion{}";
    }

    public TestFuntion() {
    }
    public void onCreateFori()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Counter" + i);
        }
    }

    public String getValue() {
        System.out.println("new code");
        return "Hello from first project";
    }
}


