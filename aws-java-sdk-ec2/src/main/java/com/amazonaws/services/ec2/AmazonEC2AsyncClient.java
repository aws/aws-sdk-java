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
package com.amazonaws.services.ec2;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon EC2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic Compute Cloud</fullname>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides secure and resizable computing capacity in the AWS cloud. Using
 * Amazon EC2 eliminates the need to invest in hardware up front, so you can develop and deploy applications faster.
 * </p>
 * <p>
 * To learn more about Amazon EC2, Amazon EBS, and Amazon VPC, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/ec2">Amazon EC2 product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/ec2">Amazon EC2 documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/ebs">Amazon EBS product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/vpc">Amazon VPC product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/vpc">Amazon VPC documentation</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonEC2AsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonEC2AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonEC2AsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonEC2AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonEC2AsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EC2 using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonEC2AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
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
     * @deprecated use {@link AmazonEC2AsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonEC2AsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonEC2AsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonEC2AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonEC2AsyncClientBuilder asyncBuilder() {
        return AmazonEC2AsyncClientBuilder.standard();
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
    public ExecutorService getExecutorService() {
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
        final AcceptReservedInstancesExchangeQuoteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptReservedInstancesExchangeQuoteResult>() {
            @Override
            public AcceptReservedInstancesExchangeQuoteResult call() throws Exception {
                AcceptReservedInstancesExchangeQuoteResult result = null;

                try {
                    result = executeAcceptReservedInstancesExchangeQuote(finalRequest);
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
    public java.util.concurrent.Future<AcceptTransitGatewayVpcAttachmentResult> acceptTransitGatewayVpcAttachmentAsync(
            AcceptTransitGatewayVpcAttachmentRequest request) {

        return acceptTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptTransitGatewayVpcAttachmentResult> acceptTransitGatewayVpcAttachmentAsync(
            final AcceptTransitGatewayVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptTransitGatewayVpcAttachmentRequest, AcceptTransitGatewayVpcAttachmentResult> asyncHandler) {
        final AcceptTransitGatewayVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptTransitGatewayVpcAttachmentResult>() {
            @Override
            public AcceptTransitGatewayVpcAttachmentResult call() throws Exception {
                AcceptTransitGatewayVpcAttachmentResult result = null;

                try {
                    result = executeAcceptTransitGatewayVpcAttachment(finalRequest);
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
    public java.util.concurrent.Future<AcceptVpcEndpointConnectionsResult> acceptVpcEndpointConnectionsAsync(AcceptVpcEndpointConnectionsRequest request) {

        return acceptVpcEndpointConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcEndpointConnectionsResult> acceptVpcEndpointConnectionsAsync(final AcceptVpcEndpointConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptVpcEndpointConnectionsRequest, AcceptVpcEndpointConnectionsResult> asyncHandler) {
        final AcceptVpcEndpointConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptVpcEndpointConnectionsResult>() {
            @Override
            public AcceptVpcEndpointConnectionsResult call() throws Exception {
                AcceptVpcEndpointConnectionsResult result = null;

                try {
                    result = executeAcceptVpcEndpointConnections(finalRequest);
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
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(AcceptVpcPeeringConnectionRequest request) {

        return acceptVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(final AcceptVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler) {
        final AcceptVpcPeeringConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptVpcPeeringConnectionResult>() {
            @Override
            public AcceptVpcPeeringConnectionResult call() throws Exception {
                AcceptVpcPeeringConnectionResult result = null;

                try {
                    result = executeAcceptVpcPeeringConnection(finalRequest);
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
    @Override
    public java.util.concurrent.Future<AcceptVpcPeeringConnectionResult> acceptVpcPeeringConnectionAsync(
            com.amazonaws.handlers.AsyncHandler<AcceptVpcPeeringConnectionRequest, AcceptVpcPeeringConnectionResult> asyncHandler) {

        return acceptVpcPeeringConnectionAsync(new AcceptVpcPeeringConnectionRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(AdvertiseByoipCidrRequest request) {

        return advertiseByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(final AdvertiseByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdvertiseByoipCidrRequest, AdvertiseByoipCidrResult> asyncHandler) {
        final AdvertiseByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdvertiseByoipCidrResult>() {
            @Override
            public AdvertiseByoipCidrResult call() throws Exception {
                AdvertiseByoipCidrResult result = null;

                try {
                    result = executeAdvertiseByoipCidr(finalRequest);
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
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest request) {

        return allocateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateAddressResult> allocateAddressAsync(final AllocateAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler) {
        final AllocateAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocateAddressResult>() {
            @Override
            public AllocateAddressResult call() throws Exception {
                AllocateAddressResult result = null;

                try {
                    result = executeAllocateAddress(finalRequest);
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
    @Override
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
        final AllocateHostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocateHostsResult>() {
            @Override
            public AllocateHostsResult call() throws Exception {
                AllocateHostsResult result = null;

                try {
                    result = executeAllocateHosts(finalRequest);
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
    public java.util.concurrent.Future<ApplySecurityGroupsToClientVpnTargetNetworkResult> applySecurityGroupsToClientVpnTargetNetworkAsync(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest request) {

        return applySecurityGroupsToClientVpnTargetNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplySecurityGroupsToClientVpnTargetNetworkResult> applySecurityGroupsToClientVpnTargetNetworkAsync(
            final ApplySecurityGroupsToClientVpnTargetNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplySecurityGroupsToClientVpnTargetNetworkRequest, ApplySecurityGroupsToClientVpnTargetNetworkResult> asyncHandler) {
        final ApplySecurityGroupsToClientVpnTargetNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ApplySecurityGroupsToClientVpnTargetNetworkResult>() {
            @Override
            public ApplySecurityGroupsToClientVpnTargetNetworkResult call() throws Exception {
                ApplySecurityGroupsToClientVpnTargetNetworkResult result = null;

                try {
                    result = executeApplySecurityGroupsToClientVpnTargetNetwork(finalRequest);
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
    public java.util.concurrent.Future<AssignIpv6AddressesResult> assignIpv6AddressesAsync(AssignIpv6AddressesRequest request) {

        return assignIpv6AddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignIpv6AddressesResult> assignIpv6AddressesAsync(final AssignIpv6AddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignIpv6AddressesRequest, AssignIpv6AddressesResult> asyncHandler) {
        final AssignIpv6AddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssignIpv6AddressesResult>() {
            @Override
            public AssignIpv6AddressesResult call() throws Exception {
                AssignIpv6AddressesResult result = null;

                try {
                    result = executeAssignIpv6Addresses(finalRequest);
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
    public java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest request) {

        return assignPrivateIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssignPrivateIpAddressesResult> assignPrivateIpAddressesAsync(final AssignPrivateIpAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssignPrivateIpAddressesRequest, AssignPrivateIpAddressesResult> asyncHandler) {
        final AssignPrivateIpAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssignPrivateIpAddressesResult>() {
            @Override
            public AssignPrivateIpAddressesResult call() throws Exception {
                AssignPrivateIpAddressesResult result = null;

                try {
                    result = executeAssignPrivateIpAddresses(finalRequest);
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
    public java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest request) {

        return associateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAddressResult> associateAddressAsync(final AssociateAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAddressRequest, AssociateAddressResult> asyncHandler) {
        final AssociateAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAddressResult>() {
            @Override
            public AssociateAddressResult call() throws Exception {
                AssociateAddressResult result = null;

                try {
                    result = executeAssociateAddress(finalRequest);
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
    public java.util.concurrent.Future<AssociateClientVpnTargetNetworkResult> associateClientVpnTargetNetworkAsync(
            AssociateClientVpnTargetNetworkRequest request) {

        return associateClientVpnTargetNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateClientVpnTargetNetworkResult> associateClientVpnTargetNetworkAsync(
            final AssociateClientVpnTargetNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateClientVpnTargetNetworkRequest, AssociateClientVpnTargetNetworkResult> asyncHandler) {
        final AssociateClientVpnTargetNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateClientVpnTargetNetworkResult>() {
            @Override
            public AssociateClientVpnTargetNetworkResult call() throws Exception {
                AssociateClientVpnTargetNetworkResult result = null;

                try {
                    result = executeAssociateClientVpnTargetNetwork(finalRequest);
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
    public java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest request) {

        return associateDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDhcpOptionsResult> associateDhcpOptionsAsync(final AssociateDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDhcpOptionsRequest, AssociateDhcpOptionsResult> asyncHandler) {
        final AssociateDhcpOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDhcpOptionsResult>() {
            @Override
            public AssociateDhcpOptionsResult call() throws Exception {
                AssociateDhcpOptionsResult result = null;

                try {
                    result = executeAssociateDhcpOptions(finalRequest);
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
    public java.util.concurrent.Future<AssociateIamInstanceProfileResult> associateIamInstanceProfileAsync(AssociateIamInstanceProfileRequest request) {

        return associateIamInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateIamInstanceProfileResult> associateIamInstanceProfileAsync(final AssociateIamInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateIamInstanceProfileRequest, AssociateIamInstanceProfileResult> asyncHandler) {
        final AssociateIamInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateIamInstanceProfileResult>() {
            @Override
            public AssociateIamInstanceProfileResult call() throws Exception {
                AssociateIamInstanceProfileResult result = null;

                try {
                    result = executeAssociateIamInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest request) {

        return associateRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRouteTableResult> associateRouteTableAsync(final AssociateRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRouteTableRequest, AssociateRouteTableResult> asyncHandler) {
        final AssociateRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateRouteTableResult>() {
            @Override
            public AssociateRouteTableResult call() throws Exception {
                AssociateRouteTableResult result = null;

                try {
                    result = executeAssociateRouteTable(finalRequest);
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
    public java.util.concurrent.Future<AssociateSubnetCidrBlockResult> associateSubnetCidrBlockAsync(AssociateSubnetCidrBlockRequest request) {

        return associateSubnetCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetCidrBlockResult> associateSubnetCidrBlockAsync(final AssociateSubnetCidrBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSubnetCidrBlockRequest, AssociateSubnetCidrBlockResult> asyncHandler) {
        final AssociateSubnetCidrBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSubnetCidrBlockResult>() {
            @Override
            public AssociateSubnetCidrBlockResult call() throws Exception {
                AssociateSubnetCidrBlockResult result = null;

                try {
                    result = executeAssociateSubnetCidrBlock(finalRequest);
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
    public java.util.concurrent.Future<AssociateTransitGatewayRouteTableResult> associateTransitGatewayRouteTableAsync(
            AssociateTransitGatewayRouteTableRequest request) {

        return associateTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTransitGatewayRouteTableResult> associateTransitGatewayRouteTableAsync(
            final AssociateTransitGatewayRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTransitGatewayRouteTableRequest, AssociateTransitGatewayRouteTableResult> asyncHandler) {
        final AssociateTransitGatewayRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTransitGatewayRouteTableResult>() {
            @Override
            public AssociateTransitGatewayRouteTableResult call() throws Exception {
                AssociateTransitGatewayRouteTableResult result = null;

                try {
                    result = executeAssociateTransitGatewayRouteTable(finalRequest);
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
    public java.util.concurrent.Future<AssociateVpcCidrBlockResult> associateVpcCidrBlockAsync(AssociateVpcCidrBlockRequest request) {

        return associateVpcCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVpcCidrBlockResult> associateVpcCidrBlockAsync(final AssociateVpcCidrBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateVpcCidrBlockRequest, AssociateVpcCidrBlockResult> asyncHandler) {
        final AssociateVpcCidrBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateVpcCidrBlockResult>() {
            @Override
            public AssociateVpcCidrBlockResult call() throws Exception {
                AssociateVpcCidrBlockResult result = null;

                try {
                    result = executeAssociateVpcCidrBlock(finalRequest);
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
    public java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(AttachClassicLinkVpcRequest request) {

        return attachClassicLinkVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachClassicLinkVpcResult> attachClassicLinkVpcAsync(final AttachClassicLinkVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachClassicLinkVpcRequest, AttachClassicLinkVpcResult> asyncHandler) {
        final AttachClassicLinkVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachClassicLinkVpcResult>() {
            @Override
            public AttachClassicLinkVpcResult call() throws Exception {
                AttachClassicLinkVpcResult result = null;

                try {
                    result = executeAttachClassicLinkVpc(finalRequest);
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
    public java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(AttachInternetGatewayRequest request) {

        return attachInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachInternetGatewayResult> attachInternetGatewayAsync(final AttachInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachInternetGatewayRequest, AttachInternetGatewayResult> asyncHandler) {
        final AttachInternetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachInternetGatewayResult>() {
            @Override
            public AttachInternetGatewayResult call() throws Exception {
                AttachInternetGatewayResult result = null;

                try {
                    result = executeAttachInternetGateway(finalRequest);
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
    public java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest request) {

        return attachNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(final AttachNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachNetworkInterfaceRequest, AttachNetworkInterfaceResult> asyncHandler) {
        final AttachNetworkInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachNetworkInterfaceResult>() {
            @Override
            public AttachNetworkInterfaceResult call() throws Exception {
                AttachNetworkInterfaceResult result = null;

                try {
                    result = executeAttachNetworkInterface(finalRequest);
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
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest request) {

        return attachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(final AttachVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler) {
        final AttachVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachVolumeResult>() {
            @Override
            public AttachVolumeResult call() throws Exception {
                AttachVolumeResult result = null;

                try {
                    result = executeAttachVolume(finalRequest);
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
    public java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest request) {

        return attachVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVpnGatewayResult> attachVpnGatewayAsync(final AttachVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachVpnGatewayRequest, AttachVpnGatewayResult> asyncHandler) {
        final AttachVpnGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachVpnGatewayResult>() {
            @Override
            public AttachVpnGatewayResult call() throws Exception {
                AttachVpnGatewayResult result = null;

                try {
                    result = executeAttachVpnGateway(finalRequest);
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
    public java.util.concurrent.Future<AuthorizeClientVpnIngressResult> authorizeClientVpnIngressAsync(AuthorizeClientVpnIngressRequest request) {

        return authorizeClientVpnIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeClientVpnIngressResult> authorizeClientVpnIngressAsync(final AuthorizeClientVpnIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeClientVpnIngressRequest, AuthorizeClientVpnIngressResult> asyncHandler) {
        final AuthorizeClientVpnIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeClientVpnIngressResult>() {
            @Override
            public AuthorizeClientVpnIngressResult call() throws Exception {
                AuthorizeClientVpnIngressResult result = null;

                try {
                    result = executeAuthorizeClientVpnIngress(finalRequest);
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
    public java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(AuthorizeSecurityGroupEgressRequest request) {

        return authorizeSecurityGroupEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupEgressResult> authorizeSecurityGroupEgressAsync(final AuthorizeSecurityGroupEgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupEgressRequest, AuthorizeSecurityGroupEgressResult> asyncHandler) {
        final AuthorizeSecurityGroupEgressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeSecurityGroupEgressResult>() {
            @Override
            public AuthorizeSecurityGroupEgressResult call() throws Exception {
                AuthorizeSecurityGroupEgressResult result = null;

                try {
                    result = executeAuthorizeSecurityGroupEgress(finalRequest);
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
    public java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest request) {

        return authorizeSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeSecurityGroupIngressResult> authorizeSecurityGroupIngressAsync(
            final AuthorizeSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeSecurityGroupIngressRequest, AuthorizeSecurityGroupIngressResult> asyncHandler) {
        final AuthorizeSecurityGroupIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeSecurityGroupIngressResult>() {
            @Override
            public AuthorizeSecurityGroupIngressResult call() throws Exception {
                AuthorizeSecurityGroupIngressResult result = null;

                try {
                    result = executeAuthorizeSecurityGroupIngress(finalRequest);
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
    public java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest request) {

        return bundleInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BundleInstanceResult> bundleInstanceAsync(final BundleInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BundleInstanceRequest, BundleInstanceResult> asyncHandler) {
        final BundleInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BundleInstanceResult>() {
            @Override
            public BundleInstanceResult call() throws Exception {
                BundleInstanceResult result = null;

                try {
                    result = executeBundleInstance(finalRequest);
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
    public java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest request) {

        return cancelBundleTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelBundleTaskResult> cancelBundleTaskAsync(final CancelBundleTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelBundleTaskRequest, CancelBundleTaskResult> asyncHandler) {
        final CancelBundleTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelBundleTaskResult>() {
            @Override
            public CancelBundleTaskResult call() throws Exception {
                CancelBundleTaskResult result = null;

                try {
                    result = executeCancelBundleTask(finalRequest);
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
    public java.util.concurrent.Future<CancelCapacityReservationResult> cancelCapacityReservationAsync(CancelCapacityReservationRequest request) {

        return cancelCapacityReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCapacityReservationResult> cancelCapacityReservationAsync(final CancelCapacityReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelCapacityReservationRequest, CancelCapacityReservationResult> asyncHandler) {
        final CancelCapacityReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelCapacityReservationResult>() {
            @Override
            public CancelCapacityReservationResult call() throws Exception {
                CancelCapacityReservationResult result = null;

                try {
                    result = executeCancelCapacityReservation(finalRequest);
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
    public java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(CancelConversionTaskRequest request) {

        return cancelConversionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelConversionTaskResult> cancelConversionTaskAsync(final CancelConversionTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelConversionTaskRequest, CancelConversionTaskResult> asyncHandler) {
        final CancelConversionTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelConversionTaskResult>() {
            @Override
            public CancelConversionTaskResult call() throws Exception {
                CancelConversionTaskResult result = null;

                try {
                    result = executeCancelConversionTask(finalRequest);
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
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request) {

        return cancelExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(final CancelExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler) {
        final CancelExportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelExportTaskResult>() {
            @Override
            public CancelExportTaskResult call() throws Exception {
                CancelExportTaskResult result = null;

                try {
                    result = executeCancelExportTask(finalRequest);
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
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(CancelImportTaskRequest request) {

        return cancelImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelImportTaskResult> cancelImportTaskAsync(final CancelImportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelImportTaskRequest, CancelImportTaskResult> asyncHandler) {
        final CancelImportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelImportTaskResult>() {
            @Override
            public CancelImportTaskResult call() throws Exception {
                CancelImportTaskResult result = null;

                try {
                    result = executeCancelImportTask(finalRequest);
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
    @Override
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
        final CancelReservedInstancesListingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelReservedInstancesListingResult>() {
            @Override
            public CancelReservedInstancesListingResult call() throws Exception {
                CancelReservedInstancesListingResult result = null;

                try {
                    result = executeCancelReservedInstancesListing(finalRequest);
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
    public java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(CancelSpotFleetRequestsRequest request) {

        return cancelSpotFleetRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSpotFleetRequestsResult> cancelSpotFleetRequestsAsync(final CancelSpotFleetRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSpotFleetRequestsRequest, CancelSpotFleetRequestsResult> asyncHandler) {
        final CancelSpotFleetRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSpotFleetRequestsResult>() {
            @Override
            public CancelSpotFleetRequestsResult call() throws Exception {
                CancelSpotFleetRequestsResult result = null;

                try {
                    result = executeCancelSpotFleetRequests(finalRequest);
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
    public java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(CancelSpotInstanceRequestsRequest request) {

        return cancelSpotInstanceRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(final CancelSpotInstanceRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResult> asyncHandler) {
        final CancelSpotInstanceRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSpotInstanceRequestsResult>() {
            @Override
            public CancelSpotInstanceRequestsResult call() throws Exception {
                CancelSpotInstanceRequestsResult result = null;

                try {
                    result = executeCancelSpotInstanceRequests(finalRequest);
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
    public java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest request) {

        return confirmProductInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(final ConfirmProductInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmProductInstanceRequest, ConfirmProductInstanceResult> asyncHandler) {
        final ConfirmProductInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmProductInstanceResult>() {
            @Override
            public ConfirmProductInstanceResult call() throws Exception {
                ConfirmProductInstanceResult result = null;

                try {
                    result = executeConfirmProductInstance(finalRequest);
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
    public java.util.concurrent.Future<CopyFpgaImageResult> copyFpgaImageAsync(CopyFpgaImageRequest request) {

        return copyFpgaImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyFpgaImageResult> copyFpgaImageAsync(final CopyFpgaImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyFpgaImageRequest, CopyFpgaImageResult> asyncHandler) {
        final CopyFpgaImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyFpgaImageResult>() {
            @Override
            public CopyFpgaImageResult call() throws Exception {
                CopyFpgaImageResult result = null;

                try {
                    result = executeCopyFpgaImage(finalRequest);
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
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest request) {

        return copyImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(final CopyImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler) {
        final CopyImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyImageResult>() {
            @Override
            public CopyImageResult call() throws Exception {
                CopyImageResult result = null;

                try {
                    result = executeCopyImage(finalRequest);
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
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(final CopySnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler) {
        final CopySnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopySnapshotResult>() {
            @Override
            public CopySnapshotResult call() throws Exception {
                CopySnapshotResult result = null;

                try {
                    result = executeCopySnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateCapacityReservationResult> createCapacityReservationAsync(CreateCapacityReservationRequest request) {

        return createCapacityReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCapacityReservationResult> createCapacityReservationAsync(final CreateCapacityReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCapacityReservationRequest, CreateCapacityReservationResult> asyncHandler) {
        final CreateCapacityReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCapacityReservationResult>() {
            @Override
            public CreateCapacityReservationResult call() throws Exception {
                CreateCapacityReservationResult result = null;

                try {
                    result = executeCreateCapacityReservation(finalRequest);
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
    public java.util.concurrent.Future<CreateClientVpnEndpointResult> createClientVpnEndpointAsync(CreateClientVpnEndpointRequest request) {

        return createClientVpnEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClientVpnEndpointResult> createClientVpnEndpointAsync(final CreateClientVpnEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClientVpnEndpointRequest, CreateClientVpnEndpointResult> asyncHandler) {
        final CreateClientVpnEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClientVpnEndpointResult>() {
            @Override
            public CreateClientVpnEndpointResult call() throws Exception {
                CreateClientVpnEndpointResult result = null;

                try {
                    result = executeCreateClientVpnEndpoint(finalRequest);
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
    public java.util.concurrent.Future<CreateClientVpnRouteResult> createClientVpnRouteAsync(CreateClientVpnRouteRequest request) {

        return createClientVpnRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClientVpnRouteResult> createClientVpnRouteAsync(final CreateClientVpnRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClientVpnRouteRequest, CreateClientVpnRouteResult> asyncHandler) {
        final CreateClientVpnRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClientVpnRouteResult>() {
            @Override
            public CreateClientVpnRouteResult call() throws Exception {
                CreateClientVpnRouteResult result = null;

                try {
                    result = executeCreateClientVpnRoute(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest request) {

        return createCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(final CreateCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomerGatewayRequest, CreateCustomerGatewayResult> asyncHandler) {
        final CreateCustomerGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomerGatewayResult>() {
            @Override
            public CreateCustomerGatewayResult call() throws Exception {
                CreateCustomerGatewayResult result = null;

                try {
                    result = executeCreateCustomerGateway(finalRequest);
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
    public java.util.concurrent.Future<CreateDefaultSubnetResult> createDefaultSubnetAsync(CreateDefaultSubnetRequest request) {

        return createDefaultSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDefaultSubnetResult> createDefaultSubnetAsync(final CreateDefaultSubnetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDefaultSubnetRequest, CreateDefaultSubnetResult> asyncHandler) {
        final CreateDefaultSubnetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDefaultSubnetResult>() {
            @Override
            public CreateDefaultSubnetResult call() throws Exception {
                CreateDefaultSubnetResult result = null;

                try {
                    result = executeCreateDefaultSubnet(finalRequest);
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
    public java.util.concurrent.Future<CreateDefaultVpcResult> createDefaultVpcAsync(CreateDefaultVpcRequest request) {

        return createDefaultVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDefaultVpcResult> createDefaultVpcAsync(final CreateDefaultVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDefaultVpcRequest, CreateDefaultVpcResult> asyncHandler) {
        final CreateDefaultVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDefaultVpcResult>() {
            @Override
            public CreateDefaultVpcResult call() throws Exception {
                CreateDefaultVpcResult result = null;

                try {
                    result = executeCreateDefaultVpc(finalRequest);
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
    public java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest request) {

        return createDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(final CreateDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResult> asyncHandler) {
        final CreateDhcpOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDhcpOptionsResult>() {
            @Override
            public CreateDhcpOptionsResult call() throws Exception {
                CreateDhcpOptionsResult result = null;

                try {
                    result = executeCreateDhcpOptions(finalRequest);
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
    public java.util.concurrent.Future<CreateEgressOnlyInternetGatewayResult> createEgressOnlyInternetGatewayAsync(
            CreateEgressOnlyInternetGatewayRequest request) {

        return createEgressOnlyInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEgressOnlyInternetGatewayResult> createEgressOnlyInternetGatewayAsync(
            final CreateEgressOnlyInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEgressOnlyInternetGatewayRequest, CreateEgressOnlyInternetGatewayResult> asyncHandler) {
        final CreateEgressOnlyInternetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEgressOnlyInternetGatewayResult>() {
            @Override
            public CreateEgressOnlyInternetGatewayResult call() throws Exception {
                CreateEgressOnlyInternetGatewayResult result = null;

                try {
                    result = executeCreateEgressOnlyInternetGateway(finalRequest);
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
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
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
    public java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(CreateFlowLogsRequest request) {

        return createFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowLogsResult> createFlowLogsAsync(final CreateFlowLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowLogsRequest, CreateFlowLogsResult> asyncHandler) {
        final CreateFlowLogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowLogsResult>() {
            @Override
            public CreateFlowLogsResult call() throws Exception {
                CreateFlowLogsResult result = null;

                try {
                    result = executeCreateFlowLogs(finalRequest);
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
    public java.util.concurrent.Future<CreateFpgaImageResult> createFpgaImageAsync(CreateFpgaImageRequest request) {

        return createFpgaImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFpgaImageResult> createFpgaImageAsync(final CreateFpgaImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFpgaImageRequest, CreateFpgaImageResult> asyncHandler) {
        final CreateFpgaImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFpgaImageResult>() {
            @Override
            public CreateFpgaImageResult call() throws Exception {
                CreateFpgaImageResult result = null;

                try {
                    result = executeCreateFpgaImage(finalRequest);
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
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request) {

        return createImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(final CreateImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler) {
        final CreateImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageResult>() {
            @Override
            public CreateImageResult call() throws Exception {
                CreateImageResult result = null;

                try {
                    result = executeCreateImage(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest request) {

        return createInstanceExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(final CreateInstanceExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceExportTaskRequest, CreateInstanceExportTaskResult> asyncHandler) {
        final CreateInstanceExportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceExportTaskResult>() {
            @Override
            public CreateInstanceExportTaskResult call() throws Exception {
                CreateInstanceExportTaskResult result = null;

                try {
                    result = executeCreateInstanceExportTask(finalRequest);
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
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest request) {

        return createInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResult> createInternetGatewayAsync(final CreateInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler) {
        final CreateInternetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInternetGatewayResult>() {
            @Override
            public CreateInternetGatewayResult call() throws Exception {
                CreateInternetGatewayResult result = null;

                try {
                    result = executeCreateInternetGateway(finalRequest);
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
    @Override
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
        final CreateKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyPairResult>() {
            @Override
            public CreateKeyPairResult call() throws Exception {
                CreateKeyPairResult result = null;

                try {
                    result = executeCreateKeyPair(finalRequest);
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
    public java.util.concurrent.Future<CreateLaunchTemplateResult> createLaunchTemplateAsync(CreateLaunchTemplateRequest request) {

        return createLaunchTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchTemplateResult> createLaunchTemplateAsync(final CreateLaunchTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLaunchTemplateRequest, CreateLaunchTemplateResult> asyncHandler) {
        final CreateLaunchTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLaunchTemplateResult>() {
            @Override
            public CreateLaunchTemplateResult call() throws Exception {
                CreateLaunchTemplateResult result = null;

                try {
                    result = executeCreateLaunchTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateLaunchTemplateVersionResult> createLaunchTemplateVersionAsync(CreateLaunchTemplateVersionRequest request) {

        return createLaunchTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchTemplateVersionResult> createLaunchTemplateVersionAsync(final CreateLaunchTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLaunchTemplateVersionRequest, CreateLaunchTemplateVersionResult> asyncHandler) {
        final CreateLaunchTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLaunchTemplateVersionResult>() {
            @Override
            public CreateLaunchTemplateVersionResult call() throws Exception {
                CreateLaunchTemplateVersionResult result = null;

                try {
                    result = executeCreateLaunchTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(CreateNatGatewayRequest request) {

        return createNatGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNatGatewayResult> createNatGatewayAsync(final CreateNatGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNatGatewayRequest, CreateNatGatewayResult> asyncHandler) {
        final CreateNatGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNatGatewayResult>() {
            @Override
            public CreateNatGatewayResult call() throws Exception {
                CreateNatGatewayResult result = null;

                try {
                    result = executeCreateNatGateway(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest request) {

        return createNetworkAclAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclResult> createNetworkAclAsync(final CreateNetworkAclRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkAclRequest, CreateNetworkAclResult> asyncHandler) {
        final CreateNetworkAclRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkAclResult>() {
            @Override
            public CreateNetworkAclResult call() throws Exception {
                CreateNetworkAclResult result = null;

                try {
                    result = executeCreateNetworkAcl(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest request) {

        return createNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkAclEntryResult> createNetworkAclEntryAsync(final CreateNetworkAclEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkAclEntryRequest, CreateNetworkAclEntryResult> asyncHandler) {
        final CreateNetworkAclEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkAclEntryResult>() {
            @Override
            public CreateNetworkAclEntryResult call() throws Exception {
                CreateNetworkAclEntryResult result = null;

                try {
                    result = executeCreateNetworkAclEntry(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest request) {

        return createNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(final CreateNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfaceRequest, CreateNetworkInterfaceResult> asyncHandler) {
        final CreateNetworkInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkInterfaceResult>() {
            @Override
            public CreateNetworkInterfaceResult call() throws Exception {
                CreateNetworkInterfaceResult result = null;

                try {
                    result = executeCreateNetworkInterface(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkInterfacePermissionResult> createNetworkInterfacePermissionAsync(
            CreateNetworkInterfacePermissionRequest request) {

        return createNetworkInterfacePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkInterfacePermissionResult> createNetworkInterfacePermissionAsync(
            final CreateNetworkInterfacePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkInterfacePermissionRequest, CreateNetworkInterfacePermissionResult> asyncHandler) {
        final CreateNetworkInterfacePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkInterfacePermissionResult>() {
            @Override
            public CreateNetworkInterfacePermissionResult call() throws Exception {
                CreateNetworkInterfacePermissionResult result = null;

                try {
                    result = executeCreateNetworkInterfacePermission(finalRequest);
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
    public java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(CreatePlacementGroupRequest request) {

        return createPlacementGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlacementGroupResult> createPlacementGroupAsync(final CreatePlacementGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlacementGroupRequest, CreatePlacementGroupResult> asyncHandler) {
        final CreatePlacementGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlacementGroupResult>() {
            @Override
            public CreatePlacementGroupResult call() throws Exception {
                CreatePlacementGroupResult result = null;

                try {
                    result = executeCreatePlacementGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(CreateReservedInstancesListingRequest request) {

        return createReservedInstancesListingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(
            final CreateReservedInstancesListingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReservedInstancesListingRequest, CreateReservedInstancesListingResult> asyncHandler) {
        final CreateReservedInstancesListingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReservedInstancesListingResult>() {
            @Override
            public CreateReservedInstancesListingResult call() throws Exception {
                CreateReservedInstancesListingResult result = null;

                try {
                    result = executeCreateReservedInstancesListing(finalRequest);
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
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest request) {

        return createRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(final CreateRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler) {
        final CreateRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteResult>() {
            @Override
            public CreateRouteResult call() throws Exception {
                CreateRouteResult result = null;

                try {
                    result = executeCreateRoute(finalRequest);
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
    public java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest request) {

        return createRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteTableResult> createRouteTableAsync(final CreateRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteTableRequest, CreateRouteTableResult> asyncHandler) {
        final CreateRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteTableResult>() {
            @Override
            public CreateRouteTableResult call() throws Exception {
                CreateRouteTableResult result = null;

                try {
                    result = executeCreateRouteTable(finalRequest);
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
    public java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest request) {

        return createSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityGroupResult> createSecurityGroupAsync(final CreateSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecurityGroupRequest, CreateSecurityGroupResult> asyncHandler) {
        final CreateSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSecurityGroupResult>() {
            @Override
            public CreateSecurityGroupResult call() throws Exception {
                CreateSecurityGroupResult result = null;

                try {
                    result = executeCreateSecurityGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(CreateSpotDatafeedSubscriptionRequest request) {

        return createSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(
            final CreateSpotDatafeedSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResult> asyncHandler) {
        final CreateSpotDatafeedSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSpotDatafeedSubscriptionResult>() {
            @Override
            public CreateSpotDatafeedSubscriptionResult call() throws Exception {
                CreateSpotDatafeedSubscriptionResult result = null;

                try {
                    result = executeCreateSpotDatafeedSubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest request) {

        return createSubnetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetResult> createSubnetAsync(final CreateSubnetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubnetRequest, CreateSubnetResult> asyncHandler) {
        final CreateSubnetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubnetResult>() {
            @Override
            public CreateSubnetResult call() throws Exception {
                CreateSubnetResult result = null;

                try {
                    result = executeCreateSubnet(finalRequest);
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {
        final CreateTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result = null;

                try {
                    result = executeCreateTags(finalRequest);
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
    public java.util.concurrent.Future<CreateTransitGatewayResult> createTransitGatewayAsync(CreateTransitGatewayRequest request) {

        return createTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayResult> createTransitGatewayAsync(final CreateTransitGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRequest, CreateTransitGatewayResult> asyncHandler) {
        final CreateTransitGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransitGatewayResult>() {
            @Override
            public CreateTransitGatewayResult call() throws Exception {
                CreateTransitGatewayResult result = null;

                try {
                    result = executeCreateTransitGateway(finalRequest);
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
    public java.util.concurrent.Future<CreateTransitGatewayRouteResult> createTransitGatewayRouteAsync(CreateTransitGatewayRouteRequest request) {

        return createTransitGatewayRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteResult> createTransitGatewayRouteAsync(final CreateTransitGatewayRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRouteRequest, CreateTransitGatewayRouteResult> asyncHandler) {
        final CreateTransitGatewayRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransitGatewayRouteResult>() {
            @Override
            public CreateTransitGatewayRouteResult call() throws Exception {
                CreateTransitGatewayRouteResult result = null;

                try {
                    result = executeCreateTransitGatewayRoute(finalRequest);
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
    public java.util.concurrent.Future<CreateTransitGatewayRouteTableResult> createTransitGatewayRouteTableAsync(CreateTransitGatewayRouteTableRequest request) {

        return createTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayRouteTableResult> createTransitGatewayRouteTableAsync(
            final CreateTransitGatewayRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRouteTableRequest, CreateTransitGatewayRouteTableResult> asyncHandler) {
        final CreateTransitGatewayRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransitGatewayRouteTableResult>() {
            @Override
            public CreateTransitGatewayRouteTableResult call() throws Exception {
                CreateTransitGatewayRouteTableResult result = null;

                try {
                    result = executeCreateTransitGatewayRouteTable(finalRequest);
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
    public java.util.concurrent.Future<CreateTransitGatewayVpcAttachmentResult> createTransitGatewayVpcAttachmentAsync(
            CreateTransitGatewayVpcAttachmentRequest request) {

        return createTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransitGatewayVpcAttachmentResult> createTransitGatewayVpcAttachmentAsync(
            final CreateTransitGatewayVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayVpcAttachmentRequest, CreateTransitGatewayVpcAttachmentResult> asyncHandler) {
        final CreateTransitGatewayVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransitGatewayVpcAttachmentResult>() {
            @Override
            public CreateTransitGatewayVpcAttachmentResult call() throws Exception {
                CreateTransitGatewayVpcAttachmentResult result = null;

                try {
                    result = executeCreateTransitGatewayVpcAttachment(finalRequest);
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
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request) {

        return createVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(final CreateVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler) {
        final CreateVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVolumeResult>() {
            @Override
            public CreateVolumeResult call() throws Exception {
                CreateVolumeResult result = null;

                try {
                    result = executeCreateVolume(finalRequest);
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
    public java.util.concurrent.Future<CreateVpcResult> createVpcAsync(CreateVpcRequest request) {

        return createVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcResult> createVpcAsync(final CreateVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcRequest, CreateVpcResult> asyncHandler) {
        final CreateVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcResult>() {
            @Override
            public CreateVpcResult call() throws Exception {
                CreateVpcResult result = null;

                try {
                    result = executeCreateVpc(finalRequest);
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
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest request) {

        return createVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(final CreateVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler) {
        final CreateVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcEndpointResult>() {
            @Override
            public CreateVpcEndpointResult call() throws Exception {
                CreateVpcEndpointResult result = null;

                try {
                    result = executeCreateVpcEndpoint(finalRequest);
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
    public java.util.concurrent.Future<CreateVpcEndpointConnectionNotificationResult> createVpcEndpointConnectionNotificationAsync(
            CreateVpcEndpointConnectionNotificationRequest request) {

        return createVpcEndpointConnectionNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointConnectionNotificationResult> createVpcEndpointConnectionNotificationAsync(
            final CreateVpcEndpointConnectionNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointConnectionNotificationRequest, CreateVpcEndpointConnectionNotificationResult> asyncHandler) {
        final CreateVpcEndpointConnectionNotificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcEndpointConnectionNotificationResult>() {
            @Override
            public CreateVpcEndpointConnectionNotificationResult call() throws Exception {
                CreateVpcEndpointConnectionNotificationResult result = null;

                try {
                    result = executeCreateVpcEndpointConnectionNotification(finalRequest);
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
    public java.util.concurrent.Future<CreateVpcEndpointServiceConfigurationResult> createVpcEndpointServiceConfigurationAsync(
            CreateVpcEndpointServiceConfigurationRequest request) {

        return createVpcEndpointServiceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointServiceConfigurationResult> createVpcEndpointServiceConfigurationAsync(
            final CreateVpcEndpointServiceConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointServiceConfigurationRequest, CreateVpcEndpointServiceConfigurationResult> asyncHandler) {
        final CreateVpcEndpointServiceConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcEndpointServiceConfigurationResult>() {
            @Override
            public CreateVpcEndpointServiceConfigurationResult call() throws Exception {
                CreateVpcEndpointServiceConfigurationResult result = null;

                try {
                    result = executeCreateVpcEndpointServiceConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest request) {

        return createVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(final CreateVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler) {
        final CreateVpcPeeringConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcPeeringConnectionResult>() {
            @Override
            public CreateVpcPeeringConnectionResult call() throws Exception {
                CreateVpcPeeringConnectionResult result = null;

                try {
                    result = executeCreateVpcPeeringConnection(finalRequest);
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
    @Override
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
        final CreateVpnConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpnConnectionResult>() {
            @Override
            public CreateVpnConnectionResult call() throws Exception {
                CreateVpnConnectionResult result = null;

                try {
                    result = executeCreateVpnConnection(finalRequest);
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
    public java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest request) {

        return createVpnConnectionRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnConnectionRouteResult> createVpnConnectionRouteAsync(final CreateVpnConnectionRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpnConnectionRouteRequest, CreateVpnConnectionRouteResult> asyncHandler) {
        final CreateVpnConnectionRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpnConnectionRouteResult>() {
            @Override
            public CreateVpnConnectionRouteResult call() throws Exception {
                CreateVpnConnectionRouteResult result = null;

                try {
                    result = executeCreateVpnConnectionRoute(finalRequest);
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
    public java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest request) {

        return createVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpnGatewayResult> createVpnGatewayAsync(final CreateVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpnGatewayRequest, CreateVpnGatewayResult> asyncHandler) {
        final CreateVpnGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpnGatewayResult>() {
            @Override
            public CreateVpnGatewayResult call() throws Exception {
                CreateVpnGatewayResult result = null;

                try {
                    result = executeCreateVpnGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteClientVpnEndpointResult> deleteClientVpnEndpointAsync(DeleteClientVpnEndpointRequest request) {

        return deleteClientVpnEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClientVpnEndpointResult> deleteClientVpnEndpointAsync(final DeleteClientVpnEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClientVpnEndpointRequest, DeleteClientVpnEndpointResult> asyncHandler) {
        final DeleteClientVpnEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClientVpnEndpointResult>() {
            @Override
            public DeleteClientVpnEndpointResult call() throws Exception {
                DeleteClientVpnEndpointResult result = null;

                try {
                    result = executeDeleteClientVpnEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteClientVpnRouteResult> deleteClientVpnRouteAsync(DeleteClientVpnRouteRequest request) {

        return deleteClientVpnRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClientVpnRouteResult> deleteClientVpnRouteAsync(final DeleteClientVpnRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClientVpnRouteRequest, DeleteClientVpnRouteResult> asyncHandler) {
        final DeleteClientVpnRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClientVpnRouteResult>() {
            @Override
            public DeleteClientVpnRouteResult call() throws Exception {
                DeleteClientVpnRouteResult result = null;

                try {
                    result = executeDeleteClientVpnRoute(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest request) {

        return deleteCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerGatewayResult> deleteCustomerGatewayAsync(final DeleteCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomerGatewayRequest, DeleteCustomerGatewayResult> asyncHandler) {
        final DeleteCustomerGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomerGatewayResult>() {
            @Override
            public DeleteCustomerGatewayResult call() throws Exception {
                DeleteCustomerGatewayResult result = null;

                try {
                    result = executeDeleteCustomerGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest request) {

        return deleteDhcpOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDhcpOptionsResult> deleteDhcpOptionsAsync(final DeleteDhcpOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResult> asyncHandler) {
        final DeleteDhcpOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDhcpOptionsResult>() {
            @Override
            public DeleteDhcpOptionsResult call() throws Exception {
                DeleteDhcpOptionsResult result = null;

                try {
                    result = executeDeleteDhcpOptions(finalRequest);
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
    public java.util.concurrent.Future<DeleteEgressOnlyInternetGatewayResult> deleteEgressOnlyInternetGatewayAsync(
            DeleteEgressOnlyInternetGatewayRequest request) {

        return deleteEgressOnlyInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEgressOnlyInternetGatewayResult> deleteEgressOnlyInternetGatewayAsync(
            final DeleteEgressOnlyInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEgressOnlyInternetGatewayRequest, DeleteEgressOnlyInternetGatewayResult> asyncHandler) {
        final DeleteEgressOnlyInternetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEgressOnlyInternetGatewayResult>() {
            @Override
            public DeleteEgressOnlyInternetGatewayResult call() throws Exception {
                DeleteEgressOnlyInternetGatewayResult result = null;

                try {
                    result = executeDeleteEgressOnlyInternetGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteFleetsResult> deleteFleetsAsync(DeleteFleetsRequest request) {

        return deleteFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetsResult> deleteFleetsAsync(final DeleteFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetsRequest, DeleteFleetsResult> asyncHandler) {
        final DeleteFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetsResult>() {
            @Override
            public DeleteFleetsResult call() throws Exception {
                DeleteFleetsResult result = null;

                try {
                    result = executeDeleteFleets(finalRequest);
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
    public java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(DeleteFlowLogsRequest request) {

        return deleteFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowLogsResult> deleteFlowLogsAsync(final DeleteFlowLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowLogsRequest, DeleteFlowLogsResult> asyncHandler) {
        final DeleteFlowLogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowLogsResult>() {
            @Override
            public DeleteFlowLogsResult call() throws Exception {
                DeleteFlowLogsResult result = null;

                try {
                    result = executeDeleteFlowLogs(finalRequest);
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
    public java.util.concurrent.Future<DeleteFpgaImageResult> deleteFpgaImageAsync(DeleteFpgaImageRequest request) {

        return deleteFpgaImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFpgaImageResult> deleteFpgaImageAsync(final DeleteFpgaImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFpgaImageRequest, DeleteFpgaImageResult> asyncHandler) {
        final DeleteFpgaImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFpgaImageResult>() {
            @Override
            public DeleteFpgaImageResult call() throws Exception {
                DeleteFpgaImageResult result = null;

                try {
                    result = executeDeleteFpgaImage(finalRequest);
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
    public java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(DeleteInternetGatewayRequest request) {

        return deleteInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInternetGatewayResult> deleteInternetGatewayAsync(final DeleteInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInternetGatewayRequest, DeleteInternetGatewayResult> asyncHandler) {
        final DeleteInternetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInternetGatewayResult>() {
            @Override
            public DeleteInternetGatewayResult call() throws Exception {
                DeleteInternetGatewayResult result = null;

                try {
                    result = executeDeleteInternetGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request) {

        return deleteKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(final DeleteKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler) {
        final DeleteKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyPairResult>() {
            @Override
            public DeleteKeyPairResult call() throws Exception {
                DeleteKeyPairResult result = null;

                try {
                    result = executeDeleteKeyPair(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchTemplateResult> deleteLaunchTemplateAsync(DeleteLaunchTemplateRequest request) {

        return deleteLaunchTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchTemplateResult> deleteLaunchTemplateAsync(final DeleteLaunchTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchTemplateRequest, DeleteLaunchTemplateResult> asyncHandler) {
        final DeleteLaunchTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchTemplateResult>() {
            @Override
            public DeleteLaunchTemplateResult call() throws Exception {
                DeleteLaunchTemplateResult result = null;

                try {
                    result = executeDeleteLaunchTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchTemplateVersionsResult> deleteLaunchTemplateVersionsAsync(DeleteLaunchTemplateVersionsRequest request) {

        return deleteLaunchTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchTemplateVersionsResult> deleteLaunchTemplateVersionsAsync(final DeleteLaunchTemplateVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchTemplateVersionsRequest, DeleteLaunchTemplateVersionsResult> asyncHandler) {
        final DeleteLaunchTemplateVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchTemplateVersionsResult>() {
            @Override
            public DeleteLaunchTemplateVersionsResult call() throws Exception {
                DeleteLaunchTemplateVersionsResult result = null;

                try {
                    result = executeDeleteLaunchTemplateVersions(finalRequest);
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
    public java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(DeleteNatGatewayRequest request) {

        return deleteNatGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNatGatewayResult> deleteNatGatewayAsync(final DeleteNatGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNatGatewayRequest, DeleteNatGatewayResult> asyncHandler) {
        final DeleteNatGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNatGatewayResult>() {
            @Override
            public DeleteNatGatewayResult call() throws Exception {
                DeleteNatGatewayResult result = null;

                try {
                    result = executeDeleteNatGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(DeleteNetworkAclRequest request) {

        return deleteNetworkAclAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclResult> deleteNetworkAclAsync(final DeleteNetworkAclRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclRequest, DeleteNetworkAclResult> asyncHandler) {
        final DeleteNetworkAclRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkAclResult>() {
            @Override
            public DeleteNetworkAclResult call() throws Exception {
                DeleteNetworkAclResult result = null;

                try {
                    result = executeDeleteNetworkAcl(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest request) {

        return deleteNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkAclEntryResult> deleteNetworkAclEntryAsync(final DeleteNetworkAclEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkAclEntryRequest, DeleteNetworkAclEntryResult> asyncHandler) {
        final DeleteNetworkAclEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkAclEntryResult>() {
            @Override
            public DeleteNetworkAclEntryResult call() throws Exception {
                DeleteNetworkAclEntryResult result = null;

                try {
                    result = executeDeleteNetworkAclEntry(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest request) {

        return deleteNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfaceResult> deleteNetworkInterfaceAsync(final DeleteNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfaceRequest, DeleteNetworkInterfaceResult> asyncHandler) {
        final DeleteNetworkInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkInterfaceResult>() {
            @Override
            public DeleteNetworkInterfaceResult call() throws Exception {
                DeleteNetworkInterfaceResult result = null;

                try {
                    result = executeDeleteNetworkInterface(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkInterfacePermissionResult> deleteNetworkInterfacePermissionAsync(
            DeleteNetworkInterfacePermissionRequest request) {

        return deleteNetworkInterfacePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkInterfacePermissionResult> deleteNetworkInterfacePermissionAsync(
            final DeleteNetworkInterfacePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkInterfacePermissionRequest, DeleteNetworkInterfacePermissionResult> asyncHandler) {
        final DeleteNetworkInterfacePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkInterfacePermissionResult>() {
            @Override
            public DeleteNetworkInterfacePermissionResult call() throws Exception {
                DeleteNetworkInterfacePermissionResult result = null;

                try {
                    result = executeDeleteNetworkInterfacePermission(finalRequest);
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
    public java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(DeletePlacementGroupRequest request) {

        return deletePlacementGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlacementGroupResult> deletePlacementGroupAsync(final DeletePlacementGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlacementGroupRequest, DeletePlacementGroupResult> asyncHandler) {
        final DeletePlacementGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlacementGroupResult>() {
            @Override
            public DeletePlacementGroupResult call() throws Exception {
                DeletePlacementGroupResult result = null;

                try {
                    result = executeDeletePlacementGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest request) {

        return deleteRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(final DeleteRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler) {
        final DeleteRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteResult>() {
            @Override
            public DeleteRouteResult call() throws Exception {
                DeleteRouteResult result = null;

                try {
                    result = executeDeleteRoute(finalRequest);
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
    public java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(DeleteRouteTableRequest request) {

        return deleteRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteTableResult> deleteRouteTableAsync(final DeleteRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResult> asyncHandler) {
        final DeleteRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteTableResult>() {
            @Override
            public DeleteRouteTableResult call() throws Exception {
                DeleteRouteTableResult result = null;

                try {
                    result = executeDeleteRouteTable(finalRequest);
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
    public java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {

        return deleteSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityGroupResult> deleteSecurityGroupAsync(final DeleteSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecurityGroupRequest, DeleteSecurityGroupResult> asyncHandler) {
        final DeleteSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecurityGroupResult>() {
            @Override
            public DeleteSecurityGroupResult call() throws Exception {
                DeleteSecurityGroupResult result = null;

                try {
                    result = executeDeleteSecurityGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {
        final DeleteSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
            @Override
            public DeleteSnapshotResult call() throws Exception {
                DeleteSnapshotResult result = null;

                try {
                    result = executeDeleteSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest request) {

        return deleteSpotDatafeedSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpotDatafeedSubscriptionResult> deleteSpotDatafeedSubscriptionAsync(
            final DeleteSpotDatafeedSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, DeleteSpotDatafeedSubscriptionResult> asyncHandler) {
        final DeleteSpotDatafeedSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSpotDatafeedSubscriptionResult>() {
            @Override
            public DeleteSpotDatafeedSubscriptionResult call() throws Exception {
                DeleteSpotDatafeedSubscriptionResult result = null;

                try {
                    result = executeDeleteSpotDatafeedSubscription(finalRequest);
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
    @Override
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
        final DeleteSubnetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubnetResult>() {
            @Override
            public DeleteSubnetResult call() throws Exception {
                DeleteSubnetResult result = null;

                try {
                    result = executeDeleteSubnet(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
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
    public java.util.concurrent.Future<DeleteTransitGatewayResult> deleteTransitGatewayAsync(DeleteTransitGatewayRequest request) {

        return deleteTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayResult> deleteTransitGatewayAsync(final DeleteTransitGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayRequest, DeleteTransitGatewayResult> asyncHandler) {
        final DeleteTransitGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTransitGatewayResult>() {
            @Override
            public DeleteTransitGatewayResult call() throws Exception {
                DeleteTransitGatewayResult result = null;

                try {
                    result = executeDeleteTransitGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteTransitGatewayRouteResult> deleteTransitGatewayRouteAsync(DeleteTransitGatewayRouteRequest request) {

        return deleteTransitGatewayRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayRouteResult> deleteTransitGatewayRouteAsync(final DeleteTransitGatewayRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayRouteRequest, DeleteTransitGatewayRouteResult> asyncHandler) {
        final DeleteTransitGatewayRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTransitGatewayRouteResult>() {
            @Override
            public DeleteTransitGatewayRouteResult call() throws Exception {
                DeleteTransitGatewayRouteResult result = null;

                try {
                    result = executeDeleteTransitGatewayRoute(finalRequest);
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
    public java.util.concurrent.Future<DeleteTransitGatewayRouteTableResult> deleteTransitGatewayRouteTableAsync(DeleteTransitGatewayRouteTableRequest request) {

        return deleteTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayRouteTableResult> deleteTransitGatewayRouteTableAsync(
            final DeleteTransitGatewayRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayRouteTableRequest, DeleteTransitGatewayRouteTableResult> asyncHandler) {
        final DeleteTransitGatewayRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTransitGatewayRouteTableResult>() {
            @Override
            public DeleteTransitGatewayRouteTableResult call() throws Exception {
                DeleteTransitGatewayRouteTableResult result = null;

                try {
                    result = executeDeleteTransitGatewayRouteTable(finalRequest);
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
    public java.util.concurrent.Future<DeleteTransitGatewayVpcAttachmentResult> deleteTransitGatewayVpcAttachmentAsync(
            DeleteTransitGatewayVpcAttachmentRequest request) {

        return deleteTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransitGatewayVpcAttachmentResult> deleteTransitGatewayVpcAttachmentAsync(
            final DeleteTransitGatewayVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTransitGatewayVpcAttachmentRequest, DeleteTransitGatewayVpcAttachmentResult> asyncHandler) {
        final DeleteTransitGatewayVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTransitGatewayVpcAttachmentResult>() {
            @Override
            public DeleteTransitGatewayVpcAttachmentResult call() throws Exception {
                DeleteTransitGatewayVpcAttachmentResult result = null;

                try {
                    result = executeDeleteTransitGatewayVpcAttachment(finalRequest);
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
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {
        final DeleteVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVolumeResult>() {
            @Override
            public DeleteVolumeResult call() throws Exception {
                DeleteVolumeResult result = null;

                try {
                    result = executeDeleteVolume(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(DeleteVpcRequest request) {

        return deleteVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcResult> deleteVpcAsync(final DeleteVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcRequest, DeleteVpcResult> asyncHandler) {
        final DeleteVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcResult>() {
            @Override
            public DeleteVpcResult call() throws Exception {
                DeleteVpcResult result = null;

                try {
                    result = executeDeleteVpc(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpcEndpointConnectionNotificationsResult> deleteVpcEndpointConnectionNotificationsAsync(
            DeleteVpcEndpointConnectionNotificationsRequest request) {

        return deleteVpcEndpointConnectionNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointConnectionNotificationsResult> deleteVpcEndpointConnectionNotificationsAsync(
            final DeleteVpcEndpointConnectionNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointConnectionNotificationsRequest, DeleteVpcEndpointConnectionNotificationsResult> asyncHandler) {
        final DeleteVpcEndpointConnectionNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcEndpointConnectionNotificationsResult>() {
            @Override
            public DeleteVpcEndpointConnectionNotificationsResult call() throws Exception {
                DeleteVpcEndpointConnectionNotificationsResult result = null;

                try {
                    result = executeDeleteVpcEndpointConnectionNotifications(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpcEndpointServiceConfigurationsResult> deleteVpcEndpointServiceConfigurationsAsync(
            DeleteVpcEndpointServiceConfigurationsRequest request) {

        return deleteVpcEndpointServiceConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointServiceConfigurationsResult> deleteVpcEndpointServiceConfigurationsAsync(
            final DeleteVpcEndpointServiceConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointServiceConfigurationsRequest, DeleteVpcEndpointServiceConfigurationsResult> asyncHandler) {
        final DeleteVpcEndpointServiceConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcEndpointServiceConfigurationsResult>() {
            @Override
            public DeleteVpcEndpointServiceConfigurationsResult call() throws Exception {
                DeleteVpcEndpointServiceConfigurationsResult result = null;

                try {
                    result = executeDeleteVpcEndpointServiceConfigurations(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(DeleteVpcEndpointsRequest request) {

        return deleteVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointsResult> deleteVpcEndpointsAsync(final DeleteVpcEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointsRequest, DeleteVpcEndpointsResult> asyncHandler) {
        final DeleteVpcEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcEndpointsResult>() {
            @Override
            public DeleteVpcEndpointsResult call() throws Exception {
                DeleteVpcEndpointsResult result = null;

                try {
                    result = executeDeleteVpcEndpoints(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(DeleteVpcPeeringConnectionRequest request) {

        return deleteVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(final DeleteVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler) {
        final DeleteVpcPeeringConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcPeeringConnectionResult>() {
            @Override
            public DeleteVpcPeeringConnectionResult call() throws Exception {
                DeleteVpcPeeringConnectionResult result = null;

                try {
                    result = executeDeleteVpcPeeringConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(DeleteVpnConnectionRequest request) {

        return deleteVpnConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionResult> deleteVpnConnectionAsync(final DeleteVpnConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRequest, DeleteVpnConnectionResult> asyncHandler) {
        final DeleteVpnConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpnConnectionResult>() {
            @Override
            public DeleteVpnConnectionResult call() throws Exception {
                DeleteVpnConnectionResult result = null;

                try {
                    result = executeDeleteVpnConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest request) {

        return deleteVpnConnectionRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnConnectionRouteResult> deleteVpnConnectionRouteAsync(final DeleteVpnConnectionRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpnConnectionRouteRequest, DeleteVpnConnectionRouteResult> asyncHandler) {
        final DeleteVpnConnectionRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpnConnectionRouteResult>() {
            @Override
            public DeleteVpnConnectionRouteResult call() throws Exception {
                DeleteVpnConnectionRouteResult result = null;

                try {
                    result = executeDeleteVpnConnectionRoute(finalRequest);
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
    public java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(DeleteVpnGatewayRequest request) {

        return deleteVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpnGatewayResult> deleteVpnGatewayAsync(final DeleteVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpnGatewayRequest, DeleteVpnGatewayResult> asyncHandler) {
        final DeleteVpnGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpnGatewayResult>() {
            @Override
            public DeleteVpnGatewayResult call() throws Exception {
                DeleteVpnGatewayResult result = null;

                try {
                    result = executeDeleteVpnGateway(finalRequest);
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
    public java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(DeprovisionByoipCidrRequest request) {

        return deprovisionByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(final DeprovisionByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprovisionByoipCidrRequest, DeprovisionByoipCidrResult> asyncHandler) {
        final DeprovisionByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeprovisionByoipCidrResult>() {
            @Override
            public DeprovisionByoipCidrResult call() throws Exception {
                DeprovisionByoipCidrResult result = null;

                try {
                    result = executeDeprovisionByoipCidr(finalRequest);
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
    public java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(DeregisterImageRequest request) {

        return deregisterImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterImageResult> deregisterImageAsync(final DeregisterImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterImageRequest, DeregisterImageResult> asyncHandler) {
        final DeregisterImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterImageResult>() {
            @Override
            public DeregisterImageResult call() throws Exception {
                DeregisterImageResult result = null;

                try {
                    result = executeDeregisterImage(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {
        final DescribeAccountAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result = null;

                try {
                    result = executeDescribeAccountAttributes(finalRequest);
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
    @Override
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
        final DescribeAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAddressesResult>() {
            @Override
            public DescribeAddressesResult call() throws Exception {
                DescribeAddressesResult result = null;

                try {
                    result = executeDescribeAddresses(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler) {

        return describeAddressesAsync(new DescribeAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateIdFormatResult> describeAggregateIdFormatAsync(DescribeAggregateIdFormatRequest request) {

        return describeAggregateIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAggregateIdFormatResult> describeAggregateIdFormatAsync(final DescribeAggregateIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAggregateIdFormatRequest, DescribeAggregateIdFormatResult> asyncHandler) {
        final DescribeAggregateIdFormatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAggregateIdFormatResult>() {
            @Override
            public DescribeAggregateIdFormatResult call() throws Exception {
                DescribeAggregateIdFormatResult result = null;

                try {
                    result = executeDescribeAggregateIdFormat(finalRequest);
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
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest request) {

        return describeAvailabilityZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(final DescribeAvailabilityZonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler) {
        final DescribeAvailabilityZonesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAvailabilityZonesResult>() {
            @Override
            public DescribeAvailabilityZonesResult call() throws Exception {
                DescribeAvailabilityZonesResult result = null;

                try {
                    result = executeDescribeAvailabilityZones(finalRequest);
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
    @Override
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
        final DescribeBundleTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBundleTasksResult>() {
            @Override
            public DescribeBundleTasksResult call() throws Exception {
                DescribeBundleTasksResult result = null;

                try {
                    result = executeDescribeBundleTasks(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeBundleTasksResult> describeBundleTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler) {

        return describeBundleTasksAsync(new DescribeBundleTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeByoipCidrsResult> describeByoipCidrsAsync(DescribeByoipCidrsRequest request) {

        return describeByoipCidrsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeByoipCidrsResult> describeByoipCidrsAsync(final DescribeByoipCidrsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeByoipCidrsRequest, DescribeByoipCidrsResult> asyncHandler) {
        final DescribeByoipCidrsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeByoipCidrsResult>() {
            @Override
            public DescribeByoipCidrsResult call() throws Exception {
                DescribeByoipCidrsResult result = null;

                try {
                    result = executeDescribeByoipCidrs(finalRequest);
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
    public java.util.concurrent.Future<DescribeCapacityReservationsResult> describeCapacityReservationsAsync(DescribeCapacityReservationsRequest request) {

        return describeCapacityReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCapacityReservationsResult> describeCapacityReservationsAsync(final DescribeCapacityReservationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCapacityReservationsRequest, DescribeCapacityReservationsResult> asyncHandler) {
        final DescribeCapacityReservationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCapacityReservationsResult>() {
            @Override
            public DescribeCapacityReservationsResult call() throws Exception {
                DescribeCapacityReservationsResult result = null;

                try {
                    result = executeDescribeCapacityReservations(finalRequest);
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
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(DescribeClassicLinkInstancesRequest request) {

        return describeClassicLinkInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(final DescribeClassicLinkInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler) {
        final DescribeClassicLinkInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClassicLinkInstancesResult>() {
            @Override
            public DescribeClassicLinkInstancesResult call() throws Exception {
                DescribeClassicLinkInstancesResult result = null;

                try {
                    result = executeDescribeClassicLinkInstances(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeClassicLinkInstancesResult> describeClassicLinkInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClassicLinkInstancesRequest, DescribeClassicLinkInstancesResult> asyncHandler) {

        return describeClassicLinkInstancesAsync(new DescribeClassicLinkInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnAuthorizationRulesResult> describeClientVpnAuthorizationRulesAsync(
            DescribeClientVpnAuthorizationRulesRequest request) {

        return describeClientVpnAuthorizationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnAuthorizationRulesResult> describeClientVpnAuthorizationRulesAsync(
            final DescribeClientVpnAuthorizationRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClientVpnAuthorizationRulesRequest, DescribeClientVpnAuthorizationRulesResult> asyncHandler) {
        final DescribeClientVpnAuthorizationRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClientVpnAuthorizationRulesResult>() {
            @Override
            public DescribeClientVpnAuthorizationRulesResult call() throws Exception {
                DescribeClientVpnAuthorizationRulesResult result = null;

                try {
                    result = executeDescribeClientVpnAuthorizationRules(finalRequest);
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
    public java.util.concurrent.Future<DescribeClientVpnConnectionsResult> describeClientVpnConnectionsAsync(DescribeClientVpnConnectionsRequest request) {

        return describeClientVpnConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnConnectionsResult> describeClientVpnConnectionsAsync(final DescribeClientVpnConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClientVpnConnectionsRequest, DescribeClientVpnConnectionsResult> asyncHandler) {
        final DescribeClientVpnConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClientVpnConnectionsResult>() {
            @Override
            public DescribeClientVpnConnectionsResult call() throws Exception {
                DescribeClientVpnConnectionsResult result = null;

                try {
                    result = executeDescribeClientVpnConnections(finalRequest);
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
    public java.util.concurrent.Future<DescribeClientVpnEndpointsResult> describeClientVpnEndpointsAsync(DescribeClientVpnEndpointsRequest request) {

        return describeClientVpnEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnEndpointsResult> describeClientVpnEndpointsAsync(final DescribeClientVpnEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClientVpnEndpointsRequest, DescribeClientVpnEndpointsResult> asyncHandler) {
        final DescribeClientVpnEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClientVpnEndpointsResult>() {
            @Override
            public DescribeClientVpnEndpointsResult call() throws Exception {
                DescribeClientVpnEndpointsResult result = null;

                try {
                    result = executeDescribeClientVpnEndpoints(finalRequest);
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
    public java.util.concurrent.Future<DescribeClientVpnRoutesResult> describeClientVpnRoutesAsync(DescribeClientVpnRoutesRequest request) {

        return describeClientVpnRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnRoutesResult> describeClientVpnRoutesAsync(final DescribeClientVpnRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClientVpnRoutesRequest, DescribeClientVpnRoutesResult> asyncHandler) {
        final DescribeClientVpnRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClientVpnRoutesResult>() {
            @Override
            public DescribeClientVpnRoutesResult call() throws Exception {
                DescribeClientVpnRoutesResult result = null;

                try {
                    result = executeDescribeClientVpnRoutes(finalRequest);
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
    public java.util.concurrent.Future<DescribeClientVpnTargetNetworksResult> describeClientVpnTargetNetworksAsync(
            DescribeClientVpnTargetNetworksRequest request) {

        return describeClientVpnTargetNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientVpnTargetNetworksResult> describeClientVpnTargetNetworksAsync(
            final DescribeClientVpnTargetNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClientVpnTargetNetworksRequest, DescribeClientVpnTargetNetworksResult> asyncHandler) {
        final DescribeClientVpnTargetNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClientVpnTargetNetworksResult>() {
            @Override
            public DescribeClientVpnTargetNetworksResult call() throws Exception {
                DescribeClientVpnTargetNetworksResult result = null;

                try {
                    result = executeDescribeClientVpnTargetNetworks(finalRequest);
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
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest request) {

        return describeConversionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConversionTasksResult> describeConversionTasksAsync(final DescribeConversionTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler) {
        final DescribeConversionTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConversionTasksResult>() {
            @Override
            public DescribeConversionTasksResult call() throws Exception {
                DescribeConversionTasksResult result = null;

                try {
                    result = executeDescribeConversionTasks(finalRequest);
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
    @Override
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
        final DescribeCustomerGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomerGatewaysResult>() {
            @Override
            public DescribeCustomerGatewaysResult call() throws Exception {
                DescribeCustomerGatewaysResult result = null;

                try {
                    result = executeDescribeCustomerGateways(finalRequest);
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
    @Override
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
        final DescribeDhcpOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDhcpOptionsResult>() {
            @Override
            public DescribeDhcpOptionsResult call() throws Exception {
                DescribeDhcpOptionsResult result = null;

                try {
                    result = executeDescribeDhcpOptions(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler) {

        return describeDhcpOptionsAsync(new DescribeDhcpOptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEgressOnlyInternetGatewaysResult> describeEgressOnlyInternetGatewaysAsync(
            DescribeEgressOnlyInternetGatewaysRequest request) {

        return describeEgressOnlyInternetGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEgressOnlyInternetGatewaysResult> describeEgressOnlyInternetGatewaysAsync(
            final DescribeEgressOnlyInternetGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEgressOnlyInternetGatewaysRequest, DescribeEgressOnlyInternetGatewaysResult> asyncHandler) {
        final DescribeEgressOnlyInternetGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEgressOnlyInternetGatewaysResult>() {
            @Override
            public DescribeEgressOnlyInternetGatewaysResult call() throws Exception {
                DescribeEgressOnlyInternetGatewaysResult result = null;

                try {
                    result = executeDescribeEgressOnlyInternetGateways(finalRequest);
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
    public java.util.concurrent.Future<DescribeElasticGpusResult> describeElasticGpusAsync(DescribeElasticGpusRequest request) {

        return describeElasticGpusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticGpusResult> describeElasticGpusAsync(final DescribeElasticGpusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeElasticGpusRequest, DescribeElasticGpusResult> asyncHandler) {
        final DescribeElasticGpusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeElasticGpusResult>() {
            @Override
            public DescribeElasticGpusResult call() throws Exception {
                DescribeElasticGpusResult result = null;

                try {
                    result = executeDescribeElasticGpus(finalRequest);
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
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(final DescribeExportTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {
        final DescribeExportTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportTasksResult>() {
            @Override
            public DescribeExportTasksResult call() throws Exception {
                DescribeExportTasksResult result = null;

                try {
                    result = executeDescribeExportTasks(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        return describeExportTasksAsync(new DescribeExportTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetHistoryResult> describeFleetHistoryAsync(DescribeFleetHistoryRequest request) {

        return describeFleetHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetHistoryResult> describeFleetHistoryAsync(final DescribeFleetHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetHistoryRequest, DescribeFleetHistoryResult> asyncHandler) {
        final DescribeFleetHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetHistoryResult>() {
            @Override
            public DescribeFleetHistoryResult call() throws Exception {
                DescribeFleetHistoryResult result = null;

                try {
                    result = executeDescribeFleetHistory(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetInstancesResult> describeFleetInstancesAsync(DescribeFleetInstancesRequest request) {

        return describeFleetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetInstancesResult> describeFleetInstancesAsync(final DescribeFleetInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetInstancesRequest, DescribeFleetInstancesResult> asyncHandler) {
        final DescribeFleetInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetInstancesResult>() {
            @Override
            public DescribeFleetInstancesResult call() throws Exception {
                DescribeFleetInstancesResult result = null;

                try {
                    result = executeDescribeFleetInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest request) {

        return describeFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(final DescribeFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetsRequest, DescribeFleetsResult> asyncHandler) {
        final DescribeFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetsResult>() {
            @Override
            public DescribeFleetsResult call() throws Exception {
                DescribeFleetsResult result = null;

                try {
                    result = executeDescribeFleets(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(DescribeFlowLogsRequest request) {

        return describeFlowLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(final DescribeFlowLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler) {
        final DescribeFlowLogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowLogsResult>() {
            @Override
            public DescribeFlowLogsResult call() throws Exception {
                DescribeFlowLogsResult result = null;

                try {
                    result = executeDescribeFlowLogs(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeFlowLogsResult> describeFlowLogsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFlowLogsRequest, DescribeFlowLogsResult> asyncHandler) {

        return describeFlowLogsAsync(new DescribeFlowLogsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImageAttributeResult> describeFpgaImageAttributeAsync(DescribeFpgaImageAttributeRequest request) {

        return describeFpgaImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImageAttributeResult> describeFpgaImageAttributeAsync(final DescribeFpgaImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFpgaImageAttributeRequest, DescribeFpgaImageAttributeResult> asyncHandler) {
        final DescribeFpgaImageAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFpgaImageAttributeResult>() {
            @Override
            public DescribeFpgaImageAttributeResult call() throws Exception {
                DescribeFpgaImageAttributeResult result = null;

                try {
                    result = executeDescribeFpgaImageAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeFpgaImagesResult> describeFpgaImagesAsync(DescribeFpgaImagesRequest request) {

        return describeFpgaImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFpgaImagesResult> describeFpgaImagesAsync(final DescribeFpgaImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFpgaImagesRequest, DescribeFpgaImagesResult> asyncHandler) {
        final DescribeFpgaImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFpgaImagesResult>() {
            @Override
            public DescribeFpgaImagesResult call() throws Exception {
                DescribeFpgaImagesResult result = null;

                try {
                    result = executeDescribeFpgaImages(finalRequest);
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
    public java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            DescribeHostReservationOfferingsRequest request) {

        return describeHostReservationOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationOfferingsResult> describeHostReservationOfferingsAsync(
            final DescribeHostReservationOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostReservationOfferingsRequest, DescribeHostReservationOfferingsResult> asyncHandler) {
        final DescribeHostReservationOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostReservationOfferingsResult>() {
            @Override
            public DescribeHostReservationOfferingsResult call() throws Exception {
                DescribeHostReservationOfferingsResult result = null;

                try {
                    result = executeDescribeHostReservationOfferings(finalRequest);
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
    public java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(DescribeHostReservationsRequest request) {

        return describeHostReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostReservationsResult> describeHostReservationsAsync(final DescribeHostReservationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostReservationsRequest, DescribeHostReservationsResult> asyncHandler) {
        final DescribeHostReservationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostReservationsResult>() {
            @Override
            public DescribeHostReservationsResult call() throws Exception {
                DescribeHostReservationsResult result = null;

                try {
                    result = executeDescribeHostReservations(finalRequest);
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
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(DescribeHostsRequest request) {

        return describeHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(final DescribeHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler) {
        final DescribeHostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostsResult>() {
            @Override
            public DescribeHostsResult call() throws Exception {
                DescribeHostsResult result = null;

                try {
                    result = executeDescribeHosts(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeHostsResult> describeHostsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHostsRequest, DescribeHostsResult> asyncHandler) {

        return describeHostsAsync(new DescribeHostsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeIamInstanceProfileAssociationsResult> describeIamInstanceProfileAssociationsAsync(
            DescribeIamInstanceProfileAssociationsRequest request) {

        return describeIamInstanceProfileAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIamInstanceProfileAssociationsResult> describeIamInstanceProfileAssociationsAsync(
            final DescribeIamInstanceProfileAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIamInstanceProfileAssociationsRequest, DescribeIamInstanceProfileAssociationsResult> asyncHandler) {
        final DescribeIamInstanceProfileAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIamInstanceProfileAssociationsResult>() {
            @Override
            public DescribeIamInstanceProfileAssociationsResult call() throws Exception {
                DescribeIamInstanceProfileAssociationsResult result = null;

                try {
                    result = executeDescribeIamInstanceProfileAssociations(finalRequest);
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
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(DescribeIdFormatRequest request) {

        return describeIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdFormatResult> describeIdFormatAsync(final DescribeIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdFormatRequest, DescribeIdFormatResult> asyncHandler) {
        final DescribeIdFormatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdFormatResult>() {
            @Override
            public DescribeIdFormatResult call() throws Exception {
                DescribeIdFormatResult result = null;

                try {
                    result = executeDescribeIdFormat(finalRequest);
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
    @Override
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
        final DescribeIdentityIdFormatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityIdFormatResult>() {
            @Override
            public DescribeIdentityIdFormatResult call() throws Exception {
                DescribeIdentityIdFormatResult result = null;

                try {
                    result = executeDescribeIdentityIdFormat(finalRequest);
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
    public java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest request) {

        return describeImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageAttributeResult> describeImageAttributeAsync(final DescribeImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImageAttributeRequest, DescribeImageAttributeResult> asyncHandler) {
        final DescribeImageAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImageAttributeResult>() {
            @Override
            public DescribeImageAttributeResult call() throws Exception {
                DescribeImageAttributeResult result = null;

                try {
                    result = executeDescribeImageAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(final DescribeImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {
        final DescribeImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImagesResult>() {
            @Override
            public DescribeImagesResult call() throws Exception {
                DescribeImagesResult result = null;

                try {
                    result = executeDescribeImages(finalRequest);
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
    @Override
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
        final DescribeImportImageTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImportImageTasksResult>() {
            @Override
            public DescribeImportImageTasksResult call() throws Exception {
                DescribeImportImageTasksResult result = null;

                try {
                    result = executeDescribeImportImageTasks(finalRequest);
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
    @Override
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
        final DescribeImportSnapshotTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImportSnapshotTasksResult>() {
            @Override
            public DescribeImportSnapshotTasksResult call() throws Exception {
                DescribeImportSnapshotTasksResult result = null;

                try {
                    result = executeDescribeImportSnapshotTasks(finalRequest);
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
    @Override
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
        final DescribeInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAttributeResult>() {
            @Override
            public DescribeInstanceAttributeResult call() throws Exception {
                DescribeInstanceAttributeResult result = null;

                try {
                    result = executeDescribeInstanceAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceCreditSpecificationsResult> describeInstanceCreditSpecificationsAsync(
            DescribeInstanceCreditSpecificationsRequest request) {

        return describeInstanceCreditSpecificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceCreditSpecificationsResult> describeInstanceCreditSpecificationsAsync(
            final DescribeInstanceCreditSpecificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceCreditSpecificationsRequest, DescribeInstanceCreditSpecificationsResult> asyncHandler) {
        final DescribeInstanceCreditSpecificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceCreditSpecificationsResult>() {
            @Override
            public DescribeInstanceCreditSpecificationsResult call() throws Exception {
                DescribeInstanceCreditSpecificationsResult result = null;

                try {
                    result = executeDescribeInstanceCreditSpecifications(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest request) {

        return describeInstanceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(final DescribeInstanceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler) {
        final DescribeInstanceStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceStatusResult>() {
            @Override
            public DescribeInstanceStatusResult call() throws Exception {
                DescribeInstanceStatusResult result = null;

                try {
                    result = executeDescribeInstanceStatus(finalRequest);
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
    @Override
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
        final DescribeInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancesResult>() {
            @Override
            public DescribeInstancesResult call() throws Exception {
                DescribeInstancesResult result = null;

                try {
                    result = executeDescribeInstances(finalRequest);
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
    @Override
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
        final DescribeInternetGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInternetGatewaysResult>() {
            @Override
            public DescribeInternetGatewaysResult call() throws Exception {
                DescribeInternetGatewaysResult result = null;

                try {
                    result = executeDescribeInternetGateways(finalRequest);
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
    @Override
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
        final DescribeKeyPairsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeyPairsResult>() {
            @Override
            public DescribeKeyPairsResult call() throws Exception {
                DescribeKeyPairsResult result = null;

                try {
                    result = executeDescribeKeyPairs(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeKeyPairsResult> describeKeyPairsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler) {

        return describeKeyPairsAsync(new DescribeKeyPairsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplateVersionsResult> describeLaunchTemplateVersionsAsync(DescribeLaunchTemplateVersionsRequest request) {

        return describeLaunchTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplateVersionsResult> describeLaunchTemplateVersionsAsync(
            final DescribeLaunchTemplateVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLaunchTemplateVersionsRequest, DescribeLaunchTemplateVersionsResult> asyncHandler) {
        final DescribeLaunchTemplateVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLaunchTemplateVersionsResult>() {
            @Override
            public DescribeLaunchTemplateVersionsResult call() throws Exception {
                DescribeLaunchTemplateVersionsResult result = null;

                try {
                    result = executeDescribeLaunchTemplateVersions(finalRequest);
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
    public java.util.concurrent.Future<DescribeLaunchTemplatesResult> describeLaunchTemplatesAsync(DescribeLaunchTemplatesRequest request) {

        return describeLaunchTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchTemplatesResult> describeLaunchTemplatesAsync(final DescribeLaunchTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLaunchTemplatesRequest, DescribeLaunchTemplatesResult> asyncHandler) {
        final DescribeLaunchTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLaunchTemplatesResult>() {
            @Override
            public DescribeLaunchTemplatesResult call() throws Exception {
                DescribeLaunchTemplatesResult result = null;

                try {
                    result = executeDescribeLaunchTemplates(finalRequest);
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
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(DescribeMovingAddressesRequest request) {

        return describeMovingAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMovingAddressesResult> describeMovingAddressesAsync(final DescribeMovingAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMovingAddressesRequest, DescribeMovingAddressesResult> asyncHandler) {
        final DescribeMovingAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMovingAddressesResult>() {
            @Override
            public DescribeMovingAddressesResult call() throws Exception {
                DescribeMovingAddressesResult result = null;

                try {
                    result = executeDescribeMovingAddresses(finalRequest);
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
    @Override
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
        final DescribeNatGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNatGatewaysResult>() {
            @Override
            public DescribeNatGatewaysResult call() throws Exception {
                DescribeNatGatewaysResult result = null;

                try {
                    result = executeDescribeNatGateways(finalRequest);
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
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest request) {

        return describeNetworkAclsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(final DescribeNetworkAclsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler) {
        final DescribeNetworkAclsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkAclsResult>() {
            @Override
            public DescribeNetworkAclsResult call() throws Exception {
                DescribeNetworkAclsResult result = null;

                try {
                    result = executeDescribeNetworkAcls(finalRequest);
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
    @Override
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
        final DescribeNetworkInterfaceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkInterfaceAttributeResult>() {
            @Override
            public DescribeNetworkInterfaceAttributeResult call() throws Exception {
                DescribeNetworkInterfaceAttributeResult result = null;

                try {
                    result = executeDescribeNetworkInterfaceAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeNetworkInterfacePermissionsResult> describeNetworkInterfacePermissionsAsync(
            DescribeNetworkInterfacePermissionsRequest request) {

        return describeNetworkInterfacePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacePermissionsResult> describeNetworkInterfacePermissionsAsync(
            final DescribeNetworkInterfacePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacePermissionsRequest, DescribeNetworkInterfacePermissionsResult> asyncHandler) {
        final DescribeNetworkInterfacePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkInterfacePermissionsResult>() {
            @Override
            public DescribeNetworkInterfacePermissionsResult call() throws Exception {
                DescribeNetworkInterfacePermissionsResult result = null;

                try {
                    result = executeDescribeNetworkInterfacePermissions(finalRequest);
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
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest request) {

        return describeNetworkInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(final DescribeNetworkInterfacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler) {
        final DescribeNetworkInterfacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNetworkInterfacesResult>() {
            @Override
            public DescribeNetworkInterfacesResult call() throws Exception {
                DescribeNetworkInterfacesResult result = null;

                try {
                    result = executeDescribeNetworkInterfaces(finalRequest);
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
    @Override
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
        final DescribePlacementGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePlacementGroupsResult>() {
            @Override
            public DescribePlacementGroupsResult call() throws Exception {
                DescribePlacementGroupsResult result = null;

                try {
                    result = executeDescribePlacementGroups(finalRequest);
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
    @Override
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
        final DescribePrefixListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePrefixListsResult>() {
            @Override
            public DescribePrefixListsResult call() throws Exception {
                DescribePrefixListsResult result = null;

                try {
                    result = executeDescribePrefixLists(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribePrefixListsResult> describePrefixListsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePrefixListsRequest, DescribePrefixListsResult> asyncHandler) {

        return describePrefixListsAsync(new DescribePrefixListsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalIdFormatResult> describePrincipalIdFormatAsync(DescribePrincipalIdFormatRequest request) {

        return describePrincipalIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePrincipalIdFormatResult> describePrincipalIdFormatAsync(final DescribePrincipalIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePrincipalIdFormatRequest, DescribePrincipalIdFormatResult> asyncHandler) {
        final DescribePrincipalIdFormatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePrincipalIdFormatResult>() {
            @Override
            public DescribePrincipalIdFormatResult call() throws Exception {
                DescribePrincipalIdFormatResult result = null;

                try {
                    result = executeDescribePrincipalIdFormat(finalRequest);
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
    public java.util.concurrent.Future<DescribePublicIpv4PoolsResult> describePublicIpv4PoolsAsync(DescribePublicIpv4PoolsRequest request) {

        return describePublicIpv4PoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePublicIpv4PoolsResult> describePublicIpv4PoolsAsync(final DescribePublicIpv4PoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePublicIpv4PoolsRequest, DescribePublicIpv4PoolsResult> asyncHandler) {
        final DescribePublicIpv4PoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePublicIpv4PoolsResult>() {
            @Override
            public DescribePublicIpv4PoolsResult call() throws Exception {
                DescribePublicIpv4PoolsResult result = null;

                try {
                    result = executeDescribePublicIpv4Pools(finalRequest);
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
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest request) {

        return describeRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegionsResult> describeRegionsAsync(final DescribeRegionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler) {
        final DescribeRegionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegionsResult>() {
            @Override
            public DescribeRegionsResult call() throws Exception {
                DescribeRegionsResult result = null;

                try {
                    result = executeDescribeRegions(finalRequest);
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
    @Override
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
        final DescribeReservedInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesResult>() {
            @Override
            public DescribeReservedInstancesResult call() throws Exception {
                DescribeReservedInstancesResult result = null;

                try {
                    result = executeDescribeReservedInstances(finalRequest);
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
    @Override
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
        final DescribeReservedInstancesListingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesListingsResult>() {
            @Override
            public DescribeReservedInstancesListingsResult call() throws Exception {
                DescribeReservedInstancesListingsResult result = null;

                try {
                    result = executeDescribeReservedInstancesListings(finalRequest);
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
    @Override
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
        final DescribeReservedInstancesModificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesModificationsResult>() {
            @Override
            public DescribeReservedInstancesModificationsResult call() throws Exception {
                DescribeReservedInstancesModificationsResult result = null;

                try {
                    result = executeDescribeReservedInstancesModifications(finalRequest);
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
    @Override
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
        final DescribeReservedInstancesOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedInstancesOfferingsResult>() {
            @Override
            public DescribeReservedInstancesOfferingsResult call() throws Exception {
                DescribeReservedInstancesOfferingsResult result = null;

                try {
                    result = executeDescribeReservedInstancesOfferings(finalRequest);
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
    @Override
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
        final DescribeRouteTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRouteTablesResult>() {
            @Override
            public DescribeRouteTablesResult call() throws Exception {
                DescribeRouteTablesResult result = null;

                try {
                    result = executeDescribeRouteTables(finalRequest);
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
    @Override
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
        final DescribeScheduledInstanceAvailabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduledInstanceAvailabilityResult>() {
            @Override
            public DescribeScheduledInstanceAvailabilityResult call() throws Exception {
                DescribeScheduledInstanceAvailabilityResult result = null;

                try {
                    result = executeDescribeScheduledInstanceAvailability(finalRequest);
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
    public java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(DescribeScheduledInstancesRequest request) {

        return describeScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledInstancesResult> describeScheduledInstancesAsync(final DescribeScheduledInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduledInstancesRequest, DescribeScheduledInstancesResult> asyncHandler) {
        final DescribeScheduledInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduledInstancesResult>() {
            @Override
            public DescribeScheduledInstancesResult call() throws Exception {
                DescribeScheduledInstancesResult result = null;

                try {
                    result = executeDescribeScheduledInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            DescribeSecurityGroupReferencesRequest request) {

        return describeSecurityGroupReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupReferencesResult> describeSecurityGroupReferencesAsync(
            final DescribeSecurityGroupReferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupReferencesRequest, DescribeSecurityGroupReferencesResult> asyncHandler) {
        final DescribeSecurityGroupReferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityGroupReferencesResult>() {
            @Override
            public DescribeSecurityGroupReferencesResult call() throws Exception {
                DescribeSecurityGroupReferencesResult result = null;

                try {
                    result = executeDescribeSecurityGroupReferences(finalRequest);
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
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest request) {

        return describeSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(final DescribeSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler) {
        final DescribeSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityGroupsResult>() {
            @Override
            public DescribeSecurityGroupsResult call() throws Exception {
                DescribeSecurityGroupsResult result = null;

                try {
                    result = executeDescribeSecurityGroups(finalRequest);
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
    @Override
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
        final DescribeSnapshotAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotAttributeResult>() {
            @Override
            public DescribeSnapshotAttributeResult call() throws Exception {
                DescribeSnapshotAttributeResult result = null;

                try {
                    result = executeDescribeSnapshotAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {
        final DescribeSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotsResult>() {
            @Override
            public DescribeSnapshotsResult call() throws Exception {
                DescribeSnapshotsResult result = null;

                try {
                    result = executeDescribeSnapshots(finalRequest);
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
    @Override
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
        final DescribeSpotDatafeedSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotDatafeedSubscriptionResult>() {
            @Override
            public DescribeSpotDatafeedSubscriptionResult call() throws Exception {
                DescribeSpotDatafeedSubscriptionResult result = null;

                try {
                    result = executeDescribeSpotDatafeedSubscription(finalRequest);
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
    @Override
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
        final DescribeSpotFleetInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotFleetInstancesResult>() {
            @Override
            public DescribeSpotFleetInstancesResult call() throws Exception {
                DescribeSpotFleetInstancesResult result = null;

                try {
                    result = executeDescribeSpotFleetInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            DescribeSpotFleetRequestHistoryRequest request) {

        return describeSpotFleetRequestHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestHistoryResult> describeSpotFleetRequestHistoryAsync(
            final DescribeSpotFleetRequestHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestHistoryRequest, DescribeSpotFleetRequestHistoryResult> asyncHandler) {
        final DescribeSpotFleetRequestHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotFleetRequestHistoryResult>() {
            @Override
            public DescribeSpotFleetRequestHistoryResult call() throws Exception {
                DescribeSpotFleetRequestHistoryResult result = null;

                try {
                    result = executeDescribeSpotFleetRequestHistory(finalRequest);
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
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(DescribeSpotFleetRequestsRequest request) {

        return describeSpotFleetRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpotFleetRequestsResult> describeSpotFleetRequestsAsync(final DescribeSpotFleetRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpotFleetRequestsRequest, DescribeSpotFleetRequestsResult> asyncHandler) {
        final DescribeSpotFleetRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotFleetRequestsResult>() {
            @Override
            public DescribeSpotFleetRequestsResult call() throws Exception {
                DescribeSpotFleetRequestsResult result = null;

                try {
                    result = executeDescribeSpotFleetRequests(finalRequest);
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
    @Override
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
        final DescribeSpotInstanceRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotInstanceRequestsResult>() {
            @Override
            public DescribeSpotInstanceRequestsResult call() throws Exception {
                DescribeSpotInstanceRequestsResult result = null;

                try {
                    result = executeDescribeSpotInstanceRequests(finalRequest);
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
    @Override
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
        final DescribeSpotPriceHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpotPriceHistoryResult>() {
            @Override
            public DescribeSpotPriceHistoryResult call() throws Exception {
                DescribeSpotPriceHistoryResult result = null;

                try {
                    result = executeDescribeSpotPriceHistory(finalRequest);
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
    @Override
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
        final DescribeStaleSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStaleSecurityGroupsResult>() {
            @Override
            public DescribeStaleSecurityGroupsResult call() throws Exception {
                DescribeStaleSecurityGroupsResult result = null;

                try {
                    result = executeDescribeStaleSecurityGroups(finalRequest);
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
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest request) {

        return describeSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetsResult> describeSubnetsAsync(final DescribeSubnetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler) {
        final DescribeSubnetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubnetsResult>() {
            @Override
            public DescribeSubnetsResult call() throws Exception {
                DescribeSubnetsResult result = null;

                try {
                    result = executeDescribeSubnets(finalRequest);
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
    @Override
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
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayAttachmentsResult> describeTransitGatewayAttachmentsAsync(
            DescribeTransitGatewayAttachmentsRequest request) {

        return describeTransitGatewayAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayAttachmentsResult> describeTransitGatewayAttachmentsAsync(
            final DescribeTransitGatewayAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewayAttachmentsRequest, DescribeTransitGatewayAttachmentsResult> asyncHandler) {
        final DescribeTransitGatewayAttachmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransitGatewayAttachmentsResult>() {
            @Override
            public DescribeTransitGatewayAttachmentsResult call() throws Exception {
                DescribeTransitGatewayAttachmentsResult result = null;

                try {
                    result = executeDescribeTransitGatewayAttachments(finalRequest);
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
    public java.util.concurrent.Future<DescribeTransitGatewayRouteTablesResult> describeTransitGatewayRouteTablesAsync(
            DescribeTransitGatewayRouteTablesRequest request) {

        return describeTransitGatewayRouteTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayRouteTablesResult> describeTransitGatewayRouteTablesAsync(
            final DescribeTransitGatewayRouteTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewayRouteTablesRequest, DescribeTransitGatewayRouteTablesResult> asyncHandler) {
        final DescribeTransitGatewayRouteTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransitGatewayRouteTablesResult>() {
            @Override
            public DescribeTransitGatewayRouteTablesResult call() throws Exception {
                DescribeTransitGatewayRouteTablesResult result = null;

                try {
                    result = executeDescribeTransitGatewayRouteTables(finalRequest);
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
    public java.util.concurrent.Future<DescribeTransitGatewayVpcAttachmentsResult> describeTransitGatewayVpcAttachmentsAsync(
            DescribeTransitGatewayVpcAttachmentsRequest request) {

        return describeTransitGatewayVpcAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewayVpcAttachmentsResult> describeTransitGatewayVpcAttachmentsAsync(
            final DescribeTransitGatewayVpcAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewayVpcAttachmentsRequest, DescribeTransitGatewayVpcAttachmentsResult> asyncHandler) {
        final DescribeTransitGatewayVpcAttachmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransitGatewayVpcAttachmentsResult>() {
            @Override
            public DescribeTransitGatewayVpcAttachmentsResult call() throws Exception {
                DescribeTransitGatewayVpcAttachmentsResult result = null;

                try {
                    result = executeDescribeTransitGatewayVpcAttachments(finalRequest);
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
    public java.util.concurrent.Future<DescribeTransitGatewaysResult> describeTransitGatewaysAsync(DescribeTransitGatewaysRequest request) {

        return describeTransitGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransitGatewaysResult> describeTransitGatewaysAsync(final DescribeTransitGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransitGatewaysRequest, DescribeTransitGatewaysResult> asyncHandler) {
        final DescribeTransitGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransitGatewaysResult>() {
            @Override
            public DescribeTransitGatewaysResult call() throws Exception {
                DescribeTransitGatewaysResult result = null;

                try {
                    result = executeDescribeTransitGateways(finalRequest);
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
    public java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest request) {

        return describeVolumeAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(final DescribeVolumeAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumeAttributeRequest, DescribeVolumeAttributeResult> asyncHandler) {
        final DescribeVolumeAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumeAttributeResult>() {
            @Override
            public DescribeVolumeAttributeResult call() throws Exception {
                DescribeVolumeAttributeResult result = null;

                try {
                    result = executeDescribeVolumeAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest request) {

        return describeVolumeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(final DescribeVolumeStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler) {
        final DescribeVolumeStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumeStatusResult>() {
            @Override
            public DescribeVolumeStatusResult call() throws Exception {
                DescribeVolumeStatusResult result = null;

                try {
                    result = executeDescribeVolumeStatus(finalRequest);
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
    @Override
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
        final DescribeVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumesResult>() {
            @Override
            public DescribeVolumesResult call() throws Exception {
                DescribeVolumesResult result = null;

                try {
                    result = executeDescribeVolumes(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        return describeVolumesAsync(new DescribeVolumesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesModificationsResult> describeVolumesModificationsAsync(DescribeVolumesModificationsRequest request) {

        return describeVolumesModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesModificationsResult> describeVolumesModificationsAsync(final DescribeVolumesModificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumesModificationsRequest, DescribeVolumesModificationsResult> asyncHandler) {
        final DescribeVolumesModificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumesModificationsResult>() {
            @Override
            public DescribeVolumesModificationsResult call() throws Exception {
                DescribeVolumesModificationsResult result = null;

                try {
                    result = executeDescribeVolumesModifications(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest request) {

        return describeVpcAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(final DescribeVpcAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcAttributeRequest, DescribeVpcAttributeResult> asyncHandler) {
        final DescribeVpcAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcAttributeResult>() {
            @Override
            public DescribeVpcAttributeResult call() throws Exception {
                DescribeVpcAttributeResult result = null;

                try {
                    result = executeDescribeVpcAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(DescribeVpcClassicLinkRequest request) {

        return describeVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcClassicLinkResult> describeVpcClassicLinkAsync(final DescribeVpcClassicLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcClassicLinkRequest, DescribeVpcClassicLinkResult> asyncHandler) {
        final DescribeVpcClassicLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcClassicLinkResult>() {
            @Override
            public DescribeVpcClassicLinkResult call() throws Exception {
                DescribeVpcClassicLinkResult result = null;

                try {
                    result = executeDescribeVpcClassicLink(finalRequest);
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
    @Override
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
        final DescribeVpcClassicLinkDnsSupportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcClassicLinkDnsSupportResult>() {
            @Override
            public DescribeVpcClassicLinkDnsSupportResult call() throws Exception {
                DescribeVpcClassicLinkDnsSupportResult result = null;

                try {
                    result = executeDescribeVpcClassicLinkDnsSupport(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionNotificationsResult> describeVpcEndpointConnectionNotificationsAsync(
            DescribeVpcEndpointConnectionNotificationsRequest request) {

        return describeVpcEndpointConnectionNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionNotificationsResult> describeVpcEndpointConnectionNotificationsAsync(
            final DescribeVpcEndpointConnectionNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointConnectionNotificationsRequest, DescribeVpcEndpointConnectionNotificationsResult> asyncHandler) {
        final DescribeVpcEndpointConnectionNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointConnectionNotificationsResult>() {
            @Override
            public DescribeVpcEndpointConnectionNotificationsResult call() throws Exception {
                DescribeVpcEndpointConnectionNotificationsResult result = null;

                try {
                    result = executeDescribeVpcEndpointConnectionNotifications(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionsResult> describeVpcEndpointConnectionsAsync(DescribeVpcEndpointConnectionsRequest request) {

        return describeVpcEndpointConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointConnectionsResult> describeVpcEndpointConnectionsAsync(
            final DescribeVpcEndpointConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointConnectionsRequest, DescribeVpcEndpointConnectionsResult> asyncHandler) {
        final DescribeVpcEndpointConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointConnectionsResult>() {
            @Override
            public DescribeVpcEndpointConnectionsResult call() throws Exception {
                DescribeVpcEndpointConnectionsResult result = null;

                try {
                    result = executeDescribeVpcEndpointConnections(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcEndpointServiceConfigurationsResult> describeVpcEndpointServiceConfigurationsAsync(
            DescribeVpcEndpointServiceConfigurationsRequest request) {

        return describeVpcEndpointServiceConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServiceConfigurationsResult> describeVpcEndpointServiceConfigurationsAsync(
            final DescribeVpcEndpointServiceConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServiceConfigurationsRequest, DescribeVpcEndpointServiceConfigurationsResult> asyncHandler) {
        final DescribeVpcEndpointServiceConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointServiceConfigurationsResult>() {
            @Override
            public DescribeVpcEndpointServiceConfigurationsResult call() throws Exception {
                DescribeVpcEndpointServiceConfigurationsResult result = null;

                try {
                    result = executeDescribeVpcEndpointServiceConfigurations(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcEndpointServicePermissionsResult> describeVpcEndpointServicePermissionsAsync(
            DescribeVpcEndpointServicePermissionsRequest request) {

        return describeVpcEndpointServicePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicePermissionsResult> describeVpcEndpointServicePermissionsAsync(
            final DescribeVpcEndpointServicePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicePermissionsRequest, DescribeVpcEndpointServicePermissionsResult> asyncHandler) {
        final DescribeVpcEndpointServicePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointServicePermissionsResult>() {
            @Override
            public DescribeVpcEndpointServicePermissionsResult call() throws Exception {
                DescribeVpcEndpointServicePermissionsResult result = null;

                try {
                    result = executeDescribeVpcEndpointServicePermissions(finalRequest);
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
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(DescribeVpcEndpointServicesRequest request) {

        return describeVpcEndpointServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcEndpointServicesResult> describeVpcEndpointServicesAsync(final DescribeVpcEndpointServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointServicesRequest, DescribeVpcEndpointServicesResult> asyncHandler) {
        final DescribeVpcEndpointServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointServicesResult>() {
            @Override
            public DescribeVpcEndpointServicesResult call() throws Exception {
                DescribeVpcEndpointServicesResult result = null;

                try {
                    result = executeDescribeVpcEndpointServices(finalRequest);
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
    @Override
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
        final DescribeVpcEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcEndpointsResult>() {
            @Override
            public DescribeVpcEndpointsResult call() throws Exception {
                DescribeVpcEndpointsResult result = null;

                try {
                    result = executeDescribeVpcEndpoints(finalRequest);
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
    @Override
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
        final DescribeVpcPeeringConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcPeeringConnectionsResult>() {
            @Override
            public DescribeVpcPeeringConnectionsResult call() throws Exception {
                DescribeVpcPeeringConnectionsResult result = null;

                try {
                    result = executeDescribeVpcPeeringConnections(finalRequest);
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
    @Override
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
        final DescribeVpcsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcsResult>() {
            @Override
            public DescribeVpcsResult call() throws Exception {
                DescribeVpcsResult result = null;

                try {
                    result = executeDescribeVpcs(finalRequest);
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
    @Override
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
        final DescribeVpnConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpnConnectionsResult>() {
            @Override
            public DescribeVpnConnectionsResult call() throws Exception {
                DescribeVpnConnectionsResult result = null;

                try {
                    result = executeDescribeVpnConnections(finalRequest);
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
    @Override
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
        final DescribeVpnGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpnGatewaysResult>() {
            @Override
            public DescribeVpnGatewaysResult call() throws Exception {
                DescribeVpnGatewaysResult result = null;

                try {
                    result = executeDescribeVpnGateways(finalRequest);
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
    @Override
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
        final DetachClassicLinkVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachClassicLinkVpcResult>() {
            @Override
            public DetachClassicLinkVpcResult call() throws Exception {
                DetachClassicLinkVpcResult result = null;

                try {
                    result = executeDetachClassicLinkVpc(finalRequest);
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
    public java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(DetachInternetGatewayRequest request) {

        return detachInternetGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachInternetGatewayResult> detachInternetGatewayAsync(final DetachInternetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachInternetGatewayRequest, DetachInternetGatewayResult> asyncHandler) {
        final DetachInternetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachInternetGatewayResult>() {
            @Override
            public DetachInternetGatewayResult call() throws Exception {
                DetachInternetGatewayResult result = null;

                try {
                    result = executeDetachInternetGateway(finalRequest);
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
    public java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest request) {

        return detachNetworkInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachNetworkInterfaceResult> detachNetworkInterfaceAsync(final DetachNetworkInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachNetworkInterfaceRequest, DetachNetworkInterfaceResult> asyncHandler) {
        final DetachNetworkInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachNetworkInterfaceResult>() {
            @Override
            public DetachNetworkInterfaceResult call() throws Exception {
                DetachNetworkInterfaceResult result = null;

                try {
                    result = executeDetachNetworkInterface(finalRequest);
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
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest request) {

        return detachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(final DetachVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler) {
        final DetachVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachVolumeResult>() {
            @Override
            public DetachVolumeResult call() throws Exception {
                DetachVolumeResult result = null;

                try {
                    result = executeDetachVolume(finalRequest);
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
    public java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(DetachVpnGatewayRequest request) {

        return detachVpnGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVpnGatewayResult> detachVpnGatewayAsync(final DetachVpnGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachVpnGatewayRequest, DetachVpnGatewayResult> asyncHandler) {
        final DetachVpnGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachVpnGatewayResult>() {
            @Override
            public DetachVpnGatewayResult call() throws Exception {
                DetachVpnGatewayResult result = null;

                try {
                    result = executeDetachVpnGateway(finalRequest);
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
    public java.util.concurrent.Future<DisableTransitGatewayRouteTablePropagationResult> disableTransitGatewayRouteTablePropagationAsync(
            DisableTransitGatewayRouteTablePropagationRequest request) {

        return disableTransitGatewayRouteTablePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableTransitGatewayRouteTablePropagationResult> disableTransitGatewayRouteTablePropagationAsync(
            final DisableTransitGatewayRouteTablePropagationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableTransitGatewayRouteTablePropagationRequest, DisableTransitGatewayRouteTablePropagationResult> asyncHandler) {
        final DisableTransitGatewayRouteTablePropagationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableTransitGatewayRouteTablePropagationResult>() {
            @Override
            public DisableTransitGatewayRouteTablePropagationResult call() throws Exception {
                DisableTransitGatewayRouteTablePropagationResult result = null;

                try {
                    result = executeDisableTransitGatewayRouteTablePropagation(finalRequest);
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
    public java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(DisableVgwRoutePropagationRequest request) {

        return disableVgwRoutePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVgwRoutePropagationResult> disableVgwRoutePropagationAsync(final DisableVgwRoutePropagationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableVgwRoutePropagationRequest, DisableVgwRoutePropagationResult> asyncHandler) {
        final DisableVgwRoutePropagationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableVgwRoutePropagationResult>() {
            @Override
            public DisableVgwRoutePropagationResult call() throws Exception {
                DisableVgwRoutePropagationResult result = null;

                try {
                    result = executeDisableVgwRoutePropagation(finalRequest);
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
    public java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(DisableVpcClassicLinkRequest request) {

        return disableVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkResult> disableVpcClassicLinkAsync(final DisableVpcClassicLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkRequest, DisableVpcClassicLinkResult> asyncHandler) {
        final DisableVpcClassicLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableVpcClassicLinkResult>() {
            @Override
            public DisableVpcClassicLinkResult call() throws Exception {
                DisableVpcClassicLinkResult result = null;

                try {
                    result = executeDisableVpcClassicLink(finalRequest);
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
    public java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            DisableVpcClassicLinkDnsSupportRequest request) {

        return disableVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableVpcClassicLinkDnsSupportResult> disableVpcClassicLinkDnsSupportAsync(
            final DisableVpcClassicLinkDnsSupportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableVpcClassicLinkDnsSupportRequest, DisableVpcClassicLinkDnsSupportResult> asyncHandler) {
        final DisableVpcClassicLinkDnsSupportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableVpcClassicLinkDnsSupportResult>() {
            @Override
            public DisableVpcClassicLinkDnsSupportResult call() throws Exception {
                DisableVpcClassicLinkDnsSupportResult result = null;

                try {
                    result = executeDisableVpcClassicLinkDnsSupport(finalRequest);
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
    public java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(DisassociateAddressRequest request) {

        return disassociateAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAddressResult> disassociateAddressAsync(final DisassociateAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAddressRequest, DisassociateAddressResult> asyncHandler) {
        final DisassociateAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAddressResult>() {
            @Override
            public DisassociateAddressResult call() throws Exception {
                DisassociateAddressResult result = null;

                try {
                    result = executeDisassociateAddress(finalRequest);
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
    public java.util.concurrent.Future<DisassociateClientVpnTargetNetworkResult> disassociateClientVpnTargetNetworkAsync(
            DisassociateClientVpnTargetNetworkRequest request) {

        return disassociateClientVpnTargetNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateClientVpnTargetNetworkResult> disassociateClientVpnTargetNetworkAsync(
            final DisassociateClientVpnTargetNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateClientVpnTargetNetworkRequest, DisassociateClientVpnTargetNetworkResult> asyncHandler) {
        final DisassociateClientVpnTargetNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateClientVpnTargetNetworkResult>() {
            @Override
            public DisassociateClientVpnTargetNetworkResult call() throws Exception {
                DisassociateClientVpnTargetNetworkResult result = null;

                try {
                    result = executeDisassociateClientVpnTargetNetwork(finalRequest);
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
    public java.util.concurrent.Future<DisassociateIamInstanceProfileResult> disassociateIamInstanceProfileAsync(DisassociateIamInstanceProfileRequest request) {

        return disassociateIamInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateIamInstanceProfileResult> disassociateIamInstanceProfileAsync(
            final DisassociateIamInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateIamInstanceProfileRequest, DisassociateIamInstanceProfileResult> asyncHandler) {
        final DisassociateIamInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateIamInstanceProfileResult>() {
            @Override
            public DisassociateIamInstanceProfileResult call() throws Exception {
                DisassociateIamInstanceProfileResult result = null;

                try {
                    result = executeDisassociateIamInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(DisassociateRouteTableRequest request) {

        return disassociateRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRouteTableResult> disassociateRouteTableAsync(final DisassociateRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRouteTableRequest, DisassociateRouteTableResult> asyncHandler) {
        final DisassociateRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRouteTableResult>() {
            @Override
            public DisassociateRouteTableResult call() throws Exception {
                DisassociateRouteTableResult result = null;

                try {
                    result = executeDisassociateRouteTable(finalRequest);
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
    public java.util.concurrent.Future<DisassociateSubnetCidrBlockResult> disassociateSubnetCidrBlockAsync(DisassociateSubnetCidrBlockRequest request) {

        return disassociateSubnetCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetCidrBlockResult> disassociateSubnetCidrBlockAsync(final DisassociateSubnetCidrBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSubnetCidrBlockRequest, DisassociateSubnetCidrBlockResult> asyncHandler) {
        final DisassociateSubnetCidrBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSubnetCidrBlockResult>() {
            @Override
            public DisassociateSubnetCidrBlockResult call() throws Exception {
                DisassociateSubnetCidrBlockResult result = null;

                try {
                    result = executeDisassociateSubnetCidrBlock(finalRequest);
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
    public java.util.concurrent.Future<DisassociateTransitGatewayRouteTableResult> disassociateTransitGatewayRouteTableAsync(
            DisassociateTransitGatewayRouteTableRequest request) {

        return disassociateTransitGatewayRouteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTransitGatewayRouteTableResult> disassociateTransitGatewayRouteTableAsync(
            final DisassociateTransitGatewayRouteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTransitGatewayRouteTableRequest, DisassociateTransitGatewayRouteTableResult> asyncHandler) {
        final DisassociateTransitGatewayRouteTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTransitGatewayRouteTableResult>() {
            @Override
            public DisassociateTransitGatewayRouteTableResult call() throws Exception {
                DisassociateTransitGatewayRouteTableResult result = null;

                try {
                    result = executeDisassociateTransitGatewayRouteTable(finalRequest);
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
    public java.util.concurrent.Future<DisassociateVpcCidrBlockResult> disassociateVpcCidrBlockAsync(DisassociateVpcCidrBlockRequest request) {

        return disassociateVpcCidrBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateVpcCidrBlockResult> disassociateVpcCidrBlockAsync(final DisassociateVpcCidrBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateVpcCidrBlockRequest, DisassociateVpcCidrBlockResult> asyncHandler) {
        final DisassociateVpcCidrBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateVpcCidrBlockResult>() {
            @Override
            public DisassociateVpcCidrBlockResult call() throws Exception {
                DisassociateVpcCidrBlockResult result = null;

                try {
                    result = executeDisassociateVpcCidrBlock(finalRequest);
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
    public java.util.concurrent.Future<EnableTransitGatewayRouteTablePropagationResult> enableTransitGatewayRouteTablePropagationAsync(
            EnableTransitGatewayRouteTablePropagationRequest request) {

        return enableTransitGatewayRouteTablePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableTransitGatewayRouteTablePropagationResult> enableTransitGatewayRouteTablePropagationAsync(
            final EnableTransitGatewayRouteTablePropagationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableTransitGatewayRouteTablePropagationRequest, EnableTransitGatewayRouteTablePropagationResult> asyncHandler) {
        final EnableTransitGatewayRouteTablePropagationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableTransitGatewayRouteTablePropagationResult>() {
            @Override
            public EnableTransitGatewayRouteTablePropagationResult call() throws Exception {
                EnableTransitGatewayRouteTablePropagationResult result = null;

                try {
                    result = executeEnableTransitGatewayRouteTablePropagation(finalRequest);
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
    public java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(EnableVgwRoutePropagationRequest request) {

        return enableVgwRoutePropagationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVgwRoutePropagationResult> enableVgwRoutePropagationAsync(final EnableVgwRoutePropagationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVgwRoutePropagationRequest, EnableVgwRoutePropagationResult> asyncHandler) {
        final EnableVgwRoutePropagationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableVgwRoutePropagationResult>() {
            @Override
            public EnableVgwRoutePropagationResult call() throws Exception {
                EnableVgwRoutePropagationResult result = null;

                try {
                    result = executeEnableVgwRoutePropagation(finalRequest);
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
    public java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(EnableVolumeIORequest request) {

        return enableVolumeIOAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVolumeIOResult> enableVolumeIOAsync(final EnableVolumeIORequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVolumeIORequest, EnableVolumeIOResult> asyncHandler) {
        final EnableVolumeIORequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableVolumeIOResult>() {
            @Override
            public EnableVolumeIOResult call() throws Exception {
                EnableVolumeIOResult result = null;

                try {
                    result = executeEnableVolumeIO(finalRequest);
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
    public java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(EnableVpcClassicLinkRequest request) {

        return enableVpcClassicLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkResult> enableVpcClassicLinkAsync(final EnableVpcClassicLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkRequest, EnableVpcClassicLinkResult> asyncHandler) {
        final EnableVpcClassicLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableVpcClassicLinkResult>() {
            @Override
            public EnableVpcClassicLinkResult call() throws Exception {
                EnableVpcClassicLinkResult result = null;

                try {
                    result = executeEnableVpcClassicLink(finalRequest);
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
    public java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(EnableVpcClassicLinkDnsSupportRequest request) {

        return enableVpcClassicLinkDnsSupportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableVpcClassicLinkDnsSupportResult> enableVpcClassicLinkDnsSupportAsync(
            final EnableVpcClassicLinkDnsSupportRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableVpcClassicLinkDnsSupportRequest, EnableVpcClassicLinkDnsSupportResult> asyncHandler) {
        final EnableVpcClassicLinkDnsSupportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableVpcClassicLinkDnsSupportResult>() {
            @Override
            public EnableVpcClassicLinkDnsSupportResult call() throws Exception {
                EnableVpcClassicLinkDnsSupportResult result = null;

                try {
                    result = executeEnableVpcClassicLinkDnsSupport(finalRequest);
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
    public java.util.concurrent.Future<ExportClientVpnClientCertificateRevocationListResult> exportClientVpnClientCertificateRevocationListAsync(
            ExportClientVpnClientCertificateRevocationListRequest request) {

        return exportClientVpnClientCertificateRevocationListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportClientVpnClientCertificateRevocationListResult> exportClientVpnClientCertificateRevocationListAsync(
            final ExportClientVpnClientCertificateRevocationListRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportClientVpnClientCertificateRevocationListRequest, ExportClientVpnClientCertificateRevocationListResult> asyncHandler) {
        final ExportClientVpnClientCertificateRevocationListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportClientVpnClientCertificateRevocationListResult>() {
            @Override
            public ExportClientVpnClientCertificateRevocationListResult call() throws Exception {
                ExportClientVpnClientCertificateRevocationListResult result = null;

                try {
                    result = executeExportClientVpnClientCertificateRevocationList(finalRequest);
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
    public java.util.concurrent.Future<ExportClientVpnClientConfigurationResult> exportClientVpnClientConfigurationAsync(
            ExportClientVpnClientConfigurationRequest request) {

        return exportClientVpnClientConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportClientVpnClientConfigurationResult> exportClientVpnClientConfigurationAsync(
            final ExportClientVpnClientConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportClientVpnClientConfigurationRequest, ExportClientVpnClientConfigurationResult> asyncHandler) {
        final ExportClientVpnClientConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportClientVpnClientConfigurationResult>() {
            @Override
            public ExportClientVpnClientConfigurationResult call() throws Exception {
                ExportClientVpnClientConfigurationResult result = null;

                try {
                    result = executeExportClientVpnClientConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ExportTransitGatewayRoutesResult> exportTransitGatewayRoutesAsync(ExportTransitGatewayRoutesRequest request) {

        return exportTransitGatewayRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportTransitGatewayRoutesResult> exportTransitGatewayRoutesAsync(final ExportTransitGatewayRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportTransitGatewayRoutesRequest, ExportTransitGatewayRoutesResult> asyncHandler) {
        final ExportTransitGatewayRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportTransitGatewayRoutesResult>() {
            @Override
            public ExportTransitGatewayRoutesResult call() throws Exception {
                ExportTransitGatewayRoutesResult result = null;

                try {
                    result = executeExportTransitGatewayRoutes(finalRequest);
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
    public java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest request) {

        return getConsoleOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleOutputResult> getConsoleOutputAsync(final GetConsoleOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConsoleOutputRequest, GetConsoleOutputResult> asyncHandler) {
        final GetConsoleOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConsoleOutputResult>() {
            @Override
            public GetConsoleOutputResult call() throws Exception {
                GetConsoleOutputResult result = null;

                try {
                    result = executeGetConsoleOutput(finalRequest);
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
    public java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(GetConsoleScreenshotRequest request) {

        return getConsoleScreenshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleScreenshotResult> getConsoleScreenshotAsync(final GetConsoleScreenshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConsoleScreenshotRequest, GetConsoleScreenshotResult> asyncHandler) {
        final GetConsoleScreenshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConsoleScreenshotResult>() {
            @Override
            public GetConsoleScreenshotResult call() throws Exception {
                GetConsoleScreenshotResult result = null;

                try {
                    result = executeGetConsoleScreenshot(finalRequest);
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
    public java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            GetHostReservationPurchasePreviewRequest request) {

        return getHostReservationPurchasePreviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostReservationPurchasePreviewResult> getHostReservationPurchasePreviewAsync(
            final GetHostReservationPurchasePreviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostReservationPurchasePreviewRequest, GetHostReservationPurchasePreviewResult> asyncHandler) {
        final GetHostReservationPurchasePreviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostReservationPurchasePreviewResult>() {
            @Override
            public GetHostReservationPurchasePreviewResult call() throws Exception {
                GetHostReservationPurchasePreviewResult result = null;

                try {
                    result = executeGetHostReservationPurchasePreview(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchTemplateDataResult> getLaunchTemplateDataAsync(GetLaunchTemplateDataRequest request) {

        return getLaunchTemplateDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchTemplateDataResult> getLaunchTemplateDataAsync(final GetLaunchTemplateDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchTemplateDataRequest, GetLaunchTemplateDataResult> asyncHandler) {
        final GetLaunchTemplateDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchTemplateDataResult>() {
            @Override
            public GetLaunchTemplateDataResult call() throws Exception {
                GetLaunchTemplateDataResult result = null;

                try {
                    result = executeGetLaunchTemplateData(finalRequest);
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
    public java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest request) {

        return getPasswordDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPasswordDataResult> getPasswordDataAsync(final GetPasswordDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPasswordDataRequest, GetPasswordDataResult> asyncHandler) {
        final GetPasswordDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPasswordDataResult>() {
            @Override
            public GetPasswordDataResult call() throws Exception {
                GetPasswordDataResult result = null;

                try {
                    result = executeGetPasswordData(finalRequest);
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
    public java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            GetReservedInstancesExchangeQuoteRequest request) {

        return getReservedInstancesExchangeQuoteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservedInstancesExchangeQuoteResult> getReservedInstancesExchangeQuoteAsync(
            final GetReservedInstancesExchangeQuoteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReservedInstancesExchangeQuoteRequest, GetReservedInstancesExchangeQuoteResult> asyncHandler) {
        final GetReservedInstancesExchangeQuoteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReservedInstancesExchangeQuoteResult>() {
            @Override
            public GetReservedInstancesExchangeQuoteResult call() throws Exception {
                GetReservedInstancesExchangeQuoteResult result = null;

                try {
                    result = executeGetReservedInstancesExchangeQuote(finalRequest);
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
    public java.util.concurrent.Future<GetTransitGatewayAttachmentPropagationsResult> getTransitGatewayAttachmentPropagationsAsync(
            GetTransitGatewayAttachmentPropagationsRequest request) {

        return getTransitGatewayAttachmentPropagationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayAttachmentPropagationsResult> getTransitGatewayAttachmentPropagationsAsync(
            final GetTransitGatewayAttachmentPropagationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayAttachmentPropagationsRequest, GetTransitGatewayAttachmentPropagationsResult> asyncHandler) {
        final GetTransitGatewayAttachmentPropagationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayAttachmentPropagationsResult>() {
            @Override
            public GetTransitGatewayAttachmentPropagationsResult call() throws Exception {
                GetTransitGatewayAttachmentPropagationsResult result = null;

                try {
                    result = executeGetTransitGatewayAttachmentPropagations(finalRequest);
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
    public java.util.concurrent.Future<GetTransitGatewayRouteTableAssociationsResult> getTransitGatewayRouteTableAssociationsAsync(
            GetTransitGatewayRouteTableAssociationsRequest request) {

        return getTransitGatewayRouteTableAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTableAssociationsResult> getTransitGatewayRouteTableAssociationsAsync(
            final GetTransitGatewayRouteTableAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRouteTableAssociationsRequest, GetTransitGatewayRouteTableAssociationsResult> asyncHandler) {
        final GetTransitGatewayRouteTableAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayRouteTableAssociationsResult>() {
            @Override
            public GetTransitGatewayRouteTableAssociationsResult call() throws Exception {
                GetTransitGatewayRouteTableAssociationsResult result = null;

                try {
                    result = executeGetTransitGatewayRouteTableAssociations(finalRequest);
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
    public java.util.concurrent.Future<GetTransitGatewayRouteTablePropagationsResult> getTransitGatewayRouteTablePropagationsAsync(
            GetTransitGatewayRouteTablePropagationsRequest request) {

        return getTransitGatewayRouteTablePropagationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRouteTablePropagationsResult> getTransitGatewayRouteTablePropagationsAsync(
            final GetTransitGatewayRouteTablePropagationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRouteTablePropagationsRequest, GetTransitGatewayRouteTablePropagationsResult> asyncHandler) {
        final GetTransitGatewayRouteTablePropagationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayRouteTablePropagationsResult>() {
            @Override
            public GetTransitGatewayRouteTablePropagationsResult call() throws Exception {
                GetTransitGatewayRouteTablePropagationsResult result = null;

                try {
                    result = executeGetTransitGatewayRouteTablePropagations(finalRequest);
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
    public java.util.concurrent.Future<ImportClientVpnClientCertificateRevocationListResult> importClientVpnClientCertificateRevocationListAsync(
            ImportClientVpnClientCertificateRevocationListRequest request) {

        return importClientVpnClientCertificateRevocationListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportClientVpnClientCertificateRevocationListResult> importClientVpnClientCertificateRevocationListAsync(
            final ImportClientVpnClientCertificateRevocationListRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportClientVpnClientCertificateRevocationListRequest, ImportClientVpnClientCertificateRevocationListResult> asyncHandler) {
        final ImportClientVpnClientCertificateRevocationListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportClientVpnClientCertificateRevocationListResult>() {
            @Override
            public ImportClientVpnClientCertificateRevocationListResult call() throws Exception {
                ImportClientVpnClientCertificateRevocationListResult result = null;

                try {
                    result = executeImportClientVpnClientCertificateRevocationList(finalRequest);
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
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(ImportImageRequest request) {

        return importImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportImageResult> importImageAsync(final ImportImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportImageRequest, ImportImageResult> asyncHandler) {
        final ImportImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportImageResult>() {
            @Override
            public ImportImageResult call() throws Exception {
                ImportImageResult result = null;

                try {
                    result = executeImportImage(finalRequest);
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
    @Override
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
        final ImportInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportInstanceResult>() {
            @Override
            public ImportInstanceResult call() throws Exception {
                ImportInstanceResult result = null;

                try {
                    result = executeImportInstance(finalRequest);
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
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request) {

        return importKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(final ImportKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler) {
        final ImportKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportKeyPairResult>() {
            @Override
            public ImportKeyPairResult call() throws Exception {
                ImportKeyPairResult result = null;

                try {
                    result = executeImportKeyPair(finalRequest);
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
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(ImportSnapshotRequest request) {

        return importSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSnapshotResult> importSnapshotAsync(final ImportSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportSnapshotRequest, ImportSnapshotResult> asyncHandler) {
        final ImportSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportSnapshotResult>() {
            @Override
            public ImportSnapshotResult call() throws Exception {
                ImportSnapshotResult result = null;

                try {
                    result = executeImportSnapshot(finalRequest);
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
    @Override
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
        final ImportVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportVolumeResult>() {
            @Override
            public ImportVolumeResult call() throws Exception {
                ImportVolumeResult result = null;

                try {
                    result = executeImportVolume(finalRequest);
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
    public java.util.concurrent.Future<ModifyCapacityReservationResult> modifyCapacityReservationAsync(ModifyCapacityReservationRequest request) {

        return modifyCapacityReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyCapacityReservationResult> modifyCapacityReservationAsync(final ModifyCapacityReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyCapacityReservationRequest, ModifyCapacityReservationResult> asyncHandler) {
        final ModifyCapacityReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyCapacityReservationResult>() {
            @Override
            public ModifyCapacityReservationResult call() throws Exception {
                ModifyCapacityReservationResult result = null;

                try {
                    result = executeModifyCapacityReservation(finalRequest);
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
    public java.util.concurrent.Future<ModifyClientVpnEndpointResult> modifyClientVpnEndpointAsync(ModifyClientVpnEndpointRequest request) {

        return modifyClientVpnEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClientVpnEndpointResult> modifyClientVpnEndpointAsync(final ModifyClientVpnEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClientVpnEndpointRequest, ModifyClientVpnEndpointResult> asyncHandler) {
        final ModifyClientVpnEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyClientVpnEndpointResult>() {
            @Override
            public ModifyClientVpnEndpointResult call() throws Exception {
                ModifyClientVpnEndpointResult result = null;

                try {
                    result = executeModifyClientVpnEndpoint(finalRequest);
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
    public java.util.concurrent.Future<ModifyFleetResult> modifyFleetAsync(ModifyFleetRequest request) {

        return modifyFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyFleetResult> modifyFleetAsync(final ModifyFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyFleetRequest, ModifyFleetResult> asyncHandler) {
        final ModifyFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyFleetResult>() {
            @Override
            public ModifyFleetResult call() throws Exception {
                ModifyFleetResult result = null;

                try {
                    result = executeModifyFleet(finalRequest);
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
    public java.util.concurrent.Future<ModifyFpgaImageAttributeResult> modifyFpgaImageAttributeAsync(ModifyFpgaImageAttributeRequest request) {

        return modifyFpgaImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyFpgaImageAttributeResult> modifyFpgaImageAttributeAsync(final ModifyFpgaImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyFpgaImageAttributeRequest, ModifyFpgaImageAttributeResult> asyncHandler) {
        final ModifyFpgaImageAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyFpgaImageAttributeResult>() {
            @Override
            public ModifyFpgaImageAttributeResult call() throws Exception {
                ModifyFpgaImageAttributeResult result = null;

                try {
                    result = executeModifyFpgaImageAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(ModifyHostsRequest request) {

        return modifyHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHostsResult> modifyHostsAsync(final ModifyHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyHostsRequest, ModifyHostsResult> asyncHandler) {
        final ModifyHostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyHostsResult>() {
            @Override
            public ModifyHostsResult call() throws Exception {
                ModifyHostsResult result = null;

                try {
                    result = executeModifyHosts(finalRequest);
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
    public java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(ModifyIdFormatRequest request) {

        return modifyIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyIdFormatResult> modifyIdFormatAsync(final ModifyIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyIdFormatRequest, ModifyIdFormatResult> asyncHandler) {
        final ModifyIdFormatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyIdFormatResult>() {
            @Override
            public ModifyIdFormatResult call() throws Exception {
                ModifyIdFormatResult result = null;

                try {
                    result = executeModifyIdFormat(finalRequest);
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
    public java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(ModifyIdentityIdFormatRequest request) {

        return modifyIdentityIdFormatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyIdentityIdFormatResult> modifyIdentityIdFormatAsync(final ModifyIdentityIdFormatRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyIdentityIdFormatRequest, ModifyIdentityIdFormatResult> asyncHandler) {
        final ModifyIdentityIdFormatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyIdentityIdFormatResult>() {
            @Override
            public ModifyIdentityIdFormatResult call() throws Exception {
                ModifyIdentityIdFormatResult result = null;

                try {
                    result = executeModifyIdentityIdFormat(finalRequest);
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
    public java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(ModifyImageAttributeRequest request) {

        return modifyImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyImageAttributeResult> modifyImageAttributeAsync(final ModifyImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyImageAttributeRequest, ModifyImageAttributeResult> asyncHandler) {
        final ModifyImageAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyImageAttributeResult>() {
            @Override
            public ModifyImageAttributeResult call() throws Exception {
                ModifyImageAttributeResult result = null;

                try {
                    result = executeModifyImageAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest request) {

        return modifyInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceAttributeResult> modifyInstanceAttributeAsync(final ModifyInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceAttributeRequest, ModifyInstanceAttributeResult> asyncHandler) {
        final ModifyInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceAttributeResult>() {
            @Override
            public ModifyInstanceAttributeResult call() throws Exception {
                ModifyInstanceAttributeResult result = null;

                try {
                    result = executeModifyInstanceAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyInstanceCapacityReservationAttributesResult> modifyInstanceCapacityReservationAttributesAsync(
            ModifyInstanceCapacityReservationAttributesRequest request) {

        return modifyInstanceCapacityReservationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceCapacityReservationAttributesResult> modifyInstanceCapacityReservationAttributesAsync(
            final ModifyInstanceCapacityReservationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceCapacityReservationAttributesRequest, ModifyInstanceCapacityReservationAttributesResult> asyncHandler) {
        final ModifyInstanceCapacityReservationAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceCapacityReservationAttributesResult>() {
            @Override
            public ModifyInstanceCapacityReservationAttributesResult call() throws Exception {
                ModifyInstanceCapacityReservationAttributesResult result = null;

                try {
                    result = executeModifyInstanceCapacityReservationAttributes(finalRequest);
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
    public java.util.concurrent.Future<ModifyInstanceCreditSpecificationResult> modifyInstanceCreditSpecificationAsync(
            ModifyInstanceCreditSpecificationRequest request) {

        return modifyInstanceCreditSpecificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceCreditSpecificationResult> modifyInstanceCreditSpecificationAsync(
            final ModifyInstanceCreditSpecificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceCreditSpecificationRequest, ModifyInstanceCreditSpecificationResult> asyncHandler) {
        final ModifyInstanceCreditSpecificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceCreditSpecificationResult>() {
            @Override
            public ModifyInstanceCreditSpecificationResult call() throws Exception {
                ModifyInstanceCreditSpecificationResult result = null;

                try {
                    result = executeModifyInstanceCreditSpecification(finalRequest);
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
    public java.util.concurrent.Future<ModifyInstanceEventStartTimeResult> modifyInstanceEventStartTimeAsync(ModifyInstanceEventStartTimeRequest request) {

        return modifyInstanceEventStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceEventStartTimeResult> modifyInstanceEventStartTimeAsync(final ModifyInstanceEventStartTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceEventStartTimeRequest, ModifyInstanceEventStartTimeResult> asyncHandler) {
        final ModifyInstanceEventStartTimeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceEventStartTimeResult>() {
            @Override
            public ModifyInstanceEventStartTimeResult call() throws Exception {
                ModifyInstanceEventStartTimeResult result = null;

                try {
                    result = executeModifyInstanceEventStartTime(finalRequest);
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
    public java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(ModifyInstancePlacementRequest request) {

        return modifyInstancePlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstancePlacementResult> modifyInstancePlacementAsync(final ModifyInstancePlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstancePlacementRequest, ModifyInstancePlacementResult> asyncHandler) {
        final ModifyInstancePlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstancePlacementResult>() {
            @Override
            public ModifyInstancePlacementResult call() throws Exception {
                ModifyInstancePlacementResult result = null;

                try {
                    result = executeModifyInstancePlacement(finalRequest);
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
    public java.util.concurrent.Future<ModifyLaunchTemplateResult> modifyLaunchTemplateAsync(ModifyLaunchTemplateRequest request) {

        return modifyLaunchTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyLaunchTemplateResult> modifyLaunchTemplateAsync(final ModifyLaunchTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyLaunchTemplateRequest, ModifyLaunchTemplateResult> asyncHandler) {
        final ModifyLaunchTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyLaunchTemplateResult>() {
            @Override
            public ModifyLaunchTemplateResult call() throws Exception {
                ModifyLaunchTemplateResult result = null;

                try {
                    result = executeModifyLaunchTemplate(finalRequest);
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
    public java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            ModifyNetworkInterfaceAttributeRequest request) {

        return modifyNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyNetworkInterfaceAttributeResult> modifyNetworkInterfaceAttributeAsync(
            final ModifyNetworkInterfaceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyNetworkInterfaceAttributeRequest, ModifyNetworkInterfaceAttributeResult> asyncHandler) {
        final ModifyNetworkInterfaceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyNetworkInterfaceAttributeResult>() {
            @Override
            public ModifyNetworkInterfaceAttributeResult call() throws Exception {
                ModifyNetworkInterfaceAttributeResult result = null;

                try {
                    result = executeModifyNetworkInterfaceAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest request) {

        return modifyReservedInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(final ModifyReservedInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReservedInstancesRequest, ModifyReservedInstancesResult> asyncHandler) {
        final ModifyReservedInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyReservedInstancesResult>() {
            @Override
            public ModifyReservedInstancesResult call() throws Exception {
                ModifyReservedInstancesResult result = null;

                try {
                    result = executeModifyReservedInstances(finalRequest);
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
    public java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest request) {

        return modifySnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotAttributeResult> modifySnapshotAttributeAsync(final ModifySnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySnapshotAttributeRequest, ModifySnapshotAttributeResult> asyncHandler) {
        final ModifySnapshotAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifySnapshotAttributeResult>() {
            @Override
            public ModifySnapshotAttributeResult call() throws Exception {
                ModifySnapshotAttributeResult result = null;

                try {
                    result = executeModifySnapshotAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(ModifySpotFleetRequestRequest request) {

        return modifySpotFleetRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySpotFleetRequestResult> modifySpotFleetRequestAsync(final ModifySpotFleetRequestRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySpotFleetRequestRequest, ModifySpotFleetRequestResult> asyncHandler) {
        final ModifySpotFleetRequestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifySpotFleetRequestResult>() {
            @Override
            public ModifySpotFleetRequestResult call() throws Exception {
                ModifySpotFleetRequestResult result = null;

                try {
                    result = executeModifySpotFleetRequest(finalRequest);
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
    public java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(ModifySubnetAttributeRequest request) {

        return modifySubnetAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySubnetAttributeResult> modifySubnetAttributeAsync(final ModifySubnetAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySubnetAttributeRequest, ModifySubnetAttributeResult> asyncHandler) {
        final ModifySubnetAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifySubnetAttributeResult>() {
            @Override
            public ModifySubnetAttributeResult call() throws Exception {
                ModifySubnetAttributeResult result = null;

                try {
                    result = executeModifySubnetAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyTransitGatewayVpcAttachmentResult> modifyTransitGatewayVpcAttachmentAsync(
            ModifyTransitGatewayVpcAttachmentRequest request) {

        return modifyTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyTransitGatewayVpcAttachmentResult> modifyTransitGatewayVpcAttachmentAsync(
            final ModifyTransitGatewayVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyTransitGatewayVpcAttachmentRequest, ModifyTransitGatewayVpcAttachmentResult> asyncHandler) {
        final ModifyTransitGatewayVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyTransitGatewayVpcAttachmentResult>() {
            @Override
            public ModifyTransitGatewayVpcAttachmentResult call() throws Exception {
                ModifyTransitGatewayVpcAttachmentResult result = null;

                try {
                    result = executeModifyTransitGatewayVpcAttachment(finalRequest);
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
    public java.util.concurrent.Future<ModifyVolumeResult> modifyVolumeAsync(ModifyVolumeRequest request) {

        return modifyVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeResult> modifyVolumeAsync(final ModifyVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVolumeRequest, ModifyVolumeResult> asyncHandler) {
        final ModifyVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVolumeResult>() {
            @Override
            public ModifyVolumeResult call() throws Exception {
                ModifyVolumeResult result = null;

                try {
                    result = executeModifyVolume(finalRequest);
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
    public java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest request) {

        return modifyVolumeAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVolumeAttributeResult> modifyVolumeAttributeAsync(final ModifyVolumeAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVolumeAttributeRequest, ModifyVolumeAttributeResult> asyncHandler) {
        final ModifyVolumeAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVolumeAttributeResult>() {
            @Override
            public ModifyVolumeAttributeResult call() throws Exception {
                ModifyVolumeAttributeResult result = null;

                try {
                    result = executeModifyVolumeAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(ModifyVpcAttributeRequest request) {

        return modifyVpcAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcAttributeResult> modifyVpcAttributeAsync(final ModifyVpcAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcAttributeRequest, ModifyVpcAttributeResult> asyncHandler) {
        final ModifyVpcAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcAttributeResult>() {
            @Override
            public ModifyVpcAttributeResult call() throws Exception {
                ModifyVpcAttributeResult result = null;

                try {
                    result = executeModifyVpcAttribute(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(ModifyVpcEndpointRequest request) {

        return modifyVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointResult> modifyVpcEndpointAsync(final ModifyVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointRequest, ModifyVpcEndpointResult> asyncHandler) {
        final ModifyVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcEndpointResult>() {
            @Override
            public ModifyVpcEndpointResult call() throws Exception {
                ModifyVpcEndpointResult result = null;

                try {
                    result = executeModifyVpcEndpoint(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcEndpointConnectionNotificationResult> modifyVpcEndpointConnectionNotificationAsync(
            ModifyVpcEndpointConnectionNotificationRequest request) {

        return modifyVpcEndpointConnectionNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointConnectionNotificationResult> modifyVpcEndpointConnectionNotificationAsync(
            final ModifyVpcEndpointConnectionNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointConnectionNotificationRequest, ModifyVpcEndpointConnectionNotificationResult> asyncHandler) {
        final ModifyVpcEndpointConnectionNotificationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcEndpointConnectionNotificationResult>() {
            @Override
            public ModifyVpcEndpointConnectionNotificationResult call() throws Exception {
                ModifyVpcEndpointConnectionNotificationResult result = null;

                try {
                    result = executeModifyVpcEndpointConnectionNotification(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcEndpointServiceConfigurationResult> modifyVpcEndpointServiceConfigurationAsync(
            ModifyVpcEndpointServiceConfigurationRequest request) {

        return modifyVpcEndpointServiceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointServiceConfigurationResult> modifyVpcEndpointServiceConfigurationAsync(
            final ModifyVpcEndpointServiceConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointServiceConfigurationRequest, ModifyVpcEndpointServiceConfigurationResult> asyncHandler) {
        final ModifyVpcEndpointServiceConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcEndpointServiceConfigurationResult>() {
            @Override
            public ModifyVpcEndpointServiceConfigurationResult call() throws Exception {
                ModifyVpcEndpointServiceConfigurationResult result = null;

                try {
                    result = executeModifyVpcEndpointServiceConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcEndpointServicePermissionsResult> modifyVpcEndpointServicePermissionsAsync(
            ModifyVpcEndpointServicePermissionsRequest request) {

        return modifyVpcEndpointServicePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcEndpointServicePermissionsResult> modifyVpcEndpointServicePermissionsAsync(
            final ModifyVpcEndpointServicePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcEndpointServicePermissionsRequest, ModifyVpcEndpointServicePermissionsResult> asyncHandler) {
        final ModifyVpcEndpointServicePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcEndpointServicePermissionsResult>() {
            @Override
            public ModifyVpcEndpointServicePermissionsResult call() throws Exception {
                ModifyVpcEndpointServicePermissionsResult result = null;

                try {
                    result = executeModifyVpcEndpointServicePermissions(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            ModifyVpcPeeringConnectionOptionsRequest request) {

        return modifyVpcPeeringConnectionOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcPeeringConnectionOptionsResult> modifyVpcPeeringConnectionOptionsAsync(
            final ModifyVpcPeeringConnectionOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcPeeringConnectionOptionsRequest, ModifyVpcPeeringConnectionOptionsResult> asyncHandler) {
        final ModifyVpcPeeringConnectionOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcPeeringConnectionOptionsResult>() {
            @Override
            public ModifyVpcPeeringConnectionOptionsResult call() throws Exception {
                ModifyVpcPeeringConnectionOptionsResult result = null;

                try {
                    result = executeModifyVpcPeeringConnectionOptions(finalRequest);
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
    public java.util.concurrent.Future<ModifyVpcTenancyResult> modifyVpcTenancyAsync(ModifyVpcTenancyRequest request) {

        return modifyVpcTenancyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyVpcTenancyResult> modifyVpcTenancyAsync(final ModifyVpcTenancyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyVpcTenancyRequest, ModifyVpcTenancyResult> asyncHandler) {
        final ModifyVpcTenancyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyVpcTenancyResult>() {
            @Override
            public ModifyVpcTenancyResult call() throws Exception {
                ModifyVpcTenancyResult result = null;

                try {
                    result = executeModifyVpcTenancy(finalRequest);
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
    public java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest request) {

        return monitorInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MonitorInstancesResult> monitorInstancesAsync(final MonitorInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<MonitorInstancesRequest, MonitorInstancesResult> asyncHandler) {
        final MonitorInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MonitorInstancesResult>() {
            @Override
            public MonitorInstancesResult call() throws Exception {
                MonitorInstancesResult result = null;

                try {
                    result = executeMonitorInstances(finalRequest);
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
    public java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(MoveAddressToVpcRequest request) {

        return moveAddressToVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MoveAddressToVpcResult> moveAddressToVpcAsync(final MoveAddressToVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<MoveAddressToVpcRequest, MoveAddressToVpcResult> asyncHandler) {
        final MoveAddressToVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MoveAddressToVpcResult>() {
            @Override
            public MoveAddressToVpcResult call() throws Exception {
                MoveAddressToVpcResult result = null;

                try {
                    result = executeMoveAddressToVpc(finalRequest);
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
    public java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(ProvisionByoipCidrRequest request) {

        return provisionByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(final ProvisionByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvisionByoipCidrRequest, ProvisionByoipCidrResult> asyncHandler) {
        final ProvisionByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvisionByoipCidrResult>() {
            @Override
            public ProvisionByoipCidrResult call() throws Exception {
                ProvisionByoipCidrResult result = null;

                try {
                    result = executeProvisionByoipCidr(finalRequest);
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
    public java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(PurchaseHostReservationRequest request) {

        return purchaseHostReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseHostReservationResult> purchaseHostReservationAsync(final PurchaseHostReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseHostReservationRequest, PurchaseHostReservationResult> asyncHandler) {
        final PurchaseHostReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseHostReservationResult>() {
            @Override
            public PurchaseHostReservationResult call() throws Exception {
                PurchaseHostReservationResult result = null;

                try {
                    result = executePurchaseHostReservation(finalRequest);
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
    public java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            PurchaseReservedInstancesOfferingRequest request) {

        return purchaseReservedInstancesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(
            final PurchaseReservedInstancesOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResult> asyncHandler) {
        final PurchaseReservedInstancesOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseReservedInstancesOfferingResult>() {
            @Override
            public PurchaseReservedInstancesOfferingResult call() throws Exception {
                PurchaseReservedInstancesOfferingResult result = null;

                try {
                    result = executePurchaseReservedInstancesOffering(finalRequest);
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
    public java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(PurchaseScheduledInstancesRequest request) {

        return purchaseScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseScheduledInstancesResult> purchaseScheduledInstancesAsync(final PurchaseScheduledInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseScheduledInstancesRequest, PurchaseScheduledInstancesResult> asyncHandler) {
        final PurchaseScheduledInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseScheduledInstancesResult>() {
            @Override
            public PurchaseScheduledInstancesResult call() throws Exception {
                PurchaseScheduledInstancesResult result = null;

                try {
                    result = executePurchaseScheduledInstances(finalRequest);
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
    public java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(RebootInstancesRequest request) {

        return rebootInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstancesResult> rebootInstancesAsync(final RebootInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInstancesRequest, RebootInstancesResult> asyncHandler) {
        final RebootInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootInstancesResult>() {
            @Override
            public RebootInstancesResult call() throws Exception {
                RebootInstancesResult result = null;

                try {
                    result = executeRebootInstances(finalRequest);
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
    public java.util.concurrent.Future<RegisterImageResult> registerImageAsync(RegisterImageRequest request) {

        return registerImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterImageResult> registerImageAsync(final RegisterImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterImageRequest, RegisterImageResult> asyncHandler) {
        final RegisterImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterImageResult>() {
            @Override
            public RegisterImageResult call() throws Exception {
                RegisterImageResult result = null;

                try {
                    result = executeRegisterImage(finalRequest);
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
    public java.util.concurrent.Future<RejectTransitGatewayVpcAttachmentResult> rejectTransitGatewayVpcAttachmentAsync(
            RejectTransitGatewayVpcAttachmentRequest request) {

        return rejectTransitGatewayVpcAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectTransitGatewayVpcAttachmentResult> rejectTransitGatewayVpcAttachmentAsync(
            final RejectTransitGatewayVpcAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectTransitGatewayVpcAttachmentRequest, RejectTransitGatewayVpcAttachmentResult> asyncHandler) {
        final RejectTransitGatewayVpcAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectTransitGatewayVpcAttachmentResult>() {
            @Override
            public RejectTransitGatewayVpcAttachmentResult call() throws Exception {
                RejectTransitGatewayVpcAttachmentResult result = null;

                try {
                    result = executeRejectTransitGatewayVpcAttachment(finalRequest);
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
    public java.util.concurrent.Future<RejectVpcEndpointConnectionsResult> rejectVpcEndpointConnectionsAsync(RejectVpcEndpointConnectionsRequest request) {

        return rejectVpcEndpointConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectVpcEndpointConnectionsResult> rejectVpcEndpointConnectionsAsync(final RejectVpcEndpointConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectVpcEndpointConnectionsRequest, RejectVpcEndpointConnectionsResult> asyncHandler) {
        final RejectVpcEndpointConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectVpcEndpointConnectionsResult>() {
            @Override
            public RejectVpcEndpointConnectionsResult call() throws Exception {
                RejectVpcEndpointConnectionsResult result = null;

                try {
                    result = executeRejectVpcEndpointConnections(finalRequest);
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
    public java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(RejectVpcPeeringConnectionRequest request) {

        return rejectVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectVpcPeeringConnectionResult> rejectVpcPeeringConnectionAsync(final RejectVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectVpcPeeringConnectionRequest, RejectVpcPeeringConnectionResult> asyncHandler) {
        final RejectVpcPeeringConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectVpcPeeringConnectionResult>() {
            @Override
            public RejectVpcPeeringConnectionResult call() throws Exception {
                RejectVpcPeeringConnectionResult result = null;

                try {
                    result = executeRejectVpcPeeringConnection(finalRequest);
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
    public java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(ReleaseAddressRequest request) {

        return releaseAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseAddressResult> releaseAddressAsync(final ReleaseAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseAddressRequest, ReleaseAddressResult> asyncHandler) {
        final ReleaseAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleaseAddressResult>() {
            @Override
            public ReleaseAddressResult call() throws Exception {
                ReleaseAddressResult result = null;

                try {
                    result = executeReleaseAddress(finalRequest);
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
    public java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(ReleaseHostsRequest request) {

        return releaseHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseHostsResult> releaseHostsAsync(final ReleaseHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseHostsRequest, ReleaseHostsResult> asyncHandler) {
        final ReleaseHostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleaseHostsResult>() {
            @Override
            public ReleaseHostsResult call() throws Exception {
                ReleaseHostsResult result = null;

                try {
                    result = executeReleaseHosts(finalRequest);
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
    public java.util.concurrent.Future<ReplaceIamInstanceProfileAssociationResult> replaceIamInstanceProfileAssociationAsync(
            ReplaceIamInstanceProfileAssociationRequest request) {

        return replaceIamInstanceProfileAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceIamInstanceProfileAssociationResult> replaceIamInstanceProfileAssociationAsync(
            final ReplaceIamInstanceProfileAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceIamInstanceProfileAssociationRequest, ReplaceIamInstanceProfileAssociationResult> asyncHandler) {
        final ReplaceIamInstanceProfileAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceIamInstanceProfileAssociationResult>() {
            @Override
            public ReplaceIamInstanceProfileAssociationResult call() throws Exception {
                ReplaceIamInstanceProfileAssociationResult result = null;

                try {
                    result = executeReplaceIamInstanceProfileAssociation(finalRequest);
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
    public java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(ReplaceNetworkAclAssociationRequest request) {

        return replaceNetworkAclAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(final ReplaceNetworkAclAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResult> asyncHandler) {
        final ReplaceNetworkAclAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceNetworkAclAssociationResult>() {
            @Override
            public ReplaceNetworkAclAssociationResult call() throws Exception {
                ReplaceNetworkAclAssociationResult result = null;

                try {
                    result = executeReplaceNetworkAclAssociation(finalRequest);
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
    public java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest request) {

        return replaceNetworkAclEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNetworkAclEntryResult> replaceNetworkAclEntryAsync(final ReplaceNetworkAclEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceNetworkAclEntryRequest, ReplaceNetworkAclEntryResult> asyncHandler) {
        final ReplaceNetworkAclEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceNetworkAclEntryResult>() {
            @Override
            public ReplaceNetworkAclEntryResult call() throws Exception {
                ReplaceNetworkAclEntryResult result = null;

                try {
                    result = executeReplaceNetworkAclEntry(finalRequest);
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
    public java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(ReplaceRouteRequest request) {

        return replaceRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteResult> replaceRouteAsync(final ReplaceRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceRouteRequest, ReplaceRouteResult> asyncHandler) {
        final ReplaceRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceRouteResult>() {
            @Override
            public ReplaceRouteResult call() throws Exception {
                ReplaceRouteResult result = null;

                try {
                    result = executeReplaceRoute(finalRequest);
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
    public java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(ReplaceRouteTableAssociationRequest request) {

        return replaceRouteTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(final ReplaceRouteTableAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResult> asyncHandler) {
        final ReplaceRouteTableAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceRouteTableAssociationResult>() {
            @Override
            public ReplaceRouteTableAssociationResult call() throws Exception {
                ReplaceRouteTableAssociationResult result = null;

                try {
                    result = executeReplaceRouteTableAssociation(finalRequest);
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
    public java.util.concurrent.Future<ReplaceTransitGatewayRouteResult> replaceTransitGatewayRouteAsync(ReplaceTransitGatewayRouteRequest request) {

        return replaceTransitGatewayRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceTransitGatewayRouteResult> replaceTransitGatewayRouteAsync(final ReplaceTransitGatewayRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceTransitGatewayRouteRequest, ReplaceTransitGatewayRouteResult> asyncHandler) {
        final ReplaceTransitGatewayRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceTransitGatewayRouteResult>() {
            @Override
            public ReplaceTransitGatewayRouteResult call() throws Exception {
                ReplaceTransitGatewayRouteResult result = null;

                try {
                    result = executeReplaceTransitGatewayRoute(finalRequest);
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
    public java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(ReportInstanceStatusRequest request) {

        return reportInstanceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportInstanceStatusResult> reportInstanceStatusAsync(final ReportInstanceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReportInstanceStatusRequest, ReportInstanceStatusResult> asyncHandler) {
        final ReportInstanceStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReportInstanceStatusResult>() {
            @Override
            public ReportInstanceStatusResult call() throws Exception {
                ReportInstanceStatusResult result = null;

                try {
                    result = executeReportInstanceStatus(finalRequest);
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
    public java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(RequestSpotFleetRequest request) {

        return requestSpotFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSpotFleetResult> requestSpotFleetAsync(final RequestSpotFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestSpotFleetRequest, RequestSpotFleetResult> asyncHandler) {
        final RequestSpotFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestSpotFleetResult>() {
            @Override
            public RequestSpotFleetResult call() throws Exception {
                RequestSpotFleetResult result = null;

                try {
                    result = executeRequestSpotFleet(finalRequest);
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
    public java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest request) {

        return requestSpotInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSpotInstancesResult> requestSpotInstancesAsync(final RequestSpotInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestSpotInstancesRequest, RequestSpotInstancesResult> asyncHandler) {
        final RequestSpotInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestSpotInstancesResult>() {
            @Override
            public RequestSpotInstancesResult call() throws Exception {
                RequestSpotInstancesResult result = null;

                try {
                    result = executeRequestSpotInstances(finalRequest);
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
    public java.util.concurrent.Future<ResetFpgaImageAttributeResult> resetFpgaImageAttributeAsync(ResetFpgaImageAttributeRequest request) {

        return resetFpgaImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetFpgaImageAttributeResult> resetFpgaImageAttributeAsync(final ResetFpgaImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetFpgaImageAttributeRequest, ResetFpgaImageAttributeResult> asyncHandler) {
        final ResetFpgaImageAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetFpgaImageAttributeResult>() {
            @Override
            public ResetFpgaImageAttributeResult call() throws Exception {
                ResetFpgaImageAttributeResult result = null;

                try {
                    result = executeResetFpgaImageAttribute(finalRequest);
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
    public java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(ResetImageAttributeRequest request) {

        return resetImageAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetImageAttributeResult> resetImageAttributeAsync(final ResetImageAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetImageAttributeRequest, ResetImageAttributeResult> asyncHandler) {
        final ResetImageAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetImageAttributeResult>() {
            @Override
            public ResetImageAttributeResult call() throws Exception {
                ResetImageAttributeResult result = null;

                try {
                    result = executeResetImageAttribute(finalRequest);
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
    public java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(ResetInstanceAttributeRequest request) {

        return resetInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetInstanceAttributeResult> resetInstanceAttributeAsync(final ResetInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetInstanceAttributeRequest, ResetInstanceAttributeResult> asyncHandler) {
        final ResetInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetInstanceAttributeResult>() {
            @Override
            public ResetInstanceAttributeResult call() throws Exception {
                ResetInstanceAttributeResult result = null;

                try {
                    result = executeResetInstanceAttribute(finalRequest);
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
    public java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(ResetNetworkInterfaceAttributeRequest request) {

        return resetNetworkInterfaceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetNetworkInterfaceAttributeResult> resetNetworkInterfaceAttributeAsync(
            final ResetNetworkInterfaceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetNetworkInterfaceAttributeRequest, ResetNetworkInterfaceAttributeResult> asyncHandler) {
        final ResetNetworkInterfaceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetNetworkInterfaceAttributeResult>() {
            @Override
            public ResetNetworkInterfaceAttributeResult call() throws Exception {
                ResetNetworkInterfaceAttributeResult result = null;

                try {
                    result = executeResetNetworkInterfaceAttribute(finalRequest);
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
    public java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest request) {

        return resetSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetSnapshotAttributeResult> resetSnapshotAttributeAsync(final ResetSnapshotAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetSnapshotAttributeRequest, ResetSnapshotAttributeResult> asyncHandler) {
        final ResetSnapshotAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetSnapshotAttributeResult>() {
            @Override
            public ResetSnapshotAttributeResult call() throws Exception {
                ResetSnapshotAttributeResult result = null;

                try {
                    result = executeResetSnapshotAttribute(finalRequest);
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
    public java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(RestoreAddressToClassicRequest request) {

        return restoreAddressToClassicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreAddressToClassicResult> restoreAddressToClassicAsync(final RestoreAddressToClassicRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreAddressToClassicRequest, RestoreAddressToClassicResult> asyncHandler) {
        final RestoreAddressToClassicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreAddressToClassicResult>() {
            @Override
            public RestoreAddressToClassicResult call() throws Exception {
                RestoreAddressToClassicResult result = null;

                try {
                    result = executeRestoreAddressToClassic(finalRequest);
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
    public java.util.concurrent.Future<RevokeClientVpnIngressResult> revokeClientVpnIngressAsync(RevokeClientVpnIngressRequest request) {

        return revokeClientVpnIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeClientVpnIngressResult> revokeClientVpnIngressAsync(final RevokeClientVpnIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeClientVpnIngressRequest, RevokeClientVpnIngressResult> asyncHandler) {
        final RevokeClientVpnIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeClientVpnIngressResult>() {
            @Override
            public RevokeClientVpnIngressResult call() throws Exception {
                RevokeClientVpnIngressResult result = null;

                try {
                    result = executeRevokeClientVpnIngress(finalRequest);
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
    public java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(RevokeSecurityGroupEgressRequest request) {

        return revokeSecurityGroupEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupEgressResult> revokeSecurityGroupEgressAsync(final RevokeSecurityGroupEgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupEgressRequest, RevokeSecurityGroupEgressResult> asyncHandler) {
        final RevokeSecurityGroupEgressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeSecurityGroupEgressResult>() {
            @Override
            public RevokeSecurityGroupEgressResult call() throws Exception {
                RevokeSecurityGroupEgressResult result = null;

                try {
                    result = executeRevokeSecurityGroupEgress(finalRequest);
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
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest request) {

        return revokeSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync(final RevokeSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSecurityGroupIngressRequest, RevokeSecurityGroupIngressResult> asyncHandler) {
        final RevokeSecurityGroupIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeSecurityGroupIngressResult>() {
            @Override
            public RevokeSecurityGroupIngressResult call() throws Exception {
                RevokeSecurityGroupIngressResult result = null;

                try {
                    result = executeRevokeSecurityGroupIngress(finalRequest);
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
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<RevokeSecurityGroupIngressResult> revokeSecurityGroupIngressAsync() {

        return revokeSecurityGroupIngressAsync(new RevokeSecurityGroupIngressRequest());
    }

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation with an AsyncHandler.
     *
     * @see #revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    @Deprecated
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
        final RunInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RunInstancesResult>() {
            @Override
            public RunInstancesResult call() throws Exception {
                RunInstancesResult result = null;

                try {
                    result = executeRunInstances(finalRequest);
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
    public java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(RunScheduledInstancesRequest request) {

        return runScheduledInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunScheduledInstancesResult> runScheduledInstancesAsync(final RunScheduledInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunScheduledInstancesRequest, RunScheduledInstancesResult> asyncHandler) {
        final RunScheduledInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RunScheduledInstancesResult>() {
            @Override
            public RunScheduledInstancesResult call() throws Exception {
                RunScheduledInstancesResult result = null;

                try {
                    result = executeRunScheduledInstances(finalRequest);
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
    public java.util.concurrent.Future<SearchTransitGatewayRoutesResult> searchTransitGatewayRoutesAsync(SearchTransitGatewayRoutesRequest request) {

        return searchTransitGatewayRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTransitGatewayRoutesResult> searchTransitGatewayRoutesAsync(final SearchTransitGatewayRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchTransitGatewayRoutesRequest, SearchTransitGatewayRoutesResult> asyncHandler) {
        final SearchTransitGatewayRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchTransitGatewayRoutesResult>() {
            @Override
            public SearchTransitGatewayRoutesResult call() throws Exception {
                SearchTransitGatewayRoutesResult result = null;

                try {
                    result = executeSearchTransitGatewayRoutes(finalRequest);
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
    public java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest request) {

        return startInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstancesResult> startInstancesAsync(final StartInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstancesRequest, StartInstancesResult> asyncHandler) {
        final StartInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInstancesResult>() {
            @Override
            public StartInstancesResult call() throws Exception {
                StartInstancesResult result = null;

                try {
                    result = executeStartInstances(finalRequest);
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
    public java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest request) {

        return stopInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstancesResult> stopInstancesAsync(final StopInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInstancesRequest, StopInstancesResult> asyncHandler) {
        final StopInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopInstancesResult>() {
            @Override
            public StopInstancesResult call() throws Exception {
                StopInstancesResult result = null;

                try {
                    result = executeStopInstances(finalRequest);
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
    public java.util.concurrent.Future<TerminateClientVpnConnectionsResult> terminateClientVpnConnectionsAsync(TerminateClientVpnConnectionsRequest request) {

        return terminateClientVpnConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateClientVpnConnectionsResult> terminateClientVpnConnectionsAsync(
            final TerminateClientVpnConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateClientVpnConnectionsRequest, TerminateClientVpnConnectionsResult> asyncHandler) {
        final TerminateClientVpnConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateClientVpnConnectionsResult>() {
            @Override
            public TerminateClientVpnConnectionsResult call() throws Exception {
                TerminateClientVpnConnectionsResult result = null;

                try {
                    result = executeTerminateClientVpnConnections(finalRequest);
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
    public java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest request) {

        return terminateInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateInstancesResult> terminateInstancesAsync(final TerminateInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateInstancesRequest, TerminateInstancesResult> asyncHandler) {
        final TerminateInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateInstancesResult>() {
            @Override
            public TerminateInstancesResult call() throws Exception {
                TerminateInstancesResult result = null;

                try {
                    result = executeTerminateInstances(finalRequest);
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
    public java.util.concurrent.Future<UnassignIpv6AddressesResult> unassignIpv6AddressesAsync(UnassignIpv6AddressesRequest request) {

        return unassignIpv6AddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignIpv6AddressesResult> unassignIpv6AddressesAsync(final UnassignIpv6AddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignIpv6AddressesRequest, UnassignIpv6AddressesResult> asyncHandler) {
        final UnassignIpv6AddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnassignIpv6AddressesResult>() {
            @Override
            public UnassignIpv6AddressesResult call() throws Exception {
                UnassignIpv6AddressesResult result = null;

                try {
                    result = executeUnassignIpv6Addresses(finalRequest);
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
    public java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(UnassignPrivateIpAddressesRequest request) {

        return unassignPrivateIpAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnassignPrivateIpAddressesResult> unassignPrivateIpAddressesAsync(final UnassignPrivateIpAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnassignPrivateIpAddressesRequest, UnassignPrivateIpAddressesResult> asyncHandler) {
        final UnassignPrivateIpAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnassignPrivateIpAddressesResult>() {
            @Override
            public UnassignPrivateIpAddressesResult call() throws Exception {
                UnassignPrivateIpAddressesResult result = null;

                try {
                    result = executeUnassignPrivateIpAddresses(finalRequest);
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
    public java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest request) {

        return unmonitorInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnmonitorInstancesResult> unmonitorInstancesAsync(final UnmonitorInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnmonitorInstancesRequest, UnmonitorInstancesResult> asyncHandler) {
        final UnmonitorInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnmonitorInstancesResult>() {
            @Override
            public UnmonitorInstancesResult call() throws Exception {
                UnmonitorInstancesResult result = null;

                try {
                    result = executeUnmonitorInstances(finalRequest);
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
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsEgressResult> updateSecurityGroupRuleDescriptionsEgressAsync(
            UpdateSecurityGroupRuleDescriptionsEgressRequest request) {

        return updateSecurityGroupRuleDescriptionsEgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsEgressResult> updateSecurityGroupRuleDescriptionsEgressAsync(
            final UpdateSecurityGroupRuleDescriptionsEgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityGroupRuleDescriptionsEgressRequest, UpdateSecurityGroupRuleDescriptionsEgressResult> asyncHandler) {
        final UpdateSecurityGroupRuleDescriptionsEgressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityGroupRuleDescriptionsEgressResult>() {
            @Override
            public UpdateSecurityGroupRuleDescriptionsEgressResult call() throws Exception {
                UpdateSecurityGroupRuleDescriptionsEgressResult result = null;

                try {
                    result = executeUpdateSecurityGroupRuleDescriptionsEgress(finalRequest);
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
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsIngressResult> updateSecurityGroupRuleDescriptionsIngressAsync(
            UpdateSecurityGroupRuleDescriptionsIngressRequest request) {

        return updateSecurityGroupRuleDescriptionsIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityGroupRuleDescriptionsIngressResult> updateSecurityGroupRuleDescriptionsIngressAsync(
            final UpdateSecurityGroupRuleDescriptionsIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityGroupRuleDescriptionsIngressRequest, UpdateSecurityGroupRuleDescriptionsIngressResult> asyncHandler) {
        final UpdateSecurityGroupRuleDescriptionsIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityGroupRuleDescriptionsIngressResult>() {
            @Override
            public UpdateSecurityGroupRuleDescriptionsIngressResult call() throws Exception {
                UpdateSecurityGroupRuleDescriptionsIngressResult result = null;

                try {
                    result = executeUpdateSecurityGroupRuleDescriptionsIngress(finalRequest);
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
    public java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(WithdrawByoipCidrRequest request) {

        return withdrawByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(final WithdrawByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<WithdrawByoipCidrRequest, WithdrawByoipCidrResult> asyncHandler) {
        final WithdrawByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<WithdrawByoipCidrResult>() {
            @Override
            public WithdrawByoipCidrResult call() throws Exception {
                WithdrawByoipCidrResult result = null;

                try {
                    result = executeWithdrawByoipCidr(finalRequest);
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
