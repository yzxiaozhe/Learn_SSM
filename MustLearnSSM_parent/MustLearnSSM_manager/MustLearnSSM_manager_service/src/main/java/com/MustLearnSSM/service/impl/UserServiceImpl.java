package com.MustLearnSSM.service.impl;

import com.MustLearnSSM.mapper.UserMapper;
import com.MustLearnSSM.pojo.User;
import com.MustLearnSSM.pojo.UserExample;
import com.MustLearnSSM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/9 10:52
 */

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserMapper userMapper;
    
    @Override
    public User getUserById(Integer id) {

        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<User> userList =userMapper.selectByExample(userExample);
        
        if (userList!=null){
            return userList.get(0);
        }
        
        return null;
    }
}
