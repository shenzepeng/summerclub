package com.example.summerclub.service;

import com.example.summerclub.pojo.Camp;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:24
 * @Description: SualLabel, Write down some description!!!
 */
public interface CampService {
    //添加新的camp
    void insertCamp(Camp camp);
    //通过id删除camp
    void deleteCampById(long id);
    //通过主键id更新camp，更新值不为null的字段
    void updateCampById(Camp camp);
    //通过id找到camp
    Camp findCampById(long id);
    //显示所有Camp
    List<Camp> findAllCamp();
    //通过userId找到camp
    List<Camp> findCampByUserId(long userId);
    //通过campName找到camp
    List<Camp> findCampByCampName(String campName);
}
