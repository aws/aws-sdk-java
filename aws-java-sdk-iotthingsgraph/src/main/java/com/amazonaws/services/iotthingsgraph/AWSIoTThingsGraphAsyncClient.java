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
package com.amazonaws.services.iotthingsgraph;

import javax.annotation.Generated;

import com.amazonaws.services.iotthingsgraph.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT Things Graph asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS IoT Things Graph</fullname>
 * <p>
 * AWS IoT Things Graph provides an integrated set of tools that enable developers to connect devices and services that
 * use different standards, such as units of measure and communication protocols. AWS IoT Things Graph makes it possible
 * to build IoT applications with little to no code by connecting devices and services and defining how they interact at
 * an abstract level.
 * </p>
 * <p>
 * For more information about how AWS IoT Things Graph works, see the <a
 * href="https://docs.aws.amazon.com/thingsgraph/latest/ug/iot-tg-whatis.html">User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTThingsGraphAsyncClient extends AWSIoTThingsGraphClient implements AWSIoTThingsGraphAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTThingsGraphAsyncClientBuilder asyncBuilder() {
        return AWSIoTThingsGraphAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Things Graph using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTThingsGraphAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateEntityToThingResult> associateEntityToThingAsync(AssociateEntityToThingRequest request) {

        return associateEntityToThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateEntityToThingResult> associateEntityToThingAsync(final AssociateEntityToThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateEntityToThingRequest, AssociateEntityToThingResult> asyncHandler) {
        final AssociateEntityToThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateEntityToThingResult>() {
            @Override
            public AssociateEntityToThingResult call() throws Exception {
                AssociateEntityToThingResult result = null;

                try {
                    result = executeAssociateEntityToThing(finalRequest);
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
    public java.util.concurrent.Future<CreateFlowTemplateResult> createFlowTemplateAsync(CreateFlowTemplateRequest request) {

        return createFlowTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowTemplateResult> createFlowTemplateAsync(final CreateFlowTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowTemplateRequest, CreateFlowTemplateResult> asyncHandler) {
        final CreateFlowTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowTemplateResult>() {
            @Override
            public CreateFlowTemplateResult call() throws Exception {
                CreateFlowTemplateResult result = null;

                try {
                    result = executeCreateFlowTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateSystemInstanceResult> createSystemInstanceAsync(CreateSystemInstanceRequest request) {

        return createSystemInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSystemInstanceResult> createSystemInstanceAsync(final CreateSystemInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSystemInstanceRequest, CreateSystemInstanceResult> asyncHandler) {
        final CreateSystemInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSystemInstanceResult>() {
            @Override
            public CreateSystemInstanceResult call() throws Exception {
                CreateSystemInstanceResult result = null;

                try {
                    result = executeCreateSystemInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateSystemTemplateResult> createSystemTemplateAsync(CreateSystemTemplateRequest request) {

        return createSystemTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSystemTemplateResult> createSystemTemplateAsync(final CreateSystemTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSystemTemplateRequest, CreateSystemTemplateResult> asyncHandler) {
        final CreateSystemTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSystemTemplateResult>() {
            @Override
            public CreateSystemTemplateResult call() throws Exception {
                CreateSystemTemplateResult result = null;

                try {
                    result = executeCreateSystemTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteFlowTemplateResult> deleteFlowTemplateAsync(DeleteFlowTemplateRequest request) {

        return deleteFlowTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowTemplateResult> deleteFlowTemplateAsync(final DeleteFlowTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowTemplateRequest, DeleteFlowTemplateResult> asyncHandler) {
        final DeleteFlowTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowTemplateResult>() {
            @Override
            public DeleteFlowTemplateResult call() throws Exception {
                DeleteFlowTemplateResult result = null;

                try {
                    result = executeDeleteFlowTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest request) {

        return deleteNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(final DeleteNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler) {
        final DeleteNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNamespaceResult>() {
            @Override
            public DeleteNamespaceResult call() throws Exception {
                DeleteNamespaceResult result = null;

                try {
                    result = executeDeleteNamespace(finalRequest);
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
    public java.util.concurrent.Future<DeleteSystemInstanceResult> deleteSystemInstanceAsync(DeleteSystemInstanceRequest request) {

        return deleteSystemInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSystemInstanceResult> deleteSystemInstanceAsync(final DeleteSystemInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSystemInstanceRequest, DeleteSystemInstanceResult> asyncHandler) {
        final DeleteSystemInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSystemInstanceResult>() {
            @Override
            public DeleteSystemInstanceResult call() throws Exception {
                DeleteSystemInstanceResult result = null;

                try {
                    result = executeDeleteSystemInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteSystemTemplateResult> deleteSystemTemplateAsync(DeleteSystemTemplateRequest request) {

        return deleteSystemTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSystemTemplateResult> deleteSystemTemplateAsync(final DeleteSystemTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSystemTemplateRequest, DeleteSystemTemplateResult> asyncHandler) {
        final DeleteSystemTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSystemTemplateResult>() {
            @Override
            public DeleteSystemTemplateResult call() throws Exception {
                DeleteSystemTemplateResult result = null;

                try {
                    result = executeDeleteSystemTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeploySystemInstanceResult> deploySystemInstanceAsync(DeploySystemInstanceRequest request) {

        return deploySystemInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeploySystemInstanceResult> deploySystemInstanceAsync(final DeploySystemInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeploySystemInstanceRequest, DeploySystemInstanceResult> asyncHandler) {
        final DeploySystemInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeploySystemInstanceResult>() {
            @Override
            public DeploySystemInstanceResult call() throws Exception {
                DeploySystemInstanceResult result = null;

                try {
                    result = executeDeploySystemInstance(finalRequest);
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
    public java.util.concurrent.Future<DeprecateFlowTemplateResult> deprecateFlowTemplateAsync(DeprecateFlowTemplateRequest request) {

        return deprecateFlowTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeprecateFlowTemplateResult> deprecateFlowTemplateAsync(final DeprecateFlowTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprecateFlowTemplateRequest, DeprecateFlowTemplateResult> asyncHandler) {
        final DeprecateFlowTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeprecateFlowTemplateResult>() {
            @Override
            public DeprecateFlowTemplateResult call() throws Exception {
                DeprecateFlowTemplateResult result = null;

                try {
                    result = executeDeprecateFlowTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeprecateSystemTemplateResult> deprecateSystemTemplateAsync(DeprecateSystemTemplateRequest request) {

        return deprecateSystemTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeprecateSystemTemplateResult> deprecateSystemTemplateAsync(final DeprecateSystemTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprecateSystemTemplateRequest, DeprecateSystemTemplateResult> asyncHandler) {
        final DeprecateSystemTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeprecateSystemTemplateResult>() {
            @Override
            public DeprecateSystemTemplateResult call() throws Exception {
                DeprecateSystemTemplateResult result = null;

                try {
                    result = executeDeprecateSystemTemplate(finalRequest);
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
    public java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(DescribeNamespaceRequest request) {

        return describeNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(final DescribeNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNamespaceRequest, DescribeNamespaceResult> asyncHandler) {
        final DescribeNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNamespaceResult>() {
            @Override
            public DescribeNamespaceResult call() throws Exception {
                DescribeNamespaceResult result = null;

                try {
                    result = executeDescribeNamespace(finalRequest);
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
    public java.util.concurrent.Future<DissociateEntityFromThingResult> dissociateEntityFromThingAsync(DissociateEntityFromThingRequest request) {

        return dissociateEntityFromThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DissociateEntityFromThingResult> dissociateEntityFromThingAsync(final DissociateEntityFromThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DissociateEntityFromThingRequest, DissociateEntityFromThingResult> asyncHandler) {
        final DissociateEntityFromThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DissociateEntityFromThingResult>() {
            @Override
            public DissociateEntityFromThingResult call() throws Exception {
                DissociateEntityFromThingResult result = null;

                try {
                    result = executeDissociateEntityFromThing(finalRequest);
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
    public java.util.concurrent.Future<GetEntitiesResult> getEntitiesAsync(GetEntitiesRequest request) {

        return getEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEntitiesResult> getEntitiesAsync(final GetEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEntitiesRequest, GetEntitiesResult> asyncHandler) {
        final GetEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEntitiesResult>() {
            @Override
            public GetEntitiesResult call() throws Exception {
                GetEntitiesResult result = null;

                try {
                    result = executeGetEntities(finalRequest);
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
    public java.util.concurrent.Future<GetFlowTemplateResult> getFlowTemplateAsync(GetFlowTemplateRequest request) {

        return getFlowTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFlowTemplateResult> getFlowTemplateAsync(final GetFlowTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFlowTemplateRequest, GetFlowTemplateResult> asyncHandler) {
        final GetFlowTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFlowTemplateResult>() {
            @Override
            public GetFlowTemplateResult call() throws Exception {
                GetFlowTemplateResult result = null;

                try {
                    result = executeGetFlowTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetFlowTemplateRevisionsResult> getFlowTemplateRevisionsAsync(GetFlowTemplateRevisionsRequest request) {

        return getFlowTemplateRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFlowTemplateRevisionsResult> getFlowTemplateRevisionsAsync(final GetFlowTemplateRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFlowTemplateRevisionsRequest, GetFlowTemplateRevisionsResult> asyncHandler) {
        final GetFlowTemplateRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFlowTemplateRevisionsResult>() {
            @Override
            public GetFlowTemplateRevisionsResult call() throws Exception {
                GetFlowTemplateRevisionsResult result = null;

                try {
                    result = executeGetFlowTemplateRevisions(finalRequest);
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
    public java.util.concurrent.Future<GetNamespaceDeletionStatusResult> getNamespaceDeletionStatusAsync(GetNamespaceDeletionStatusRequest request) {

        return getNamespaceDeletionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceDeletionStatusResult> getNamespaceDeletionStatusAsync(final GetNamespaceDeletionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNamespaceDeletionStatusRequest, GetNamespaceDeletionStatusResult> asyncHandler) {
        final GetNamespaceDeletionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNamespaceDeletionStatusResult>() {
            @Override
            public GetNamespaceDeletionStatusResult call() throws Exception {
                GetNamespaceDeletionStatusResult result = null;

                try {
                    result = executeGetNamespaceDeletionStatus(finalRequest);
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
    public java.util.concurrent.Future<GetSystemInstanceResult> getSystemInstanceAsync(GetSystemInstanceRequest request) {

        return getSystemInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSystemInstanceResult> getSystemInstanceAsync(final GetSystemInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSystemInstanceRequest, GetSystemInstanceResult> asyncHandler) {
        final GetSystemInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSystemInstanceResult>() {
            @Override
            public GetSystemInstanceResult call() throws Exception {
                GetSystemInstanceResult result = null;

                try {
                    result = executeGetSystemInstance(finalRequest);
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
    public java.util.concurrent.Future<GetSystemTemplateResult> getSystemTemplateAsync(GetSystemTemplateRequest request) {

        return getSystemTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSystemTemplateResult> getSystemTemplateAsync(final GetSystemTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSystemTemplateRequest, GetSystemTemplateResult> asyncHandler) {
        final GetSystemTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSystemTemplateResult>() {
            @Override
            public GetSystemTemplateResult call() throws Exception {
                GetSystemTemplateResult result = null;

                try {
                    result = executeGetSystemTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetSystemTemplateRevisionsResult> getSystemTemplateRevisionsAsync(GetSystemTemplateRevisionsRequest request) {

        return getSystemTemplateRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSystemTemplateRevisionsResult> getSystemTemplateRevisionsAsync(final GetSystemTemplateRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSystemTemplateRevisionsRequest, GetSystemTemplateRevisionsResult> asyncHandler) {
        final GetSystemTemplateRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSystemTemplateRevisionsResult>() {
            @Override
            public GetSystemTemplateRevisionsResult call() throws Exception {
                GetSystemTemplateRevisionsResult result = null;

                try {
                    result = executeGetSystemTemplateRevisions(finalRequest);
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
    public java.util.concurrent.Future<GetUploadStatusResult> getUploadStatusAsync(GetUploadStatusRequest request) {

        return getUploadStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUploadStatusResult> getUploadStatusAsync(final GetUploadStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUploadStatusRequest, GetUploadStatusResult> asyncHandler) {
        final GetUploadStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUploadStatusResult>() {
            @Override
            public GetUploadStatusResult call() throws Exception {
                GetUploadStatusResult result = null;

                try {
                    result = executeGetUploadStatus(finalRequest);
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
    public java.util.concurrent.Future<ListFlowExecutionMessagesResult> listFlowExecutionMessagesAsync(ListFlowExecutionMessagesRequest request) {

        return listFlowExecutionMessagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowExecutionMessagesResult> listFlowExecutionMessagesAsync(final ListFlowExecutionMessagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowExecutionMessagesRequest, ListFlowExecutionMessagesResult> asyncHandler) {
        final ListFlowExecutionMessagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowExecutionMessagesResult>() {
            @Override
            public ListFlowExecutionMessagesResult call() throws Exception {
                ListFlowExecutionMessagesResult result = null;

                try {
                    result = executeListFlowExecutionMessages(finalRequest);
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
    public java.util.concurrent.Future<SearchEntitiesResult> searchEntitiesAsync(SearchEntitiesRequest request) {

        return searchEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchEntitiesResult> searchEntitiesAsync(final SearchEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchEntitiesRequest, SearchEntitiesResult> asyncHandler) {
        final SearchEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchEntitiesResult>() {
            @Override
            public SearchEntitiesResult call() throws Exception {
                SearchEntitiesResult result = null;

                try {
                    result = executeSearchEntities(finalRequest);
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
    public java.util.concurrent.Future<SearchFlowExecutionsResult> searchFlowExecutionsAsync(SearchFlowExecutionsRequest request) {

        return searchFlowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchFlowExecutionsResult> searchFlowExecutionsAsync(final SearchFlowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchFlowExecutionsRequest, SearchFlowExecutionsResult> asyncHandler) {
        final SearchFlowExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchFlowExecutionsResult>() {
            @Override
            public SearchFlowExecutionsResult call() throws Exception {
                SearchFlowExecutionsResult result = null;

                try {
                    result = executeSearchFlowExecutions(finalRequest);
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
    public java.util.concurrent.Future<SearchFlowTemplatesResult> searchFlowTemplatesAsync(SearchFlowTemplatesRequest request) {

        return searchFlowTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchFlowTemplatesResult> searchFlowTemplatesAsync(final SearchFlowTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchFlowTemplatesRequest, SearchFlowTemplatesResult> asyncHandler) {
        final SearchFlowTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchFlowTemplatesResult>() {
            @Override
            public SearchFlowTemplatesResult call() throws Exception {
                SearchFlowTemplatesResult result = null;

                try {
                    result = executeSearchFlowTemplates(finalRequest);
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
    public java.util.concurrent.Future<SearchSystemInstancesResult> searchSystemInstancesAsync(SearchSystemInstancesRequest request) {

        return searchSystemInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchSystemInstancesResult> searchSystemInstancesAsync(final SearchSystemInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchSystemInstancesRequest, SearchSystemInstancesResult> asyncHandler) {
        final SearchSystemInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchSystemInstancesResult>() {
            @Override
            public SearchSystemInstancesResult call() throws Exception {
                SearchSystemInstancesResult result = null;

                try {
                    result = executeSearchSystemInstances(finalRequest);
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
    public java.util.concurrent.Future<SearchSystemTemplatesResult> searchSystemTemplatesAsync(SearchSystemTemplatesRequest request) {

        return searchSystemTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchSystemTemplatesResult> searchSystemTemplatesAsync(final SearchSystemTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchSystemTemplatesRequest, SearchSystemTemplatesResult> asyncHandler) {
        final SearchSystemTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchSystemTemplatesResult>() {
            @Override
            public SearchSystemTemplatesResult call() throws Exception {
                SearchSystemTemplatesResult result = null;

                try {
                    result = executeSearchSystemTemplates(finalRequest);
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
    public java.util.concurrent.Future<SearchThingsResult> searchThingsAsync(SearchThingsRequest request) {

        return searchThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchThingsResult> searchThingsAsync(final SearchThingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchThingsRequest, SearchThingsResult> asyncHandler) {
        final SearchThingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchThingsResult>() {
            @Override
            public SearchThingsResult call() throws Exception {
                SearchThingsResult result = null;

                try {
                    result = executeSearchThings(finalRequest);
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
    public java.util.concurrent.Future<UndeploySystemInstanceResult> undeploySystemInstanceAsync(UndeploySystemInstanceRequest request) {

        return undeploySystemInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UndeploySystemInstanceResult> undeploySystemInstanceAsync(final UndeploySystemInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UndeploySystemInstanceRequest, UndeploySystemInstanceResult> asyncHandler) {
        final UndeploySystemInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UndeploySystemInstanceResult>() {
            @Override
            public UndeploySystemInstanceResult call() throws Exception {
                UndeploySystemInstanceResult result = null;

                try {
                    result = executeUndeploySystemInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowTemplateResult> updateFlowTemplateAsync(UpdateFlowTemplateRequest request) {

        return updateFlowTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowTemplateResult> updateFlowTemplateAsync(final UpdateFlowTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowTemplateRequest, UpdateFlowTemplateResult> asyncHandler) {
        final UpdateFlowTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowTemplateResult>() {
            @Override
            public UpdateFlowTemplateResult call() throws Exception {
                UpdateFlowTemplateResult result = null;

                try {
                    result = executeUpdateFlowTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateSystemTemplateResult> updateSystemTemplateAsync(UpdateSystemTemplateRequest request) {

        return updateSystemTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSystemTemplateResult> updateSystemTemplateAsync(final UpdateSystemTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSystemTemplateRequest, UpdateSystemTemplateResult> asyncHandler) {
        final UpdateSystemTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSystemTemplateResult>() {
            @Override
            public UpdateSystemTemplateResult call() throws Exception {
                UpdateSystemTemplateResult result = null;

                try {
                    result = executeUpdateSystemTemplate(finalRequest);
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
    public java.util.concurrent.Future<UploadEntityDefinitionsResult> uploadEntityDefinitionsAsync(UploadEntityDefinitionsRequest request) {

        return uploadEntityDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadEntityDefinitionsResult> uploadEntityDefinitionsAsync(final UploadEntityDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadEntityDefinitionsRequest, UploadEntityDefinitionsResult> asyncHandler) {
        final UploadEntityDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UploadEntityDefinitionsResult>() {
            @Override
            public UploadEntityDefinitionsResult call() throws Exception {
                UploadEntityDefinitionsResult result = null;

                try {
                    result = executeUploadEntityDefinitions(finalRequest);
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
