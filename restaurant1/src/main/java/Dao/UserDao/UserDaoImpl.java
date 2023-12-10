package Dao.UserDao;

import Dao.BaseDao;
import Pojo.User;
import Pojo.restaurantAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    /**
     * 得到要登录的用户
     *
     * @param connection
     * @param username
     * @return
     */
    @Override
    public User getLoginUser(Connection connection, String username) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        User user= null;
        try {
            if (null != connection) {
                String sql = "select * from restaurant.users where username=?";
                Object[] params = {username};
                rs = BaseDao.execute(connection, pstm, rs, sql, params);
                if (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                }
            }
            BaseDao.closeResource(null, pstm, rs);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}
