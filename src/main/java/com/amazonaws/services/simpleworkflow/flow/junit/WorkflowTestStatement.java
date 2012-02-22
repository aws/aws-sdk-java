package com.amazonaws.services.simpleworkflow.flow.junit;

import java.util.concurrent.Callable;

import org.junit.runners.model.Statement;

import com.amazonaws.services.simpleworkflow.flow.core.AsyncScope;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

public class WorkflowTestStatement extends Statement {

    private final Callable<WorkflowTestBase> workflowTestAccessor;

    private final Statement base;

    private Long timeout;

    boolean completed;

    private Throwable failure;

    boolean waitingOnTimer;

    private Class<? extends Throwable> expectedException;

    private boolean flowTestRunner;

    public WorkflowTestStatement(Callable<WorkflowTestBase> workflowTestAccessor, Statement base, Long timeout,
            Class<? extends Throwable> expectedException) {
        this.workflowTestAccessor = workflowTestAccessor;
        this.base = base;
        this.timeout = timeout;
        this.expectedException = expectedException;
    }

    @Override
    public void evaluate() throws Throwable {
        if (!flowTestRunner) {
            throw new IllegalStateException(
                    "WorkflowTest rule can be used only with flow specific test runners: FlowBlockJUnit4ClassRunner and FlowSpringJUnit4ClassRunner");
        }
        final WorkflowTestBase workflowTest = workflowTestAccessor.call();
        Thread t = null;
        if (timeout == null || timeout == 0) {
            try {
                asyncEvaluate(workflowTest);
                completed = true;
            }
            catch (Throwable e) {
                failure = e;
            }
        }
        else {
            t = new Thread() {

                public void run() {
                    try {
                        asyncEvaluate(workflowTest);
                        completed = true;
                    }
                    catch (Throwable e) {
                        failure = e;
                    }
                }
            };
            t.start();
            t.join(timeout);
        }
        if (failure != null) {
            if (expectedException != null && expectedException.isAssignableFrom(failure.getClass())) {
                return;
            }
            throw failure;
        }
        if (!completed) {
            if (waitingOnTimer) {
                AssertionError e = new AssertionError("Test timed out after " + timeout
                        + " milliseconds. The following asynchrous tasks are outstanding: \n"
                        + workflowTest.scope.getAsynchronousThreadDumpAsString());
                throw e;
            }
            else {
                AssertionError e = new AssertionError("Test timed out after " + timeout + " milliseconds");
                if (t != null) {
                    e.setStackTrace(t.getStackTrace());
                }
                throw e;
            }
        }
        if (expectedException != null) {
            throw new AssertionError("Expected exception: " + expectedException);
        }

    }

    private void asyncEvaluate(final WorkflowTestBase workflowTest) throws Throwable, InterruptedException {
        try {
            workflowTest.scope = new AsyncScope() {

                @Override
                protected void doAsync() throws Throwable {
                    new TryCatchFinally() {

                        @Override
                        protected void doTry() throws Throwable {
                            workflowTest.beforeEvaluate(workflowTest.decisionContext);
                            base.evaluate();
                        }

                        @Override
                        protected void doCatch(Throwable e) throws Throwable {
                            if (e instanceof IllegalStateException) {
                                if ("Called outside of the workflow definition code.".equals(e.getMessage())) {
                                    throw new RuntimeException(
                                            "Possible use of \"timeout\" parameter of @Test annotation without using Flow JUnit runner. "
                                                    + "Supported runners are FlowBlockJUnit4ClassRunner and FlowSpringJUnit4ClassRunner.",
                                            e);
                                }
                            }
                            throw e;
                        }

                        @Override
                        protected void doFinally() throws Throwable {
                            workflowTest.afterEvaluate();
                        }

                    };
                }
            };
            boolean outstandingTasks = false;
            while (!workflowTest.scope.isComplete()) {
                outstandingTasks = workflowTest.scope.eventLoop();
                if (workflowTest.waits.size() == 0) {
                    Long toNextTimerDelay = workflowTest.workflowClock.fireTimers();
                    if (toNextTimerDelay == null) {
                        break;
                    }
                    long timeToSleep = (long) (toNextTimerDelay / workflowTest.clockAcceleration);
                    if (timeToSleep > 5) {
                        waitingOnTimer = true;
                        try {
                            // If you are using @Test(timeout=...) annotation and your test timed out
                            // pointing to the Thread.sleep that follows this comment consider 
                            // changing test runner to FlowBlockJUnit4ClassRunner or 
                            // FlowSpringJUnit4ClassRunner to enable asynchronous thread dump.
                            Thread.sleep(timeToSleep);
                        }
                        finally {
                            waitingOnTimer = false;
                        }
                    }
                    workflowTest.workflowClock.advanceMilliseconds(toNextTimerDelay);
                    continue;
                }
                for (Settable<Void> listener : workflowTest.waits) {
                    listener.set(null);
                }
                workflowTest.waits.clear();
            }
            if (!workflowTest.disableOutstandingTasksCheck && !outstandingTasks) {
                throw new IllegalStateException("There are outstanding tasks after test completed execution: \n"
                        + workflowTest.scope.getAsynchronousThreadDumpAsString());
            }
        }
        finally {
            workflowTest.afterEvaluate();
        }
    }

    public void setTestTimeoutActualTimeMilliseconds(long timeout) {
        if (timeout > 0) {
            this.timeout = timeout;
        }
    }

    public void setExpectedException(Class<? extends Throwable> expectedException) {
        this.expectedException = expectedException;
    }

    public void setFlowTestRunner(boolean flowTestRunner) {
        this.flowTestRunner = flowTestRunner;
    }
}
