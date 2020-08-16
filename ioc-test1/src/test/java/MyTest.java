import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("testConfig.xml");
        MyHello hello = (MyHello) (context.getBean("hello"));
        System.out.println(hello.toString());
    }

}
