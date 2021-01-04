/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS License Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname> AWS License Manager </fullname>
 * <p>
 * AWS License Manager makes it easier to manage licenses from software vendors across multiple AWS accounts and
 * on-premises servers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLicenseManagerAsyncClient extends AWSLicenseManagerClient implements AWSLicenseManagerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSLicenseManagerAsyncClientBuilder asyncBuilder() {
        return AWSLicenseManagerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS License Manager using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS License Manager using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLicenseManagerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptGrantResult> acceptGrantAsync(AcceptGrantRequest request) {

        return acceptGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptGrantResult> acceptGrantAsync(final AcceptGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptGrantRequest, AcceptGrantResult> asyncHandler) {
        final AcceptGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptGrantResult>() {
            @Override
            public AcceptGrantResult call() throws Exception {
                AcceptGrantResult result = null;

                try {
                    result = executeAcceptGrant(finalRequest);
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
    public java.util.concurrent.Future<CheckInLicenseResult> checkInLicenseAsync(CheckInLicenseRequest request) {

        return checkInLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckInLicenseResult> checkInLicenseAsync(final CheckInLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckInLicenseRequest, CheckInLicenseResult> asyncHandler) {
        final CheckInLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckInLicenseResult>() {
            @Override
            public CheckInLicenseResult call() throws Exception {
                CheckInLicenseResult result = null;

                try {
                    result = executeCheckInLicense(finalRequest);
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
    public java.util.concurrent.Future<CheckoutBorrowLicenseResult> checkoutBorrowLicenseAsync(CheckoutBorrowLicenseRequest request) {

        return checkoutBorrowLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckoutBorrowLicenseResult> checkoutBorrowLicenseAsync(final CheckoutBorrowLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckoutBorrowLicenseRequest, CheckoutBorrowLicenseResult> asyncHandler) {
        final CheckoutBorrowLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckoutBorrowLicenseResult>() {
            @Override
            public CheckoutBorrowLicenseResult call() throws Exception {
                CheckoutBorrowLicenseResult result = null;

                try {
                    result = executeCheckoutBorrowLicense(finalRequest);
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
    public java.util.concurrent.Future<CheckoutLicenseResult> checkoutLicenseAsync(CheckoutLicenseRequest request) {

        return checkoutLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckoutLicenseResult> checkoutLicenseAsync(final CheckoutLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckoutLicenseRequest, CheckoutLicenseResult> asyncHandler) {
        final CheckoutLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckoutLicenseResult>() {
            @Override
            public CheckoutLicenseResult call() throws Exception {
                CheckoutLicenseResult result = null;

                try {
                    result = executeCheckoutLicense(finalRequest);
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
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest request) {

        return createGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(final CreateGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler) {
        final CreateGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGrantResult>() {
            @Override
            public CreateGrantResult call() throws Exception {
                CreateGrantResult result = null;

                try {
                    result = executeCreateGrant(finalRequest);
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
    public java.util.concurrent.Future<CreateGrantVersionResult> createGrantVersionAsync(CreateGrantVersionRequest request) {

        return createGrantVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGrantVersionResult> createGrantVersionAsync(final CreateGrantVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGrantVersionRequest, CreateGrantVersionResult> asyncHandler) {
        final CreateGrantVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGrantVersionResult>() {
            @Override
            public CreateGrantVersionResult call() throws Exception {
                CreateGrantVersionResult result = null;

                try {
                    result = executeCreateGrantVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateLicenseResult> createLicenseAsync(CreateLicenseRequest request) {

        return createLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseResult> createLicenseAsync(final CreateLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLicenseRequest, CreateLicenseResult> asyncHandler) {
        final CreateLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLicenseResult>() {
            @Override
            public CreateLicenseResult call() throws Exception {
                CreateLicenseResult result = null;

                try {
                    result = executeCreateLicense(finalRequest);
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
    public java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(CreateLicenseConfigurationRequest request) {

        return createLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(final CreateLicenseConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLicenseConfigurationRequest, CreateLicenseConfigurationResult> asyncHandler) {
        final CreateLicenseConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLicenseConfigurationResult>() {
            @Override
            public CreateLicenseConfigurationResult call() throws Exception {
                CreateLicenseConfigurationResult result = null;

                try {
                    result = executeCreateLicenseConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateLicenseVersionResult> createLicenseVersionAsync(CreateLicenseVersionRequest request) {

        return createLicenseVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseVersionResult> createLicenseVersionAsync(final CreateLicenseVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLicenseVersionRequest, CreateLicenseVersionResult> asyncHandler) {
        final CreateLicenseVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLicenseVersionResult>() {
            @Override
            public CreateLicenseVersionResult call() throws Exception {
                CreateLicenseVersionResult result = null;

                try {
                    result = executeCreateLicenseVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest request) {

        return createTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(final CreateTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler) {
        final CreateTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTokenResult>() {
            @Override
            public CreateTokenResult call() throws Exception {
                CreateTokenResult result = null;

                try {
                    result = executeCreateToken(finalRequest);
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
    public java.util.concurrent.Future<DeleteGrantResult> deleteGrantAsync(DeleteGrantRequest request) {

        return deleteGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGrantResult> deleteGrantAsync(final DeleteGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGrantRequest, DeleteGrantResult> asyncHandler) {
        final DeleteGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGrantResult>() {
            @Override
            public DeleteGrantResult call() throws Exception {
                DeleteGrantResult result = null;

                try {
                    result = executeDeleteGrant(finalRequest);
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
    public java.util.concurrent.Future<DeleteLicenseResult> deleteLicenseAsync(DeleteLicenseRequest request) {

        return deleteLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseResult> deleteLicenseAsync(final DeleteLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLicenseRequest, DeleteLicenseResult> asyncHandler) {
        final DeleteLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLicenseResult>() {
            @Override
            public DeleteLicenseResult call() throws Exception {
                DeleteLicenseResult result = null;

                try {
                    result = executeDeleteLicense(finalRequest);
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
    public java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(DeleteLicenseConfigurationRequest request) {

        return deleteLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(final DeleteLicenseConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLicenseConfigurationRequest, DeleteLicenseConfigurationResult> asyncHandler) {
        final DeleteLicenseConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLicenseConfigurationResult>() {
            @Override
            public DeleteLicenseConfigurationResult call() throws Exception {
                DeleteLicenseConfigurationResult result = null;

                try {
                    result = executeDeleteLicenseConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(DeleteTokenRequest request) {

        return deleteTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(final DeleteTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTokenRequest, DeleteTokenResult> asyncHandler) {
        final DeleteTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTokenResult>() {
            @Override
            public DeleteTokenResult call() throws Exception {
                DeleteTokenResult result = null;

                try {
                    result = executeDeleteToken(finalRequest);
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
    public java.util.concurrent.Future<ExtendLicenseConsumptionResult> extendLicenseConsumptionAsync(ExtendLicenseConsumptionRequest request) {

        return extendLicenseConsumptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExtendLicenseConsumptionResult> extendLicenseConsumptionAsync(final ExtendLicenseConsumptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExtendLicenseConsumptionRequest, ExtendLicenseConsumptionResult> asyncHandler) {
        final ExtendLicenseConsumptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExtendLicenseConsumptionResult>() {
            @Override
            public ExtendLicenseConsumptionResult call() throws Exception {
                ExtendLicenseConsumptionResult result = null;

                try {
                    result = executeExtendLicenseConsumption(finalRequest);
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
    public java.util.concurrent.Future<GetAccessTokenResult> getAccessTokenAsync(GetAccessTokenRequest request) {

        return getAccessTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessTokenResult> getAccessTokenAsync(final GetAccessTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessTokenRequest, GetAccessTokenResult> asyncHandler) {
        final GetAccessTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessTokenResult>() {
            @Override
            public GetAccessTokenResult call() throws Exception {
                GetAccessTokenResult result = null;

                try {
                    result = executeGetAccessToken(finalRequest);
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
    public java.util.concurrent.Future<GetGrantResult> getGrantAsync(GetGrantRequest request) {

        return getGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGrantResult> getGrantAsync(final GetGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGrantRequest, GetGrantResult> asyncHandler) {
        final GetGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGrantResult>() {
            @Override
            public GetGrantResult call() throws Exception {
                GetGrantResult result = null;

                try {
                    result = executeGetGrant(finalRequest);
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
    public java.util.concurrent.Future<GetLicenseResult> getLicenseAsync(GetLicenseRequest request) {

        return getLicenseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseResult> getLicenseAsync(final GetLicenseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLicenseRequest, GetLicenseResult> asyncHandler) {
        final GetLicenseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLicenseResult>() {
            @Override
            public GetLicenseResult call() throws Exception {
                GetLicenseResult result = null;

                try {
                    result = executeGetLicense(finalRequest);
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
    public java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest request) {

        return getLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(final GetLicenseConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLicenseConfigurationRequest, GetLicenseConfigurationResult> asyncHandler) {
        final GetLicenseConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLicenseConfigurationResult>() {
            @Override
            public GetLicenseConfigurationResult call() throws Exception {
                GetLicenseConfigurationResult result = null;

                try {
                    result = executeGetLicenseConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetLicenseUsageResult> getLicenseUsageAsync(GetLicenseUsageRequest request) {

        return getLicenseUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseUsageResult> getLicenseUsageAsync(final GetLicenseUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLicenseUsageRequest, GetLicenseUsageResult> asyncHandler) {
        final GetLicenseUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLicenseUsageResult>() {
            @Override
            public GetLicenseUsageResult call() throws Exception {
                GetLicenseUsageResult result = null;

                try {
                    result = executeGetLicenseUsage(finalRequest);
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
    public java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest request) {

        return getServiceSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(final GetServiceSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceSettingsRequest, GetServiceSettingsResult> asyncHandler) {
        final GetServiceSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceSettingsResult>() {
            @Override
            public GetServiceSettingsResult call() throws Exception {
                GetServiceSettingsResult result = null;

                try {
                    result = executeGetServiceSettings(finalRequest);
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
    public java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest request) {

        return listAssociationsForLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            final ListAssociationsForLicenseConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociationsForLicenseConfigurationRequest, ListAssociationsForLicenseConfigurationResult> asyncHandler) {
        final ListAssociationsForLicenseConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociationsForLicenseConfigurationResult>() {
            @Override
            public ListAssociationsForLicenseConfigurationResult call() throws Exception {
                ListAssociationsForLicenseConfigurationResult result = null;

                try {
                    result = executeListAssociationsForLicenseConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListDistributedGrantsResult> listDistributedGrantsAsync(ListDistributedGrantsRequest request) {

        return listDistributedGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributedGrantsResult> listDistributedGrantsAsync(final ListDistributedGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributedGrantsRequest, ListDistributedGrantsResult> asyncHandler) {
        final ListDistributedGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributedGrantsResult>() {
            @Override
            public ListDistributedGrantsResult call() throws Exception {
                ListDistributedGrantsResult result = null;

                try {
                    result = executeListDistributedGrants(finalRequest);
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
    public java.util.concurrent.Future<ListFailuresForLicenseConfigurationOperationsResult> listFailuresForLicenseConfigurationOperationsAsync(
            ListFailuresForLicenseConfigurationOperationsRequest request) {

        return listFailuresForLicenseConfigurationOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFailuresForLicenseConfigurationOperationsResult> listFailuresForLicenseConfigurationOperationsAsync(
            final ListFailuresForLicenseConfigurationOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFailuresForLicenseConfigurationOperationsRequest, ListFailuresForLicenseConfigurationOperationsResult> asyncHandler) {
        final ListFailuresForLicenseConfigurationOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFailuresForLicenseConfigurationOperationsResult>() {
            @Override
            public ListFailuresForLicenseConfigurationOperationsResult call() throws Exception {
                ListFailuresForLicenseConfigurationOperationsResult result = null;

                try {
                    result = executeListFailuresForLicenseConfigurationOperations(finalRequest);
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
    public java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(ListLicenseConfigurationsRequest request) {

        return listLicenseConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(final ListLicenseConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLicenseConfigurationsRequest, ListLicenseConfigurationsResult> asyncHandler) {
        final ListLicenseConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLicenseConfigurationsResult>() {
            @Override
            public ListLicenseConfigurationsResult call() throws Exception {
                ListLicenseConfigurationsResult result = null;

                try {
                    result = executeListLicenseConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest request) {

        return listLicenseSpecificationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            final ListLicenseSpecificationsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLicenseSpecificationsForResourceRequest, ListLicenseSpecificationsForResourceResult> asyncHandler) {
        final ListLicenseSpecificationsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLicenseSpecificationsForResourceResult>() {
            @Override
            public ListLicenseSpecificationsForResourceResult call() throws Exception {
                ListLicenseSpecificationsForResourceResult result = null;

                try {
                    result = executeListLicenseSpecificationsForResource(finalRequest);
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
    public java.util.concurrent.Future<ListLicenseVersionsResult> listLicenseVersionsAsync(ListLicenseVersionsRequest request) {

        return listLicenseVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseVersionsResult> listLicenseVersionsAsync(final ListLicenseVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLicenseVersionsRequest, ListLicenseVersionsResult> asyncHandler) {
        final ListLicenseVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLicenseVersionsResult>() {
            @Override
            public ListLicenseVersionsResult call() throws Exception {
                ListLicenseVersionsResult result = null;

                try {
                    result = executeListLicenseVersions(finalRequest);
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
    public java.util.concurrent.Future<ListLicensesResult> listLicensesAsync(ListLicensesRequest request) {

        return listLicensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicensesResult> listLicensesAsync(final ListLicensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLicensesRequest, ListLicensesResult> asyncHandler) {
        final ListLicensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLicensesResult>() {
            @Override
            public ListLicensesResult call() throws Exception {
                ListLicensesResult result = null;

                try {
                    result = executeListLicenses(finalRequest);
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
    public java.util.concurrent.Future<ListReceivedGrantsResult> listReceivedGrantsAsync(ListReceivedGrantsRequest request) {

        return listReceivedGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceivedGrantsResult> listReceivedGrantsAsync(final ListReceivedGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReceivedGrantsRequest, ListReceivedGrantsResult> asyncHandler) {
        final ListReceivedGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReceivedGrantsResult>() {
            @Override
            public ListReceivedGrantsResult call() throws Exception {
                ListReceivedGrantsResult result = null;

                try {
                    result = executeListReceivedGrants(finalRequest);
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
    public java.util.concurrent.Future<ListReceivedLicensesResult> listReceivedLicensesAsync(ListReceivedLicensesRequest request) {

        return listReceivedLicensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceivedLicensesResult> listReceivedLicensesAsync(final ListReceivedLicensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReceivedLicensesRequest, ListReceivedLicensesResult> asyncHandler) {
        final ListReceivedLicensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReceivedLicensesResult>() {
            @Override
            public ListReceivedLicensesResult call() throws Exception {
                ListReceivedLicensesResult result = null;

                try {
                    result = executeListReceivedLicenses(finalRequest);
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
    public java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest request) {

        return listResourceInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(final ListResourceInventoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceInventoryRequest, ListResourceInventoryResult> asyncHandler) {
        final ListResourceInventoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceInventoryResult>() {
            @Override
            public ListResourceInventoryResult call() throws Exception {
                ListResourceInventoryResult result = null;

                try {
                    result = executeListResourceInventory(finalRequest);
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
    public java.util.concurrent.Future<ListTokensResult> listTokensAsync(ListTokensRequest request) {

        return listTokensAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTokensResult> listTokensAsync(final ListTokensRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTokensRequest, ListTokensResult> asyncHandler) {
        final ListTokensRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTokensResult>() {
            @Override
            public ListTokensResult call() throws Exception {
                ListTokensResult result = null;

                try {
                    result = executeListTokens(finalRequest);
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
    public java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest request) {

        return listUsageForLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            final ListUsageForLicenseConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsageForLicenseConfigurationRequest, ListUsageForLicenseConfigurationResult> asyncHandler) {
        final ListUsageForLicenseConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsageForLicenseConfigurationResult>() {
            @Override
            public ListUsageForLicenseConfigurationResult call() throws Exception {
                ListUsageForLicenseConfigurationResult result = null;

                try {
                    result = executeListUsageForLicenseConfiguration(finalRequest);
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
    public java.util.concurrent.Future<RejectGrantResult> rejectGrantAsync(RejectGrantRequest request) {

        return rejectGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectGrantResult> rejectGrantAsync(final RejectGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectGrantRequest, RejectGrantResult> asyncHandler) {
        final RejectGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectGrantResult>() {
            @Override
            public RejectGrantResult call() throws Exception {
                RejectGrantResult result = null;

                try {
                    result = executeRejectGrant(finalRequest);
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
    public java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(UpdateLicenseConfigurationRequest request) {

        return updateLicenseConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(final UpdateLicenseConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLicenseConfigurationRequest, UpdateLicenseConfigurationResult> asyncHandler) {
        final UpdateLicenseConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLicenseConfigurationResult>() {
            @Override
            public UpdateLicenseConfigurationResult call() throws Exception {
                UpdateLicenseConfigurationResult result = null;

                try {
                    result = executeUpdateLicenseConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest request) {

        return updateLicenseSpecificationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            final UpdateLicenseSpecificationsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLicenseSpecificationsForResourceRequest, UpdateLicenseSpecificationsForResourceResult> asyncHandler) {
        final UpdateLicenseSpecificationsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLicenseSpecificationsForResourceResult>() {
            @Override
            public UpdateLicenseSpecificationsForResourceResult call() throws Exception {
                UpdateLicenseSpecificationsForResourceResult result = null;

                try {
                    result = executeUpdateLicenseSpecificationsForResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest request) {

        return updateServiceSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(final UpdateServiceSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingsRequest, UpdateServiceSettingsResult> asyncHandler) {
        final UpdateServiceSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceSettingsResult>() {
            @Override
            public UpdateServiceSettingsResult call() throws Exception {
                UpdateServiceSettingsResult result = null;

                try {
                    result = executeUpdateServiceSettings(finalRequest);
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
