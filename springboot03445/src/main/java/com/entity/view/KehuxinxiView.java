package com.entity.view;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客户信息
 * 后端返回视图实体辅助类
 */
@TableName("kehuxinxi")
public class KehuxinxiView  extends KehuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KehuxinxiView(){
	}
 
 	public KehuxinxiView(KehuxinxiEntity kehuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kehuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
