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
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.flow.common.FlowHelpers;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.RegisterActivityTypeRequest;
import com.amazonaws.services.simpleworkflow.model.TaskList;
import com.amazonaws.services.simpleworkflow.model.TypeAlreadyExistsException;

public class GenericActivityWorker extends GenericWorker {

    private static final Log log = LogFactory.getLog(GenericActivityWorker.class);

    private static final String POLL_THREAD_NAME_PREFIX = "SWF Activity Poll ";

    private static final String ACTIVITY_THREAD_NAME_PREFIX = "SWF Activity ";

    private ActivityImplementationFactory activityImplementationFactory;

    private int taskExecutorThreadPoolSize = 100;

    public GenericActivityWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        super(service, domain, taskListToPoll);
        if (service == null) {
            throw new IllegalArgumentException("service");
        }
    }

    public GenericActivityWorker() {
        super();
    }

    public ActivityImplementationFactory getActivityImplementationFactory() {
        return activityImplementationFactory;
    }

    public void setActivityImplementationFactory(ActivityImplementationFactory activityImplementationFactory) {
        this.activityImplementationFactory = activityImplementationFactory;
    }

    public int getTaskExecutorThreadPoolSize() {
        return taskExecutorThreadPoolSize;
    }

    public void setTaskExecutorThreadPoolSize(int taskExecutorThreadPoolSize) {
        if (taskExecutorThreadPoolSize < 1) {
            throw new IllegalArgumentException("0 or negative taskExecutorThreadPoolSize");
        }
        checkStarted();
        this.taskExecutorThreadPoolSize = taskExecutorThreadPoolSize;
    }

    protected Semaphore createPollSemaphore() {
        return new Semaphore(taskExecutorThreadPoolSize);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [super=" + super.toString() + ", taskExecutorThreadPoolSize="
                + taskExecutorThreadPoolSize + "]";
    }

    @Override
    protected String getPollThreadNamePrefix() {
        return POLL_THREAD_NAME_PREFIX + getTaskListToPoll() + " ";
    }

    @Override
    protected TaskPoller createPoller() {
        ThreadPoolExecutor tasksExecutor = new ThreadPoolExecutor(1, taskExecutorThreadPoolSize, 1, TimeUnit.MINUTES,
                new SynchronousQueue<Runnable>());
        tasksExecutor.setThreadFactory(new ExecutorThreadFactory(ACTIVITY_THREAD_NAME_PREFIX + " " + getTaskListToPoll() + " "));
        tasksExecutor.setRejectedExecutionHandler(new BlockCallerPolicy());
        return new ActivityTaskPoller(service, domain, getTaskListToPoll(), activityImplementationFactory, tasksExecutor);
    }

    @Override
    public void registerTypesToPoll() {
        registerActivityTypes(service, domain, getTaskListToPoll(), activityImplementationFactory);
    }

    public static void registerActivityTypes(AmazonSimpleWorkflow service, String domain, String defaultTaskList,
            ActivityImplementationFactory activityImplementationFactory) {
        for (ActivityType activityType : activityImplementationFactory.getActivityTypesToRegister()) {
            try {
                ActivityImplementation implementation = activityImplementationFactory.getActivityImplementation(activityType);
                if (implementation == null) {
                    throw new IllegalStateException("No implementation found for type needed registration: " + activityType);
                }
                ActivityTypeRegistrationOptions registrationOptions = implementation.getRegistrationOptions();
                if (registrationOptions != null) {
                    registerActivityType(service, domain, activityType, registrationOptions, defaultTaskList);
                }
            }
            catch (TypeAlreadyExistsException ex) {
                if (log.isTraceEnabled()) {
                    log.trace("Activity version already registered: " + activityType.getName() + "_" + activityType.getVersion());
                }
            }
        }
    }

    public static void registerActivityType(AmazonSimpleWorkflow service, String domain, ActivityType activityType,
            ActivityTypeRegistrationOptions registrationOptions, String taskListToPoll) throws AmazonServiceException {
        RegisterActivityTypeRequest registerActivity = new RegisterActivityTypeRequest();
        registerActivity.setDomain(domain);
        String taskList = registrationOptions.getDefaultTaskList();
        if (taskList == null) {
            taskList = taskListToPoll;
        }
        else if (taskList.equals(FlowConstants.NO_DEFAULT_TASK_LIST)) {
            taskList = null;
        }
        if (taskList != null && !taskList.isEmpty()) {
            registerActivity.setDefaultTaskList(new TaskList().withName(taskList));
        }
        registerActivity.setName(activityType.getName());
        registerActivity.setVersion(activityType.getVersion());
        registerActivity.setDefaultTaskStartToCloseTimeout(FlowHelpers.secondsToDuration(registrationOptions.getDefaultTaskStartToCloseTimeoutSeconds()));
        registerActivity.setDefaultTaskScheduleToCloseTimeout(FlowHelpers.secondsToDuration(registrationOptions.getDefaultTaskScheduleToCloseTimeoutSeconds()));
        registerActivity.setDefaultTaskHeartbeatTimeout(FlowHelpers.secondsToDuration(registrationOptions.getDefaultTaskHeartbeatTimeoutSeconds()));
        registerActivity.setDefaultTaskScheduleToStartTimeout(FlowHelpers.secondsToDuration(registrationOptions.getDefaultTaskScheduleToStartTimeoutSeconds()));

        if (registrationOptions.getDescription() != null) {
            registerActivity.setDescription(registrationOptions.getDescription());
        }
        service.registerActivityType(registerActivity);
        if (log.isInfoEnabled()) {
            log.info("regisered activity type: " + activityType);
        }
    }

    @Override
    protected void checkRequredProperties() {
        checkRequiredProperty(activityImplementationFactory, "activityImplementationFactory");
    }

}
