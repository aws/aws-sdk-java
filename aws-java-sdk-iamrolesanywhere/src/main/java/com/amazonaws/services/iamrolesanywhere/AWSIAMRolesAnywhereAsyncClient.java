/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere;

import javax.annotation.Generated;

import com.amazonaws.services.iamrolesanywhere.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing IAM Roles Anywhere asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Identity and Access Management Roles Anywhere provides a secure way for your workloads such as servers,
 * containers, and applications running outside of AWS to obtain Temporary AWS credentials. Your workloads can use the
 * same IAM policies and roles that you have configured with native AWS applications to access AWS resources. Using IAM
 * Roles Anywhere will eliminate the need to manage long term credentials for workloads running outside of AWS.
 * </p>
 * <p>
 * To use IAM Roles Anywhere customer workloads will need to use X.509 certificates issued by their Certificate
 * Authority (CA) . The Certificate Authority (CA) needs to be registered with IAM Roles Anywhere as a trust anchor to
 * establish trust between customer PKI and IAM Roles Anywhere. Customers who do not manage their own PKI system can use
 * AWS Certificate Manager Private Certificate Authority (ACM PCA) to create a Certificate Authority and use that to
 * establish trust with IAM Roles Anywhere
 * </p>
 * <p>
 * This guide describes the IAM rolesanywhere operations that you can call programmatically. For general information
 * about IAM Roles Anywhere see <a href="https://docs.aws.amazon.com/">https://docs.aws.amazon.com/</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIAMRolesAnywhereAsyncClient extends AWSIAMRolesAnywhereClient implements AWSIAMRolesAnywhereAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIAMRolesAnywhereAsyncClientBuilder asyncBuilder() {
        return AWSIAMRolesAnywhereAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM Roles Anywhere using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIAMRolesAnywhereAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM Roles Anywhere using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIAMRolesAnywhereAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateTrustAnchorResult> createTrustAnchorAsync(CreateTrustAnchorRequest request) {

        return createTrustAnchorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrustAnchorResult> createTrustAnchorAsync(final CreateTrustAnchorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrustAnchorRequest, CreateTrustAnchorResult> asyncHandler) {
        final CreateTrustAnchorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrustAnchorResult>() {
            @Override
            public CreateTrustAnchorResult call() throws Exception {
                CreateTrustAnchorResult result = null;

                try {
                    result = executeCreateTrustAnchor(finalRequest);
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
    public java.util.concurrent.Future<DeleteCrlResult> deleteCrlAsync(DeleteCrlRequest request) {

        return deleteCrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCrlResult> deleteCrlAsync(final DeleteCrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCrlRequest, DeleteCrlResult> asyncHandler) {
        final DeleteCrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCrlResult>() {
            @Override
            public DeleteCrlResult call() throws Exception {
                DeleteCrlResult result = null;

                try {
                    result = executeDeleteCrl(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrustAnchorResult> deleteTrustAnchorAsync(DeleteTrustAnchorRequest request) {

        return deleteTrustAnchorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustAnchorResult> deleteTrustAnchorAsync(final DeleteTrustAnchorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrustAnchorRequest, DeleteTrustAnchorResult> asyncHandler) {
        final DeleteTrustAnchorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrustAnchorResult>() {
            @Override
            public DeleteTrustAnchorResult call() throws Exception {
                DeleteTrustAnchorResult result = null;

                try {
                    result = executeDeleteTrustAnchor(finalRequest);
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
    public java.util.concurrent.Future<DisableCrlResult> disableCrlAsync(DisableCrlRequest request) {

        return disableCrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableCrlResult> disableCrlAsync(final DisableCrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableCrlRequest, DisableCrlResult> asyncHandler) {
        final DisableCrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableCrlResult>() {
            @Override
            public DisableCrlResult call() throws Exception {
                DisableCrlResult result = null;

                try {
                    result = executeDisableCrl(finalRequest);
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
    public java.util.concurrent.Future<DisableProfileResult> disableProfileAsync(DisableProfileRequest request) {

        return disableProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableProfileResult> disableProfileAsync(final DisableProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableProfileRequest, DisableProfileResult> asyncHandler) {
        final DisableProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableProfileResult>() {
            @Override
            public DisableProfileResult call() throws Exception {
                DisableProfileResult result = null;

                try {
                    result = executeDisableProfile(finalRequest);
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
    public java.util.concurrent.Future<DisableTrustAnchorResult> disableTrustAnchorAsync(DisableTrustAnchorRequest request) {

        return disableTrustAnchorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableTrustAnchorResult> disableTrustAnchorAsync(final DisableTrustAnchorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableTrustAnchorRequest, DisableTrustAnchorResult> asyncHandler) {
        final DisableTrustAnchorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableTrustAnchorResult>() {
            @Override
            public DisableTrustAnchorResult call() throws Exception {
                DisableTrustAnchorResult result = null;

                try {
                    result = executeDisableTrustAnchor(finalRequest);
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
    public java.util.concurrent.Future<EnableCrlResult> enableCrlAsync(EnableCrlRequest request) {

        return enableCrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableCrlResult> enableCrlAsync(final EnableCrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableCrlRequest, EnableCrlResult> asyncHandler) {
        final EnableCrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableCrlResult>() {
            @Override
            public EnableCrlResult call() throws Exception {
                EnableCrlResult result = null;

                try {
                    result = executeEnableCrl(finalRequest);
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
    public java.util.concurrent.Future<EnableProfileResult> enableProfileAsync(EnableProfileRequest request) {

        return enableProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableProfileResult> enableProfileAsync(final EnableProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableProfileRequest, EnableProfileResult> asyncHandler) {
        final EnableProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableProfileResult>() {
            @Override
            public EnableProfileResult call() throws Exception {
                EnableProfileResult result = null;

                try {
                    result = executeEnableProfile(finalRequest);
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
    public java.util.concurrent.Future<EnableTrustAnchorResult> enableTrustAnchorAsync(EnableTrustAnchorRequest request) {

        return enableTrustAnchorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableTrustAnchorResult> enableTrustAnchorAsync(final EnableTrustAnchorRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableTrustAnchorRequest, EnableTrustAnchorResult> asyncHandler) {
        final EnableTrustAnchorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableTrustAnchorResult>() {
            @Override
            public EnableTrustAnchorResult call() throws Exception {
                EnableTrustAnchorResult result = null;

                try {
                    result = executeEnableTrustAnchor(finalRequest);
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
    public java.util.concurrent.Future<GetCrlResult> getCrlAsync(GetCrlRequest request) {

        return getCrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCrlResult> getCrlAsync(final GetCrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCrlRequest, GetCrlResult> asyncHandler) {
        final GetCrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCrlResult>() {
            @Override
            public GetCrlResult call() throws Exception {
                GetCrlResult result = null;

                try {
                    result = executeGetCrl(finalRequest);
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
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request) {

        return getProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(final GetProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler) {
        final GetProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileResult>() {
            @Override
            public GetProfileResult call() throws Exception {
                GetProfileResult result = null;

                try {
                    result = executeGetProfile(finalRequest);
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
    public java.util.concurrent.Future<GetSubjectResult> getSubjectAsync(GetSubjectRequest request) {

        return getSubjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubjectResult> getSubjectAsync(final GetSubjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubjectRequest, GetSubjectResult> asyncHandler) {
        final GetSubjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubjectResult>() {
            @Override
            public GetSubjectResult call() throws Exception {
                GetSubjectResult result = null;

                try {
                    result = executeGetSubject(finalRequest);
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
    public java.util.concurrent.Future<GetTrustAnchorResult> getTrustAnchorAsync(GetTrustAnchorRequest request) {

        return getTrustAnchorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrustAnchorResult> getTrustAnchorAsync(final GetTrustAnchorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrustAnchorRequest, GetTrustAnchorResult> asyncHandler) {
        final GetTrustAnchorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrustAnchorResult>() {
            @Override
            public GetTrustAnchorResult call() throws Exception {
                GetTrustAnchorResult result = null;

                try {
                    result = executeGetTrustAnchor(finalRequest);
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
    public java.util.concurrent.Future<ImportCrlResult> importCrlAsync(ImportCrlRequest request) {

        return importCrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCrlResult> importCrlAsync(final ImportCrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCrlRequest, ImportCrlResult> asyncHandler) {
        final ImportCrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportCrlResult>() {
            @Override
            public ImportCrlResult call() throws Exception {
                ImportCrlResult result = null;

                try {
                    result = executeImportCrl(finalRequest);
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
    public java.util.concurrent.Future<ListCrlsResult> listCrlsAsync(ListCrlsRequest request) {

        return listCrlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCrlsResult> listCrlsAsync(final ListCrlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCrlsRequest, ListCrlsResult> asyncHandler) {
        final ListCrlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCrlsResult>() {
            @Override
            public ListCrlsResult call() throws Exception {
                ListCrlsResult result = null;

                try {
                    result = executeListCrls(finalRequest);
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
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request) {

        return listProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(final ListProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler) {
        final ListProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilesResult>() {
            @Override
            public ListProfilesResult call() throws Exception {
                ListProfilesResult result = null;

                try {
                    result = executeListProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListSubjectsResult> listSubjectsAsync(ListSubjectsRequest request) {

        return listSubjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubjectsResult> listSubjectsAsync(final ListSubjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubjectsRequest, ListSubjectsResult> asyncHandler) {
        final ListSubjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubjectsResult>() {
            @Override
            public ListSubjectsResult call() throws Exception {
                ListSubjectsResult result = null;

                try {
                    result = executeListSubjects(finalRequest);
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
    public java.util.concurrent.Future<ListTrustAnchorsResult> listTrustAnchorsAsync(ListTrustAnchorsRequest request) {

        return listTrustAnchorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrustAnchorsResult> listTrustAnchorsAsync(final ListTrustAnchorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrustAnchorsRequest, ListTrustAnchorsResult> asyncHandler) {
        final ListTrustAnchorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrustAnchorsResult>() {
            @Override
            public ListTrustAnchorsResult call() throws Exception {
                ListTrustAnchorsResult result = null;

                try {
                    result = executeListTrustAnchors(finalRequest);
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
    public java.util.concurrent.Future<UpdateCrlResult> updateCrlAsync(UpdateCrlRequest request) {

        return updateCrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCrlResult> updateCrlAsync(final UpdateCrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCrlRequest, UpdateCrlResult> asyncHandler) {
        final UpdateCrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCrlResult>() {
            @Override
            public UpdateCrlResult call() throws Exception {
                UpdateCrlResult result = null;

                try {
                    result = executeUpdateCrl(finalRequest);
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

    @Override
    public java.util.concurrent.Future<UpdateTrustAnchorResult> updateTrustAnchorAsync(UpdateTrustAnchorRequest request) {

        return updateTrustAnchorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrustAnchorResult> updateTrustAnchorAsync(final UpdateTrustAnchorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrustAnchorRequest, UpdateTrustAnchorResult> asyncHandler) {
        final UpdateTrustAnchorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrustAnchorResult>() {
            @Override
            public UpdateTrustAnchorResult call() throws Exception {
                UpdateTrustAnchorResult result = null;

                try {
                    result = executeUpdateTrustAnchor(finalRequest);
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
