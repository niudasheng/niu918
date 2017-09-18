package com.vem.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.vem.dao.impl.BaseDaoImpl;
import com.vem.service.ICheckUserService;

/**
 * 订单详情Service层接口实现类
 *
 */
@Service("checkUserService")
public class CheckUserService implements ICheckUserService {

    protected BaseDaoImpl dao;

    @Resource(name = "baseDao")
    public void setDao(BaseDaoImpl dao) {

        this.dao = dao;
    }

    @Override
    public Object checkcheck(String userName, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", userName);
        map.put("password", password);
        System.out.println(userName+"dao0");
        Object selectOne = dao.selectOne("com.vem.dao.UserMapper.getByUserPassword", map);

        System.out.println(userName+"dao1");
        return selectOne;
    }
}
