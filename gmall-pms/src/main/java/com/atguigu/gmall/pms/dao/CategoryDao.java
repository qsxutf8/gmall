package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sxm
 * @email qinlogin@163.com
 * @date 2020-02-08 11:39:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
