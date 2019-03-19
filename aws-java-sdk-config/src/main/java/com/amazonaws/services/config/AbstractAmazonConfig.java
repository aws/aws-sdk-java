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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonConfig}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonConfig implements AmazonConfig {

    protected AbstractAmazonConfig() {
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
    public BatchGetAggregateResourceConfigResult batchGetAggregateResourceConfig(BatchGetAggregateResourceConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetResourceConfigResult batchGetResourceConfig(BatchGetResourceConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAggregationAuthorizationResult deleteAggregationAuthorization(DeleteAggregationAuthorizationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConfigRuleResult deleteConfigRule(DeleteConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationAggregatorResult deleteConfigurationAggregator(DeleteConfigurationAggregatorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationRecorderResult deleteConfigurationRecorder(DeleteConfigurationRecorderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDeliveryChannelResult deleteDeliveryChannel(DeleteDeliveryChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEvaluationResultsResult deleteEvaluationResults(DeleteEvaluationResultsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePendingAggregationRequestResult deletePendingAggregationRequest(DeletePendingAggregationRequestRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRemediationConfigurationResult deleteRemediationConfiguration(DeleteRemediationConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRetentionConfigurationResult deleteRetentionConfiguration(DeleteRetentionConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeliverConfigSnapshotResult deliverConfigSnapshot(DeliverConfigSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAggregateComplianceByConfigRulesResult describeAggregateComplianceByConfigRules(DescribeAggregateComplianceByConfigRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAggregationAuthorizationsResult describeAggregationAuthorizations(DescribeAggregationAuthorizationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule() {
        return describeComplianceByConfigRule(new DescribeComplianceByConfigRuleRequest());
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource(DescribeComplianceByResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource() {
        return describeComplianceByResource(new DescribeComplianceByResourceRequest());
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(DescribeConfigRuleEvaluationStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus() {
        return describeConfigRuleEvaluationStatus(new DescribeConfigRuleEvaluationStatusRequest());
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules(DescribeConfigRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules() {
        return describeConfigRules(new DescribeConfigRulesRequest());
    }

    @Override
    public DescribeConfigurationAggregatorSourcesStatusResult describeConfigurationAggregatorSourcesStatus(
            DescribeConfigurationAggregatorSourcesStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationAggregatorsResult describeConfigurationAggregators(DescribeConfigurationAggregatorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() {
        return describeConfigurationRecorderStatus(new DescribeConfigurationRecorderStatusRequest());
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(DescribeConfigurationRecordersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() {
        return describeConfigurationRecorders(new DescribeConfigurationRecordersRequest());
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() {
        return describeDeliveryChannelStatus(new DescribeDeliveryChannelStatusRequest());
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels(DescribeDeliveryChannelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels() {
        return describeDeliveryChannels(new DescribeDeliveryChannelsRequest());
    }

    @Override
    public DescribePendingAggregationRequestsResult describePendingAggregationRequests(DescribePendingAggregationRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRemediationConfigurationsResult describeRemediationConfigurations(DescribeRemediationConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRemediationExecutionStatusResult describeRemediationExecutionStatus(DescribeRemediationExecutionStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRetentionConfigurationsResult describeRetentionConfigurations(DescribeRetentionConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAggregateComplianceDetailsByConfigRuleResult getAggregateComplianceDetailsByConfigRule(GetAggregateComplianceDetailsByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAggregateConfigRuleComplianceSummaryResult getAggregateConfigRuleComplianceSummary(GetAggregateConfigRuleComplianceSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAggregateDiscoveredResourceCountsResult getAggregateDiscoveredResourceCounts(GetAggregateDiscoveredResourceCountsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAggregateResourceConfigResult getAggregateResourceConfig(GetAggregateResourceConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceDetailsByResourceResult getComplianceDetailsByResource(GetComplianceDetailsByResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule() {
        return getComplianceSummaryByConfigRule(new GetComplianceSummaryByConfigRuleRequest());
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType() {
        return getComplianceSummaryByResourceType(new GetComplianceSummaryByResourceTypeRequest());
    }

    @Override
    public GetDiscoveredResourceCountsResult getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourceConfigHistoryResult getResourceConfigHistory(GetResourceConfigHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAggregateDiscoveredResourcesResult listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutAggregationAuthorizationResult putAggregationAuthorization(PutAggregationAuthorizationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutConfigRuleResult putConfigRule(PutConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutConfigurationAggregatorResult putConfigurationAggregator(PutConfigurationAggregatorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutConfigurationRecorderResult putConfigurationRecorder(PutConfigurationRecorderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutDeliveryChannelResult putDeliveryChannel(PutDeliveryChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutEvaluationsResult putEvaluations(PutEvaluationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRemediationConfigurationsResult putRemediationConfigurations(PutRemediationConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRetentionConfigurationResult putRetentionConfiguration(PutRetentionConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SelectResourceConfigResult selectResourceConfig(SelectResourceConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartConfigRulesEvaluationResult startConfigRulesEvaluation(StartConfigRulesEvaluationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartConfigurationRecorderResult startConfigurationRecorder(StartConfigurationRecorderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartRemediationExecutionResult startRemediationExecution(StartRemediationExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopConfigurationRecorderResult stopConfigurationRecorder(StopConfigurationRecorderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
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
