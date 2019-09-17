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
package com.amazonaws.services.route53;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Route 53 asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Route 53 is a highly available and scalable Domain Name System (DNS) web service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRoute53AsyncClient extends AmazonRoute53Client implements AmazonRoute53Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53. A credentials provider chain will be
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
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRoute53AsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to Route 53 (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the provided AWS account
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
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRoute53AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRoute53AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonRoute53AsyncClientBuilder asyncBuilder() {
        return AmazonRoute53AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRoute53AsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(AssociateVPCWithHostedZoneRequest request) {

        return associateVPCWithHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(final AssociateVPCWithHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler) {
        final AssociateVPCWithHostedZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateVPCWithHostedZoneResult>() {
            @Override
            public AssociateVPCWithHostedZoneResult call() throws Exception {
                AssociateVPCWithHostedZoneResult result = null;

                try {
                    result = executeAssociateVPCWithHostedZone(finalRequest);
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
    public java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest request) {

        return changeResourceRecordSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(final ChangeResourceRecordSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler) {
        final ChangeResourceRecordSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangeResourceRecordSetsResult>() {
            @Override
            public ChangeResourceRecordSetsResult call() throws Exception {
                ChangeResourceRecordSetsResult result = null;

                try {
                    result = executeChangeResourceRecordSets(finalRequest);
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
    public java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest request) {

        return changeTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(final ChangeTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler) {
        final ChangeTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangeTagsForResourceResult>() {
            @Override
            public ChangeTagsForResourceResult call() throws Exception {
                ChangeTagsForResourceResult result = null;

                try {
                    result = executeChangeTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest request) {

        return createHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(final CreateHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler) {
        final CreateHealthCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHealthCheckResult>() {
            @Override
            public CreateHealthCheckResult call() throws Exception {
                CreateHealthCheckResult result = null;

                try {
                    result = executeCreateHealthCheck(finalRequest);
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
    public java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest request) {

        return createHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(final CreateHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler) {
        final CreateHostedZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHostedZoneResult>() {
            @Override
            public CreateHostedZoneResult call() throws Exception {
                CreateHostedZoneResult result = null;

                try {
                    result = executeCreateHostedZone(finalRequest);
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
    public java.util.concurrent.Future<CreateQueryLoggingConfigResult> createQueryLoggingConfigAsync(CreateQueryLoggingConfigRequest request) {

        return createQueryLoggingConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueryLoggingConfigResult> createQueryLoggingConfigAsync(final CreateQueryLoggingConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueryLoggingConfigRequest, CreateQueryLoggingConfigResult> asyncHandler) {
        final CreateQueryLoggingConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueryLoggingConfigResult>() {
            @Override
            public CreateQueryLoggingConfigResult call() throws Exception {
                CreateQueryLoggingConfigResult result = null;

                try {
                    result = executeCreateQueryLoggingConfig(finalRequest);
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
    public java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(CreateReusableDelegationSetRequest request) {

        return createReusableDelegationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(final CreateReusableDelegationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler) {
        final CreateReusableDelegationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReusableDelegationSetResult>() {
            @Override
            public CreateReusableDelegationSetResult call() throws Exception {
                CreateReusableDelegationSetResult result = null;

                try {
                    result = executeCreateReusableDelegationSet(finalRequest);
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
    public java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest request) {

        return createTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(final CreateTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler) {
        final CreateTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyResult>() {
            @Override
            public CreateTrafficPolicyResult call() throws Exception {
                CreateTrafficPolicyResult result = null;

                try {
                    result = executeCreateTrafficPolicy(finalRequest);
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
    public java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(CreateTrafficPolicyInstanceRequest request) {

        return createTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(final CreateTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyInstanceRequest, CreateTrafficPolicyInstanceResult> asyncHandler) {
        final CreateTrafficPolicyInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyInstanceResult>() {
            @Override
            public CreateTrafficPolicyInstanceResult call() throws Exception {
                CreateTrafficPolicyInstanceResult result = null;

                try {
                    result = executeCreateTrafficPolicyInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(CreateTrafficPolicyVersionRequest request) {

        return createTrafficPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(final CreateTrafficPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyVersionRequest, CreateTrafficPolicyVersionResult> asyncHandler) {
        final CreateTrafficPolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyVersionResult>() {
            @Override
            public CreateTrafficPolicyVersionResult call() throws Exception {
                CreateTrafficPolicyVersionResult result = null;

                try {
                    result = executeCreateTrafficPolicyVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateVPCAssociationAuthorizationResult> createVPCAssociationAuthorizationAsync(
            CreateVPCAssociationAuthorizationRequest request) {

        return createVPCAssociationAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVPCAssociationAuthorizationResult> createVPCAssociationAuthorizationAsync(
            final CreateVPCAssociationAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVPCAssociationAuthorizationRequest, CreateVPCAssociationAuthorizationResult> asyncHandler) {
        final CreateVPCAssociationAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVPCAssociationAuthorizationResult>() {
            @Override
            public CreateVPCAssociationAuthorizationResult call() throws Exception {
                CreateVPCAssociationAuthorizationResult result = null;

                try {
                    result = executeCreateVPCAssociationAuthorization(finalRequest);
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
    public java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest request) {

        return deleteHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(final DeleteHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler) {
        final DeleteHealthCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHealthCheckResult>() {
            @Override
            public DeleteHealthCheckResult call() throws Exception {
                DeleteHealthCheckResult result = null;

                try {
                    result = executeDeleteHealthCheck(finalRequest);
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
    public java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest request) {

        return deleteHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(final DeleteHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler) {
        final DeleteHostedZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHostedZoneResult>() {
            @Override
            public DeleteHostedZoneResult call() throws Exception {
                DeleteHostedZoneResult result = null;

                try {
                    result = executeDeleteHostedZone(finalRequest);
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
    public java.util.concurrent.Future<DeleteQueryLoggingConfigResult> deleteQueryLoggingConfigAsync(DeleteQueryLoggingConfigRequest request) {

        return deleteQueryLoggingConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueryLoggingConfigResult> deleteQueryLoggingConfigAsync(final DeleteQueryLoggingConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueryLoggingConfigRequest, DeleteQueryLoggingConfigResult> asyncHandler) {
        final DeleteQueryLoggingConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueryLoggingConfigResult>() {
            @Override
            public DeleteQueryLoggingConfigResult call() throws Exception {
                DeleteQueryLoggingConfigResult result = null;

                try {
                    result = executeDeleteQueryLoggingConfig(finalRequest);
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
    public java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(DeleteReusableDelegationSetRequest request) {

        return deleteReusableDelegationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(final DeleteReusableDelegationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler) {
        final DeleteReusableDelegationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReusableDelegationSetResult>() {
            @Override
            public DeleteReusableDelegationSetResult call() throws Exception {
                DeleteReusableDelegationSetResult result = null;

                try {
                    result = executeDeleteReusableDelegationSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest request) {

        return deleteTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(final DeleteTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler) {
        final DeleteTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrafficPolicyResult>() {
            @Override
            public DeleteTrafficPolicyResult call() throws Exception {
                DeleteTrafficPolicyResult result = null;

                try {
                    result = executeDeleteTrafficPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(DeleteTrafficPolicyInstanceRequest request) {

        return deleteTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(final DeleteTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyInstanceRequest, DeleteTrafficPolicyInstanceResult> asyncHandler) {
        final DeleteTrafficPolicyInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrafficPolicyInstanceResult>() {
            @Override
            public DeleteTrafficPolicyInstanceResult call() throws Exception {
                DeleteTrafficPolicyInstanceResult result = null;

                try {
                    result = executeDeleteTrafficPolicyInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteVPCAssociationAuthorizationResult> deleteVPCAssociationAuthorizationAsync(
            DeleteVPCAssociationAuthorizationRequest request) {

        return deleteVPCAssociationAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVPCAssociationAuthorizationResult> deleteVPCAssociationAuthorizationAsync(
            final DeleteVPCAssociationAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVPCAssociationAuthorizationRequest, DeleteVPCAssociationAuthorizationResult> asyncHandler) {
        final DeleteVPCAssociationAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVPCAssociationAuthorizationResult>() {
            @Override
            public DeleteVPCAssociationAuthorizationResult call() throws Exception {
                DeleteVPCAssociationAuthorizationResult result = null;

                try {
                    result = executeDeleteVPCAssociationAuthorization(finalRequest);
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
    public java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(DisassociateVPCFromHostedZoneRequest request) {

        return disassociateVPCFromHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            final DisassociateVPCFromHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler) {
        final DisassociateVPCFromHostedZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateVPCFromHostedZoneResult>() {
            @Override
            public DisassociateVPCFromHostedZoneResult call() throws Exception {
                DisassociateVPCFromHostedZoneResult result = null;

                try {
                    result = executeDisassociateVPCFromHostedZone(finalRequest);
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
    public java.util.concurrent.Future<GetAccountLimitResult> getAccountLimitAsync(GetAccountLimitRequest request) {

        return getAccountLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountLimitResult> getAccountLimitAsync(final GetAccountLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountLimitRequest, GetAccountLimitResult> asyncHandler) {
        final GetAccountLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountLimitResult>() {
            @Override
            public GetAccountLimitResult call() throws Exception {
                GetAccountLimitResult result = null;

                try {
                    result = executeGetAccountLimit(finalRequest);
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
    public java.util.concurrent.Future<GetChangeResult> getChangeAsync(GetChangeRequest request) {

        return getChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeResult> getChangeAsync(final GetChangeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler) {
        final GetChangeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChangeResult>() {
            @Override
            public GetChangeResult call() throws Exception {
                GetChangeResult result = null;

                try {
                    result = executeGetChange(finalRequest);
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
    public java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest request) {

        return getCheckerIpRangesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(final GetCheckerIpRangesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler) {
        final GetCheckerIpRangesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCheckerIpRangesResult>() {
            @Override
            public GetCheckerIpRangesResult call() throws Exception {
                GetCheckerIpRangesResult result = null;

                try {
                    result = executeGetCheckerIpRanges(finalRequest);
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
     * Simplified method form for invoking the GetCheckerIpRanges operation.
     *
     * @see #getCheckerIpRangesAsync(GetCheckerIpRangesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync() {

        return getCheckerIpRangesAsync(new GetCheckerIpRangesRequest());
    }

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation with an AsyncHandler.
     *
     * @see #getCheckerIpRangesAsync(GetCheckerIpRangesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(
            com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler) {

        return getCheckerIpRangesAsync(new GetCheckerIpRangesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(GetGeoLocationRequest request) {

        return getGeoLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(final GetGeoLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler) {
        final GetGeoLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGeoLocationResult>() {
            @Override
            public GetGeoLocationResult call() throws Exception {
                GetGeoLocationResult result = null;

                try {
                    result = executeGetGeoLocation(finalRequest);
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
     * Simplified method form for invoking the GetGeoLocation operation.
     *
     * @see #getGeoLocationAsync(GetGeoLocationRequest)
     */
    @Override
    public java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync() {

        return getGeoLocationAsync(new GetGeoLocationRequest());
    }

    /**
     * Simplified method form for invoking the GetGeoLocation operation with an AsyncHandler.
     *
     * @see #getGeoLocationAsync(GetGeoLocationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(
            com.amazonaws.handlers.AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler) {

        return getGeoLocationAsync(new GetGeoLocationRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest request) {

        return getHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(final GetHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthCheckRequest, GetHealthCheckResult> asyncHandler) {
        final GetHealthCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckResult>() {
            @Override
            public GetHealthCheckResult call() throws Exception {
                GetHealthCheckResult result = null;

                try {
                    result = executeGetHealthCheck(finalRequest);
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
    public java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest request) {

        return getHealthCheckCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(final GetHealthCheckCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler) {
        final GetHealthCheckCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckCountResult>() {
            @Override
            public GetHealthCheckCountResult call() throws Exception {
                GetHealthCheckCountResult result = null;

                try {
                    result = executeGetHealthCheckCount(finalRequest);
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
     * Simplified method form for invoking the GetHealthCheckCount operation.
     *
     * @see #getHealthCheckCountAsync(GetHealthCheckCountRequest)
     */
    @Override
    public java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync() {

        return getHealthCheckCountAsync(new GetHealthCheckCountRequest());
    }

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation with an AsyncHandler.
     *
     * @see #getHealthCheckCountAsync(GetHealthCheckCountRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler) {

        return getHealthCheckCountAsync(new GetHealthCheckCountRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest request) {

        return getHealthCheckLastFailureReasonAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            final GetHealthCheckLastFailureReasonRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthCheckLastFailureReasonRequest, GetHealthCheckLastFailureReasonResult> asyncHandler) {
        final GetHealthCheckLastFailureReasonRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckLastFailureReasonResult>() {
            @Override
            public GetHealthCheckLastFailureReasonResult call() throws Exception {
                GetHealthCheckLastFailureReasonResult result = null;

                try {
                    result = executeGetHealthCheckLastFailureReason(finalRequest);
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
    public java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest request) {

        return getHealthCheckStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(final GetHealthCheckStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler) {
        final GetHealthCheckStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckStatusResult>() {
            @Override
            public GetHealthCheckStatusResult call() throws Exception {
                GetHealthCheckStatusResult result = null;

                try {
                    result = executeGetHealthCheckStatus(finalRequest);
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
    public java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest request) {

        return getHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(final GetHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler) {
        final GetHostedZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostedZoneResult>() {
            @Override
            public GetHostedZoneResult call() throws Exception {
                GetHostedZoneResult result = null;

                try {
                    result = executeGetHostedZone(finalRequest);
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
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest request) {

        return getHostedZoneCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(final GetHostedZoneCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler) {
        final GetHostedZoneCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostedZoneCountResult>() {
            @Override
            public GetHostedZoneCountResult call() throws Exception {
                GetHostedZoneCountResult result = null;

                try {
                    result = executeGetHostedZoneCount(finalRequest);
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
     * Simplified method form for invoking the GetHostedZoneCount operation.
     *
     * @see #getHostedZoneCountAsync(GetHostedZoneCountRequest)
     */
    @Override
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync() {

        return getHostedZoneCountAsync(new GetHostedZoneCountRequest());
    }

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation with an AsyncHandler.
     *
     * @see #getHostedZoneCountAsync(GetHostedZoneCountRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler) {

        return getHostedZoneCountAsync(new GetHostedZoneCountRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetHostedZoneLimitResult> getHostedZoneLimitAsync(GetHostedZoneLimitRequest request) {

        return getHostedZoneLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostedZoneLimitResult> getHostedZoneLimitAsync(final GetHostedZoneLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostedZoneLimitRequest, GetHostedZoneLimitResult> asyncHandler) {
        final GetHostedZoneLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostedZoneLimitResult>() {
            @Override
            public GetHostedZoneLimitResult call() throws Exception {
                GetHostedZoneLimitResult result = null;

                try {
                    result = executeGetHostedZoneLimit(finalRequest);
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
    public java.util.concurrent.Future<GetQueryLoggingConfigResult> getQueryLoggingConfigAsync(GetQueryLoggingConfigRequest request) {

        return getQueryLoggingConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryLoggingConfigResult> getQueryLoggingConfigAsync(final GetQueryLoggingConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryLoggingConfigRequest, GetQueryLoggingConfigResult> asyncHandler) {
        final GetQueryLoggingConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryLoggingConfigResult>() {
            @Override
            public GetQueryLoggingConfigResult call() throws Exception {
                GetQueryLoggingConfigResult result = null;

                try {
                    result = executeGetQueryLoggingConfig(finalRequest);
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
    public java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest request) {

        return getReusableDelegationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(final GetReusableDelegationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler) {
        final GetReusableDelegationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReusableDelegationSetResult>() {
            @Override
            public GetReusableDelegationSetResult call() throws Exception {
                GetReusableDelegationSetResult result = null;

                try {
                    result = executeGetReusableDelegationSet(finalRequest);
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
    public java.util.concurrent.Future<GetReusableDelegationSetLimitResult> getReusableDelegationSetLimitAsync(GetReusableDelegationSetLimitRequest request) {

        return getReusableDelegationSetLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReusableDelegationSetLimitResult> getReusableDelegationSetLimitAsync(
            final GetReusableDelegationSetLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetLimitRequest, GetReusableDelegationSetLimitResult> asyncHandler) {
        final GetReusableDelegationSetLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReusableDelegationSetLimitResult>() {
            @Override
            public GetReusableDelegationSetLimitResult call() throws Exception {
                GetReusableDelegationSetLimitResult result = null;

                try {
                    result = executeGetReusableDelegationSetLimit(finalRequest);
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
    public java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest request) {

        return getTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(final GetTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler) {
        final GetTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyResult>() {
            @Override
            public GetTrafficPolicyResult call() throws Exception {
                GetTrafficPolicyResult result = null;

                try {
                    result = executeGetTrafficPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest request) {

        return getTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(final GetTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceRequest, GetTrafficPolicyInstanceResult> asyncHandler) {
        final GetTrafficPolicyInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyInstanceResult>() {
            @Override
            public GetTrafficPolicyInstanceResult call() throws Exception {
                GetTrafficPolicyInstanceResult result = null;

                try {
                    result = executeGetTrafficPolicyInstance(finalRequest);
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
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest request) {

        return getTrafficPolicyInstanceCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            final GetTrafficPolicyInstanceCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler) {
        final GetTrafficPolicyInstanceCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyInstanceCountResult>() {
            @Override
            public GetTrafficPolicyInstanceCountResult call() throws Exception {
                GetTrafficPolicyInstanceCountResult result = null;

                try {
                    result = executeGetTrafficPolicyInstanceCount(finalRequest);
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
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount operation.
     *
     * @see #getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync() {

        return getTrafficPolicyInstanceCountAsync(new GetTrafficPolicyInstanceCountRequest());
    }

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount operation with an AsyncHandler.
     *
     * @see #getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler) {

        return getTrafficPolicyInstanceCountAsync(new GetTrafficPolicyInstanceCountRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest request) {

        return listGeoLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(final ListGeoLocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler) {
        final ListGeoLocationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGeoLocationsResult>() {
            @Override
            public ListGeoLocationsResult call() throws Exception {
                ListGeoLocationsResult result = null;

                try {
                    result = executeListGeoLocations(finalRequest);
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
     * Simplified method form for invoking the ListGeoLocations operation.
     *
     * @see #listGeoLocationsAsync(ListGeoLocationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync() {

        return listGeoLocationsAsync(new ListGeoLocationsRequest());
    }

    /**
     * Simplified method form for invoking the ListGeoLocations operation with an AsyncHandler.
     *
     * @see #listGeoLocationsAsync(ListGeoLocationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler) {

        return listGeoLocationsAsync(new ListGeoLocationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(ListHealthChecksRequest request) {

        return listHealthChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(final ListHealthChecksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler) {
        final ListHealthChecksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHealthChecksResult>() {
            @Override
            public ListHealthChecksResult call() throws Exception {
                ListHealthChecksResult result = null;

                try {
                    result = executeListHealthChecks(finalRequest);
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
     * Simplified method form for invoking the ListHealthChecks operation.
     *
     * @see #listHealthChecksAsync(ListHealthChecksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync() {

        return listHealthChecksAsync(new ListHealthChecksRequest());
    }

    /**
     * Simplified method form for invoking the ListHealthChecks operation with an AsyncHandler.
     *
     * @see #listHealthChecksAsync(ListHealthChecksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(
            com.amazonaws.handlers.AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler) {

        return listHealthChecksAsync(new ListHealthChecksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(ListHostedZonesRequest request) {

        return listHostedZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(final ListHostedZonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler) {
        final ListHostedZonesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHostedZonesResult>() {
            @Override
            public ListHostedZonesResult call() throws Exception {
                ListHostedZonesResult result = null;

                try {
                    result = executeListHostedZones(finalRequest);
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
     * Simplified method form for invoking the ListHostedZones operation.
     *
     * @see #listHostedZonesAsync(ListHostedZonesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync() {

        return listHostedZonesAsync(new ListHostedZonesRequest());
    }

    /**
     * Simplified method form for invoking the ListHostedZones operation with an AsyncHandler.
     *
     * @see #listHostedZonesAsync(ListHostedZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler) {

        return listHostedZonesAsync(new ListHostedZonesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(ListHostedZonesByNameRequest request) {

        return listHostedZonesByNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(final ListHostedZonesByNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler) {
        final ListHostedZonesByNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHostedZonesByNameResult>() {
            @Override
            public ListHostedZonesByNameResult call() throws Exception {
                ListHostedZonesByNameResult result = null;

                try {
                    result = executeListHostedZonesByName(finalRequest);
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
     * Simplified method form for invoking the ListHostedZonesByName operation.
     *
     * @see #listHostedZonesByNameAsync(ListHostedZonesByNameRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync() {

        return listHostedZonesByNameAsync(new ListHostedZonesByNameRequest());
    }

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation with an AsyncHandler.
     *
     * @see #listHostedZonesByNameAsync(ListHostedZonesByNameRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler) {

        return listHostedZonesByNameAsync(new ListHostedZonesByNameRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListQueryLoggingConfigsResult> listQueryLoggingConfigsAsync(ListQueryLoggingConfigsRequest request) {

        return listQueryLoggingConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueryLoggingConfigsResult> listQueryLoggingConfigsAsync(final ListQueryLoggingConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueryLoggingConfigsRequest, ListQueryLoggingConfigsResult> asyncHandler) {
        final ListQueryLoggingConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueryLoggingConfigsResult>() {
            @Override
            public ListQueryLoggingConfigsResult call() throws Exception {
                ListQueryLoggingConfigsResult result = null;

                try {
                    result = executeListQueryLoggingConfigs(finalRequest);
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
    public java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest request) {

        return listResourceRecordSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(final ListResourceRecordSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler) {
        final ListResourceRecordSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceRecordSetsResult>() {
            @Override
            public ListResourceRecordSetsResult call() throws Exception {
                ListResourceRecordSetsResult result = null;

                try {
                    result = executeListResourceRecordSets(finalRequest);
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
    public java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest request) {

        return listReusableDelegationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(final ListReusableDelegationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler) {
        final ListReusableDelegationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReusableDelegationSetsResult>() {
            @Override
            public ListReusableDelegationSetsResult call() throws Exception {
                ListReusableDelegationSetsResult result = null;

                try {
                    result = executeListReusableDelegationSets(finalRequest);
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
     * Simplified method form for invoking the ListReusableDelegationSets operation.
     *
     * @see #listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync() {

        return listReusableDelegationSetsAsync(new ListReusableDelegationSetsRequest());
    }

    /**
     * Simplified method form for invoking the ListReusableDelegationSets operation with an AsyncHandler.
     *
     * @see #listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler) {

        return listReusableDelegationSetsAsync(new ListReusableDelegationSetsRequest(), asyncHandler);
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
    public java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest request) {

        return listTagsForResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(final ListTagsForResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler) {
        final ListTagsForResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourcesResult>() {
            @Override
            public ListTagsForResourcesResult call() throws Exception {
                ListTagsForResourcesResult result = null;

                try {
                    result = executeListTagsForResources(finalRequest);
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
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest request) {

        return listTrafficPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(final ListTrafficPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler) {
        final ListTrafficPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPoliciesResult>() {
            @Override
            public ListTrafficPoliciesResult call() throws Exception {
                ListTrafficPoliciesResult result = null;

                try {
                    result = executeListTrafficPolicies(finalRequest);
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
     * Simplified method form for invoking the ListTrafficPolicies operation.
     *
     * @see #listTrafficPoliciesAsync(ListTrafficPoliciesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync() {

        return listTrafficPoliciesAsync(new ListTrafficPoliciesRequest());
    }

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation with an AsyncHandler.
     *
     * @see #listTrafficPoliciesAsync(ListTrafficPoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler) {

        return listTrafficPoliciesAsync(new ListTrafficPoliciesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest request) {

        return listTrafficPolicyInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(final ListTrafficPolicyInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler) {
        final ListTrafficPolicyInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyInstancesResult>() {
            @Override
            public ListTrafficPolicyInstancesResult call() throws Exception {
                ListTrafficPolicyInstancesResult result = null;

                try {
                    result = executeListTrafficPolicyInstances(finalRequest);
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
     * Simplified method form for invoking the ListTrafficPolicyInstances operation.
     *
     * @see #listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync() {

        return listTrafficPolicyInstancesAsync(new ListTrafficPolicyInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances operation with an AsyncHandler.
     *
     * @see #listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler) {

        return listTrafficPolicyInstancesAsync(new ListTrafficPolicyInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            ListTrafficPolicyInstancesByHostedZoneRequest request) {

        return listTrafficPolicyInstancesByHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            final ListTrafficPolicyInstancesByHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByHostedZoneRequest, ListTrafficPolicyInstancesByHostedZoneResult> asyncHandler) {
        final ListTrafficPolicyInstancesByHostedZoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyInstancesByHostedZoneResult>() {
            @Override
            public ListTrafficPolicyInstancesByHostedZoneResult call() throws Exception {
                ListTrafficPolicyInstancesByHostedZoneResult result = null;

                try {
                    result = executeListTrafficPolicyInstancesByHostedZone(finalRequest);
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
    public java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest request) {

        return listTrafficPolicyInstancesByPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            final ListTrafficPolicyInstancesByPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByPolicyRequest, ListTrafficPolicyInstancesByPolicyResult> asyncHandler) {
        final ListTrafficPolicyInstancesByPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyInstancesByPolicyResult>() {
            @Override
            public ListTrafficPolicyInstancesByPolicyResult call() throws Exception {
                ListTrafficPolicyInstancesByPolicyResult result = null;

                try {
                    result = executeListTrafficPolicyInstancesByPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(ListTrafficPolicyVersionsRequest request) {

        return listTrafficPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(final ListTrafficPolicyVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyVersionsRequest, ListTrafficPolicyVersionsResult> asyncHandler) {
        final ListTrafficPolicyVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyVersionsResult>() {
            @Override
            public ListTrafficPolicyVersionsResult call() throws Exception {
                ListTrafficPolicyVersionsResult result = null;

                try {
                    result = executeListTrafficPolicyVersions(finalRequest);
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
    public java.util.concurrent.Future<ListVPCAssociationAuthorizationsResult> listVPCAssociationAuthorizationsAsync(
            ListVPCAssociationAuthorizationsRequest request) {

        return listVPCAssociationAuthorizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVPCAssociationAuthorizationsResult> listVPCAssociationAuthorizationsAsync(
            final ListVPCAssociationAuthorizationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVPCAssociationAuthorizationsRequest, ListVPCAssociationAuthorizationsResult> asyncHandler) {
        final ListVPCAssociationAuthorizationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVPCAssociationAuthorizationsResult>() {
            @Override
            public ListVPCAssociationAuthorizationsResult call() throws Exception {
                ListVPCAssociationAuthorizationsResult result = null;

                try {
                    result = executeListVPCAssociationAuthorizations(finalRequest);
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
    public java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(TestDNSAnswerRequest request) {

        return testDNSAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(final TestDNSAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestDNSAnswerRequest, TestDNSAnswerResult> asyncHandler) {
        final TestDNSAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestDNSAnswerResult>() {
            @Override
            public TestDNSAnswerResult call() throws Exception {
                TestDNSAnswerResult result = null;

                try {
                    result = executeTestDNSAnswer(finalRequest);
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
    public java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest request) {

        return updateHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(final UpdateHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler) {
        final UpdateHealthCheckRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHealthCheckResult>() {
            @Override
            public UpdateHealthCheckResult call() throws Exception {
                UpdateHealthCheckResult result = null;

                try {
                    result = executeUpdateHealthCheck(finalRequest);
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
    public java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest request) {

        return updateHostedZoneCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(final UpdateHostedZoneCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler) {
        final UpdateHostedZoneCommentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHostedZoneCommentResult>() {
            @Override
            public UpdateHostedZoneCommentResult call() throws Exception {
                UpdateHostedZoneCommentResult result = null;

                try {
                    result = executeUpdateHostedZoneComment(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(UpdateTrafficPolicyCommentRequest request) {

        return updateTrafficPolicyCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(final UpdateTrafficPolicyCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyCommentRequest, UpdateTrafficPolicyCommentResult> asyncHandler) {
        final UpdateTrafficPolicyCommentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrafficPolicyCommentResult>() {
            @Override
            public UpdateTrafficPolicyCommentResult call() throws Exception {
                UpdateTrafficPolicyCommentResult result = null;

                try {
                    result = executeUpdateTrafficPolicyComment(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(UpdateTrafficPolicyInstanceRequest request) {

        return updateTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(final UpdateTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyInstanceRequest, UpdateTrafficPolicyInstanceResult> asyncHandler) {
        final UpdateTrafficPolicyInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrafficPolicyInstanceResult>() {
            @Override
            public UpdateTrafficPolicyInstanceResult call() throws Exception {
                UpdateTrafficPolicyInstanceResult result = null;

                try {
                    result = executeUpdateTrafficPolicyInstance(finalRequest);
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
