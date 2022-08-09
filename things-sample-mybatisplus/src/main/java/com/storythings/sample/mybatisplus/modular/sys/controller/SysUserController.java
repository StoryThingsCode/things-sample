package com.storythings.sample.mybatisplus.modular.sys.controller;

import com.storythings.sample.common.annotation.Req;
import com.storythings.sample.common.basic.BasicResponse;
import com.storythings.sample.mybatisplus.modular.sys.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @Req( url = "/sys/user/fetchUsers", method = RequestMethod.GET)
    public BasicResponse fetchUsers(){
        return BasicResponse.success(sysUserService.fetchUsers());
    }

    @Req( url = "/sys/user/insertUser", method = RequestMethod.GET)
    public BasicResponse insertUser(){
        sysUserService.insertUser();
        return BasicResponse.success();
    }

    @Req( url = "/sys/user/fetchUsersByMapper", method = RequestMethod.GET)
    public BasicResponse fetchUsersByMapper(){
        return BasicResponse.success(sysUserService.fetchUsersByMapper());
    }

    @Req( url = "/sys/user/fetchUsersByXml", method = RequestMethod.GET)
    public BasicResponse fetchUsersByXml(){
        return BasicResponse.success(sysUserService.fetchUsersByXml());
    }

}
