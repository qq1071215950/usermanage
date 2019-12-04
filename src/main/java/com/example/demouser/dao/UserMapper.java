package com.example.demouser.dao;

import com.example.demouser.entity.User;
import com.example.demouser.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    /**
     * 新增
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 修改
     *
     * @param record
     * @return
     */
    int insertSelective(User record);

    int updateUser(User user);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteUserById(@Param("id") int id);

    /**
     * 查询数量
     *
     * @return
     */
    int selectUserCount(@Param("id") Integer id);

    User selectUserById(@Param("id") Integer id);

    /**
     * 多条件查询
     * @param userQuery
     * @return
     */
    List<User> selectUserByConditions(UserQuery userQuery);

    /**
     * 查询符合条件的数量
     * @param userQuery
     * @return
     */
    int countUserByConditions(UserQuery userQuery);
}