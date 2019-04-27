package com.example.summerclub.service;

import com.example.summerclub.mapper.CampMapper;
import com.example.summerclub.pojo.Camp;
import com.example.summerclub.pojo.CampExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:49
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class CampServiceImpl implements CampService {
    @Autowired
    private CampMapper campMapper;
    @Override
    public void insertCamp(Camp camp) {
        campMapper.insert(camp);
    }

    @Override
    public void deleteCampById(long id) {
        campMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateCampById(Camp camp) {
        campMapper.updateByPrimaryKeySelective(camp);
    }

    @Override
    public Camp findCampById(long id) {
        Camp camp = campMapper.selectByPrimaryKey(id);
        return camp;
    }

    @Override
    public List<Camp> findAllCamp() {
        CampExample campExample=new CampExample();
        campExample.createCriteria()
                .getAllCriteria();
        List<Camp> camps = campMapper.selectByExample(campExample);
        return camps;
    }

    @Override
    public List<Camp> findCampByUserId(long userId) {
        CampExample campExample=new CampExample();
        campExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Camp> camps = campMapper.selectByExample(campExample);
        return camps;
    }

    @Override
    public List<Camp> findCampByCampName(String campName) {
        CampExample campExample=new CampExample();
        campExample.createCriteria()
                .andCampNameEqualTo(campName);
        List<Camp> camps = campMapper.selectByExample(campExample);
        return camps;
    }
}
