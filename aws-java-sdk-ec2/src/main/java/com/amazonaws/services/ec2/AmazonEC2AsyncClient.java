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
package com.amazonaws.services.ec2;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon EC2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic Compute Cloud</fullname>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides resizable computing capacity in the Amazon Web Services (AWS)
 * cloud. Using Amazon EC2 eliminates your need to invest in hardware up front, so you can develop and deploy
 * applications faster.
 * </p>
 */
@ThreadSafe
public class AmazonEC2AsyncClient extends AmazonEC2Client implements AmazonEC2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2. A credentials provider chain will
     * be used that searches for credentials in this order:
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
    public AmazonEC2AsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon EC2 (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonEC2AsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the provided AWS account
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
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonEC2AsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonEC2AsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptReservedInstancesExchangeQuoteResult> acceptReservedInstancesExchangeQuoteAsync(
            AcceptReservedInstancesExchangeQuoteRequest request) {

        return acceptReservedInstancesExchangeQuoteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptReservedInstancesExchangeQuoteResult> acceptReservedInstancesExchangeQuoteAsync(
            final AcceptReservedInstancesExchangeQuoteRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptReservedInstancesExchangeQuoteRequest, AcceptReservedInstancesExchangeQuoteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AcceptReservedInstancesExchangeQuoteResult>() {
            @Override
            public AcceptReservedInstancesExchangeQuoteResult call() throws Exception {
                AcceptReservedInstancesExchangeQuoteResult result;

                try {
                    result = acceptReservedInstancesExchangeQuote(request);
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
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest request) {

        return acceptVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(final AcceptVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AcceptVpcPeeringConnectionResult>() {
            @Override
            public AcceptVpcPeeringConnectionResult call() throws Exception {
                AcceptVpcPeeringConnectionResult result;

                try {
                    result = acceptVpcPeeringConnection(request);
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
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation.
     *
     * @see #acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest)
     */
    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync() {

        return acceptVpcPeeringConnectionAsync(new AcceptVpcPeeringConnectionRequest());
    }

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation with an AsyncHandler.
     *
     * @see #acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler) {

        return acceptVpcPeeringConnectionAsync(new AcceptVpcPeeringConnectionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest request) {

        return allocateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(final AllocateAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AllocateAddressResult>() {
            @Override
            public AllocateAddressResult call() throws Exception {
                AllocateAddressResult result;

                try {
                    result = allocateAddress(request);
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
     * Simplified method form for invoking the AllocateAddress operation.
     *
     * @see #allocateAddressAsync(AllocateAddressRequest)
     */
    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync() {

        return allocateAddressAsync(new AllocateAddressRequest());
    }

    /**
     * Simplified method form for invoking the AllocateAddress operation with an AsyncHandler.
     *
     * @see #allocateAddressAsync(AllocateAddressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(
            com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler) {

        return allocateAddressAsync(new AllocateAddressRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<AllocateHostsResult> allocateHostsAsync(AllocateHostsRequest request) {

        return allocateHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateHostsResult> allocateHostsAsync(final AllocateHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateHostsRequest, AllocateHostsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AllocateHostsResult>() {
            @Override
            public AllocateHostsResult call() throws Exception {
                AllocateHostsResult result;

                try {
                    result = allocateHosts(request);
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
    public java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest request) {

        return assignPrivateIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(final AssignPrivateIpAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignPrivateIpAddressesRequest, AssignPrivateIpAddressesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssignPrivateIpAddressesResult>() {
            @Override
            public AssignPrivateIpAddressesResult call() throws Exception {
                AssignPrivateIpAddressesResult result;

                try {
                    result = assignPrivateIpAddresses(request);
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
    public java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest request) {

        return associateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(final AssociateAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAddressRequest, AssociateAddressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssociateAddressResult>() {
            @Override
            public AssociateAddressResult call() throws Exception {
                AssociateAddressResult result;

                try {
                    result = associateAddress(request);
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
    public java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest request) {

        return associateDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(final AssociateDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDhcpOptionsRequest, AssociateDhcpOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssociateDhcpOptionsResult>() {
            @Override
            public AssociateDhcpOptionsResult call() throws Exception {
                AssociateDhcpOptionsResult result;

                try {
                    result = associateDhcpOptions(request);
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
    public java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest request) {

        return associateRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(final AssociateRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRouteTableRequest, AssociateRouteTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssociateRouteTableResult>() {
            @Override
            public AssociateRouteTableResult call() throws Exception {
                AssociateRouteTableResult result;

                try {
                    result = associateRouteTable(request);
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
    public java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(AttachClassicLinkVpcRequest request) {

        return attachClassicLinkVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(final AttachClassicLinkVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachClassicLinkVpcRequest, AttachClassicLinkVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachClassicLinkVpcResult>() {
            @Override
            public AttachClassicLinkVpcResult call() throws Exception {
                AttachClassicLinkVpcResult result;

                try {
                    result = attachClassicLinkVpc(request);
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
    public java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(AttachInternetGatewayRequest request) {

        return attachInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(final AttachInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachInternetGatewayRequest, AttachInternetGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachInternetGatewayResult>() {
            @Override
            public AttachInternetGatewayResult call() throws Exception {
                AttachInternetGatewayResult result;

                try {
                    result = attachInternetGateway(request);
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
    public java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest request) {

        return attachNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(final AttachNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachNetworkInterfaceRequest, AttachNetworkInterfaceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachNetworkInterfaceResult>() {
            @Override
            public AttachNetworkInterfaceResult call() throws Exception {
                AttachNetworkInterfaceResult result;

                try {
                    result = attachNetworkInterface(request);
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
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest request) {

        return attachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(final AttachVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachVolumeResult>() {
            @Override
            public AttachVolumeResult call() throws Exception {
                AttachVolumeResult result;

                try {
                    result = attachVolume(request);
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
    public java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest request) {

        return attachVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(final AttachVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachVpnGatewayRequest, AttachVpnGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachVpnGatewayResult>() {
            @Override
            public AttachVpnGatewayResult call() throws Exception {
                AttachVpnGatewayResult result;

                try {
                    result = attachVpnGateway(request);
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
    public java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(AuthorizeSecurityGroupEgressRequest request) {

        return authorizeSecurityGroupEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(final AuthorizeSecurityGroupEgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupEgressRequest, AuthorizeSecurityGroupEgressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeSecurityGroupEgressResult>() {
            @Override
            public AuthorizeSecurityGroupEgressResult call() throws Exception {
                AuthorizeSecurityGroupEgressResult result;

                try {
                    result = authorizeSecurityGroupEgress(request);
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
    public java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest request) {

        return authorizeSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(
            final AuthorizeSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupIngressRequest, AuthorizeSecurityGroupIngressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeSecurityGroupIngressResult>() {
            @Override
            public AuthorizeSecurityGroupIngressResult call() throws Exception {
                AuthorizeSecurityGroupIngressResult result;

                try {
                    result = authorizeSecurityGroupIngress(request);
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
    public java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest request) {

        return bundleInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(final BundleInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BundleInstanceRequest, BundleInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BundleInstanceResult>() {
            @Override
            public BundleInstanceResult call() throws Exception {
                BundleInstanceResult result;

                try {
                    result = bundleInstance(request);
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
    public java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest request) {

        return cancelBundleTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(final CancelBundleTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelBundleTaskRequest, CancelBundleTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelBundleTaskResult>() {
            @Override
            public CancelBundleTaskResult call() throws Exception {
                CancelBundleTaskResult result;

                try {
                    result = cancelBundleTask(request);
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
    public java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(CancelConversionTaskRequest request) {

        return cancelConversionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(final CancelConversionTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelConversionTaskRequest, CancelConversionTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelConversionTaskResult>() {
            @Override
            public CancelConversionTaskResult call() throws Exception {
                CancelConversionTaskResult result;

                try {
                    result = cancelConversionTask(request);
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
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request) {

        return cancelExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(final CancelExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelExportTaskResult>() {
            @Override
            public CancelExportTaskResult call() throws Exception {
                CancelExportTaskResult result;

                try {
                    result = cancelExportTask(request);
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
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(CancelImportTaskRequest request) {

        return cancelImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(final CancelImportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelImportTaskResult>() {
            @Override
            public CancelImportTaskResult call() throws Exception {
                CancelImportTaskResult result;

                try {
                    result = cancelImportTask(request);
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
     * Simplified method form for invoking the CancelImportTask operation.
     *
     * @see #cancelImportTaskAsync(CancelImportTaskRequest)
     */
    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync() {

        return cancelImportTaskAsync(new CancelImportTaskRequest());
    }

    /**
     * Simplified method form for invoking the CancelImportTask operation with an AsyncHandler.
     *
     * @see #cancelImportTaskAsync(CancelImportTaskRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(
            com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler) {

        return cancelImportTaskAsync(new CancelImportTaskRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(CancelReservedInstancesListingRequest request) {

        return cancelReservedInstancesListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(
            final CancelReservedInstancesListingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelReservedInstancesListingRequest, CancelReservedInstancesListingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelReservedInstancesListingResult>() {
            @Override
            public CancelReservedInstancesListingResult call() throws Exception {
                CancelReservedInstancesListingResult result;

                try {
                    result = cancelReservedInstancesListing(request);
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
    public java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(CancelSpotFleetRequestsRequest request) {

        return cancelSpotFleetRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(final CancelSpotFleetRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSpotFleetRequestsRequest, CancelSpotFleetRequestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelSpotFleetRequestsResult>() {
            @Override
            public CancelSpotFleetRequestsResult call() throws Exception {
                CancelSpotFleetRequestsResult result;

                try {
                    result = cancelSpotFleetRequests(request);
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
    public java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(CancelSpotInstanceRequestsRequest request) {

        return cancelSpotInstanceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(final CancelSpotInstanceRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelSpotInstanceRequestsResult>() {
            @Override
            public CancelSpotInstanceRequestsResult call() throws Exception {
                CancelSpotInstanceRequestsResult result;

                try {
                    result = cancelSpotInstanceRequests(request);
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
    public java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest request) {

        return confirmProductInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(final ConfirmProductInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmProductInstanceRequest, ConfirmProductInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ConfirmProductInstanceResult>() {
            @Override
            public ConfirmProductInstanceResult call() throws Exception {
                ConfirmProductInstanceResult result;

                try {
                    result = confirmProductInstance(request);
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
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest request) {

        return copyImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(final CopyImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CopyImageResult>() {
            @Override
            public CopyImageResult call() throws Exception {
                CopyImageResult result;

                try {
                    result = copyImage(request);
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
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(final CopySnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CopySnapshotResult>() {
            @Override
            public CopySnapshotResult call() throws Exception {
                CopySnapshotResult result;

                try {
                    result = copySnapshot(request);
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
    public java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest request) {

        return createCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(final CreateCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomerGatewayRequest, CreateCustomerGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomerGatewayResult>() {
            @Override
            public CreateCustomerGatewayResult call() throws Exception {
                CreateCustomerGatewayResult result;

                try {
                    result = createCustomerGateway(request);
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
    public java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest request) {

        return createDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(final CreateDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDhcpOptionsResult>() {
            @Override
            public CreateDhcpOptionsResult call() throws Exception {
                CreateDhcpOptionsResult result;

                try {
                    result = createDhcpOptions(request);
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
    public java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(CreateFlowLogsRequest request) {

        return createFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(final CreateFlowLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowLogsRequest, CreateFlowLogsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowLogsResult>() {
            @Override
            public CreateFlowLogsResult call() throws Exception {
                CreateFlowLogsResult result;

                try {
                    result = createFlowLogs(request);
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
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request) {

        return createImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(final CreateImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateImageResult>() {
            @Override
            public CreateImageResult call() throws Exception {
                CreateImageResult result;

                try {
                    result = createImage(request);
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
    public java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest request) {

        return createInstanceExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(final CreateInstanceExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceExportTaskRequest, CreateInstanceExportTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceExportTaskResult>() {
            @Override
            public CreateInstanceExportTaskResult call() throws Exception {
                CreateInstanceExportTaskResult result;

                try {
                    result = createInstanceExportTask(request);
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
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest request) {

        return createInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(final CreateInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateInternetGatewayResult>() {
            @Override
            public CreateInternetGatewayResult call() throws Exception {
                CreateInternetGatewayResult result;

                try {
                    result = createInternetGateway(request);
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
     * Simplified method form for invoking the CreateInternetGateway operation.
     *
     * @see #createInternetGatewayAsync(CreateInternetGatewayRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync() {

        return createInternetGatewayAsync(new CreateInternetGatewayRequest());
    }

    /**
     * Simplified method form for invoking the CreateInternetGateway operation with an AsyncHandler.
     *
     * @see #createInternetGatewayAsync(CreateInternetGatewayRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(
            com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler) {

        return createInternetGatewayAsync(new CreateInternetGatewayRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request) {

        return createKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(final CreateKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyPairResult>() {
            @Override
            public CreateKeyPairResult call() throws Exception {
                CreateKeyPairResult result;

                try {
                    result = createKeyPair(request);
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
    public java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(CreateNatGatewayRequest request) {

        return createNatGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(final CreateNatGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNatGatewayRequest, CreateNatGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateNatGatewayResult>() {
            @Override
            public CreateNatGatewayResult call() throws Exception {
                CreateNatGatewayResult result;

                try {
                    result = createNatGateway(request);
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
    public java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest request) {

        return createNetworkAclAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(final CreateNetworkAclRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkAclRequest, CreateNetworkAclResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkAclResult>() {
            @Override
            public CreateNetworkAclResult call() throws Exception {
                CreateNetworkAclResult result;

                try {
                    result = createNetworkAcl(request);
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
    public java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest request) {

        return createNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(final CreateNetworkAclEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkAclEntryRequest, CreateNetworkAclEntryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkAclEntryResult>() {
            @Override
            public CreateNetworkAclEntryResult call() throws Exception {
                CreateNetworkAclEntryResult result;

                try {
                    result = createNetworkAclEntry(request);
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
    public java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest request) {

        return createNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(final CreateNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfaceRequest, CreateNetworkInterfaceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkInterfaceResult>() {
            @Override
            public CreateNetworkInterfaceResult call() throws Exception {
                CreateNetworkInterfaceResult result;

                try {
                    result = createNetworkInterface(request);
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
    public java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(CreatePlacementGroupRequest request) {

        return createPlacementGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(final CreatePlacementGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlacementGroupRequest, CreatePlacementGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreatePlacementGroupResult>() {
            @Override
            public CreatePlacementGroupResult call() throws Exception {
                CreatePlacementGroupResult result;

                try {
                    result = createPlacementGroup(request);
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
    public java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(CreateReservedInstancesListingRequest request) {

        return createReservedInstancesListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(
            final CreateReservedInstancesListingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReservedInstancesListingRequest, CreateReservedInstancesListingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReservedInstancesListingResult>() {
            @Override
            public CreateReservedInstancesListingResult call() throws Exception {
                CreateReservedInstancesListingResult result;

                try {
                    result = createReservedInstancesListing(request);
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
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest request) {

        return createRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(final CreateRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteResult>() {
            @Override
            public CreateRouteResult call() throws Exception {
                CreateRouteResult result;

                try {
                    result = createRoute(request);
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
    public java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest request) {

        return createRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(final CreateRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteTableRequest, CreateRouteTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteTableResult>() {
            @Override
            public CreateRouteTableResult call() throws Exception {
                CreateRouteTableResult result;

                try {
                    result = createRouteTable(request);
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
    public java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest request) {

        return createSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(final CreateSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecurityGroupRequest, CreateSecurityGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSecurityGroupResult>() {
            @Override
            public CreateSecurityGroupResult call() throws Exception {
                CreateSecurityGroupResult result;

                try {
                    result = createSecurityGroup(request);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result;

                try {
                    result = createSnapshot(request);
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
    public java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(CreateSpotDatafeedSubscriptionRequest request) {

        return createSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(
            final CreateSpotDatafeedSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSpotDatafeedSubscriptionResult>() {
            @Override
            public CreateSpotDatafeedSubscriptionResult call() throws Exception {
                CreateSpotDatafeedSubscriptionResult result;

                try {
                    result = createSpotDatafeedSubscription(request);
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
    public java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest request) {

        return createSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(final CreateSubnetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubnetRequest, CreateSubnetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSubnetResult>() {
            @Override
            public CreateSubnetResult call() throws Exception {
                CreateSubnetResult result;

                try {
                    result = createSubnet(request);
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result;

                try {
                    result = createTags(request);
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
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request) {

        return createVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(final CreateVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVolumeResult>() {
            @Override
            public CreateVolumeResult call() throws Exception {
                CreateVolumeResult result;

                try {
                    result = createVolume(request);
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
    public java.util.concurrent.Future<CreateVpcResult> createVpcAsync(CreateVpcRequest request) {

        return createVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcResult> createVpcAsync(final CreateVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcRequest, CreateVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcResult>() {
            @Override
            public CreateVpcResult call() throws Exception {
                CreateVpcResult result;

                try {
                    result = createVpc(request);
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
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest request) {

        return createVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(final CreateVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcEndpointResult>() {
            @Override
            public CreateVpcEndpointResult call() throws Exception {
                CreateVpcEndpointResult result;

                try {
                    result = createVpcEndpoint(request);
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
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest request) {

        return createVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(final CreateVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcPeeringConnectionResult>() {
            @Override
            public CreateVpcPeeringConnectionResult call() throws Exception {
                CreateVpcPeeringConnectionResult result;

                try {
                    result = createVpcPeeringConnection(request);
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
     * Simplified method form for invoking the CreateVpcPeeringConnection operation.
     *
     * @see #createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync() {

        return createVpcPeeringConnectionAsync(new CreateVpcPeeringConnectionRequest());
    }

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation with an AsyncHandler.
     *
     * @see #createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler) {

        return createVpcPeeringConnectionAsync(new CreateVpcPeeringConnectionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest request) {

        return createVpnConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionResult> createVpnConnectionAsync(final CreateVpnConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRequest, CreateVpnConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVpnConnectionResult>() {
            @Override
            public CreateVpnConnectionResult call() throws Exception {
                CreateVpnConnectionResult result;

                try {
                    result = createVpnConnection(request);
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
    public java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest request) {

        return createVpnConnectionRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(final CreateVpnConnectionRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRouteRequest, CreateVpnConnectionRouteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVpnConnectionRouteResult>() {
            @Override
            public CreateVpnConnectionRouteResult call() throws Exception {
                CreateVpnConnectionRouteResult result;

                try {
                    result = createVpnConnectionRoute(request);
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
    public java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest request) {

        return createVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(final CreateVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpnGatewayRequest, CreateVpnGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVpnGatewayResult>() {
            @Override
            public CreateVpnGatewayResult call() throws Exception {
                CreateVpnGatewayResult result;

                try {
                    result = createVpnGateway(request);
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
    public java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest request) {

        return deleteCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(final DeleteCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomerGatewayRequest, DeleteCustomerGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomerGatewayResult>() {
            @Override
            public DeleteCustomerGatewayResult call() throws Exception {
                DeleteCustomerGatewayResult result;

                try {
                    result = deleteCustomerGateway(request);
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
    public java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest request) {

        return deleteDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(final DeleteDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDhcpOptionsResult>() {
            @Override
            public DeleteDhcpOptionsResult call() throws Exception {
                DeleteDhcpOptionsResult result;

                try {
                    result = deleteDhcpOptions(request);
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
    public java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(DeleteFlowLogsRequest request) {

        return deleteFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(final DeleteFlowLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowLogsRequest, DeleteFlowLogsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowLogsResult>() {
            @Override
            public DeleteFlowLogsResult call() throws Exception {
                DeleteFlowLogsResult result;

                try {
                    result = deleteFlowLogs(request);
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
    public java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(DeleteInternetGatewayRequest request) {

        return deleteInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(final DeleteInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInternetGatewayRequest, DeleteInternetGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteInternetGatewayResult>() {
            @Override
            public DeleteInternetGatewayResult call() throws Exception {
                DeleteInternetGatewayResult result;

                try {
                    result = deleteInternetGateway(request);
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
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request) {

        return deleteKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(final DeleteKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyPairResult>() {
            @Override
            public DeleteKeyPairResult call() throws Exception {
                DeleteKeyPairResult result;

                try {
                    result = deleteKeyPair(request);
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
    public java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(DeleteNatGatewayRequest request) {

        return deleteNatGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(final DeleteNatGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNatGatewayRequest, DeleteNatGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteNatGatewayResult>() {
            @Override
            public DeleteNatGatewayResult call() throws Exception {
                DeleteNatGatewayResult result;

                try {
                    result = deleteNatGateway(request);
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
    public java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(DeleteNetworkAclRequest request) {

        return deleteNetworkAclAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(final DeleteNetworkAclRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclRequest, DeleteNetworkAclResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkAclResult>() {
            @Override
            public DeleteNetworkAclResult call() throws Exception {
                DeleteNetworkAclResult result;

                try {
                    result = deleteNetworkAcl(request);
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
    public java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest request) {

        return deleteNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(final DeleteNetworkAclEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclEntryRequest, DeleteNetworkAclEntryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkAclEntryResult>() {
            @Override
            public DeleteNetworkAclEntryResult call() throws Exception {
                DeleteNetworkAclEntryResult result;

                try {
                    result = deleteNetworkAclEntry(request);
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
    public java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest request) {

        return deleteNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(final DeleteNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfaceRequest, DeleteNetworkInterfaceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkInterfaceResult>() {
            @Override
            public DeleteNetworkInterfaceResult call() throws Exception {
                DeleteNetworkInterfaceResult result;

                try {
                    result = deleteNetworkInterface(request);
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
    public java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(DeletePlacementGroupRequest request) {

        return deletePlacementGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(final DeletePlacementGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlacementGroupRequest, DeletePlacementGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeletePlacementGroupResult>() {
            @Override
            public DeletePlacementGroupResult call() throws Exception {
                DeletePlacementGroupResult result;

                try {
                    result = deletePlacementGroup(request);
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
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest request) {

        return deleteRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(final DeleteRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteResult>() {
            @Override
            public DeleteRouteResult call() throws Exception {
                DeleteRouteResult result;

                try {
                    result = deleteRoute(request);
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
    public java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(DeleteRouteTableRequest request) {

        return deleteRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(final DeleteRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteTableResult>() {
            @Override
            public DeleteRouteTableResult call() throws Exception {
                DeleteRouteTableResult result;

                try {
                    result = deleteRouteTable(request);
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
    public java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {

        return deleteSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(final DeleteSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecurityGroupRequest, DeleteSecurityGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecurityGroupResult>() {
            @Override
            public DeleteSecurityGroupResult call() throws Exception {
                DeleteSecurityGroupResult result;

                try {
                    result = deleteSecurityGroup(request);
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
            @Override
            public DeleteSnapshotResult call() throws Exception {
                DeleteSnapshotResult result;

                try {
                    result = deleteSnapshot(request);
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
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest request) {

        return deleteSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            final DeleteSpotDatafeedSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSpotDatafeedSubscriptionResult>() {
            @Override
            public DeleteSpotDatafeedSubscriptionResult call() throws Exception {
                DeleteSpotDatafeedSubscriptionResult result;

                try {
                    result = deleteSpotDatafeedSubscription(request);
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
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation.
     *
     * @see #deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync() {

        return deleteSpotDatafeedSubscriptionAsync(new DeleteSpotDatafeedSubscriptionRequest());
    }

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation with an AsyncHandler.
     *
     * @see #deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler) {

        return deleteSpotDatafeedSubscriptionAsync(new DeleteSpotDatafeedSubscriptionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetResult> deleteSubnetAsync(DeleteSubnetRequest request) {

        return deleteSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetResult> deleteSubnetAsync(final DeleteSubnetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubnetRequest, DeleteSubnetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubnetResult>() {
            @Override
            public DeleteSubnetResult call() throws Exception {
                DeleteSubnetResult result;

                try {
                    result = deleteSubnet(request);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result;

                try {
                    result = deleteTags(request);
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
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVolumeResult>() {
            @Override
            public DeleteVolumeResult call() throws Exception {
                DeleteVolumeResult result;

                try {
                    result = deleteVolume(request);
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
    public java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(DeleteVpcRequest request) {

        return deleteVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(final DeleteVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcRequest, DeleteVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcResult>() {
            @Override
            public DeleteVpcResult call() throws Exception {
                DeleteVpcResult result;

                try {
                    result = deleteVpc(request);
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
    public java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(DeleteVpcEndpointsRequest request) {

        return deleteVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(final DeleteVpcEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointsRequest, DeleteVpcEndpointsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcEndpointsResult>() {
            @Override
            public DeleteVpcEndpointsResult call() throws Exception {
                DeleteVpcEndpointsResult result;

                try {
                    result = deleteVpcEndpoints(request);
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
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(DeleteVpcPeeringConnectionRequest request) {

        return deleteVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(final DeleteVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcPeeringConnectionResult>() {
            @Override
            public DeleteVpcPeeringConnectionResult call() throws Exception {
                DeleteVpcPeeringConnectionResult result;

                try {
                    result = deleteVpcPeeringConnection(request);
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
    public java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(DeleteVpnConnectionRequest request) {

        return deleteVpnConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(final DeleteVpnConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRequest, DeleteVpnConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpnConnectionResult>() {
            @Override
            public DeleteVpnConnectionResult call() throws Exception {
                DeleteVpnConnectionResult result;

                try {
                    result = deleteVpnConnection(request);
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
    public java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest request) {

        return deleteVpnConnectionRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(final DeleteVpnConnectionRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRouteRequest, DeleteVpnConnectionRouteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpnConnectionRouteResult>() {
            @Override
            public DeleteVpnConnectionRouteResult call() throws Exception {
                DeleteVpnConnectionRouteResult result;

                try {
                    result = deleteVpnConnectionRoute(request);
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
    public java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(DeleteVpnGatewayRequest request) {

        return deleteVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(final DeleteVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpnGatewayRequest, DeleteVpnGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpnGatewayResult>() {
            @Override
            public DeleteVpnGatewayResult call() throws Exception {
                DeleteVpnGatewayResult result;

                try {
                    result = deleteVpnGateway(request);
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
    public java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(DeregisterImageRequest request) {

        return deregisterImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(final DeregisterImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterImageRequest, DeregisterImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeregisterImageResult>() {
            @Override
            public DeregisterImageResult call() throws Exception {
                DeregisterImageResult result;

                try {
                    result = deregisterImage(request);
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
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result;

                try {
                    result = describeAccountAttributes(request);
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
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync() {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation with an AsyncHandler.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest request) {

        return describeAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(final DescribeAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAddressesResult>() {
            @Override
            public DescribeAddressesResult call() throws Exception {
                DescribeAddressesResult result;

                try {
                    result = describeAddresses(request);
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
     * Simplified method form for invoking the DescribeAddresses operation.
     *
     * @see #describeAddressesAsync(DescribeAddressesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync() {

        return describeAddressesAsync(new DescribeAddressesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAddresses operation with an AsyncHandler.
     *
     * @see #describeAddressesAsync(DescribeAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler) {

        return describeAddressesAsync(new DescribeAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest request) {

        return describeAvailabilityZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(final DescribeAvailabilityZonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAvailabilityZonesResult>() {
            @Override
            public DescribeAvailabilityZonesResult call() throws Exception {
                DescribeAvailabilityZonesResult result;

                try {
                    result = describeAvailabilityZones(request);
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
     * Simplified method form for invoking the DescribeAvailabilityZones operation.
     *
     * @see #describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync() {

        return describeAvailabilityZonesAsync(new DescribeAvailabilityZonesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation with an AsyncHandler.
     *
     * @see #describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler) {

        return describeAvailabilityZonesAsync(new DescribeAvailabilityZonesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest request) {

        return describeBundleTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(final DescribeBundleTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeBundleTasksResult>() {
            @Override
            public DescribeBundleTasksResult call() throws Exception {
                DescribeBundleTasksResult result;

                try {
                    result = describeBundleTasks(request);
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
     * Simplified method form for invoking the DescribeBundleTasks operation.
     *
     * @see #describeBundleTasksAsync(DescribeBundleTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync() {

        return describeBundleTasksAsync(new DescribeBundleTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation with an AsyncHandler.
     *
     * @see #describeBundleTasksAsync(DescribeBundleTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler) {

        return describeBundleTasksAsync(new DescribeBundleTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest request) {

        return describeClassicLinkInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(final DescribeClassicLinkInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeClassicLinkInstancesResult>() {
            @Override
            public DescribeClassicLinkInstancesResult call() throws Exception {
                DescribeClassicLinkInstancesResult result;

                try {
                    result = describeClassicLinkInstances(request);
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
     * Simplified method form for invoking the DescribeClassicLinkInstances operation.
     *
     * @see #describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync() {

        return describeClassicLinkInstancesAsync(new DescribeClassicLinkInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation with an AsyncHandler.
     *
     * @see #describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler) {

        return describeClassicLinkInstancesAsync(new DescribeClassicLinkInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest request) {

        return describeConversionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(final DescribeConversionTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeConversionTasksResult>() {
            @Override
            public DescribeConversionTasksResult call() throws Exception {
                DescribeConversionTasksResult result;

                try {
                    result = describeConversionTasks(request);
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
     * Simplified method form for invoking the DescribeConversionTasks operation.
     *
     * @see #describeConversionTasksAsync(DescribeConversionTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync() {

        return describeConversionTasksAsync(new DescribeConversionTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation with an AsyncHandler.
     *
     * @see #describeConversionTasksAsync(DescribeConversionTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler) {

        return describeConversionTasksAsync(new DescribeConversionTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest request) {

        return describeCustomerGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(final DescribeCustomerGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomerGatewaysResult>() {
            @Override
            public DescribeCustomerGatewaysResult call() throws Exception {
                DescribeCustomerGatewaysResult result;

                try {
                    result = describeCustomerGateways(request);
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
     * Simplified method form for invoking the DescribeCustomerGateways operation.
     *
     * @see #describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync() {

        return describeCustomerGatewaysAsync(new DescribeCustomerGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation with an AsyncHandler.
     *
     * @see #describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler) {

        return describeCustomerGatewaysAsync(new DescribeCustomerGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest request) {

        return describeDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(final DescribeDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDhcpOptionsResult>() {
            @Override
            public DescribeDhcpOptionsResult call() throws Exception {
                DescribeDhcpOptionsResult result;

                try {
                    result = describeDhcpOptions(request);
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
     * Simplified method form for invoking the DescribeDhcpOptions operation.
     *
     * @see #describeDhcpOptionsAsync(DescribeDhcpOptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync() {

        return describeDhcpOptionsAsync(new DescribeDhcpOptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation with an AsyncHandler.
     *
     * @see #describeDhcpOptionsAsync(DescribeDhcpOptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler) {

        return describeDhcpOptionsAsync(new DescribeDhcpOptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(final DescribeExportTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportTasksResult>() {
            @Override
            public DescribeExportTasksResult call() throws Exception {
                DescribeExportTasksResult result;

                try {
                    result = describeExportTasks(request);
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
     * Simplified method form for invoking the DescribeExportTasks operation.
     *
     * @see #describeExportTasksAsync(DescribeExportTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync() {

        return describeExportTasksAsync(new DescribeExportTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeExportTasks operation with an AsyncHandler.
     *
     * @see #describeExportTasksAsync(DescribeExportTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        return describeExportTasksAsync(new DescribeExportTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(DescribeFlowLogsRequest request) {

        return describeFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(final DescribeFlowLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowLogsResult>() {
            @Override
            public DescribeFlowLogsResult call() throws Exception {
                DescribeFlowLogsResult result;

                try {
                    result = describeFlowLogs(request);
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
     * Simplified method form for invoking the DescribeFlowLogs operation.
     *
     * @see #describeFlowLogsAsync(DescribeFlowLogsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync() {

        return describeFlowLogsAsync(new DescribeFlowLogsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation with an AsyncHandler.
     *
     * @see #describeFlowLogsAsync(DescribeFlowLogsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler) {

        return describeFlowLogsAsync(new DescribeFlowLogsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            DescribeHostReservationOfferingsRequest request) {

        return describeHostReservationOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            final DescribeHostReservationOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostReservationOfferingsRequest, DescribeHostReservationOfferingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostReservationOfferingsResult>() {
            @Override
            public DescribeHostReservationOfferingsResult call() throws Exception {
                DescribeHostReservationOfferingsResult result;

                try {
                    result = describeHostReservationOfferings(request);
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
    public java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(DescribeHostReservationsRequest request) {

        return describeHostReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(final DescribeHostReservationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostReservationsRequest, DescribeHostReservationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostReservationsResult>() {
            @Override
            public DescribeHostReservationsResult call() throws Exception {
                DescribeHostReservationsResult result;

                try {
                    result = describeHostReservations(request);
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
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(DescribeHostsRequest request) {

        return describeHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(final DescribeHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostsResult>() {
            @Override
            public DescribeHostsResult call() throws Exception {
                DescribeHostsResult result;

                try {
                    result = describeHosts(request);
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
     * Simplified method form for invoking the DescribeHosts operation.
     *
     * @see #describeHostsAsync(DescribeHostsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync() {

        return describeHostsAsync(new DescribeHostsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHosts operation with an AsyncHandler.
     *
     * @see #describeHostsAsync(DescribeHostsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler) {

        return describeHostsAsync(new DescribeHostsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(DescribeIdFormatRequest request) {

        return describeIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(final DescribeIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdFormatResult>() {
            @Override
            public DescribeIdFormatResult call() throws Exception {
                DescribeIdFormatResult result;

                try {
                    result = describeIdFormat(request);
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
     * Simplified method form for invoking the DescribeIdFormat operation.
     *
     * @see #describeIdFormatAsync(DescribeIdFormatRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync() {

        return describeIdFormatAsync(new DescribeIdFormatRequest());
    }

    /**
     * Simplified method form for invoking the DescribeIdFormat operation with an AsyncHandler.
     *
     * @see #describeIdFormatAsync(DescribeIdFormatRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler) {

        return describeIdFormatAsync(new DescribeIdFormatRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityIdFormatResult> describeIdentityIdFormatAsync(DescribeIdentityIdFormatRequest request) {

        return describeIdentityIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityIdFormatResult> describeIdentityIdFormatAsync(final DescribeIdentityIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityIdFormatRequest, DescribeIdentityIdFormatResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityIdFormatResult>() {
            @Override
            public DescribeIdentityIdFormatResult call() throws Exception {
                DescribeIdentityIdFormatResult result;

                try {
                    result = describeIdentityIdFormat(request);
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
    public java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest request) {

        return describeImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(final DescribeImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImageAttributeRequest, DescribeImageAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeImageAttributeResult>() {
            @Override
            public DescribeImageAttributeResult call() throws Exception {
                DescribeImageAttributeResult result;

                try {
                    result = describeImageAttribute(request);
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
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(final DescribeImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeImagesResult>() {
            @Override
            public DescribeImagesResult call() throws Exception {
                DescribeImagesResult result;

                try {
                    result = describeImages(request);
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
     * Simplified method form for invoking the DescribeImages operation.
     *
     * @see #describeImagesAsync(DescribeImagesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync() {

        return describeImagesAsync(new DescribeImagesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeImages operation with an AsyncHandler.
     *
     * @see #describeImagesAsync(DescribeImagesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {

        return describeImagesAsync(new DescribeImagesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(DescribeImportImageTasksRequest request) {

        return describeImportImageTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(final DescribeImportImageTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImportImageTasksRequest, DescribeImportImageTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeImportImageTasksResult>() {
            @Override
            public DescribeImportImageTasksResult call() throws Exception {
                DescribeImportImageTasksResult result;

                try {
                    result = describeImportImageTasks(request);
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
     * Simplified method form for invoking the DescribeImportImageTasks operation.
     *
     * @see #describeImportImageTasksAsync(DescribeImportImageTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync() {

        return describeImportImageTasksAsync(new DescribeImportImageTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation with an AsyncHandler.
     *
     * @see #describeImportImageTasksAsync(DescribeImportImageTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeImportImageTasksResult> describeImportImageTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImportImageTasksRequest, DescribeImportImageTasksResult> asyncHandler) {

        return describeImportImageTasksAsync(new DescribeImportImageTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest request) {

        return describeImportSnapshotTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(final DescribeImportSnapshotTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeImportSnapshotTasksResult>() {
            @Override
            public DescribeImportSnapshotTasksResult call() throws Exception {
                DescribeImportSnapshotTasksResult result;

                try {
                    result = describeImportSnapshotTasks(request);
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
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation.
     *
     * @see #describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync() {

        return describeImportSnapshotTasksAsync(new DescribeImportSnapshotTasksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation with an AsyncHandler.
     *
     * @see #describeImportSnapshotTasksAsync(DescribeImportSnapshotTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeImportSnapshotTasksResult> describeImportSnapshotTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeImportSnapshotTasksRequest, DescribeImportSnapshotTasksResult> asyncHandler) {

        return describeImportSnapshotTasksAsync(new DescribeImportSnapshotTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest request) {

        return describeInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(final DescribeInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAttributeResult>() {
            @Override
            public DescribeInstanceAttributeResult call() throws Exception {
                DescribeInstanceAttributeResult result;

                try {
                    result = describeInstanceAttribute(request);
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
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest request) {

        return describeInstanceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(final DescribeInstanceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceStatusResult>() {
            @Override
            public DescribeInstanceStatusResult call() throws Exception {
                DescribeInstanceStatusResult result;

                try {
                    result = describeInstanceStatus(request);
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
     * Simplified method form for invoking the DescribeInstanceStatus operation.
     *
     * @see #describeInstanceStatusAsync(DescribeInstanceStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync() {

        return describeInstanceStatusAsync(new DescribeInstanceStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation with an AsyncHandler.
     *
     * @see #describeInstanceStatusAsync(DescribeInstanceStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler) {

        return describeInstanceStatusAsync(new DescribeInstanceStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancesResult>() {
            @Override
            public DescribeInstancesResult call() throws Exception {
                DescribeInstancesResult result;

                try {
                    result = describeInstances(request);
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
     * Simplified method form for invoking the DescribeInstances operation.
     *
     * @see #describeInstancesAsync(DescribeInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync() {

        return describeInstancesAsync(new DescribeInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInstances operation with an AsyncHandler.
     *
     * @see #describeInstancesAsync(DescribeInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        return describeInstancesAsync(new DescribeInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest request) {

        return describeInternetGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(final DescribeInternetGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInternetGatewaysResult>() {
            @Override
            public DescribeInternetGatewaysResult call() throws Exception {
                DescribeInternetGatewaysResult result;

                try {
                    result = describeInternetGateways(request);
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
     * Simplified method form for invoking the DescribeInternetGateways operation.
     *
     * @see #describeInternetGatewaysAsync(DescribeInternetGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync() {

        return describeInternetGatewaysAsync(new DescribeInternetGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation with an AsyncHandler.
     *
     * @see #describeInternetGatewaysAsync(DescribeInternetGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler) {

        return describeInternetGatewaysAsync(new DescribeInternetGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest request) {

        return describeKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(final DescribeKeyPairsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeyPairsResult>() {
            @Override
            public DescribeKeyPairsResult call() throws Exception {
                DescribeKeyPairsResult result;

                try {
                    result = describeKeyPairs(request);
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
     * Simplified method form for invoking the DescribeKeyPairs operation.
     *
     * @see #describeKeyPairsAsync(DescribeKeyPairsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync() {

        return describeKeyPairsAsync(new DescribeKeyPairsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation with an AsyncHandler.
     *
     * @see #describeKeyPairsAsync(DescribeKeyPairsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler) {

        return describeKeyPairsAsync(new DescribeKeyPairsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(DescribeMovingAddressesRequest request) {

        return describeMovingAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(final DescribeMovingAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMovingAddressesResult>() {
            @Override
            public DescribeMovingAddressesResult call() throws Exception {
                DescribeMovingAddressesResult result;

                try {
                    result = describeMovingAddresses(request);
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
     * Simplified method form for invoking the DescribeMovingAddresses operation.
     *
     * @see #describeMovingAddressesAsync(DescribeMovingAddressesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync() {

        return describeMovingAddressesAsync(new DescribeMovingAddressesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation with an AsyncHandler.
     *
     * @see #describeMovingAddressesAsync(DescribeMovingAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler) {

        return describeMovingAddressesAsync(new DescribeMovingAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNatGatewaysResult> describeNatGatewaysAsync(DescribeNatGatewaysRequest request) {

        return describeNatGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNatGatewaysResult> describeNatGatewaysAsync(final DescribeNatGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNatGatewaysRequest, DescribeNatGatewaysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeNatGatewaysResult>() {
            @Override
            public DescribeNatGatewaysResult call() throws Exception {
                DescribeNatGatewaysResult result;

                try {
                    result = describeNatGateways(request);
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
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest request) {

        return describeNetworkAclsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(final DescribeNetworkAclsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkAclsResult>() {
            @Override
            public DescribeNetworkAclsResult call() throws Exception {
                DescribeNetworkAclsResult result;

                try {
                    result = describeNetworkAcls(request);
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
     * Simplified method form for invoking the DescribeNetworkAcls operation.
     *
     * @see #describeNetworkAclsAsync(DescribeNetworkAclsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync() {

        return describeNetworkAclsAsync(new DescribeNetworkAclsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation with an AsyncHandler.
     *
     * @see #describeNetworkAclsAsync(DescribeNetworkAclsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler) {

        return describeNetworkAclsAsync(new DescribeNetworkAclsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(
            DescribeNetworkInterfaceAttributeRequest request) {

        return describeNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(
            final DescribeNetworkInterfaceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfaceAttributeRequest, DescribeNetworkInterfaceAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkInterfaceAttributeResult>() {
            @Override
            public DescribeNetworkInterfaceAttributeResult call() throws Exception {
                DescribeNetworkInterfaceAttributeResult result;

                try {
                    result = describeNetworkInterfaceAttribute(request);
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
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest request) {

        return describeNetworkInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(final DescribeNetworkInterfacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkInterfacesResult>() {
            @Override
            public DescribeNetworkInterfacesResult call() throws Exception {
                DescribeNetworkInterfacesResult result;

                try {
                    result = describeNetworkInterfaces(request);
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
     * Simplified method form for invoking the DescribeNetworkInterfaces operation.
     *
     * @see #describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync() {

        return describeNetworkInterfacesAsync(new DescribeNetworkInterfacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation with an AsyncHandler.
     *
     * @see #describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler) {

        return describeNetworkInterfacesAsync(new DescribeNetworkInterfacesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest request) {

        return describePlacementGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(final DescribePlacementGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribePlacementGroupsResult>() {
            @Override
            public DescribePlacementGroupsResult call() throws Exception {
                DescribePlacementGroupsResult result;

                try {
                    result = describePlacementGroups(request);
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
     * Simplified method form for invoking the DescribePlacementGroups operation.
     *
     * @see #describePlacementGroupsAsync(DescribePlacementGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync() {

        return describePlacementGroupsAsync(new DescribePlacementGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation with an AsyncHandler.
     *
     * @see #describePlacementGroupsAsync(DescribePlacementGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler) {

        return describePlacementGroupsAsync(new DescribePlacementGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(DescribePrefixListsRequest request) {

        return describePrefixListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(final DescribePrefixListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribePrefixListsResult>() {
            @Override
            public DescribePrefixListsResult call() throws Exception {
                DescribePrefixListsResult result;

                try {
                    result = describePrefixLists(request);
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
     * Simplified method form for invoking the DescribePrefixLists operation.
     *
     * @see #describePrefixListsAsync(DescribePrefixListsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync() {

        return describePrefixListsAsync(new DescribePrefixListsRequest());
    }

    /**
     * Simplified method form for invoking the DescribePrefixLists operation with an AsyncHandler.
     *
     * @see #describePrefixListsAsync(DescribePrefixListsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler) {

        return describePrefixListsAsync(new DescribePrefixListsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest request) {

        return describeRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(final DescribeRegionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegionsResult>() {
            @Override
            public DescribeRegionsResult call() throws Exception {
                DescribeRegionsResult result;

                try {
                    result = describeRegions(request);
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
     * Simplified method form for invoking the DescribeRegions operation.
     *
     * @see #describeRegionsAsync(DescribeRegionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync() {

        return describeRegionsAsync(new DescribeRegionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeRegions operation with an AsyncHandler.
     *
     * @see #describeRegionsAsync(DescribeRegionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler) {

        return describeRegionsAsync(new DescribeRegionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest request) {

        return describeReservedInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(final DescribeReservedInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesResult>() {
            @Override
            public DescribeReservedInstancesResult call() throws Exception {
                DescribeReservedInstancesResult result;

                try {
                    result = describeReservedInstances(request);
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
     * Simplified method form for invoking the DescribeReservedInstances operation.
     *
     * @see #describeReservedInstancesAsync(DescribeReservedInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync() {

        return describeReservedInstancesAsync(new DescribeReservedInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesAsync(DescribeReservedInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler) {

        return describeReservedInstancesAsync(new DescribeReservedInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            DescribeReservedInstancesListingsRequest request) {

        return describeReservedInstancesListingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            final DescribeReservedInstancesListingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesListingsResult>() {
            @Override
            public DescribeReservedInstancesListingsResult call() throws Exception {
                DescribeReservedInstancesListingsResult result;

                try {
                    result = describeReservedInstancesListings(request);
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
     * Simplified method form for invoking the DescribeReservedInstancesListings operation.
     *
     * @see #describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync() {

        return describeReservedInstancesListingsAsync(new DescribeReservedInstancesListingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler) {

        return describeReservedInstancesListingsAsync(new DescribeReservedInstancesListingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            DescribeReservedInstancesModificationsRequest request) {

        return describeReservedInstancesModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            final DescribeReservedInstancesModificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesModificationsResult>() {
            @Override
            public DescribeReservedInstancesModificationsResult call() throws Exception {
                DescribeReservedInstancesModificationsResult result;

                try {
                    result = describeReservedInstancesModifications(request);
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
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation.
     *
     * @see #describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync() {

        return describeReservedInstancesModificationsAsync(new DescribeReservedInstancesModificationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler) {

        return describeReservedInstancesModificationsAsync(new DescribeReservedInstancesModificationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            DescribeReservedInstancesOfferingsRequest request) {

        return describeReservedInstancesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            final DescribeReservedInstancesOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesOfferingsResult>() {
            @Override
            public DescribeReservedInstancesOfferingsResult call() throws Exception {
                DescribeReservedInstancesOfferingsResult result;

                try {
                    result = describeReservedInstancesOfferings(request);
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
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation.
     *
     * @see #describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync() {

        return describeReservedInstancesOfferingsAsync(new DescribeReservedInstancesOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler) {

        return describeReservedInstancesOfferingsAsync(new DescribeReservedInstancesOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest request) {

        return describeRouteTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(final DescribeRouteTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRouteTablesResult>() {
            @Override
            public DescribeRouteTablesResult call() throws Exception {
                DescribeRouteTablesResult result;

                try {
                    result = describeRouteTables(request);
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
     * Simplified method form for invoking the DescribeRouteTables operation.
     *
     * @see #describeRouteTablesAsync(DescribeRouteTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync() {

        return describeRouteTablesAsync(new DescribeRouteTablesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeRouteTables operation with an AsyncHandler.
     *
     * @see #describeRouteTablesAsync(DescribeRouteTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeRouteTablesResult> describeRouteTablesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler) {

        return describeRouteTablesAsync(new DescribeRouteTablesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstanceAvailabilityResult> describeScheduledInstanceAvailabilityAsync(
            DescribeScheduledInstanceAvailabilityRequest request) {

        return describeScheduledInstanceAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstanceAvailabilityResult> describeScheduledInstanceAvailabilityAsync(
            final DescribeScheduledInstanceAvailabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstanceAvailabilityRequest, DescribeScheduledInstanceAvailabilityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduledInstanceAvailabilityResult>() {
            @Override
            public DescribeScheduledInstanceAvailabilityResult call() throws Exception {
                DescribeScheduledInstanceAvailabilityResult result;

                try {
                    result = describeScheduledInstanceAvailability(request);
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
    public java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(DescribeScheduledInstancesRequest request) {

        return describeScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(final DescribeScheduledInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstancesRequest, DescribeScheduledInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduledInstancesResult>() {
            @Override
            public DescribeScheduledInstancesResult call() throws Exception {
                DescribeScheduledInstancesResult result;

                try {
                    result = describeScheduledInstances(request);
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
    public java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            DescribeSecurityGroupReferencesRequest request) {

        return describeSecurityGroupReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            final DescribeSecurityGroupReferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupReferencesRequest, DescribeSecurityGroupReferencesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityGroupReferencesResult>() {
            @Override
            public DescribeSecurityGroupReferencesResult call() throws Exception {
                DescribeSecurityGroupReferencesResult result;

                try {
                    result = describeSecurityGroupReferences(request);
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
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest request) {

        return describeSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(final DescribeSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityGroupsResult>() {
            @Override
            public DescribeSecurityGroupsResult call() throws Exception {
                DescribeSecurityGroupsResult result;

                try {
                    result = describeSecurityGroups(request);
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
     * Simplified method form for invoking the DescribeSecurityGroups operation.
     *
     * @see #describeSecurityGroupsAsync(DescribeSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync() {

        return describeSecurityGroupsAsync(new DescribeSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeSecurityGroupsAsync(DescribeSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler) {

        return describeSecurityGroupsAsync(new DescribeSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(DescribeSnapshotAttributeRequest request) {

        return describeSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(final DescribeSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotAttributeRequest, DescribeSnapshotAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotAttributeResult>() {
            @Override
            public DescribeSnapshotAttributeResult call() throws Exception {
                DescribeSnapshotAttributeResult result;

                try {
                    result = describeSnapshotAttribute(request);
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
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotsResult>() {
            @Override
            public DescribeSnapshotsResult call() throws Exception {
                DescribeSnapshotsResult result;

                try {
                    result = describeSnapshots(request);
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
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync() {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            DescribeSpotDatafeedSubscriptionRequest request) {

        return describeSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            final DescribeSpotDatafeedSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotDatafeedSubscriptionResult>() {
            @Override
            public DescribeSpotDatafeedSubscriptionResult call() throws Exception {
                DescribeSpotDatafeedSubscriptionResult result;

                try {
                    result = describeSpotDatafeedSubscription(request);
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
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation.
     *
     * @see #describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync() {

        return describeSpotDatafeedSubscriptionAsync(new DescribeSpotDatafeedSubscriptionRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation with an AsyncHandler.
     *
     * @see #describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler) {

        return describeSpotDatafeedSubscriptionAsync(new DescribeSpotDatafeedSubscriptionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetInstancesResult> describeSpotFleetInstancesAsync(DescribeSpotFleetInstancesRequest request) {

        return describeSpotFleetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetInstancesResult> describeSpotFleetInstancesAsync(final DescribeSpotFleetInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetInstancesRequest, DescribeSpotFleetInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotFleetInstancesResult>() {
            @Override
            public DescribeSpotFleetInstancesResult call() throws Exception {
                DescribeSpotFleetInstancesResult result;

                try {
                    result = describeSpotFleetInstances(request);
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
    public java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            DescribeSpotFleetRequestHistoryRequest request) {

        return describeSpotFleetRequestHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            final DescribeSpotFleetRequestHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestHistoryRequest, DescribeSpotFleetRequestHistoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotFleetRequestHistoryResult>() {
            @Override
            public DescribeSpotFleetRequestHistoryResult call() throws Exception {
                DescribeSpotFleetRequestHistoryResult result;

                try {
                    result = describeSpotFleetRequestHistory(request);
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
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest request) {

        return describeSpotFleetRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(final DescribeSpotFleetRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotFleetRequestsResult>() {
            @Override
            public DescribeSpotFleetRequestsResult call() throws Exception {
                DescribeSpotFleetRequestsResult result;

                try {
                    result = describeSpotFleetRequests(request);
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
     * Simplified method form for invoking the DescribeSpotFleetRequests operation.
     *
     * @see #describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync() {

        return describeSpotFleetRequestsAsync(new DescribeSpotFleetRequestsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation with an AsyncHandler.
     *
     * @see #describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler) {

        return describeSpotFleetRequestsAsync(new DescribeSpotFleetRequestsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest request) {

        return describeSpotInstanceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(final DescribeSpotInstanceRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotInstanceRequestsResult>() {
            @Override
            public DescribeSpotInstanceRequestsResult call() throws Exception {
                DescribeSpotInstanceRequestsResult result;

                try {
                    result = describeSpotInstanceRequests(request);
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
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation.
     *
     * @see #describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync() {

        return describeSpotInstanceRequestsAsync(new DescribeSpotInstanceRequestsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation with an AsyncHandler.
     *
     * @see #describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler) {

        return describeSpotInstanceRequestsAsync(new DescribeSpotInstanceRequestsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest request) {

        return describeSpotPriceHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(final DescribeSpotPriceHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotPriceHistoryResult>() {
            @Override
            public DescribeSpotPriceHistoryResult call() throws Exception {
                DescribeSpotPriceHistoryResult result;

                try {
                    result = describeSpotPriceHistory(request);
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
     * Simplified method form for invoking the DescribeSpotPriceHistory operation.
     *
     * @see #describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync() {

        return describeSpotPriceHistoryAsync(new DescribeSpotPriceHistoryRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation with an AsyncHandler.
     *
     * @see #describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler) {

        return describeSpotPriceHistoryAsync(new DescribeSpotPriceHistoryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStaleSecurityGroupsResult> describeStaleSecurityGroupsAsync(DescribeStaleSecurityGroupsRequest request) {

        return describeStaleSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStaleSecurityGroupsResult> describeStaleSecurityGroupsAsync(final DescribeStaleSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStaleSecurityGroupsRequest, DescribeStaleSecurityGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeStaleSecurityGroupsResult>() {
            @Override
            public DescribeStaleSecurityGroupsResult call() throws Exception {
                DescribeStaleSecurityGroupsResult result;

                try {
                    result = describeStaleSecurityGroups(request);
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
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest request) {

        return describeSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(final DescribeSubnetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubnetsResult>() {
            @Override
            public DescribeSubnetsResult call() throws Exception {
                DescribeSubnetsResult result;

                try {
                    result = describeSubnets(request);
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
     * Simplified method form for invoking the DescribeSubnets operation.
     *
     * @see #describeSubnetsAsync(DescribeSubnetsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync() {

        return describeSubnetsAsync(new DescribeSubnetsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSubnets operation with an AsyncHandler.
     *
     * @see #describeSubnetsAsync(DescribeSubnetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler) {

        return describeSubnetsAsync(new DescribeSubnetsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result;

                try {
                    result = describeTags(request);
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
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync() {

        return describeTagsAsync(new DescribeTagsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest request) {

        return describeVolumeAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(final DescribeVolumeAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumeAttributeRequest, DescribeVolumeAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumeAttributeResult>() {
            @Override
            public DescribeVolumeAttributeResult call() throws Exception {
                DescribeVolumeAttributeResult result;

                try {
                    result = describeVolumeAttribute(request);
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
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest request) {

        return describeVolumeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(final DescribeVolumeStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumeStatusResult>() {
            @Override
            public DescribeVolumeStatusResult call() throws Exception {
                DescribeVolumeStatusResult result;

                try {
                    result = describeVolumeStatus(request);
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
     * Simplified method form for invoking the DescribeVolumeStatus operation.
     *
     * @see #describeVolumeStatusAsync(DescribeVolumeStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync() {

        return describeVolumeStatusAsync(new DescribeVolumeStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation with an AsyncHandler.
     *
     * @see #describeVolumeStatusAsync(DescribeVolumeStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler) {

        return describeVolumeStatusAsync(new DescribeVolumeStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(final DescribeVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumesResult>() {
            @Override
            public DescribeVolumesResult call() throws Exception {
                DescribeVolumesResult result;

                try {
                    result = describeVolumes(request);
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
     * Simplified method form for invoking the DescribeVolumes operation.
     *
     * @see #describeVolumesAsync(DescribeVolumesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync() {

        return describeVolumesAsync(new DescribeVolumesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVolumes operation with an AsyncHandler.
     *
     * @see #describeVolumesAsync(DescribeVolumesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        return describeVolumesAsync(new DescribeVolumesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest request) {

        return describeVpcAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(final DescribeVpcAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcAttributeRequest, DescribeVpcAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcAttributeResult>() {
            @Override
            public DescribeVpcAttributeResult call() throws Exception {
                DescribeVpcAttributeResult result;

                try {
                    result = describeVpcAttribute(request);
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
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest request) {

        return describeVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(final DescribeVpcClassicLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcClassicLinkResult>() {
            @Override
            public DescribeVpcClassicLinkResult call() throws Exception {
                DescribeVpcClassicLinkResult result;

                try {
                    result = describeVpcClassicLink(request);
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
     * Simplified method form for invoking the DescribeVpcClassicLink operation.
     *
     * @see #describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync() {

        return describeVpcClassicLinkAsync(new DescribeVpcClassicLinkRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation with an AsyncHandler.
     *
     * @see #describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler) {

        return describeVpcClassicLinkAsync(new DescribeVpcClassicLinkRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkDnsSupportResult> describeVpcClassicLinkDnsSupportAsync(
            DescribeVpcClassicLinkDnsSupportRequest request) {

        return describeVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkDnsSupportResult> describeVpcClassicLinkDnsSupportAsync(
            final DescribeVpcClassicLinkDnsSupportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkDnsSupportRequest, DescribeVpcClassicLinkDnsSupportResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcClassicLinkDnsSupportResult>() {
            @Override
            public DescribeVpcClassicLinkDnsSupportResult call() throws Exception {
                DescribeVpcClassicLinkDnsSupportResult result;

                try {
                    result = describeVpcClassicLinkDnsSupport(request);
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
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest request) {

        return describeVpcEndpointServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(final DescribeVpcEndpointServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointServicesResult>() {
            @Override
            public DescribeVpcEndpointServicesResult call() throws Exception {
                DescribeVpcEndpointServicesResult result;

                try {
                    result = describeVpcEndpointServices(request);
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
     * Simplified method form for invoking the DescribeVpcEndpointServices operation.
     *
     * @see #describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync() {

        return describeVpcEndpointServicesAsync(new DescribeVpcEndpointServicesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation with an AsyncHandler.
     *
     * @see #describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler) {

        return describeVpcEndpointServicesAsync(new DescribeVpcEndpointServicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest request) {

        return describeVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(final DescribeVpcEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointsResult>() {
            @Override
            public DescribeVpcEndpointsResult call() throws Exception {
                DescribeVpcEndpointsResult result;

                try {
                    result = describeVpcEndpoints(request);
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
     * Simplified method form for invoking the DescribeVpcEndpoints operation.
     *
     * @see #describeVpcEndpointsAsync(DescribeVpcEndpointsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync() {

        return describeVpcEndpointsAsync(new DescribeVpcEndpointsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation with an AsyncHandler.
     *
     * @see #describeVpcEndpointsAsync(DescribeVpcEndpointsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler) {

        return describeVpcEndpointsAsync(new DescribeVpcEndpointsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest request) {

        return describeVpcPeeringConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            final DescribeVpcPeeringConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcPeeringConnectionsResult>() {
            @Override
            public DescribeVpcPeeringConnectionsResult call() throws Exception {
                DescribeVpcPeeringConnectionsResult result;

                try {
                    result = describeVpcPeeringConnections(request);
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
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation.
     *
     * @see #describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync() {

        return describeVpcPeeringConnectionsAsync(new DescribeVpcPeeringConnectionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation with an AsyncHandler.
     *
     * @see #describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler) {

        return describeVpcPeeringConnectionsAsync(new DescribeVpcPeeringConnectionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest request) {

        return describeVpcsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(final DescribeVpcsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcsResult>() {
            @Override
            public DescribeVpcsResult call() throws Exception {
                DescribeVpcsResult result;

                try {
                    result = describeVpcs(request);
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
     * Simplified method form for invoking the DescribeVpcs operation.
     *
     * @see #describeVpcsAsync(DescribeVpcsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync() {

        return describeVpcsAsync(new DescribeVpcsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpcs operation with an AsyncHandler.
     *
     * @see #describeVpcsAsync(DescribeVpcsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpcsResult> describeVpcsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler) {

        return describeVpcsAsync(new DescribeVpcsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest request) {

        return describeVpnConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(final DescribeVpnConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpnConnectionsResult>() {
            @Override
            public DescribeVpnConnectionsResult call() throws Exception {
                DescribeVpnConnectionsResult result;

                try {
                    result = describeVpnConnections(request);
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
     * Simplified method form for invoking the DescribeVpnConnections operation.
     *
     * @see #describeVpnConnectionsAsync(DescribeVpnConnectionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync() {

        return describeVpnConnectionsAsync(new DescribeVpnConnectionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation with an AsyncHandler.
     *
     * @see #describeVpnConnectionsAsync(DescribeVpnConnectionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler) {

        return describeVpnConnectionsAsync(new DescribeVpnConnectionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest request) {

        return describeVpnGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(final DescribeVpnGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpnGatewaysResult>() {
            @Override
            public DescribeVpnGatewaysResult call() throws Exception {
                DescribeVpnGatewaysResult result;

                try {
                    result = describeVpnGateways(request);
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
     * Simplified method form for invoking the DescribeVpnGateways operation.
     *
     * @see #describeVpnGatewaysAsync(DescribeVpnGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync() {

        return describeVpnGatewaysAsync(new DescribeVpnGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation with an AsyncHandler.
     *
     * @see #describeVpnGatewaysAsync(DescribeVpnGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler) {

        return describeVpnGatewaysAsync(new DescribeVpnGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DetachClassicLinkVpcResult> detachClassicLinkVpcAsync(DetachClassicLinkVpcRequest request) {

        return detachClassicLinkVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachClassicLinkVpcResult> detachClassicLinkVpcAsync(final DetachClassicLinkVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachClassicLinkVpcRequest, DetachClassicLinkVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachClassicLinkVpcResult>() {
            @Override
            public DetachClassicLinkVpcResult call() throws Exception {
                DetachClassicLinkVpcResult result;

                try {
                    result = detachClassicLinkVpc(request);
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
    public java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(DetachInternetGatewayRequest request) {

        return detachInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(final DetachInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachInternetGatewayRequest, DetachInternetGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachInternetGatewayResult>() {
            @Override
            public DetachInternetGatewayResult call() throws Exception {
                DetachInternetGatewayResult result;

                try {
                    result = detachInternetGateway(request);
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
    public java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest request) {

        return detachNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(final DetachNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachNetworkInterfaceRequest, DetachNetworkInterfaceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachNetworkInterfaceResult>() {
            @Override
            public DetachNetworkInterfaceResult call() throws Exception {
                DetachNetworkInterfaceResult result;

                try {
                    result = detachNetworkInterface(request);
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
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest request) {

        return detachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(final DetachVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachVolumeResult>() {
            @Override
            public DetachVolumeResult call() throws Exception {
                DetachVolumeResult result;

                try {
                    result = detachVolume(request);
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
    public java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(DetachVpnGatewayRequest request) {

        return detachVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(final DetachVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachVpnGatewayRequest, DetachVpnGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachVpnGatewayResult>() {
            @Override
            public DetachVpnGatewayResult call() throws Exception {
                DetachVpnGatewayResult result;

                try {
                    result = detachVpnGateway(request);
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
    public java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(DisableVgwRoutePropagationRequest request) {

        return disableVgwRoutePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(final DisableVgwRoutePropagationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableVgwRoutePropagationRequest, DisableVgwRoutePropagationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableVgwRoutePropagationResult>() {
            @Override
            public DisableVgwRoutePropagationResult call() throws Exception {
                DisableVgwRoutePropagationResult result;

                try {
                    result = disableVgwRoutePropagation(request);
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
    public java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(DisableVpcClassicLinkRequest request) {

        return disableVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(final DisableVpcClassicLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkRequest, DisableVpcClassicLinkResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableVpcClassicLinkResult>() {
            @Override
            public DisableVpcClassicLinkResult call() throws Exception {
                DisableVpcClassicLinkResult result;

                try {
                    result = disableVpcClassicLink(request);
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
    public java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            DisableVpcClassicLinkDnsSupportRequest request) {

        return disableVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            final DisableVpcClassicLinkDnsSupportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkDnsSupportRequest, DisableVpcClassicLinkDnsSupportResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableVpcClassicLinkDnsSupportResult>() {
            @Override
            public DisableVpcClassicLinkDnsSupportResult call() throws Exception {
                DisableVpcClassicLinkDnsSupportResult result;

                try {
                    result = disableVpcClassicLinkDnsSupport(request);
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
    public java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(DisassociateAddressRequest request) {

        return disassociateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(final DisassociateAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAddressRequest, DisassociateAddressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAddressResult>() {
            @Override
            public DisassociateAddressResult call() throws Exception {
                DisassociateAddressResult result;

                try {
                    result = disassociateAddress(request);
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
    public java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(DisassociateRouteTableRequest request) {

        return disassociateRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(final DisassociateRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRouteTableRequest, DisassociateRouteTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRouteTableResult>() {
            @Override
            public DisassociateRouteTableResult call() throws Exception {
                DisassociateRouteTableResult result;

                try {
                    result = disassociateRouteTable(request);
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
    public java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(EnableVgwRoutePropagationRequest request) {

        return enableVgwRoutePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(final EnableVgwRoutePropagationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVgwRoutePropagationRequest, EnableVgwRoutePropagationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableVgwRoutePropagationResult>() {
            @Override
            public EnableVgwRoutePropagationResult call() throws Exception {
                EnableVgwRoutePropagationResult result;

                try {
                    result = enableVgwRoutePropagation(request);
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
    public java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(EnableVolumeIORequest request) {

        return enableVolumeIOAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(final EnableVolumeIORequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVolumeIORequest, EnableVolumeIOResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableVolumeIOResult>() {
            @Override
            public EnableVolumeIOResult call() throws Exception {
                EnableVolumeIOResult result;

                try {
                    result = enableVolumeIO(request);
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
    public java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(EnableVpcClassicLinkRequest request) {

        return enableVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(final EnableVpcClassicLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkRequest, EnableVpcClassicLinkResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableVpcClassicLinkResult>() {
            @Override
            public EnableVpcClassicLinkResult call() throws Exception {
                EnableVpcClassicLinkResult result;

                try {
                    result = enableVpcClassicLink(request);
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
    public java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(EnableVpcClassicLinkDnsSupportRequest request) {

        return enableVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(
            final EnableVpcClassicLinkDnsSupportRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkDnsSupportRequest, EnableVpcClassicLinkDnsSupportResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableVpcClassicLinkDnsSupportResult>() {
            @Override
            public EnableVpcClassicLinkDnsSupportResult call() throws Exception {
                EnableVpcClassicLinkDnsSupportResult result;

                try {
                    result = enableVpcClassicLinkDnsSupport(request);
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
    public java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest request) {

        return getConsoleOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(final GetConsoleOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConsoleOutputRequest, GetConsoleOutputResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetConsoleOutputResult>() {
            @Override
            public GetConsoleOutputResult call() throws Exception {
                GetConsoleOutputResult result;

                try {
                    result = getConsoleOutput(request);
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
    public java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(GetConsoleScreenshotRequest request) {

        return getConsoleScreenshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(final GetConsoleScreenshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConsoleScreenshotRequest, GetConsoleScreenshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetConsoleScreenshotResult>() {
            @Override
            public GetConsoleScreenshotResult call() throws Exception {
                GetConsoleScreenshotResult result;

                try {
                    result = getConsoleScreenshot(request);
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
    public java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            GetHostReservationPurchasePreviewRequest request) {

        return getHostReservationPurchasePreviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            final GetHostReservationPurchasePreviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostReservationPurchasePreviewRequest, GetHostReservationPurchasePreviewResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetHostReservationPurchasePreviewResult>() {
            @Override
            public GetHostReservationPurchasePreviewResult call() throws Exception {
                GetHostReservationPurchasePreviewResult result;

                try {
                    result = getHostReservationPurchasePreview(request);
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
    public java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest request) {

        return getPasswordDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(final GetPasswordDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPasswordDataRequest, GetPasswordDataResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPasswordDataResult>() {
            @Override
            public GetPasswordDataResult call() throws Exception {
                GetPasswordDataResult result;

                try {
                    result = getPasswordData(request);
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
    public java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            GetReservedInstancesExchangeQuoteRequest request) {

        return getReservedInstancesExchangeQuoteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            final GetReservedInstancesExchangeQuoteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReservedInstancesExchangeQuoteRequest, GetReservedInstancesExchangeQuoteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetReservedInstancesExchangeQuoteResult>() {
            @Override
            public GetReservedInstancesExchangeQuoteResult call() throws Exception {
                GetReservedInstancesExchangeQuoteResult result;

                try {
                    result = getReservedInstancesExchangeQuote(request);
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
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(ImportImageRequest request) {

        return importImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(final ImportImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportImageResult>() {
            @Override
            public ImportImageResult call() throws Exception {
                ImportImageResult result;

                try {
                    result = importImage(request);
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
     * Simplified method form for invoking the ImportImage operation.
     *
     * @see #importImageAsync(ImportImageRequest)
     */
    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync() {

        return importImageAsync(new ImportImageRequest());
    }

    /**
     * Simplified method form for invoking the ImportImage operation with an AsyncHandler.
     *
     * @see #importImageAsync(ImportImageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(
            com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler) {

        return importImageAsync(new ImportImageRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest request) {

        return importInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportInstanceResult> importInstanceAsync(final ImportInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportInstanceRequest, ImportInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportInstanceResult>() {
            @Override
            public ImportInstanceResult call() throws Exception {
                ImportInstanceResult result;

                try {
                    result = importInstance(request);
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
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request) {

        return importKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(final ImportKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportKeyPairResult>() {
            @Override
            public ImportKeyPairResult call() throws Exception {
                ImportKeyPairResult result;

                try {
                    result = importKeyPair(request);
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
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(ImportSnapshotRequest request) {

        return importSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(final ImportSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportSnapshotResult>() {
            @Override
            public ImportSnapshotResult call() throws Exception {
                ImportSnapshotResult result;

                try {
                    result = importSnapshot(request);
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
     * Simplified method form for invoking the ImportSnapshot operation.
     *
     * @see #importSnapshotAsync(ImportSnapshotRequest)
     */
    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync() {

        return importSnapshotAsync(new ImportSnapshotRequest());
    }

    /**
     * Simplified method form for invoking the ImportSnapshot operation with an AsyncHandler.
     *
     * @see #importSnapshotAsync(ImportSnapshotRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(
            com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler) {

        return importSnapshotAsync(new ImportSnapshotRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest request) {

        return importVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportVolumeResult> importVolumeAsync(final ImportVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportVolumeRequest, ImportVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportVolumeResult>() {
            @Override
            public ImportVolumeResult call() throws Exception {
                ImportVolumeResult result;

                try {
                    result = importVolume(request);
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
    public java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(ModifyHostsRequest request) {

        return modifyHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(final ModifyHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyHostsRequest, ModifyHostsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyHostsResult>() {
            @Override
            public ModifyHostsResult call() throws Exception {
                ModifyHostsResult result;

                try {
                    result = modifyHosts(request);
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
    public java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(ModifyIdFormatRequest request) {

        return modifyIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(final ModifyIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyIdFormatRequest, ModifyIdFormatResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyIdFormatResult>() {
            @Override
            public ModifyIdFormatResult call() throws Exception {
                ModifyIdFormatResult result;

                try {
                    result = modifyIdFormat(request);
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
    public java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(ModifyIdentityIdFormatRequest request) {

        return modifyIdentityIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(final ModifyIdentityIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyIdentityIdFormatRequest, ModifyIdentityIdFormatResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyIdentityIdFormatResult>() {
            @Override
            public ModifyIdentityIdFormatResult call() throws Exception {
                ModifyIdentityIdFormatResult result;

                try {
                    result = modifyIdentityIdFormat(request);
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
    public java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest request) {

        return modifyImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(final ModifyImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyImageAttributeRequest, ModifyImageAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyImageAttributeResult>() {
            @Override
            public ModifyImageAttributeResult call() throws Exception {
                ModifyImageAttributeResult result;

                try {
                    result = modifyImageAttribute(request);
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
    public java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest request) {

        return modifyInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(final ModifyInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceAttributeRequest, ModifyInstanceAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceAttributeResult>() {
            @Override
            public ModifyInstanceAttributeResult call() throws Exception {
                ModifyInstanceAttributeResult result;

                try {
                    result = modifyInstanceAttribute(request);
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
    public java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(ModifyInstancePlacementRequest request) {

        return modifyInstancePlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(final ModifyInstancePlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstancePlacementRequest, ModifyInstancePlacementResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstancePlacementResult>() {
            @Override
            public ModifyInstancePlacementResult call() throws Exception {
                ModifyInstancePlacementResult result;

                try {
                    result = modifyInstancePlacement(request);
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
    public java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            ModifyNetworkInterfaceAttributeRequest request) {

        return modifyNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            final ModifyNetworkInterfaceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyNetworkInterfaceAttributeRequest, ModifyNetworkInterfaceAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyNetworkInterfaceAttributeResult>() {
            @Override
            public ModifyNetworkInterfaceAttributeResult call() throws Exception {
                ModifyNetworkInterfaceAttributeResult result;

                try {
                    result = modifyNetworkInterfaceAttribute(request);
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
    public java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest request) {

        return modifyReservedInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(final ModifyReservedInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReservedInstancesRequest, ModifyReservedInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyReservedInstancesResult>() {
            @Override
            public ModifyReservedInstancesResult call() throws Exception {
                ModifyReservedInstancesResult result;

                try {
                    result = modifyReservedInstances(request);
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
    public java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest request) {

        return modifySnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(final ModifySnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySnapshotAttributeRequest, ModifySnapshotAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifySnapshotAttributeResult>() {
            @Override
            public ModifySnapshotAttributeResult call() throws Exception {
                ModifySnapshotAttributeResult result;

                try {
                    result = modifySnapshotAttribute(request);
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
    public java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(ModifySpotFleetRequestRequest request) {

        return modifySpotFleetRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(final ModifySpotFleetRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySpotFleetRequestRequest, ModifySpotFleetRequestResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifySpotFleetRequestResult>() {
            @Override
            public ModifySpotFleetRequestResult call() throws Exception {
                ModifySpotFleetRequestResult result;

                try {
                    result = modifySpotFleetRequest(request);
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
    public java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(ModifySubnetAttributeRequest request) {

        return modifySubnetAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(final ModifySubnetAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySubnetAttributeRequest, ModifySubnetAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifySubnetAttributeResult>() {
            @Override
            public ModifySubnetAttributeResult call() throws Exception {
                ModifySubnetAttributeResult result;

                try {
                    result = modifySubnetAttribute(request);
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
    public java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest request) {

        return modifyVolumeAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(final ModifyVolumeAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVolumeAttributeRequest, ModifyVolumeAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyVolumeAttributeResult>() {
            @Override
            public ModifyVolumeAttributeResult call() throws Exception {
                ModifyVolumeAttributeResult result;

                try {
                    result = modifyVolumeAttribute(request);
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
    public java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(ModifyVpcAttributeRequest request) {

        return modifyVpcAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(final ModifyVpcAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcAttributeRequest, ModifyVpcAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcAttributeResult>() {
            @Override
            public ModifyVpcAttributeResult call() throws Exception {
                ModifyVpcAttributeResult result;

                try {
                    result = modifyVpcAttribute(request);
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
    public java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(ModifyVpcEndpointRequest request) {

        return modifyVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(final ModifyVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointRequest, ModifyVpcEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcEndpointResult>() {
            @Override
            public ModifyVpcEndpointResult call() throws Exception {
                ModifyVpcEndpointResult result;

                try {
                    result = modifyVpcEndpoint(request);
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
    public java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            ModifyVpcPeeringConnectionOptionsRequest request) {

        return modifyVpcPeeringConnectionOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            final ModifyVpcPeeringConnectionOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcPeeringConnectionOptionsRequest, ModifyVpcPeeringConnectionOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcPeeringConnectionOptionsResult>() {
            @Override
            public ModifyVpcPeeringConnectionOptionsResult call() throws Exception {
                ModifyVpcPeeringConnectionOptionsResult result;

                try {
                    result = modifyVpcPeeringConnectionOptions(request);
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
    public java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest request) {

        return monitorInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(final MonitorInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<MonitorInstancesRequest, MonitorInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<MonitorInstancesResult>() {
            @Override
            public MonitorInstancesResult call() throws Exception {
                MonitorInstancesResult result;

                try {
                    result = monitorInstances(request);
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
    public java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(MoveAddressToVpcRequest request) {

        return moveAddressToVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(final MoveAddressToVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<MoveAddressToVpcRequest, MoveAddressToVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<MoveAddressToVpcResult>() {
            @Override
            public MoveAddressToVpcResult call() throws Exception {
                MoveAddressToVpcResult result;

                try {
                    result = moveAddressToVpc(request);
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
    public java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(PurchaseHostReservationRequest request) {

        return purchaseHostReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(final PurchaseHostReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseHostReservationRequest, PurchaseHostReservationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PurchaseHostReservationResult>() {
            @Override
            public PurchaseHostReservationResult call() throws Exception {
                PurchaseHostReservationResult result;

                try {
                    result = purchaseHostReservation(request);
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
    public java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            PurchaseReservedInstancesOfferingRequest request) {

        return purchaseReservedInstancesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            final PurchaseReservedInstancesOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PurchaseReservedInstancesOfferingResult>() {
            @Override
            public PurchaseReservedInstancesOfferingResult call() throws Exception {
                PurchaseReservedInstancesOfferingResult result;

                try {
                    result = purchaseReservedInstancesOffering(request);
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
    public java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(PurchaseScheduledInstancesRequest request) {

        return purchaseScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(final PurchaseScheduledInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseScheduledInstancesRequest, PurchaseScheduledInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PurchaseScheduledInstancesResult>() {
            @Override
            public PurchaseScheduledInstancesResult call() throws Exception {
                PurchaseScheduledInstancesResult result;

                try {
                    result = purchaseScheduledInstances(request);
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
    public java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(RebootInstancesRequest request) {

        return rebootInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(final RebootInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInstancesRequest, RebootInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RebootInstancesResult>() {
            @Override
            public RebootInstancesResult call() throws Exception {
                RebootInstancesResult result;

                try {
                    result = rebootInstances(request);
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
    public java.util.concurrent.Future<RegisterImageResult> registerImageAsync(RegisterImageRequest request) {

        return registerImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterImageResult> registerImageAsync(final RegisterImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterImageRequest, RegisterImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterImageResult>() {
            @Override
            public RegisterImageResult call() throws Exception {
                RegisterImageResult result;

                try {
                    result = registerImage(request);
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
    public java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(RejectVpcPeeringConnectionRequest request) {

        return rejectVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(final RejectVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectVpcPeeringConnectionRequest, RejectVpcPeeringConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RejectVpcPeeringConnectionResult>() {
            @Override
            public RejectVpcPeeringConnectionResult call() throws Exception {
                RejectVpcPeeringConnectionResult result;

                try {
                    result = rejectVpcPeeringConnection(request);
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
    public java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(ReleaseAddressRequest request) {

        return releaseAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(final ReleaseAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseAddressRequest, ReleaseAddressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReleaseAddressResult>() {
            @Override
            public ReleaseAddressResult call() throws Exception {
                ReleaseAddressResult result;

                try {
                    result = releaseAddress(request);
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
    public java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(ReleaseHostsRequest request) {

        return releaseHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(final ReleaseHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseHostsRequest, ReleaseHostsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReleaseHostsResult>() {
            @Override
            public ReleaseHostsResult call() throws Exception {
                ReleaseHostsResult result;

                try {
                    result = releaseHosts(request);
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
    public java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(ReplaceNetworkAclAssociationRequest request) {

        return replaceNetworkAclAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(final ReplaceNetworkAclAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReplaceNetworkAclAssociationResult>() {
            @Override
            public ReplaceNetworkAclAssociationResult call() throws Exception {
                ReplaceNetworkAclAssociationResult result;

                try {
                    result = replaceNetworkAclAssociation(request);
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
    public java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest request) {

        return replaceNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(final ReplaceNetworkAclEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclEntryRequest, ReplaceNetworkAclEntryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReplaceNetworkAclEntryResult>() {
            @Override
            public ReplaceNetworkAclEntryResult call() throws Exception {
                ReplaceNetworkAclEntryResult result;

                try {
                    result = replaceNetworkAclEntry(request);
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
    public java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(ReplaceRouteRequest request) {

        return replaceRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(final ReplaceRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceRouteRequest, ReplaceRouteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReplaceRouteResult>() {
            @Override
            public ReplaceRouteResult call() throws Exception {
                ReplaceRouteResult result;

                try {
                    result = replaceRoute(request);
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
    public java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(ReplaceRouteTableAssociationRequest request) {

        return replaceRouteTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(final ReplaceRouteTableAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReplaceRouteTableAssociationResult>() {
            @Override
            public ReplaceRouteTableAssociationResult call() throws Exception {
                ReplaceRouteTableAssociationResult result;

                try {
                    result = replaceRouteTableAssociation(request);
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
    public java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(ReportInstanceStatusRequest request) {

        return reportInstanceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(final ReportInstanceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReportInstanceStatusRequest, ReportInstanceStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReportInstanceStatusResult>() {
            @Override
            public ReportInstanceStatusResult call() throws Exception {
                ReportInstanceStatusResult result;

                try {
                    result = reportInstanceStatus(request);
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
    public java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(RequestSpotFleetRequest request) {

        return requestSpotFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(final RequestSpotFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestSpotFleetRequest, RequestSpotFleetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RequestSpotFleetResult>() {
            @Override
            public RequestSpotFleetResult call() throws Exception {
                RequestSpotFleetResult result;

                try {
                    result = requestSpotFleet(request);
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
    public java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest request) {

        return requestSpotInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(final RequestSpotInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestSpotInstancesRequest, RequestSpotInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RequestSpotInstancesResult>() {
            @Override
            public RequestSpotInstancesResult call() throws Exception {
                RequestSpotInstancesResult result;

                try {
                    result = requestSpotInstances(request);
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
    public java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(ResetImageAttributeRequest request) {

        return resetImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(final ResetImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetImageAttributeRequest, ResetImageAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetImageAttributeResult>() {
            @Override
            public ResetImageAttributeResult call() throws Exception {
                ResetImageAttributeResult result;

                try {
                    result = resetImageAttribute(request);
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
    public java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(ResetInstanceAttributeRequest request) {

        return resetInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(final ResetInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetInstanceAttributeRequest, ResetInstanceAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetInstanceAttributeResult>() {
            @Override
            public ResetInstanceAttributeResult call() throws Exception {
                ResetInstanceAttributeResult result;

                try {
                    result = resetInstanceAttribute(request);
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
    public java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(ResetNetworkInterfaceAttributeRequest request) {

        return resetNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(
            final ResetNetworkInterfaceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetNetworkInterfaceAttributeRequest, ResetNetworkInterfaceAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetNetworkInterfaceAttributeResult>() {
            @Override
            public ResetNetworkInterfaceAttributeResult call() throws Exception {
                ResetNetworkInterfaceAttributeResult result;

                try {
                    result = resetNetworkInterfaceAttribute(request);
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
    public java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest request) {

        return resetSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(final ResetSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetSnapshotAttributeRequest, ResetSnapshotAttributeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetSnapshotAttributeResult>() {
            @Override
            public ResetSnapshotAttributeResult call() throws Exception {
                ResetSnapshotAttributeResult result;

                try {
                    result = resetSnapshotAttribute(request);
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
    public java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(RestoreAddressToClassicRequest request) {

        return restoreAddressToClassicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(final RestoreAddressToClassicRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreAddressToClassicRequest, RestoreAddressToClassicResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RestoreAddressToClassicResult>() {
            @Override
            public RestoreAddressToClassicResult call() throws Exception {
                RestoreAddressToClassicResult result;

                try {
                    result = restoreAddressToClassic(request);
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
    public java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(RevokeSecurityGroupEgressRequest request) {

        return revokeSecurityGroupEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(final RevokeSecurityGroupEgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupEgressRequest, RevokeSecurityGroupEgressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RevokeSecurityGroupEgressResult>() {
            @Override
            public RevokeSecurityGroupEgressResult call() throws Exception {
                RevokeSecurityGroupEgressResult result;

                try {
                    result = revokeSecurityGroupEgress(request);
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
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest request) {

        return revokeSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(final RevokeSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RevokeSecurityGroupIngressResult>() {
            @Override
            public RevokeSecurityGroupIngressResult call() throws Exception {
                RevokeSecurityGroupIngressResult result;

                try {
                    result = revokeSecurityGroupIngress(request);
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
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest)
     */
    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync() {

        return revokeSecurityGroupIngressAsync(new RevokeSecurityGroupIngressRequest());
    }

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation with an AsyncHandler.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(
            com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler) {

        return revokeSecurityGroupIngressAsync(new RevokeSecurityGroupIngressRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest request) {

        return runInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunInstancesResult> runInstancesAsync(final RunInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunInstancesRequest, RunInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RunInstancesResult>() {
            @Override
            public RunInstancesResult call() throws Exception {
                RunInstancesResult result;

                try {
                    result = runInstances(request);
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
    public java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(RunScheduledInstancesRequest request) {

        return runScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(final RunScheduledInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunScheduledInstancesRequest, RunScheduledInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RunScheduledInstancesResult>() {
            @Override
            public RunScheduledInstancesResult call() throws Exception {
                RunScheduledInstancesResult result;

                try {
                    result = runScheduledInstances(request);
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
    public java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest request) {

        return startInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(final StartInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstancesRequest, StartInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartInstancesResult>() {
            @Override
            public StartInstancesResult call() throws Exception {
                StartInstancesResult result;

                try {
                    result = startInstances(request);
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
    public java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest request) {

        return stopInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(final StopInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInstancesRequest, StopInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopInstancesResult>() {
            @Override
            public StopInstancesResult call() throws Exception {
                StopInstancesResult result;

                try {
                    result = stopInstances(request);
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
    public java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest request) {

        return terminateInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(final TerminateInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateInstancesRequest, TerminateInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TerminateInstancesResult>() {
            @Override
            public TerminateInstancesResult call() throws Exception {
                TerminateInstancesResult result;

                try {
                    result = terminateInstances(request);
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
    public java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(UnassignPrivateIpAddressesRequest request) {

        return unassignPrivateIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(final UnassignPrivateIpAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignPrivateIpAddressesRequest, UnassignPrivateIpAddressesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UnassignPrivateIpAddressesResult>() {
            @Override
            public UnassignPrivateIpAddressesResult call() throws Exception {
                UnassignPrivateIpAddressesResult result;

                try {
                    result = unassignPrivateIpAddresses(request);
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
    public java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest request) {

        return unmonitorInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(final UnmonitorInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnmonitorInstancesRequest, UnmonitorInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UnmonitorInstancesResult>() {
            @Override
            public UnmonitorInstancesResult call() throws Exception {
                UnmonitorInstancesResult result;

                try {
                    result = unmonitorInstances(request);
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
