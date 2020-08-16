import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((User) context.getBean("name1")).print();
        ((User) context.getBean("name2")).print();
        ((User) context.getBean("name3")).print();
        ((User) context.getBean("name4")).print();
    }

}
