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
package com.amazonaws.services.appregistry;

import javax.annotation.Generated;

import com.amazonaws.services.appregistry.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AppRegistry asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Service Catalog AppRegistry enables organizations to understand the application context of their AWS resources.
 * AppRegistry provides a repository of your applications, their resources, and the application metadata that you use
 * within your enterprise.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppRegistryAsyncClient extends AWSAppRegistryClient implements AWSAppRegistryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAppRegistryAsyncClientBuilder asyncBuilder() {
        return AWSAppRegistryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AppRegistry using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAppRegistryAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AppRegistry using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAppRegistryAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAttributeGroupResult> associateAttributeGroupAsync(AssociateAttributeGroupRequest request) {

        return associateAttributeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAttributeGroupResult> associateAttributeGroupAsync(final AssociateAttributeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAttributeGroupRequest, AssociateAttributeGroupResult> asyncHandler) {
        final AssociateAttributeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAttributeGroupResult>() {
            @Override
            public AssociateAttributeGroupResult call() throws Exception {
                AssociateAttributeGroupResult result = null;

                try {
                    result = executeAssociateAttributeGroup(finalRequest);
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
    public java.util.concurrent.Future<AssociateResourceResult> associateResourceAsync(AssociateResourceRequest request) {

        return associateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceResult> associateResourceAsync(final AssociateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResourceRequest, AssociateResourceResult> asyncHandler) {
        final AssociateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResourceResult>() {
            @Override
            public AssociateResourceResult call() throws Exception {
                AssociateResourceResult result = null;

                try {
                    result = executeAssociateResource(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateAttributeGroupResult> createAttributeGroupAsync(CreateAttributeGroupRequest request) {

        return createAttributeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAttributeGroupResult> createAttributeGroupAsync(final CreateAttributeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAttributeGroupRequest, CreateAttributeGroupResult> asyncHandler) {
        final CreateAttributeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAttributeGroupResult>() {
            @Override
            public CreateAttributeGroupResult call() throws Exception {
                CreateAttributeGroupResult result = null;

                try {
                    result = executeCreateAttributeGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteAttributeGroupResult> deleteAttributeGroupAsync(DeleteAttributeGroupRequest request) {

        return deleteAttributeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributeGroupResult> deleteAttributeGroupAsync(final DeleteAttributeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttributeGroupRequest, DeleteAttributeGroupResult> asyncHandler) {
        final DeleteAttributeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttributeGroupResult>() {
            @Override
            public DeleteAttributeGroupResult call() throws Exception {
                DeleteAttributeGroupResult result = null;

                try {
                    result = executeDeleteAttributeGroup(finalRequest);
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
    public java.util.concurrent.Future<DisassociateAttributeGroupResult> disassociateAttributeGroupAsync(DisassociateAttributeGroupRequest request) {

        return disassociateAttributeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAttributeGroupResult> disassociateAttributeGroupAsync(final DisassociateAttributeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAttributeGroupRequest, DisassociateAttributeGroupResult> asyncHandler) {
        final DisassociateAttributeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAttributeGroupResult>() {
            @Override
            public DisassociateAttributeGroupResult call() throws Exception {
                DisassociateAttributeGroupResult result = null;

                try {
                    result = executeDisassociateAttributeGroup(finalRequest);
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
    public java.util.concurrent.Future<DisassociateResourceResult> disassociateResourceAsync(DisassociateResourceRequest request) {

        return disassociateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceResult> disassociateResourceAsync(final DisassociateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResourceRequest, DisassociateResourceResult> asyncHandler) {
        final DisassociateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResourceResult>() {
            @Override
            public DisassociateResourceResult call() throws Exception {
                DisassociateResourceResult result = null;

                try {
                    result = executeDisassociateResource(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
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
    public java.util.concurrent.Future<GetAttributeGroupResult> getAttributeGroupAsync(GetAttributeGroupRequest request) {

        return getAttributeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttributeGroupResult> getAttributeGroupAsync(final GetAttributeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAttributeGroupRequest, GetAttributeGroupResult> asyncHandler) {
        final GetAttributeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAttributeGroupResult>() {
            @Override
            public GetAttributeGroupResult call() throws Exception {
                GetAttributeGroupResult result = null;

                try {
                    result = executeGetAttributeGroup(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<ListAssociatedAttributeGroupsResult> listAssociatedAttributeGroupsAsync(ListAssociatedAttributeGroupsRequest request) {

        return listAssociatedAttributeGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedAttributeGroupsResult> listAssociatedAttributeGroupsAsync(
            final ListAssociatedAttributeGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedAttributeGroupsRequest, ListAssociatedAttributeGroupsResult> asyncHandler) {
        final ListAssociatedAttributeGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedAttributeGroupsResult>() {
            @Override
            public ListAssociatedAttributeGroupsResult call() throws Exception {
                ListAssociatedAttributeGroupsResult result = null;

                try {
                    result = executeListAssociatedAttributeGroups(finalRequest);
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
    public java.util.concurrent.Future<ListAssociatedResourcesResult> listAssociatedResourcesAsync(ListAssociatedResourcesRequest request) {

        return listAssociatedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedResourcesResult> listAssociatedResourcesAsync(final ListAssociatedResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedResourcesRequest, ListAssociatedResourcesResult> asyncHandler) {
        final ListAssociatedResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedResourcesResult>() {
            @Override
            public ListAssociatedResourcesResult call() throws Exception {
                ListAssociatedResourcesResult result = null;

                try {
                    result = executeListAssociatedResources(finalRequest);
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
    public java.util.concurrent.Future<ListAttributeGroupsResult> listAttributeGroupsAsync(ListAttributeGroupsRequest request) {

        return listAttributeGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttributeGroupsResult> listAttributeGroupsAsync(final ListAttributeGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttributeGroupsRequest, ListAttributeGroupsResult> asyncHandler) {
        final ListAttributeGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttributeGroupsResult>() {
            @Override
            public ListAttributeGroupsResult call() throws Exception {
                ListAttributeGroupsResult result = null;

                try {
                    result = executeListAttributeGroups(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateAttributeGroupResult> updateAttributeGroupAsync(UpdateAttributeGroupRequest request) {

        return updateAttributeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAttributeGroupResult> updateAttributeGroupAsync(final UpdateAttributeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAttributeGroupRequest, UpdateAttributeGroupResult> asyncHandler) {
        final UpdateAttributeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAttributeGroupResult>() {
            @Override
            public UpdateAttributeGroupResult call() throws Exception {
                UpdateAttributeGroupResult result = null;

                try {
                    result = executeUpdateAttributeGroup(finalRequest);
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
