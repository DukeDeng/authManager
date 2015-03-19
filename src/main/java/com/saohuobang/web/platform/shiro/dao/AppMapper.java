package com.saohuobang.web.platform.shiro.dao;

import java.util.List;

import com.saohuobang.web.platform.shiro.entity.App;
import com.saohuobang.web.platform.utils.Page;

public interface AppMapper {
    int deleteByPrimaryKey(Long id);

    int insert(App record);

    int insertSelective(App record);

    App selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);
    
    List<App> selectAll();
    
    List<App> selectPage(Page<App> p);
    
    Long selectAppIdByAppKey(String appKey);
}