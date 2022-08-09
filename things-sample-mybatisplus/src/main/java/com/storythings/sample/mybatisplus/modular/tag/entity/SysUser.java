package com.storythings.sample.mybatisplus.modular.tag.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName( value = "things_sys_user" )
public class SysUser {

    @TableId( value = "id", type = IdType.INPUT)
    private Long id;

    @TableField( value = "name" )
    private String name;

    @TableField( value = "account" )
    private String account;

    @TableField( value = "password" )
    private String password;

    @TableField( value = "password_salt" )
    private String passwordSalt;

    @TableField( value = "status" )
    private Integer status;

    @TableField( value = "create_time" )
    private Date createTime;

    @TableField( value = "update_time" )
    private Date updateTime;

}
