package com.entity.view;

import com.entity.XiangmushouyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目收益
 */
@TableName("xiangmushouyi")
public class XiangmushouyiView  extends XiangmushouyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmushouyiView(){
	}
 
 	public XiangmushouyiView(XiangmushouyiEntity xiangmushouyiEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmushouyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
