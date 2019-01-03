/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <i>This is the AWS License Manager API Reference.</i> It provides descriptions, syntax, and usage examples for each
 * of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
 * and the XML response. You can also view the XML request elements in the WSDL.
 * </p>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
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
        super(asyncClientParams);
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
