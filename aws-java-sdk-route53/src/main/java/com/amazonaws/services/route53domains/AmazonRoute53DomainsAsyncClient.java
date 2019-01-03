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
package com.amazonaws.services.route53domains;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Route 53 Domains asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Route 53 API actions let you register domain names and perform related operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRoute53DomainsAsyncClient extends AmazonRoute53DomainsClient implements AmazonRoute53DomainsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Route 53 Domains (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the provided AWS
     * account credentials provider and client configuration options.
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
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53DomainsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRoute53DomainsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonRoute53DomainsAsyncClientBuilder asyncBuilder() {
        return AmazonRoute53DomainsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Route 53 Domains using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRoute53DomainsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest request) {

        return checkDomainAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(final CheckDomainAvailabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckDomainAvailabilityRequest, CheckDomainAvailabilityResult> asyncHandler) {
        final CheckDomainAvailabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckDomainAvailabilityResult>() {
            @Override
            public CheckDomainAvailabilityResult call() throws Exception {
                CheckDomainAvailabilityResult result = null;

                try {
                    result = executeCheckDomainAvailability(finalRequest);
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
    public java.util.concurrent.Future<CheckDomainTransferabilityResult> checkDomainTransferabilityAsync(CheckDomainTransferabilityRequest request) {

        return checkDomainTransferabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckDomainTransferabilityResult> checkDomainTransferabilityAsync(final CheckDomainTransferabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckDomainTransferabilityRequest, CheckDomainTransferabilityResult> asyncHandler) {
        final CheckDomainTransferabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckDomainTransferabilityResult>() {
            @Override
            public CheckDomainTransferabilityResult call() throws Exception {
                CheckDomainTransferabilityResult result = null;

                try {
                    result = executeCheckDomainTransferability(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagsForDomainResult> deleteTagsForDomainAsync(DeleteTagsForDomainRequest request) {

        return deleteTagsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsForDomainResult> deleteTagsForDomainAsync(final DeleteTagsForDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsForDomainRequest, DeleteTagsForDomainResult> asyncHandler) {
        final DeleteTagsForDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsForDomainResult>() {
            @Override
            public DeleteTagsForDomainResult call() throws Exception {
                DeleteTagsForDomainResult result = null;

                try {
                    result = executeDeleteTagsForDomain(finalRequest);
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
    public java.util.concurrent.Future<DisableDomainAutoRenewResult> disableDomainAutoRenewAsync(DisableDomainAutoRenewRequest request) {

        return disableDomainAutoRenewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDomainAutoRenewResult> disableDomainAutoRenewAsync(final DisableDomainAutoRenewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableDomainAutoRenewRequest, DisableDomainAutoRenewResult> asyncHandler) {
        final DisableDomainAutoRenewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableDomainAutoRenewResult>() {
            @Override
            public DisableDomainAutoRenewResult call() throws Exception {
                DisableDomainAutoRenewResult result = null;

                try {
                    result = executeDisableDomainAutoRenew(finalRequest);
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
    public java.util.concurrent.Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(DisableDomainTransferLockRequest request) {

        return disableDomainTransferLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(final DisableDomainTransferLockRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableDomainTransferLockRequest, DisableDomainTransferLockResult> asyncHandler) {
        final DisableDomainTransferLockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableDomainTransferLockResult>() {
            @Override
            public DisableDomainTransferLockResult call() throws Exception {
                DisableDomainTransferLockResult result = null;

                try {
                    result = executeDisableDomainTransferLock(finalRequest);
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
    public java.util.concurrent.Future<EnableDomainAutoRenewResult> enableDomainAutoRenewAsync(EnableDomainAutoRenewRequest request) {

        return enableDomainAutoRenewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDomainAutoRenewResult> enableDomainAutoRenewAsync(final EnableDomainAutoRenewRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableDomainAutoRenewRequest, EnableDomainAutoRenewResult> asyncHandler) {
        final EnableDomainAutoRenewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableDomainAutoRenewResult>() {
            @Override
            public EnableDomainAutoRenewResult call() throws Exception {
                EnableDomainAutoRenewResult result = null;

                try {
                    result = executeEnableDomainAutoRenew(finalRequest);
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
    public java.util.concurrent.Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest request) {

        return enableDomainTransferLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(final EnableDomainTransferLockRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableDomainTransferLockRequest, EnableDomainTransferLockResult> asyncHandler) {
        final EnableDomainTransferLockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableDomainTransferLockResult>() {
            @Override
            public EnableDomainTransferLockResult call() throws Exception {
                EnableDomainTransferLockResult result = null;

                try {
                    result = executeEnableDomainTransferLock(finalRequest);
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
    public java.util.concurrent.Future<GetContactReachabilityStatusResult> getContactReachabilityStatusAsync(GetContactReachabilityStatusRequest request) {

        return getContactReachabilityStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactReachabilityStatusResult> getContactReachabilityStatusAsync(final GetContactReachabilityStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactReachabilityStatusRequest, GetContactReachabilityStatusResult> asyncHandler) {
        final GetContactReachabilityStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactReachabilityStatusResult>() {
            @Override
            public GetContactReachabilityStatusResult call() throws Exception {
                GetContactReachabilityStatusResult result = null;

                try {
                    result = executeGetContactReachabilityStatus(finalRequest);
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
    public java.util.concurrent.Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest request) {

        return getDomainDetailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainDetailResult> getDomainDetailAsync(final GetDomainDetailRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainDetailRequest, GetDomainDetailResult> asyncHandler) {
        final GetDomainDetailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainDetailResult>() {
            @Override
            public GetDomainDetailResult call() throws Exception {
                GetDomainDetailResult result = null;

                try {
                    result = executeGetDomainDetail(finalRequest);
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
    public java.util.concurrent.Future<GetDomainSuggestionsResult> getDomainSuggestionsAsync(GetDomainSuggestionsRequest request) {

        return getDomainSuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainSuggestionsResult> getDomainSuggestionsAsync(final GetDomainSuggestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainSuggestionsRequest, GetDomainSuggestionsResult> asyncHandler) {
        final GetDomainSuggestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainSuggestionsResult>() {
            @Override
            public GetDomainSuggestionsResult call() throws Exception {
                GetDomainSuggestionsResult result = null;

                try {
                    result = executeGetDomainSuggestions(finalRequest);
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
    public java.util.concurrent.Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest request) {

        return getOperationDetailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationDetailResult> getOperationDetailAsync(final GetOperationDetailRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationDetailRequest, GetOperationDetailResult> asyncHandler) {
        final GetOperationDetailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOperationDetailResult>() {
            @Override
            public GetOperationDetailResult call() throws Exception {
                GetOperationDetailResult result = null;

                try {
                    result = executeGetOperationDetail(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
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
    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        return listDomainsAsync(new ListDomainsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest request) {

        return listOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(final ListOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler) {
        final ListOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOperationsResult>() {
            @Override
            public ListOperationsResult call() throws Exception {
                ListOperationsResult result = null;

                try {
                    result = executeListOperations(finalRequest);
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
     * Simplified method form for invoking the ListOperations operation.
     *
     * @see #listOperationsAsync(ListOperationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync() {

        return listOperationsAsync(new ListOperationsRequest());
    }

    /**
     * Simplified method form for invoking the ListOperations operation with an AsyncHandler.
     *
     * @see #listOperationsAsync(ListOperationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler) {

        return listOperationsAsync(new ListOperationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDomainResult> listTagsForDomainAsync(ListTagsForDomainRequest request) {

        return listTagsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDomainResult> listTagsForDomainAsync(final ListTagsForDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForDomainRequest, ListTagsForDomainResult> asyncHandler) {
        final ListTagsForDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForDomainResult>() {
            @Override
            public ListTagsForDomainResult call() throws Exception {
                ListTagsForDomainResult result = null;

                try {
                    result = executeListTagsForDomain(finalRequest);
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
    public java.util.concurrent.Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest request) {

        return registerDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDomainResult> registerDomainAsync(final RegisterDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDomainRequest, RegisterDomainResult> asyncHandler) {
        final RegisterDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterDomainResult>() {
            @Override
            public RegisterDomainResult call() throws Exception {
                RegisterDomainResult result = null;

                try {
                    result = executeRegisterDomain(finalRequest);
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
    public java.util.concurrent.Future<RenewDomainResult> renewDomainAsync(RenewDomainRequest request) {

        return renewDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenewDomainResult> renewDomainAsync(final RenewDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<RenewDomainRequest, RenewDomainResult> asyncHandler) {
        final RenewDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RenewDomainResult>() {
            @Override
            public RenewDomainResult call() throws Exception {
                RenewDomainResult result = null;

                try {
                    result = executeRenewDomain(finalRequest);
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
    public java.util.concurrent.Future<ResendContactReachabilityEmailResult> resendContactReachabilityEmailAsync(ResendContactReachabilityEmailRequest request) {

        return resendContactReachabilityEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResendContactReachabilityEmailResult> resendContactReachabilityEmailAsync(
            final ResendContactReachabilityEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResendContactReachabilityEmailRequest, ResendContactReachabilityEmailResult> asyncHandler) {
        final ResendContactReachabilityEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResendContactReachabilityEmailResult>() {
            @Override
            public ResendContactReachabilityEmailResult call() throws Exception {
                ResendContactReachabilityEmailResult result = null;

                try {
                    result = executeResendContactReachabilityEmail(finalRequest);
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
    public java.util.concurrent.Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest request) {

        return retrieveDomainAuthCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(final RetrieveDomainAuthCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetrieveDomainAuthCodeRequest, RetrieveDomainAuthCodeResult> asyncHandler) {
        final RetrieveDomainAuthCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetrieveDomainAuthCodeResult>() {
            @Override
            public RetrieveDomainAuthCodeResult call() throws Exception {
                RetrieveDomainAuthCodeResult result = null;

                try {
                    result = executeRetrieveDomainAuthCode(finalRequest);
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
    public java.util.concurrent.Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest request) {

        return transferDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferDomainResult> transferDomainAsync(final TransferDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<TransferDomainRequest, TransferDomainResult> asyncHandler) {
        final TransferDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TransferDomainResult>() {
            @Override
            public TransferDomainResult call() throws Exception {
                TransferDomainResult result = null;

                try {
                    result = executeTransferDomain(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest request) {

        return updateDomainContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainContactResult> updateDomainContactAsync(final UpdateDomainContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainContactRequest, UpdateDomainContactResult> asyncHandler) {
        final UpdateDomainContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainContactResult>() {
            @Override
            public UpdateDomainContactResult call() throws Exception {
                UpdateDomainContactResult result = null;

                try {
                    result = executeUpdateDomainContact(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(UpdateDomainContactPrivacyRequest request) {

        return updateDomainContactPrivacyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(final UpdateDomainContactPrivacyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainContactPrivacyRequest, UpdateDomainContactPrivacyResult> asyncHandler) {
        final UpdateDomainContactPrivacyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainContactPrivacyResult>() {
            @Override
            public UpdateDomainContactPrivacyResult call() throws Exception {
                UpdateDomainContactPrivacyResult result = null;

                try {
                    result = executeUpdateDomainContactPrivacy(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest request) {

        return updateDomainNameserversAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(final UpdateDomainNameserversRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainNameserversRequest, UpdateDomainNameserversResult> asyncHandler) {
        final UpdateDomainNameserversRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainNameserversResult>() {
            @Override
            public UpdateDomainNameserversResult call() throws Exception {
                UpdateDomainNameserversResult result = null;

                try {
                    result = executeUpdateDomainNameservers(finalRequest);
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
    public java.util.concurrent.Future<UpdateTagsForDomainResult> updateTagsForDomainAsync(UpdateTagsForDomainRequest request) {

        return updateTagsForDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTagsForDomainResult> updateTagsForDomainAsync(final UpdateTagsForDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTagsForDomainRequest, UpdateTagsForDomainResult> asyncHandler) {
        final UpdateTagsForDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTagsForDomainResult>() {
            @Override
            public UpdateTagsForDomainResult call() throws Exception {
                UpdateTagsForDomainResult result = null;

                try {
                    result = executeUpdateTagsForDomain(finalRequest);
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
    public java.util.concurrent.Future<ViewBillingResult> viewBillingAsync(ViewBillingRequest request) {

        return viewBillingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ViewBillingResult> viewBillingAsync(final ViewBillingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ViewBillingRequest, ViewBillingResult> asyncHandler) {
        final ViewBillingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ViewBillingResult>() {
            @Override
            public ViewBillingResult call() throws Exception {
                ViewBillingResult result = null;

                try {
                    result = executeViewBilling(finalRequest);
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
