package com.entity.view;

import com.entity.XingyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品名称
 */
@TableName("xingyeleixing")
public class XingyeleixingView  extends XingyeleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XingyeleixingView(){
	}
 
 	public XingyeleixingView(XingyeleixingEntity xingyeleixingEntity){
 	try {
			BeanUtils.copyProperties(this, xingyeleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
