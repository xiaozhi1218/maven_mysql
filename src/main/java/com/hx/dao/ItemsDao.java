package com.hx.dao;

import com.hx.domain.Items;

import java.util.List;

/**
 * @author chenyongzhi
 * @create 2019/7/17 13:32
 */
public interface ItemsDao {

    List<Items> findAll() throws Exception;
}
