import helloworld.HelloApi;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by junshuaizhang1 on 2018/1/2.
 */

public class HelloTest {
    @Test
    public void testHello(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("hello/hello.xml");
        HelloApi helloApi = classPathXmlApplicationContext.getBean("helloApi", HelloApi.class);
        helloApi.sayHello();


    }
    @Test
    public  void testLong(){
        String s = Long.toBinaryString(12);
        String s1 = Long.toBinaryString(8);
        long i = 12L & 3L;
        if (i>0)
            System.out.println(123);
        else
            System.out.println(0);

    }
}
