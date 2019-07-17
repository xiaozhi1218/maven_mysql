package com.hx.test;

import com.hx.dao.ItemsDao;
import com.hx.dao.impl.ItemsDaoImpl;
import com.hx.domain.Items;
import org.junit.Test;

import java.util.List;

/**
 * @author chenyongzhi
 * @create 2019/7/17 14:02
 */
public class ItemsTest {

    @Test
    public void findAll() throws Exception {
        ItemsDao itemsDao = new ItemsDaoImpl();
        List<Items> list = itemsDao.findAll();
        for (Items items : list) {
            System.out.println(items.getName());
        }
    }

}
