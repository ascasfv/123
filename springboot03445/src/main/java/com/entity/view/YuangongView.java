package com.entity.view;

import com.entity.YuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工
 */
@TableName("yuangong")
public class YuangongView  extends YuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongView(){
	}
 
 	public YuangongView(YuangongEntity yuangongEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
