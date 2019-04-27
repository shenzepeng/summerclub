package com.example.summerclub.service;

import com.example.summerclub.pojo.EntryItem;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:25
 * @Description: SualLabel, Write down some description!!!
 */
public interface EntryItemService {
    //添加entryItem
    void insertEntryItem(EntryItem entryItem);
    //通过id删除entryItem
    void deleteEntryItemById(long id);
    //通过主键id更新entryItem，更新值不为null的字段
    void updateEntryItemById(EntryItem entryItem);
    //通过id找到EntryItem
    EntryItem findEntryItemById(long id);
    //显示所有entryItem
    List<EntryItem> findAllEntryItem();
    //通过userId找到EntryItem
    List<EntryItem> findEntryByUserId(long userId);
}
