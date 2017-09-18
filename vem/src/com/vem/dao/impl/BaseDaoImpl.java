package com.vem.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.vem.dao.BaseDao;

/**
 *
 * TODO 数据层实现类
 *
 * @author niuchenyang
 *
 */
public class BaseDaoImpl extends SqlSessionDaoSupport implements BaseDao {

    /*
     * (non-Javadoc)
     *
     * @see com.vembei.dao.BaseDao#getMapper(java.lang.Class)
     */
    @Override
    public <T> T getMapper(Class<T> clz) {

        return getSqlSession().getMapper(clz);
    }

    @Override
    public Object selectOne(String statement, Object parameter) {

        return getSqlSession().selectOne(statement, parameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vembei.dao.BaseDao#selectList(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public List<?> selectList(String statement, Object parameter) {

        return getSqlSession().selectList(statement, parameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vembei.dao.BaseDao#selectMap(java.lang.String,
     * java.lang.String)
     */
    @Override
    public <K, V> Map<K, V> selectMap(String statement, String parameter) {

        return selectMap(statement, parameter);
    }

    @Override
    public <K, V> Map<K, V> selectMap(String statement, Object parameter,
            String key) {

        return getSqlSession().selectMap(statement, parameter, key);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vembei.dao.BaseDao#insert(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public int insert(String statement, Object parameter) {

        return getSqlSession().insert(statement, parameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vembei.dao.BaseDao#update(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public int update(String statement, Object parameter) {

        return getSqlSession().update(statement, parameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.vembei.dao.BaseDao#delete(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public int delete(String statement, Object parameter) {

        return getSqlSession().delete(statement, parameter);
    }
}