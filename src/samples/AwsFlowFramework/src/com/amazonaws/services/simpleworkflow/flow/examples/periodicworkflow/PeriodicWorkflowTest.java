/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContext;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.core.TryFinally;
import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

//Have to use Flow JUnit runner if timeout is specified on any @Test
//annotation.
@RunWith(FlowBlockJUnit4ClassRunner.class)
public class PeriodicWorkflowTest {

	private final class TestPeriodicWorkflowActivities implements
			PeriodicWorkflowActivities {

		private final ActivityExecutionContextProvider contextProvider = new ActivityExecutionContextProviderImpl();

		private int workCount;

		private int currentRunWorkCount;

		private String runId;

		@Override
		public void doSomeWork(String parameter) {
			// Reset counter on the new run which changes when workflow
			// continues as new
			ActivityExecutionContext activityExecutionContext = contextProvider
					.getActivityExecutionContext();
			WorkflowExecution workflowExecution = activityExecutionContext
					.getWorkflowExecution();
			String runId = workflowExecution.getRunId();
			if (this.runId != null && !runId.equals(this.runId)) {
				currentRunWorkCount = 0;
			}
			this.runId = runId;
			workCount++;
			currentRunWorkCount++;
		}

		public int getWorkCount() {
			return workCount;
		}

		public int getCurrentRunWorkCount() {
			return currentRunWorkCount;
		}
	}

	private final class TestErrorReportingActivities implements
			ErrorReportingActivities {

		private Throwable failure;

		@Override
		public void reportFailure(Throwable e) {
			failure = e;
		}

		public Throwable getFailure() {
			return failure;
		}
	}

	@Rule
	public WorkflowTest workflowTest = new WorkflowTest();

	private PeriodicWorkflowClientFactory workflowClientFactory = new PeriodicWorkflowClientFactoryImpl();

	private TestPeriodicWorkflowActivities periodicActivitiesImplementation;

	private TestErrorReportingActivities errorReportingActivitiesImplementation;

	@Before
	public void setUp() throws Exception {
		periodicActivitiesImplementation = new TestPeriodicWorkflowActivities();
		workflowTest
				.addActivitiesImplementation(periodicActivitiesImplementation);
		errorReportingActivitiesImplementation = new TestErrorReportingActivities();
		workflowTest
				.addActivitiesImplementation(errorReportingActivitiesImplementation);
		workflowTest.addWorkflowImplementationType(PeriodicWorkflowImpl.class);
		workflowTest.setDisableOutstandingTasksCheck(true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 2000)
	public void testPeriodic() {
		workflowTest.setClockAccelerationCoefficient(100);
		workflowTest.setDisableOutstandingTasksCheck(true);
		final PeriodicWorkflowClient workflow = workflowClientFactory
				.getClient();

		final PeriodicWorkflowOptions options = new PeriodicWorkflowOptions();
		options.setExecutionPeriodSeconds(10);
		options.setContinueAsNewAfterSeconds(30);
		options.setCompleteAfterSeconds(120);
		options.setWaitForActivityCompletion(true);

		final ActivityType activityType = new ActivityType();
		activityType.setName("PeriodicWorkflowActivities.doSomeWork");
		activityType.setVersion("1.0");
		final Object[] parameters = new Object[] { "parameter1" };

		new TryFinally() {

			@Override
			protected void doTry() throws Throwable {
				workflow.startPeriodicWorkflow(activityType, parameters,
						options);
			}

			@Override
			protected void doFinally() throws Throwable {
				Assert.assertEquals(120 / 10,
						periodicActivitiesImplementation.getWorkCount());
				Assert.assertEquals(30 / 10, periodicActivitiesImplementation
						.getCurrentRunWorkCount());
				Assert.assertNull(errorReportingActivitiesImplementation
						.getFailure());
			}
		};
	}

}
