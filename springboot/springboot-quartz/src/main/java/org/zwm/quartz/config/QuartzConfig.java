package org.zwm.quartz.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Configuration;
import org.zwm.quartz.job.TestJob;

/**
 * quartz配置文件
 *
 * @author zwmfi
 */
@Configuration
public class QuartzConfig {

    public JobDetail getDetail(){
    JobDetail jobDetail = JobBuilder.newJob(TestJob.class).
    }
}
