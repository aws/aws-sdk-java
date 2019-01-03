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
package com.amazonaws.services.elasticsearch;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Elasticsearch Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elasticsearch Configuration Service</fullname>
 * <p>
 * Use the Amazon Elasticsearch configuration API to create, configure, and manage Elasticsearch domains.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example,
 * es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions" target="_blank">Regions
 * and Endpoints</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSElasticsearchAsyncClient extends AWSElasticsearchClient implements AWSElasticsearchAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Elasticsearch Service (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the provided
     * AWS account credentials provider and client configuration options.
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
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSElasticsearchAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSElasticsearchAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSElasticsearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSElasticsearchAsyncClientBuilder asyncBuilder() {
        return AWSElasticsearchAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elasticsearch Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSElasticsearchAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
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
    public java.util.concurrent.Future<CancelElasticsearchServiceSoftwareUpdateResult> cancelElasticsearchServiceSoftwareUpdateAsync(
            CancelElasticsearchServiceSoftwareUpdateRequest request) {

        return cancelElasticsearchServiceSoftwareUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelElasticsearchServiceSoftwareUpdateResult> cancelElasticsearchServiceSoftwareUpdateAsync(
            final CancelElasticsearchServiceSoftwareUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelElasticsearchServiceSoftwareUpdateRequest, CancelElasticsearchServiceSoftwareUpdateResult> asyncHandler) {
        final CancelElasticsearchServiceSoftwareUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelElasticsearchServiceSoftwareUpdateResult>() {
            @Override
            public CancelElasticsearchServiceSoftwareUpdateResult call() throws Exception {
                CancelElasticsearchServiceSoftwareUpdateResult result = null;

                try {
                    result = executeCancelElasticsearchServiceSoftwareUpdate(finalRequest);
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
    public java.util.concurrent.Future<CreateElasticsearchDomainResult> createElasticsearchDomainAsync(CreateElasticsearchDomainRequest request) {

        return createElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateElasticsearchDomainResult> createElasticsearchDomainAsync(final CreateElasticsearchDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateElasticsearchDomainRequest, CreateElasticsearchDomainResult> asyncHandler) {
        final CreateElasticsearchDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateElasticsearchDomainResult>() {
            @Override
            public CreateElasticsearchDomainResult call() throws Exception {
                CreateElasticsearchDomainResult result = null;

                try {
                    result = executeCreateElasticsearchDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteElasticsearchDomainResult> deleteElasticsearchDomainAsync(DeleteElasticsearchDomainRequest request) {

        return deleteElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteElasticsearchDomainResult> deleteElasticsearchDomainAsync(final DeleteElasticsearchDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteElasticsearchDomainRequest, DeleteElasticsearchDomainResult> asyncHandler) {
        final DeleteElasticsearchDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteElasticsearchDomainResult>() {
            @Override
            public DeleteElasticsearchDomainResult call() throws Exception {
                DeleteElasticsearchDomainResult result = null;

                try {
                    result = executeDeleteElasticsearchDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteElasticsearchServiceRoleResult> deleteElasticsearchServiceRoleAsync(DeleteElasticsearchServiceRoleRequest request) {

        return deleteElasticsearchServiceRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteElasticsearchServiceRoleResult> deleteElasticsearchServiceRoleAsync(
            final DeleteElasticsearchServiceRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteElasticsearchServiceRoleRequest, DeleteElasticsearchServiceRoleResult> asyncHandler) {
        final DeleteElasticsearchServiceRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteElasticsearchServiceRoleResult>() {
            @Override
            public DeleteElasticsearchServiceRoleResult call() throws Exception {
                DeleteElasticsearchServiceRoleResult result = null;

                try {
                    result = executeDeleteElasticsearchServiceRole(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticsearchDomainResult> describeElasticsearchDomainAsync(DescribeElasticsearchDomainRequest request) {

        return describeElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainResult> describeElasticsearchDomainAsync(final DescribeElasticsearchDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainRequest, DescribeElasticsearchDomainResult> asyncHandler) {
        final DescribeElasticsearchDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticsearchDomainResult>() {
            @Override
            public DescribeElasticsearchDomainResult call() throws Exception {
                DescribeElasticsearchDomainResult result = null;

                try {
                    result = executeDescribeElasticsearchDomain(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticsearchDomainConfigResult> describeElasticsearchDomainConfigAsync(
            DescribeElasticsearchDomainConfigRequest request) {

        return describeElasticsearchDomainConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainConfigResult> describeElasticsearchDomainConfigAsync(
            final DescribeElasticsearchDomainConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainConfigRequest, DescribeElasticsearchDomainConfigResult> asyncHandler) {
        final DescribeElasticsearchDomainConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticsearchDomainConfigResult>() {
            @Override
            public DescribeElasticsearchDomainConfigResult call() throws Exception {
                DescribeElasticsearchDomainConfigResult result = null;

                try {
                    result = executeDescribeElasticsearchDomainConfig(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticsearchDomainsResult> describeElasticsearchDomainsAsync(DescribeElasticsearchDomainsRequest request) {

        return describeElasticsearchDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainsResult> describeElasticsearchDomainsAsync(final DescribeElasticsearchDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainsRequest, DescribeElasticsearchDomainsResult> asyncHandler) {
        final DescribeElasticsearchDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticsearchDomainsResult>() {
            @Override
            public DescribeElasticsearchDomainsResult call() throws Exception {
                DescribeElasticsearchDomainsResult result = null;

                try {
                    result = executeDescribeElasticsearchDomains(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticsearchInstanceTypeLimitsResult> describeElasticsearchInstanceTypeLimitsAsync(
            DescribeElasticsearchInstanceTypeLimitsRequest request) {

        return describeElasticsearchInstanceTypeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchInstanceTypeLimitsResult> describeElasticsearchInstanceTypeLimitsAsync(
            final DescribeElasticsearchInstanceTypeLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchInstanceTypeLimitsRequest, DescribeElasticsearchInstanceTypeLimitsResult> asyncHandler) {
        final DescribeElasticsearchInstanceTypeLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticsearchInstanceTypeLimitsResult>() {
            @Override
            public DescribeElasticsearchInstanceTypeLimitsResult call() throws Exception {
                DescribeElasticsearchInstanceTypeLimitsResult result = null;

                try {
                    result = executeDescribeElasticsearchInstanceTypeLimits(finalRequest);
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
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstanceOfferingsResult> describeReservedElasticsearchInstanceOfferingsAsync(
            DescribeReservedElasticsearchInstanceOfferingsRequest request) {

        return describeReservedElasticsearchInstanceOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstanceOfferingsResult> describeReservedElasticsearchInstanceOfferingsAsync(
            final DescribeReservedElasticsearchInstanceOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedElasticsearchInstanceOfferingsRequest, DescribeReservedElasticsearchInstanceOfferingsResult> asyncHandler) {
        final DescribeReservedElasticsearchInstanceOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedElasticsearchInstanceOfferingsResult>() {
            @Override
            public DescribeReservedElasticsearchInstanceOfferingsResult call() throws Exception {
                DescribeReservedElasticsearchInstanceOfferingsResult result = null;

                try {
                    result = executeDescribeReservedElasticsearchInstanceOfferings(finalRequest);
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
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstancesResult> describeReservedElasticsearchInstancesAsync(
            DescribeReservedElasticsearchInstancesRequest request) {

        return describeReservedElasticsearchInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstancesResult> describeReservedElasticsearchInstancesAsync(
            final DescribeReservedElasticsearchInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedElasticsearchInstancesRequest, DescribeReservedElasticsearchInstancesResult> asyncHandler) {
        final DescribeReservedElasticsearchInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedElasticsearchInstancesResult>() {
            @Override
            public DescribeReservedElasticsearchInstancesResult call() throws Exception {
                DescribeReservedElasticsearchInstancesResult result = null;

                try {
                    result = executeDescribeReservedElasticsearchInstances(finalRequest);
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
    public java.util.concurrent.Future<GetCompatibleElasticsearchVersionsResult> getCompatibleElasticsearchVersionsAsync(
            GetCompatibleElasticsearchVersionsRequest request) {

        return getCompatibleElasticsearchVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleElasticsearchVersionsResult> getCompatibleElasticsearchVersionsAsync(
            final GetCompatibleElasticsearchVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCompatibleElasticsearchVersionsRequest, GetCompatibleElasticsearchVersionsResult> asyncHandler) {
        final GetCompatibleElasticsearchVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCompatibleElasticsearchVersionsResult>() {
            @Override
            public GetCompatibleElasticsearchVersionsResult call() throws Exception {
                GetCompatibleElasticsearchVersionsResult result = null;

                try {
                    result = executeGetCompatibleElasticsearchVersions(finalRequest);
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
    public java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest request) {

        return getUpgradeHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(final GetUpgradeHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUpgradeHistoryRequest, GetUpgradeHistoryResult> asyncHandler) {
        final GetUpgradeHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUpgradeHistoryResult>() {
            @Override
            public GetUpgradeHistoryResult call() throws Exception {
                GetUpgradeHistoryResult result = null;

                try {
                    result = executeGetUpgradeHistory(finalRequest);
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
    public java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest request) {

        return getUpgradeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(final GetUpgradeStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUpgradeStatusRequest, GetUpgradeStatusResult> asyncHandler) {
        final GetUpgradeStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUpgradeStatusResult>() {
            @Override
            public GetUpgradeStatusResult call() throws Exception {
                GetUpgradeStatusResult result = null;

                try {
                    result = executeGetUpgradeStatus(finalRequest);
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
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest request) {

        return listDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(final ListDomainNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler) {
        final ListDomainNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainNamesResult>() {
            @Override
            public ListDomainNamesResult call() throws Exception {
                ListDomainNamesResult result = null;

                try {
                    result = executeListDomainNames(finalRequest);
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
    public java.util.concurrent.Future<ListElasticsearchInstanceTypesResult> listElasticsearchInstanceTypesAsync(ListElasticsearchInstanceTypesRequest request) {

        return listElasticsearchInstanceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListElasticsearchInstanceTypesResult> listElasticsearchInstanceTypesAsync(
            final ListElasticsearchInstanceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListElasticsearchInstanceTypesRequest, ListElasticsearchInstanceTypesResult> asyncHandler) {
        final ListElasticsearchInstanceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListElasticsearchInstanceTypesResult>() {
            @Override
            public ListElasticsearchInstanceTypesResult call() throws Exception {
                ListElasticsearchInstanceTypesResult result = null;

                try {
                    result = executeListElasticsearchInstanceTypes(finalRequest);
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
    public java.util.concurrent.Future<ListElasticsearchVersionsResult> listElasticsearchVersionsAsync(ListElasticsearchVersionsRequest request) {

        return listElasticsearchVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListElasticsearchVersionsResult> listElasticsearchVersionsAsync(final ListElasticsearchVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListElasticsearchVersionsRequest, ListElasticsearchVersionsResult> asyncHandler) {
        final ListElasticsearchVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListElasticsearchVersionsResult>() {
            @Override
            public ListElasticsearchVersionsResult call() throws Exception {
                ListElasticsearchVersionsResult result = null;

                try {
                    result = executeListElasticsearchVersions(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<PurchaseReservedElasticsearchInstanceOfferingResult> purchaseReservedElasticsearchInstanceOfferingAsync(
            PurchaseReservedElasticsearchInstanceOfferingRequest request) {

        return purchaseReservedElasticsearchInstanceOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedElasticsearchInstanceOfferingResult> purchaseReservedElasticsearchInstanceOfferingAsync(
            final PurchaseReservedElasticsearchInstanceOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedElasticsearchInstanceOfferingRequest, PurchaseReservedElasticsearchInstanceOfferingResult> asyncHandler) {
        final PurchaseReservedElasticsearchInstanceOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseReservedElasticsearchInstanceOfferingResult>() {
            @Override
            public PurchaseReservedElasticsearchInstanceOfferingResult call() throws Exception {
                PurchaseReservedElasticsearchInstanceOfferingResult result = null;

                try {
                    result = executePurchaseReservedElasticsearchInstanceOffering(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {
        final RemoveTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsResult>() {
            @Override
            public RemoveTagsResult call() throws Exception {
                RemoveTagsResult result = null;

                try {
                    result = executeRemoveTags(finalRequest);
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
    public java.util.concurrent.Future<StartElasticsearchServiceSoftwareUpdateResult> startElasticsearchServiceSoftwareUpdateAsync(
            StartElasticsearchServiceSoftwareUpdateRequest request) {

        return startElasticsearchServiceSoftwareUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartElasticsearchServiceSoftwareUpdateResult> startElasticsearchServiceSoftwareUpdateAsync(
            final StartElasticsearchServiceSoftwareUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartElasticsearchServiceSoftwareUpdateRequest, StartElasticsearchServiceSoftwareUpdateResult> asyncHandler) {
        final StartElasticsearchServiceSoftwareUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartElasticsearchServiceSoftwareUpdateResult>() {
            @Override
            public StartElasticsearchServiceSoftwareUpdateResult call() throws Exception {
                StartElasticsearchServiceSoftwareUpdateResult result = null;

                try {
                    result = executeStartElasticsearchServiceSoftwareUpdate(finalRequest);
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
    public java.util.concurrent.Future<UpdateElasticsearchDomainConfigResult> updateElasticsearchDomainConfigAsync(
            UpdateElasticsearchDomainConfigRequest request) {

        return updateElasticsearchDomainConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateElasticsearchDomainConfigResult> updateElasticsearchDomainConfigAsync(
            final UpdateElasticsearchDomainConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateElasticsearchDomainConfigRequest, UpdateElasticsearchDomainConfigResult> asyncHandler) {
        final UpdateElasticsearchDomainConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateElasticsearchDomainConfigResult>() {
            @Override
            public UpdateElasticsearchDomainConfigResult call() throws Exception {
                UpdateElasticsearchDomainConfigResult result = null;

                try {
                    result = executeUpdateElasticsearchDomainConfig(finalRequest);
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
    public java.util.concurrent.Future<UpgradeElasticsearchDomainResult> upgradeElasticsearchDomainAsync(UpgradeElasticsearchDomainRequest request) {

        return upgradeElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeElasticsearchDomainResult> upgradeElasticsearchDomainAsync(final UpgradeElasticsearchDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeElasticsearchDomainRequest, UpgradeElasticsearchDomainResult> asyncHandler) {
        final UpgradeElasticsearchDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeElasticsearchDomainResult>() {
            @Override
            public UpgradeElasticsearchDomainResult call() throws Exception {
                UpgradeElasticsearchDomainResult result = null;

                try {
                    result = executeUpgradeElasticsearchDomain(finalRequest);
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
