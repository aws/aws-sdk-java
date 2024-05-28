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
package com.amazonaws.services.resiliencehub;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;

/**
 * Abstract implementation of {@code AWSResilienceHubAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSResilienceHubAsync extends AbstractAWSResilienceHub implements AWSResilienceHubAsync {

    protected AbstractAWSResilienceHubAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddDraftAppVersionResourceMappingsResult> addDraftAppVersionResourceMappingsAsync(
            AddDraftAppVersionResourceMappingsRequest request) {

        return addDraftAppVersionResourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddDraftAppVersionResourceMappingsResult> addDraftAppVersionResourceMappingsAsync(
            AddDraftAppVersionResourceMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddDraftAppVersionResourceMappingsRequest, AddDraftAppVersionResourceMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateRecommendationStatusResult> batchUpdateRecommendationStatusAsync(
            BatchUpdateRecommendationStatusRequest request) {

        return batchUpdateRecommendationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateRecommendationStatusResult> batchUpdateRecommendationStatusAsync(
            BatchUpdateRecommendationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateRecommendationStatusRequest, BatchUpdateRecommendationStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppVersionAppComponentResult> createAppVersionAppComponentAsync(CreateAppVersionAppComponentRequest request) {

        return createAppVersionAppComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppVersionAppComponentResult> createAppVersionAppComponentAsync(CreateAppVersionAppComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppVersionAppComponentRequest, CreateAppVersionAppComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppVersionResourceResult> createAppVersionResourceAsync(CreateAppVersionResourceRequest request) {

        return createAppVersionResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppVersionResourceResult> createAppVersionResourceAsync(CreateAppVersionResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppVersionResourceRequest, CreateAppVersionResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRecommendationTemplateResult> createRecommendationTemplateAsync(CreateRecommendationTemplateRequest request) {

        return createRecommendationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecommendationTemplateResult> createRecommendationTemplateAsync(CreateRecommendationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRecommendationTemplateRequest, CreateRecommendationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResiliencyPolicyResult> createResiliencyPolicyAsync(CreateResiliencyPolicyRequest request) {

        return createResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResiliencyPolicyResult> createResiliencyPolicyAsync(CreateResiliencyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResiliencyPolicyRequest, CreateResiliencyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppAssessmentResult> deleteAppAssessmentAsync(DeleteAppAssessmentRequest request) {

        return deleteAppAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppAssessmentResult> deleteAppAssessmentAsync(DeleteAppAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppAssessmentRequest, DeleteAppAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInputSourceResult> deleteAppInputSourceAsync(DeleteAppInputSourceRequest request) {

        return deleteAppInputSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInputSourceResult> deleteAppInputSourceAsync(DeleteAppInputSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInputSourceRequest, DeleteAppInputSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppVersionAppComponentResult> deleteAppVersionAppComponentAsync(DeleteAppVersionAppComponentRequest request) {

        return deleteAppVersionAppComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppVersionAppComponentResult> deleteAppVersionAppComponentAsync(DeleteAppVersionAppComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppVersionAppComponentRequest, DeleteAppVersionAppComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppVersionResourceResult> deleteAppVersionResourceAsync(DeleteAppVersionResourceRequest request) {

        return deleteAppVersionResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppVersionResourceResult> deleteAppVersionResourceAsync(DeleteAppVersionResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppVersionResourceRequest, DeleteAppVersionResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommendationTemplateResult> deleteRecommendationTemplateAsync(DeleteRecommendationTemplateRequest request) {

        return deleteRecommendationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommendationTemplateResult> deleteRecommendationTemplateAsync(DeleteRecommendationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRecommendationTemplateRequest, DeleteRecommendationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResiliencyPolicyResult> deleteResiliencyPolicyAsync(DeleteResiliencyPolicyRequest request) {

        return deleteResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResiliencyPolicyResult> deleteResiliencyPolicyAsync(DeleteResiliencyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResiliencyPolicyRequest, DeleteResiliencyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request) {

        return describeAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppAssessmentResult> describeAppAssessmentAsync(DescribeAppAssessmentRequest request) {

        return describeAppAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppAssessmentResult> describeAppAssessmentAsync(DescribeAppAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppAssessmentRequest, DescribeAppAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResult> describeAppVersionAsync(DescribeAppVersionRequest request) {

        return describeAppVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResult> describeAppVersionAsync(DescribeAppVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionRequest, DescribeAppVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionAppComponentResult> describeAppVersionAppComponentAsync(DescribeAppVersionAppComponentRequest request) {

        return describeAppVersionAppComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionAppComponentResult> describeAppVersionAppComponentAsync(DescribeAppVersionAppComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionAppComponentRequest, DescribeAppVersionAppComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResourceResult> describeAppVersionResourceAsync(DescribeAppVersionResourceRequest request) {

        return describeAppVersionResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResourceResult> describeAppVersionResourceAsync(DescribeAppVersionResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionResourceRequest, DescribeAppVersionResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResourcesResolutionStatusResult> describeAppVersionResourcesResolutionStatusAsync(
            DescribeAppVersionResourcesResolutionStatusRequest request) {

        return describeAppVersionResourcesResolutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResourcesResolutionStatusResult> describeAppVersionResourcesResolutionStatusAsync(
            DescribeAppVersionResourcesResolutionStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionResourcesResolutionStatusRequest, DescribeAppVersionResourcesResolutionStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionTemplateResult> describeAppVersionTemplateAsync(DescribeAppVersionTemplateRequest request) {

        return describeAppVersionTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionTemplateResult> describeAppVersionTemplateAsync(DescribeAppVersionTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionTemplateRequest, DescribeAppVersionTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDraftAppVersionResourcesImportStatusResult> describeDraftAppVersionResourcesImportStatusAsync(
            DescribeDraftAppVersionResourcesImportStatusRequest request) {

        return describeDraftAppVersionResourcesImportStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDraftAppVersionResourcesImportStatusResult> describeDraftAppVersionResourcesImportStatusAsync(
            DescribeDraftAppVersionResourcesImportStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDraftAppVersionResourcesImportStatusRequest, DescribeDraftAppVersionResourcesImportStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResiliencyPolicyResult> describeResiliencyPolicyAsync(DescribeResiliencyPolicyRequest request) {

        return describeResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResiliencyPolicyResult> describeResiliencyPolicyAsync(DescribeResiliencyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResiliencyPolicyRequest, DescribeResiliencyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportResourcesToDraftAppVersionResult> importResourcesToDraftAppVersionAsync(
            ImportResourcesToDraftAppVersionRequest request) {

        return importResourcesToDraftAppVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportResourcesToDraftAppVersionResult> importResourcesToDraftAppVersionAsync(
            ImportResourcesToDraftAppVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportResourcesToDraftAppVersionRequest, ImportResourcesToDraftAppVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAlarmRecommendationsResult> listAlarmRecommendationsAsync(ListAlarmRecommendationsRequest request) {

        return listAlarmRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlarmRecommendationsResult> listAlarmRecommendationsAsync(ListAlarmRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAlarmRecommendationsRequest, ListAlarmRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentComplianceDriftsResult> listAppAssessmentComplianceDriftsAsync(
            ListAppAssessmentComplianceDriftsRequest request) {

        return listAppAssessmentComplianceDriftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentComplianceDriftsResult> listAppAssessmentComplianceDriftsAsync(
            ListAppAssessmentComplianceDriftsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppAssessmentComplianceDriftsRequest, ListAppAssessmentComplianceDriftsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentResourceDriftsResult> listAppAssessmentResourceDriftsAsync(
            ListAppAssessmentResourceDriftsRequest request) {

        return listAppAssessmentResourceDriftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentResourceDriftsResult> listAppAssessmentResourceDriftsAsync(
            ListAppAssessmentResourceDriftsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppAssessmentResourceDriftsRequest, ListAppAssessmentResourceDriftsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentsResult> listAppAssessmentsAsync(ListAppAssessmentsRequest request) {

        return listAppAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentsResult> listAppAssessmentsAsync(ListAppAssessmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppAssessmentsRequest, ListAppAssessmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentCompliancesResult> listAppComponentCompliancesAsync(ListAppComponentCompliancesRequest request) {

        return listAppComponentCompliancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentCompliancesResult> listAppComponentCompliancesAsync(ListAppComponentCompliancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppComponentCompliancesRequest, ListAppComponentCompliancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentRecommendationsResult> listAppComponentRecommendationsAsync(
            ListAppComponentRecommendationsRequest request) {

        return listAppComponentRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentRecommendationsResult> listAppComponentRecommendationsAsync(
            ListAppComponentRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppComponentRecommendationsRequest, ListAppComponentRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppInputSourcesResult> listAppInputSourcesAsync(ListAppInputSourcesRequest request) {

        return listAppInputSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInputSourcesResult> listAppInputSourcesAsync(ListAppInputSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppInputSourcesRequest, ListAppInputSourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionAppComponentsResult> listAppVersionAppComponentsAsync(ListAppVersionAppComponentsRequest request) {

        return listAppVersionAppComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionAppComponentsResult> listAppVersionAppComponentsAsync(ListAppVersionAppComponentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionAppComponentsRequest, ListAppVersionAppComponentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourceMappingsResult> listAppVersionResourceMappingsAsync(ListAppVersionResourceMappingsRequest request) {

        return listAppVersionResourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourceMappingsResult> listAppVersionResourceMappingsAsync(ListAppVersionResourceMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionResourceMappingsRequest, ListAppVersionResourceMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourcesResult> listAppVersionResourcesAsync(ListAppVersionResourcesRequest request) {

        return listAppVersionResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourcesResult> listAppVersionResourcesAsync(ListAppVersionResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionResourcesRequest, ListAppVersionResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionsResult> listAppVersionsAsync(ListAppVersionsRequest request) {

        return listAppVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionsResult> listAppVersionsAsync(ListAppVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionsRequest, ListAppVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationTemplatesResult> listRecommendationTemplatesAsync(ListRecommendationTemplatesRequest request) {

        return listRecommendationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationTemplatesResult> listRecommendationTemplatesAsync(ListRecommendationTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationTemplatesRequest, ListRecommendationTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResiliencyPoliciesResult> listResiliencyPoliciesAsync(ListResiliencyPoliciesRequest request) {

        return listResiliencyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResiliencyPoliciesResult> listResiliencyPoliciesAsync(ListResiliencyPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResiliencyPoliciesRequest, ListResiliencyPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSopRecommendationsResult> listSopRecommendationsAsync(ListSopRecommendationsRequest request) {

        return listSopRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSopRecommendationsResult> listSopRecommendationsAsync(ListSopRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSopRecommendationsRequest, ListSopRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSuggestedResiliencyPoliciesResult> listSuggestedResiliencyPoliciesAsync(
            ListSuggestedResiliencyPoliciesRequest request) {

        return listSuggestedResiliencyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuggestedResiliencyPoliciesResult> listSuggestedResiliencyPoliciesAsync(
            ListSuggestedResiliencyPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSuggestedResiliencyPoliciesRequest, ListSuggestedResiliencyPoliciesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTestRecommendationsResult> listTestRecommendationsAsync(ListTestRecommendationsRequest request) {

        return listTestRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestRecommendationsResult> listTestRecommendationsAsync(ListTestRecommendationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTestRecommendationsRequest, ListTestRecommendationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUnsupportedAppVersionResourcesResult> listUnsupportedAppVersionResourcesAsync(
            ListUnsupportedAppVersionResourcesRequest request) {

        return listUnsupportedAppVersionResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUnsupportedAppVersionResourcesResult> listUnsupportedAppVersionResourcesAsync(
            ListUnsupportedAppVersionResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUnsupportedAppVersionResourcesRequest, ListUnsupportedAppVersionResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PublishAppVersionResult> publishAppVersionAsync(PublishAppVersionRequest request) {

        return publishAppVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishAppVersionResult> publishAppVersionAsync(PublishAppVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<PublishAppVersionRequest, PublishAppVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutDraftAppVersionTemplateResult> putDraftAppVersionTemplateAsync(PutDraftAppVersionTemplateRequest request) {

        return putDraftAppVersionTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDraftAppVersionTemplateResult> putDraftAppVersionTemplateAsync(PutDraftAppVersionTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDraftAppVersionTemplateRequest, PutDraftAppVersionTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveDraftAppVersionResourceMappingsResult> removeDraftAppVersionResourceMappingsAsync(
            RemoveDraftAppVersionResourceMappingsRequest request) {

        return removeDraftAppVersionResourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveDraftAppVersionResourceMappingsResult> removeDraftAppVersionResourceMappingsAsync(
            RemoveDraftAppVersionResourceMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveDraftAppVersionResourceMappingsRequest, RemoveDraftAppVersionResourceMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResolveAppVersionResourcesResult> resolveAppVersionResourcesAsync(ResolveAppVersionResourcesRequest request) {

        return resolveAppVersionResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveAppVersionResourcesResult> resolveAppVersionResourcesAsync(ResolveAppVersionResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ResolveAppVersionResourcesRequest, ResolveAppVersionResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartAppAssessmentResult> startAppAssessmentAsync(StartAppAssessmentRequest request) {

        return startAppAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAppAssessmentResult> startAppAssessmentAsync(StartAppAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<StartAppAssessmentRequest, StartAppAssessmentResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppVersionResult> updateAppVersionAsync(UpdateAppVersionRequest request) {

        return updateAppVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppVersionResult> updateAppVersionAsync(UpdateAppVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppVersionRequest, UpdateAppVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppVersionAppComponentResult> updateAppVersionAppComponentAsync(UpdateAppVersionAppComponentRequest request) {

        return updateAppVersionAppComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppVersionAppComponentResult> updateAppVersionAppComponentAsync(UpdateAppVersionAppComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppVersionAppComponentRequest, UpdateAppVersionAppComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppVersionResourceResult> updateAppVersionResourceAsync(UpdateAppVersionResourceRequest request) {

        return updateAppVersionResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppVersionResourceResult> updateAppVersionResourceAsync(UpdateAppVersionResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppVersionResourceRequest, UpdateAppVersionResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateResiliencyPolicyResult> updateResiliencyPolicyAsync(UpdateResiliencyPolicyRequest request) {

        return updateResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResiliencyPolicyResult> updateResiliencyPolicyAsync(UpdateResiliencyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateResiliencyPolicyRequest, UpdateResiliencyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
