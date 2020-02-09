package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sxm
 * @email qinlogin@163.com
 * @date 2020-02-09 12:04:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
