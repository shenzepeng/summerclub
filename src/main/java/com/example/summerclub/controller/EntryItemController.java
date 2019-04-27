package com.example.summerclub.controller;

import com.example.summerclub.pojo.EntryItem;
import com.example.summerclub.service.EntryItemService;
import com.example.summerclub.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 01:01
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class EntryItemController {
    @Autowired
    private EntryItemService entryItemService;
    //添加entryItem
    @ApiOperation("添加entryItem")
    @PostMapping("/insertEntryItem.action")
    public SzpJsonResult insertEntryItem(@RequestBody EntryItem entryItem, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        entryItemService.insertEntryItem(entryItem);
        return SzpJsonResult.ok();
    }
    //通过id删除entryItem
    @ApiOperation("通过id删除entryItem")
    @DeleteMapping("/deleteEntryItemById.action")
    public SzpJsonResult deleteEntryItemById(@RequestBody long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        entryItemService.deleteEntryItemById(id);
        return SzpJsonResult.ok();
    }
    //通过主键id更新entryItem，更新值不为null的字段
    @ApiOperation("通过主键id更新entryItem，更新值不为null的字段")
    @PutMapping("/updateEntryItemById.action")
    public SzpJsonResult updateEntryItemById(@RequestBody EntryItem entryItem, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        entryItemService.updateEntryItemById(entryItem);
        return SzpJsonResult.ok();
    }
    //通过id找到EntryItem
    @ApiOperation("通过id找到EntryItem")
    @GetMapping("/findEntryItemById.action")
    public SzpJsonResult findEntryItemById(long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        EntryItem entryItemById = entryItemService.findEntryItemById(id);
        return SzpJsonResult.ok(entryItemById);
    }
    //显示所有entryItem
    @ApiOperation("显示所有entryItem")
    @GetMapping("/findAllEntryItem.action")
    public SzpJsonResult findAllEntryItem( HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<EntryItem> allEntryItem = entryItemService.findAllEntryItem();
        return SzpJsonResult.ok(allEntryItem);
    }
    //通过userId找到EntryItem
    @ApiOperation("通过userId找到EntryItem")
    @GetMapping("/findEntryByUserId.action")
    public SzpJsonResult findEntryByUserId(long userId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<EntryItem> entryByUserId = entryItemService.findEntryByUserId(userId);
        return SzpJsonResult.ok(entryByUserId);
    }
}
