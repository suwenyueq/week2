package com.suwenyue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.suwenyue.dao.ColumnMapper;
import com.suwenyue.domain.Column;
import com.suwenyue.service.ColumnService;
import com.suwenyue.vo.ColumnVO;

/**
 * @author 苏文越
 *
 * 2020年1月6日
 */
@Service
public class ColumnServiceImpl implements ColumnService{
	@Autowired
	private ColumnMapper columnMapper;

	public void adds(List<Column> cList) {
		columnMapper.adds(cList);
		
	}

	public PageInfo<Column> selects(Column column, ColumnVO vo) {
		// TODO Auto-generated method stub
		List<Column> selects = columnMapper.selects(column,vo);
		return new PageInfo<Column>(selects);
	}
	
}
