package com.potatosaucevfx.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Richard Nader <richard.nader@fynydd.com>
 * SRC: https://spring.io/guides/gs/scheduling-tasks/
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    // Timer for next invocation starts when the last one started.
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTimeRate() {
        log.info("The time is now {}", DATE_FORMAT.format(new Date()));
    }

    // Timer for next invocation starts when the last one ends.
    @Scheduled(fixedDelay = 1000)
    public void reportCurrentTimeDelay() {
        log.info("The time is now {}", DATE_FORMAT.format(new Date()));
    }

    // Scheduled by cron
    @Scheduled(cron = "*/10 * * * * *")
    public void yellEveryTenSeconds() {
        log.info("I'M YELLING BECAUSE IT'S BEEN 10 SECONDS!");
    }
}
