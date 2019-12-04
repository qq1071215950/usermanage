package com.example.demouser.service.impl;

import com.example.demouser.dao.UserMapper;
import com.example.demouser.entity.User;
import com.example.demouser.query.UserQuery;
import com.example.demouser.service.UserService;
import com.example.demouser.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean addOrUpdateUser(User user) {
        Integer id = user.getId();
        int result;
        if (id == null){
             result = userMapper.insert(user);
            if (result==1){
                return true;
            }else {
                return false;
            }
        }
        result = userMapper.updateUser(user);
        if (result==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteUser(Integer id) {
       int result = userMapper.deleteUserById(id);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public UserVO selectUsersByConditions(UserQuery query) {
        if (query.getCurrPage() == null){
            query.setCurrPage(1);
        }
        if (query.getPageSize() == null){
            query.setPageSize(5);
        }
        UserVO userVO = new UserVO();
        int result = userMapper.countUserByConditions(query);
        if (result > 0){
            List<User> userList= userMapper.selectUserByConditions(query);
            userVO.setDatalist(userList);
        }
        userVO.setCurrPage(query.getCurrPage());
        userVO.setPageSize(query.getPageSize());
        userVO.setTotal(result);
        return userVO;
    }
}
