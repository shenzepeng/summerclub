package com.example.summerclub.mapper;

import com.example.summerclub.pojo.Camp;
import com.example.summerclub.pojo.CampExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CampMapper {
    int countByExample(CampExample example);

    int deleteByExample(CampExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Camp record);

    int insertSelective(Camp record);

    List<Camp> selectByExample(CampExample example);

    Camp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Camp record, @Param("example") CampExample example);

    int updateByExample(@Param("record") Camp record, @Param("example") CampExample example);

    int updateByPrimaryKeySelective(Camp record);

    int updateByPrimaryKey(Camp record);
}