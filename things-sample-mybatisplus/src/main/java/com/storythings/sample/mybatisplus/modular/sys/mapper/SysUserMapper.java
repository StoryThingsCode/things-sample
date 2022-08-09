package com.storythings.sample.mybatisplus.modular.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.storythings.sample.mybatisplus.modular.sys.entity.SysUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select * from things_sys_user where 1 = 1 ")
    List<SysUser> fetchUsersByMapper();

    List<SysUser> fetchUsersByXml();

}
