package com.shangan.trade.goods.service;

import com.shangan.trade.goods.db.model.Goods;
import com.shangan.trade.goods.model.SearchDataResponse;

import java.util.List;

public interface SearchService {

    /**
     * 添加商品到ES中
     * @param goods
     */
    void addGoodsToES(Goods goods);

    /**
     * 根据关键词搜索
     * @param keyword
     * @param from
     * @param size
     * @return
     */
    SearchDataResponse searchGoodsList(String keyword, int from, int size);
}