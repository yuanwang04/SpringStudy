public class UserServiceImpl implements UserService {

    private UserDAO dao;

    public UserServiceImpl() {
        System.out.println("Creating service");
    }

    public void print() {
        if (dao != null) {
            System.out.println(dao.getStr());
        }
    }

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }
}
