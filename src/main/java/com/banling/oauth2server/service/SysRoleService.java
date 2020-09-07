package com.banling.oauth2server.service;


import com.banling.oauth2server.dao.SysRoleMapper;
import com.banling.oauth2server.pojo.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}

