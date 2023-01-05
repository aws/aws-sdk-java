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
package com.amazonaws.services.licensemanagerlinuxsubscriptions;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerlinuxsubscriptions.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS License Manager Linux Subscriptions asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * With License Manager, you can discover and track your commercial Linux subscriptions on running Amazon EC2 instances.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLicenseManagerLinuxSubscriptionsAsyncClient extends AWSLicenseManagerLinuxSubscriptionsClient implements
        AWSLicenseManagerLinuxSubscriptionsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSLicenseManagerLinuxSubscriptionsAsyncClientBuilder asyncBuilder() {
        return AWSLicenseManagerLinuxSubscriptionsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS License Manager Linux Subscriptions using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerLinuxSubscriptionsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS License Manager Linux Subscriptions using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSLicenseManagerLinuxSubscriptionsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ListLinuxSubscriptionInstancesResult> listLinuxSubscriptionInstancesAsync(ListLinuxSubscriptionInstancesRequest request) {

        return listLinuxSubscriptionInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLinuxSubscriptionInstancesResult> listLinuxSubscriptionInstancesAsync(
            final ListLinuxSubscriptionInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLinuxSubscriptionInstancesRequest, ListLinuxSubscriptionInstancesResult> asyncHandler) {
        final ListLinuxSubscriptionInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLinuxSubscriptionInstancesResult>() {
            @Override
            public ListLinuxSubscriptionInstancesResult call() throws Exception {
                ListLinuxSubscriptionInstancesResult result = null;

                try {
                    result = executeListLinuxSubscriptionInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListLinuxSubscriptionsResult> listLinuxSubscriptionsAsync(ListLinuxSubscriptionsRequest request) {

        return listLinuxSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLinuxSubscriptionsResult> listLinuxSubscriptionsAsync(final ListLinuxSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLinuxSubscriptionsRequest, ListLinuxSubscriptionsResult> asyncHandler) {
        final ListLinuxSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLinuxSubscriptionsResult>() {
            @Override
            public ListLinuxSubscriptionsResult call() throws Exception {
                ListLinuxSubscriptionsResult result = null;

                try {
                    result = executeListLinuxSubscriptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
