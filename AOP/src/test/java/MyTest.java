import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Proxy代理后返回的是接口类
        UserService service = (UserService) context.getBean("userService");

        service.getData();
        service.increment();
        service.getData();
    }

}
