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
package com.amazonaws.services.panorama;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Panorama asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>AWS Panorama</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Panorama API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/panorama/latest/dev/panorama-welcome.html">What is AWS Panorama?</a> in the <i>AWS
 * Panorama Developer Guide</i>.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPanoramaAsyncClient extends AWSPanoramaClient implements AWSPanoramaAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPanoramaAsyncClientBuilder asyncBuilder() {
        return AWSPanoramaAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Panorama using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPanoramaAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Panorama using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSPanoramaAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateApplicationInstanceResult> createApplicationInstanceAsync(CreateApplicationInstanceRequest request) {

        return createApplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationInstanceResult> createApplicationInstanceAsync(final CreateApplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationInstanceRequest, CreateApplicationInstanceResult> asyncHandler) {
        final CreateApplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationInstanceResult>() {
            @Override
            public CreateApplicationInstanceResult call() throws Exception {
                CreateApplicationInstanceResult result = null;

                try {
                    result = executeCreateApplicationInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateJobForDevicesResult> createJobForDevicesAsync(CreateJobForDevicesRequest request) {

        return createJobForDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobForDevicesResult> createJobForDevicesAsync(final CreateJobForDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobForDevicesRequest, CreateJobForDevicesResult> asyncHandler) {
        final CreateJobForDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobForDevicesResult>() {
            @Override
            public CreateJobForDevicesResult call() throws Exception {
                CreateJobForDevicesResult result = null;

                try {
                    result = executeCreateJobForDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNodeFromTemplateJobResult> createNodeFromTemplateJobAsync(CreateNodeFromTemplateJobRequest request) {

        return createNodeFromTemplateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNodeFromTemplateJobResult> createNodeFromTemplateJobAsync(final CreateNodeFromTemplateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNodeFromTemplateJobRequest, CreateNodeFromTemplateJobResult> asyncHandler) {
        final CreateNodeFromTemplateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNodeFromTemplateJobResult>() {
            @Override
            public CreateNodeFromTemplateJobResult call() throws Exception {
                CreateNodeFromTemplateJobResult result = null;

                try {
                    result = executeCreateNodeFromTemplateJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest request) {

        return createPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackageResult> createPackageAsync(final CreatePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePackageRequest, CreatePackageResult> asyncHandler) {
        final CreatePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePackageResult>() {
            @Override
            public CreatePackageResult call() throws Exception {
                CreatePackageResult result = null;

                try {
                    result = executeCreatePackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePackageImportJobResult> createPackageImportJobAsync(CreatePackageImportJobRequest request) {

        return createPackageImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackageImportJobResult> createPackageImportJobAsync(final CreatePackageImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePackageImportJobRequest, CreatePackageImportJobResult> asyncHandler) {
        final CreatePackageImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePackageImportJobResult>() {
            @Override
            public CreatePackageImportJobResult call() throws Exception {
                CreatePackageImportJobResult result = null;

                try {
                    result = executeCreatePackageImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest request) {

        return deleteDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(final DeleteDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler) {
        final DeleteDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceResult>() {
            @Override
            public DeleteDeviceResult call() throws Exception {
                DeleteDeviceResult result = null;

                try {
                    result = executeDeleteDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest request) {

        return deletePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(final DeletePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePackageRequest, DeletePackageResult> asyncHandler) {
        final DeletePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePackageResult>() {
            @Override
            public DeletePackageResult call() throws Exception {
                DeletePackageResult result = null;

                try {
                    result = executeDeletePackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterPackageVersionResult> deregisterPackageVersionAsync(DeregisterPackageVersionRequest request) {

        return deregisterPackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterPackageVersionResult> deregisterPackageVersionAsync(final DeregisterPackageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterPackageVersionRequest, DeregisterPackageVersionResult> asyncHandler) {
        final DeregisterPackageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterPackageVersionResult>() {
            @Override
            public DeregisterPackageVersionResult call() throws Exception {
                DeregisterPackageVersionResult result = null;

                try {
                    result = executeDeregisterPackageVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceResult> describeApplicationInstanceAsync(DescribeApplicationInstanceRequest request) {

        return describeApplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceResult> describeApplicationInstanceAsync(final DescribeApplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationInstanceRequest, DescribeApplicationInstanceResult> asyncHandler) {
        final DescribeApplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationInstanceResult>() {
            @Override
            public DescribeApplicationInstanceResult call() throws Exception {
                DescribeApplicationInstanceResult result = null;

                try {
                    result = executeDescribeApplicationInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceDetailsResult> describeApplicationInstanceDetailsAsync(
            DescribeApplicationInstanceDetailsRequest request) {

        return describeApplicationInstanceDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationInstanceDetailsResult> describeApplicationInstanceDetailsAsync(
            final DescribeApplicationInstanceDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationInstanceDetailsRequest, DescribeApplicationInstanceDetailsResult> asyncHandler) {
        final DescribeApplicationInstanceDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationInstanceDetailsResult>() {
            @Override
            public DescribeApplicationInstanceDetailsResult call() throws Exception {
                DescribeApplicationInstanceDetailsResult result = null;

                try {
                    result = executeDescribeApplicationInstanceDetails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request) {

        return describeDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(final DescribeDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler) {
        final DescribeDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceResult>() {
            @Override
            public DescribeDeviceResult call() throws Exception {
                DescribeDeviceResult result = null;

                try {
                    result = executeDescribeDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceJobResult> describeDeviceJobAsync(DescribeDeviceJobRequest request) {

        return describeDeviceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceJobResult> describeDeviceJobAsync(final DescribeDeviceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceJobRequest, DescribeDeviceJobResult> asyncHandler) {
        final DescribeDeviceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceJobResult>() {
            @Override
            public DescribeDeviceJobResult call() throws Exception {
                DescribeDeviceJobResult result = null;

                try {
                    result = executeDescribeDeviceJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeResult> describeNodeAsync(DescribeNodeRequest request) {

        return describeNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeResult> describeNodeAsync(final DescribeNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNodeRequest, DescribeNodeResult> asyncHandler) {
        final DescribeNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNodeResult>() {
            @Override
            public DescribeNodeResult call() throws Exception {
                DescribeNodeResult result = null;

                try {
                    result = executeDescribeNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeFromTemplateJobResult> describeNodeFromTemplateJobAsync(DescribeNodeFromTemplateJobRequest request) {

        return describeNodeFromTemplateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeFromTemplateJobResult> describeNodeFromTemplateJobAsync(final DescribeNodeFromTemplateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNodeFromTemplateJobRequest, DescribeNodeFromTemplateJobResult> asyncHandler) {
        final DescribeNodeFromTemplateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNodeFromTemplateJobResult>() {
            @Override
            public DescribeNodeFromTemplateJobResult call() throws Exception {
                DescribeNodeFromTemplateJobResult result = null;

                try {
                    result = executeDescribeNodeFromTemplateJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePackageResult> describePackageAsync(DescribePackageRequest request) {

        return describePackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageResult> describePackageAsync(final DescribePackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackageRequest, DescribePackageResult> asyncHandler) {
        final DescribePackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackageResult>() {
            @Override
            public DescribePackageResult call() throws Exception {
                DescribePackageResult result = null;

                try {
                    result = executeDescribePackage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePackageImportJobResult> describePackageImportJobAsync(DescribePackageImportJobRequest request) {

        return describePackageImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageImportJobResult> describePackageImportJobAsync(final DescribePackageImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackageImportJobRequest, DescribePackageImportJobResult> asyncHandler) {
        final DescribePackageImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackageImportJobResult>() {
            @Override
            public DescribePackageImportJobResult call() throws Exception {
                DescribePackageImportJobResult result = null;

                try {
                    result = executeDescribePackageImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest request) {

        return describePackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(final DescribePackageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackageVersionRequest, DescribePackageVersionResult> asyncHandler) {
        final DescribePackageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackageVersionResult>() {
            @Override
            public DescribePackageVersionResult call() throws Exception {
                DescribePackageVersionResult result = null;

                try {
                    result = executeDescribePackageVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceDependenciesResult> listApplicationInstanceDependenciesAsync(
            ListApplicationInstanceDependenciesRequest request) {

        return listApplicationInstanceDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceDependenciesResult> listApplicationInstanceDependenciesAsync(
            final ListApplicationInstanceDependenciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationInstanceDependenciesRequest, ListApplicationInstanceDependenciesResult> asyncHandler) {
        final ListApplicationInstanceDependenciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationInstanceDependenciesResult>() {
            @Override
            public ListApplicationInstanceDependenciesResult call() throws Exception {
                ListApplicationInstanceDependenciesResult result = null;

                try {
                    result = executeListApplicationInstanceDependencies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceNodeInstancesResult> listApplicationInstanceNodeInstancesAsync(
            ListApplicationInstanceNodeInstancesRequest request) {

        return listApplicationInstanceNodeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstanceNodeInstancesResult> listApplicationInstanceNodeInstancesAsync(
            final ListApplicationInstanceNodeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationInstanceNodeInstancesRequest, ListApplicationInstanceNodeInstancesResult> asyncHandler) {
        final ListApplicationInstanceNodeInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationInstanceNodeInstancesResult>() {
            @Override
            public ListApplicationInstanceNodeInstancesResult call() throws Exception {
                ListApplicationInstanceNodeInstancesResult result = null;

                try {
                    result = executeListApplicationInstanceNodeInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstancesResult> listApplicationInstancesAsync(ListApplicationInstancesRequest request) {

        return listApplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationInstancesResult> listApplicationInstancesAsync(final ListApplicationInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationInstancesRequest, ListApplicationInstancesResult> asyncHandler) {
        final ListApplicationInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationInstancesResult>() {
            @Override
            public ListApplicationInstancesResult call() throws Exception {
                ListApplicationInstancesResult result = null;

                try {
                    result = executeListApplicationInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {
        final ListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result = null;

                try {
                    result = executeListDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDevicesJobsResult> listDevicesJobsAsync(ListDevicesJobsRequest request) {

        return listDevicesJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesJobsResult> listDevicesJobsAsync(final ListDevicesJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesJobsRequest, ListDevicesJobsResult> asyncHandler) {
        final ListDevicesJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesJobsResult>() {
            @Override
            public ListDevicesJobsResult call() throws Exception {
                ListDevicesJobsResult result = null;

                try {
                    result = executeListDevicesJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNodeFromTemplateJobsResult> listNodeFromTemplateJobsAsync(ListNodeFromTemplateJobsRequest request) {

        return listNodeFromTemplateJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodeFromTemplateJobsResult> listNodeFromTemplateJobsAsync(final ListNodeFromTemplateJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNodeFromTemplateJobsRequest, ListNodeFromTemplateJobsResult> asyncHandler) {
        final ListNodeFromTemplateJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNodeFromTemplateJobsResult>() {
            @Override
            public ListNodeFromTemplateJobsResult call() throws Exception {
                ListNodeFromTemplateJobsResult result = null;

                try {
                    result = executeListNodeFromTemplateJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest request) {

        return listNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodesResult> listNodesAsync(final ListNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler) {
        final ListNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNodesResult>() {
            @Override
            public ListNodesResult call() throws Exception {
                ListNodesResult result = null;

                try {
                    result = executeListNodes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPackageImportJobsResult> listPackageImportJobsAsync(ListPackageImportJobsRequest request) {

        return listPackageImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageImportJobsResult> listPackageImportJobsAsync(final ListPackageImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackageImportJobsRequest, ListPackageImportJobsResult> asyncHandler) {
        final ListPackageImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackageImportJobsResult>() {
            @Override
            public ListPackageImportJobsResult call() throws Exception {
                ListPackageImportJobsResult result = null;

                try {
                    result = executeListPackageImportJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest request) {

        return listPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(final ListPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackagesRequest, ListPackagesResult> asyncHandler) {
        final ListPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackagesResult>() {
            @Override
            public ListPackagesResult call() throws Exception {
                ListPackagesResult result = null;

                try {
                    result = executeListPackages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ProvisionDeviceResult> provisionDeviceAsync(ProvisionDeviceRequest request) {

        return provisionDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionDeviceResult> provisionDeviceAsync(final ProvisionDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvisionDeviceRequest, ProvisionDeviceResult> asyncHandler) {
        final ProvisionDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvisionDeviceResult>() {
            @Override
            public ProvisionDeviceResult call() throws Exception {
                ProvisionDeviceResult result = null;

                try {
                    result = executeProvisionDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterPackageVersionResult> registerPackageVersionAsync(RegisterPackageVersionRequest request) {

        return registerPackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterPackageVersionResult> registerPackageVersionAsync(final RegisterPackageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterPackageVersionRequest, RegisterPackageVersionResult> asyncHandler) {
        final RegisterPackageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterPackageVersionResult>() {
            @Override
            public RegisterPackageVersionResult call() throws Exception {
                RegisterPackageVersionResult result = null;

                try {
                    result = executeRegisterPackageVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveApplicationInstanceResult> removeApplicationInstanceAsync(RemoveApplicationInstanceRequest request) {

        return removeApplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveApplicationInstanceResult> removeApplicationInstanceAsync(final RemoveApplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveApplicationInstanceRequest, RemoveApplicationInstanceResult> asyncHandler) {
        final RemoveApplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveApplicationInstanceResult>() {
            @Override
            public RemoveApplicationInstanceResult call() throws Exception {
                RemoveApplicationInstanceResult result = null;

                try {
                    result = executeRemoveApplicationInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SignalApplicationInstanceNodeInstancesResult> signalApplicationInstanceNodeInstancesAsync(
            SignalApplicationInstanceNodeInstancesRequest request) {

        return signalApplicationInstanceNodeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignalApplicationInstanceNodeInstancesResult> signalApplicationInstanceNodeInstancesAsync(
            final SignalApplicationInstanceNodeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SignalApplicationInstanceNodeInstancesRequest, SignalApplicationInstanceNodeInstancesResult> asyncHandler) {
        final SignalApplicationInstanceNodeInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SignalApplicationInstanceNodeInstancesResult>() {
            @Override
            public SignalApplicationInstanceNodeInstancesResult call() throws Exception {
                SignalApplicationInstanceNodeInstancesResult result = null;

                try {
                    result = executeSignalApplicationInstanceNodeInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDeviceMetadataResult> updateDeviceMetadataAsync(UpdateDeviceMetadataRequest request) {

        return updateDeviceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceMetadataResult> updateDeviceMetadataAsync(final UpdateDeviceMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceMetadataRequest, UpdateDeviceMetadataResult> asyncHandler) {
        final UpdateDeviceMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceMetadataResult>() {
            @Override
            public UpdateDeviceMetadataResult call() throws Exception {
                UpdateDeviceMetadataResult result = null;

                try {
                    result = executeUpdateDeviceMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
