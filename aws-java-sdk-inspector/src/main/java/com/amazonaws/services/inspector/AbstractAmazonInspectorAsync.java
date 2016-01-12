/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.inspector;

import com.amazonaws.services.inspector.model.*;

/**
 * Abstract implementation of {@code AmazonInspectorAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonInspectorAsync extends AbstractAmazonInspector
        implements AmazonInspectorAsync {

    protected AbstractAmazonInspectorAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(
            AddAttributesToFindingsRequest request) {

        return addAttributesToFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(
            AddAttributesToFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddAttributesToFindingsRequest, AddAttributesToFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachAssessmentAndRulesPackageResult> attachAssessmentAndRulesPackageAsync(
            AttachAssessmentAndRulesPackageRequest request) {

        return attachAssessmentAndRulesPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachAssessmentAndRulesPackageResult> attachAssessmentAndRulesPackageAsync(
            AttachAssessmentAndRulesPackageRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachAssessmentAndRulesPackageRequest, AttachAssessmentAndRulesPackageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(
            CreateAssessmentRequest request) {

        return createAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(
            CreateAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentRequest, CreateAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(
            CreateResourceGroupRequest request) {

        return createResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(
            CreateResourceGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResourceGroupRequest, CreateResourceGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(
            DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(
            DeleteApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(
            DeleteAssessmentRequest request) {

        return deleteAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(
            DeleteAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRequest, DeleteAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(
            DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(
            DeleteRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(
            DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(
            DescribeApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentResult> describeAssessmentAsync(
            DescribeAssessmentRequest request) {

        return describeAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentResult> describeAssessmentAsync(
            DescribeAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAssessmentRequest, DescribeAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            DescribeCrossAccountAccessRoleRequest request) {

        return describeCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            DescribeCrossAccountAccessRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCrossAccountAccessRoleRequest, DescribeCrossAccountAccessRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingResult> describeFindingAsync(
            DescribeFindingRequest request) {

        return describeFindingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingResult> describeFindingAsync(
            DescribeFindingRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFindingRequest, DescribeFindingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupResult> describeResourceGroupAsync(
            DescribeResourceGroupRequest request) {

        return describeResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupResult> describeResourceGroupAsync(
            DescribeResourceGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceGroupRequest, DescribeResourceGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackageResult> describeRulesPackageAsync(
            DescribeRulesPackageRequest request) {

        return describeRulesPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackageResult> describeRulesPackageAsync(
            DescribeRulesPackageRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRulesPackageRequest, DescribeRulesPackageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRunResult> describeRunAsync(
            DescribeRunRequest request) {

        return describeRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRunResult> describeRunAsync(
            DescribeRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRunRequest, DescribeRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachAssessmentAndRulesPackageResult> detachAssessmentAndRulesPackageAsync(
            DetachAssessmentAndRulesPackageRequest request) {

        return detachAssessmentAndRulesPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachAssessmentAndRulesPackageResult> detachAssessmentAndRulesPackageAsync(
            DetachAssessmentAndRulesPackageRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachAssessmentAndRulesPackageRequest, DetachAssessmentAndRulesPackageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentTelemetryResult> getAssessmentTelemetryAsync(
            GetAssessmentTelemetryRequest request) {

        return getAssessmentTelemetryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentTelemetryResult> getAssessmentTelemetryAsync(
            GetAssessmentTelemetryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentTelemetryRequest, GetAssessmentTelemetryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            ListApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentAgentsResult> listAssessmentAgentsAsync(
            ListAssessmentAgentsRequest request) {

        return listAssessmentAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentAgentsResult> listAssessmentAgentsAsync(
            ListAssessmentAgentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentAgentsRequest, ListAssessmentAgentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(
            ListAssessmentsRequest request) {

        return listAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(
            ListAssessmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentsRequest, ListAssessmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttachedAssessmentsResult> listAttachedAssessmentsAsync(
            ListAttachedAssessmentsRequest request) {

        return listAttachedAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedAssessmentsResult> listAttachedAssessmentsAsync(
            ListAttachedAssessmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttachedAssessmentsRequest, ListAttachedAssessmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRulesPackagesResult> listAttachedRulesPackagesAsync(
            ListAttachedRulesPackagesRequest request) {

        return listAttachedRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRulesPackagesResult> listAttachedRulesPackagesAsync(
            ListAttachedRulesPackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttachedRulesPackagesRequest, ListAttachedRulesPackagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(
            ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(
            ListFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(
            ListRulesPackagesRequest request) {

        return listRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(
            ListRulesPackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRulesPackagesRequest, ListRulesPackagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            ListRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<LocalizeTextResult> localizeTextAsync(
            LocalizeTextRequest request) {

        return localizeTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LocalizeTextResult> localizeTextAsync(
            LocalizeTextRequest request,
            com.amazonaws.handlers.AsyncHandler<LocalizeTextRequest, LocalizeTextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsForResourceGroupResult> previewAgentsForResourceGroupAsync(
            PreviewAgentsForResourceGroupRequest request) {

        return previewAgentsForResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsForResourceGroupResult> previewAgentsForResourceGroupAsync(
            PreviewAgentsForResourceGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<PreviewAgentsForResourceGroupRequest, PreviewAgentsForResourceGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(
            RegisterCrossAccountAccessRoleRequest request) {

        return registerCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(
            RegisterCrossAccountAccessRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterCrossAccountAccessRoleRequest, RegisterCrossAccountAccessRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(
            RemoveAttributesFromFindingsRequest request) {

        return removeAttributesFromFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(
            RemoveAttributesFromFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveAttributesFromFindingsRequest, RemoveAttributesFromFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RunAssessmentResult> runAssessmentAsync(
            RunAssessmentRequest request) {

        return runAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunAssessmentResult> runAssessmentAsync(
            RunAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<RunAssessmentRequest, RunAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(
            SetTagsForResourceRequest request) {

        return setTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(
            SetTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTagsForResourceRequest, SetTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionResult> startDataCollectionAsync(
            StartDataCollectionRequest request) {

        return startDataCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionResult> startDataCollectionAsync(
            StartDataCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDataCollectionRequest, StartDataCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionResult> stopDataCollectionAsync(
            StopDataCollectionRequest request) {

        return stopDataCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionResult> stopDataCollectionAsync(
            StopDataCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDataCollectionRequest, StopDataCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(
            UpdateAssessmentRequest request) {

        return updateAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(
            UpdateAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentRequest, UpdateAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
