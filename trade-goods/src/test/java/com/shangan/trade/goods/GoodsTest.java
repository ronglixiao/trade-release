package com.shangan.trade.goods;

import com.alibaba.fastjson.JSON;
import com.shangan.trade.goods.db.dao.GoodsDao;
import com.shangan.trade.goods.db.model.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsTest {

    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void insertGoodsTest() {
        Goods goods = new Goods();
        goods.setTitle("iphone 14 pro max");
        goods.setBrand("Apple");
        goods.setCategory("Mobile");
        goods.setNumber("NO123456");
        goods.setImage("test");
        goods.setDescription("iphone 14 pro max is very good");
        goods.setKeywords("Apple Mobile");
        goods.setSaleNum(0);
        goods.setAvailableStock(10000);
        goods.setPrice(1088);
        goods.setStatus(1);
        boolean insertResult = goodsDao.insertGoods(goods);
        System.out.println(insertResult);
    }

    @Test
    public void deleteGoodsTest() {
        boolean deleteResult = goodsDao.deleteGoods(16);
        System.out.println(deleteResult);
    }

    @Test
    public void queryGoodsTest() {
        Goods goods = goodsDao.queryGoodsById(17);
        System.out.println(JSON.toJSONString(goods));
    }

    @Test
    public void updateGoods() {
        Goods goods = goodsDao.queryGoodsById(17);
        goods.setTitle(goods.getTitle() + " update");
        goodsDao.updateGoods(goods);
    }
}