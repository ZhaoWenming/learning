package org.zwm.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.zwm.quartz.job.SchedulerQuartzJob;

@SpringBootApplication
@Slf4j
public class SpringbootQuartzApplication {

    public static void main(String[] args) throws SchedulerException {
        SpringApplication.run(SpringbootQuartzApplication.class, args);
        log.info("{}springboot quartz startup success{}", "=======", "=======");

        /*创建jobDetail，绑定具体要执行的job，设置属性*/
        JobDetail jobDetail = JobBuilder.newJob(SchedulerQuartzJob.class)
                .withIdentity("name", "group")
                .build();
        jobDetail.getJobDataMap().put("user", "Tom");

        /*cron表达式构造器*/
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");

        /*触发器*/
        CronTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("name", "group")
                .withSchedule(cronScheduleBuilder)
                .forJob(jobDetail)
                .build();

        /*调度器*/
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        /*绑定job和trigger*/
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }
}
