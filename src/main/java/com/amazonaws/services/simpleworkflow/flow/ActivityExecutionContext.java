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
package com.amazonaws.services.simpleworkflow.flow;

import java.util.concurrent.CancellationException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.ManualActivityCompletion;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;
import com.amazonaws.services.simpleworkflow.model.ActivityTask;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

/**
 * Context object passed to an activity implementation.
 * 
 * @see ActivityImplementation
 * 
 * @author fateev
 */
public abstract class ActivityExecutionContext {

    /**
     * @return task token that is required to report task completion when
     *         {@link ManualActivityCompletion} is used.
     */
    public abstract String getTaskToken();

    /**
     * @return workfow execution that requested the activity execution
     */
    public abstract WorkflowExecution getWorkflowExecution();

    /**
     * @return task that caused activity execution
     */
    public abstract ActivityTask getTask();

    /**
     * Use to notify Simple Workflow that activity execution is alive.
     * 
     * @param details
     *            In case of activity timeout details are returned as a field of
     *            the exception thrown.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client
     *             while attempting to make the request or handle the response.
     *             For example if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow
     *             indicating either a problem with the data in the request.
     *             Internal service errors are swallowed and not propagated to
     *             the caller.
     * @throws CancellationException
     *             Indicates that activity cancellation was requested by the
     *             workflow.Should be rethrown from activity implementation to
     *             indicate successful cancellation.
     */
    public abstract void recordActivityHeartbeat(String details)
            throws AmazonServiceException, AmazonClientException, CancellationException;

    /**
     * @return an instance of the Simple Workflow Java client that is the same
     *         used by the invoked activity worker.
     */
    public abstract AmazonSimpleWorkflow getService();

}
