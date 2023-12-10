package service.User;

import Pojo.User;

public interface UserService {
    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password);
}
