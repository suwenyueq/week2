package com.suwenyue.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.suwenyue.domain.Column;
import com.suwenyue.vo.ColumnVO;

/**
 * @author 苏文越
 *
 * 2020年1月6日
 */

public interface ColumnService {

	void adds(List<Column> cList);

	PageInfo<Column> selects(Column column, ColumnVO vo);
	
}
