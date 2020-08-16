/*
    动态代理实现方法增强
 */

public class Client {

    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        DynamicProxyHandler dph = new DynamicProxyHandler();
        dph.setTarget(service);

        UserService proxy = (UserService) dph.getProxy();
        proxy.getData();
        proxy.increment();
        proxy.getData();
    }

}
