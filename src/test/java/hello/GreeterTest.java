package hello;

import org.junit.Test;

/**
 * Created by waldemar on 25/07/16.
 */
public class GreeterTest {
    @Test
    public void sayHello() throws Exception {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
