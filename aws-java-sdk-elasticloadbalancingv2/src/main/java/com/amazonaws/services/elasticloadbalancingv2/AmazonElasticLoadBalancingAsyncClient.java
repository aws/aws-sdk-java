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
package com.amazonaws.services.elasticloadbalancingv2;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Elastic Load Balancing v2 asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase
 * the availability of your application. The load balancer also monitors the health of its registered targets and
 * ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic
 * by specifying one or more listeners, which are configured with a protocol and port number for connections from
 * clients to the load balancer. You configure a target group with a protocol and port number for connections from the
 * load balancer to the targets, and with health check settings to be used when checking the health status of the
 * targets.
 * </p>
 * <p>
 * Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load
 * Balancers, and Classic Load Balancers.
 * </p>
 * <p>
 * An Application Load Balancer makes routing and load balancing decisions at the application layer (HTTP/HTTPS). A
 * Network Load Balancer makes routing and load balancing decisions at the transport layer (TCP/TLS). Both Application
 * Load Balancers and Network Load Balancers can route requests to one or more ports on each EC2 instance or container
 * instance in your virtual private cloud (VPC).
 * </p>
 * <p>
 * A Classic Load Balancer makes routing and load balancing decisions either at the transport layer (TCP/SSL) or the
 * application layer (HTTP/HTTPS), and supports either EC2-Classic or a VPC. For more information, see the <a
 * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/">Elastic Load Balancing User Guide</a>.
 * </p>
 * <p>
 * This reference covers the 2015-12-01 API, which supports Application Load Balancers and Network Load Balancers. The
 * 2012-06-01 API supports Classic Load Balancers.
 * </p>
 * <p>
 * To get started, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a load balancer using <a>CreateLoadBalancer</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a target group using <a>CreateTargetGroup</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Register targets for the target group using <a>RegisterTargets</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create one or more listeners for your load balancer using <a>CreateListener</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * To delete a load balancer and its related resources, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Delete the load balancer using <a>DeleteLoadBalancer</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Delete the target group using <a>DeleteTargetGroup</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat
 * an operation, it succeeds.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticLoadBalancingAsyncClient extends AmazonElasticLoadBalancingClient implements AmazonElasticLoadBalancingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2. A credentials
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
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2. A credentials
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
     *        The client configuration options controlling how this client connects to Elastic Load Balancing v2 (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the provided
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
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticLoadBalancingAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticLoadBalancingAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonElasticLoadBalancingAsyncClientBuilder asyncBuilder() {
        return AmazonElasticLoadBalancingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Elastic Load Balancing v2 using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonElasticLoadBalancingAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddListenerCertificatesResult> addListenerCertificatesAsync(AddListenerCertificatesRequest request) {

        return addListenerCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddListenerCertificatesResult> addListenerCertificatesAsync(final AddListenerCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddListenerCertificatesRequest, AddListenerCertificatesResult> asyncHandler) {
        final AddListenerCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddListenerCertificatesResult>() {
            @Override
            public AddListenerCertificatesResult call() throws Exception {
                AddListenerCertificatesResult result = null;

                try {
                    result = executeAddListenerCertificates(finalRequest);
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
    public java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest request) {

        return createListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResult> createListenerAsync(final CreateListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler) {
        final CreateListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateListenerResult>() {
            @Override
            public CreateListenerResult call() throws Exception {
                CreateListenerResult result = null;

                try {
                    result = executeCreateListener(finalRequest);
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
    public java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest request) {

        return createLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(final CreateLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler) {
        final CreateLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoadBalancerResult>() {
            @Override
            public CreateLoadBalancerResult call() throws Exception {
                CreateLoadBalancerResult result = null;

                try {
                    result = executeCreateLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {
        final CreateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleResult>() {
            @Override
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result = null;

                try {
                    result = executeCreateRule(finalRequest);
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
    public java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest request) {

        return createTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(final CreateTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTargetGroupRequest, CreateTargetGroupResult> asyncHandler) {
        final CreateTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTargetGroupResult>() {
            @Override
            public CreateTargetGroupResult call() throws Exception {
                CreateTargetGroupResult result = null;

                try {
                    result = executeCreateTargetGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest request) {

        return deleteListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(final DeleteListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler) {
        final DeleteListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteListenerResult>() {
            @Override
            public DeleteListenerResult call() throws Exception {
                DeleteListenerResult result = null;

                try {
                    result = executeDeleteListener(finalRequest);
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
    public java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {

        return deleteLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(final DeleteLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler) {
        final DeleteLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoadBalancerResult>() {
            @Override
            public DeleteLoadBalancerResult call() throws Exception {
                DeleteLoadBalancerResult result = null;

                try {
                    result = executeDeleteLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest request) {

        return deleteTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(final DeleteTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTargetGroupRequest, DeleteTargetGroupResult> asyncHandler) {
        final DeleteTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTargetGroupResult>() {
            @Override
            public DeleteTargetGroupResult call() throws Exception {
                DeleteTargetGroupResult result = null;

                try {
                    result = executeDeleteTargetGroup(finalRequest);
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
    public java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest request) {

        return deregisterTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(final DeregisterTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTargetsRequest, DeregisterTargetsResult> asyncHandler) {
        final DeregisterTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTargetsResult>() {
            @Override
            public DeregisterTargetsResult call() throws Exception {
                DeregisterTargetsResult result = null;

                try {
                    result = executeDeregisterTargets(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(final DescribeAccountLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {
        final DescribeAccountLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountLimitsResult>() {
            @Override
            public DescribeAccountLimitsResult call() throws Exception {
                DescribeAccountLimitsResult result = null;

                try {
                    result = executeDescribeAccountLimits(finalRequest);
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
    public java.util.concurrent.Future<DescribeListenerCertificatesResult> describeListenerCertificatesAsync(DescribeListenerCertificatesRequest request) {

        return describeListenerCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeListenerCertificatesResult> describeListenerCertificatesAsync(final DescribeListenerCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeListenerCertificatesRequest, DescribeListenerCertificatesResult> asyncHandler) {
        final DescribeListenerCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeListenerCertificatesResult>() {
            @Override
            public DescribeListenerCertificatesResult call() throws Exception {
                DescribeListenerCertificatesResult result = null;

                try {
                    result = executeDescribeListenerCertificates(finalRequest);
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
    public java.util.concurrent.Future<DescribeListenersResult> describeListenersAsync(DescribeListenersRequest request) {

        return describeListenersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeListenersResult> describeListenersAsync(final DescribeListenersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeListenersRequest, DescribeListenersResult> asyncHandler) {
        final DescribeListenersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeListenersResult>() {
            @Override
            public DescribeListenersResult call() throws Exception {
                DescribeListenersResult result = null;

                try {
                    result = executeDescribeListeners(finalRequest);
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
    public java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(DescribeLoadBalancerAttributesRequest request) {

        return describeLoadBalancerAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            final DescribeLoadBalancerAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler) {
        final DescribeLoadBalancerAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoadBalancerAttributesResult>() {
            @Override
            public DescribeLoadBalancerAttributesResult call() throws Exception {
                DescribeLoadBalancerAttributesResult result = null;

                try {
                    result = executeDescribeLoadBalancerAttributes(finalRequest);
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
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest request) {

        return describeLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(final DescribeLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler) {
        final DescribeLoadBalancersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoadBalancersResult>() {
            @Override
            public DescribeLoadBalancersResult call() throws Exception {
                DescribeLoadBalancersResult result = null;

                try {
                    result = executeDescribeLoadBalancers(finalRequest);
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
    public java.util.concurrent.Future<DescribeRulesResult> describeRulesAsync(DescribeRulesRequest request) {

        return describeRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesResult> describeRulesAsync(final DescribeRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRulesRequest, DescribeRulesResult> asyncHandler) {
        final DescribeRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRulesResult>() {
            @Override
            public DescribeRulesResult call() throws Exception {
                DescribeRulesResult result = null;

                try {
                    result = executeDescribeRules(finalRequest);
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
    public java.util.concurrent.Future<DescribeSSLPoliciesResult> describeSSLPoliciesAsync(DescribeSSLPoliciesRequest request) {

        return describeSSLPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSSLPoliciesResult> describeSSLPoliciesAsync(final DescribeSSLPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSSLPoliciesRequest, DescribeSSLPoliciesResult> asyncHandler) {
        final DescribeSSLPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSSLPoliciesResult>() {
            @Override
            public DescribeSSLPoliciesResult call() throws Exception {
                DescribeSSLPoliciesResult result = null;

                try {
                    result = executeDescribeSSLPolicies(finalRequest);
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
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {
        final DescribeTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;

                try {
                    result = executeDescribeTags(finalRequest);
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
    public java.util.concurrent.Future<DescribeTargetGroupAttributesResult> describeTargetGroupAttributesAsync(DescribeTargetGroupAttributesRequest request) {

        return describeTargetGroupAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTargetGroupAttributesResult> describeTargetGroupAttributesAsync(
            final DescribeTargetGroupAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTargetGroupAttributesRequest, DescribeTargetGroupAttributesResult> asyncHandler) {
        final DescribeTargetGroupAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTargetGroupAttributesResult>() {
            @Override
            public DescribeTargetGroupAttributesResult call() throws Exception {
                DescribeTargetGroupAttributesResult result = null;

                try {
                    result = executeDescribeTargetGroupAttributes(finalRequest);
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
    public java.util.concurrent.Future<DescribeTargetGroupsResult> describeTargetGroupsAsync(DescribeTargetGroupsRequest request) {

        return describeTargetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTargetGroupsResult> describeTargetGroupsAsync(final DescribeTargetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTargetGroupsRequest, DescribeTargetGroupsResult> asyncHandler) {
        final DescribeTargetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTargetGroupsResult>() {
            @Override
            public DescribeTargetGroupsResult call() throws Exception {
                DescribeTargetGroupsResult result = null;

                try {
                    result = executeDescribeTargetGroups(finalRequest);
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
    public java.util.concurrent.Future<DescribeTargetHealthResult> describeTargetHealthAsync(DescribeTargetHealthRequest request) {

        return describeTargetHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTargetHealthResult> describeTargetHealthAsync(final DescribeTargetHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTargetHealthRequest, DescribeTargetHealthResult> asyncHandler) {
        final DescribeTargetHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTargetHealthResult>() {
            @Override
            public DescribeTargetHealthResult call() throws Exception {
                DescribeTargetHealthResult result = null;

                try {
                    result = executeDescribeTargetHealth(finalRequest);
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
    public java.util.concurrent.Future<ModifyListenerResult> modifyListenerAsync(ModifyListenerRequest request) {

        return modifyListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyListenerResult> modifyListenerAsync(final ModifyListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyListenerRequest, ModifyListenerResult> asyncHandler) {
        final ModifyListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyListenerResult>() {
            @Override
            public ModifyListenerResult call() throws Exception {
                ModifyListenerResult result = null;

                try {
                    result = executeModifyListener(finalRequest);
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
    public java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(ModifyLoadBalancerAttributesRequest request) {

        return modifyLoadBalancerAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(final ModifyLoadBalancerAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler) {
        final ModifyLoadBalancerAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyLoadBalancerAttributesResult>() {
            @Override
            public ModifyLoadBalancerAttributesResult call() throws Exception {
                ModifyLoadBalancerAttributesResult result = null;

                try {
                    result = executeModifyLoadBalancerAttributes(finalRequest);
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
    public java.util.concurrent.Future<ModifyRuleResult> modifyRuleAsync(ModifyRuleRequest request) {

        return modifyRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyRuleResult> modifyRuleAsync(final ModifyRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyRuleRequest, ModifyRuleResult> asyncHandler) {
        final ModifyRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyRuleResult>() {
            @Override
            public ModifyRuleResult call() throws Exception {
                ModifyRuleResult result = null;

                try {
                    result = executeModifyRule(finalRequest);
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
    public java.util.concurrent.Future<ModifyTargetGroupResult> modifyTargetGroupAsync(ModifyTargetGroupRequest request) {

        return modifyTargetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyTargetGroupResult> modifyTargetGroupAsync(final ModifyTargetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyTargetGroupRequest, ModifyTargetGroupResult> asyncHandler) {
        final ModifyTargetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyTargetGroupResult>() {
            @Override
            public ModifyTargetGroupResult call() throws Exception {
                ModifyTargetGroupResult result = null;

                try {
                    result = executeModifyTargetGroup(finalRequest);
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
    public java.util.concurrent.Future<ModifyTargetGroupAttributesResult> modifyTargetGroupAttributesAsync(ModifyTargetGroupAttributesRequest request) {

        return modifyTargetGroupAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyTargetGroupAttributesResult> modifyTargetGroupAttributesAsync(final ModifyTargetGroupAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyTargetGroupAttributesRequest, ModifyTargetGroupAttributesResult> asyncHandler) {
        final ModifyTargetGroupAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyTargetGroupAttributesResult>() {
            @Override
            public ModifyTargetGroupAttributesResult call() throws Exception {
                ModifyTargetGroupAttributesResult result = null;

                try {
                    result = executeModifyTargetGroupAttributes(finalRequest);
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
    public java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest request) {

        return registerTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(final RegisterTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTargetsRequest, RegisterTargetsResult> asyncHandler) {
        final RegisterTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTargetsResult>() {
            @Override
            public RegisterTargetsResult call() throws Exception {
                RegisterTargetsResult result = null;

                try {
                    result = executeRegisterTargets(finalRequest);
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
    public java.util.concurrent.Future<RemoveListenerCertificatesResult> removeListenerCertificatesAsync(RemoveListenerCertificatesRequest request) {

        return removeListenerCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveListenerCertificatesResult> removeListenerCertificatesAsync(final RemoveListenerCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveListenerCertificatesRequest, RemoveListenerCertificatesResult> asyncHandler) {
        final RemoveListenerCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveListenerCertificatesResult>() {
            @Override
            public RemoveListenerCertificatesResult call() throws Exception {
                RemoveListenerCertificatesResult result = null;

                try {
                    result = executeRemoveListenerCertificates(finalRequest);
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
    public java.util.concurrent.Future<SetIpAddressTypeResult> setIpAddressTypeAsync(SetIpAddressTypeRequest request) {

        return setIpAddressTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIpAddressTypeResult> setIpAddressTypeAsync(final SetIpAddressTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIpAddressTypeRequest, SetIpAddressTypeResult> asyncHandler) {
        final SetIpAddressTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIpAddressTypeResult>() {
            @Override
            public SetIpAddressTypeResult call() throws Exception {
                SetIpAddressTypeResult result = null;

                try {
                    result = executeSetIpAddressType(finalRequest);
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
    public java.util.concurrent.Future<SetRulePrioritiesResult> setRulePrioritiesAsync(SetRulePrioritiesRequest request) {

        return setRulePrioritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetRulePrioritiesResult> setRulePrioritiesAsync(final SetRulePrioritiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetRulePrioritiesRequest, SetRulePrioritiesResult> asyncHandler) {
        final SetRulePrioritiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetRulePrioritiesResult>() {
            @Override
            public SetRulePrioritiesResult call() throws Exception {
                SetRulePrioritiesResult result = null;

                try {
                    result = executeSetRulePriorities(finalRequest);
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
    public java.util.concurrent.Future<SetSecurityGroupsResult> setSecurityGroupsAsync(SetSecurityGroupsRequest request) {

        return setSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSecurityGroupsResult> setSecurityGroupsAsync(final SetSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetSecurityGroupsRequest, SetSecurityGroupsResult> asyncHandler) {
        final SetSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetSecurityGroupsResult>() {
            @Override
            public SetSecurityGroupsResult call() throws Exception {
                SetSecurityGroupsResult result = null;

                try {
                    result = executeSetSecurityGroups(finalRequest);
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
    public java.util.concurrent.Future<SetSubnetsResult> setSubnetsAsync(SetSubnetsRequest request) {

        return setSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSubnetsResult> setSubnetsAsync(final SetSubnetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetSubnetsRequest, SetSubnetsResult> asyncHandler) {
        final SetSubnetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetSubnetsResult>() {
            @Override
            public SetSubnetsResult call() throws Exception {
                SetSubnetsResult result = null;

                try {
                    result = executeSetSubnets(finalRequest);
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
