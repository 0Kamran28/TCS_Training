package Nov_9;

public class Main {
    public static void main(String[] args) {
       Test test= TestClass::sayHello;
       test.sayHello("ha","he");
       TestClass2 t = new TestClass2();
       Test2 test2= t::sayHello1;
       test2.sayHello();
       Test2 t2= TestClass::new;
       t2.sayHello();
    }
}
