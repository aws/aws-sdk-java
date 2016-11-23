/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.cloudformation.model.*;

/**
 * Abstract implementation of {@code AmazonCloudFormationAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
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
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest request) {

        return describeStackEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest request) {

        return describeStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        return describeStacksAsync(new DescribeStacksRequest(), asyncHandler);
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
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest request) {

        return listStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {

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
