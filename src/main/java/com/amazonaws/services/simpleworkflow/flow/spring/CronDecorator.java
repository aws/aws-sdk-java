package com.amazonaws.services.simpleworkflow.flow.spring;

import java.util.Date;
import java.util.TimeZone;

import org.springframework.scheduling.support.CronSequenceGenerator;

import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.interceptors.ScheduleDecorator;

/**
 * Repeats any call to the decorated object according to a schedule specified using unix "cron" syntax.
 * Relies on {@link CronSequenceGenerator} for cron parsing and interpretation.
 * 
 * @author fateev
 */
public class CronDecorator extends ScheduleDecorator {

    public CronDecorator(String cronExpression, Date expiration, TimeZone timeZone, WorkflowClock clock) {
        super(new CronInvocationSchedule(cronExpression, expiration, timeZone), clock);
    }
    
}
