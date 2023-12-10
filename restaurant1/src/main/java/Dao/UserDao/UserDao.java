package Dao.UserDao;

import Pojo.User;

import java.sql.Connection;

public interface UserDao {
    /**
     * 通过userCode获取User
     *
     * @param connection
     * @param username
     * @return
     * @throws Exception
     */
    User getLoginUser(Connection connection, String username) throws Exception;
}
