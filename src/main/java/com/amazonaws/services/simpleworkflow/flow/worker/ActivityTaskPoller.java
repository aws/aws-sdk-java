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
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.model.ActivityTask;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public class ActivityTaskPoller extends SynchronousActivityTaskPoller {

    private static final Log log = LogFactory.getLog(ActivityTaskPoller.class);

    private ThreadPoolExecutor taskExecutorService;

    protected Semaphore pollSemaphore;

    private UncaughtExceptionHandler uncaughtExceptionHandler = new UncaughtExceptionHandler() {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            log.error("Failure in thread " + t.getName(), e);
        }
    };

    public ActivityTaskPoller(AmazonSimpleWorkflow service, String domain, String pollTaskList,
            ActivityImplementationFactory activityImplementationFactory, ThreadPoolExecutor taskExecutorService) {
        super(service, domain, pollTaskList, activityImplementationFactory);
        setTaskExecutorService(taskExecutorService);
    }

    public ExecutorService getTaskExecutorService() {
        return taskExecutorService;
    }

    public void setTaskExecutorService(ThreadPoolExecutor taskExecutorService) {
        this.taskExecutorService = taskExecutorService;
        pollSemaphore = new Semaphore(taskExecutorService.getMaximumPoolSize());
    }

    /**
     * Poll for a activity task and execute correspondent implementation using
     * provided executor service.
     * 
     * @return true if task was polled and decided upon, false if poll timed out
     * @throws Exception
     */
    @Override
    public boolean pollAndProcessSingleTask() throws Exception {
        boolean semaphoreNeedsRelease = false;
        try {
            // Without semaphore task that was polled from a service
            // can end up waiting on taskExecutor.execute(...) for a long
            // time leading to timeouts and other problems
            if (pollSemaphore != null) {
                pollSemaphore.acquire();
            }
            // we will release the semaphore in a finally clause
            semaphoreNeedsRelease = true;
            final ActivityTask task = poll();
            if (task == null) {
                return false;
            }
            semaphoreNeedsRelease = false;
            try {
                taskExecutorService.execute(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            execute(task);
                        }
                        catch (Throwable ee) {
                            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), wrapFailure(task, ee));
                        }
                        finally {
                            pollSemaphore.release();
                        }
                    }
                });
            }
            catch (Exception e) {
                semaphoreNeedsRelease = true;
                throw e;
            } catch (Error e) {
                semaphoreNeedsRelease = true;
                throw e;
            }
        }
        finally {
            if (semaphoreNeedsRelease) {
                pollSemaphore.release();
            }
        }
        return true;
    }

    private Exception wrapFailure(final ActivityTask task, Throwable failure) {
        WorkflowExecution execution = task.getWorkflowExecution();

        RuntimeException e2 = new RuntimeException(
                "Failure taskId=\"" + task.getStartedEventId() + "\" workflowExecutionRunId=\"" + execution.getRunId()
                        + "\" workflowExecutionId=\"" + execution.getWorkflowId(), failure);
        return e2;
    }

    @Override
    public void shutdown() {
        taskExecutorService.shutdown();
    }

    @Override
    public void shutdownNow() {
        taskExecutorService.shutdownNow();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return taskExecutorService.awaitTermination(timeout, unit);
    }
}
