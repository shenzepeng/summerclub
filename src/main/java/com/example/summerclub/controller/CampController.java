package com.example.summerclub.controller;

import com.example.summerclub.pojo.Camp;
import com.example.summerclub.service.CampService;
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
public class CampController {
    @Autowired
    private CampService campService;
    //添加新的camp
    @ApiOperation("添加新的camp")
    @PostMapping("/insertCamp.action")
    public SzpJsonResult insertCamp(@RequestBody Camp camp, HttpServletResponse response){
        campService.insertCamp(camp);
        return SzpJsonResult.ok();
    }
    //通过id删除camp
    @ApiOperation("通过id删除camp")
    @DeleteMapping("/deleteCampById.action")
    public SzpJsonResult deleteCampById(@RequestBody long id, HttpServletResponse response){
        campService.deleteCampById(id);
        return SzpJsonResult.ok();
    }
    //通过主键id更新camp，更新值不为null的字段
    @ApiOperation("通过主键id更新camp，更新值不为null的字段")
    @PutMapping("/updateCampById.action")
    public SzpJsonResult updateCampById(@RequestBody Camp camp, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        campService.updateCampById(camp);
        return SzpJsonResult.ok();
    }
    //通过id找到camp
    @ApiOperation("通过id找到camp")
    @GetMapping("/findCampById.action")
    public SzpJsonResult findCampById(long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Camp campById = campService.findCampById(id);
        return SzpJsonResult.ok(campById);
    }
    //显示所有Camp
    @ApiOperation("显示所有Camp")
    @GetMapping("/findAllCamp.action")
    public SzpJsonResult findAllCamp(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Camp> allCamp = campService.findAllCamp();
        return SzpJsonResult.ok(allCamp);
    }
    //通过userId找到camp
    @ApiOperation("通过userId找到camp")
    @GetMapping("/findCampByUserId.action")
    public SzpJsonResult findCampByUserId(long userId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Camp> campByUserId = campService.findCampByUserId(userId);
        return SzpJsonResult.ok(campByUserId);
    }
    //通过campName找到camp
    @ApiOperation("通过campName找到camp")
    @GetMapping("/findCampByCampName")
    public SzpJsonResult findCampByCampName(String campName, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Camp> campByCampName = campService.findCampByCampName(campName);
        return SzpJsonResult.ok(campByCampName);
    }
}
