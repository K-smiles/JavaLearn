package com.chelu.auth;

import com.chelu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private PasswordEncoder encoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("dddddddd");
        //根据用户名 username 查询用户信息
        User user = new User();
        user.setUserName("a");
        user.setPassword("123");
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        //对密码进行加密
        String password = encoder.encode("123");
        user.setPassword(password);
        //如果查询不到数据就通过抛出异常来给出提示
        if(Objects.isNull(user)){
            throw new RuntimeException("用户名或密码错误");
        }
        //TODO 根据用户查询权限信息 添加到LoginUser中

        //封装成UserDetails对象返回
        System.out.println("dddd");
        return new LoginUser(user);
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //1. 查询数据库判断用户名是否存在，如果不存在抛出UsernameNotFoundException
//
//        if(!username.equals("admin")){
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//        //把查询出来的密码进行解析,或直接把password放到构造方法中。
//        //理解:password就是数据库中查询出来的密码，查询出来的内容不是123
//        String password = encoder.encode("123");
//        return new org.springframework.security.core.userdetails.User(username,password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//    }
}
