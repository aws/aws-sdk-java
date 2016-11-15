/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb;

import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon SimpleDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * Amazon SimpleDB is a web service providing the core database functions of data indexing and querying in the cloud. By
 * offloading the time and effort associated with building and operating a web-scale database, SimpleDB provides
 * developers the freedom to focus on application development.
 * <p>
 * A traditional, clustered relational database requires a sizable upfront capital outlay, is complex to design, and
 * often requires extensive and repetitive database administration. Amazon SimpleDB is dramatically simpler, requiring
 * no schema, automatically indexing your data and providing a simple API for storage and access. This approach
 * eliminates the administrative burden of data modeling, index maintenance, and performance tuning. Developers gain
 * access to this functionality within Amazon's proven computing environment, are able to scale instantly, and pay only
 * for what they use.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/simpledb/">http://aws.amazon.com/simpledb/</a> for more information.
 * </p>
 */
@ThreadSafe
public class AmazonSimpleDBAsyncClient extends AmazonSimpleDBClient implements AmazonSimpleDBAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB. A credentials provider chain
     * will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleDBAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB. A credentials provider chain
     * will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SimpleDB (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleDBAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SimpleDB using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSimpleDBAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteAttributesResult> batchDeleteAttributesAsync(BatchDeleteAttributesRequest request) {

        return batchDeleteAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteAttributesResult> batchDeleteAttributesAsync(final BatchDeleteAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteAttributesRequest, BatchDeleteAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteAttributesResult>() {
            @Override
            public BatchDeleteAttributesResult call() throws Exception {
                BatchDeleteAttributesResult result;

                try {
                    result = batchDeleteAttributes(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchPutAttributesResult> batchPutAttributesAsync(BatchPutAttributesRequest request) {

        return batchPutAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutAttributesResult> batchPutAttributesAsync(final BatchPutAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutAttributesRequest, BatchPutAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchPutAttributesResult>() {
            @Override
            public BatchPutAttributesResult call() throws Exception {
                BatchPutAttributesResult result;

                try {
                    result = batchPutAttributes(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result;

                try {
                    result = createDomain(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest request) {

        return deleteAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(final DeleteAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttributesRequest, DeleteAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttributesResult>() {
            @Override
            public DeleteAttributesResult call() throws Exception {
                DeleteAttributesResult result;

                try {
                    result = deleteAttributes(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result;

                try {
                    result = deleteDomain(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest request) {

        return domainMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DomainMetadataResult> domainMetadataAsync(final DomainMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<DomainMetadataRequest, DomainMetadataResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DomainMetadataResult>() {
            @Override
            public DomainMetadataResult call() throws Exception {
                DomainMetadataResult result;

                try {
                    result = domainMetadata(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest request) {

        return getAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttributesResult> getAttributesAsync(final GetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAttributesRequest, GetAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAttributesResult>() {
            @Override
            public GetAttributesResult call() throws Exception {
                GetAttributesResult result;

                try {
                    result = getAttributes(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result;

                try {
                    result = listDomains(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomainsAsync(ListDomainsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync() {

        return listDomainsAsync(new ListDomainsRequest());
    }

    /**
     * Simplified method form for invoking the ListDomains operation with an AsyncHandler.
     *
     * @see #listDomainsAsync(ListDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        return listDomainsAsync(new ListDomainsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest request) {

        return putAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(final PutAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAttributesRequest, PutAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutAttributesResult>() {
            @Override
            public PutAttributesResult call() throws Exception {
                PutAttributesResult result;

                try {
                    result = putAttributes(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SelectResult> selectAsync(SelectRequest request) {

        return selectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SelectResult> selectAsync(final SelectRequest request,
            final com.amazonaws.handlers.AsyncHandler<SelectRequest, SelectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SelectResult>() {
            @Override
            public SelectResult call() throws Exception {
                SelectResult result;

                try {
                    result = select(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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
