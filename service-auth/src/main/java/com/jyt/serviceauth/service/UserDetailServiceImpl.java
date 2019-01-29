package com.jyt.serviceauth.service;

import com.jyt.serviceauth.util.UserDetailsImpl;
import com.jyt.serviceauth.vo.SysRole;
import com.jyt.serviceauth.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO userVo = new UserVO();
        userVo.setUsername("xuwenjin");
        userVo.setPassword("123456");
        userVo.setDelFlag("0");
        List<SysRole> sysRoles = new ArrayList();
        SysRole sysRole = new SysRole();
        sysRole.setRoleCode("ROLE_ADMIN");
        sysRole.setRoleId(1);
        sysRoles.add(sysRole);
        userVo.setRoleList(sysRoles);
        return new UserDetailsImpl(userVo);
    }
}
