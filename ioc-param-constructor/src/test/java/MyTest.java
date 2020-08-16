import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userConfig.xml");
        ((User) context.getBean("one")).print();
        ((User) context.getBean("two")).print();
    }

}
