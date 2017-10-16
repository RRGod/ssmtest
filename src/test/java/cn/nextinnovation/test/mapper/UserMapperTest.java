package cn.nextinnovation.test.mapper;

import cn.nextinnovation.test.pojo.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring的测试//立马开启了spring的注解
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml",
        "classpath:spring/applicationContext-mybatis.xml",
        "classpath:spring/applicationContext-transaction.xml"})//加载核心配置文件，自动构建spring容器

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void findUserById() throws Exception {
        User user = this.userMapper.findUserById(2);
        System.out.println(user);
    }

}
