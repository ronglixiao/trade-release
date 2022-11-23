package com.shangan.trade.goods.model;

import com.shangan.trade.goods.db.model.Goods;
import lombok.Data;

import java.util.List;

@Data
public class SearchDataResponse {
    private List<Goods> goodsList;
    private String keyword;
    private int from;
    private int size;
    private long totalNum;
}
