package com.storythings.sample.mybatisplus.modular.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.storythings.sample.mybatisplus.modular.sys.entity.SysUser;

import java.util.List;

public interface SysUserService extends IService<SysUser> {

    List<SysUser> fetchUsers();

    void insertUser();

    List<SysUser> fetchUsersByMapper();

    List<SysUser> fetchUsersByXml();

}
