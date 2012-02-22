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
package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

import com.amazonaws.services.simpleworkflow.flow.DecisionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.DynamicActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.DynamicActivitiesClientImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class PeriodicWorkflowImpl implements PeriodicWorkflow {

    private static final int SECOND = 1000;

    /**
     * This is needed to keep the decider logic deterministic as using
     * System.currentTimeMillis() in your decider logic is not.
     * WorkflowClock.currentTimeMillis() should be used instead.
     */
    private final WorkflowClock clock;

    private final DynamicActivitiesClient activities;

    private final ErrorReportingActivitiesClient errorReporting;

    /**
     * Used to create new run of the periodic workflow to reset history. This
     * allows "infinite" workflows.
     */
    private final PeriodicWorkflowSelfClient selfClient;

    private ActivityType activityType;

    private PeriodicWorkflowOptions options;

    private Object[] activityArguments;

    public PeriodicWorkflowImpl() {
        DecisionContextProvider contextProvider = new DecisionContextProviderImpl();
        clock = contextProvider.getDecisionContext().getWorkflowClock();
        activities = new DynamicActivitiesClientImpl();
        errorReporting = new ErrorReportingActivitiesClientImpl();
        selfClient = new PeriodicWorkflowSelfClientImpl();
    }

    /**
     * Constructor used for unit testing or configuration through IOC container
     */
    public PeriodicWorkflowImpl(WorkflowClock clock, DynamicActivitiesClient activities,
            ErrorReportingActivitiesClient errorReporting, PeriodicWorkflowSelfClient selfClient) {
        this.clock = clock;
        this.activities = activities;
        this.errorReporting = errorReporting;
        this.selfClient = selfClient;
    }

    @Override
    public void startPeriodicWorkflow(final ActivityType activity, final Object[] activityArguments,
            final PeriodicWorkflowOptions options) {
        final long startTime = clock.currentTimeMillis();
        this.activityType = activity;
        this.activityArguments = activityArguments;
        this.options = options;

        // Use TryCatch to ensure that workflow is not going to fail as it causes new run not being created
        new TryCatchFinally() {

            @Override
            protected void doTry() throws Throwable {
                long startTime = clock.currentTimeMillis();
                callPeriodicActivity(startTime, Promise.Void(), Promise.Void());
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                errorReporting.reportFailure(e);
            }

            @Override
            protected void doFinally() throws Throwable {
                long secondsLeft = options.getCompleteAfterSeconds() - (clock.currentTimeMillis() - startTime) / SECOND;
                PeriodicWorkflowOptions nextRunOptions = new PeriodicWorkflowOptions();
                nextRunOptions.setCompleteAfterSeconds(secondsLeft);
                nextRunOptions.setContinueAsNewAfterSeconds(options.getContinueAsNewAfterSeconds());
                nextRunOptions.setExecutionPeriodSeconds(options.getExecutionPeriodSeconds());
                nextRunOptions.setWaitForActivityCompletion(options.isWaitForActivityCompletion());
                options.setCompleteAfterSeconds(secondsLeft);
                if (secondsLeft > 0) {
                    // Request new run of the current workflow instance.
                    selfClient.startPeriodicWorkflow(activity, activityArguments, nextRunOptions);
                }
            }
        };
    }

    @Asynchronous
    public void callPeriodicActivity(long startTime, Promise<?>... waitFor) {
        long currentTime = clock.currentTimeMillis();
        if ((currentTime - startTime) < options.getContinueAsNewAfterSeconds() * SECOND) {
            
            // Call activity using dynamic client. Return type is specified as Void as it is not used, but activity that 
            // returns some other type can be called this way.
            Promise<Void> activityCompletion = activities.scheduleActivity(activityType, activityArguments, null, Void.class);
            
            if (!options.isWaitForActivityCompletion()) {
                // Promise.Void() returns already ready promise of type Void
                activityCompletion = Promise.Void();
            }
            // Create a timer to re-run your periodic activity after activity completion, 
            // but not earlier then after delay of executionPeriodSeconds.
            // However in real cron workflows, delay should be calculated everytime to run activity at 
            // a predefined time.
            Promise<Void> timer = clock.createTimer(options.getExecutionPeriodSeconds());

            callPeriodicActivity(startTime, timer, activityCompletion);
        }
    }

}