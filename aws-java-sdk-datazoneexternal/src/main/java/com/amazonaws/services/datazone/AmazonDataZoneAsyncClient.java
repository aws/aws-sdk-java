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
package com.amazonaws.services.datazone;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon DataZone asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon DataZone is a data management service that enables you to catalog, discover, govern, share, and analyze your
 * data. With Amazon DataZone, you can share and access your data across accounts and supported regions. Amazon DataZone
 * simplifies your experience across Amazon Web Services services, including, but not limited to, Amazon Redshift,
 * Amazon Athena, Amazon Web Services Glue, and Amazon Web Services Lake Formation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDataZoneAsyncClient extends AmazonDataZoneClient implements AmazonDataZoneAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonDataZoneAsyncClientBuilder asyncBuilder() {
        return AmazonDataZoneAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DataZone using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDataZoneAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DataZone using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonDataZoneAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptPredictionsResult> acceptPredictionsAsync(AcceptPredictionsRequest request) {

        return acceptPredictionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptPredictionsResult> acceptPredictionsAsync(final AcceptPredictionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptPredictionsRequest, AcceptPredictionsResult> asyncHandler) {
        final AcceptPredictionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptPredictionsResult>() {
            @Override
            public AcceptPredictionsResult call() throws Exception {
                AcceptPredictionsResult result = null;

                try {
                    result = executeAcceptPredictions(finalRequest);
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
    public java.util.concurrent.Future<AcceptSubscriptionRequestResult> acceptSubscriptionRequestAsync(AcceptSubscriptionRequestRequest request) {

        return acceptSubscriptionRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptSubscriptionRequestResult> acceptSubscriptionRequestAsync(final AcceptSubscriptionRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptSubscriptionRequestRequest, AcceptSubscriptionRequestResult> asyncHandler) {
        final AcceptSubscriptionRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptSubscriptionRequestResult>() {
            @Override
            public AcceptSubscriptionRequestResult call() throws Exception {
                AcceptSubscriptionRequestResult result = null;

                try {
                    result = executeAcceptSubscriptionRequest(finalRequest);
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
    public java.util.concurrent.Future<CancelMetadataGenerationRunResult> cancelMetadataGenerationRunAsync(CancelMetadataGenerationRunRequest request) {

        return cancelMetadataGenerationRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMetadataGenerationRunResult> cancelMetadataGenerationRunAsync(final CancelMetadataGenerationRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMetadataGenerationRunRequest, CancelMetadataGenerationRunResult> asyncHandler) {
        final CancelMetadataGenerationRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMetadataGenerationRunResult>() {
            @Override
            public CancelMetadataGenerationRunResult call() throws Exception {
                CancelMetadataGenerationRunResult result = null;

                try {
                    result = executeCancelMetadataGenerationRun(finalRequest);
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
    public java.util.concurrent.Future<CancelSubscriptionResult> cancelSubscriptionAsync(CancelSubscriptionRequest request) {

        return cancelSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSubscriptionResult> cancelSubscriptionAsync(final CancelSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSubscriptionRequest, CancelSubscriptionResult> asyncHandler) {
        final CancelSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSubscriptionResult>() {
            @Override
            public CancelSubscriptionResult call() throws Exception {
                CancelSubscriptionResult result = null;

                try {
                    result = executeCancelSubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest request) {

        return createAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetResult> createAssetAsync(final CreateAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssetRequest, CreateAssetResult> asyncHandler) {
        final CreateAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssetResult>() {
            @Override
            public CreateAssetResult call() throws Exception {
                CreateAssetResult result = null;

                try {
                    result = executeCreateAsset(finalRequest);
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
    public java.util.concurrent.Future<CreateAssetRevisionResult> createAssetRevisionAsync(CreateAssetRevisionRequest request) {

        return createAssetRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetRevisionResult> createAssetRevisionAsync(final CreateAssetRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssetRevisionRequest, CreateAssetRevisionResult> asyncHandler) {
        final CreateAssetRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssetRevisionResult>() {
            @Override
            public CreateAssetRevisionResult call() throws Exception {
                CreateAssetRevisionResult result = null;

                try {
                    result = executeCreateAssetRevision(finalRequest);
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
    public java.util.concurrent.Future<CreateAssetTypeResult> createAssetTypeAsync(CreateAssetTypeRequest request) {

        return createAssetTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetTypeResult> createAssetTypeAsync(final CreateAssetTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssetTypeRequest, CreateAssetTypeResult> asyncHandler) {
        final CreateAssetTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssetTypeResult>() {
            @Override
            public CreateAssetTypeResult call() throws Exception {
                CreateAssetTypeResult result = null;

                try {
                    result = executeCreateAssetType(finalRequest);
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
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest request) {

        return createDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(final CreateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler) {
        final CreateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceResult>() {
            @Override
            public CreateDataSourceResult call() throws Exception {
                CreateDataSourceResult result = null;

                try {
                    result = executeCreateDataSource(finalRequest);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {
        final CreateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentResult>() {
            @Override
            public CreateEnvironmentResult call() throws Exception {
                CreateEnvironmentResult result = null;

                try {
                    result = executeCreateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentProfileResult> createEnvironmentProfileAsync(CreateEnvironmentProfileRequest request) {

        return createEnvironmentProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentProfileResult> createEnvironmentProfileAsync(final CreateEnvironmentProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentProfileRequest, CreateEnvironmentProfileResult> asyncHandler) {
        final CreateEnvironmentProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentProfileResult>() {
            @Override
            public CreateEnvironmentProfileResult call() throws Exception {
                CreateEnvironmentProfileResult result = null;

                try {
                    result = executeCreateEnvironmentProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateFormTypeResult> createFormTypeAsync(CreateFormTypeRequest request) {

        return createFormTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFormTypeResult> createFormTypeAsync(final CreateFormTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFormTypeRequest, CreateFormTypeResult> asyncHandler) {
        final CreateFormTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFormTypeResult>() {
            @Override
            public CreateFormTypeResult call() throws Exception {
                CreateFormTypeResult result = null;

                try {
                    result = executeCreateFormType(finalRequest);
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
    public java.util.concurrent.Future<CreateGlossaryResult> createGlossaryAsync(CreateGlossaryRequest request) {

        return createGlossaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGlossaryResult> createGlossaryAsync(final CreateGlossaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGlossaryRequest, CreateGlossaryResult> asyncHandler) {
        final CreateGlossaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGlossaryResult>() {
            @Override
            public CreateGlossaryResult call() throws Exception {
                CreateGlossaryResult result = null;

                try {
                    result = executeCreateGlossary(finalRequest);
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
    public java.util.concurrent.Future<CreateGlossaryTermResult> createGlossaryTermAsync(CreateGlossaryTermRequest request) {

        return createGlossaryTermAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGlossaryTermResult> createGlossaryTermAsync(final CreateGlossaryTermRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGlossaryTermRequest, CreateGlossaryTermResult> asyncHandler) {
        final CreateGlossaryTermRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGlossaryTermResult>() {
            @Override
            public CreateGlossaryTermResult call() throws Exception {
                CreateGlossaryTermResult result = null;

                try {
                    result = executeCreateGlossaryTerm(finalRequest);
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
    public java.util.concurrent.Future<CreateGroupProfileResult> createGroupProfileAsync(CreateGroupProfileRequest request) {

        return createGroupProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupProfileResult> createGroupProfileAsync(final CreateGroupProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupProfileRequest, CreateGroupProfileResult> asyncHandler) {
        final CreateGroupProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupProfileResult>() {
            @Override
            public CreateGroupProfileResult call() throws Exception {
                CreateGroupProfileResult result = null;

                try {
                    result = executeCreateGroupProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateListingChangeSetResult> createListingChangeSetAsync(CreateListingChangeSetRequest request) {

        return createListingChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateListingChangeSetResult> createListingChangeSetAsync(final CreateListingChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateListingChangeSetRequest, CreateListingChangeSetResult> asyncHandler) {
        final CreateListingChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateListingChangeSetResult>() {
            @Override
            public CreateListingChangeSetResult call() throws Exception {
                CreateListingChangeSetResult result = null;

                try {
                    result = executeCreateListingChangeSet(finalRequest);
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
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(final CreateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {
        final CreateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectResult>() {
            @Override
            public CreateProjectResult call() throws Exception {
                CreateProjectResult result = null;

                try {
                    result = executeCreateProject(finalRequest);
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
    public java.util.concurrent.Future<CreateProjectMembershipResult> createProjectMembershipAsync(CreateProjectMembershipRequest request) {

        return createProjectMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectMembershipResult> createProjectMembershipAsync(final CreateProjectMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectMembershipRequest, CreateProjectMembershipResult> asyncHandler) {
        final CreateProjectMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectMembershipResult>() {
            @Override
            public CreateProjectMembershipResult call() throws Exception {
                CreateProjectMembershipResult result = null;

                try {
                    result = executeCreateProjectMembership(finalRequest);
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
    public java.util.concurrent.Future<CreateSubscriptionGrantResult> createSubscriptionGrantAsync(CreateSubscriptionGrantRequest request) {

        return createSubscriptionGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionGrantResult> createSubscriptionGrantAsync(final CreateSubscriptionGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionGrantRequest, CreateSubscriptionGrantResult> asyncHandler) {
        final CreateSubscriptionGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionGrantResult>() {
            @Override
            public CreateSubscriptionGrantResult call() throws Exception {
                CreateSubscriptionGrantResult result = null;

                try {
                    result = executeCreateSubscriptionGrant(finalRequest);
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
    public java.util.concurrent.Future<CreateSubscriptionRequestResult> createSubscriptionRequestAsync(CreateSubscriptionRequestRequest request) {

        return createSubscriptionRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionRequestResult> createSubscriptionRequestAsync(final CreateSubscriptionRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionRequestRequest, CreateSubscriptionRequestResult> asyncHandler) {
        final CreateSubscriptionRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionRequestResult>() {
            @Override
            public CreateSubscriptionRequestResult call() throws Exception {
                CreateSubscriptionRequestResult result = null;

                try {
                    result = executeCreateSubscriptionRequest(finalRequest);
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
    public java.util.concurrent.Future<CreateSubscriptionTargetResult> createSubscriptionTargetAsync(CreateSubscriptionTargetRequest request) {

        return createSubscriptionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionTargetResult> createSubscriptionTargetAsync(final CreateSubscriptionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResult> asyncHandler) {
        final CreateSubscriptionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionTargetResult>() {
            @Override
            public CreateSubscriptionTargetResult call() throws Exception {
                CreateSubscriptionTargetResult result = null;

                try {
                    result = executeCreateSubscriptionTarget(finalRequest);
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
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {
        final CreateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserProfileResult>() {
            @Override
            public CreateUserProfileResult call() throws Exception {
                CreateUserProfileResult result = null;

                try {
                    result = executeCreateUserProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest request) {

        return deleteAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(final DeleteAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler) {
        final DeleteAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssetResult>() {
            @Override
            public DeleteAssetResult call() throws Exception {
                DeleteAssetResult result = null;

                try {
                    result = executeDeleteAsset(finalRequest);
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
    public java.util.concurrent.Future<DeleteAssetTypeResult> deleteAssetTypeAsync(DeleteAssetTypeRequest request) {

        return deleteAssetTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetTypeResult> deleteAssetTypeAsync(final DeleteAssetTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssetTypeRequest, DeleteAssetTypeResult> asyncHandler) {
        final DeleteAssetTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssetTypeResult>() {
            @Override
            public DeleteAssetTypeResult call() throws Exception {
                DeleteAssetTypeResult result = null;

                try {
                    result = executeDeleteAssetType(finalRequest);
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
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(final DeleteDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {
        final DeleteDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSourceResult>() {
            @Override
            public DeleteDataSourceResult call() throws Exception {
                DeleteDataSourceResult result = null;

                try {
                    result = executeDeleteDataSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(final DeleteEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {
        final DeleteEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentResult>() {
            @Override
            public DeleteEnvironmentResult call() throws Exception {
                DeleteEnvironmentResult result = null;

                try {
                    result = executeDeleteEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentBlueprintConfigurationResult> deleteEnvironmentBlueprintConfigurationAsync(
            DeleteEnvironmentBlueprintConfigurationRequest request) {

        return deleteEnvironmentBlueprintConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentBlueprintConfigurationResult> deleteEnvironmentBlueprintConfigurationAsync(
            final DeleteEnvironmentBlueprintConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentBlueprintConfigurationRequest, DeleteEnvironmentBlueprintConfigurationResult> asyncHandler) {
        final DeleteEnvironmentBlueprintConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentBlueprintConfigurationResult>() {
            @Override
            public DeleteEnvironmentBlueprintConfigurationResult call() throws Exception {
                DeleteEnvironmentBlueprintConfigurationResult result = null;

                try {
                    result = executeDeleteEnvironmentBlueprintConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentProfileResult> deleteEnvironmentProfileAsync(DeleteEnvironmentProfileRequest request) {

        return deleteEnvironmentProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentProfileResult> deleteEnvironmentProfileAsync(final DeleteEnvironmentProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentProfileRequest, DeleteEnvironmentProfileResult> asyncHandler) {
        final DeleteEnvironmentProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentProfileResult>() {
            @Override
            public DeleteEnvironmentProfileResult call() throws Exception {
                DeleteEnvironmentProfileResult result = null;

                try {
                    result = executeDeleteEnvironmentProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteFormTypeResult> deleteFormTypeAsync(DeleteFormTypeRequest request) {

        return deleteFormTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFormTypeResult> deleteFormTypeAsync(final DeleteFormTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFormTypeRequest, DeleteFormTypeResult> asyncHandler) {
        final DeleteFormTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFormTypeResult>() {
            @Override
            public DeleteFormTypeResult call() throws Exception {
                DeleteFormTypeResult result = null;

                try {
                    result = executeDeleteFormType(finalRequest);
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
    public java.util.concurrent.Future<DeleteGlossaryResult> deleteGlossaryAsync(DeleteGlossaryRequest request) {

        return deleteGlossaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGlossaryResult> deleteGlossaryAsync(final DeleteGlossaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGlossaryRequest, DeleteGlossaryResult> asyncHandler) {
        final DeleteGlossaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGlossaryResult>() {
            @Override
            public DeleteGlossaryResult call() throws Exception {
                DeleteGlossaryResult result = null;

                try {
                    result = executeDeleteGlossary(finalRequest);
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
    public java.util.concurrent.Future<DeleteGlossaryTermResult> deleteGlossaryTermAsync(DeleteGlossaryTermRequest request) {

        return deleteGlossaryTermAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGlossaryTermResult> deleteGlossaryTermAsync(final DeleteGlossaryTermRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGlossaryTermRequest, DeleteGlossaryTermResult> asyncHandler) {
        final DeleteGlossaryTermRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGlossaryTermResult>() {
            @Override
            public DeleteGlossaryTermResult call() throws Exception {
                DeleteGlossaryTermResult result = null;

                try {
                    result = executeDeleteGlossaryTerm(finalRequest);
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
    public java.util.concurrent.Future<DeleteListingResult> deleteListingAsync(DeleteListingRequest request) {

        return deleteListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteListingResult> deleteListingAsync(final DeleteListingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteListingRequest, DeleteListingResult> asyncHandler) {
        final DeleteListingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteListingResult>() {
            @Override
            public DeleteListingResult call() throws Exception {
                DeleteListingResult result = null;

                try {
                    result = executeDeleteListing(finalRequest);
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
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(final DeleteProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {
        final DeleteProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectResult>() {
            @Override
            public DeleteProjectResult call() throws Exception {
                DeleteProjectResult result = null;

                try {
                    result = executeDeleteProject(finalRequest);
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
    public java.util.concurrent.Future<DeleteProjectMembershipResult> deleteProjectMembershipAsync(DeleteProjectMembershipRequest request) {

        return deleteProjectMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectMembershipResult> deleteProjectMembershipAsync(final DeleteProjectMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectMembershipRequest, DeleteProjectMembershipResult> asyncHandler) {
        final DeleteProjectMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectMembershipResult>() {
            @Override
            public DeleteProjectMembershipResult call() throws Exception {
                DeleteProjectMembershipResult result = null;

                try {
                    result = executeDeleteProjectMembership(finalRequest);
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
    public java.util.concurrent.Future<DeleteSubscriptionGrantResult> deleteSubscriptionGrantAsync(DeleteSubscriptionGrantRequest request) {

        return deleteSubscriptionGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionGrantResult> deleteSubscriptionGrantAsync(final DeleteSubscriptionGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionGrantRequest, DeleteSubscriptionGrantResult> asyncHandler) {
        final DeleteSubscriptionGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionGrantResult>() {
            @Override
            public DeleteSubscriptionGrantResult call() throws Exception {
                DeleteSubscriptionGrantResult result = null;

                try {
                    result = executeDeleteSubscriptionGrant(finalRequest);
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
    public java.util.concurrent.Future<DeleteSubscriptionRequestResult> deleteSubscriptionRequestAsync(DeleteSubscriptionRequestRequest request) {

        return deleteSubscriptionRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionRequestResult> deleteSubscriptionRequestAsync(final DeleteSubscriptionRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionRequestRequest, DeleteSubscriptionRequestResult> asyncHandler) {
        final DeleteSubscriptionRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionRequestResult>() {
            @Override
            public DeleteSubscriptionRequestResult call() throws Exception {
                DeleteSubscriptionRequestResult result = null;

                try {
                    result = executeDeleteSubscriptionRequest(finalRequest);
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
    public java.util.concurrent.Future<DeleteSubscriptionTargetResult> deleteSubscriptionTargetAsync(DeleteSubscriptionTargetRequest request) {

        return deleteSubscriptionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionTargetResult> deleteSubscriptionTargetAsync(final DeleteSubscriptionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResult> asyncHandler) {
        final DeleteSubscriptionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionTargetResult>() {
            @Override
            public DeleteSubscriptionTargetResult call() throws Exception {
                DeleteSubscriptionTargetResult result = null;

                try {
                    result = executeDeleteSubscriptionTarget(finalRequest);
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
    public java.util.concurrent.Future<DeleteTimeSeriesDataPointsResult> deleteTimeSeriesDataPointsAsync(DeleteTimeSeriesDataPointsRequest request) {

        return deleteTimeSeriesDataPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTimeSeriesDataPointsResult> deleteTimeSeriesDataPointsAsync(final DeleteTimeSeriesDataPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTimeSeriesDataPointsRequest, DeleteTimeSeriesDataPointsResult> asyncHandler) {
        final DeleteTimeSeriesDataPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTimeSeriesDataPointsResult>() {
            @Override
            public DeleteTimeSeriesDataPointsResult call() throws Exception {
                DeleteTimeSeriesDataPointsResult result = null;

                try {
                    result = executeDeleteTimeSeriesDataPoints(finalRequest);
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
    public java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest request) {

        return getAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetResult> getAssetAsync(final GetAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetRequest, GetAssetResult> asyncHandler) {
        final GetAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetResult>() {
            @Override
            public GetAssetResult call() throws Exception {
                GetAssetResult result = null;

                try {
                    result = executeGetAsset(finalRequest);
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
    public java.util.concurrent.Future<GetAssetTypeResult> getAssetTypeAsync(GetAssetTypeRequest request) {

        return getAssetTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetTypeResult> getAssetTypeAsync(final GetAssetTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetTypeRequest, GetAssetTypeResult> asyncHandler) {
        final GetAssetTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetTypeResult>() {
            @Override
            public GetAssetTypeResult call() throws Exception {
                GetAssetTypeResult result = null;

                try {
                    result = executeGetAssetType(finalRequest);
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
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest request) {

        return getDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(final GetDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler) {
        final GetDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSourceResult>() {
            @Override
            public GetDataSourceResult call() throws Exception {
                GetDataSourceResult result = null;

                try {
                    result = executeGetDataSource(finalRequest);
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
    public java.util.concurrent.Future<GetDataSourceRunResult> getDataSourceRunAsync(GetDataSourceRunRequest request) {

        return getDataSourceRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceRunResult> getDataSourceRunAsync(final GetDataSourceRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSourceRunRequest, GetDataSourceRunResult> asyncHandler) {
        final GetDataSourceRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSourceRunResult>() {
            @Override
            public GetDataSourceRunResult call() throws Exception {
                GetDataSourceRunResult result = null;

                try {
                    result = executeGetDataSourceRun(finalRequest);
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
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request) {

        return getDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(final GetDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler) {
        final GetDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainResult>() {
            @Override
            public GetDomainResult call() throws Exception {
                GetDomainResult result = null;

                try {
                    result = executeGetDomain(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request) {

        return getEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(final GetEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler) {
        final GetEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentResult>() {
            @Override
            public GetEnvironmentResult call() throws Exception {
                GetEnvironmentResult result = null;

                try {
                    result = executeGetEnvironment(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentBlueprintResult> getEnvironmentBlueprintAsync(GetEnvironmentBlueprintRequest request) {

        return getEnvironmentBlueprintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentBlueprintResult> getEnvironmentBlueprintAsync(final GetEnvironmentBlueprintRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentBlueprintRequest, GetEnvironmentBlueprintResult> asyncHandler) {
        final GetEnvironmentBlueprintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentBlueprintResult>() {
            @Override
            public GetEnvironmentBlueprintResult call() throws Exception {
                GetEnvironmentBlueprintResult result = null;

                try {
                    result = executeGetEnvironmentBlueprint(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentBlueprintConfigurationResult> getEnvironmentBlueprintConfigurationAsync(
            GetEnvironmentBlueprintConfigurationRequest request) {

        return getEnvironmentBlueprintConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentBlueprintConfigurationResult> getEnvironmentBlueprintConfigurationAsync(
            final GetEnvironmentBlueprintConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentBlueprintConfigurationRequest, GetEnvironmentBlueprintConfigurationResult> asyncHandler) {
        final GetEnvironmentBlueprintConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentBlueprintConfigurationResult>() {
            @Override
            public GetEnvironmentBlueprintConfigurationResult call() throws Exception {
                GetEnvironmentBlueprintConfigurationResult result = null;

                try {
                    result = executeGetEnvironmentBlueprintConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentProfileResult> getEnvironmentProfileAsync(GetEnvironmentProfileRequest request) {

        return getEnvironmentProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentProfileResult> getEnvironmentProfileAsync(final GetEnvironmentProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentProfileRequest, GetEnvironmentProfileResult> asyncHandler) {
        final GetEnvironmentProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentProfileResult>() {
            @Override
            public GetEnvironmentProfileResult call() throws Exception {
                GetEnvironmentProfileResult result = null;

                try {
                    result = executeGetEnvironmentProfile(finalRequest);
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
    public java.util.concurrent.Future<GetFormTypeResult> getFormTypeAsync(GetFormTypeRequest request) {

        return getFormTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFormTypeResult> getFormTypeAsync(final GetFormTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFormTypeRequest, GetFormTypeResult> asyncHandler) {
        final GetFormTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFormTypeResult>() {
            @Override
            public GetFormTypeResult call() throws Exception {
                GetFormTypeResult result = null;

                try {
                    result = executeGetFormType(finalRequest);
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
    public java.util.concurrent.Future<GetGlossaryResult> getGlossaryAsync(GetGlossaryRequest request) {

        return getGlossaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGlossaryResult> getGlossaryAsync(final GetGlossaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGlossaryRequest, GetGlossaryResult> asyncHandler) {
        final GetGlossaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGlossaryResult>() {
            @Override
            public GetGlossaryResult call() throws Exception {
                GetGlossaryResult result = null;

                try {
                    result = executeGetGlossary(finalRequest);
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
    public java.util.concurrent.Future<GetGlossaryTermResult> getGlossaryTermAsync(GetGlossaryTermRequest request) {

        return getGlossaryTermAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGlossaryTermResult> getGlossaryTermAsync(final GetGlossaryTermRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGlossaryTermRequest, GetGlossaryTermResult> asyncHandler) {
        final GetGlossaryTermRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGlossaryTermResult>() {
            @Override
            public GetGlossaryTermResult call() throws Exception {
                GetGlossaryTermResult result = null;

                try {
                    result = executeGetGlossaryTerm(finalRequest);
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
    public java.util.concurrent.Future<GetGroupProfileResult> getGroupProfileAsync(GetGroupProfileRequest request) {

        return getGroupProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupProfileResult> getGroupProfileAsync(final GetGroupProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupProfileRequest, GetGroupProfileResult> asyncHandler) {
        final GetGroupProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupProfileResult>() {
            @Override
            public GetGroupProfileResult call() throws Exception {
                GetGroupProfileResult result = null;

                try {
                    result = executeGetGroupProfile(finalRequest);
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
    public java.util.concurrent.Future<GetIamPortalLoginUrlResult> getIamPortalLoginUrlAsync(GetIamPortalLoginUrlRequest request) {

        return getIamPortalLoginUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIamPortalLoginUrlResult> getIamPortalLoginUrlAsync(final GetIamPortalLoginUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIamPortalLoginUrlRequest, GetIamPortalLoginUrlResult> asyncHandler) {
        final GetIamPortalLoginUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIamPortalLoginUrlResult>() {
            @Override
            public GetIamPortalLoginUrlResult call() throws Exception {
                GetIamPortalLoginUrlResult result = null;

                try {
                    result = executeGetIamPortalLoginUrl(finalRequest);
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
    public java.util.concurrent.Future<GetListingResult> getListingAsync(GetListingRequest request) {

        return getListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetListingResult> getListingAsync(final GetListingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetListingRequest, GetListingResult> asyncHandler) {
        final GetListingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetListingResult>() {
            @Override
            public GetListingResult call() throws Exception {
                GetListingResult result = null;

                try {
                    result = executeGetListing(finalRequest);
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
    public java.util.concurrent.Future<GetMetadataGenerationRunResult> getMetadataGenerationRunAsync(GetMetadataGenerationRunRequest request) {

        return getMetadataGenerationRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetadataGenerationRunResult> getMetadataGenerationRunAsync(final GetMetadataGenerationRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetadataGenerationRunRequest, GetMetadataGenerationRunResult> asyncHandler) {
        final GetMetadataGenerationRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetadataGenerationRunResult>() {
            @Override
            public GetMetadataGenerationRunResult call() throws Exception {
                GetMetadataGenerationRunResult result = null;

                try {
                    result = executeGetMetadataGenerationRun(finalRequest);
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
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest request) {

        return getProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(final GetProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler) {
        final GetProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProjectResult>() {
            @Override
            public GetProjectResult call() throws Exception {
                GetProjectResult result = null;

                try {
                    result = executeGetProject(finalRequest);
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
    public java.util.concurrent.Future<GetSubscriptionResult> getSubscriptionAsync(GetSubscriptionRequest request) {

        return getSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionResult> getSubscriptionAsync(final GetSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionRequest, GetSubscriptionResult> asyncHandler) {
        final GetSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionResult>() {
            @Override
            public GetSubscriptionResult call() throws Exception {
                GetSubscriptionResult result = null;

                try {
                    result = executeGetSubscription(finalRequest);
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
    public java.util.concurrent.Future<GetSubscriptionGrantResult> getSubscriptionGrantAsync(GetSubscriptionGrantRequest request) {

        return getSubscriptionGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionGrantResult> getSubscriptionGrantAsync(final GetSubscriptionGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionGrantRequest, GetSubscriptionGrantResult> asyncHandler) {
        final GetSubscriptionGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionGrantResult>() {
            @Override
            public GetSubscriptionGrantResult call() throws Exception {
                GetSubscriptionGrantResult result = null;

                try {
                    result = executeGetSubscriptionGrant(finalRequest);
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
    public java.util.concurrent.Future<GetSubscriptionRequestDetailsResult> getSubscriptionRequestDetailsAsync(GetSubscriptionRequestDetailsRequest request) {

        return getSubscriptionRequestDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionRequestDetailsResult> getSubscriptionRequestDetailsAsync(
            final GetSubscriptionRequestDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionRequestDetailsRequest, GetSubscriptionRequestDetailsResult> asyncHandler) {
        final GetSubscriptionRequestDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionRequestDetailsResult>() {
            @Override
            public GetSubscriptionRequestDetailsResult call() throws Exception {
                GetSubscriptionRequestDetailsResult result = null;

                try {
                    result = executeGetSubscriptionRequestDetails(finalRequest);
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
    public java.util.concurrent.Future<GetSubscriptionTargetResult> getSubscriptionTargetAsync(GetSubscriptionTargetRequest request) {

        return getSubscriptionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionTargetResult> getSubscriptionTargetAsync(final GetSubscriptionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionTargetRequest, GetSubscriptionTargetResult> asyncHandler) {
        final GetSubscriptionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionTargetResult>() {
            @Override
            public GetSubscriptionTargetResult call() throws Exception {
                GetSubscriptionTargetResult result = null;

                try {
                    result = executeGetSubscriptionTarget(finalRequest);
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
    public java.util.concurrent.Future<GetTimeSeriesDataPointResult> getTimeSeriesDataPointAsync(GetTimeSeriesDataPointRequest request) {

        return getTimeSeriesDataPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTimeSeriesDataPointResult> getTimeSeriesDataPointAsync(final GetTimeSeriesDataPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTimeSeriesDataPointRequest, GetTimeSeriesDataPointResult> asyncHandler) {
        final GetTimeSeriesDataPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTimeSeriesDataPointResult>() {
            @Override
            public GetTimeSeriesDataPointResult call() throws Exception {
                GetTimeSeriesDataPointResult result = null;

                try {
                    result = executeGetTimeSeriesDataPoint(finalRequest);
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
    public java.util.concurrent.Future<GetUserProfileResult> getUserProfileAsync(GetUserProfileRequest request) {

        return getUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserProfileResult> getUserProfileAsync(final GetUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserProfileRequest, GetUserProfileResult> asyncHandler) {
        final GetUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserProfileResult>() {
            @Override
            public GetUserProfileResult call() throws Exception {
                GetUserProfileResult result = null;

                try {
                    result = executeGetUserProfile(finalRequest);
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
    public java.util.concurrent.Future<ListAssetRevisionsResult> listAssetRevisionsAsync(ListAssetRevisionsRequest request) {

        return listAssetRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetRevisionsResult> listAssetRevisionsAsync(final ListAssetRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssetRevisionsRequest, ListAssetRevisionsResult> asyncHandler) {
        final ListAssetRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssetRevisionsResult>() {
            @Override
            public ListAssetRevisionsResult call() throws Exception {
                ListAssetRevisionsResult result = null;

                try {
                    result = executeListAssetRevisions(finalRequest);
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
    public java.util.concurrent.Future<ListDataSourceRunActivitiesResult> listDataSourceRunActivitiesAsync(ListDataSourceRunActivitiesRequest request) {

        return listDataSourceRunActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceRunActivitiesResult> listDataSourceRunActivitiesAsync(final ListDataSourceRunActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourceRunActivitiesRequest, ListDataSourceRunActivitiesResult> asyncHandler) {
        final ListDataSourceRunActivitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourceRunActivitiesResult>() {
            @Override
            public ListDataSourceRunActivitiesResult call() throws Exception {
                ListDataSourceRunActivitiesResult result = null;

                try {
                    result = executeListDataSourceRunActivities(finalRequest);
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
    public java.util.concurrent.Future<ListDataSourceRunsResult> listDataSourceRunsAsync(ListDataSourceRunsRequest request) {

        return listDataSourceRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceRunsResult> listDataSourceRunsAsync(final ListDataSourceRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourceRunsRequest, ListDataSourceRunsResult> asyncHandler) {
        final ListDataSourceRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourceRunsResult>() {
            @Override
            public ListDataSourceRunsResult call() throws Exception {
                ListDataSourceRunsResult result = null;

                try {
                    result = executeListDataSourceRuns(finalRequest);
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
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest request) {

        return listDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(final ListDataSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler) {
        final ListDataSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourcesResult>() {
            @Override
            public ListDataSourcesResult call() throws Exception {
                ListDataSourcesResult result = null;

                try {
                    result = executeListDataSources(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentBlueprintConfigurationsResult> listEnvironmentBlueprintConfigurationsAsync(
            ListEnvironmentBlueprintConfigurationsRequest request) {

        return listEnvironmentBlueprintConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentBlueprintConfigurationsResult> listEnvironmentBlueprintConfigurationsAsync(
            final ListEnvironmentBlueprintConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentBlueprintConfigurationsRequest, ListEnvironmentBlueprintConfigurationsResult> asyncHandler) {
        final ListEnvironmentBlueprintConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentBlueprintConfigurationsResult>() {
            @Override
            public ListEnvironmentBlueprintConfigurationsResult call() throws Exception {
                ListEnvironmentBlueprintConfigurationsResult result = null;

                try {
                    result = executeListEnvironmentBlueprintConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentBlueprintsResult> listEnvironmentBlueprintsAsync(ListEnvironmentBlueprintsRequest request) {

        return listEnvironmentBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentBlueprintsResult> listEnvironmentBlueprintsAsync(final ListEnvironmentBlueprintsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentBlueprintsRequest, ListEnvironmentBlueprintsResult> asyncHandler) {
        final ListEnvironmentBlueprintsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentBlueprintsResult>() {
            @Override
            public ListEnvironmentBlueprintsResult call() throws Exception {
                ListEnvironmentBlueprintsResult result = null;

                try {
                    result = executeListEnvironmentBlueprints(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentProfilesResult> listEnvironmentProfilesAsync(ListEnvironmentProfilesRequest request) {

        return listEnvironmentProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentProfilesResult> listEnvironmentProfilesAsync(final ListEnvironmentProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentProfilesRequest, ListEnvironmentProfilesResult> asyncHandler) {
        final ListEnvironmentProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentProfilesResult>() {
            @Override
            public ListEnvironmentProfilesResult call() throws Exception {
                ListEnvironmentProfilesResult result = null;

                try {
                    result = executeListEnvironmentProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(final ListEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {
        final ListEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentsResult>() {
            @Override
            public ListEnvironmentsResult call() throws Exception {
                ListEnvironmentsResult result = null;

                try {
                    result = executeListEnvironments(finalRequest);
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
    public java.util.concurrent.Future<ListMetadataGenerationRunsResult> listMetadataGenerationRunsAsync(ListMetadataGenerationRunsRequest request) {

        return listMetadataGenerationRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetadataGenerationRunsResult> listMetadataGenerationRunsAsync(final ListMetadataGenerationRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMetadataGenerationRunsRequest, ListMetadataGenerationRunsResult> asyncHandler) {
        final ListMetadataGenerationRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMetadataGenerationRunsResult>() {
            @Override
            public ListMetadataGenerationRunsResult call() throws Exception {
                ListMetadataGenerationRunsResult result = null;

                try {
                    result = executeListMetadataGenerationRuns(finalRequest);
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
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest request) {

        return listNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(final ListNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler) {
        final ListNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotificationsResult>() {
            @Override
            public ListNotificationsResult call() throws Exception {
                ListNotificationsResult result = null;

                try {
                    result = executeListNotifications(finalRequest);
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
    public java.util.concurrent.Future<ListProjectMembershipsResult> listProjectMembershipsAsync(ListProjectMembershipsRequest request) {

        return listProjectMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectMembershipsResult> listProjectMembershipsAsync(final ListProjectMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectMembershipsRequest, ListProjectMembershipsResult> asyncHandler) {
        final ListProjectMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectMembershipsResult>() {
            @Override
            public ListProjectMembershipsResult call() throws Exception {
                ListProjectMembershipsResult result = null;

                try {
                    result = executeListProjectMemberships(finalRequest);
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
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(final ListProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {
        final ListProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectsResult>() {
            @Override
            public ListProjectsResult call() throws Exception {
                ListProjectsResult result = null;

                try {
                    result = executeListProjects(finalRequest);
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
    public java.util.concurrent.Future<ListSubscriptionGrantsResult> listSubscriptionGrantsAsync(ListSubscriptionGrantsRequest request) {

        return listSubscriptionGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionGrantsResult> listSubscriptionGrantsAsync(final ListSubscriptionGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionGrantsRequest, ListSubscriptionGrantsResult> asyncHandler) {
        final ListSubscriptionGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionGrantsResult>() {
            @Override
            public ListSubscriptionGrantsResult call() throws Exception {
                ListSubscriptionGrantsResult result = null;

                try {
                    result = executeListSubscriptionGrants(finalRequest);
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
    public java.util.concurrent.Future<ListSubscriptionRequestsResult> listSubscriptionRequestsAsync(ListSubscriptionRequestsRequest request) {

        return listSubscriptionRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionRequestsResult> listSubscriptionRequestsAsync(final ListSubscriptionRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionRequestsRequest, ListSubscriptionRequestsResult> asyncHandler) {
        final ListSubscriptionRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionRequestsResult>() {
            @Override
            public ListSubscriptionRequestsResult call() throws Exception {
                ListSubscriptionRequestsResult result = null;

                try {
                    result = executeListSubscriptionRequests(finalRequest);
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
    public java.util.concurrent.Future<ListSubscriptionTargetsResult> listSubscriptionTargetsAsync(ListSubscriptionTargetsRequest request) {

        return listSubscriptionTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionTargetsResult> listSubscriptionTargetsAsync(final ListSubscriptionTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionTargetsRequest, ListSubscriptionTargetsResult> asyncHandler) {
        final ListSubscriptionTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionTargetsResult>() {
            @Override
            public ListSubscriptionTargetsResult call() throws Exception {
                ListSubscriptionTargetsResult result = null;

                try {
                    result = executeListSubscriptionTargets(finalRequest);
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
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest request) {

        return listSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(final ListSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {
        final ListSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionsResult>() {
            @Override
            public ListSubscriptionsResult call() throws Exception {
                ListSubscriptionsResult result = null;

                try {
                    result = executeListSubscriptions(finalRequest);
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
    public java.util.concurrent.Future<ListTimeSeriesDataPointsResult> listTimeSeriesDataPointsAsync(ListTimeSeriesDataPointsRequest request) {

        return listTimeSeriesDataPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTimeSeriesDataPointsResult> listTimeSeriesDataPointsAsync(final ListTimeSeriesDataPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTimeSeriesDataPointsRequest, ListTimeSeriesDataPointsResult> asyncHandler) {
        final ListTimeSeriesDataPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTimeSeriesDataPointsResult>() {
            @Override
            public ListTimeSeriesDataPointsResult call() throws Exception {
                ListTimeSeriesDataPointsResult result = null;

                try {
                    result = executeListTimeSeriesDataPoints(finalRequest);
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
    public java.util.concurrent.Future<PostTimeSeriesDataPointsResult> postTimeSeriesDataPointsAsync(PostTimeSeriesDataPointsRequest request) {

        return postTimeSeriesDataPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostTimeSeriesDataPointsResult> postTimeSeriesDataPointsAsync(final PostTimeSeriesDataPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostTimeSeriesDataPointsRequest, PostTimeSeriesDataPointsResult> asyncHandler) {
        final PostTimeSeriesDataPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostTimeSeriesDataPointsResult>() {
            @Override
            public PostTimeSeriesDataPointsResult call() throws Exception {
                PostTimeSeriesDataPointsResult result = null;

                try {
                    result = executePostTimeSeriesDataPoints(finalRequest);
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
    public java.util.concurrent.Future<PutEnvironmentBlueprintConfigurationResult> putEnvironmentBlueprintConfigurationAsync(
            PutEnvironmentBlueprintConfigurationRequest request) {

        return putEnvironmentBlueprintConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEnvironmentBlueprintConfigurationResult> putEnvironmentBlueprintConfigurationAsync(
            final PutEnvironmentBlueprintConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEnvironmentBlueprintConfigurationRequest, PutEnvironmentBlueprintConfigurationResult> asyncHandler) {
        final PutEnvironmentBlueprintConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEnvironmentBlueprintConfigurationResult>() {
            @Override
            public PutEnvironmentBlueprintConfigurationResult call() throws Exception {
                PutEnvironmentBlueprintConfigurationResult result = null;

                try {
                    result = executePutEnvironmentBlueprintConfiguration(finalRequest);
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
    public java.util.concurrent.Future<RejectPredictionsResult> rejectPredictionsAsync(RejectPredictionsRequest request) {

        return rejectPredictionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectPredictionsResult> rejectPredictionsAsync(final RejectPredictionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectPredictionsRequest, RejectPredictionsResult> asyncHandler) {
        final RejectPredictionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectPredictionsResult>() {
            @Override
            public RejectPredictionsResult call() throws Exception {
                RejectPredictionsResult result = null;

                try {
                    result = executeRejectPredictions(finalRequest);
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
    public java.util.concurrent.Future<RejectSubscriptionRequestResult> rejectSubscriptionRequestAsync(RejectSubscriptionRequestRequest request) {

        return rejectSubscriptionRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectSubscriptionRequestResult> rejectSubscriptionRequestAsync(final RejectSubscriptionRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectSubscriptionRequestRequest, RejectSubscriptionRequestResult> asyncHandler) {
        final RejectSubscriptionRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectSubscriptionRequestResult>() {
            @Override
            public RejectSubscriptionRequestResult call() throws Exception {
                RejectSubscriptionRequestResult result = null;

                try {
                    result = executeRejectSubscriptionRequest(finalRequest);
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
    public java.util.concurrent.Future<RevokeSubscriptionResult> revokeSubscriptionAsync(RevokeSubscriptionRequest request) {

        return revokeSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSubscriptionResult> revokeSubscriptionAsync(final RevokeSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSubscriptionRequest, RevokeSubscriptionResult> asyncHandler) {
        final RevokeSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeSubscriptionResult>() {
            @Override
            public RevokeSubscriptionResult call() throws Exception {
                RevokeSubscriptionResult result = null;

                try {
                    result = executeRevokeSubscription(finalRequest);
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
    public java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest request) {

        return searchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(final SearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler) {
        final SearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResult>() {
            @Override
            public SearchResult call() throws Exception {
                SearchResult result = null;

                try {
                    result = executeSearch(finalRequest);
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
    public java.util.concurrent.Future<SearchGroupProfilesResult> searchGroupProfilesAsync(SearchGroupProfilesRequest request) {

        return searchGroupProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchGroupProfilesResult> searchGroupProfilesAsync(final SearchGroupProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchGroupProfilesRequest, SearchGroupProfilesResult> asyncHandler) {
        final SearchGroupProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchGroupProfilesResult>() {
            @Override
            public SearchGroupProfilesResult call() throws Exception {
                SearchGroupProfilesResult result = null;

                try {
                    result = executeSearchGroupProfiles(finalRequest);
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
    public java.util.concurrent.Future<SearchListingsResult> searchListingsAsync(SearchListingsRequest request) {

        return searchListingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchListingsResult> searchListingsAsync(final SearchListingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchListingsRequest, SearchListingsResult> asyncHandler) {
        final SearchListingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchListingsResult>() {
            @Override
            public SearchListingsResult call() throws Exception {
                SearchListingsResult result = null;

                try {
                    result = executeSearchListings(finalRequest);
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
    public java.util.concurrent.Future<SearchTypesResult> searchTypesAsync(SearchTypesRequest request) {

        return searchTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTypesResult> searchTypesAsync(final SearchTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchTypesRequest, SearchTypesResult> asyncHandler) {
        final SearchTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchTypesResult>() {
            @Override
            public SearchTypesResult call() throws Exception {
                SearchTypesResult result = null;

                try {
                    result = executeSearchTypes(finalRequest);
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
    public java.util.concurrent.Future<SearchUserProfilesResult> searchUserProfilesAsync(SearchUserProfilesRequest request) {

        return searchUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchUserProfilesResult> searchUserProfilesAsync(final SearchUserProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchUserProfilesRequest, SearchUserProfilesResult> asyncHandler) {
        final SearchUserProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchUserProfilesResult>() {
            @Override
            public SearchUserProfilesResult call() throws Exception {
                SearchUserProfilesResult result = null;

                try {
                    result = executeSearchUserProfiles(finalRequest);
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
    public java.util.concurrent.Future<StartDataSourceRunResult> startDataSourceRunAsync(StartDataSourceRunRequest request) {

        return startDataSourceRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataSourceRunResult> startDataSourceRunAsync(final StartDataSourceRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataSourceRunRequest, StartDataSourceRunResult> asyncHandler) {
        final StartDataSourceRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDataSourceRunResult>() {
            @Override
            public StartDataSourceRunResult call() throws Exception {
                StartDataSourceRunResult result = null;

                try {
                    result = executeStartDataSourceRun(finalRequest);
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
    public java.util.concurrent.Future<StartMetadataGenerationRunResult> startMetadataGenerationRunAsync(StartMetadataGenerationRunRequest request) {

        return startMetadataGenerationRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMetadataGenerationRunResult> startMetadataGenerationRunAsync(final StartMetadataGenerationRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMetadataGenerationRunRequest, StartMetadataGenerationRunResult> asyncHandler) {
        final StartMetadataGenerationRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMetadataGenerationRunResult>() {
            @Override
            public StartMetadataGenerationRunResult call() throws Exception {
                StartMetadataGenerationRunResult result = null;

                try {
                    result = executeStartMetadataGenerationRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(final UpdateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {
        final UpdateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSourceResult>() {
            @Override
            public UpdateDataSourceResult call() throws Exception {
                UpdateDataSourceResult result = null;

                try {
                    result = executeUpdateDataSource(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request) {

        return updateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(final UpdateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler) {
        final UpdateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainResult>() {
            @Override
            public UpdateDomainResult call() throws Exception {
                UpdateDomainResult result = null;

                try {
                    result = executeUpdateDomain(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentProfileResult> updateEnvironmentProfileAsync(UpdateEnvironmentProfileRequest request) {

        return updateEnvironmentProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentProfileResult> updateEnvironmentProfileAsync(final UpdateEnvironmentProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentProfileRequest, UpdateEnvironmentProfileResult> asyncHandler) {
        final UpdateEnvironmentProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentProfileResult>() {
            @Override
            public UpdateEnvironmentProfileResult call() throws Exception {
                UpdateEnvironmentProfileResult result = null;

                try {
                    result = executeUpdateEnvironmentProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateGlossaryResult> updateGlossaryAsync(UpdateGlossaryRequest request) {

        return updateGlossaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlossaryResult> updateGlossaryAsync(final UpdateGlossaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlossaryRequest, UpdateGlossaryResult> asyncHandler) {
        final UpdateGlossaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlossaryResult>() {
            @Override
            public UpdateGlossaryResult call() throws Exception {
                UpdateGlossaryResult result = null;

                try {
                    result = executeUpdateGlossary(finalRequest);
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
    public java.util.concurrent.Future<UpdateGlossaryTermResult> updateGlossaryTermAsync(UpdateGlossaryTermRequest request) {

        return updateGlossaryTermAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlossaryTermResult> updateGlossaryTermAsync(final UpdateGlossaryTermRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlossaryTermRequest, UpdateGlossaryTermResult> asyncHandler) {
        final UpdateGlossaryTermRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlossaryTermResult>() {
            @Override
            public UpdateGlossaryTermResult call() throws Exception {
                UpdateGlossaryTermResult result = null;

                try {
                    result = executeUpdateGlossaryTerm(finalRequest);
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
    public java.util.concurrent.Future<UpdateGroupProfileResult> updateGroupProfileAsync(UpdateGroupProfileRequest request) {

        return updateGroupProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupProfileResult> updateGroupProfileAsync(final UpdateGroupProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupProfileRequest, UpdateGroupProfileResult> asyncHandler) {
        final UpdateGroupProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupProfileResult>() {
            @Override
            public UpdateGroupProfileResult call() throws Exception {
                UpdateGroupProfileResult result = null;

                try {
                    result = executeUpdateGroupProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(final UpdateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {
        final UpdateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProjectResult>() {
            @Override
            public UpdateProjectResult call() throws Exception {
                UpdateProjectResult result = null;

                try {
                    result = executeUpdateProject(finalRequest);
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
    public java.util.concurrent.Future<UpdateSubscriptionGrantStatusResult> updateSubscriptionGrantStatusAsync(UpdateSubscriptionGrantStatusRequest request) {

        return updateSubscriptionGrantStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionGrantStatusResult> updateSubscriptionGrantStatusAsync(
            final UpdateSubscriptionGrantStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionGrantStatusRequest, UpdateSubscriptionGrantStatusResult> asyncHandler) {
        final UpdateSubscriptionGrantStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionGrantStatusResult>() {
            @Override
            public UpdateSubscriptionGrantStatusResult call() throws Exception {
                UpdateSubscriptionGrantStatusResult result = null;

                try {
                    result = executeUpdateSubscriptionGrantStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateSubscriptionRequestResult> updateSubscriptionRequestAsync(UpdateSubscriptionRequestRequest request) {

        return updateSubscriptionRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionRequestResult> updateSubscriptionRequestAsync(final UpdateSubscriptionRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionRequestRequest, UpdateSubscriptionRequestResult> asyncHandler) {
        final UpdateSubscriptionRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionRequestResult>() {
            @Override
            public UpdateSubscriptionRequestResult call() throws Exception {
                UpdateSubscriptionRequestResult result = null;

                try {
                    result = executeUpdateSubscriptionRequest(finalRequest);
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
    public java.util.concurrent.Future<UpdateSubscriptionTargetResult> updateSubscriptionTargetAsync(UpdateSubscriptionTargetRequest request) {

        return updateSubscriptionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionTargetResult> updateSubscriptionTargetAsync(final UpdateSubscriptionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResult> asyncHandler) {
        final UpdateSubscriptionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionTargetResult>() {
            @Override
            public UpdateSubscriptionTargetResult call() throws Exception {
                UpdateSubscriptionTargetResult result = null;

                try {
                    result = executeUpdateSubscriptionTarget(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(final UpdateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler) {
        final UpdateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserProfileResult>() {
            @Override
            public UpdateUserProfileResult call() throws Exception {
                UpdateUserProfileResult result = null;

                try {
                    result = executeUpdateUserProfile(finalRequest);
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
