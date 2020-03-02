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
package com.amazonaws.services.outposts;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Outposts asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Outposts is a fully-managed service that extends AWS infrastructure, APIs, and tools to customer premises. By
 * providing local access to AWS-managed infrastructure, AWS Outposts enables customers to build and run applications on
 * premises using the same programming interfaces as in AWS Regions, while using local compute and storage resources for
 * lower latency and local data processing needs.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOutpostsAsyncClient extends AWSOutpostsClient implements AWSOutpostsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSOutpostsAsyncClientBuilder asyncBuilder() {
        return AWSOutpostsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Outposts using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOutpostsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest request) {

        return createOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(final CreateOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOutpostRequest, CreateOutpostResult> asyncHandler) {
        final CreateOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOutpostResult>() {
            @Override
            public CreateOutpostResult call() throws Exception {
                CreateOutpostResult result = null;

                try {
                    result = executeCreateOutpost(finalRequest);
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
    public java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest request) {

        return deleteOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(final DeleteOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOutpostRequest, DeleteOutpostResult> asyncHandler) {
        final DeleteOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOutpostResult>() {
            @Override
            public DeleteOutpostResult call() throws Exception {
                DeleteOutpostResult result = null;

                try {
                    result = executeDeleteOutpost(finalRequest);
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
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest request) {

        return deleteSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(final DeleteSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler) {
        final DeleteSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSiteResult>() {
            @Override
            public DeleteSiteResult call() throws Exception {
                DeleteSiteResult result = null;

                try {
                    result = executeDeleteSite(finalRequest);
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
    public java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest request) {

        return getOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(final GetOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOutpostRequest, GetOutpostResult> asyncHandler) {
        final GetOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOutpostResult>() {
            @Override
            public GetOutpostResult call() throws Exception {
                GetOutpostResult result = null;

                try {
                    result = executeGetOutpost(finalRequest);
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
    public java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest request) {

        return getOutpostInstanceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(final GetOutpostInstanceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOutpostInstanceTypesRequest, GetOutpostInstanceTypesResult> asyncHandler) {
        final GetOutpostInstanceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOutpostInstanceTypesResult>() {
            @Override
            public GetOutpostInstanceTypesResult call() throws Exception {
                GetOutpostInstanceTypesResult result = null;

                try {
                    result = executeGetOutpostInstanceTypes(finalRequest);
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
    public java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest request) {

        return listOutpostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(final ListOutpostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOutpostsRequest, ListOutpostsResult> asyncHandler) {
        final ListOutpostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOutpostsResult>() {
            @Override
            public ListOutpostsResult call() throws Exception {
                ListOutpostsResult result = null;

                try {
                    result = executeListOutposts(finalRequest);
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
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest request) {

        return listSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(final ListSitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler) {
        final ListSitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSitesResult>() {
            @Override
            public ListSitesResult call() throws Exception {
                ListSitesResult result = null;

                try {
                    result = executeListSites(finalRequest);
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
