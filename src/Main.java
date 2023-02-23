import by.belstu.it.Tarakanov.TestFuntion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TestFuntion test = new TestFuntion();
        System.out.println(test.getValue());

        for (int i = 0; i < 9; i++) {
            if(i>-1)
                if(i<10)
                    System.out.println(i);
        }
    }
    //TODO: todo comment
}

