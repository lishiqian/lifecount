package com.lifecount.web;


import com.lifecount.common.ErrorCode;
import com.lifecount.o_po.User;
import com.lifecount.service.UserService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ApiModel
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "register")
    @ResponseBody
    @ApiOperation(value = "添加用户", notes = "增加用户")
    public String register(User user){
        userService.register(user);
        return ErrorCode.ok().toString();
    }
}
