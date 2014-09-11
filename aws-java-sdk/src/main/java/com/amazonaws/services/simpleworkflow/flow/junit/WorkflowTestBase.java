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
package com.amazonaws.services.simpleworkflow.flow.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.AsyncScope;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.junit.spring.FlowSpringJUnit4ClassRunner;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.test.TestWorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.worker.CurrentDecisionContext;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public abstract class WorkflowTestBase implements MethodRule {

    protected String defaultActivitiesTaskListToPoll = "TestTaskList";

    boolean disableOutstandingTasksCheck;

    protected DecisionContext decisionContext;

    protected TestWorkflowContext workflowContext;

    protected TestWorkflowClock workflowClock;

    AsyncScope scope;

    List<Settable<Void>> waits = new ArrayList<Settable<Void>>();

    double clockAcceleration = 1.0;

    boolean flowTestRunner;
    
    private long testTimeoutActualTimeMilliseconds;

    private WorkflowTestStatement workflowTestStatement;

    private Class<? extends Throwable> expectedException;

    public WorkflowTestBase(DecisionContext decisionContext) {
        this.decisionContext = decisionContext;
        workflowContext = (TestWorkflowContext) decisionContext.getWorkflowContext();
        workflowClock = (TestWorkflowClock) decisionContext.getWorkflowClock();
        WorkflowExecution we = new WorkflowExecution();
        we.setWorkflowId("testWorkflowId");
        we.setRunId("testRunId");
        workflowContext.setWorkflowExecution(we);
        WorkflowType wt = new WorkflowType();
        wt.setName("testWorkflow");
        wt.setVersion("0.0");
        workflowContext.setWorkflowType(wt);
    }

    public boolean isDisableOutstandingTasksCheck() {
        return disableOutstandingTasksCheck;
    }

    /**
     * When set to <code>true</code> it is considered a test failure to have
     * outstanding tasks that are blocked on non external events or timers. Such
     * blockage is usually indicates a bug that can lead to a workflow
     * "getting stuck". Default is <code>true</code>.
     */
    public void setDisableOutstandingTasksCheck(boolean disableOutstandingTasksCheck) {
        this.disableOutstandingTasksCheck = disableOutstandingTasksCheck;
    }

    public DecisionContext getDecisionContext() {
        return decisionContext;
    }

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        workflowContext.setWorkflowExecution(workflowExecution);
    }

    public void setWorkflowType(WorkflowType workflowType) {
        workflowContext.setWorkflowType(workflowType);
    }

    public WorkflowExecution getWorkflowExecution() {
        return workflowContext.getWorkflowExecution();
    }

    public WorkflowType getWorkflowType() {
        return workflowContext.getWorkflowType();
    }

    public String getDefaultActivitiesTaskListToPoll() {
        return defaultActivitiesTaskListToPoll;
    }

    public void setDefaultActivitiesTaskListToPoll(String defaultActivitiesTaskListToPoll) {
        this.defaultActivitiesTaskListToPoll = defaultActivitiesTaskListToPoll;
    }

    public double getClockAcceleration() {
        return clockAcceleration;
    }

    /**
     * Accelerate workflow clock according the coefficient. Note that the clock
     * acceleration affects time returned by {@link WorkflowClock} and timers
     * firing only. The default is 1.0 (no acceleration).
     * 
     * @param clockAcceleration
     *            value that is larger then 1.0
     */
    public void setClockAccelerationCoefficient(double clockAcceleration) {
        if (clockAcceleration < 1.0) {
            throw new IllegalArgumentException("clock acceleration less then 1: " + clockAcceleration);
        }
        this.clockAcceleration = clockAcceleration;
    }

    @Override
    public Statement apply(final Statement base, FrameworkMethod method, Object target) {
        Callable<WorkflowTestBase> accessor = new Callable<WorkflowTestBase>() {

            @Override
            public WorkflowTestBase call() throws Exception {
                return WorkflowTestBase.this;
            }
        };
        workflowTestStatement = new WorkflowTestStatement(accessor, base, testTimeoutActualTimeMilliseconds, expectedException);
        workflowTestStatement.setFlowTestRunner(flowTestRunner);
        return workflowTestStatement;
    }

    /**
     * Here blocked means that there are no any tasks that are ready to be
     * executed. Usually these tasks wait for timers or some other external
     * events.
     * 
     * @return Promise that becomes ready when there are not tasks to execute
     */
    public Promise<Void> waitBlocked(Promise<?>... waitFor) {
        if (scope == null) {
            throw new IllegalArgumentException("Called outside of test method");
        }
        final Settable<Void> result = new Settable<Void>();
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                waits.add(result);
            }

        };
        return result;
    }

    public void setClockCurrentTimeMillis(long timeMillis) {
        workflowClock.setCurrentTimeMillis(timeMillis);
    }

    public void clockAdvanceSeconds(final long seconds) {
        workflowClock.advanceSeconds(seconds);
    }

    public void clockAdvanceSeconds(final long seconds, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                workflowClock.advanceSeconds(seconds);
            }
        };
    }

    protected void beforeEvaluate(DecisionContext decisionContext) {
        CurrentDecisionContext.set(decisionContext);
    }

    protected void afterEvaluate() {
        CurrentDecisionContext.unset();
    }

    /**
     * Test timeout time. Uses real clock that ignores acceleration (see
     * {@link #setClockAccelerationCoefficient(double)}). Instead of calling
     * this method consider using {@link FlowBlockJUnit4ClassRunner} or
     * {@link FlowSpringJUnit4ClassRunner} and timeout parameter of @Test
     * annotation.
     * 
     * @param timeout
     *            time in milliseconds.
     */
    public void setTestTimeoutActualTimeMilliseconds(long timeout) {
        this.testTimeoutActualTimeMilliseconds = timeout;
        if (workflowTestStatement != null) {
            workflowTestStatement.setTestTimeoutActualTimeMilliseconds(timeout);
        }
    }

    public void setExpectedException(Class<? extends Throwable> expectedException) {
        this.expectedException = expectedException;
        if (workflowTestStatement != null) {
            workflowTestStatement.setExpectedException(expectedException);
        }
    }
    
    public void setFlowTestRunner(boolean flowTestRunner) {
        this.flowTestRunner = flowTestRunner;
        if (workflowTestStatement != null) {
            workflowTestStatement.setFlowTestRunner(flowTestRunner);
        }
    }
    
}
