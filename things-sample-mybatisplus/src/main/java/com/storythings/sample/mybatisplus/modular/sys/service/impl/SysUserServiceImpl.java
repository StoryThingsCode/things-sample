package com.storythings.sample.mybatisplus.modular.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.storythings.sample.common.util.IdGenerator;
import com.storythings.sample.common.util.RandomGenerator;
import com.storythings.sample.mybatisplus.modular.sys.entity.SysUser;
import com.storythings.sample.mybatisplus.modular.sys.mapper.SysUserMapper;
import com.storythings.sample.mybatisplus.modular.sys.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    /**
     * -- desc
     *  1.演示使用wrapper查询
     * @return
     */
    @Override
    public List<SysUser> fetchUsers() {
        LambdaQueryWrapper<SysUser> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderByDesc(SysUser::getCreateTime);
        List<SysUser> list = this.list(wrapper);
        return list;
    }

    /**
     * -- desc
     *  1.演示
     */
    @Override
    public void insertUser() {
        SysUser user = new SysUser();
        user.setId(IdGenerator.createSnowFlakeId());
        user.setName(RandomGenerator.character(6));
        user.setAccount(RandomGenerator.character(6));
        user.setStatus(1);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        // 使用mapper层的insert
        this.baseMapper.insert(user);
        // 使用service层的save
        user.setId(IdGenerator.createSnowFlakeId());
        user.setName(RandomGenerator.character(6));
        user.setAccount(RandomGenerator.character(6));
        user.setStatus(1);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        super.save(user);
    }

    /**
     * 使用mapper中的方法来获取
     * @return
     */
    @Override
    public List<SysUser> fetchUsersByMapper() {
        return this.baseMapper.fetchUsersByMapper();
    }

    /**
     * 使用xml中的方法来获取
     * @return
     */
    @Override
    public List<SysUser> fetchUsersByXml() {
        return this.baseMapper.fetchUsersByXml();
    }
}
