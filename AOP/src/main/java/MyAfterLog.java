import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterLog implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName() + " called " + method.getName() +
                ", return value is: " + o);
    }

}
