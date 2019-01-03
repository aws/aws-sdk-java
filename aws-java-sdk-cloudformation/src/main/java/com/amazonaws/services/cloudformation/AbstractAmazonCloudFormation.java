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
package com.amazonaws.services.cloudformation;

import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.*;
import com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters;

/**
 * Abstract implementation of {@code AmazonCloudFormation}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudFormation implements AmazonCloudFormation {

    protected AbstractAmazonCloudFormation() {
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
    public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ContinueUpdateRollbackResult continueUpdateRollback(ContinueUpdateRollbackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateChangeSetResult createChangeSet(CreateChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStackInstancesResult createStackInstances(CreateStackInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStackSetResult createStackSet(CreateStackSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteChangeSetResult deleteChangeSet(DeleteChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStackInstancesResult deleteStackInstances(DeleteStackInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackDriftDetectionStatusResult describeStackDriftDetectionStatus(DescribeStackDriftDetectionStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackInstanceResult describeStackInstance(DescribeStackInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackResourceResult describeStackResource(DescribeStackResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackResourceDriftsResult describeStackResourceDrifts(DescribeStackResourceDriftsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackSetResult describeStackSet(DescribeStackSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks() {
        return describeStacks(new DescribeStacksRequest());
    }

    @Override
    public DetectStackDriftResult detectStackDrift(DetectStackDriftRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectStackResourceDriftResult detectStackResourceDrift(DetectStackResourceDriftRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EstimateTemplateCostResult estimateTemplateCost() {
        return estimateTemplateCost(new EstimateTemplateCostRequest());
    }

    @Override
    public ExecuteChangeSetResult executeChangeSet(ExecuteChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStackPolicyResult getStackPolicy(GetStackPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTemplateSummaryResult getTemplateSummary(GetTemplateSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTemplateSummaryResult getTemplateSummary() {
        return getTemplateSummary(new GetTemplateSummaryRequest());
    }

    @Override
    public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListExportsResult listExports(ListExportsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListImportsResult listImports(ListImportsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStackInstancesResult listStackInstances(ListStackInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStackResourcesResult listStackResources(ListStackResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStackSetOperationResultsResult listStackSetOperationResults(ListStackSetOperationResultsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStackSetOperationsResult listStackSetOperations(ListStackSetOperationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStackSetsResult listStackSets(ListStackSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStacksResult listStacks(ListStacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStacksResult listStacks() {
        return listStacks(new ListStacksRequest());
    }

    @Override
    public SetStackPolicyResult setStackPolicy(SetStackPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SignalResourceResult signalResource(SignalResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopStackSetOperationResult stopStackSetOperation(StopStackSetOperationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStackInstancesResult updateStackInstances(UpdateStackInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStackSetResult updateStackSet(UpdateStackSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateTerminationProtectionResult updateTerminationProtection(UpdateTerminationProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest request) {
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

    @Override
    public AmazonCloudFormationWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
