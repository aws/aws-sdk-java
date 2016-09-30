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
package com.amazonaws.services.route53;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Route 53 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
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
     */
    public AmazonRoute53AsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AmazonRoute53AsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonRoute53AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(AssociateVPCWithHostedZoneRequest request) {

        return associateVPCWithHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(final AssociateVPCWithHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssociateVPCWithHostedZoneResult>() {
            @Override
            public AssociateVPCWithHostedZoneResult call() throws Exception {
                AssociateVPCWithHostedZoneResult result;

                try {
                    result = associateVPCWithHostedZone(request);
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
    public java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest request) {

        return changeResourceRecordSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(final ChangeResourceRecordSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ChangeResourceRecordSetsResult>() {
            @Override
            public ChangeResourceRecordSetsResult call() throws Exception {
                ChangeResourceRecordSetsResult result;

                try {
                    result = changeResourceRecordSets(request);
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
    public java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest request) {

        return changeTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(final ChangeTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ChangeTagsForResourceResult>() {
            @Override
            public ChangeTagsForResourceResult call() throws Exception {
                ChangeTagsForResourceResult result;

                try {
                    result = changeTagsForResource(request);
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
    public java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest request) {

        return createHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(final CreateHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHealthCheckResult>() {
            @Override
            public CreateHealthCheckResult call() throws Exception {
                CreateHealthCheckResult result;

                try {
                    result = createHealthCheck(request);
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
    public java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest request) {

        return createHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(final CreateHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateHostedZoneResult>() {
            @Override
            public CreateHostedZoneResult call() throws Exception {
                CreateHostedZoneResult result;

                try {
                    result = createHostedZone(request);
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
    public java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(CreateReusableDelegationSetRequest request) {

        return createReusableDelegationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(final CreateReusableDelegationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReusableDelegationSetResult>() {
            @Override
            public CreateReusableDelegationSetResult call() throws Exception {
                CreateReusableDelegationSetResult result;

                try {
                    result = createReusableDelegationSet(request);
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
    public java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest request) {

        return createTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(final CreateTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyResult>() {
            @Override
            public CreateTrafficPolicyResult call() throws Exception {
                CreateTrafficPolicyResult result;

                try {
                    result = createTrafficPolicy(request);
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
    public java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(CreateTrafficPolicyInstanceRequest request) {

        return createTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(final CreateTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyInstanceRequest, CreateTrafficPolicyInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyInstanceResult>() {
            @Override
            public CreateTrafficPolicyInstanceResult call() throws Exception {
                CreateTrafficPolicyInstanceResult result;

                try {
                    result = createTrafficPolicyInstance(request);
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
    public java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(CreateTrafficPolicyVersionRequest request) {

        return createTrafficPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(final CreateTrafficPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyVersionRequest, CreateTrafficPolicyVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyVersionResult>() {
            @Override
            public CreateTrafficPolicyVersionResult call() throws Exception {
                CreateTrafficPolicyVersionResult result;

                try {
                    result = createTrafficPolicyVersion(request);
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
    public java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest request) {

        return deleteHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(final DeleteHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHealthCheckResult>() {
            @Override
            public DeleteHealthCheckResult call() throws Exception {
                DeleteHealthCheckResult result;

                try {
                    result = deleteHealthCheck(request);
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
    public java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest request) {

        return deleteHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(final DeleteHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHostedZoneResult>() {
            @Override
            public DeleteHostedZoneResult call() throws Exception {
                DeleteHostedZoneResult result;

                try {
                    result = deleteHostedZone(request);
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
    public java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(DeleteReusableDelegationSetRequest request) {

        return deleteReusableDelegationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(final DeleteReusableDelegationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReusableDelegationSetResult>() {
            @Override
            public DeleteReusableDelegationSetResult call() throws Exception {
                DeleteReusableDelegationSetResult result;

                try {
                    result = deleteReusableDelegationSet(request);
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
    public java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest request) {

        return deleteTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(final DeleteTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrafficPolicyResult>() {
            @Override
            public DeleteTrafficPolicyResult call() throws Exception {
                DeleteTrafficPolicyResult result;

                try {
                    result = deleteTrafficPolicy(request);
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
    public java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(DeleteTrafficPolicyInstanceRequest request) {

        return deleteTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(final DeleteTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyInstanceRequest, DeleteTrafficPolicyInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrafficPolicyInstanceResult>() {
            @Override
            public DeleteTrafficPolicyInstanceResult call() throws Exception {
                DeleteTrafficPolicyInstanceResult result;

                try {
                    result = deleteTrafficPolicyInstance(request);
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
    public java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(DisassociateVPCFromHostedZoneRequest request) {

        return disassociateVPCFromHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            final DisassociateVPCFromHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisassociateVPCFromHostedZoneResult>() {
            @Override
            public DisassociateVPCFromHostedZoneResult call() throws Exception {
                DisassociateVPCFromHostedZoneResult result;

                try {
                    result = disassociateVPCFromHostedZone(request);
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
    public java.util.concurrent.Future<GetChangeResult> getChangeAsync(GetChangeRequest request) {

        return getChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeResult> getChangeAsync(final GetChangeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetChangeResult>() {
            @Override
            public GetChangeResult call() throws Exception {
                GetChangeResult result;

                try {
                    result = getChange(request);
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
    @Deprecated
    public java.util.concurrent.Future<GetChangeDetailsResult> getChangeDetailsAsync(GetChangeDetailsRequest request) {

        return getChangeDetailsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetChangeDetailsResult> getChangeDetailsAsync(final GetChangeDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangeDetailsRequest, GetChangeDetailsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetChangeDetailsResult>() {
            @Override
            public GetChangeDetailsResult call() throws Exception {
                GetChangeDetailsResult result;

                try {
                    result = getChangeDetails(request);
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
    public java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest request) {

        return getCheckerIpRangesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(final GetCheckerIpRangesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCheckerIpRangesResult>() {
            @Override
            public GetCheckerIpRangesResult call() throws Exception {
                GetCheckerIpRangesResult result;

                try {
                    result = getCheckerIpRanges(request);
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

        return executorService.submit(new java.util.concurrent.Callable<GetGeoLocationResult>() {
            @Override
            public GetGeoLocationResult call() throws Exception {
                GetGeoLocationResult result;

                try {
                    result = getGeoLocation(request);
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

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckResult>() {
            @Override
            public GetHealthCheckResult call() throws Exception {
                GetHealthCheckResult result;

                try {
                    result = getHealthCheck(request);
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
    public java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest request) {

        return getHealthCheckCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(final GetHealthCheckCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckCountResult>() {
            @Override
            public GetHealthCheckCountResult call() throws Exception {
                GetHealthCheckCountResult result;

                try {
                    result = getHealthCheckCount(request);
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

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckLastFailureReasonResult>() {
            @Override
            public GetHealthCheckLastFailureReasonResult call() throws Exception {
                GetHealthCheckLastFailureReasonResult result;

                try {
                    result = getHealthCheckLastFailureReason(request);
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
    public java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest request) {

        return getHealthCheckStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(final GetHealthCheckStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetHealthCheckStatusResult>() {
            @Override
            public GetHealthCheckStatusResult call() throws Exception {
                GetHealthCheckStatusResult result;

                try {
                    result = getHealthCheckStatus(request);
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
    public java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest request) {

        return getHostedZoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(final GetHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetHostedZoneResult>() {
            @Override
            public GetHostedZoneResult call() throws Exception {
                GetHostedZoneResult result;

                try {
                    result = getHostedZone(request);
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
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest request) {

        return getHostedZoneCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(final GetHostedZoneCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetHostedZoneCountResult>() {
            @Override
            public GetHostedZoneCountResult call() throws Exception {
                GetHostedZoneCountResult result;

                try {
                    result = getHostedZoneCount(request);
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
    public java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler) {

        return getHostedZoneCountAsync(new GetHostedZoneCountRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest request) {

        return getReusableDelegationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(final GetReusableDelegationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetReusableDelegationSetResult>() {
            @Override
            public GetReusableDelegationSetResult call() throws Exception {
                GetReusableDelegationSetResult result;

                try {
                    result = getReusableDelegationSet(request);
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
    public java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest request) {

        return getTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(final GetTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyResult>() {
            @Override
            public GetTrafficPolicyResult call() throws Exception {
                GetTrafficPolicyResult result;

                try {
                    result = getTrafficPolicy(request);
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
    public java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest request) {

        return getTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(final GetTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceRequest, GetTrafficPolicyInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyInstanceResult>() {
            @Override
            public GetTrafficPolicyInstanceResult call() throws Exception {
                GetTrafficPolicyInstanceResult result;

                try {
                    result = getTrafficPolicyInstance(request);
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
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest request) {

        return getTrafficPolicyInstanceCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            final GetTrafficPolicyInstanceCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyInstanceCountResult>() {
            @Override
            public GetTrafficPolicyInstanceCountResult call() throws Exception {
                GetTrafficPolicyInstanceCountResult result;

                try {
                    result = getTrafficPolicyInstanceCount(request);
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
    public java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler) {

        return getTrafficPolicyInstanceCountAsync(new GetTrafficPolicyInstanceCountRequest(), asyncHandler);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListChangeBatchesByHostedZoneResult> listChangeBatchesByHostedZoneAsync(ListChangeBatchesByHostedZoneRequest request) {

        return listChangeBatchesByHostedZoneAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListChangeBatchesByHostedZoneResult> listChangeBatchesByHostedZoneAsync(
            final ListChangeBatchesByHostedZoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChangeBatchesByHostedZoneRequest, ListChangeBatchesByHostedZoneResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListChangeBatchesByHostedZoneResult>() {
            @Override
            public ListChangeBatchesByHostedZoneResult call() throws Exception {
                ListChangeBatchesByHostedZoneResult result;

                try {
                    result = listChangeBatchesByHostedZone(request);
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
    @Deprecated
    public java.util.concurrent.Future<ListChangeBatchesByRRSetResult> listChangeBatchesByRRSetAsync(ListChangeBatchesByRRSetRequest request) {

        return listChangeBatchesByRRSetAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListChangeBatchesByRRSetResult> listChangeBatchesByRRSetAsync(final ListChangeBatchesByRRSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChangeBatchesByRRSetRequest, ListChangeBatchesByRRSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListChangeBatchesByRRSetResult>() {
            @Override
            public ListChangeBatchesByRRSetResult call() throws Exception {
                ListChangeBatchesByRRSetResult result;

                try {
                    result = listChangeBatchesByRRSet(request);
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
    public java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest request) {

        return listGeoLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(final ListGeoLocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListGeoLocationsResult>() {
            @Override
            public ListGeoLocationsResult call() throws Exception {
                ListGeoLocationsResult result;

                try {
                    result = listGeoLocations(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListHealthChecksResult>() {
            @Override
            public ListHealthChecksResult call() throws Exception {
                ListHealthChecksResult result;

                try {
                    result = listHealthChecks(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListHostedZonesResult>() {
            @Override
            public ListHostedZonesResult call() throws Exception {
                ListHostedZonesResult result;

                try {
                    result = listHostedZones(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListHostedZonesByNameResult>() {
            @Override
            public ListHostedZonesByNameResult call() throws Exception {
                ListHostedZonesByNameResult result;

                try {
                    result = listHostedZonesByName(request);
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
    public java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler) {

        return listHostedZonesByNameAsync(new ListHostedZonesByNameRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest request) {

        return listResourceRecordSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(final ListResourceRecordSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListResourceRecordSetsResult>() {
            @Override
            public ListResourceRecordSetsResult call() throws Exception {
                ListResourceRecordSetsResult result;

                try {
                    result = listResourceRecordSets(request);
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
    public java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest request) {

        return listReusableDelegationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(final ListReusableDelegationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListReusableDelegationSetsResult>() {
            @Override
            public ListReusableDelegationSetsResult call() throws Exception {
                ListReusableDelegationSetsResult result;

                try {
                    result = listReusableDelegationSets(request);
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
    public java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest request) {

        return listTagsForResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(final ListTagsForResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourcesResult>() {
            @Override
            public ListTagsForResourcesResult call() throws Exception {
                ListTagsForResourcesResult result;

                try {
                    result = listTagsForResources(request);
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
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest request) {

        return listTrafficPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(final ListTrafficPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPoliciesResult>() {
            @Override
            public ListTrafficPoliciesResult call() throws Exception {
                ListTrafficPoliciesResult result;

                try {
                    result = listTrafficPolicies(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyInstancesResult>() {
            @Override
            public ListTrafficPolicyInstancesResult call() throws Exception {
                ListTrafficPolicyInstancesResult result;

                try {
                    result = listTrafficPolicyInstances(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyInstancesByHostedZoneResult>() {
            @Override
            public ListTrafficPolicyInstancesByHostedZoneResult call() throws Exception {
                ListTrafficPolicyInstancesByHostedZoneResult result;

                try {
                    result = listTrafficPolicyInstancesByHostedZone(request);
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
    public java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest request) {

        return listTrafficPolicyInstancesByPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            final ListTrafficPolicyInstancesByPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByPolicyRequest, ListTrafficPolicyInstancesByPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyInstancesByPolicyResult>() {
            @Override
            public ListTrafficPolicyInstancesByPolicyResult call() throws Exception {
                ListTrafficPolicyInstancesByPolicyResult result;

                try {
                    result = listTrafficPolicyInstancesByPolicy(request);
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
    public java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(ListTrafficPolicyVersionsRequest request) {

        return listTrafficPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(final ListTrafficPolicyVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyVersionsRequest, ListTrafficPolicyVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPolicyVersionsResult>() {
            @Override
            public ListTrafficPolicyVersionsResult call() throws Exception {
                ListTrafficPolicyVersionsResult result;

                try {
                    result = listTrafficPolicyVersions(request);
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
    public java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(TestDNSAnswerRequest request) {

        return testDNSAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(final TestDNSAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestDNSAnswerRequest, TestDNSAnswerResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TestDNSAnswerResult>() {
            @Override
            public TestDNSAnswerResult call() throws Exception {
                TestDNSAnswerResult result;

                try {
                    result = testDNSAnswer(request);
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
    public java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest request) {

        return updateHealthCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(final UpdateHealthCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateHealthCheckResult>() {
            @Override
            public UpdateHealthCheckResult call() throws Exception {
                UpdateHealthCheckResult result;

                try {
                    result = updateHealthCheck(request);
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
    public java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest request) {

        return updateHostedZoneCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(final UpdateHostedZoneCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateHostedZoneCommentResult>() {
            @Override
            public UpdateHostedZoneCommentResult call() throws Exception {
                UpdateHostedZoneCommentResult result;

                try {
                    result = updateHostedZoneComment(request);
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
    public java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(UpdateTrafficPolicyCommentRequest request) {

        return updateTrafficPolicyCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(final UpdateTrafficPolicyCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyCommentRequest, UpdateTrafficPolicyCommentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrafficPolicyCommentResult>() {
            @Override
            public UpdateTrafficPolicyCommentResult call() throws Exception {
                UpdateTrafficPolicyCommentResult result;

                try {
                    result = updateTrafficPolicyComment(request);
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
    public java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(UpdateTrafficPolicyInstanceRequest request) {

        return updateTrafficPolicyInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(final UpdateTrafficPolicyInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyInstanceRequest, UpdateTrafficPolicyInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrafficPolicyInstanceResult>() {
            @Override
            public UpdateTrafficPolicyInstanceResult call() throws Exception {
                UpdateTrafficPolicyInstanceResult result;

                try {
                    result = updateTrafficPolicyInstance(request);
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
