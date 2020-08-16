import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("daoConfig.xml");
        ((UserService) context.getBean("service")).print();
    }

}
