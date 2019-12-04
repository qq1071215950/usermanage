package com.example.demouser.controller;

import com.example.demouser.entity.User;
import com.example.demouser.query.UserQuery;
import com.example.demouser.service.UserService;
import com.example.demouser.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "hello";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Boolean addOrUpdateUser(@RequestBody User user){
        return userService.addOrUpdateUser(user);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public boolean deleteUser(@RequestParam Integer id){
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public User getUser(@RequestParam Integer id){
        return userService.selectById(id);
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public UserVO queryUsers(@RequestBody UserQuery query){
        return userService.selectUsersByConditions(query);
    }
}
