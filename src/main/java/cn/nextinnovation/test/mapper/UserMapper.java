package cn.nextinnovation.test.mapper;/*
*user的mapper类
*@author Administrator houxuan
*@create 2017/10/14
*/

import cn.nextinnovation.test.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User findUserById(Integer id);
}
