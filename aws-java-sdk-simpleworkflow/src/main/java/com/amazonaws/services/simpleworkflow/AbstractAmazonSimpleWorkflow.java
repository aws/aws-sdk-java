/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow;

import javax.annotation.Generated;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonSimpleWorkflow}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSimpleWorkflow implements AmazonSimpleWorkflow {

    protected AbstractAmazonSimpleWorkflow() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowExecutionCount countClosedWorkflowExecutions(CountClosedWorkflowExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowExecutionCount countOpenWorkflowExecutions(CountOpenWorkflowExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PendingTaskCount countPendingActivityTasks(CountPendingActivityTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PendingTaskCount countPendingDecisionTasks(CountPendingDecisionTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deprecateActivityType(DeprecateActivityTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deprecateDomain(DeprecateDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deprecateWorkflowType(DeprecateWorkflowTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ActivityTypeDetail describeActivityType(DescribeActivityTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DomainDetail describeDomain(DescribeDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowExecutionDetail describeWorkflowExecution(DescribeWorkflowExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowTypeDetail describeWorkflowType(DescribeWorkflowTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public History getWorkflowExecutionHistory(GetWorkflowExecutionHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ActivityTypeInfos listActivityTypes(ListActivityTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowExecutionInfos listClosedWorkflowExecutions(ListClosedWorkflowExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DomainInfos listDomains(ListDomainsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowExecutionInfos listOpenWorkflowExecutions(ListOpenWorkflowExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public WorkflowTypeInfos listWorkflowTypes(ListWorkflowTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ActivityTask pollForActivityTask(PollForActivityTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DecisionTask pollForDecisionTask(PollForDecisionTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ActivityTaskStatus recordActivityTaskHeartbeat(RecordActivityTaskHeartbeatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void registerActivityType(RegisterActivityTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void registerDomain(RegisterDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void registerWorkflowType(RegisterWorkflowTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void requestCancelWorkflowExecution(RequestCancelWorkflowExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void respondActivityTaskCanceled(RespondActivityTaskCanceledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void respondActivityTaskFailed(RespondActivityTaskFailedRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void respondDecisionTaskCompleted(RespondDecisionTaskCompletedRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void signalWorkflowExecution(SignalWorkflowExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Run startWorkflowExecution(StartWorkflowExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void terminateWorkflowExecution(TerminateWorkflowExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
