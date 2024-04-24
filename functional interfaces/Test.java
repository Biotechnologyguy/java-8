public class Test {

    public interface TestInterface {
        void test(String s);
    }
    public static void main(String[] args) {

        TestInterface test= (t) -> System.out.println("Hello World " + t);
        test.test("From test");

    }
}
