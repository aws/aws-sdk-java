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
package com.amazonaws.services.iotsitewise;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT SiteWise asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the IoT SiteWise API Reference. IoT SiteWise is an Amazon Web Services service that connects <a
 * href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">Industrial Internet of Things
 * (IIoT)</a> devices to the power of the Amazon Web Services Cloud. For more information, see the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/">IoT SiteWise User Guide</a>. For information about
 * IoT SiteWise quotas, see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a>
 * in the <i>IoT SiteWise User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTSiteWiseAsyncClient extends AWSIoTSiteWiseClient implements AWSIoTSiteWiseAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTSiteWiseAsyncClientBuilder asyncBuilder() {
        return AWSIoTSiteWiseAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT SiteWise using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTSiteWiseAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT SiteWise using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTSiteWiseAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAssetsResult> associateAssetsAsync(AssociateAssetsRequest request) {

        return associateAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAssetsResult> associateAssetsAsync(final AssociateAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAssetsRequest, AssociateAssetsResult> asyncHandler) {
        final AssociateAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAssetsResult>() {
            @Override
            public AssociateAssetsResult call() throws Exception {
                AssociateAssetsResult result = null;

                try {
                    result = executeAssociateAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateProjectAssetsResult> batchAssociateProjectAssetsAsync(BatchAssociateProjectAssetsRequest request) {

        return batchAssociateProjectAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateProjectAssetsResult> batchAssociateProjectAssetsAsync(final BatchAssociateProjectAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateProjectAssetsRequest, BatchAssociateProjectAssetsResult> asyncHandler) {
        final BatchAssociateProjectAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateProjectAssetsResult>() {
            @Override
            public BatchAssociateProjectAssetsResult call() throws Exception {
                BatchAssociateProjectAssetsResult result = null;

                try {
                    result = executeBatchAssociateProjectAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateProjectAssetsResult> batchDisassociateProjectAssetsAsync(BatchDisassociateProjectAssetsRequest request) {

        return batchDisassociateProjectAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateProjectAssetsResult> batchDisassociateProjectAssetsAsync(
            final BatchDisassociateProjectAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateProjectAssetsRequest, BatchDisassociateProjectAssetsResult> asyncHandler) {
        final BatchDisassociateProjectAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateProjectAssetsResult>() {
            @Override
            public BatchDisassociateProjectAssetsResult call() throws Exception {
                BatchDisassociateProjectAssetsResult result = null;

                try {
                    result = executeBatchDisassociateProjectAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchPutAssetPropertyValueResult> batchPutAssetPropertyValueAsync(BatchPutAssetPropertyValueRequest request) {

        return batchPutAssetPropertyValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutAssetPropertyValueResult> batchPutAssetPropertyValueAsync(final BatchPutAssetPropertyValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutAssetPropertyValueRequest, BatchPutAssetPropertyValueResult> asyncHandler) {
        final BatchPutAssetPropertyValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutAssetPropertyValueResult>() {
            @Override
            public BatchPutAssetPropertyValueResult call() throws Exception {
                BatchPutAssetPropertyValueResult result = null;

                try {
                    result = executeBatchPutAssetPropertyValue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(CreateAccessPolicyRequest request) {

        return createAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(final CreateAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessPolicyRequest, CreateAccessPolicyResult> asyncHandler) {
        final CreateAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessPolicyResult>() {
            @Override
            public CreateAccessPolicyResult call() throws Exception {
                CreateAccessPolicyResult result = null;

                try {
                    result = executeCreateAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateAssetModelResult> createAssetModelAsync(CreateAssetModelRequest request) {

        return createAssetModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetModelResult> createAssetModelAsync(final CreateAssetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssetModelRequest, CreateAssetModelResult> asyncHandler) {
        final CreateAssetModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssetModelResult>() {
            @Override
            public CreateAssetModelResult call() throws Exception {
                CreateAssetModelResult result = null;

                try {
                    result = executeCreateAssetModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(CreateDashboardRequest request) {

        return createDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(final CreateDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDashboardRequest, CreateDashboardResult> asyncHandler) {
        final CreateDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDashboardResult>() {
            @Override
            public CreateDashboardResult call() throws Exception {
                CreateDashboardResult result = null;

                try {
                    result = executeCreateDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest request) {

        return createGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(final CreateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGatewayRequest, CreateGatewayResult> asyncHandler) {
        final CreateGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGatewayResult>() {
            @Override
            public CreateGatewayResult call() throws Exception {
                CreateGatewayResult result = null;

                try {
                    result = executeCreateGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePortalResult> createPortalAsync(CreatePortalRequest request) {

        return createPortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortalResult> createPortalAsync(final CreatePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePortalRequest, CreatePortalResult> asyncHandler) {
        final CreatePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePortalResult>() {
            @Override
            public CreatePortalResult call() throws Exception {
                CreatePortalResult result = null;

                try {
                    result = executeCreatePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(DeleteAccessPolicyRequest request) {

        return deleteAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(final DeleteAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessPolicyRequest, DeleteAccessPolicyResult> asyncHandler) {
        final DeleteAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessPolicyResult>() {
            @Override
            public DeleteAccessPolicyResult call() throws Exception {
                DeleteAccessPolicyResult result = null;

                try {
                    result = executeDeleteAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteAssetModelResult> deleteAssetModelAsync(DeleteAssetModelRequest request) {

        return deleteAssetModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetModelResult> deleteAssetModelAsync(final DeleteAssetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssetModelRequest, DeleteAssetModelResult> asyncHandler) {
        final DeleteAssetModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssetModelResult>() {
            @Override
            public DeleteAssetModelResult call() throws Exception {
                DeleteAssetModelResult result = null;

                try {
                    result = executeDeleteAssetModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(DeleteDashboardRequest request) {

        return deleteDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(final DeleteDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDashboardRequest, DeleteDashboardResult> asyncHandler) {
        final DeleteDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDashboardResult>() {
            @Override
            public DeleteDashboardResult call() throws Exception {
                DeleteDashboardResult result = null;

                try {
                    result = executeDeleteDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request) {

        return deleteGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(final DeleteGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler) {
        final DeleteGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayResult>() {
            @Override
            public DeleteGatewayResult call() throws Exception {
                DeleteGatewayResult result = null;

                try {
                    result = executeDeleteGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(DeletePortalRequest request) {

        return deletePortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(final DeletePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePortalRequest, DeletePortalResult> asyncHandler) {
        final DeletePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePortalResult>() {
            @Override
            public DeletePortalResult call() throws Exception {
                DeletePortalResult result = null;

                try {
                    result = executeDeletePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeAccessPolicyResult> describeAccessPolicyAsync(DescribeAccessPolicyRequest request) {

        return describeAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccessPolicyResult> describeAccessPolicyAsync(final DescribeAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccessPolicyRequest, DescribeAccessPolicyResult> asyncHandler) {
        final DescribeAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccessPolicyResult>() {
            @Override
            public DescribeAccessPolicyResult call() throws Exception {
                DescribeAccessPolicyResult result = null;

                try {
                    result = executeDescribeAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeAssetModelResult> describeAssetModelAsync(DescribeAssetModelRequest request) {

        return describeAssetModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetModelResult> describeAssetModelAsync(final DescribeAssetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssetModelRequest, DescribeAssetModelResult> asyncHandler) {
        final DescribeAssetModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssetModelResult>() {
            @Override
            public DescribeAssetModelResult call() throws Exception {
                DescribeAssetModelResult result = null;

                try {
                    result = executeDescribeAssetModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetPropertyResult> describeAssetPropertyAsync(DescribeAssetPropertyRequest request) {

        return describeAssetPropertyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetPropertyResult> describeAssetPropertyAsync(final DescribeAssetPropertyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssetPropertyRequest, DescribeAssetPropertyResult> asyncHandler) {
        final DescribeAssetPropertyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssetPropertyResult>() {
            @Override
            public DescribeAssetPropertyResult call() throws Exception {
                DescribeAssetPropertyResult result = null;

                try {
                    result = executeDescribeAssetProperty(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(DescribeDashboardRequest request) {

        return describeDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(final DescribeDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDashboardRequest, DescribeDashboardResult> asyncHandler) {
        final DescribeDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDashboardResult>() {
            @Override
            public DescribeDashboardResult call() throws Exception {
                DescribeDashboardResult result = null;

                try {
                    result = executeDescribeDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDefaultEncryptionConfigurationResult> describeDefaultEncryptionConfigurationAsync(
            DescribeDefaultEncryptionConfigurationRequest request) {

        return describeDefaultEncryptionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDefaultEncryptionConfigurationResult> describeDefaultEncryptionConfigurationAsync(
            final DescribeDefaultEncryptionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDefaultEncryptionConfigurationRequest, DescribeDefaultEncryptionConfigurationResult> asyncHandler) {
        final DescribeDefaultEncryptionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDefaultEncryptionConfigurationResult>() {
            @Override
            public DescribeDefaultEncryptionConfigurationResult call() throws Exception {
                DescribeDefaultEncryptionConfigurationResult result = null;

                try {
                    result = executeDescribeDefaultEncryptionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayResult> describeGatewayAsync(DescribeGatewayRequest request) {

        return describeGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayResult> describeGatewayAsync(final DescribeGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGatewayRequest, DescribeGatewayResult> asyncHandler) {
        final DescribeGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGatewayResult>() {
            @Override
            public DescribeGatewayResult call() throws Exception {
                DescribeGatewayResult result = null;

                try {
                    result = executeDescribeGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayCapabilityConfigurationResult> describeGatewayCapabilityConfigurationAsync(
            DescribeGatewayCapabilityConfigurationRequest request) {

        return describeGatewayCapabilityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayCapabilityConfigurationResult> describeGatewayCapabilityConfigurationAsync(
            final DescribeGatewayCapabilityConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGatewayCapabilityConfigurationRequest, DescribeGatewayCapabilityConfigurationResult> asyncHandler) {
        final DescribeGatewayCapabilityConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGatewayCapabilityConfigurationResult>() {
            @Override
            public DescribeGatewayCapabilityConfigurationResult call() throws Exception {
                DescribeGatewayCapabilityConfigurationResult result = null;

                try {
                    result = executeDescribeGatewayCapabilityConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest request) {

        return describeLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(final DescribeLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoggingOptionsRequest, DescribeLoggingOptionsResult> asyncHandler) {
        final DescribeLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoggingOptionsResult>() {
            @Override
            public DescribeLoggingOptionsResult call() throws Exception {
                DescribeLoggingOptionsResult result = null;

                try {
                    result = executeDescribeLoggingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePortalResult> describePortalAsync(DescribePortalRequest request) {

        return describePortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePortalResult> describePortalAsync(final DescribePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePortalRequest, DescribePortalResult> asyncHandler) {
        final DescribePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePortalResult>() {
            @Override
            public DescribePortalResult call() throws Exception {
                DescribePortalResult result = null;

                try {
                    result = executeDescribePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request) {

        return describeProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(final DescribeProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler) {
        final DescribeProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProjectResult>() {
            @Override
            public DescribeProjectResult call() throws Exception {
                DescribeProjectResult result = null;

                try {
                    result = executeDescribeProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageConfigurationResult> describeStorageConfigurationAsync(DescribeStorageConfigurationRequest request) {

        return describeStorageConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageConfigurationResult> describeStorageConfigurationAsync(final DescribeStorageConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStorageConfigurationRequest, DescribeStorageConfigurationResult> asyncHandler) {
        final DescribeStorageConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStorageConfigurationResult>() {
            @Override
            public DescribeStorageConfigurationResult call() throws Exception {
                DescribeStorageConfigurationResult result = null;

                try {
                    result = executeDescribeStorageConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateAssetsResult> disassociateAssetsAsync(DisassociateAssetsRequest request) {

        return disassociateAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAssetsResult> disassociateAssetsAsync(final DisassociateAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAssetsRequest, DisassociateAssetsResult> asyncHandler) {
        final DisassociateAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAssetsResult>() {
            @Override
            public DisassociateAssetsResult call() throws Exception {
                DisassociateAssetsResult result = null;

                try {
                    result = executeDisassociateAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssetPropertyAggregatesResult> getAssetPropertyAggregatesAsync(GetAssetPropertyAggregatesRequest request) {

        return getAssetPropertyAggregatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetPropertyAggregatesResult> getAssetPropertyAggregatesAsync(final GetAssetPropertyAggregatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetPropertyAggregatesRequest, GetAssetPropertyAggregatesResult> asyncHandler) {
        final GetAssetPropertyAggregatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetPropertyAggregatesResult>() {
            @Override
            public GetAssetPropertyAggregatesResult call() throws Exception {
                GetAssetPropertyAggregatesResult result = null;

                try {
                    result = executeGetAssetPropertyAggregates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssetPropertyValueResult> getAssetPropertyValueAsync(GetAssetPropertyValueRequest request) {

        return getAssetPropertyValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetPropertyValueResult> getAssetPropertyValueAsync(final GetAssetPropertyValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetPropertyValueRequest, GetAssetPropertyValueResult> asyncHandler) {
        final GetAssetPropertyValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetPropertyValueResult>() {
            @Override
            public GetAssetPropertyValueResult call() throws Exception {
                GetAssetPropertyValueResult result = null;

                try {
                    result = executeGetAssetPropertyValue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssetPropertyValueHistoryResult> getAssetPropertyValueHistoryAsync(GetAssetPropertyValueHistoryRequest request) {

        return getAssetPropertyValueHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetPropertyValueHistoryResult> getAssetPropertyValueHistoryAsync(final GetAssetPropertyValueHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetPropertyValueHistoryRequest, GetAssetPropertyValueHistoryResult> asyncHandler) {
        final GetAssetPropertyValueHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetPropertyValueHistoryResult>() {
            @Override
            public GetAssetPropertyValueHistoryResult call() throws Exception {
                GetAssetPropertyValueHistoryResult result = null;

                try {
                    result = executeGetAssetPropertyValueHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInterpolatedAssetPropertyValuesResult> getInterpolatedAssetPropertyValuesAsync(
            GetInterpolatedAssetPropertyValuesRequest request) {

        return getInterpolatedAssetPropertyValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInterpolatedAssetPropertyValuesResult> getInterpolatedAssetPropertyValuesAsync(
            final GetInterpolatedAssetPropertyValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInterpolatedAssetPropertyValuesRequest, GetInterpolatedAssetPropertyValuesResult> asyncHandler) {
        final GetInterpolatedAssetPropertyValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInterpolatedAssetPropertyValuesResult>() {
            @Override
            public GetInterpolatedAssetPropertyValuesResult call() throws Exception {
                GetInterpolatedAssetPropertyValuesResult result = null;

                try {
                    result = executeGetInterpolatedAssetPropertyValues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest request) {

        return listAccessPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(final ListAccessPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessPoliciesRequest, ListAccessPoliciesResult> asyncHandler) {
        final ListAccessPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccessPoliciesResult>() {
            @Override
            public ListAccessPoliciesResult call() throws Exception {
                ListAccessPoliciesResult result = null;

                try {
                    result = executeListAccessPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssetModelsResult> listAssetModelsAsync(ListAssetModelsRequest request) {

        return listAssetModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetModelsResult> listAssetModelsAsync(final ListAssetModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssetModelsRequest, ListAssetModelsResult> asyncHandler) {
        final ListAssetModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssetModelsResult>() {
            @Override
            public ListAssetModelsResult call() throws Exception {
                ListAssetModelsResult result = null;

                try {
                    result = executeListAssetModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssetRelationshipsResult> listAssetRelationshipsAsync(ListAssetRelationshipsRequest request) {

        return listAssetRelationshipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetRelationshipsResult> listAssetRelationshipsAsync(final ListAssetRelationshipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssetRelationshipsRequest, ListAssetRelationshipsResult> asyncHandler) {
        final ListAssetRelationshipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssetRelationshipsResult>() {
            @Override
            public ListAssetRelationshipsResult call() throws Exception {
                ListAssetRelationshipsResult result = null;

                try {
                    result = executeListAssetRelationships(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListAssociatedAssetsResult> listAssociatedAssetsAsync(ListAssociatedAssetsRequest request) {

        return listAssociatedAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedAssetsResult> listAssociatedAssetsAsync(final ListAssociatedAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedAssetsRequest, ListAssociatedAssetsResult> asyncHandler) {
        final ListAssociatedAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedAssetsResult>() {
            @Override
            public ListAssociatedAssetsResult call() throws Exception {
                ListAssociatedAssetsResult result = null;

                try {
                    result = executeListAssociatedAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest request) {

        return listDashboardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(final ListDashboardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler) {
        final ListDashboardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDashboardsResult>() {
            @Override
            public ListDashboardsResult call() throws Exception {
                ListDashboardsResult result = null;

                try {
                    result = executeListDashboards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {
        final ListGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewaysResult>() {
            @Override
            public ListGatewaysResult call() throws Exception {
                ListGatewaysResult result = null;

                try {
                    result = executeListGateways(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(ListPortalsRequest request) {

        return listPortalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(final ListPortalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortalsRequest, ListPortalsResult> asyncHandler) {
        final ListPortalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortalsResult>() {
            @Override
            public ListPortalsResult call() throws Exception {
                ListPortalsResult result = null;

                try {
                    result = executeListPortals(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProjectAssetsResult> listProjectAssetsAsync(ListProjectAssetsRequest request) {

        return listProjectAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectAssetsResult> listProjectAssetsAsync(final ListProjectAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectAssetsRequest, ListProjectAssetsResult> asyncHandler) {
        final ListProjectAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectAssetsResult>() {
            @Override
            public ListProjectAssetsResult call() throws Exception {
                ListProjectAssetsResult result = null;

                try {
                    result = executeListProjectAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutDefaultEncryptionConfigurationResult> putDefaultEncryptionConfigurationAsync(
            PutDefaultEncryptionConfigurationRequest request) {

        return putDefaultEncryptionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDefaultEncryptionConfigurationResult> putDefaultEncryptionConfigurationAsync(
            final PutDefaultEncryptionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDefaultEncryptionConfigurationRequest, PutDefaultEncryptionConfigurationResult> asyncHandler) {
        final PutDefaultEncryptionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDefaultEncryptionConfigurationResult>() {
            @Override
            public PutDefaultEncryptionConfigurationResult call() throws Exception {
                PutDefaultEncryptionConfigurationResult result = null;

                try {
                    result = executePutDefaultEncryptionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest request) {

        return putLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(final PutLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler) {
        final PutLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLoggingOptionsResult>() {
            @Override
            public PutLoggingOptionsResult call() throws Exception {
                PutLoggingOptionsResult result = null;

                try {
                    result = executePutLoggingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutStorageConfigurationResult> putStorageConfigurationAsync(PutStorageConfigurationRequest request) {

        return putStorageConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutStorageConfigurationResult> putStorageConfigurationAsync(final PutStorageConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutStorageConfigurationRequest, PutStorageConfigurationResult> asyncHandler) {
        final PutStorageConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutStorageConfigurationResult>() {
            @Override
            public PutStorageConfigurationResult call() throws Exception {
                PutStorageConfigurationResult result = null;

                try {
                    result = executePutStorageConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(UpdateAccessPolicyRequest request) {

        return updateAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(final UpdateAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccessPolicyRequest, UpdateAccessPolicyResult> asyncHandler) {
        final UpdateAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccessPolicyResult>() {
            @Override
            public UpdateAccessPolicyResult call() throws Exception {
                UpdateAccessPolicyResult result = null;

                try {
                    result = executeUpdateAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest request) {

        return updateAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(final UpdateAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssetRequest, UpdateAssetResult> asyncHandler) {
        final UpdateAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssetResult>() {
            @Override
            public UpdateAssetResult call() throws Exception {
                UpdateAssetResult result = null;

                try {
                    result = executeUpdateAsset(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetModelResult> updateAssetModelAsync(UpdateAssetModelRequest request) {

        return updateAssetModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetModelResult> updateAssetModelAsync(final UpdateAssetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssetModelRequest, UpdateAssetModelResult> asyncHandler) {
        final UpdateAssetModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssetModelResult>() {
            @Override
            public UpdateAssetModelResult call() throws Exception {
                UpdateAssetModelResult result = null;

                try {
                    result = executeUpdateAssetModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetPropertyResult> updateAssetPropertyAsync(UpdateAssetPropertyRequest request) {

        return updateAssetPropertyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetPropertyResult> updateAssetPropertyAsync(final UpdateAssetPropertyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssetPropertyRequest, UpdateAssetPropertyResult> asyncHandler) {
        final UpdateAssetPropertyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssetPropertyResult>() {
            @Override
            public UpdateAssetPropertyResult call() throws Exception {
                UpdateAssetPropertyResult result = null;

                try {
                    result = executeUpdateAssetProperty(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(UpdateDashboardRequest request) {

        return updateDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(final UpdateDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDashboardRequest, UpdateDashboardResult> asyncHandler) {
        final UpdateDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDashboardResult>() {
            @Override
            public UpdateDashboardResult call() throws Exception {
                UpdateDashboardResult result = null;

                try {
                    result = executeUpdateDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(UpdateGatewayRequest request) {

        return updateGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(final UpdateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayRequest, UpdateGatewayResult> asyncHandler) {
        final UpdateGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayResult>() {
            @Override
            public UpdateGatewayResult call() throws Exception {
                UpdateGatewayResult result = null;

                try {
                    result = executeUpdateGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayCapabilityConfigurationResult> updateGatewayCapabilityConfigurationAsync(
            UpdateGatewayCapabilityConfigurationRequest request) {

        return updateGatewayCapabilityConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayCapabilityConfigurationResult> updateGatewayCapabilityConfigurationAsync(
            final UpdateGatewayCapabilityConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayCapabilityConfigurationRequest, UpdateGatewayCapabilityConfigurationResult> asyncHandler) {
        final UpdateGatewayCapabilityConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayCapabilityConfigurationResult>() {
            @Override
            public UpdateGatewayCapabilityConfigurationResult call() throws Exception {
                UpdateGatewayCapabilityConfigurationResult result = null;

                try {
                    result = executeUpdateGatewayCapabilityConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(UpdatePortalRequest request) {

        return updatePortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(final UpdatePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePortalRequest, UpdatePortalResult> asyncHandler) {
        final UpdatePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePortalResult>() {
            @Override
            public UpdatePortalResult call() throws Exception {
                UpdatePortalResult result = null;

                try {
                    result = executeUpdatePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
