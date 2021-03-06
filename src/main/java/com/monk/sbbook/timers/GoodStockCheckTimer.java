package com.monk.sbbook.timers;

import com.monk.sbbook.entity.JobInfo;
import com.monk.sbbook.service.JobService;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.List;

/**
 * 商品库存检查定时任务
 */
public class GoodStockCheckTimer
    extends QuartzJobBean
{

    /**
     * logback
     */
    private Logger logger = LoggerFactory.getLogger(GoodStockCheckTimer.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("分布式节点quartz-cluster-node-first，执行库存检查定时任务，执行时间：{}",new Date());

//        获取job详情
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
//        获取job名称
        String jobName = jobDetail.getClass().getName();
        logger.info("Job Name: " + jobName);

//        获取job类
        logger.info("Job Class: " + jobDetail.getJobClass());
//        job开始时间
        logger.info(jobName + " fired at " + jobExecutionContext.getFireTime());
//        job下次触发时间
        logger.info(jobName + " triggle at " + jobExecutionContext.getNextFireTime());

    }

}
