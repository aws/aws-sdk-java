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
package com.amazonaws.services.greengrassv2;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS GreengrassV2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IoT Greengrass brings local compute, messaging, data management, sync, and ML inference capabilities to edge
 * devices. This enables devices to collect and analyze data closer to the source of information, react autonomously to
 * local events, and communicate securely with each other on local networks. Local devices can also communicate securely
 * with AWS IoT Core and export IoT data to the AWS Cloud. AWS IoT Greengrass developers can use AWS Lambda functions
 * and components to create and deploy applications to fleets of edge devices for local operation.
 * </p>
 * <p>
 * AWS IoT Greengrass Version 2 provides a new major version of the AWS IoT Greengrass Core software, new APIs, and a
 * new console. Use this API reference to learn how to use the AWS IoT Greengrass V2 API operations to manage
 * components, manage deployments, and core devices.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/what-is-iot-greengrass.html">What is AWS IoT
 * Greengrass?</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGreengrassV2AsyncClient extends AWSGreengrassV2Client implements AWSGreengrassV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGreengrassV2AsyncClientBuilder asyncBuilder() {
        return AWSGreengrassV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS GreengrassV2 using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGreengrassV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS GreengrassV2 using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSGreengrassV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelDeploymentResult> cancelDeploymentAsync(CancelDeploymentRequest request) {

        return cancelDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelDeploymentResult> cancelDeploymentAsync(final CancelDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelDeploymentRequest, CancelDeploymentResult> asyncHandler) {
        final CancelDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelDeploymentResult>() {
            @Override
            public CancelDeploymentResult call() throws Exception {
                CancelDeploymentResult result = null;

                try {
                    result = executeCancelDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateComponentVersionResult> createComponentVersionAsync(CreateComponentVersionRequest request) {

        return createComponentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentVersionResult> createComponentVersionAsync(final CreateComponentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComponentVersionRequest, CreateComponentVersionResult> asyncHandler) {
        final CreateComponentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateComponentVersionResult>() {
            @Override
            public CreateComponentVersionResult call() throws Exception {
                CreateComponentVersionResult result = null;

                try {
                    result = executeCreateComponentVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(final DeleteComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {
        final DeleteComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteComponentResult>() {
            @Override
            public DeleteComponentResult call() throws Exception {
                DeleteComponentResult result = null;

                try {
                    result = executeDeleteComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreDeviceResult> deleteCoreDeviceAsync(DeleteCoreDeviceRequest request) {

        return deleteCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreDeviceResult> deleteCoreDeviceAsync(final DeleteCoreDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCoreDeviceRequest, DeleteCoreDeviceResult> asyncHandler) {
        final DeleteCoreDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCoreDeviceResult>() {
            @Override
            public DeleteCoreDeviceResult call() throws Exception {
                DeleteCoreDeviceResult result = null;

                try {
                    result = executeDeleteCoreDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest request) {

        return describeComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(final DescribeComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComponentRequest, DescribeComponentResult> asyncHandler) {
        final DescribeComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeComponentResult>() {
            @Override
            public DescribeComponentResult call() throws Exception {
                DescribeComponentResult result = null;

                try {
                    result = executeDescribeComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(final GetComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {
        final GetComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentResult>() {
            @Override
            public GetComponentResult call() throws Exception {
                GetComponentResult result = null;

                try {
                    result = executeGetComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComponentVersionArtifactResult> getComponentVersionArtifactAsync(GetComponentVersionArtifactRequest request) {

        return getComponentVersionArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentVersionArtifactResult> getComponentVersionArtifactAsync(final GetComponentVersionArtifactRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentVersionArtifactRequest, GetComponentVersionArtifactResult> asyncHandler) {
        final GetComponentVersionArtifactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentVersionArtifactResult>() {
            @Override
            public GetComponentVersionArtifactResult call() throws Exception {
                GetComponentVersionArtifactResult result = null;

                try {
                    result = executeGetComponentVersionArtifact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreDeviceResult> getCoreDeviceAsync(GetCoreDeviceRequest request) {

        return getCoreDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreDeviceResult> getCoreDeviceAsync(final GetCoreDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreDeviceRequest, GetCoreDeviceResult> asyncHandler) {
        final GetCoreDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreDeviceResult>() {
            @Override
            public GetCoreDeviceResult call() throws Exception {
                GetCoreDeviceResult result = null;

                try {
                    result = executeGetCoreDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListComponentVersionsResult> listComponentVersionsAsync(ListComponentVersionsRequest request) {

        return listComponentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentVersionsResult> listComponentVersionsAsync(final ListComponentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentVersionsRequest, ListComponentVersionsResult> asyncHandler) {
        final ListComponentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentVersionsResult>() {
            @Override
            public ListComponentVersionsResult call() throws Exception {
                ListComponentVersionsResult result = null;

                try {
                    result = executeListComponentVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(final ListComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {
        final ListComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentsResult>() {
            @Override
            public ListComponentsResult call() throws Exception {
                ListComponentsResult result = null;

                try {
                    result = executeListComponents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCoreDevicesResult> listCoreDevicesAsync(ListCoreDevicesRequest request) {

        return listCoreDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoreDevicesResult> listCoreDevicesAsync(final ListCoreDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoreDevicesRequest, ListCoreDevicesResult> asyncHandler) {
        final ListCoreDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoreDevicesResult>() {
            @Override
            public ListCoreDevicesResult call() throws Exception {
                ListCoreDevicesResult result = null;

                try {
                    result = executeListCoreDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {
        final ListDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result = null;

                try {
                    result = executeListDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEffectiveDeploymentsResult> listEffectiveDeploymentsAsync(ListEffectiveDeploymentsRequest request) {

        return listEffectiveDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEffectiveDeploymentsResult> listEffectiveDeploymentsAsync(final ListEffectiveDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEffectiveDeploymentsRequest, ListEffectiveDeploymentsResult> asyncHandler) {
        final ListEffectiveDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEffectiveDeploymentsResult>() {
            @Override
            public ListEffectiveDeploymentsResult call() throws Exception {
                ListEffectiveDeploymentsResult result = null;

                try {
                    result = executeListEffectiveDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstalledComponentsResult> listInstalledComponentsAsync(ListInstalledComponentsRequest request) {

        return listInstalledComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstalledComponentsResult> listInstalledComponentsAsync(final ListInstalledComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstalledComponentsRequest, ListInstalledComponentsResult> asyncHandler) {
        final ListInstalledComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstalledComponentsResult>() {
            @Override
            public ListInstalledComponentsResult call() throws Exception {
                ListInstalledComponentsResult result = null;

                try {
                    result = executeListInstalledComponents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ResolveComponentCandidatesResult> resolveComponentCandidatesAsync(ResolveComponentCandidatesRequest request) {

        return resolveComponentCandidatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveComponentCandidatesResult> resolveComponentCandidatesAsync(final ResolveComponentCandidatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResolveComponentCandidatesRequest, ResolveComponentCandidatesResult> asyncHandler) {
        final ResolveComponentCandidatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResolveComponentCandidatesResult>() {
            @Override
            public ResolveComponentCandidatesResult call() throws Exception {
                ResolveComponentCandidatesResult result = null;

                try {
                    result = executeResolveComponentCandidates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
