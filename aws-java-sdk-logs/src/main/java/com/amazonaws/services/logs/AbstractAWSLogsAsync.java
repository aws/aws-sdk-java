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
package com.amazonaws.services.logs;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;

/**
 * Abstract implementation of {@code AWSLogsAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLogsAsync extends AbstractAWSLogs implements AWSLogsAsync {

    protected AbstractAWSLogsAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateKmsKeyResult> associateKmsKeyAsync(AssociateKmsKeyRequest request) {

        return associateKmsKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateKmsKeyResult> associateKmsKeyAsync(AssociateKmsKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateKmsKeyRequest, AssociateKmsKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request) {

        return cancelExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(CreateExportTaskRequest request) {

        return createExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(CreateExportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateExportTaskRequest, CreateExportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLogGroupResult> createLogGroupAsync(CreateLogGroupRequest request) {

        return createLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogGroupResult> createLogGroupAsync(CreateLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLogGroupRequest, CreateLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLogStreamResult> createLogStreamAsync(CreateLogStreamRequest request) {

        return createLogStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogStreamResult> createLogStreamAsync(CreateLogStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLogStreamRequest, CreateLogStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest request) {

        return deleteDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLogGroupResult> deleteLogGroupAsync(DeleteLogGroupRequest request) {

        return deleteLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogGroupResult> deleteLogGroupAsync(DeleteLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLogGroupRequest, DeleteLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLogStreamResult> deleteLogStreamAsync(DeleteLogStreamRequest request) {

        return deleteLogStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogStreamResult> deleteLogStreamAsync(DeleteLogStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLogStreamRequest, DeleteLogStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(DeleteMetricFilterRequest request) {

        return deleteMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(DeleteMetricFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricFilterRequest, DeleteMetricFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest request) {

        return deleteRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, DeleteRetentionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionFilterResult> deleteSubscriptionFilterAsync(DeleteSubscriptionFilterRequest request) {

        return deleteSubscriptionFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionFilterResult> deleteSubscriptionFilterAsync(DeleteSubscriptionFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionFilterRequest, DeleteSubscriptionFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(DescribeDestinationsRequest request) {

        return describeDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(DescribeDestinationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDestinations operation.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync() {

        return describeDestinationsAsync(new DescribeDestinationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDestinations operation with an AsyncHandler.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler) {

        return describeDestinationsAsync(new DescribeDestinationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(DescribeLogGroupsRequest request) {

        return describeLogGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(DescribeLogGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLogGroups operation.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync() {

        return describeLogGroupsAsync(new DescribeLogGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLogGroups operation with an AsyncHandler.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler) {

        return describeLogGroupsAsync(new DescribeLogGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(DescribeLogStreamsRequest request) {

        return describeLogStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(DescribeLogStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLogStreamsRequest, DescribeLogStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(DescribeMetricFiltersRequest request) {

        return describeMetricFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(DescribeMetricFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeQueriesResult> describeQueriesAsync(DescribeQueriesRequest request) {

        return describeQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueriesResult> describeQueriesAsync(DescribeQueriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeQueriesRequest, DescribeQueriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePoliciesResult> describeResourcePoliciesAsync(DescribeResourcePoliciesRequest request) {

        return describeResourcePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePoliciesResult> describeResourcePoliciesAsync(DescribeResourcePoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResourcePoliciesRequest, DescribeResourcePoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(DescribeSubscriptionFiltersRequest request) {

        return describeSubscriptionFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(DescribeSubscriptionFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateKmsKeyResult> disassociateKmsKeyAsync(DisassociateKmsKeyRequest request) {

        return disassociateKmsKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateKmsKeyResult> disassociateKmsKeyAsync(DisassociateKmsKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateKmsKeyRequest, DisassociateKmsKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest request) {

        return filterLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<FilterLogEventsRequest, FilterLogEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest request) {

        return getLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLogGroupFieldsResult> getLogGroupFieldsAsync(GetLogGroupFieldsRequest request) {

        return getLogGroupFieldsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogGroupFieldsResult> getLogGroupFieldsAsync(GetLogGroupFieldsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLogGroupFieldsRequest, GetLogGroupFieldsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLogRecordResult> getLogRecordAsync(GetLogRecordRequest request) {

        return getLogRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogRecordResult> getLogRecordAsync(GetLogRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLogRecordRequest, GetLogRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest request) {

        return listTagsLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsLogGroupRequest, ListTagsLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest request) {

        return putDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDestinationRequest, PutDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(PutDestinationPolicyRequest request) {

        return putDestinationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(PutDestinationPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDestinationPolicyRequest, PutDestinationPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(PutLogEventsRequest request) {

        return putLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(PutLogEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLogEventsRequest, PutLogEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(PutMetricFilterRequest request) {

        return putMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(PutMetricFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMetricFilterRequest, PutMetricFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest request) {

        return putRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, PutRetentionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(PutSubscriptionFilterRequest request) {

        return putSubscriptionFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(PutSubscriptionFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSubscriptionFilterRequest, PutSubscriptionFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request) {

        return startQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest request) {

        return stopQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<StopQueryRequest, StopQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest request) {

        return tagLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<TagLogGroupRequest, TagLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(TestMetricFilterRequest request) {

        return testMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(TestMetricFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest request) {

        return untagLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagLogGroupRequest, UntagLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
