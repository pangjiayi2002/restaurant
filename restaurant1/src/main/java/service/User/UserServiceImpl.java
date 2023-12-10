package service.User;

import Dao.BaseDao;
import Dao.UserDao.UserDao;
import Dao.UserDao.UserDaoImpl;
import Pojo.User;

import java.sql.Connection;

public class UserServiceImpl implements UserService{
    //业务层调用Dao层
    private UserDao userDao=new UserDaoImpl();
    @Override
    public User login(String username, String password) {
        Connection connection = null;
        User user = null;
        try {
            connection = BaseDao.getConnection();
            //通过业务层调用对应的具体数据库操作
            user = userDao.getLoginUser(connection,username);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }

        //匹配密码
        if (null != user) {
            if (!user.getPassword().equals(password)) {
                user = null;
            }
        }
        return user;
    }

}
