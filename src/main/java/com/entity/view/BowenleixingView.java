package com.entity.view;

import com.entity.BowenleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博文类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 09:50:11
 */
@TableName("bowenleixing")
public class BowenleixingView  extends BowenleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BowenleixingView(){
	}
 
 	public BowenleixingView(BowenleixingEntity bowenleixingEntity){
 	try {
			BeanUtils.copyProperties(this, bowenleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
