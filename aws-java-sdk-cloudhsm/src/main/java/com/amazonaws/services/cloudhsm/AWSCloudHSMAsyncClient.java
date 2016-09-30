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
package com.amazonaws.services.cloudhsm;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing CloudHSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CloudHSM Service</fullname>
 */
@ThreadSafe
public class AWSCloudHSMAsyncClient extends AWSCloudHSMClient implements AWSCloudHSMAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM. A credentials provider chain will be
     * used that searches for credentials in this order:
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
    public AWSCloudHSMAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to CloudHSM (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the provided AWS account
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
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCloudHSMAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudHSM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCloudHSMAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result;

                try {
                    result = addTagsToResource(request);
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
    public java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest request) {

        return createHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHapgResult> createHapgAsync(final CreateHapgRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHapgRequest, CreateHapgResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHapgResult>() {
            @Override
            public CreateHapgResult call() throws Exception {
                CreateHapgResult result;

                try {
                    result = createHapg(request);
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
    public java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest request) {

        return createHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHsmResult> createHsmAsync(final CreateHsmRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHsmResult>() {
            @Override
            public CreateHsmResult call() throws Exception {
                CreateHsmResult result;

                try {
                    result = createHsm(request);
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
    public java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest request) {

        return createLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(final CreateLunaClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLunaClientRequest, CreateLunaClientResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateLunaClientResult>() {
            @Override
            public CreateLunaClientResult call() throws Exception {
                CreateLunaClientResult result;

                try {
                    result = createLunaClient(request);
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
    public java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest request) {

        return deleteHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(final DeleteHapgRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHapgRequest, DeleteHapgResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHapgResult>() {
            @Override
            public DeleteHapgResult call() throws Exception {
                DeleteHapgResult result;

                try {
                    result = deleteHapg(request);
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
    public java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest request) {

        return deleteHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(final DeleteHsmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHsmResult>() {
            @Override
            public DeleteHsmResult call() throws Exception {
                DeleteHsmResult result;

                try {
                    result = deleteHsm(request);
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
    public java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest request) {

        return deleteLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(final DeleteLunaClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLunaClientRequest, DeleteLunaClientResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteLunaClientResult>() {
            @Override
            public DeleteLunaClientResult call() throws Exception {
                DeleteLunaClientResult result;

                try {
                    result = deleteLunaClient(request);
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
    public java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest request) {

        return describeHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(final DescribeHapgRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHapgRequest, DescribeHapgResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeHapgResult>() {
            @Override
            public DescribeHapgResult call() throws Exception {
                DescribeHapgResult result;

                try {
                    result = describeHapg(request);
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
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest request) {

        return describeHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(final DescribeHsmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeHsmResult>() {
            @Override
            public DescribeHsmResult call() throws Exception {
                DescribeHsmResult result;

                try {
                    result = describeHsm(request);
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
     * Simplified method form for invoking the DescribeHsm operation.
     *
     * @see #describeHsmAsync(DescribeHsmRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync() {

        return describeHsmAsync(new DescribeHsmRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHsm operation with an AsyncHandler.
     *
     * @see #describeHsmAsync(DescribeHsmRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler) {

        return describeHsmAsync(new DescribeHsmRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest request) {

        return describeLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(final DescribeLunaClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeLunaClientResult>() {
            @Override
            public DescribeLunaClientResult call() throws Exception {
                DescribeLunaClientResult result;

                try {
                    result = describeLunaClient(request);
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
     * Simplified method form for invoking the DescribeLunaClient operation.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync() {

        return describeLunaClientAsync(new DescribeLunaClientRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLunaClient operation with an AsyncHandler.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler) {

        return describeLunaClientAsync(new DescribeLunaClientRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest request) {

        return getConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResult> getConfigAsync(final GetConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetConfigResult>() {
            @Override
            public GetConfigResult call() throws Exception {
                GetConfigResult result;

                try {
                    result = getConfig(request);
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
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest request) {

        return listAvailableZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(final ListAvailableZonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAvailableZonesResult>() {
            @Override
            public ListAvailableZonesResult call() throws Exception {
                ListAvailableZonesResult result;

                try {
                    result = listAvailableZones(request);
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
     * Simplified method form for invoking the ListAvailableZones operation.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync() {

        return listAvailableZonesAsync(new ListAvailableZonesRequest());
    }

    /**
     * Simplified method form for invoking the ListAvailableZones operation with an AsyncHandler.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler) {

        return listAvailableZonesAsync(new ListAvailableZonesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest request) {

        return listHapgsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(final ListHapgsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListHapgsResult>() {
            @Override
            public ListHapgsResult call() throws Exception {
                ListHapgsResult result;

                try {
                    result = listHapgs(request);
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
     * Simplified method form for invoking the ListHapgs operation.
     *
     * @see #listHapgsAsync(ListHapgsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync() {

        return listHapgsAsync(new ListHapgsRequest());
    }

    /**
     * Simplified method form for invoking the ListHapgs operation with an AsyncHandler.
     *
     * @see #listHapgsAsync(ListHapgsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler) {

        return listHapgsAsync(new ListHapgsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest request) {

        return listHsmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(final ListHsmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListHsmsResult>() {
            @Override
            public ListHsmsResult call() throws Exception {
                ListHsmsResult result;

                try {
                    result = listHsms(request);
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
     * Simplified method form for invoking the ListHsms operation.
     *
     * @see #listHsmsAsync(ListHsmsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync() {

        return listHsmsAsync(new ListHsmsRequest());
    }

    /**
     * Simplified method form for invoking the ListHsms operation with an AsyncHandler.
     *
     * @see #listHsmsAsync(ListHsmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler) {

        return listHsmsAsync(new ListHsmsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest request) {

        return listLunaClientsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(final ListLunaClientsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListLunaClientsResult>() {
            @Override
            public ListLunaClientsResult call() throws Exception {
                ListLunaClientsResult result;

                try {
                    result = listLunaClients(request);
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
     * Simplified method form for invoking the ListLunaClients operation.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync() {

        return listLunaClientsAsync(new ListLunaClientsRequest());
    }

    /**
     * Simplified method form for invoking the ListLunaClients operation with an AsyncHandler.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler) {

        return listLunaClientsAsync(new ListLunaClientsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result;

                try {
                    result = listTagsForResource(request);
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
    public java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest request) {

        return modifyHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(final ModifyHapgRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyHapgRequest, ModifyHapgResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyHapgResult>() {
            @Override
            public ModifyHapgResult call() throws Exception {
                ModifyHapgResult result;

                try {
                    result = modifyHapg(request);
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
    public java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest request) {

        return modifyHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(final ModifyHsmRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyHsmRequest, ModifyHsmResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyHsmResult>() {
            @Override
            public ModifyHsmResult call() throws Exception {
                ModifyHsmResult result;

                try {
                    result = modifyHsm(request);
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
    public java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest request) {

        return modifyLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(final ModifyLunaClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyLunaClientRequest, ModifyLunaClientResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyLunaClientResult>() {
            @Override
            public ModifyLunaClientResult call() throws Exception {
                ModifyLunaClientResult result;

                try {
                    result = modifyLunaClient(request);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result;

                try {
                    result = removeTagsFromResource(request);
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
