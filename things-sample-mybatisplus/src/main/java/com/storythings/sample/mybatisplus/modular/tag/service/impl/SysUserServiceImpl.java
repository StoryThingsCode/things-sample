package com.storythings.sample.mybatisplus.modular.tag.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.storythings.sample.mybatisplus.modular.tag.entity.SysUser;
import com.storythings.sample.mybatisplus.modular.tag.mapper.SysUserMapper;
import com.storythings.sample.mybatisplus.modular.tag.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
