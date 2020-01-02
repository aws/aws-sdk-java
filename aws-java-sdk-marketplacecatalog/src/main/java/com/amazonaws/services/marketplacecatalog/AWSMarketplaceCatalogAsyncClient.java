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
package com.amazonaws.services.marketplacecatalog;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Marketplace Catalog asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Catalog API actions allow you to create, describe, list, and delete changes to your published entities. An entity is
 * a product or an offer on AWS Marketplace.
 * </p>
 * <p>
 * You can automate your entity update process by integrating the AWS Marketplace Catalog API with your AWS Marketplace
 * product build or deployment pipelines. You can also create your own applications on top of the Catalog API to manage
 * your products on AWS Marketplace.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceCatalogAsyncClient extends AWSMarketplaceCatalogClient implements AWSMarketplaceCatalogAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMarketplaceCatalogAsyncClientBuilder asyncBuilder() {
        return AWSMarketplaceCatalogAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Marketplace Catalog using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceCatalogAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelChangeSetResult> cancelChangeSetAsync(CancelChangeSetRequest request) {

        return cancelChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelChangeSetResult> cancelChangeSetAsync(final CancelChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelChangeSetRequest, CancelChangeSetResult> asyncHandler) {
        final CancelChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelChangeSetResult>() {
            @Override
            public CancelChangeSetResult call() throws Exception {
                CancelChangeSetResult result = null;

                try {
                    result = executeCancelChangeSet(finalRequest);
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
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest request) {

        return describeChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(final DescribeChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler) {
        final DescribeChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChangeSetResult>() {
            @Override
            public DescribeChangeSetResult call() throws Exception {
                DescribeChangeSetResult result = null;

                try {
                    result = executeDescribeChangeSet(finalRequest);
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
    public java.util.concurrent.Future<DescribeEntityResult> describeEntityAsync(DescribeEntityRequest request) {

        return describeEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityResult> describeEntityAsync(final DescribeEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEntityRequest, DescribeEntityResult> asyncHandler) {
        final DescribeEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEntityResult>() {
            @Override
            public DescribeEntityResult call() throws Exception {
                DescribeEntityResult result = null;

                try {
                    result = executeDescribeEntity(finalRequest);
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
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest request) {

        return listChangeSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(final ListChangeSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler) {
        final ListChangeSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChangeSetsResult>() {
            @Override
            public ListChangeSetsResult call() throws Exception {
                ListChangeSetsResult result = null;

                try {
                    result = executeListChangeSets(finalRequest);
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
    public java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest request) {

        return listEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(final ListEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitiesRequest, ListEntitiesResult> asyncHandler) {
        final ListEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntitiesResult>() {
            @Override
            public ListEntitiesResult call() throws Exception {
                ListEntitiesResult result = null;

                try {
                    result = executeListEntities(finalRequest);
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
    public java.util.concurrent.Future<StartChangeSetResult> startChangeSetAsync(StartChangeSetRequest request) {

        return startChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChangeSetResult> startChangeSetAsync(final StartChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartChangeSetRequest, StartChangeSetResult> asyncHandler) {
        final StartChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartChangeSetResult>() {
            @Override
            public StartChangeSetResult call() throws Exception {
                StartChangeSetResult result = null;

                try {
                    result = executeStartChangeSet(finalRequest);
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
