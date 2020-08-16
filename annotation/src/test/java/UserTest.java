import com.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* User Tester. 
* 
* @author <Authors name> 
* @since <pre>8�� 16, 2020</pre> 
* @version 1.0 
*/ 
public class UserTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void test1() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    User user = (User) context.getBean("user");
    System.out.println(user.toString());
}

} 
