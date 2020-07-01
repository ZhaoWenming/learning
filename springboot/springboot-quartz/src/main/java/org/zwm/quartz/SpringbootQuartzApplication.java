package org.zwm.quartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuartzApplication.class, args);
        log.info("{}springboot quartz startup success{}", "=======", "=======");

    }

}
