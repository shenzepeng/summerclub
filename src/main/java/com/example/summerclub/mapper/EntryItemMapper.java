package com.example.summerclub.mapper;

import com.example.summerclub.pojo.EntryItem;
import com.example.summerclub.pojo.EntryItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EntryItemMapper {
    int countByExample(EntryItemExample example);

    int deleteByExample(EntryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EntryItem record);

    int insertSelective(EntryItem record);

    List<EntryItem> selectByExample(EntryItemExample example);

    EntryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EntryItem record, @Param("example") EntryItemExample example);

    int updateByExample(@Param("record") EntryItem record, @Param("example") EntryItemExample example);

    int updateByPrimaryKeySelective(EntryItem record);

    int updateByPrimaryKey(EntryItem record);
}