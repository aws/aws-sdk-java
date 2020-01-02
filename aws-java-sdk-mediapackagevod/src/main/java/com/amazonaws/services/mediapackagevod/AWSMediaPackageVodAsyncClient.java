/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagevod.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaPackage Vod asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * AWS Elemental MediaPackage VOD
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaPackageVodAsyncClient extends AWSMediaPackageVodClient implements AWSMediaPackageVodAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaPackageVodAsyncClientBuilder asyncBuilder() {
        return AWSMediaPackageVodAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaPackage Vod using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageVodAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreatePackagingConfigurationResult> createPackagingConfigurationAsync(CreatePackagingConfigurationRequest request) {

        return createPackagingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingConfigurationResult> createPackagingConfigurationAsync(final CreatePackagingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePackagingConfigurationRequest, CreatePackagingConfigurationResult> asyncHandler) {
        final CreatePackagingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePackagingConfigurationResult>() {
            @Override
            public CreatePackagingConfigurationResult call() throws Exception {
                CreatePackagingConfigurationResult result = null;

                try {
                    result = executeCreatePackagingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingGroupResult> createPackagingGroupAsync(CreatePackagingGroupRequest request) {

        return createPackagingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingGroupResult> createPackagingGroupAsync(final CreatePackagingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePackagingGroupRequest, CreatePackagingGroupResult> asyncHandler) {
        final CreatePackagingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePackagingGroupResult>() {
            @Override
            public CreatePackagingGroupResult call() throws Exception {
                CreatePackagingGroupResult result = null;

                try {
                    result = executeCreatePackagingGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeletePackagingConfigurationResult> deletePackagingConfigurationAsync(DeletePackagingConfigurationRequest request) {

        return deletePackagingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingConfigurationResult> deletePackagingConfigurationAsync(final DeletePackagingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePackagingConfigurationRequest, DeletePackagingConfigurationResult> asyncHandler) {
        final DeletePackagingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePackagingConfigurationResult>() {
            @Override
            public DeletePackagingConfigurationResult call() throws Exception {
                DeletePackagingConfigurationResult result = null;

                try {
                    result = executeDeletePackagingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingGroupResult> deletePackagingGroupAsync(DeletePackagingGroupRequest request) {

        return deletePackagingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingGroupResult> deletePackagingGroupAsync(final DeletePackagingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePackagingGroupRequest, DeletePackagingGroupResult> asyncHandler) {
        final DeletePackagingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePackagingGroupResult>() {
            @Override
            public DeletePackagingGroupResult call() throws Exception {
                DeletePackagingGroupResult result = null;

                try {
                    result = executeDeletePackagingGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest request) {

        return describeAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(final DescribeAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssetRequest, DescribeAssetResult> asyncHandler) {
        final DescribeAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssetResult>() {
            @Override
            public DescribeAssetResult call() throws Exception {
                DescribeAssetResult result = null;

                try {
                    result = executeDescribeAsset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingConfigurationResult> describePackagingConfigurationAsync(DescribePackagingConfigurationRequest request) {

        return describePackagingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingConfigurationResult> describePackagingConfigurationAsync(
            final DescribePackagingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackagingConfigurationRequest, DescribePackagingConfigurationResult> asyncHandler) {
        final DescribePackagingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackagingConfigurationResult>() {
            @Override
            public DescribePackagingConfigurationResult call() throws Exception {
                DescribePackagingConfigurationResult result = null;

                try {
                    result = executeDescribePackagingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingGroupResult> describePackagingGroupAsync(DescribePackagingGroupRequest request) {

        return describePackagingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingGroupResult> describePackagingGroupAsync(final DescribePackagingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackagingGroupRequest, DescribePackagingGroupResult> asyncHandler) {
        final DescribePackagingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackagingGroupResult>() {
            @Override
            public DescribePackagingGroupResult call() throws Exception {
                DescribePackagingGroupResult result = null;

                try {
                    result = executeDescribePackagingGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest request) {

        return listAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(final ListAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssetsRequest, ListAssetsResult> asyncHandler) {
        final ListAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssetsResult>() {
            @Override
            public ListAssetsResult call() throws Exception {
                ListAssetsResult result = null;

                try {
                    result = executeListAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPackagingConfigurationsResult> listPackagingConfigurationsAsync(ListPackagingConfigurationsRequest request) {

        return listPackagingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagingConfigurationsResult> listPackagingConfigurationsAsync(final ListPackagingConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackagingConfigurationsRequest, ListPackagingConfigurationsResult> asyncHandler) {
        final ListPackagingConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackagingConfigurationsResult>() {
            @Override
            public ListPackagingConfigurationsResult call() throws Exception {
                ListPackagingConfigurationsResult result = null;

                try {
                    result = executeListPackagingConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPackagingGroupsResult> listPackagingGroupsAsync(ListPackagingGroupsRequest request) {

        return listPackagingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagingGroupsResult> listPackagingGroupsAsync(final ListPackagingGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackagingGroupsRequest, ListPackagingGroupsResult> asyncHandler) {
        final ListPackagingGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackagingGroupsResult>() {
            @Override
            public ListPackagingGroupsResult call() throws Exception {
                ListPackagingGroupsResult result = null;

                try {
                    result = executeListPackagingGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
