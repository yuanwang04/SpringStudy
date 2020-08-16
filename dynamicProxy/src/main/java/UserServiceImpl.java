public class UserServiceImpl implements UserService {

    private int val;

    public UserServiceImpl() {
        val = 0;
    }

    public void increment() {
        val++;
    }

    public int getData() {
        return val;
    }
}
