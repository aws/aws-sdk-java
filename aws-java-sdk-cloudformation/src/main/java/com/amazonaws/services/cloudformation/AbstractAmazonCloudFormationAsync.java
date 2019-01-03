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

/**
 * Abstract implementation of {@code AmazonCloudFormationAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudFormationAsync extends AbstractAmazonCloudFormation implements AmazonCloudFormationAsync {

    protected AbstractAmazonCloudFormationAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelUpdateStackResult> cancelUpdateStackAsync(CancelUpdateStackRequest request) {

        return cancelUpdateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelUpdateStackResult> cancelUpdateStackAsync(CancelUpdateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelUpdateStackRequest, CancelUpdateStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(ContinueUpdateRollbackRequest request) {

        return continueUpdateRollbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(ContinueUpdateRollbackRequest request,
            com.amazonaws.handlers.AsyncHandler<ContinueUpdateRollbackRequest, ContinueUpdateRollbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(CreateChangeSetRequest request) {

        return createChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(CreateChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChangeSetRequest, CreateChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStackInstancesResult> createStackInstancesAsync(CreateStackInstancesRequest request) {

        return createStackInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackInstancesResult> createStackInstancesAsync(CreateStackInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStackInstancesRequest, CreateStackInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStackSetResult> createStackSetAsync(CreateStackSetRequest request) {

        return createStackSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackSetResult> createStackSetAsync(CreateStackSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStackSetRequest, CreateStackSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(DeleteChangeSetRequest request) {

        return deleteChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(DeleteChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteChangeSetRequest, DeleteChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStackInstancesResult> deleteStackInstancesAsync(DeleteStackInstancesRequest request) {

        return deleteStackInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackInstancesResult> deleteStackInstancesAsync(DeleteStackInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStackInstancesRequest, DeleteStackInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStackSetResult> deleteStackSetAsync(DeleteStackSetRequest request) {

        return deleteStackSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackSetResult> deleteStackSetAsync(DeleteStackSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStackSetRequest, DeleteStackSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest request) {

        return describeChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackDriftDetectionStatusResult> describeStackDriftDetectionStatusAsync(
            DescribeStackDriftDetectionStatusRequest request) {

        return describeStackDriftDetectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackDriftDetectionStatusResult> describeStackDriftDetectionStatusAsync(
            DescribeStackDriftDetectionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackDriftDetectionStatusRequest, DescribeStackDriftDetectionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest request) {

        return describeStackEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackInstanceResult> describeStackInstanceAsync(DescribeStackInstanceRequest request) {

        return describeStackInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackInstanceResult> describeStackInstanceAsync(DescribeStackInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackInstanceRequest, DescribeStackInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest request) {

        return describeStackResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourceDriftsResult> describeStackResourceDriftsAsync(DescribeStackResourceDriftsRequest request) {

        return describeStackResourceDriftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourceDriftsResult> describeStackResourceDriftsAsync(DescribeStackResourceDriftsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourceDriftsRequest, DescribeStackResourceDriftsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest request) {

        return describeStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSetResult> describeStackSetAsync(DescribeStackSetRequest request) {

        return describeStackSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSetResult> describeStackSetAsync(DescribeStackSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSetRequest, DescribeStackSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSetOperationResult> describeStackSetOperationAsync(DescribeStackSetOperationRequest request) {

        return describeStackSetOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackSetOperationResult> describeStackSetOperationAsync(DescribeStackSetOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSetOperationRequest, DescribeStackSetOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeStacks operation.
     *
     * @see #describeStacksAsync(DescribeStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync() {

        return describeStacksAsync(new DescribeStacksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeStacks operation with an AsyncHandler.
     *
     * @see #describeStacksAsync(DescribeStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        return describeStacksAsync(new DescribeStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DetectStackDriftResult> detectStackDriftAsync(DetectStackDriftRequest request) {

        return detectStackDriftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectStackDriftResult> detectStackDriftAsync(DetectStackDriftRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectStackDriftRequest, DetectStackDriftResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectStackResourceDriftResult> detectStackResourceDriftAsync(DetectStackResourceDriftRequest request) {

        return detectStackResourceDriftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectStackResourceDriftResult> detectStackResourceDriftAsync(DetectStackResourceDriftRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectStackResourceDriftRequest, DetectStackResourceDriftResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest request) {

        return estimateTemplateCostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest request,
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest)
     */
    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync() {

        return estimateTemplateCostAsync(new EstimateTemplateCostRequest());
    }

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation with an AsyncHandler.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler) {

        return estimateTemplateCostAsync(new EstimateTemplateCostRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(ExecuteChangeSetRequest request) {

        return executeChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(ExecuteChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<ExecuteChangeSetRequest, ExecuteChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest request) {

        return getStackPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest request) {

        return getTemplateSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetTemplateSummary operation.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync() {

        return getTemplateSummaryAsync(new GetTemplateSummaryRequest());
    }

    /**
     * Simplified method form for invoking the GetTemplateSummary operation with an AsyncHandler.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler) {

        return getTemplateSummaryAsync(new GetTemplateSummaryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest request) {

        return listChangeSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request) {

        return listExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest request) {

        return listImportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStackInstancesResult> listStackInstancesAsync(ListStackInstancesRequest request) {

        return listStackInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackInstancesResult> listStackInstancesAsync(ListStackInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStackInstancesRequest, ListStackInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest request) {

        return listStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStackSetOperationResultsResult> listStackSetOperationResultsAsync(ListStackSetOperationResultsRequest request) {

        return listStackSetOperationResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackSetOperationResultsResult> listStackSetOperationResultsAsync(ListStackSetOperationResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStackSetOperationResultsRequest, ListStackSetOperationResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStackSetOperationsResult> listStackSetOperationsAsync(ListStackSetOperationsRequest request) {

        return listStackSetOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackSetOperationsResult> listStackSetOperationsAsync(ListStackSetOperationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStackSetOperationsRequest, ListStackSetOperationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStackSetsResult> listStackSetsAsync(ListStackSetsRequest request) {

        return listStackSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackSetsResult> listStackSetsAsync(ListStackSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStackSetsRequest, ListStackSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(ListStacksRequest request) {

        return listStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(ListStacksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListStacks operation.
     *
     * @see #listStacksAsync(ListStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync() {

        return listStacksAsync(new ListStacksRequest());
    }

    /**
     * Simplified method form for invoking the ListStacks operation with an AsyncHandler.
     *
     * @see #listStacksAsync(ListStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler) {

        return listStacksAsync(new ListStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetStackPolicyResult> setStackPolicyAsync(SetStackPolicyRequest request) {

        return setStackPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetStackPolicyResult> setStackPolicyAsync(SetStackPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<SetStackPolicyRequest, SetStackPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SignalResourceResult> signalResourceAsync(SignalResourceRequest request) {

        return signalResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignalResourceResult> signalResourceAsync(SignalResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<SignalResourceRequest, SignalResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopStackSetOperationResult> stopStackSetOperationAsync(StopStackSetOperationRequest request) {

        return stopStackSetOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStackSetOperationResult> stopStackSetOperationAsync(StopStackSetOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<StopStackSetOperationRequest, StopStackSetOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStackInstancesResult> updateStackInstancesAsync(UpdateStackInstancesRequest request) {

        return updateStackInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackInstancesResult> updateStackInstancesAsync(UpdateStackInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStackInstancesRequest, UpdateStackInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStackSetResult> updateStackSetAsync(UpdateStackSetRequest request) {

        return updateStackSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackSetResult> updateStackSetAsync(UpdateStackSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStackSetRequest, UpdateStackSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTerminationProtectionResult> updateTerminationProtectionAsync(UpdateTerminationProtectionRequest request) {

        return updateTerminationProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTerminationProtectionResult> updateTerminationProtectionAsync(UpdateTerminationProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTerminationProtectionRequest, UpdateTerminationProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest request) {

        return validateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
