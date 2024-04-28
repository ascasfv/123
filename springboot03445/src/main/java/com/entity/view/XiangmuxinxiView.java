package com.entity.view;

import com.entity.XiangmuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目信息
 */
@TableName("xiangmuxinxi")
public class XiangmuxinxiView  extends XiangmuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmuxinxiView(){
	}
 
 	public XiangmuxinxiView(XiangmuxinxiEntity xiangmuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
