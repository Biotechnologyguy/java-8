public class Test {

    @FunctionalInterface
    public interface TestInterface {
        void test(String s);
//        Following is not allowed
//        @FunctionalInterface annotation is used by compiler to restrict to only SAM
//        void test2();
        default void hello(){
            System.out.println("Hello From Default method");
        }

        static void helloStatic(){
            System.out.println("Hello From static method");
        }
    }


    @FunctionalInterface
    public interface P{
        void m1();
    }

    @FunctionalInterface
    public interface C extends P{
        void m1();
    }

    public static void main(String[] args) {

        TestInterface test= (t) -> System.out.println("Hello World " + t);
        test.test("From test");
        test.hello();
        TestInterface.helloStatic();

    }


}
