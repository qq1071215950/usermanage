package com.example.demouser.service;

import com.example.demouser.entity.User;
import com.example.demouser.query.UserQuery;
import com.example.demouser.vo.UserVO;

public interface UserService {

    /**
     * 新增或者修改
     * @param user
     */
    boolean addOrUpdateUser(User user);

    /**
     * 通过id删除用户
     * @param id
     * @return
     */
    boolean deleteUser(Integer id);

    /**
     * 通过查找用户
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 分页查询
     * @param query
     * @return
     */
    UserVO selectUsersByConditions(UserQuery query);

}
