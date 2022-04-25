package com.lagou.dao;

/*
* 广告信息的Dao层接口
* */

import com.lagou.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {

    /*
    * 分页查询广告信息
    * */
    public List<PromotionAd> findAllPromotionAdByPage();

    /*
    * 新增广告信息
    * */
    public void savePromotionAd(PromotionAd promotionAd);

    /*
     * 新增广告信息
     * */
    public void updatePromotionAd(PromotionAd promotionAd);

    /*
    * 根据id回显广告位信息
    * */
    public PromotionAd findPromotionAdById(Integer id);

    /*
    * 修改广告状态
    * */
    public void updatePromotionAdStatus(PromotionAd promotionAd);

}
