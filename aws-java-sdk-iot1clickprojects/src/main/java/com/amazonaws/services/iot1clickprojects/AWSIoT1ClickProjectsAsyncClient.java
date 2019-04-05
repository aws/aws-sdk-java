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
package com.amazonaws.services.iot1clickprojects;

import javax.annotation.Generated;

import com.amazonaws.services.iot1clickprojects.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT 1-Click Projects asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The AWS IoT 1-Click Projects API Reference
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoT1ClickProjectsAsyncClient extends AWSIoT1ClickProjectsClient implements AWSIoT1ClickProjectsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoT1ClickProjectsAsyncClientBuilder asyncBuilder() {
        return AWSIoT1ClickProjectsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT 1-Click Projects using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoT1ClickProjectsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateDeviceWithPlacementResult> associateDeviceWithPlacementAsync(AssociateDeviceWithPlacementRequest request) {

        return associateDeviceWithPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDeviceWithPlacementResult> associateDeviceWithPlacementAsync(final AssociateDeviceWithPlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDeviceWithPlacementRequest, AssociateDeviceWithPlacementResult> asyncHandler) {
        final AssociateDeviceWithPlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDeviceWithPlacementResult>() {
            @Override
            public AssociateDeviceWithPlacementResult call() throws Exception {
                AssociateDeviceWithPlacementResult result = null;

                try {
                    result = executeAssociateDeviceWithPlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreatePlacementResult> createPlacementAsync(CreatePlacementRequest request) {

        return createPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlacementResult> createPlacementAsync(final CreatePlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlacementRequest, CreatePlacementResult> asyncHandler) {
        final CreatePlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlacementResult>() {
            @Override
            public CreatePlacementResult call() throws Exception {
                CreatePlacementResult result = null;

                try {
                    result = executeCreatePlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeletePlacementResult> deletePlacementAsync(DeletePlacementRequest request) {

        return deletePlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlacementResult> deletePlacementAsync(final DeletePlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlacementRequest, DeletePlacementResult> asyncHandler) {
        final DeletePlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlacementResult>() {
            @Override
            public DeletePlacementResult call() throws Exception {
                DeletePlacementResult result = null;

                try {
                    result = executeDeletePlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribePlacementResult> describePlacementAsync(DescribePlacementRequest request) {

        return describePlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlacementResult> describePlacementAsync(final DescribePlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePlacementRequest, DescribePlacementResult> asyncHandler) {
        final DescribePlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePlacementResult>() {
            @Override
            public DescribePlacementResult call() throws Exception {
                DescribePlacementResult result = null;

                try {
                    result = executeDescribePlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DisassociateDeviceFromPlacementResult> disassociateDeviceFromPlacementAsync(
            DisassociateDeviceFromPlacementRequest request) {

        return disassociateDeviceFromPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDeviceFromPlacementResult> disassociateDeviceFromPlacementAsync(
            final DisassociateDeviceFromPlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDeviceFromPlacementRequest, DisassociateDeviceFromPlacementResult> asyncHandler) {
        final DisassociateDeviceFromPlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDeviceFromPlacementResult>() {
            @Override
            public DisassociateDeviceFromPlacementResult call() throws Exception {
                DisassociateDeviceFromPlacementResult result = null;

                try {
                    result = executeDisassociateDeviceFromPlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetDevicesInPlacementResult> getDevicesInPlacementAsync(GetDevicesInPlacementRequest request) {

        return getDevicesInPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicesInPlacementResult> getDevicesInPlacementAsync(final GetDevicesInPlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicesInPlacementRequest, GetDevicesInPlacementResult> asyncHandler) {
        final GetDevicesInPlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicesInPlacementResult>() {
            @Override
            public GetDevicesInPlacementResult call() throws Exception {
                GetDevicesInPlacementResult result = null;

                try {
                    result = executeGetDevicesInPlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListPlacementsResult> listPlacementsAsync(ListPlacementsRequest request) {

        return listPlacementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlacementsResult> listPlacementsAsync(final ListPlacementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlacementsRequest, ListPlacementsResult> asyncHandler) {
        final ListPlacementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlacementsResult>() {
            @Override
            public ListPlacementsResult call() throws Exception {
                ListPlacementsResult result = null;

                try {
                    result = executeListPlacements(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdatePlacementResult> updatePlacementAsync(UpdatePlacementRequest request) {

        return updatePlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePlacementResult> updatePlacementAsync(final UpdatePlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePlacementRequest, UpdatePlacementResult> asyncHandler) {
        final UpdatePlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePlacementResult>() {
            @Override
            public UpdatePlacementResult call() throws Exception {
                UpdatePlacementResult result = null;

                try {
                    result = executeUpdatePlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
