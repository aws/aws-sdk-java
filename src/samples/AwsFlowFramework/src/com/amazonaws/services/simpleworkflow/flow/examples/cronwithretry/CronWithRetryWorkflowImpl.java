/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.DynamicActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.DynamicActivitiesClientImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;
import com.amazonaws.services.simpleworkflow.flow.interceptors.AsyncRetryingExecutor;
import com.amazonaws.services.simpleworkflow.flow.interceptors.AsyncRunnable;
import com.amazonaws.services.simpleworkflow.flow.interceptors.AsyncScheduledExecutor;
import com.amazonaws.services.simpleworkflow.flow.interceptors.ExponentialRetryPolicy;
import com.amazonaws.services.simpleworkflow.flow.spring.CronInvocationSchedule;

/**
 * Demonstrates how to create workflow that executes an activity on schedule
 * specified as a "cron" string. Activity name and version are passed as input
 * arguments of the workflow. In case of activity failures it is retried
 * according to retry options passed as arguments of the workflow.
 * 
 * @author fateev
 */
public class CronWithRetryWorkflowImpl implements CronWithRetryWorkflow {

    private static final int SECOND = 1000;

    /**
     * This is needed to keep the decider logic deterministic as using
     * System.currentTimeMillis() in your decider logic is not.
     * WorkflowClock.currentTimeMillis() should be used instead.
     */
    private final WorkflowClock clock;

    private final DynamicActivitiesClient activities;

    /**
     * Used to create new run of the Cron workflow to reset history. This allows
     * "infinite" workflows.
     */
    private final CronWithRetryWorkflowSelfClient selfClient;

    private final StringBuilder invocationHistory = new StringBuilder();

    private TimeZone tz;

    public CronWithRetryWorkflowImpl() {
        this(new DecisionContextProviderImpl().getDecisionContext().getWorkflowClock(), new DynamicActivitiesClientImpl(),
                new CronWithRetryWorkflowSelfClientImpl());
    }

    /**
     * Constructor used for unit testing or configuration through IOC container
     */
    public CronWithRetryWorkflowImpl(WorkflowClock clock, DynamicActivitiesClient activities,
            CronWithRetryWorkflowSelfClient selfClient) {
        this.clock = clock;
        this.activities = activities;
        this.selfClient = selfClient;
    }

    @Override
    public void startCron(final CronWithRetryWorkflowOptions options) {
        Date expiration = new Date(clock.currentTimeMillis() + options.getContinueAsNewAfterSeconds() * SECOND);
        tz = TimeZone.getTimeZone(options.getTimeZone());

        // Activities client could be decorated directly using CronDecorator and RetryDecorator.
        // But executors are used instead to enable updates to invocationHistory.
        CronInvocationSchedule cronSchedule = new CronInvocationSchedule(options.getCronExpression(), expiration, tz);
        AsyncScheduledExecutor scheduledExecutor = new AsyncScheduledExecutor(cronSchedule, clock);
        ExponentialRetryPolicy retryPolicy = createRetryPolicyFromOptions(options);
        final AsyncRetryingExecutor retryExecutor = new AsyncRetryingExecutor(retryPolicy, clock);

        scheduledExecutor.execute(new AsyncRunnable() {

            @Override
            public void run() throws Throwable {
                retryExecutor.execute(new AsyncRunnable() {

                    @Override
                    public void run() throws Throwable {
                        executeActivityUpdatingInvocationHistory(options);
                    }
                });
            }
        });

        // Start new workflow run as soon as cron decorator exits due to expiration.
        // The call to self client indicates the desire to start the new run.
        // It is started only after all other tasks in the given run are completed.
        selfClient.startCron(options);
    }

    @Override
    public String getInvocationHistory() {
        return invocationHistory.toString();
    }

    private void appendToInvocationHistory(String entry) {
        if (invocationHistory.length() > 0) {
            invocationHistory.append('\n');
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(tz);
        invocationHistory.append(dateFormat.format(new Date(clock.currentTimeMillis())));
        invocationHistory.append(" ");
        invocationHistory.append(entry);
    }

    private void executeActivityUpdatingInvocationHistory(final CronWithRetryWorkflowOptions options) {
        new TryCatchFinally() {

            boolean failed;

            @Override
            protected void doTry() throws Throwable {
                appendToInvocationHistory("starting");
                activities.scheduleActivity(options.getActivity(), options.getActivityArguments(), null, Void.class);
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                failed = true;
                appendToInvocationHistory("failure:" + e.getMessage());
                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                if (!failed) {
                    appendToInvocationHistory("completed");
                }
            }
        };
    }

    @SuppressWarnings("unchecked")
    private ExponentialRetryPolicy createRetryPolicyFromOptions(CronWithRetryWorkflowOptions options) {
        ExponentialRetryPolicy retryPolicy = new ExponentialRetryPolicy(options.getInitialRetryIntervalSeconds());
        retryPolicy.setBackoffCoefficient(options.getBackoffCoefficient());
        try {
            List<String> exceptionsToRetryClasses = options.getExceptionsToRetry();
            if (exceptionsToRetryClasses != null) {
                List<Class<? extends Throwable>> exceptionsToRetry = new ArrayList<Class<? extends Throwable>>();
                for (String exceptionType : exceptionsToRetryClasses) {
                    exceptionsToRetry.add((Class<? extends Throwable>) Class.forName(exceptionType));
                }
                retryPolicy.setExceptionsToRetry(exceptionsToRetry);
            }
            List<String> exceptionsToExcludeClasses = options.getExceptionsToExclude();
            if (exceptionsToExcludeClasses != null) {
                List<Class<? extends Throwable>> exceptionsToExclude = new ArrayList<Class<? extends Throwable>>();
                for (String exceptionType : exceptionsToExcludeClasses) {
                    exceptionsToExclude.add((Class<? extends Throwable>) Class.forName(exceptionType));
                }
                retryPolicy.setExceptionsToExclude(exceptionsToExclude);
            }
        }
        catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid options: " + options, e);
        }
        retryPolicy.setMaximumAttempts(options.getMaximumAttempts());
        retryPolicy.setMaximumRetryIntervalSeconds(options.getMaximumRetryIntervalSeconds());
        retryPolicy.setRetryExpirationIntervalSeconds(options.getRetryExpirationIntervalSeconds());
        return retryPolicy;
    }
}
