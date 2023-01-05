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
package com.amazonaws.services.oam;

import javax.annotation.Generated;

import com.amazonaws.services.oam.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing CloudWatch Observability Access Manager asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use Amazon CloudWatch Observability Access Manager to create and manage links between source accounts and monitoring
 * accounts by using <i>CloudWatch cross-account observability</i>. With CloudWatch cross-account observability, you can
 * monitor and troubleshoot applications that span multiple accounts within a Region. Seamlessly search, visualize, and
 * analyze your metrics, logs, and traces in any of the linked accounts without account boundaries.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;Set up one or more Amazon Web Services accounts as &lt;i&gt;monitoring accounts&lt;/i&gt; and link them with multiple &lt;i&gt;source accounts&lt;/i&gt;. A monitoring account is a central Amazon Web Services account that can view and interact with observability data generated from source accounts. A source account is an individual Amazon Web Services account that generates observability data for the resources that reside in it. Source accounts share their observability data with the monitoring account. The shared observability data can include metrics in Amazon CloudWatch, logs in Amazon CloudWatch Logs, and traces in X-Ray.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOAMAsyncClient extends AWSOAMClient implements AWSOAMAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSOAMAsyncClientBuilder asyncBuilder() {
        return AWSOAMAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch Observability Access Manager using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOAMAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch Observability Access Manager using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSOAMAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest request) {

        return createLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(final CreateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLinkRequest, CreateLinkResult> asyncHandler) {
        final CreateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLinkResult>() {
            @Override
            public CreateLinkResult call() throws Exception {
                CreateLinkResult result = null;

                try {
                    result = executeCreateLink(finalRequest);
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
    public java.util.concurrent.Future<CreateSinkResult> createSinkAsync(CreateSinkRequest request) {

        return createSinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSinkResult> createSinkAsync(final CreateSinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSinkRequest, CreateSinkResult> asyncHandler) {
        final CreateSinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSinkResult>() {
            @Override
            public CreateSinkResult call() throws Exception {
                CreateSinkResult result = null;

                try {
                    result = executeCreateSink(finalRequest);
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
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest request) {

        return deleteLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(final DeleteLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLinkRequest, DeleteLinkResult> asyncHandler) {
        final DeleteLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLinkResult>() {
            @Override
            public DeleteLinkResult call() throws Exception {
                DeleteLinkResult result = null;

                try {
                    result = executeDeleteLink(finalRequest);
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
    public java.util.concurrent.Future<DeleteSinkResult> deleteSinkAsync(DeleteSinkRequest request) {

        return deleteSinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSinkResult> deleteSinkAsync(final DeleteSinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSinkRequest, DeleteSinkResult> asyncHandler) {
        final DeleteSinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSinkResult>() {
            @Override
            public DeleteSinkResult call() throws Exception {
                DeleteSinkResult result = null;

                try {
                    result = executeDeleteSink(finalRequest);
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
    public java.util.concurrent.Future<GetLinkResult> getLinkAsync(GetLinkRequest request) {

        return getLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinkResult> getLinkAsync(final GetLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLinkRequest, GetLinkResult> asyncHandler) {
        final GetLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLinkResult>() {
            @Override
            public GetLinkResult call() throws Exception {
                GetLinkResult result = null;

                try {
                    result = executeGetLink(finalRequest);
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
    public java.util.concurrent.Future<GetSinkResult> getSinkAsync(GetSinkRequest request) {

        return getSinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSinkResult> getSinkAsync(final GetSinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSinkRequest, GetSinkResult> asyncHandler) {
        final GetSinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSinkResult>() {
            @Override
            public GetSinkResult call() throws Exception {
                GetSinkResult result = null;

                try {
                    result = executeGetSink(finalRequest);
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
    public java.util.concurrent.Future<GetSinkPolicyResult> getSinkPolicyAsync(GetSinkPolicyRequest request) {

        return getSinkPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSinkPolicyResult> getSinkPolicyAsync(final GetSinkPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSinkPolicyRequest, GetSinkPolicyResult> asyncHandler) {
        final GetSinkPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSinkPolicyResult>() {
            @Override
            public GetSinkPolicyResult call() throws Exception {
                GetSinkPolicyResult result = null;

                try {
                    result = executeGetSinkPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListAttachedLinksResult> listAttachedLinksAsync(ListAttachedLinksRequest request) {

        return listAttachedLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedLinksResult> listAttachedLinksAsync(final ListAttachedLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedLinksRequest, ListAttachedLinksResult> asyncHandler) {
        final ListAttachedLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedLinksResult>() {
            @Override
            public ListAttachedLinksResult call() throws Exception {
                ListAttachedLinksResult result = null;

                try {
                    result = executeListAttachedLinks(finalRequest);
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
    public java.util.concurrent.Future<ListLinksResult> listLinksAsync(ListLinksRequest request) {

        return listLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLinksResult> listLinksAsync(final ListLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLinksRequest, ListLinksResult> asyncHandler) {
        final ListLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLinksResult>() {
            @Override
            public ListLinksResult call() throws Exception {
                ListLinksResult result = null;

                try {
                    result = executeListLinks(finalRequest);
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
    public java.util.concurrent.Future<ListSinksResult> listSinksAsync(ListSinksRequest request) {

        return listSinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSinksResult> listSinksAsync(final ListSinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSinksRequest, ListSinksResult> asyncHandler) {
        final ListSinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSinksResult>() {
            @Override
            public ListSinksResult call() throws Exception {
                ListSinksResult result = null;

                try {
                    result = executeListSinks(finalRequest);
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
    public java.util.concurrent.Future<PutSinkPolicyResult> putSinkPolicyAsync(PutSinkPolicyRequest request) {

        return putSinkPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSinkPolicyResult> putSinkPolicyAsync(final PutSinkPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSinkPolicyRequest, PutSinkPolicyResult> asyncHandler) {
        final PutSinkPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSinkPolicyResult>() {
            @Override
            public PutSinkPolicyResult call() throws Exception {
                PutSinkPolicyResult result = null;

                try {
                    result = executePutSinkPolicy(finalRequest);
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
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest request) {

        return updateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(final UpdateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLinkRequest, UpdateLinkResult> asyncHandler) {
        final UpdateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLinkResult>() {
            @Override
            public UpdateLinkResult call() throws Exception {
                UpdateLinkResult result = null;

                try {
                    result = executeUpdateLink(finalRequest);
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
