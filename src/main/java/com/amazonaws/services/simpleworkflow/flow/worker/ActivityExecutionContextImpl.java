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

import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContext;
import com.amazonaws.services.simpleworkflow.model.ActivityTask;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus;
import com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

/**
 * Base implementation of an {@link ActivityExecutionContext}.
 * 
 * @see ActivityExecutionContext
 * 
 * @author fateev, suskin
 * 
 */
class ActivityExecutionContextImpl extends ActivityExecutionContext {

    private final ActivityTask task;

    private final AmazonSimpleWorkflow service;

    /**
     * Create an ActivityExecutionContextImpl with the given attributes.
     * 
     * @param service
     *            The {@link AmazonSimpleWorkflow} this
     *            ActivityExecutionContextImpl will send service calls to.
     * @param task
     *            The {@link ActivityTask} this ActivityExecutionContextImpl
     *            will be used for.
     * 
     * @see ActivityExecutionContext
     */
    public ActivityExecutionContextImpl(AmazonSimpleWorkflow service, ActivityTask task) {
        this.service = service;
        this.task = task;
    }

    /**
     * @throws CancellationException
     * @see ActivityExecutionContext#recordActivityHeartbeat(int)
     */
    @Override
    public void recordActivityHeartbeat(String details) throws CancellationException {
        //TODO: call service with the specified minimal interval (through @ActivityExecutionOptions)
        // allowing more frequent calls of this method.
        RecordActivityTaskHeartbeatRequest r = new RecordActivityTaskHeartbeatRequest();
        r.setTaskToken(task.getTaskToken());
        r.setDetails(details);
        ActivityTaskStatus status;
        status = service.recordActivityTaskHeartbeat(r);
        if (status.isCancelRequested()) {
            throw new CancellationException();
        }
    }

    /**
     * @see ActivityExecutionContext#getTask()
     */
    @Override
    public ActivityTask getTask() {
        return task;
    }

    /**
     * @see ActivityExecutionContext#getService()
     */
    @Override
    public AmazonSimpleWorkflow getService() {
        return service;
    }

    @Override
    public String getTaskToken() {
        return task.getTaskToken();
    }

    @Override
    public WorkflowExecution getWorkflowExecution() {
        return task.getWorkflowExecution();
    }

}
