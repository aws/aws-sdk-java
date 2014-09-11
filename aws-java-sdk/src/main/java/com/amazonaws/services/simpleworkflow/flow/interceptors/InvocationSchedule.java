package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.Date;

import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;

/**
 * Encapsulates an invocation schedule.
 * 
 * @see AsyncScheduledExecutor
 * @see ScheduleDecorator
 * @author fateev
 */
public interface InvocationSchedule {

    /**
     * Return interval until the next invocation.
     * 
     * @param currentTime
     *            - current workflow time
     * @param startTime
     *            - time when workflow started
     * @param lastInvocationTime
     *            - time when last invocation happened
     * @param pastInvocatonsCount
     *            - how many invocations were done
     * @return time in seconds until the next invocation.
     *         {@link FlowConstants#NONE} if no more invocations should be
     *         scheduled.
     */
    long nextInvocationDelaySeconds(Date currentTime, Date startTime, Date lastInvocationTime, int pastInvocatonsCount);

}
