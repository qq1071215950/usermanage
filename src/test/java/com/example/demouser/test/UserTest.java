package com.example.demouser.test;

import com.example.demouser.entity.User;
import com.example.demouser.query.UserQuery;
import com.example.demouser.service.UserService;
import com.example.demouser.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void moditifyTest(){
        User user = new User();
        user.setId(2);
        user.setAge("23");
        user.setName("李四23");
        user.setTags("富三代");
        user.setPhone("123345566");
        user.setEmail("1231@qq.com");
        user.setAddress("上海");
        boolean result= userService.addOrUpdateUser(user);
        System.out.println(result);
    }

    @Test
    public void queryTest(){
        UserQuery query = new UserQuery();
        UserVO userVO  = userService.selectUsersByConditions(query);
        for (Object user:userVO.getDatalist()) {
            System.out.println(user);
        }
        System.out.println(userVO);
    }
}
