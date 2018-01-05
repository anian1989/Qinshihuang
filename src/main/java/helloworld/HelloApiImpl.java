package helloworld;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by junshuaizhang1 on 2018/1/2.
 */
public class HelloApiImpl implements HelloApi {
    private Logger logger = LoggerFactory.getLogger(HelloApiImpl.class);
    @Override
    public void sayHello() {
        logger.info("=======================");
        System.out.println("Hello");
    }
}
