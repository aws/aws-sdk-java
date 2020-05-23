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
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ContinueUpdateRollbackResult continueUpdateRollback(ContinueUpdateRollbackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateChangeSetResult createChangeSet(CreateChangeSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStackInstancesResult createStackInstances(CreateStackInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStackSetResult createStackSet(CreateStackSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteChangeSetResult deleteChangeSet(DeleteChangeSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteStackInstancesResult deleteStackInstances(DeleteStackInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterTypeResult deregisterType(DeregisterTypeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackDriftDetectionStatusResult describeStackDriftDetectionStatus(DescribeStackDriftDetectionStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackInstanceResult describeStackInstance(DescribeStackInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackResourceResult describeStackResource(DescribeStackResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackResourceDriftsResult describeStackResourceDrifts(DescribeStackResourceDriftsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackSetResult describeStackSet(DescribeStackSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStacksResult describeStacks() {
        return describeStacks(new DescribeStacksRequest());
    }

    @Override
    public DescribeTypeResult describeType(DescribeTypeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTypeRegistrationResult describeTypeRegistration(DescribeTypeRegistrationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DetectStackDriftResult detectStackDrift(DetectStackDriftRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DetectStackResourceDriftResult detectStackResourceDrift(DetectStackResourceDriftRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DetectStackSetDriftResult detectStackSetDrift(DetectStackSetDriftRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EstimateTemplateCostResult estimateTemplateCost() {
        return estimateTemplateCost(new EstimateTemplateCostRequest());
    }

    @Override
    public ExecuteChangeSetResult executeChangeSet(ExecuteChangeSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetStackPolicyResult getStackPolicy(GetStackPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTemplateSummaryResult getTemplateSummary(GetTemplateSummaryRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetTemplateSummaryResult getTemplateSummary() {
        return getTemplateSummary(new GetTemplateSummaryRequest());
    }

    @Override
    public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListExportsResult listExports(ListExportsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListImportsResult listImports(ListImportsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStackInstancesResult listStackInstances(ListStackInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStackResourcesResult listStackResources(ListStackResourcesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStackSetOperationResultsResult listStackSetOperationResults(ListStackSetOperationResultsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStackSetOperationsResult listStackSetOperations(ListStackSetOperationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStackSetsResult listStackSets(ListStackSetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStacksResult listStacks(ListStacksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListStacksResult listStacks() {
        return listStacks(new ListStacksRequest());
    }

    @Override
    public ListTypeRegistrationsResult listTypeRegistrations(ListTypeRegistrationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTypeVersionsResult listTypeVersions(ListTypeVersionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTypesResult listTypes(ListTypesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RecordHandlerProgressResult recordHandlerProgress(RecordHandlerProgressRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterTypeResult registerType(RegisterTypeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetStackPolicyResult setStackPolicy(SetStackPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetTypeDefaultVersionResult setTypeDefaultVersion(SetTypeDefaultVersionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SignalResourceResult signalResource(SignalResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopStackSetOperationResult stopStackSetOperation(StopStackSetOperationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateStackInstancesResult updateStackInstances(UpdateStackInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateStackSetResult updateStackSet(UpdateStackSetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateTerminationProtectionResult updateTerminationProtection(UpdateTerminationProtectionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest request) {
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

    @Override
    public AmazonCloudFormationWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
