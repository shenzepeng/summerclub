package com.example.summerclub.controller;

import com.example.summerclub.pojo.Banner;
import com.example.summerclub.service.BannerService;
import com.example.summerclub.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 01:00
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;
    //添加新的banner
    @ApiOperation("添加新的banner")
    @PostMapping("/insertBanner.action")
    public SzpJsonResult insertBanner(@RequestBody Banner banner, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bannerService.insertBanner(banner);
        return SzpJsonResult.ok();
    }
    //通过id删除Banner
    @ApiOperation("通过id删除Banner")
    @DeleteMapping("/deleteBannerById.action")
    public SzpJsonResult deleteBannerById(@RequestBody long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bannerService.deleteBannerById(id);
        return SzpJsonResult.ok();
    }
    //通过主键id更新Banner，更新值不为null的字段
    @ApiOperation("通过主键id更新Banner，更新值不为null的字段")
    @PutMapping("/updateBannerById.action")
    public SzpJsonResult updateBannerById(@RequestBody Banner banner, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bannerService.updateBannerById(banner);
        return SzpJsonResult.ok();
    }
    //通过id找到banner
    @ApiOperation("通过id找到banner")
    @GetMapping("/findBannerById.action")
    public SzpJsonResult findBannerById(long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Banner bannerById = bannerService.findBannerById(id);
        return SzpJsonResult.ok(bannerById);
    }
    //显示所有banner
    @ApiOperation("显示所有banner")
    @GetMapping("/findAllBanner.action")
    public SzpJsonResult findAllBanner(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Banner> allBanner = bannerService.findAllBanner();
        return SzpJsonResult.ok(allBanner);
    }
}
