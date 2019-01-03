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

/**
 * Abstract implementation of {@code AmazonSimpleWorkflowAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSimpleWorkflowAsync extends AbstractAmazonSimpleWorkflow implements AmazonSimpleWorkflowAsync {

    protected AbstractAmazonSimpleWorkflowAsync() {
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(CountClosedWorkflowExecutionsRequest request) {

        return countClosedWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(CountClosedWorkflowExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<CountClosedWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(CountOpenWorkflowExecutionsRequest request) {

        return countOpenWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(CountOpenWorkflowExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<CountOpenWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PendingTaskCount> countPendingActivityTasksAsync(CountPendingActivityTasksRequest request) {

        return countPendingActivityTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PendingTaskCount> countPendingActivityTasksAsync(CountPendingActivityTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<CountPendingActivityTasksRequest, PendingTaskCount> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PendingTaskCount> countPendingDecisionTasksAsync(CountPendingDecisionTasksRequest request) {

        return countPendingDecisionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PendingTaskCount> countPendingDecisionTasksAsync(CountPendingDecisionTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<CountPendingDecisionTasksRequest, PendingTaskCount> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateActivityTypeAsync(DeprecateActivityTypeRequest request) {

        return deprecateActivityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateActivityTypeAsync(DeprecateActivityTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeprecateActivityTypeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateDomainAsync(DeprecateDomainRequest request) {

        return deprecateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateDomainAsync(DeprecateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeprecateDomainRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateWorkflowTypeAsync(DeprecateWorkflowTypeRequest request) {

        return deprecateWorkflowTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateWorkflowTypeAsync(DeprecateWorkflowTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeprecateWorkflowTypeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ActivityTypeDetail> describeActivityTypeAsync(DescribeActivityTypeRequest request) {

        return describeActivityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTypeDetail> describeActivityTypeAsync(DescribeActivityTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeActivityTypeRequest, ActivityTypeDetail> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DomainDetail> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DomainDetail> describeDomainAsync(DescribeDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DomainDetail> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(DescribeWorkflowExecutionRequest request) {

        return describeWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(DescribeWorkflowExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkflowExecutionRequest, WorkflowExecutionDetail> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WorkflowTypeDetail> describeWorkflowTypeAsync(DescribeWorkflowTypeRequest request) {

        return describeWorkflowTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowTypeDetail> describeWorkflowTypeAsync(DescribeWorkflowTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkflowTypeRequest, WorkflowTypeDetail> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<History> getWorkflowExecutionHistoryAsync(GetWorkflowExecutionHistoryRequest request) {

        return getWorkflowExecutionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<History> getWorkflowExecutionHistoryAsync(GetWorkflowExecutionHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowExecutionHistoryRequest, History> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ActivityTypeInfos> listActivityTypesAsync(ListActivityTypesRequest request) {

        return listActivityTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTypeInfos> listActivityTypesAsync(ListActivityTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListActivityTypesRequest, ActivityTypeInfos> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(ListClosedWorkflowExecutionsRequest request) {

        return listClosedWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(ListClosedWorkflowExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClosedWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DomainInfos> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DomainInfos> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, DomainInfos> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(ListOpenWorkflowExecutionsRequest request) {

        return listOpenWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(ListOpenWorkflowExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOpenWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WorkflowTypeInfos> listWorkflowTypesAsync(ListWorkflowTypesRequest request) {

        return listWorkflowTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowTypeInfos> listWorkflowTypesAsync(ListWorkflowTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowTypesRequest, WorkflowTypeInfos> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ActivityTask> pollForActivityTaskAsync(PollForActivityTaskRequest request) {

        return pollForActivityTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTask> pollForActivityTaskAsync(PollForActivityTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<PollForActivityTaskRequest, ActivityTask> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DecisionTask> pollForDecisionTaskAsync(PollForDecisionTaskRequest request) {

        return pollForDecisionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecisionTask> pollForDecisionTaskAsync(PollForDecisionTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<PollForDecisionTaskRequest, DecisionTask> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(RecordActivityTaskHeartbeatRequest request) {

        return recordActivityTaskHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(RecordActivityTaskHeartbeatRequest request,
            com.amazonaws.handlers.AsyncHandler<RecordActivityTaskHeartbeatRequest, ActivityTaskStatus> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> registerActivityTypeAsync(RegisterActivityTypeRequest request) {

        return registerActivityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerActivityTypeAsync(RegisterActivityTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterActivityTypeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> registerDomainAsync(RegisterDomainRequest request) {

        return registerDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerDomainAsync(RegisterDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterDomainRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> registerWorkflowTypeAsync(RegisterWorkflowTypeRequest request) {

        return registerWorkflowTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerWorkflowTypeAsync(RegisterWorkflowTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterWorkflowTypeRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> requestCancelWorkflowExecutionAsync(RequestCancelWorkflowExecutionRequest request) {

        return requestCancelWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> requestCancelWorkflowExecutionAsync(RequestCancelWorkflowExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestCancelWorkflowExecutionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskCanceledAsync(RespondActivityTaskCanceledRequest request) {

        return respondActivityTaskCanceledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskCanceledAsync(RespondActivityTaskCanceledRequest request,
            com.amazonaws.handlers.AsyncHandler<RespondActivityTaskCanceledRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskCompletedAsync(RespondActivityTaskCompletedRequest request) {

        return respondActivityTaskCompletedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskCompletedAsync(RespondActivityTaskCompletedRequest request,
            com.amazonaws.handlers.AsyncHandler<RespondActivityTaskCompletedRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskFailedAsync(RespondActivityTaskFailedRequest request) {

        return respondActivityTaskFailedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskFailedAsync(RespondActivityTaskFailedRequest request,
            com.amazonaws.handlers.AsyncHandler<RespondActivityTaskFailedRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> respondDecisionTaskCompletedAsync(RespondDecisionTaskCompletedRequest request) {

        return respondDecisionTaskCompletedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondDecisionTaskCompletedAsync(RespondDecisionTaskCompletedRequest request,
            com.amazonaws.handlers.AsyncHandler<RespondDecisionTaskCompletedRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> signalWorkflowExecutionAsync(SignalWorkflowExecutionRequest request) {

        return signalWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> signalWorkflowExecutionAsync(SignalWorkflowExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<SignalWorkflowExecutionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Run> startWorkflowExecutionAsync(StartWorkflowExecutionRequest request) {

        return startWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Run> startWorkflowExecutionAsync(StartWorkflowExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartWorkflowExecutionRequest, Run> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> terminateWorkflowExecutionAsync(TerminateWorkflowExecutionRequest request) {

        return terminateWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> terminateWorkflowExecutionAsync(TerminateWorkflowExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkflowExecutionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
