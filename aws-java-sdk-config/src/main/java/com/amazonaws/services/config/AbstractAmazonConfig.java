/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchGetAggregateResourceConfigResult batchGetAggregateResourceConfig(BatchGetAggregateResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchGetResourceConfigResult batchGetResourceConfig(BatchGetResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAggregationAuthorizationResult deleteAggregationAuthorization(DeleteAggregationAuthorizationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteConfigRuleResult deleteConfigRule(DeleteConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationAggregatorResult deleteConfigurationAggregator(DeleteConfigurationAggregatorRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationRecorderResult deleteConfigurationRecorder(DeleteConfigurationRecorderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteConformancePackResult deleteConformancePack(DeleteConformancePackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDeliveryChannelResult deleteDeliveryChannel(DeleteDeliveryChannelRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteEvaluationResultsResult deleteEvaluationResults(DeleteEvaluationResultsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteOrganizationConfigRuleResult deleteOrganizationConfigRule(DeleteOrganizationConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteOrganizationConformancePackResult deleteOrganizationConformancePack(DeleteOrganizationConformancePackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeletePendingAggregationRequestResult deletePendingAggregationRequest(DeletePendingAggregationRequestRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteRemediationConfigurationResult deleteRemediationConfiguration(DeleteRemediationConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteRemediationExceptionsResult deleteRemediationExceptions(DeleteRemediationExceptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteResourceConfigResult deleteResourceConfig(DeleteResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteRetentionConfigurationResult deleteRetentionConfiguration(DeleteRetentionConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeliverConfigSnapshotResult deliverConfigSnapshot(DeliverConfigSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAggregateComplianceByConfigRulesResult describeAggregateComplianceByConfigRules(DescribeAggregateComplianceByConfigRulesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAggregationAuthorizationsResult describeAggregationAuthorizations(DescribeAggregationAuthorizationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule() {
        return describeComplianceByConfigRule(new DescribeComplianceByConfigRuleRequest());
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource(DescribeComplianceByResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource() {
        return describeComplianceByResource(new DescribeComplianceByResourceRequest());
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(DescribeConfigRuleEvaluationStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus() {
        return describeConfigRuleEvaluationStatus(new DescribeConfigRuleEvaluationStatusRequest());
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules(DescribeConfigRulesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules() {
        return describeConfigRules(new DescribeConfigRulesRequest());
    }

    @Override
    public DescribeConfigurationAggregatorSourcesStatusResult describeConfigurationAggregatorSourcesStatus(
            DescribeConfigurationAggregatorSourcesStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationAggregatorsResult describeConfigurationAggregators(DescribeConfigurationAggregatorsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() {
        return describeConfigurationRecorderStatus(new DescribeConfigurationRecorderStatusRequest());
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(DescribeConfigurationRecordersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() {
        return describeConfigurationRecorders(new DescribeConfigurationRecordersRequest());
    }

    @Override
    public DescribeConformancePackComplianceResult describeConformancePackCompliance(DescribeConformancePackComplianceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConformancePackStatusResult describeConformancePackStatus(DescribeConformancePackStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeConformancePacksResult describeConformancePacks(DescribeConformancePacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() {
        return describeDeliveryChannelStatus(new DescribeDeliveryChannelStatusRequest());
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels(DescribeDeliveryChannelsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels() {
        return describeDeliveryChannels(new DescribeDeliveryChannelsRequest());
    }

    @Override
    public DescribeOrganizationConfigRuleStatusesResult describeOrganizationConfigRuleStatuses(DescribeOrganizationConfigRuleStatusesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOrganizationConfigRulesResult describeOrganizationConfigRules(DescribeOrganizationConfigRulesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOrganizationConformancePackStatusesResult describeOrganizationConformancePackStatuses(
            DescribeOrganizationConformancePackStatusesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOrganizationConformancePacksResult describeOrganizationConformancePacks(DescribeOrganizationConformancePacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribePendingAggregationRequestsResult describePendingAggregationRequests(DescribePendingAggregationRequestsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRemediationConfigurationsResult describeRemediationConfigurations(DescribeRemediationConfigurationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRemediationExceptionsResult describeRemediationExceptions(DescribeRemediationExceptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRemediationExecutionStatusResult describeRemediationExecutionStatus(DescribeRemediationExecutionStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeRetentionConfigurationsResult describeRetentionConfigurations(DescribeRetentionConfigurationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAggregateComplianceDetailsByConfigRuleResult getAggregateComplianceDetailsByConfigRule(GetAggregateComplianceDetailsByConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAggregateConfigRuleComplianceSummaryResult getAggregateConfigRuleComplianceSummary(GetAggregateConfigRuleComplianceSummaryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAggregateDiscoveredResourceCountsResult getAggregateDiscoveredResourceCounts(GetAggregateDiscoveredResourceCountsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetAggregateResourceConfigResult getAggregateResourceConfig(GetAggregateResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetComplianceDetailsByResourceResult getComplianceDetailsByResource(GetComplianceDetailsByResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule() {
        return getComplianceSummaryByConfigRule(new GetComplianceSummaryByConfigRuleRequest());
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType() {
        return getComplianceSummaryByResourceType(new GetComplianceSummaryByResourceTypeRequest());
    }

    @Override
    public GetConformancePackComplianceDetailsResult getConformancePackComplianceDetails(GetConformancePackComplianceDetailsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetConformancePackComplianceSummaryResult getConformancePackComplianceSummary(GetConformancePackComplianceSummaryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetDiscoveredResourceCountsResult getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetOrganizationConfigRuleDetailedStatusResult getOrganizationConfigRuleDetailedStatus(GetOrganizationConfigRuleDetailedStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetOrganizationConformancePackDetailedStatusResult getOrganizationConformancePackDetailedStatus(
            GetOrganizationConformancePackDetailedStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetResourceConfigHistoryResult getResourceConfigHistory(GetResourceConfigHistoryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAggregateDiscoveredResourcesResult listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutAggregationAuthorizationResult putAggregationAuthorization(PutAggregationAuthorizationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutConfigRuleResult putConfigRule(PutConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutConfigurationAggregatorResult putConfigurationAggregator(PutConfigurationAggregatorRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutConfigurationRecorderResult putConfigurationRecorder(PutConfigurationRecorderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutConformancePackResult putConformancePack(PutConformancePackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutDeliveryChannelResult putDeliveryChannel(PutDeliveryChannelRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutEvaluationsResult putEvaluations(PutEvaluationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutOrganizationConfigRuleResult putOrganizationConfigRule(PutOrganizationConfigRuleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutOrganizationConformancePackResult putOrganizationConformancePack(PutOrganizationConformancePackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutRemediationConfigurationsResult putRemediationConfigurations(PutRemediationConfigurationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutRemediationExceptionsResult putRemediationExceptions(PutRemediationExceptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutResourceConfigResult putResourceConfig(PutResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutRetentionConfigurationResult putRetentionConfiguration(PutRetentionConfigurationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SelectAggregateResourceConfigResult selectAggregateResourceConfig(SelectAggregateResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SelectResourceConfigResult selectResourceConfig(SelectResourceConfigRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartConfigRulesEvaluationResult startConfigRulesEvaluation(StartConfigRulesEvaluationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartConfigurationRecorderResult startConfigurationRecorder(StartConfigurationRecorderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartRemediationExecutionResult startRemediationExecution(StartRemediationExecutionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopConfigurationRecorderResult stopConfigurationRecorder(StopConfigurationRecorderRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}
