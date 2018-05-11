package com.monk.sbbook.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.monk.sbbook.dao.JobAndTriggerMapper;
import com.monk.sbbook.entity.JobAndTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobAndTriggerImpl implements IJobAndTriggerService{

	@Autowired
	private JobAndTriggerMapper jobAndTriggerMapper;
	
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
//		List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
//		PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
		PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>();
		return page;
	}

}