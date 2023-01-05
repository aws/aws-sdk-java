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
package com.amazonaws.services.licensemanagerusersubscriptions;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS License Manager User Subscriptions asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * With License Manager, you can create user-based subscriptions to utilize licensed software with a per user
 * subscription fee on Amazon EC2 instances.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLicenseManagerUserSubscriptionsAsyncClient extends AWSLicenseManagerUserSubscriptionsClient implements AWSLicenseManagerUserSubscriptionsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSLicenseManagerUserSubscriptionsAsyncClientBuilder asyncBuilder() {
        return AWSLicenseManagerUserSubscriptionsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS License Manager User Subscriptions using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerUserSubscriptionsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS License Manager User Subscriptions using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLicenseManagerUserSubscriptionsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateUserResult> associateUserAsync(AssociateUserRequest request) {

        return associateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateUserResult> associateUserAsync(final AssociateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateUserRequest, AssociateUserResult> asyncHandler) {
        final AssociateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateUserResult>() {
            @Override
            public AssociateUserResult call() throws Exception {
                AssociateUserResult result = null;

                try {
                    result = executeAssociateUser(finalRequest);
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
    public java.util.concurrent.Future<DeregisterIdentityProviderResult> deregisterIdentityProviderAsync(DeregisterIdentityProviderRequest request) {

        return deregisterIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterIdentityProviderResult> deregisterIdentityProviderAsync(final DeregisterIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterIdentityProviderRequest, DeregisterIdentityProviderResult> asyncHandler) {
        final DeregisterIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterIdentityProviderResult>() {
            @Override
            public DeregisterIdentityProviderResult call() throws Exception {
                DeregisterIdentityProviderResult result = null;

                try {
                    result = executeDeregisterIdentityProvider(finalRequest);
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
    public java.util.concurrent.Future<DisassociateUserResult> disassociateUserAsync(DisassociateUserRequest request) {

        return disassociateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserResult> disassociateUserAsync(final DisassociateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateUserRequest, DisassociateUserResult> asyncHandler) {
        final DisassociateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateUserResult>() {
            @Override
            public DisassociateUserResult call() throws Exception {
                DisassociateUserResult result = null;

                try {
                    result = executeDisassociateUser(finalRequest);
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
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest request) {

        return listIdentityProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(final ListIdentityProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler) {
        final ListIdentityProvidersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityProvidersResult>() {
            @Override
            public ListIdentityProvidersResult call() throws Exception {
                ListIdentityProvidersResult result = null;

                try {
                    result = executeListIdentityProviders(finalRequest);
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
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {
        final ListInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstancesResult>() {
            @Override
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;

                try {
                    result = executeListInstances(finalRequest);
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
    public java.util.concurrent.Future<ListProductSubscriptionsResult> listProductSubscriptionsAsync(ListProductSubscriptionsRequest request) {

        return listProductSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProductSubscriptionsResult> listProductSubscriptionsAsync(final ListProductSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProductSubscriptionsRequest, ListProductSubscriptionsResult> asyncHandler) {
        final ListProductSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProductSubscriptionsResult>() {
            @Override
            public ListProductSubscriptionsResult call() throws Exception {
                ListProductSubscriptionsResult result = null;

                try {
                    result = executeListProductSubscriptions(finalRequest);
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
    public java.util.concurrent.Future<ListUserAssociationsResult> listUserAssociationsAsync(ListUserAssociationsRequest request) {

        return listUserAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserAssociationsResult> listUserAssociationsAsync(final ListUserAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserAssociationsRequest, ListUserAssociationsResult> asyncHandler) {
        final ListUserAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserAssociationsResult>() {
            @Override
            public ListUserAssociationsResult call() throws Exception {
                ListUserAssociationsResult result = null;

                try {
                    result = executeListUserAssociations(finalRequest);
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
    public java.util.concurrent.Future<RegisterIdentityProviderResult> registerIdentityProviderAsync(RegisterIdentityProviderRequest request) {

        return registerIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterIdentityProviderResult> registerIdentityProviderAsync(final RegisterIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterIdentityProviderRequest, RegisterIdentityProviderResult> asyncHandler) {
        final RegisterIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterIdentityProviderResult>() {
            @Override
            public RegisterIdentityProviderResult call() throws Exception {
                RegisterIdentityProviderResult result = null;

                try {
                    result = executeRegisterIdentityProvider(finalRequest);
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
    public java.util.concurrent.Future<StartProductSubscriptionResult> startProductSubscriptionAsync(StartProductSubscriptionRequest request) {

        return startProductSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartProductSubscriptionResult> startProductSubscriptionAsync(final StartProductSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartProductSubscriptionRequest, StartProductSubscriptionResult> asyncHandler) {
        final StartProductSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartProductSubscriptionResult>() {
            @Override
            public StartProductSubscriptionResult call() throws Exception {
                StartProductSubscriptionResult result = null;

                try {
                    result = executeStartProductSubscription(finalRequest);
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
    public java.util.concurrent.Future<StopProductSubscriptionResult> stopProductSubscriptionAsync(StopProductSubscriptionRequest request) {

        return stopProductSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopProductSubscriptionResult> stopProductSubscriptionAsync(final StopProductSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopProductSubscriptionRequest, StopProductSubscriptionResult> asyncHandler) {
        final StopProductSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopProductSubscriptionResult>() {
            @Override
            public StopProductSubscriptionResult call() throws Exception {
                StopProductSubscriptionResult result = null;

                try {
                    result = executeStopProductSubscription(finalRequest);
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
    public java.util.concurrent.Future<UpdateIdentityProviderSettingsResult> updateIdentityProviderSettingsAsync(UpdateIdentityProviderSettingsRequest request) {

        return updateIdentityProviderSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderSettingsResult> updateIdentityProviderSettingsAsync(
            final UpdateIdentityProviderSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderSettingsRequest, UpdateIdentityProviderSettingsResult> asyncHandler) {
        final UpdateIdentityProviderSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdentityProviderSettingsResult>() {
            @Override
            public UpdateIdentityProviderSettingsResult call() throws Exception {
                UpdateIdentityProviderSettingsResult result = null;

                try {
                    result = executeUpdateIdentityProviderSettings(finalRequest);
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
