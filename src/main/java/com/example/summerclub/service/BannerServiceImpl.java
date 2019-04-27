package com.example.summerclub.service;

import com.example.summerclub.mapper.BannerMapper;
import com.example.summerclub.pojo.Banner;
import com.example.summerclub.pojo.BannerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:46
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public void insertBanner(Banner banner) {
        bannerMapper.insert(banner);
    }

    @Override
    public void deleteBannerById(long id) {
        bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateBannerById(Banner banner) {
        bannerMapper.updateByPrimaryKeySelective(banner);
    }

    @Override
    public Banner findBannerById(long id) {
        Banner banner = bannerMapper.selectByPrimaryKey(id);
        return banner;
    }

    @Override
    public List<Banner> findAllBanner() {
        BannerExample bannerExample=new BannerExample();
        bannerExample.createCriteria()
                .getAllCriteria();
        List<Banner> banners = bannerMapper.selectByExample(bannerExample);
        return banners;
    }
}
