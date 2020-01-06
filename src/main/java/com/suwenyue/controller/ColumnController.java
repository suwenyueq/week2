package com.suwenyue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suwenyue.domain.Column;
import com.suwenyue.service.ColumnService;
import com.suwenyue.vo.ColumnVO;

/**
 * @author 苏文越
 *
 * 2020年1月6日
 */
@Controller
public class ColumnController {
	@Autowired
	private ColumnService columnService;
	@RequestMapping("clist")
	public String list(@RequestParam(defaultValue = "1") int page,Column column,ColumnVO vo,Model model){
		PageHelper.startPage(page,10);
		PageInfo<Column> info =columnService.selects(column,vo);
		model.addAttribute("info", info);
		model.addAttribute("column", column);
		model.addAttribute("vo", vo);
		return "clist";
	}
}
