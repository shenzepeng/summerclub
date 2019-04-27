package com.example.summerclub.service;

import com.example.summerclub.pojo.Banner;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:24
 * @Description: SualLabel, Write down some description!!!
 */
public interface BannerService {
    //添加新的banner
    void insertBanner(Banner banner);
    //通过id删除Banner
    void deleteBannerById(long id);
    //通过主键id更新Banner，更新值不为null的字段
    void updateBannerById(Banner banner);
    //通过id找到banner
    Banner findBannerById(long id);
    //显示所有banner
    List<Banner> findAllBanner();

}
