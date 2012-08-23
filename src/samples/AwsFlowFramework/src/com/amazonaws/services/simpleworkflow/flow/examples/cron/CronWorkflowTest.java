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
package com.amazonaws.services.simpleworkflow.flow.examples.cron;

import java.util.concurrent.CancellationException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContext;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;
import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

@RunWith(FlowBlockJUnit4ClassRunner.class)
public class CronWorkflowTest {

    private static final int SECONDS_HOUR = 3600;

    private final class TestCronWorkflowActivities implements CronExampleActivities {

        private final ActivityExecutionContextProvider contextProvider = new ActivityExecutionContextProviderImpl();

        private int workCount;

        private int runCount;

        private String runId;

        @Override
        public void doSomeWork(String parameter) {
            // Reset counter on the new run which changes when workflow continues as new
            ActivityExecutionContext activityExecutionContext = contextProvider.getActivityExecutionContext();
            WorkflowExecution workflowExecution = activityExecutionContext.getWorkflowExecution();
            String runId = workflowExecution.getRunId();
            if (this.runId == null || !runId.equals(this.runId)) {
                runCount++;
            }
            this.runId = runId;
            workCount++;
        }

        public int getWorkCount() {
            return workCount;
        }

        public int getRunCount() {
            return runCount;
        }
    }

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    private CronWorkflowClientFactory workflowClientFactory = new CronWorkflowClientFactoryImpl();

    private TestCronWorkflowActivities cronActivitiesImplementation;

    @Before
    public void setUp() throws Exception {
        cronActivitiesImplementation = new TestCronWorkflowActivities();
        workflowTest.addActivitiesImplementation(cronActivitiesImplementation);
        workflowTest.addWorkflowImplementationType(CronWorkflowImpl.class);
        workflowTest.setDisableOutstandingTasksCheck(true);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 2000)
    public void testCron() {
        workflowTest.setClockAccelerationCoefficient(SECONDS_HOUR * 24 * 7 * 2);
        final CronWorkflowClient workflow = workflowClientFactory.getClient();

        final ActivityType activityType = new ActivityType();
        activityType.setName("CronExampleActivities.doSomeWork");
        activityType.setVersion("1.0");
        final Object[] activityArguments = new Object[] { "parameter1" };

        final CronWorkflowOptions cronOptions = new CronWorkflowOptions();
        cronOptions.setActivity(activityType);
        cronOptions.setActivityArguments(activityArguments);
        cronOptions.setContinueAsNewAfterSeconds(SECONDS_HOUR * 24 + 300);
        cronOptions.setTimeZone("PST");
        final String cronExpression = "0 0 * * * *";
        cronOptions.setCronExpression(cronExpression);

        WorkflowClock clock = workflowTest.getDecisionContext().getWorkflowClock();
        clock.createTimer(SECONDS_HOUR * 24 * 7 + 1000);
        // true constructor argument makes TryCatchFinally a daemon which causes it get cancelled after above timer firing
        new TryCatchFinally(true) {

            Throwable failure;

            @Override
            protected void doTry() throws Throwable {
                workflow.startCron(cronOptions);
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                failure = e;
                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                // Skip assertions as their failure masks original exception
                if (failure == null || failure instanceof CancellationException) {
                    Assert.assertEquals(24 * 7, cronActivitiesImplementation.getWorkCount());
                    Assert.assertEquals(7, cronActivitiesImplementation.getRunCount());
                }
            }

        };
    }

}
