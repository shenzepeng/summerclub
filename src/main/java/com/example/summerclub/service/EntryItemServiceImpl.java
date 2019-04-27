package com.example.summerclub.service;

import com.example.summerclub.mapper.EntryItemMapper;
import com.example.summerclub.pojo.EntryItem;
import com.example.summerclub.pojo.EntryItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:53
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class EntryItemServiceImpl implements EntryItemService {
    @Autowired
    private EntryItemMapper entryItemMapper;
    @Override
    public void insertEntryItem(EntryItem entryItem) {
        entryItemMapper.insert(entryItem);
    }

    @Override
    public void deleteEntryItemById(long id) {
        entryItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateEntryItemById(EntryItem entryItem) {
        entryItemMapper.updateByPrimaryKeySelective(entryItem);
    }

    @Override
    public EntryItem findEntryItemById(long id) {
        EntryItem entryItem = entryItemMapper.selectByPrimaryKey(id);
        return entryItem;
    }

    @Override
    public List<EntryItem> findAllEntryItem() {
        EntryItemExample entryItemExample=new EntryItemExample();
        entryItemExample.createCriteria()
                .getAllCriteria();
        List<EntryItem> entryItems = entryItemMapper.selectByExample(entryItemExample);
        return entryItems;
    }

    @Override
    public List<EntryItem> findEntryByUserId(long userId) {
        EntryItemExample entryItemExample=new EntryItemExample();
        entryItemExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<EntryItem> entryItems = entryItemMapper.selectByExample(entryItemExample);
        return entryItems;
    }
}
