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
package com.amazonaws.services.customerprofiles;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Customer Profiles asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Connect Customer Profiles</fullname>
 * <p>
 * Amazon Connect Customer Profiles is a unified customer profile for your contact center that has pre-built connectors
 * powered by AppFlow that make it easy to combine customer information from third party applications, such as
 * Salesforce (CRM), ServiceNow (ITSM), and your enterprise resource planning (ERP), with contact history from your
 * Amazon Connect contact center. If you're new to Amazon Connect, you might find it helpful to review the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/">Amazon Connect Administrator Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCustomerProfilesAsyncClient extends AmazonCustomerProfilesClient implements AmazonCustomerProfilesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonCustomerProfilesAsyncClientBuilder asyncBuilder() {
        return AmazonCustomerProfilesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Customer Profiles using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCustomerProfilesAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Customer Profiles using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonCustomerProfilesAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddProfileKeyResult> addProfileKeyAsync(AddProfileKeyRequest request) {

        return addProfileKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddProfileKeyResult> addProfileKeyAsync(final AddProfileKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddProfileKeyRequest, AddProfileKeyResult> asyncHandler) {
        final AddProfileKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddProfileKeyResult>() {
            @Override
            public AddProfileKeyResult call() throws Exception {
                AddProfileKeyResult result = null;

                try {
                    result = executeAddProfileKey(finalRequest);
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
    public java.util.concurrent.Future<CreateIntegrationWorkflowResult> createIntegrationWorkflowAsync(CreateIntegrationWorkflowRequest request) {

        return createIntegrationWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationWorkflowResult> createIntegrationWorkflowAsync(final CreateIntegrationWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntegrationWorkflowRequest, CreateIntegrationWorkflowResult> asyncHandler) {
        final CreateIntegrationWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntegrationWorkflowResult>() {
            @Override
            public CreateIntegrationWorkflowResult call() throws Exception {
                CreateIntegrationWorkflowResult result = null;

                try {
                    result = executeCreateIntegrationWorkflow(finalRequest);
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
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(final CreateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {
        final CreateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileResult>() {
            @Override
            public CreateProfileResult call() throws Exception {
                CreateProfileResult result = null;

                try {
                    result = executeCreateProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest request) {

        return deleteIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(final DeleteIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler) {
        final DeleteIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationResult>() {
            @Override
            public DeleteIntegrationResult call() throws Exception {
                DeleteIntegrationResult result = null;

                try {
                    result = executeDeleteIntegration(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(final DeleteProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {
        final DeleteProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileResult>() {
            @Override
            public DeleteProfileResult call() throws Exception {
                DeleteProfileResult result = null;

                try {
                    result = executeDeleteProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfileKeyResult> deleteProfileKeyAsync(DeleteProfileKeyRequest request) {

        return deleteProfileKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileKeyResult> deleteProfileKeyAsync(final DeleteProfileKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileKeyRequest, DeleteProfileKeyResult> asyncHandler) {
        final DeleteProfileKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileKeyResult>() {
            @Override
            public DeleteProfileKeyResult call() throws Exception {
                DeleteProfileKeyResult result = null;

                try {
                    result = executeDeleteProfileKey(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfileObjectResult> deleteProfileObjectAsync(DeleteProfileObjectRequest request) {

        return deleteProfileObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileObjectResult> deleteProfileObjectAsync(final DeleteProfileObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileObjectRequest, DeleteProfileObjectResult> asyncHandler) {
        final DeleteProfileObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileObjectResult>() {
            @Override
            public DeleteProfileObjectResult call() throws Exception {
                DeleteProfileObjectResult result = null;

                try {
                    result = executeDeleteProfileObject(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfileObjectTypeResult> deleteProfileObjectTypeAsync(DeleteProfileObjectTypeRequest request) {

        return deleteProfileObjectTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileObjectTypeResult> deleteProfileObjectTypeAsync(final DeleteProfileObjectTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileObjectTypeRequest, DeleteProfileObjectTypeResult> asyncHandler) {
        final DeleteProfileObjectTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileObjectTypeResult>() {
            @Override
            public DeleteProfileObjectTypeResult call() throws Exception {
                DeleteProfileObjectTypeResult result = null;

                try {
                    result = executeDeleteProfileObjectType(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(final DeleteWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {
        final DeleteWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowResult>() {
            @Override
            public DeleteWorkflowResult call() throws Exception {
                DeleteWorkflowResult result = null;

                try {
                    result = executeDeleteWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetAutoMergingPreviewResult> getAutoMergingPreviewAsync(GetAutoMergingPreviewRequest request) {

        return getAutoMergingPreviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutoMergingPreviewResult> getAutoMergingPreviewAsync(final GetAutoMergingPreviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAutoMergingPreviewRequest, GetAutoMergingPreviewResult> asyncHandler) {
        final GetAutoMergingPreviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAutoMergingPreviewResult>() {
            @Override
            public GetAutoMergingPreviewResult call() throws Exception {
                GetAutoMergingPreviewResult result = null;

                try {
                    result = executeGetAutoMergingPreview(finalRequest);
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
    public java.util.concurrent.Future<GetIdentityResolutionJobResult> getIdentityResolutionJobAsync(GetIdentityResolutionJobRequest request) {

        return getIdentityResolutionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityResolutionJobResult> getIdentityResolutionJobAsync(final GetIdentityResolutionJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityResolutionJobRequest, GetIdentityResolutionJobResult> asyncHandler) {
        final GetIdentityResolutionJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityResolutionJobResult>() {
            @Override
            public GetIdentityResolutionJobResult call() throws Exception {
                GetIdentityResolutionJobResult result = null;

                try {
                    result = executeGetIdentityResolutionJob(finalRequest);
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
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest request) {

        return getIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(final GetIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler) {
        final GetIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationResult>() {
            @Override
            public GetIntegrationResult call() throws Exception {
                GetIntegrationResult result = null;

                try {
                    result = executeGetIntegration(finalRequest);
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
    public java.util.concurrent.Future<GetMatchesResult> getMatchesAsync(GetMatchesRequest request) {

        return getMatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchesResult> getMatchesAsync(final GetMatchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMatchesRequest, GetMatchesResult> asyncHandler) {
        final GetMatchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMatchesResult>() {
            @Override
            public GetMatchesResult call() throws Exception {
                GetMatchesResult result = null;

                try {
                    result = executeGetMatches(finalRequest);
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
    public java.util.concurrent.Future<GetProfileObjectTypeResult> getProfileObjectTypeAsync(GetProfileObjectTypeRequest request) {

        return getProfileObjectTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileObjectTypeResult> getProfileObjectTypeAsync(final GetProfileObjectTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileObjectTypeRequest, GetProfileObjectTypeResult> asyncHandler) {
        final GetProfileObjectTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileObjectTypeResult>() {
            @Override
            public GetProfileObjectTypeResult call() throws Exception {
                GetProfileObjectTypeResult result = null;

                try {
                    result = executeGetProfileObjectType(finalRequest);
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
    public java.util.concurrent.Future<GetProfileObjectTypeTemplateResult> getProfileObjectTypeTemplateAsync(GetProfileObjectTypeTemplateRequest request) {

        return getProfileObjectTypeTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileObjectTypeTemplateResult> getProfileObjectTypeTemplateAsync(final GetProfileObjectTypeTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileObjectTypeTemplateRequest, GetProfileObjectTypeTemplateResult> asyncHandler) {
        final GetProfileObjectTypeTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileObjectTypeTemplateResult>() {
            @Override
            public GetProfileObjectTypeTemplateResult call() throws Exception {
                GetProfileObjectTypeTemplateResult result = null;

                try {
                    result = executeGetProfileObjectTypeTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request) {

        return getWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(final GetWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler) {
        final GetWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowResult>() {
            @Override
            public GetWorkflowResult call() throws Exception {
                GetWorkflowResult result = null;

                try {
                    result = executeGetWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowStepsResult> getWorkflowStepsAsync(GetWorkflowStepsRequest request) {

        return getWorkflowStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepsResult> getWorkflowStepsAsync(final GetWorkflowStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowStepsRequest, GetWorkflowStepsResult> asyncHandler) {
        final GetWorkflowStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowStepsResult>() {
            @Override
            public GetWorkflowStepsResult call() throws Exception {
                GetWorkflowStepsResult result = null;

                try {
                    result = executeGetWorkflowSteps(finalRequest);
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
    public java.util.concurrent.Future<ListAccountIntegrationsResult> listAccountIntegrationsAsync(ListAccountIntegrationsRequest request) {

        return listAccountIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountIntegrationsResult> listAccountIntegrationsAsync(final ListAccountIntegrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountIntegrationsRequest, ListAccountIntegrationsResult> asyncHandler) {
        final ListAccountIntegrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountIntegrationsResult>() {
            @Override
            public ListAccountIntegrationsResult call() throws Exception {
                ListAccountIntegrationsResult result = null;

                try {
                    result = executeListAccountIntegrations(finalRequest);
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
    public java.util.concurrent.Future<ListIdentityResolutionJobsResult> listIdentityResolutionJobsAsync(ListIdentityResolutionJobsRequest request) {

        return listIdentityResolutionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityResolutionJobsResult> listIdentityResolutionJobsAsync(final ListIdentityResolutionJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityResolutionJobsRequest, ListIdentityResolutionJobsResult> asyncHandler) {
        final ListIdentityResolutionJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityResolutionJobsResult>() {
            @Override
            public ListIdentityResolutionJobsResult call() throws Exception {
                ListIdentityResolutionJobsResult result = null;

                try {
                    result = executeListIdentityResolutionJobs(finalRequest);
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
    public java.util.concurrent.Future<ListIntegrationsResult> listIntegrationsAsync(ListIntegrationsRequest request) {

        return listIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationsResult> listIntegrationsAsync(final ListIntegrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntegrationsRequest, ListIntegrationsResult> asyncHandler) {
        final ListIntegrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntegrationsResult>() {
            @Override
            public ListIntegrationsResult call() throws Exception {
                ListIntegrationsResult result = null;

                try {
                    result = executeListIntegrations(finalRequest);
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
    public java.util.concurrent.Future<ListProfileObjectTypeTemplatesResult> listProfileObjectTypeTemplatesAsync(ListProfileObjectTypeTemplatesRequest request) {

        return listProfileObjectTypeTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectTypeTemplatesResult> listProfileObjectTypeTemplatesAsync(
            final ListProfileObjectTypeTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileObjectTypeTemplatesRequest, ListProfileObjectTypeTemplatesResult> asyncHandler) {
        final ListProfileObjectTypeTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileObjectTypeTemplatesResult>() {
            @Override
            public ListProfileObjectTypeTemplatesResult call() throws Exception {
                ListProfileObjectTypeTemplatesResult result = null;

                try {
                    result = executeListProfileObjectTypeTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListProfileObjectTypesResult> listProfileObjectTypesAsync(ListProfileObjectTypesRequest request) {

        return listProfileObjectTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectTypesResult> listProfileObjectTypesAsync(final ListProfileObjectTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileObjectTypesRequest, ListProfileObjectTypesResult> asyncHandler) {
        final ListProfileObjectTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileObjectTypesResult>() {
            @Override
            public ListProfileObjectTypesResult call() throws Exception {
                ListProfileObjectTypesResult result = null;

                try {
                    result = executeListProfileObjectTypes(finalRequest);
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
    public java.util.concurrent.Future<ListProfileObjectsResult> listProfileObjectsAsync(ListProfileObjectsRequest request) {

        return listProfileObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileObjectsResult> listProfileObjectsAsync(final ListProfileObjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileObjectsRequest, ListProfileObjectsResult> asyncHandler) {
        final ListProfileObjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileObjectsResult>() {
            @Override
            public ListProfileObjectsResult call() throws Exception {
                ListProfileObjectsResult result = null;

                try {
                    result = executeListProfileObjects(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(final ListWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {
        final ListWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowsResult>() {
            @Override
            public ListWorkflowsResult call() throws Exception {
                ListWorkflowsResult result = null;

                try {
                    result = executeListWorkflows(finalRequest);
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
    public java.util.concurrent.Future<MergeProfilesResult> mergeProfilesAsync(MergeProfilesRequest request) {

        return mergeProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeProfilesResult> mergeProfilesAsync(final MergeProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeProfilesRequest, MergeProfilesResult> asyncHandler) {
        final MergeProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergeProfilesResult>() {
            @Override
            public MergeProfilesResult call() throws Exception {
                MergeProfilesResult result = null;

                try {
                    result = executeMergeProfiles(finalRequest);
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
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest request) {

        return putIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(final PutIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler) {
        final PutIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutIntegrationResult>() {
            @Override
            public PutIntegrationResult call() throws Exception {
                PutIntegrationResult result = null;

                try {
                    result = executePutIntegration(finalRequest);
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
    public java.util.concurrent.Future<PutProfileObjectResult> putProfileObjectAsync(PutProfileObjectRequest request) {

        return putProfileObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProfileObjectResult> putProfileObjectAsync(final PutProfileObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutProfileObjectRequest, PutProfileObjectResult> asyncHandler) {
        final PutProfileObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutProfileObjectResult>() {
            @Override
            public PutProfileObjectResult call() throws Exception {
                PutProfileObjectResult result = null;

                try {
                    result = executePutProfileObject(finalRequest);
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
    public java.util.concurrent.Future<PutProfileObjectTypeResult> putProfileObjectTypeAsync(PutProfileObjectTypeRequest request) {

        return putProfileObjectTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProfileObjectTypeResult> putProfileObjectTypeAsync(final PutProfileObjectTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutProfileObjectTypeRequest, PutProfileObjectTypeResult> asyncHandler) {
        final PutProfileObjectTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutProfileObjectTypeResult>() {
            @Override
            public PutProfileObjectTypeResult call() throws Exception {
                PutProfileObjectTypeResult result = null;

                try {
                    result = executePutProfileObjectType(finalRequest);
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
    public java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest request) {

        return searchProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(final SearchProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProfilesRequest, SearchProfilesResult> asyncHandler) {
        final SearchProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProfilesResult>() {
            @Override
            public SearchProfilesResult call() throws Exception {
                SearchProfilesResult result = null;

                try {
                    result = executeSearchProfiles(finalRequest);
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
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request) {

        return updateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(final UpdateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler) {
        final UpdateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileResult>() {
            @Override
            public UpdateProfileResult call() throws Exception {
                UpdateProfileResult result = null;

                try {
                    result = executeUpdateProfile(finalRequest);
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
