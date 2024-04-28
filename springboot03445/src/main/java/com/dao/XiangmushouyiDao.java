package com.dao;

import com.entity.XiangmushouyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmushouyiVO;
import com.entity.view.XiangmushouyiView;


/**
 * 项目收益
 */
public interface XiangmushouyiDao extends BaseMapper<XiangmushouyiEntity> {
	
	List<XiangmushouyiVO> selectListVO(@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);
	
	XiangmushouyiVO selectVO(@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);
	
	List<XiangmushouyiView> selectListView(@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);

	List<XiangmushouyiView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);
	
	XiangmushouyiView selectView(@Param("ew") Wrapper<XiangmushouyiEntity> wrapper);
	
}
