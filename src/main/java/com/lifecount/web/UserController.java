package com.lifecount.web;


import com.lifecount.common.ErrorCode;
import com.lifecount.o_po.User;
import com.lifecount.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "register")
    @ApiOperation("通过ID查询")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path")
    public ErrorCode register(User user){
        userService.register(user);
        return ErrorCode.ok();
    }
}
