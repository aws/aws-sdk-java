/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Resilience Hub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Resilience Hub helps you proactively prepare and protect your Amazon Web Services applications from disruptions.
 * Resilience Hub offers continuous resiliency assessment and validation that integrates into your software development
 * lifecycle. This enables you to uncover resiliency weaknesses, ensure recovery time objective (RTO) and recovery point
 * objective (RPO) targets for your applications are met, and resolve issues before they are released into production.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResilienceHubAsyncClient extends AWSResilienceHubClient implements AWSResilienceHubAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSResilienceHubAsyncClientBuilder asyncBuilder() {
        return AWSResilienceHubAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resilience Hub using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSResilienceHubAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resilience Hub using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSResilienceHubAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddDraftAppVersionResourceMappingsResult> addDraftAppVersionResourceMappingsAsync(
            AddDraftAppVersionResourceMappingsRequest request) {

        return addDraftAppVersionResourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddDraftAppVersionResourceMappingsResult> addDraftAppVersionResourceMappingsAsync(
            final AddDraftAppVersionResourceMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddDraftAppVersionResourceMappingsRequest, AddDraftAppVersionResourceMappingsResult> asyncHandler) {
        final AddDraftAppVersionResourceMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddDraftAppVersionResourceMappingsResult>() {
            @Override
            public AddDraftAppVersionResourceMappingsResult call() throws Exception {
                AddDraftAppVersionResourceMappingsResult result = null;

                try {
                    result = executeAddDraftAppVersionResourceMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {
        final CreateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppResult>() {
            @Override
            public CreateAppResult call() throws Exception {
                CreateAppResult result = null;

                try {
                    result = executeCreateApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRecommendationTemplateResult> createRecommendationTemplateAsync(CreateRecommendationTemplateRequest request) {

        return createRecommendationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecommendationTemplateResult> createRecommendationTemplateAsync(final CreateRecommendationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRecommendationTemplateRequest, CreateRecommendationTemplateResult> asyncHandler) {
        final CreateRecommendationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRecommendationTemplateResult>() {
            @Override
            public CreateRecommendationTemplateResult call() throws Exception {
                CreateRecommendationTemplateResult result = null;

                try {
                    result = executeCreateRecommendationTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResiliencyPolicyResult> createResiliencyPolicyAsync(CreateResiliencyPolicyRequest request) {

        return createResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResiliencyPolicyResult> createResiliencyPolicyAsync(final CreateResiliencyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResiliencyPolicyRequest, CreateResiliencyPolicyResult> asyncHandler) {
        final CreateResiliencyPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResiliencyPolicyResult>() {
            @Override
            public CreateResiliencyPolicyResult call() throws Exception {
                CreateResiliencyPolicyResult result = null;

                try {
                    result = executeCreateResiliencyPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppAssessmentResult> deleteAppAssessmentAsync(DeleteAppAssessmentRequest request) {

        return deleteAppAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppAssessmentResult> deleteAppAssessmentAsync(final DeleteAppAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppAssessmentRequest, DeleteAppAssessmentResult> asyncHandler) {
        final DeleteAppAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppAssessmentResult>() {
            @Override
            public DeleteAppAssessmentResult call() throws Exception {
                DeleteAppAssessmentResult result = null;

                try {
                    result = executeDeleteAppAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommendationTemplateResult> deleteRecommendationTemplateAsync(DeleteRecommendationTemplateRequest request) {

        return deleteRecommendationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommendationTemplateResult> deleteRecommendationTemplateAsync(final DeleteRecommendationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecommendationTemplateRequest, DeleteRecommendationTemplateResult> asyncHandler) {
        final DeleteRecommendationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecommendationTemplateResult>() {
            @Override
            public DeleteRecommendationTemplateResult call() throws Exception {
                DeleteRecommendationTemplateResult result = null;

                try {
                    result = executeDeleteRecommendationTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResiliencyPolicyResult> deleteResiliencyPolicyAsync(DeleteResiliencyPolicyRequest request) {

        return deleteResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResiliencyPolicyResult> deleteResiliencyPolicyAsync(final DeleteResiliencyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResiliencyPolicyRequest, DeleteResiliencyPolicyResult> asyncHandler) {
        final DeleteResiliencyPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResiliencyPolicyResult>() {
            @Override
            public DeleteResiliencyPolicyResult call() throws Exception {
                DeleteResiliencyPolicyResult result = null;

                try {
                    result = executeDeleteResiliencyPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request) {

        return describeAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(final DescribeAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler) {
        final DescribeAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppResult>() {
            @Override
            public DescribeAppResult call() throws Exception {
                DescribeAppResult result = null;

                try {
                    result = executeDescribeApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppAssessmentResult> describeAppAssessmentAsync(DescribeAppAssessmentRequest request) {

        return describeAppAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppAssessmentResult> describeAppAssessmentAsync(final DescribeAppAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppAssessmentRequest, DescribeAppAssessmentResult> asyncHandler) {
        final DescribeAppAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppAssessmentResult>() {
            @Override
            public DescribeAppAssessmentResult call() throws Exception {
                DescribeAppAssessmentResult result = null;

                try {
                    result = executeDescribeAppAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResourcesResolutionStatusResult> describeAppVersionResourcesResolutionStatusAsync(
            DescribeAppVersionResourcesResolutionStatusRequest request) {

        return describeAppVersionResourcesResolutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionResourcesResolutionStatusResult> describeAppVersionResourcesResolutionStatusAsync(
            final DescribeAppVersionResourcesResolutionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppVersionResourcesResolutionStatusRequest, DescribeAppVersionResourcesResolutionStatusResult> asyncHandler) {
        final DescribeAppVersionResourcesResolutionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppVersionResourcesResolutionStatusResult>() {
            @Override
            public DescribeAppVersionResourcesResolutionStatusResult call() throws Exception {
                DescribeAppVersionResourcesResolutionStatusResult result = null;

                try {
                    result = executeDescribeAppVersionResourcesResolutionStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionTemplateResult> describeAppVersionTemplateAsync(DescribeAppVersionTemplateRequest request) {

        return describeAppVersionTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppVersionTemplateResult> describeAppVersionTemplateAsync(final DescribeAppVersionTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppVersionTemplateRequest, DescribeAppVersionTemplateResult> asyncHandler) {
        final DescribeAppVersionTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppVersionTemplateResult>() {
            @Override
            public DescribeAppVersionTemplateResult call() throws Exception {
                DescribeAppVersionTemplateResult result = null;

                try {
                    result = executeDescribeAppVersionTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDraftAppVersionResourcesImportStatusResult> describeDraftAppVersionResourcesImportStatusAsync(
            DescribeDraftAppVersionResourcesImportStatusRequest request) {

        return describeDraftAppVersionResourcesImportStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDraftAppVersionResourcesImportStatusResult> describeDraftAppVersionResourcesImportStatusAsync(
            final DescribeDraftAppVersionResourcesImportStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDraftAppVersionResourcesImportStatusRequest, DescribeDraftAppVersionResourcesImportStatusResult> asyncHandler) {
        final DescribeDraftAppVersionResourcesImportStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDraftAppVersionResourcesImportStatusResult>() {
            @Override
            public DescribeDraftAppVersionResourcesImportStatusResult call() throws Exception {
                DescribeDraftAppVersionResourcesImportStatusResult result = null;

                try {
                    result = executeDescribeDraftAppVersionResourcesImportStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResiliencyPolicyResult> describeResiliencyPolicyAsync(DescribeResiliencyPolicyRequest request) {

        return describeResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResiliencyPolicyResult> describeResiliencyPolicyAsync(final DescribeResiliencyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResiliencyPolicyRequest, DescribeResiliencyPolicyResult> asyncHandler) {
        final DescribeResiliencyPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResiliencyPolicyResult>() {
            @Override
            public DescribeResiliencyPolicyResult call() throws Exception {
                DescribeResiliencyPolicyResult result = null;

                try {
                    result = executeDescribeResiliencyPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportResourcesToDraftAppVersionResult> importResourcesToDraftAppVersionAsync(
            ImportResourcesToDraftAppVersionRequest request) {

        return importResourcesToDraftAppVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportResourcesToDraftAppVersionResult> importResourcesToDraftAppVersionAsync(
            final ImportResourcesToDraftAppVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportResourcesToDraftAppVersionRequest, ImportResourcesToDraftAppVersionResult> asyncHandler) {
        final ImportResourcesToDraftAppVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportResourcesToDraftAppVersionResult>() {
            @Override
            public ImportResourcesToDraftAppVersionResult call() throws Exception {
                ImportResourcesToDraftAppVersionResult result = null;

                try {
                    result = executeImportResourcesToDraftAppVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAlarmRecommendationsResult> listAlarmRecommendationsAsync(ListAlarmRecommendationsRequest request) {

        return listAlarmRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlarmRecommendationsResult> listAlarmRecommendationsAsync(final ListAlarmRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAlarmRecommendationsRequest, ListAlarmRecommendationsResult> asyncHandler) {
        final ListAlarmRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAlarmRecommendationsResult>() {
            @Override
            public ListAlarmRecommendationsResult call() throws Exception {
                ListAlarmRecommendationsResult result = null;

                try {
                    result = executeListAlarmRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentsResult> listAppAssessmentsAsync(ListAppAssessmentsRequest request) {

        return listAppAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppAssessmentsResult> listAppAssessmentsAsync(final ListAppAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppAssessmentsRequest, ListAppAssessmentsResult> asyncHandler) {
        final ListAppAssessmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppAssessmentsResult>() {
            @Override
            public ListAppAssessmentsResult call() throws Exception {
                ListAppAssessmentsResult result = null;

                try {
                    result = executeListAppAssessments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentCompliancesResult> listAppComponentCompliancesAsync(ListAppComponentCompliancesRequest request) {

        return listAppComponentCompliancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentCompliancesResult> listAppComponentCompliancesAsync(final ListAppComponentCompliancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppComponentCompliancesRequest, ListAppComponentCompliancesResult> asyncHandler) {
        final ListAppComponentCompliancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppComponentCompliancesResult>() {
            @Override
            public ListAppComponentCompliancesResult call() throws Exception {
                ListAppComponentCompliancesResult result = null;

                try {
                    result = executeListAppComponentCompliances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentRecommendationsResult> listAppComponentRecommendationsAsync(
            ListAppComponentRecommendationsRequest request) {

        return listAppComponentRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppComponentRecommendationsResult> listAppComponentRecommendationsAsync(
            final ListAppComponentRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppComponentRecommendationsRequest, ListAppComponentRecommendationsResult> asyncHandler) {
        final ListAppComponentRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppComponentRecommendationsResult>() {
            @Override
            public ListAppComponentRecommendationsResult call() throws Exception {
                ListAppComponentRecommendationsResult result = null;

                try {
                    result = executeListAppComponentRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourceMappingsResult> listAppVersionResourceMappingsAsync(ListAppVersionResourceMappingsRequest request) {

        return listAppVersionResourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourceMappingsResult> listAppVersionResourceMappingsAsync(
            final ListAppVersionResourceMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppVersionResourceMappingsRequest, ListAppVersionResourceMappingsResult> asyncHandler) {
        final ListAppVersionResourceMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppVersionResourceMappingsResult>() {
            @Override
            public ListAppVersionResourceMappingsResult call() throws Exception {
                ListAppVersionResourceMappingsResult result = null;

                try {
                    result = executeListAppVersionResourceMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourcesResult> listAppVersionResourcesAsync(ListAppVersionResourcesRequest request) {

        return listAppVersionResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionResourcesResult> listAppVersionResourcesAsync(final ListAppVersionResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppVersionResourcesRequest, ListAppVersionResourcesResult> asyncHandler) {
        final ListAppVersionResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppVersionResourcesResult>() {
            @Override
            public ListAppVersionResourcesResult call() throws Exception {
                ListAppVersionResourcesResult result = null;

                try {
                    result = executeListAppVersionResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionsResult> listAppVersionsAsync(ListAppVersionsRequest request) {

        return listAppVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppVersionsResult> listAppVersionsAsync(final ListAppVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppVersionsRequest, ListAppVersionsResult> asyncHandler) {
        final ListAppVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppVersionsResult>() {
            @Override
            public ListAppVersionsResult call() throws Exception {
                ListAppVersionsResult result = null;

                try {
                    result = executeListAppVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(final ListAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {
        final ListAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppsResult>() {
            @Override
            public ListAppsResult call() throws Exception {
                ListAppsResult result = null;

                try {
                    result = executeListApps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationTemplatesResult> listRecommendationTemplatesAsync(ListRecommendationTemplatesRequest request) {

        return listRecommendationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationTemplatesResult> listRecommendationTemplatesAsync(final ListRecommendationTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendationTemplatesRequest, ListRecommendationTemplatesResult> asyncHandler) {
        final ListRecommendationTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendationTemplatesResult>() {
            @Override
            public ListRecommendationTemplatesResult call() throws Exception {
                ListRecommendationTemplatesResult result = null;

                try {
                    result = executeListRecommendationTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResiliencyPoliciesResult> listResiliencyPoliciesAsync(ListResiliencyPoliciesRequest request) {

        return listResiliencyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResiliencyPoliciesResult> listResiliencyPoliciesAsync(final ListResiliencyPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResiliencyPoliciesRequest, ListResiliencyPoliciesResult> asyncHandler) {
        final ListResiliencyPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResiliencyPoliciesResult>() {
            @Override
            public ListResiliencyPoliciesResult call() throws Exception {
                ListResiliencyPoliciesResult result = null;

                try {
                    result = executeListResiliencyPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSopRecommendationsResult> listSopRecommendationsAsync(ListSopRecommendationsRequest request) {

        return listSopRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSopRecommendationsResult> listSopRecommendationsAsync(final ListSopRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSopRecommendationsRequest, ListSopRecommendationsResult> asyncHandler) {
        final ListSopRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSopRecommendationsResult>() {
            @Override
            public ListSopRecommendationsResult call() throws Exception {
                ListSopRecommendationsResult result = null;

                try {
                    result = executeListSopRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSuggestedResiliencyPoliciesResult> listSuggestedResiliencyPoliciesAsync(
            ListSuggestedResiliencyPoliciesRequest request) {

        return listSuggestedResiliencyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuggestedResiliencyPoliciesResult> listSuggestedResiliencyPoliciesAsync(
            final ListSuggestedResiliencyPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSuggestedResiliencyPoliciesRequest, ListSuggestedResiliencyPoliciesResult> asyncHandler) {
        final ListSuggestedResiliencyPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSuggestedResiliencyPoliciesResult>() {
            @Override
            public ListSuggestedResiliencyPoliciesResult call() throws Exception {
                ListSuggestedResiliencyPoliciesResult result = null;

                try {
                    result = executeListSuggestedResiliencyPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTestRecommendationsResult> listTestRecommendationsAsync(ListTestRecommendationsRequest request) {

        return listTestRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestRecommendationsResult> listTestRecommendationsAsync(final ListTestRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestRecommendationsRequest, ListTestRecommendationsResult> asyncHandler) {
        final ListTestRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestRecommendationsResult>() {
            @Override
            public ListTestRecommendationsResult call() throws Exception {
                ListTestRecommendationsResult result = null;

                try {
                    result = executeListTestRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUnsupportedAppVersionResourcesResult> listUnsupportedAppVersionResourcesAsync(
            ListUnsupportedAppVersionResourcesRequest request) {

        return listUnsupportedAppVersionResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUnsupportedAppVersionResourcesResult> listUnsupportedAppVersionResourcesAsync(
            final ListUnsupportedAppVersionResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUnsupportedAppVersionResourcesRequest, ListUnsupportedAppVersionResourcesResult> asyncHandler) {
        final ListUnsupportedAppVersionResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUnsupportedAppVersionResourcesResult>() {
            @Override
            public ListUnsupportedAppVersionResourcesResult call() throws Exception {
                ListUnsupportedAppVersionResourcesResult result = null;

                try {
                    result = executeListUnsupportedAppVersionResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PublishAppVersionResult> publishAppVersionAsync(PublishAppVersionRequest request) {

        return publishAppVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishAppVersionResult> publishAppVersionAsync(final PublishAppVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishAppVersionRequest, PublishAppVersionResult> asyncHandler) {
        final PublishAppVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishAppVersionResult>() {
            @Override
            public PublishAppVersionResult call() throws Exception {
                PublishAppVersionResult result = null;

                try {
                    result = executePublishAppVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutDraftAppVersionTemplateResult> putDraftAppVersionTemplateAsync(PutDraftAppVersionTemplateRequest request) {

        return putDraftAppVersionTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDraftAppVersionTemplateResult> putDraftAppVersionTemplateAsync(final PutDraftAppVersionTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDraftAppVersionTemplateRequest, PutDraftAppVersionTemplateResult> asyncHandler) {
        final PutDraftAppVersionTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDraftAppVersionTemplateResult>() {
            @Override
            public PutDraftAppVersionTemplateResult call() throws Exception {
                PutDraftAppVersionTemplateResult result = null;

                try {
                    result = executePutDraftAppVersionTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveDraftAppVersionResourceMappingsResult> removeDraftAppVersionResourceMappingsAsync(
            RemoveDraftAppVersionResourceMappingsRequest request) {

        return removeDraftAppVersionResourceMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveDraftAppVersionResourceMappingsResult> removeDraftAppVersionResourceMappingsAsync(
            final RemoveDraftAppVersionResourceMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveDraftAppVersionResourceMappingsRequest, RemoveDraftAppVersionResourceMappingsResult> asyncHandler) {
        final RemoveDraftAppVersionResourceMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveDraftAppVersionResourceMappingsResult>() {
            @Override
            public RemoveDraftAppVersionResourceMappingsResult call() throws Exception {
                RemoveDraftAppVersionResourceMappingsResult result = null;

                try {
                    result = executeRemoveDraftAppVersionResourceMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResolveAppVersionResourcesResult> resolveAppVersionResourcesAsync(ResolveAppVersionResourcesRequest request) {

        return resolveAppVersionResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveAppVersionResourcesResult> resolveAppVersionResourcesAsync(final ResolveAppVersionResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResolveAppVersionResourcesRequest, ResolveAppVersionResourcesResult> asyncHandler) {
        final ResolveAppVersionResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResolveAppVersionResourcesResult>() {
            @Override
            public ResolveAppVersionResourcesResult call() throws Exception {
                ResolveAppVersionResourcesResult result = null;

                try {
                    result = executeResolveAppVersionResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartAppAssessmentResult> startAppAssessmentAsync(StartAppAssessmentRequest request) {

        return startAppAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAppAssessmentResult> startAppAssessmentAsync(final StartAppAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAppAssessmentRequest, StartAppAssessmentResult> asyncHandler) {
        final StartAppAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAppAssessmentResult>() {
            @Override
            public StartAppAssessmentResult call() throws Exception {
                StartAppAssessmentResult result = null;

                try {
                    result = executeStartAppAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(final UpdateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler) {
        final UpdateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppResult>() {
            @Override
            public UpdateAppResult call() throws Exception {
                UpdateAppResult result = null;

                try {
                    result = executeUpdateApp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResiliencyPolicyResult> updateResiliencyPolicyAsync(UpdateResiliencyPolicyRequest request) {

        return updateResiliencyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResiliencyPolicyResult> updateResiliencyPolicyAsync(final UpdateResiliencyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResiliencyPolicyRequest, UpdateResiliencyPolicyResult> asyncHandler) {
        final UpdateResiliencyPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResiliencyPolicyResult>() {
            @Override
            public UpdateResiliencyPolicyResult call() throws Exception {
                UpdateResiliencyPolicyResult result = null;

                try {
                    result = executeUpdateResiliencyPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
