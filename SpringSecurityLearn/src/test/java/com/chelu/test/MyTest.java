package com.chelu.test;

import com.chelu.auth.LoginUser;
import com.chelu.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        //创建解析器
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        //对密码进行加密
        String password = encoder.encode("123");
        System.out.println("------------"+password);

        //判断原字符加密后和内容是否匹配
        boolean result = encoder.matches("123",password);
        System.out.println("============="+result);

        String key = "a";
        LoginUser loginUser = new LoginUser();
        loginUser.setUser(new User("a","123"));
        redisTemplate.opsForValue().set(key,loginUser);
        LoginUser loginUser1 = (LoginUser) redisTemplate.opsForValue().get(key);
        System.out.println(loginUser1);
    }
}