/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    public java.util.concurrent.Future<CreateDeliveryResult> createDeliveryAsync(CreateDeliveryRequest request) {

        return createDeliveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeliveryResult> createDeliveryAsync(CreateDeliveryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeliveryRequest, CreateDeliveryResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateLogAnomalyDetectorResult> createLogAnomalyDetectorAsync(CreateLogAnomalyDetectorRequest request) {

        return createLogAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnomalyDetectorResult> createLogAnomalyDetectorAsync(CreateLogAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLogAnomalyDetectorRequest, CreateLogAnomalyDetectorResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteAccountPolicyResult> deleteAccountPolicyAsync(DeleteAccountPolicyRequest request) {

        return deleteAccountPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountPolicyResult> deleteAccountPolicyAsync(DeleteAccountPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountPolicyRequest, DeleteAccountPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataProtectionPolicyResult> deleteDataProtectionPolicyAsync(DeleteDataProtectionPolicyRequest request) {

        return deleteDataProtectionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataProtectionPolicyResult> deleteDataProtectionPolicyAsync(DeleteDataProtectionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataProtectionPolicyRequest, DeleteDataProtectionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryResult> deleteDeliveryAsync(DeleteDeliveryRequest request) {

        return deleteDeliveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryResult> deleteDeliveryAsync(DeleteDeliveryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryRequest, DeleteDeliveryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryDestinationResult> deleteDeliveryDestinationAsync(DeleteDeliveryDestinationRequest request) {

        return deleteDeliveryDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryDestinationResult> deleteDeliveryDestinationAsync(DeleteDeliveryDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryDestinationRequest, DeleteDeliveryDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryDestinationPolicyResult> deleteDeliveryDestinationPolicyAsync(
            DeleteDeliveryDestinationPolicyRequest request) {

        return deleteDeliveryDestinationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryDestinationPolicyResult> deleteDeliveryDestinationPolicyAsync(
            DeleteDeliveryDestinationPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryDestinationPolicyRequest, DeleteDeliveryDestinationPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliverySourceResult> deleteDeliverySourceAsync(DeleteDeliverySourceRequest request) {

        return deleteDeliverySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliverySourceResult> deleteDeliverySourceAsync(DeleteDeliverySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliverySourceRequest, DeleteDeliverySourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteLogAnomalyDetectorResult> deleteLogAnomalyDetectorAsync(DeleteLogAnomalyDetectorRequest request) {

        return deleteLogAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnomalyDetectorResult> deleteLogAnomalyDetectorAsync(DeleteLogAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLogAnomalyDetectorRequest, DeleteLogAnomalyDetectorResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteQueryDefinitionResult> deleteQueryDefinitionAsync(DeleteQueryDefinitionRequest request) {

        return deleteQueryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueryDefinitionResult> deleteQueryDefinitionAsync(DeleteQueryDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteQueryDefinitionRequest, DeleteQueryDefinitionResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeAccountPoliciesResult> describeAccountPoliciesAsync(DescribeAccountPoliciesRequest request) {

        return describeAccountPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountPoliciesResult> describeAccountPoliciesAsync(DescribeAccountPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountPoliciesRequest, DescribeAccountPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveriesResult> describeDeliveriesAsync(DescribeDeliveriesRequest request) {

        return describeDeliveriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveriesResult> describeDeliveriesAsync(DescribeDeliveriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveriesRequest, DescribeDeliveriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryDestinationsResult> describeDeliveryDestinationsAsync(DescribeDeliveryDestinationsRequest request) {

        return describeDeliveryDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryDestinationsResult> describeDeliveryDestinationsAsync(DescribeDeliveryDestinationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryDestinationsRequest, DescribeDeliveryDestinationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliverySourcesResult> describeDeliverySourcesAsync(DescribeDeliverySourcesRequest request) {

        return describeDeliverySourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliverySourcesResult> describeDeliverySourcesAsync(DescribeDeliverySourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliverySourcesRequest, DescribeDeliverySourcesResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeQueryDefinitionsResult> describeQueryDefinitionsAsync(DescribeQueryDefinitionsRequest request) {

        return describeQueryDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueryDefinitionsResult> describeQueryDefinitionsAsync(DescribeQueryDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeQueryDefinitionsRequest, DescribeQueryDefinitionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetDataProtectionPolicyResult> getDataProtectionPolicyAsync(GetDataProtectionPolicyRequest request) {

        return getDataProtectionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataProtectionPolicyResult> getDataProtectionPolicyAsync(GetDataProtectionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataProtectionPolicyRequest, GetDataProtectionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeliveryResult> getDeliveryAsync(GetDeliveryRequest request) {

        return getDeliveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliveryResult> getDeliveryAsync(GetDeliveryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeliveryRequest, GetDeliveryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeliveryDestinationResult> getDeliveryDestinationAsync(GetDeliveryDestinationRequest request) {

        return getDeliveryDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliveryDestinationResult> getDeliveryDestinationAsync(GetDeliveryDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeliveryDestinationRequest, GetDeliveryDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeliveryDestinationPolicyResult> getDeliveryDestinationPolicyAsync(GetDeliveryDestinationPolicyRequest request) {

        return getDeliveryDestinationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliveryDestinationPolicyResult> getDeliveryDestinationPolicyAsync(GetDeliveryDestinationPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeliveryDestinationPolicyRequest, GetDeliveryDestinationPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeliverySourceResult> getDeliverySourceAsync(GetDeliverySourceRequest request) {

        return getDeliverySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeliverySourceResult> getDeliverySourceAsync(GetDeliverySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeliverySourceRequest, GetDeliverySourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLogAnomalyDetectorResult> getLogAnomalyDetectorAsync(GetLogAnomalyDetectorRequest request) {

        return getLogAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnomalyDetectorResult> getLogAnomalyDetectorAsync(GetLogAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLogAnomalyDetectorRequest, GetLogAnomalyDetectorResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListAnomaliesResult> listAnomaliesAsync(ListAnomaliesRequest request) {

        return listAnomaliesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomaliesResult> listAnomaliesAsync(ListAnomaliesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAnomaliesRequest, ListAnomaliesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLogAnomalyDetectorsResult> listLogAnomalyDetectorsAsync(ListLogAnomalyDetectorsRequest request) {

        return listLogAnomalyDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnomalyDetectorsResult> listLogAnomalyDetectorsAsync(ListLogAnomalyDetectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLogAnomalyDetectorsRequest, ListLogAnomalyDetectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest request) {

        return listTagsLogGroupAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsLogGroupRequest, ListTagsLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAccountPolicyResult> putAccountPolicyAsync(PutAccountPolicyRequest request) {

        return putAccountPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountPolicyResult> putAccountPolicyAsync(PutAccountPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAccountPolicyRequest, PutAccountPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDataProtectionPolicyResult> putDataProtectionPolicyAsync(PutDataProtectionPolicyRequest request) {

        return putDataProtectionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDataProtectionPolicyResult> putDataProtectionPolicyAsync(PutDataProtectionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDataProtectionPolicyRequest, PutDataProtectionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryDestinationResult> putDeliveryDestinationAsync(PutDeliveryDestinationRequest request) {

        return putDeliveryDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryDestinationResult> putDeliveryDestinationAsync(PutDeliveryDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDeliveryDestinationRequest, PutDeliveryDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryDestinationPolicyResult> putDeliveryDestinationPolicyAsync(PutDeliveryDestinationPolicyRequest request) {

        return putDeliveryDestinationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryDestinationPolicyResult> putDeliveryDestinationPolicyAsync(PutDeliveryDestinationPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDeliveryDestinationPolicyRequest, PutDeliveryDestinationPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDeliverySourceResult> putDeliverySourceAsync(PutDeliverySourceRequest request) {

        return putDeliverySourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliverySourceResult> putDeliverySourceAsync(PutDeliverySourceRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDeliverySourceRequest, PutDeliverySourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutQueryDefinitionResult> putQueryDefinitionAsync(PutQueryDefinitionRequest request) {

        return putQueryDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutQueryDefinitionResult> putQueryDefinitionAsync(PutQueryDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutQueryDefinitionRequest, PutQueryDefinitionResult> asyncHandler) {

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
    @Deprecated
    public java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest request) {

        return tagLogGroupAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<TagLogGroupRequest, TagLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

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
    @Deprecated
    public java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest request) {

        return untagLogGroupAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagLogGroupRequest, UntagLogGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyResult> updateAnomalyAsync(UpdateAnomalyRequest request) {

        return updateAnomalyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyResult> updateAnomalyAsync(UpdateAnomalyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalyRequest, UpdateAnomalyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnomalyDetectorResult> updateLogAnomalyDetectorAsync(UpdateLogAnomalyDetectorRequest request) {

        return updateLogAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnomalyDetectorResult> updateLogAnomalyDetectorAsync(UpdateLogAnomalyDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLogAnomalyDetectorRequest, UpdateLogAnomalyDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
