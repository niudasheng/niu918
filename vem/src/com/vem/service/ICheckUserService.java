package com.vem.service;

/**
 * 后台校验Service层接口
 */
public interface ICheckUserService {

    /**
     * 后台校验抽象方法
     */
    Object checkcheck(String userName, String password);
}
