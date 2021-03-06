package com.cherish.dao;

import com.cherish.pojo.Items;

import java.util.List;

/**
 * @author Cherish
 * @version 1.8.0_121
 * @date 2020/11/17
 */
public interface ItemsDao {
    /**
     * 查询所有
     *
     * @return 结果集和
     */
    List<Items> findAll();
}
