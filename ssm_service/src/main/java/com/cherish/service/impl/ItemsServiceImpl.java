package com.cherish.service.impl;

import com.cherish.service.ItemsService;
import com.cherish.dao.ItemsDao;
import com.cherish.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cherish
 * @version 1.8.0_121
 * @date 2020/11/17
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }


}
