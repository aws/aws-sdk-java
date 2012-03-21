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

import java.util.UUID;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.common.FlowHelpers;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.TerminateWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest;
import com.amazonaws.services.simpleworkflow.model.RequestCancelWorkflowExecutionRequest;
import com.amazonaws.services.simpleworkflow.model.Run;
import com.amazonaws.services.simpleworkflow.model.SignalWorkflowExecutionRequest;
import com.amazonaws.services.simpleworkflow.model.StartWorkflowExecutionRequest;
import com.amazonaws.services.simpleworkflow.model.TaskList;
import com.amazonaws.services.simpleworkflow.model.TerminateWorkflowExecutionRequest;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail;

public class GenericWorkflowClientExternalImpl implements GenericWorkflowClientExternal {

    private final String domain;

    private final AmazonSimpleWorkflow service;

    public GenericWorkflowClientExternalImpl(AmazonSimpleWorkflow service, String domain) {
        this.service = service;
        this.domain = domain;
    }

    @Override
    public WorkflowExecution startWorkflow(StartWorkflowExecutionParameters startParameters) {
        StartWorkflowExecutionRequest request = new StartWorkflowExecutionRequest();
        request.setDomain(domain);

        request.setInput(startParameters.getInput());
        request.setExecutionStartToCloseTimeout(FlowHelpers.secondsToDuration(startParameters.getExecutionStartToCloseTimeout()));
        request.setTaskStartToCloseTimeout(FlowHelpers.secondsToDuration(startParameters.getTaskStartToCloseTimeoutSeconds()));
        request.setTagList(startParameters.getTagList());
        String taskList = startParameters.getTaskList();
        if (taskList != null && !taskList.isEmpty()) {
            request.setTaskList(new TaskList().withName(taskList));
        }
        request.setWorkflowId(startParameters.getWorkflowId());
        request.setWorkflowType(startParameters.getWorkflowType());

        Run result = service.startWorkflowExecution(request);
        WorkflowExecution execution = new WorkflowExecution().withRunId(result.getRunId()).withWorkflowId(request.getWorkflowId());

        return execution;
    }

    @Override
    public void signalWorkflowExecution(SignalExternalWorkflowParameters signalParameters) {
        SignalWorkflowExecutionRequest request = new SignalWorkflowExecutionRequest();
        request.setDomain(domain);

        request.setInput(signalParameters.getInput());
        request.setSignalName(signalParameters.getSignalName());
        request.setRunId(signalParameters.getRunId());
        request.setWorkflowId(signalParameters.getWorkflowId());

        service.signalWorkflowExecution(request);
    }

    @Override
    public void requestCancelWorkflowExecution(WorkflowExecution execution) {
        RequestCancelWorkflowExecutionRequest request = new RequestCancelWorkflowExecutionRequest();
        request.setDomain(domain);

        request.setRunId(execution.getRunId());
        request.setWorkflowId(execution.getWorkflowId());
        
        service.requestCancelWorkflowExecution(request);
    }

    @Override
    public String generateUniqueId() {
        String workflowId = UUID.randomUUID().toString();
        return workflowId;
    }

    @Override
    public String getWorkflowState(WorkflowExecution execution) {
        DescribeWorkflowExecutionRequest request = new DescribeWorkflowExecutionRequest();
        request.setDomain(domain);
        request.setExecution(execution);
        WorkflowExecutionDetail details = service.describeWorkflowExecution(request);
        return details.getLatestExecutionContext();
    }

    @Override
    public void terminateWorkflowExecution(TerminateWorkflowExecutionParameters terminateParameters) {
        TerminateWorkflowExecutionRequest request = new TerminateWorkflowExecutionRequest();
        WorkflowExecution workflowExecution = terminateParameters.getWorkflowExecution();
        request.setWorkflowId(workflowExecution.getWorkflowId());
        request.setRunId(workflowExecution.getRunId());
        request.setDomain(domain);
        request.setDetails(terminateParameters.getDetails());
        request.setReason(terminateParameters.getReason());
        request.setChildPolicy(terminateParameters.getChildPolicy());
        service.terminateWorkflowExecution(request);
    }
}
