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
package com.amazonaws.services.config;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;

/**
 * Abstract implementation of {@code AmazonConfigAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonConfigAsync extends AbstractAmazonConfig implements AmazonConfigAsync {

    protected AbstractAmazonConfigAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetAggregateResourceConfigResult> batchGetAggregateResourceConfigAsync(
            BatchGetAggregateResourceConfigRequest request) {

        return batchGetAggregateResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetAggregateResourceConfigResult> batchGetAggregateResourceConfigAsync(
            BatchGetAggregateResourceConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetAggregateResourceConfigRequest, BatchGetAggregateResourceConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetResourceConfigResult> batchGetResourceConfigAsync(BatchGetResourceConfigRequest request) {

        return batchGetResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetResourceConfigResult> batchGetResourceConfigAsync(BatchGetResourceConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetResourceConfigRequest, BatchGetResourceConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAggregationAuthorizationResult> deleteAggregationAuthorizationAsync(DeleteAggregationAuthorizationRequest request) {

        return deleteAggregationAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAggregationAuthorizationResult> deleteAggregationAuthorizationAsync(DeleteAggregationAuthorizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest request) {

        return deleteConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigRuleRequest, DeleteConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationAggregatorResult> deleteConfigurationAggregatorAsync(DeleteConfigurationAggregatorRequest request) {

        return deleteConfigurationAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationAggregatorResult> deleteConfigurationAggregatorAsync(DeleteConfigurationAggregatorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(DeleteConfigurationRecorderRequest request) {

        return deleteConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(DeleteConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationRecorderRequest, DeleteConfigurationRecorderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest request) {

        return deleteDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryChannelRequest, DeleteDeliveryChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest request) {

        return deleteEvaluationResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEvaluationResultsRequest, DeleteEvaluationResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePendingAggregationRequestResult> deletePendingAggregationRequestAsync(
            DeletePendingAggregationRequestRequest request) {

        return deletePendingAggregationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePendingAggregationRequestResult> deletePendingAggregationRequestAsync(
            DeletePendingAggregationRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationConfigurationResult> deleteRemediationConfigurationAsync(DeleteRemediationConfigurationRequest request) {

        return deleteRemediationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationConfigurationResult> deleteRemediationConfigurationAsync(DeleteRemediationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRemediationConfigurationRequest, DeleteRemediationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionConfigurationResult> deleteRetentionConfigurationAsync(DeleteRetentionConfigurationRequest request) {

        return deleteRetentionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionConfigurationResult> deleteRetentionConfigurationAsync(DeleteRetentionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionConfigurationRequest, DeleteRetentionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest request) {

        return deliverConfigSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateComplianceByConfigRulesResult> describeAggregateComplianceByConfigRulesAsync(
            DescribeAggregateComplianceByConfigRulesRequest request) {

        return describeAggregateComplianceByConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateComplianceByConfigRulesResult> describeAggregateComplianceByConfigRulesAsync(
            DescribeAggregateComplianceByConfigRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAggregateComplianceByConfigRulesRequest, DescribeAggregateComplianceByConfigRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregationAuthorizationsResult> describeAggregationAuthorizationsAsync(
            DescribeAggregationAuthorizationsRequest request) {

        return describeAggregationAuthorizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregationAuthorizationsResult> describeAggregationAuthorizationsAsync(
            DescribeAggregationAuthorizationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAggregationAuthorizationsRequest, DescribeAggregationAuthorizationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest request) {

        return describeComplianceByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync() {

        return describeComplianceByConfigRuleAsync(new DescribeComplianceByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation with an AsyncHandler.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        return describeComplianceByConfigRuleAsync(new DescribeComplianceByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(DescribeComplianceByResourceRequest request) {

        return describeComplianceByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(DescribeComplianceByResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync() {

        return describeComplianceByResourceAsync(new DescribeComplianceByResourceRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation with an AsyncHandler.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        return describeComplianceByResourceAsync(new DescribeComplianceByResourceRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest request) {

        return describeConfigRuleEvaluationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync() {

        return describeConfigRuleEvaluationStatusAsync(new DescribeConfigRuleEvaluationStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation with an AsyncHandler.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        return describeConfigRuleEvaluationStatusAsync(new DescribeConfigRuleEvaluationStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest request) {

        return describeConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync() {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigRules operation with an AsyncHandler.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorSourcesStatusResult> describeConfigurationAggregatorSourcesStatusAsync(
            DescribeConfigurationAggregatorSourcesStatusRequest request) {

        return describeConfigurationAggregatorSourcesStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorSourcesStatusResult> describeConfigurationAggregatorSourcesStatusAsync(
            DescribeConfigurationAggregatorSourcesStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationAggregatorSourcesStatusRequest, DescribeConfigurationAggregatorSourcesStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorsResult> describeConfigurationAggregatorsAsync(
            DescribeConfigurationAggregatorsRequest request) {

        return describeConfigurationAggregatorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationAggregatorsResult> describeConfigurationAggregatorsAsync(
            DescribeConfigurationAggregatorsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationAggregatorsRequest, DescribeConfigurationAggregatorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest request) {

        return describeConfigurationRecorderStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync() {

        return describeConfigurationRecorderStatusAsync(new DescribeConfigurationRecorderStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        return describeConfigurationRecorderStatusAsync(new DescribeConfigurationRecorderStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest request) {

        return describeConfigurationRecordersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync() {

        return describeConfigurationRecordersAsync(new DescribeConfigurationRecordersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        return describeConfigurationRecordersAsync(new DescribeConfigurationRecordersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest request) {

        return describeDeliveryChannelStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync() {

        return describeDeliveryChannelStatusAsync(new DescribeDeliveryChannelStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        return describeDeliveryChannelStatusAsync(new DescribeDeliveryChannelStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest request) {

        return describeDeliveryChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync() {

        return describeDeliveryChannelsAsync(new DescribeDeliveryChannelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        return describeDeliveryChannelsAsync(new DescribeDeliveryChannelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingAggregationRequestsResult> describePendingAggregationRequestsAsync(
            DescribePendingAggregationRequestsRequest request) {

        return describePendingAggregationRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingAggregationRequestsResult> describePendingAggregationRequestsAsync(
            DescribePendingAggregationRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePendingAggregationRequestsRequest, DescribePendingAggregationRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationConfigurationsResult> describeRemediationConfigurationsAsync(
            DescribeRemediationConfigurationsRequest request) {

        return describeRemediationConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationConfigurationsResult> describeRemediationConfigurationsAsync(
            DescribeRemediationConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRemediationConfigurationsRequest, DescribeRemediationConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationExecutionStatusResult> describeRemediationExecutionStatusAsync(
            DescribeRemediationExecutionStatusRequest request) {

        return describeRemediationExecutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRemediationExecutionStatusResult> describeRemediationExecutionStatusAsync(
            DescribeRemediationExecutionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRemediationExecutionStatusRequest, DescribeRemediationExecutionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRetentionConfigurationsResult> describeRetentionConfigurationsAsync(
            DescribeRetentionConfigurationsRequest request) {

        return describeRetentionConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRetentionConfigurationsResult> describeRetentionConfigurationsAsync(
            DescribeRetentionConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRetentionConfigurationsRequest, DescribeRetentionConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAggregateComplianceDetailsByConfigRuleResult> getAggregateComplianceDetailsByConfigRuleAsync(
            GetAggregateComplianceDetailsByConfigRuleRequest request) {

        return getAggregateComplianceDetailsByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateComplianceDetailsByConfigRuleResult> getAggregateComplianceDetailsByConfigRuleAsync(
            GetAggregateComplianceDetailsByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAggregateComplianceDetailsByConfigRuleRequest, GetAggregateComplianceDetailsByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAggregateConfigRuleComplianceSummaryResult> getAggregateConfigRuleComplianceSummaryAsync(
            GetAggregateConfigRuleComplianceSummaryRequest request) {

        return getAggregateConfigRuleComplianceSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateConfigRuleComplianceSummaryResult> getAggregateConfigRuleComplianceSummaryAsync(
            GetAggregateConfigRuleComplianceSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAggregateConfigRuleComplianceSummaryRequest, GetAggregateConfigRuleComplianceSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAggregateDiscoveredResourceCountsResult> getAggregateDiscoveredResourceCountsAsync(
            GetAggregateDiscoveredResourceCountsRequest request) {

        return getAggregateDiscoveredResourceCountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateDiscoveredResourceCountsResult> getAggregateDiscoveredResourceCountsAsync(
            GetAggregateDiscoveredResourceCountsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAggregateDiscoveredResourceCountsRequest, GetAggregateDiscoveredResourceCountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAggregateResourceConfigResult> getAggregateResourceConfigAsync(GetAggregateResourceConfigRequest request) {

        return getAggregateResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAggregateResourceConfigResult> getAggregateResourceConfigAsync(GetAggregateResourceConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAggregateResourceConfigRequest, GetAggregateResourceConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest request) {

        return getComplianceDetailsByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(GetComplianceDetailsByResourceRequest request) {

        return getComplianceDetailsByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(GetComplianceDetailsByResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest request) {

        return getComplianceSummaryByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync() {

        return getComplianceSummaryByConfigRuleAsync(new GetComplianceSummaryByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        return getComplianceSummaryByConfigRuleAsync(new GetComplianceSummaryByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest request) {

        return getComplianceSummaryByResourceTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync() {

        return getComplianceSummaryByResourceTypeAsync(new GetComplianceSummaryByResourceTypeRequest());
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        return getComplianceSummaryByResourceTypeAsync(new GetComplianceSummaryByResourceTypeRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveredResourceCountsResult> getDiscoveredResourceCountsAsync(GetDiscoveredResourceCountsRequest request) {

        return getDiscoveredResourceCountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveredResourceCountsResult> getDiscoveredResourceCountsAsync(GetDiscoveredResourceCountsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDiscoveredResourceCountsRequest, GetDiscoveredResourceCountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest request) {

        return getResourceConfigHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAggregateDiscoveredResourcesResult> listAggregateDiscoveredResourcesAsync(
            ListAggregateDiscoveredResourcesRequest request) {

        return listAggregateDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAggregateDiscoveredResourcesResult> listAggregateDiscoveredResourcesAsync(
            ListAggregateDiscoveredResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutAggregationAuthorizationResult> putAggregationAuthorizationAsync(PutAggregationAuthorizationRequest request) {

        return putAggregationAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAggregationAuthorizationResult> putAggregationAuthorizationAsync(PutAggregationAuthorizationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAggregationAuthorizationRequest, PutAggregationAuthorizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest request) {

        return putConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<PutConfigRuleRequest, PutConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationAggregatorResult> putConfigurationAggregatorAsync(PutConfigurationAggregatorRequest request) {

        return putConfigurationAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationAggregatorResult> putConfigurationAggregatorAsync(PutConfigurationAggregatorRequest request,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationAggregatorRequest, PutConfigurationAggregatorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest request) {

        return putConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationRecorderRequest, PutConfigurationRecorderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest request) {

        return putDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDeliveryChannelRequest, PutDeliveryChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest request) {

        return putEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRemediationConfigurationsResult> putRemediationConfigurationsAsync(PutRemediationConfigurationsRequest request) {

        return putRemediationConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRemediationConfigurationsResult> putRemediationConfigurationsAsync(PutRemediationConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRemediationConfigurationsRequest, PutRemediationConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRetentionConfigurationResult> putRetentionConfigurationAsync(PutRetentionConfigurationRequest request) {

        return putRetentionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRetentionConfigurationResult> putRetentionConfigurationAsync(PutRetentionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRetentionConfigurationRequest, PutRetentionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SelectResourceConfigResult> selectResourceConfigAsync(SelectResourceConfigRequest request) {

        return selectResourceConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SelectResourceConfigResult> selectResourceConfigAsync(SelectResourceConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<SelectResourceConfigRequest, SelectResourceConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(StartConfigRulesEvaluationRequest request) {

        return startConfigRulesEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(StartConfigRulesEvaluationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartConfigRulesEvaluationRequest, StartConfigRulesEvaluationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(StartConfigurationRecorderRequest request) {

        return startConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(StartConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationRecorderRequest, StartConfigurationRecorderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartRemediationExecutionResult> startRemediationExecutionAsync(StartRemediationExecutionRequest request) {

        return startRemediationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRemediationExecutionResult> startRemediationExecutionAsync(StartRemediationExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartRemediationExecutionRequest, StartRemediationExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(StopConfigurationRecorderRequest request) {

        return stopConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(StopConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<StopConfigurationRecorderRequest, StopConfigurationRecorderResult> asyncHandler) {

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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
