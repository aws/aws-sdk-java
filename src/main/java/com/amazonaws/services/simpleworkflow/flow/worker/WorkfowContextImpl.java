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

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.common.FlowHelpers;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.model.ChildPolicy;
import com.amazonaws.services.simpleworkflow.model.DecisionTask;
import com.amazonaws.services.simpleworkflow.model.HistoryEvent;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionStartedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;


class WorkfowContextImpl implements WorkflowContext {

    private final DecisionTask decisionTask;
    private boolean cancelRequested;
    private ContinueAsNewWorkflowExecutionParameters continueAsNewOnCompletion;
    
    public WorkfowContextImpl(DecisionTask decisionTask) {
        this.decisionTask = decisionTask;
    }
    
    @Override
    public WorkflowExecution getWorkflowExecution() {
        return decisionTask.getWorkflowExecution();
    }

    @Override
    public WorkflowType getWorkflowType() {
        return decisionTask.getWorkflowType();
    }

    @Override
    public boolean isCancelRequested() {
        return cancelRequested;
    }

    void setCancelRequested(boolean flag) {
        cancelRequested = flag;
    }

    @Override
    public ContinueAsNewWorkflowExecutionParameters getContinueAsNewOnCompletion() {
        return continueAsNewOnCompletion;
    }

    @Override
    public void setContinueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters continueParameters) {
        this.continueAsNewOnCompletion = continueParameters;
    }

    @Override
    public WorkflowExecution getParentWorkflowExecution() {
        WorkflowExecutionStartedEventAttributes attributes = getWorkflowStartedEventAttributes();
        return attributes.getParentWorkflowExecution();
    }

    @Override
    public List<String> getTagList() {
        WorkflowExecutionStartedEventAttributes attributes = getWorkflowStartedEventAttributes();
        return attributes.getTagList();
    }

    @Override
    public ChildPolicy getChildPolicy() {
        WorkflowExecutionStartedEventAttributes attributes = getWorkflowStartedEventAttributes();
        return ChildPolicy.fromValue(attributes.getChildPolicy());
    }
    
    @Override
    public String getContinuedExecutionRunId() {
        WorkflowExecutionStartedEventAttributes attributes = getWorkflowStartedEventAttributes();
        return attributes.getContinuedExecutionRunId();
    }
    
    @Override
    public long getExecutionStartToCloseTimeout() {
        WorkflowExecutionStartedEventAttributes attributes = getWorkflowStartedEventAttributes();
        String result = attributes.getExecutionStartToCloseTimeout();
        return FlowHelpers.durationToSeconds(result);
    }
    
    @Override
    public String getTaskList() {
        WorkflowExecutionStartedEventAttributes attributes = getWorkflowStartedEventAttributes();
        return attributes.getTaskList().getName();
    }
    
    private WorkflowExecutionStartedEventAttributes getWorkflowStartedEventAttributes() {
        HistoryEvent firstHistoryEvent = decisionTask.getEvents().get(0);
        WorkflowExecutionStartedEventAttributes attributes = firstHistoryEvent.getWorkflowExecutionStartedEventAttributes();
        return attributes;
    }

}
