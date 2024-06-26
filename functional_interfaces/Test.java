public class Test {

    @FunctionalInterface
    public interface TestInterface {
        void test(String s);

        //        Following is not allowed
//        @FunctionalInterface annotation is used by compiler to restrict to only SAM
//        void test2();
        default void hello() {
            System.out.println("Hello From Default method");
        }

        static void helloStatic() {
            System.out.println("Hello From static method");
        }
    }


    @FunctionalInterface
    public interface P {
        void m1();
    }

    @FunctionalInterface
    public interface C extends P {
        void m1();
    }

    interface Interf {
        void m1();
    }

    public static class Demo implements Interf {
        public void m1() {
            System.out.println("m1 method implementation");
        }
    }


    interface Interf2{
        void m1();
        void m2();
    }

//    @FunctionalInterface
//    interface Interf4{
//        void m1();
//        void m2();
//    }

    public static void main(String[] args) {

//        TestInterface test = (t) -> System.out.println("Hello World " + t);
//        test.test("From test");
//        test.hello();
//        TestInterface.helloStatic();

//        Without Lambda
        Interf i = new Demo();
        i.m1();

//        With Lambda
        Interf i2 = () -> System.out.println("m1 method implementation by lambda");
        i2.m1();

//        Runnable example
        Runnable r = () -> {
            for (int j = 0; j < 10; j++) {
                System.out.println("Child Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int k = 0; k < 10; k++) {
            System.out.println("Main Thread");
        }
//        Gives error
//        Interf2 i3 = () -> System.out.println("m1 method implementation");
//        i3.m1();
    }


}
