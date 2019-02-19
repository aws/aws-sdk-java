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
package com.amazonaws.services.elasticfilesystem;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystemClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.services.elasticfilesystem.model.transform.*;

/**
 * Client for accessing EFS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 * <p>
 * Amazon Elastic File System (Amazon EFS) provides simple, scalable file storage for use with Amazon EC2 instances in
 * the AWS Cloud. With Amazon EFS, storage capacity is elastic, growing and shrinking automatically as you add and
 * remove files, so your applications have the storage they need, when they need it. For more information, see the <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/api-reference.html">User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticFileSystemClient extends AmazonWebServiceClient implements AmazonElasticFileSystem {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticFileSystem.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticfilesystem";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedAvailabilityZone").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.UnsupportedAvailabilityZoneException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IpAddressInUse").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.IpAddressInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MountTargetConflict").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.MountTargetConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SecurityGroupNotFound").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.SecurityGroupNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemInUse").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.FileSystemInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemAlreadyExists").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.FileSystemAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NetworkInterfaceLimitExceeded").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.NetworkInterfaceLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectFileSystemLifeCycleState").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.IncorrectFileSystemLifeCycleStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoFreeAddressesInSubnet").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.NoFreeAddressesInSubnetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemNotFound").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.FileSystemNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientThroughputCapacity").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.InsufficientThroughputCapacityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MountTargetNotFound").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.MountTargetNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetNotFound").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.SubnetNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectMountTargetState").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.IncorrectMountTargetStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SecurityGroupLimitExceeded").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.SecurityGroupLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThroughputLimitExceeded").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.ThroughputLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyTimeout").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.DependencyTimeoutException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequests").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemLimitExceeded").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.FileSystemLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequest").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.elasticfilesystem.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.elasticfilesystem.model.AmazonElasticFileSystemException.class));

    /**
     * Constructs a new client to invoke service methods on EFS. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticFileSystemClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EFS. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to EFS (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticFileSystemClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonElasticFileSystemClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonElasticFileSystemClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to EFS (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticFileSystemClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to EFS (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to EFS (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonElasticFileSystemClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticFileSystemClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticFileSystemClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonElasticFileSystemClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonElasticFileSystemClientBuilder builder() {
        return AmazonElasticFileSystemClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticFileSystemClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on EFS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticFileSystemClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://elasticfilesystem.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticfilesystem/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticfilesystem/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token in the request that Amazon EFS uses to
     * ensure idempotent creation (calling the operation with same creation token has no effect). If a file system does
     * not currently exist that is owned by the caller's AWS account with the specified creation token, this operation
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty file system. The file system will have an Amazon EFS assigned ID, and an initial lifecycle
     * state <code>creating</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns with the description of the created file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code> error with the ID of the existing file
     * system.
     * </p>
     * <note>
     * <p>
     * For basic use cases, you can use a randomly generated UUID for the creation token.
     * </p>
     * </note>
     * <p>
     * The idempotent operation allows you to retry a <code>CreateFileSystem</code> call without risk of creating an
     * extra file system. This can happen when an initial call fails in a way that leaves it uncertain whether or not a
     * file system was actually created. An example might be that a transport level timeout occurred or your connection
     * was reset. As long as you use the same creation token, if the initial call had succeeded in creating a file
     * system, the client can learn of its existence from the <code>FileSystemAlreadyExists</code> error.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>creating</code>. You can check the file system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which among other things returns the file system state.
     * </p>
     * </note>
     * <p>
     * This operation also takes an optional <code>PerformanceMode</code> parameter that you choose for your file
     * system. We recommend <code>generalPurpose</code> performance mode for most file systems. File systems using the
     * <code>maxIO</code> performance mode can scale to higher levels of aggregate throughput and operations per second
     * with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed
     * after the file system has been created. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html">Amazon EFS: Performance
     * Modes</a>.
     * </p>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle state to <code>available</code>, at which
     * point you can create one or more mount targets for the file system in your VPC. For more information, see
     * <a>CreateMountTarget</a>. You mount your Amazon EFS file system on an EC2 instances in your VPC by using the
     * mount target. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon EFS: How it Works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * 
     * @param createFileSystemRequest
     * @return Result of the CreateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemAlreadyExistsException
     *         Returned if the file system you are trying to create already exists, with the creation token you
     *         provided.
     * @throws FileSystemLimitExceededException
     *         Returned if the AWS account has already created the maximum number of file systems allowed per account.
     * @throws InsufficientThroughputCapacityException
     *         Returned if there's not enough capacity to provision additional throughput. This value might be returned
     *         when you try to create a file system in provisioned throughput mode, when you attempt to increase the
     *         provisioned throughput of an existing file system, or when you attempt to change an existing file system
     *         from bursting to provisioned throughput mode.
     * @throws ThroughputLimitExceededException
     *         Returned if the throughput mode or amount of provisioned throughput can't be changed because the
     *         throughput limit of 1024 MiB/s has been reached.
     * @sample AmazonElasticFileSystem.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFileSystem(request);
    }

    @SdkInternalApi
    final CreateFileSystemResult executeCreateFileSystem(CreateFileSystemRequest createFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(createFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemRequest> request = null;
        Response<CreateFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file system on EC2 instances by using the mount
     * target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC. All EC2 instances in a VPC within a given
     * Availability Zone share a single mount target for a given file system. If you have multiple subnets in an
     * Availability Zone, you create a mount target in one of the subnets. EC2 instances do not need to be in the same
     * subnet as the mount target in order to access their file system. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon EFS: How it Works</a>.
     * </p>
     * <p>
     * In the request, you also specify a file system ID for which you are creating the mount target and the file
     * system's lifecycle state must be <code>available</code>. For more information, see <a>DescribeFileSystems</a>.
     * </p>
     * <p>
     * In the request, you also provide a subnet ID, which determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VPC in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * Availability Zone in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address range from which Amazon EFS selects the IP address of the mount target (if you don't specify an IP
     * address in the request)
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that includes, a <code>MountTargetId</code> and an
     * <code>IpAddress</code>. You use this IP address when mounting the file system in an EC2 instance. You can also
     * use the mount target's DNS name when mounting the file system. The EC2 instance on which you mount the file
     * system by using the mount target can resolve the mount target's DNS name to its IP address. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation">How it
     * Works: Implementation Overview</a>.
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC, and there can be only one mount target
     * per Availability Zone. That is, if the file system already has one or more mount targets created for it, the
     * subnet specified in the request to add another mount target must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must belong to the same VPC as the subnets of the existing mount targets
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be in the same Availability Zone as any of the subnets of the existing mount targets
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new mount target in the specified subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Also creates a new network interface in the subnet as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request provides an <code>IpAddress</code>, Amazon EFS assigns that IP address to the network interface.
     * Otherwise, Amazon EFS assigns a free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not specify a primary private IP address).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request provides <code>SecurityGroups</code>, this network interface is associated with those security
     * groups. Otherwise, it belongs to the default security group for the subnet's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Assigns the description <code>Mount target <i>fsmt-id</i> for file system <i>fs-id</i> </code> where
     * <code> <i>fsmt-id</i> </code> is the mount target ID, and <code> <i>fs-id</i> </code> is the
     * <code>FileSystemId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the <code>requesterManaged</code> property of the network interface to <code>true</code>, and the
     * <code>requesterId</code> value to <code>EFS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requester-managed EC2 network interface. After the network
     * interface is created, Amazon EFS sets the <code>NetworkInterfaceId</code> field in the mount target's description
     * to the network interface ID, and the <code>IpAddress</code> field to its address. If network interface creation
     * fails, the entire <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateMountTarget</code> call returns only after creating the network interface, but while the mount
     * target state is still <code>creating</code>, you can check the mount target creation status by calling the
     * <a>DescribeMountTargets</a> operation, which among other things returns the mount target state.
     * </p>
     * </note>
     * <p>
     * We recommend that you create a mount target in each of the Availability Zones. There are cost considerations for
     * using a file system in an Availability Zone through a mount target created in another Availability Zone. For more
     * information, see <a href="http://aws.amazon.com/efs/">Amazon EFS</a>. In addition, by always using a mount target
     * local to the instance's Availability Zone, you eliminate a partial failure scenario. If the Availability Zone in
     * which your mount target is created goes down, then you can't access your file system through that mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:CreateMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation also requires permissions for the following Amazon EC2 actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMountTargetRequest
     * @return Result of the CreateMountTarget operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @throws IncorrectFileSystemLifeCycleStateException
     *         Returned if the file system's lifecycle state is not "available".
     * @throws MountTargetConflictException
     *         Returned if the mount target would violate one of the specified restrictions based on the file system's
     *         existing mount targets.
     * @throws SubnetNotFoundException
     *         Returned if there is no subnet with ID <code>SubnetId</code> provided in the request.
     * @throws NoFreeAddressesInSubnetException
     *         Returned if <code>IpAddress</code> was not specified in the request and there are no free IP addresses in
     *         the subnet.
     * @throws IpAddressInUseException
     *         Returned if the request specified an <code>IpAddress</code> that is already in use in the subnet.
     * @throws NetworkInterfaceLimitExceededException
     *         The calling account has reached the limit for elastic network interfaces for the specific AWS Region. The
     *         client should try to delete some elastic network interfaces or get the account limit raised. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Appendix_Limits.html">Amazon VPC
     *         Limits</a> in the <i>Amazon VPC User Guide </i> (see the Network interfaces per VPC entry in the table).
     * @throws SecurityGroupLimitExceededException
     *         Returned if the size of <code>SecurityGroups</code> specified in the request is greater than five.
     * @throws SecurityGroupNotFoundException
     *         Returned if one of the specified security groups doesn't exist in the subnet's VPC.
     * @throws UnsupportedAvailabilityZoneException
     * @sample AmazonElasticFileSystem.CreateMountTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateMountTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMountTargetResult createMountTarget(CreateMountTargetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMountTarget(request);
    }

    @SdkInternalApi
    final CreateMountTargetResult executeCreateMountTarget(CreateMountTargetRequest createMountTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(createMountTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMountTargetRequest> request = null;
        Response<CreateMountTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMountTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMountTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMountTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMountTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMountTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a key-value pair. If a tag key specified in
     * the request already exists on the file system, this operation overwrites its value with the value provided in the
     * request. If you add the <code>Name</code> tag to your file system, Amazon EFS returns it in the response to the
     * <a>DescribeFileSystems</a> operation.
     * </p>
     * <p>
     * This operation requires permission for the <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @sample AmazonElasticFileSystem.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents. Upon return, the file system no longer exists
     * and you can't access any contents of the deleted file system.
     * </p>
     * <p>
     * You can't delete a file system that is in use. That is, if the file system has any mount targets, you must first
     * delete them. For more information, see <a>DescribeMountTargets</a> and <a>DeleteMountTarget</a>.
     * </p>
     * <note>
     * <p>
     * The <code>DeleteFileSystem</code> call returns while the file system state is still <code>deleting</code>. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> operation, which returns a
     * list of file systems in your account. If you pass file system ID or creation token for the deleted file system,
     * the <a>DescribeFileSystems</a> returns a <code>404 FileSystemNotFound</code> error.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest
     * @return Result of the DeleteFileSystem operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @throws FileSystemInUseException
     *         Returned if a file system has mount targets.
     * @sample AmazonElasticFileSystem.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFileSystem(request);
    }

    @SdkInternalApi
    final DeleteFileSystemResult executeDeleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileSystemRequest> request = null;
        Response<DeleteFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system by using the mount target that is being deleted,
     * which might disrupt instances or applications using those mounts. To avoid applications getting cut off abruptly,
     * you might consider unmounting any mounts of the mount target, if feasible. The operation also deletes the
     * associated network interface. Uncommitted writes might be lost, but breaking a mount target using this operation
     * does not corrupt the file system itself. The file system you created remains. You can mount an EC2 instance in
     * your VPC by using another mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DeleteMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DeleteMountTarget</code> call returns while the mount target state is still <code>deleting</code>. You
     * can check the mount target deletion by calling the <a>DescribeMountTargets</a> operation, which returns a list of
     * mount target descriptions for the given file system.
     * </p>
     * </note>
     * <p>
     * The operation also requires permissions for the following Amazon EC2 action on the mount target's network
     * interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMountTargetRequest
     * @return Result of the DeleteMountTarget operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws DependencyTimeoutException
     *         The service timed out trying to fulfill the request, and the client should try the call again.
     * @throws MountTargetNotFoundException
     *         Returned if there is no mount target with the specified ID found in the caller's account.
     * @sample AmazonElasticFileSystem.DeleteMountTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteMountTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMountTargetResult deleteMountTarget(DeleteMountTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMountTarget(request);
    }

    @SdkInternalApi
    final DeleteMountTargetResult executeDeleteMountTarget(DeleteMountTargetRequest deleteMountTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMountTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMountTargetRequest> request = null;
        Response<DeleteMountTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMountTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMountTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMountTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMountTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMountTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tags from a file system. If the <code>DeleteTags</code> request includes a tag key that
     * doesn't exist, Amazon EFS ignores it and doesn't cause an error. For more information about tags and related
     * restrictions, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Tag
     * Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @sample AmazonElasticFileSystem.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either the file system <code>CreationToken</code>
     * or the <code>FileSystemId</code> is provided. Otherwise, it returns descriptions of all file systems owned by the
     * caller's AWS account in the AWS Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of descriptions in a response. Currently, this number is automatically set to 10. If more file
     * system descriptions remain, Amazon EFS returns a <code>NextMarker</code>, an opaque token, in the response. In
     * this case, you should send a subsequent request with the <code>Marker</code> request parameter set to the value
     * of <code>NextMarker</code>.
     * </p>
     * <p>
     * To retrieve a list of your file system descriptions, this operation is used in an iterative process, where
     * <code>DescribeFileSystems</code> is called first without the <code>Marker</code> and then the operation continues
     * to call it with the <code>Marker</code> parameter set to the value of the <code>NextMarker</code> from the
     * previous response until the response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest
     * @return Result of the DescribeFileSystems operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @sample AmazonElasticFileSystem.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystems"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFileSystems(request);
    }

    @SdkInternalApi
    final DescribeFileSystemsResult executeDescribeFileSystems(DescribeFileSystemsRequest describeFileSystemsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFileSystemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemsRequest> request = null;
        Response<DescribeFileSystemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFileSystemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFileSystems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFileSystemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFileSystemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeFileSystemsResult describeFileSystems() {
        return describeFileSystems(new DescribeFileSystemsRequest());
    }

    /**
     * <p>
     * Returns the current <code>LifecycleConfiguration</code> object for the specified Amazon EFS file system. EFS
     * lifecycle management uses the <code>LifecycleConfiguration</code> object to identify which files to move to the
     * EFS Infrequent Access (IA) storage class. For a file system without a <code>LifecycleConfiguration</code> object,
     * the call returns an empty array in the response.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeLifecycleConfiguration</code>
     * operation.
     * </p>
     * 
     * @param describeLifecycleConfigurationRequest
     * @return Result of the DescribeLifecycleConfiguration operation returned by the service.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @sample AmazonElasticFileSystem.DescribeLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLifecycleConfigurationResult describeLifecycleConfiguration(DescribeLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final DescribeLifecycleConfigurationResult executeDescribeLifecycleConfiguration(DescribeLifecycleConfigurationRequest describeLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLifecycleConfigurationRequest> request = null;
        Response<DescribeLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLifecycleConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLifecycleConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLifecycleConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This operation requires that the network
     * interface of the mount target has been created and the lifecycle state of the mount target is not
     * <code>deleted</code>.
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code> action on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the mount target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest
     * @return Result of the DescribeMountTargetSecurityGroups operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws MountTargetNotFoundException
     *         Returned if there is no mount target with the specified ID found in the caller's account.
     * @throws IncorrectMountTargetStateException
     *         Returned if the mount target is not in the correct state for the operation.
     * @sample AmazonElasticFileSystem.DescribeMountTargetSecurityGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMountTargetSecurityGroups(request);
    }

    @SdkInternalApi
    final DescribeMountTargetSecurityGroupsResult executeDescribeMountTargetSecurityGroups(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMountTargetSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMountTargetSecurityGroupsRequest> request = null;
        Response<DescribeMountTargetSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMountTargetSecurityGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMountTargetSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMountTargetSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMountTargetSecurityGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMountTargetSecurityGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the descriptions of all the current mount targets, or a specific mount target, for a file system. When
     * requesting all of the current mount targets, the order of mount targets returned in the response is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeMountTargets</code> action, on either
     * the file system ID that you specify in <code>FileSystemId</code>, or on the file system of the mount target that
     * you specify in <code>MountTargetId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest
     * @return Result of the DescribeMountTargets operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @throws MountTargetNotFoundException
     *         Returned if there is no mount target with the specified ID found in the caller's account.
     * @sample AmazonElasticFileSystem.DescribeMountTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMountTargetsResult describeMountTargets(DescribeMountTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMountTargets(request);
    }

    @SdkInternalApi
    final DescribeMountTargetsResult executeDescribeMountTargets(DescribeMountTargetsRequest describeMountTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMountTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMountTargetsRequest> request = null;
        Response<DescribeMountTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMountTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMountTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMountTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMountTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMountTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags associated with a file system. The order of tags returned in the response of one
     * <code>DescribeTags</code> call and the order of tags returned across the responses of a multiple-call iteration
     * (when using pagination) is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @sample AmazonElasticFileSystem.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network interface. For more information, see
     * <a>CreateMountTarget</a>. This operation replaces the security groups in effect for the network interface
     * associated with a mount target, with the <code>SecurityGroups</code> provided in the request. This operation
     * requires that the network interface of the mount target has been created and the lifecycle state of the mount
     * target is not <code>deleted</code>.
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest
     * @return Result of the ModifyMountTargetSecurityGroups operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws MountTargetNotFoundException
     *         Returned if there is no mount target with the specified ID found in the caller's account.
     * @throws IncorrectMountTargetStateException
     *         Returned if the mount target is not in the correct state for the operation.
     * @throws SecurityGroupLimitExceededException
     *         Returned if the size of <code>SecurityGroups</code> specified in the request is greater than five.
     * @throws SecurityGroupNotFoundException
     *         Returned if one of the specified security groups doesn't exist in the subnet's VPC.
     * @sample AmazonElasticFileSystem.ModifyMountTargetSecurityGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ModifyMountTargetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyMountTargetSecurityGroupsResult modifyMountTargetSecurityGroups(ModifyMountTargetSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeModifyMountTargetSecurityGroups(request);
    }

    @SdkInternalApi
    final ModifyMountTargetSecurityGroupsResult executeModifyMountTargetSecurityGroups(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyMountTargetSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyMountTargetSecurityGroupsRequest> request = null;
        Response<ModifyMountTargetSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyMountTargetSecurityGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyMountTargetSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyMountTargetSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyMountTargetSecurityGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyMountTargetSecurityGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables lifecycle management by creating a new <code>LifecycleConfiguration</code> object. A
     * <code>LifecycleConfiguration</code> object defines when files in an Amazon EFS file system are automatically
     * transitioned to the lower-cost EFS Infrequent Access (IA) storage class. A <code>LifecycleConfiguration</code>
     * applies to all files in a file system.
     * </p>
     * <p>
     * Each Amazon EFS file system supports one lifecycle configuration, which applies to all files in the file system.
     * If a <code>LifecycleConfiguration</code> object already exists for the specified file system, a
     * <code>PutLifecycleConfiguration</code> call modifies the existing configuration. A
     * <code>PutLifecycleConfiguration</code> call with an empty <code>LifecyclePolicies</code> array in the request
     * body deletes any existing <code>LifecycleConfiguration</code> and disables lifecycle management.
     * </p>
     * <note>
     * <p>
     * You can enable lifecycle management only for EFS file systems created after the release of EFS infrequent access.
     * </p>
     * </note>
     * <p>
     * In the request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID for the file system for which you are creating a lifecycle management configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>LifecyclePolicies</code> array of <code>LifecyclePolicy</code> objects that define when files are moved
     * to the IA storage class. The array can contain only one <code>"TransitionToIA": "AFTER_30_DAYS"</code>
     * <code>LifecyclePolicy</code> item.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:PutLifecycleConfiguration</code> operation.
     * </p>
     * <p>
     * To apply a <code>LifecycleConfiguration</code> object to an encrypted file system, you need the same AWS Key
     * Management Service (AWS KMS) permissions as when you created the encrypted file system.
     * </p>
     * 
     * @param putLifecycleConfigurationRequest
     * @return Result of the PutLifecycleConfiguration operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @throws IncorrectFileSystemLifeCycleStateException
     *         Returned if the file system's lifecycle state is not "available".
     * @sample AmazonElasticFileSystem.PutLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutLifecycleConfigurationResult putLifecycleConfiguration(PutLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final PutLifecycleConfigurationResult executePutLifecycleConfiguration(PutLifecycleConfigurationRequest putLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecycleConfigurationRequest> request = null;
        Response<PutLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecycleConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLifecycleConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutLifecycleConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the throughput mode or the amount of provisioned throughput of an existing file system.
     * </p>
     * 
     * @param updateFileSystemRequest
     * @return Result of the UpdateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws FileSystemNotFoundException
     *         Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
     * @throws IncorrectFileSystemLifeCycleStateException
     *         Returned if the file system's lifecycle state is not "available".
     * @throws InsufficientThroughputCapacityException
     *         Returned if there's not enough capacity to provision additional throughput. This value might be returned
     *         when you try to create a file system in provisioned throughput mode, when you attempt to increase the
     *         provisioned throughput of an existing file system, or when you attempt to change an existing file system
     *         from bursting to provisioned throughput mode.
     * @throws InternalServerErrorException
     *         Returned if an error occurred on the server side.
     * @throws ThroughputLimitExceededException
     *         Returned if the throughput mode or amount of provisioned throughput can't be changed because the
     *         throughput limit of 1024 MiB/s has been reached.
     * @throws TooManyRequestsException
     *         Returned if you don’t wait at least 24 hours before changing the throughput mode, or decreasing the
     *         Provisioned Throughput value.
     * @sample AmazonElasticFileSystem.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFileSystem(request);
    }

    @SdkInternalApi
    final UpdateFileSystemResult executeUpdateFileSystem(UpdateFileSystemRequest updateFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFileSystemRequest> request = null;
        Response<UpdateFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EFS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
