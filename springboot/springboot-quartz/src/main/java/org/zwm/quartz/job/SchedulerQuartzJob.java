package org.zwm.quartz.job;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 自定义任务
 *
 * @author zwmfi
 */
public class SchedulerQuartzJob implements Job {

    private void before() {
        System.out.println("任务开始执行");
    }

    @Override
    public void execute(JobExecutionContext context) {
        /*获取传递过来的参数*/
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        System.out.println(jobDataMap.get("user"));
        System.out.println("每5s打印一次");
    }

    private void after() {
        System.out.println("任务执行结束");
    }
}
