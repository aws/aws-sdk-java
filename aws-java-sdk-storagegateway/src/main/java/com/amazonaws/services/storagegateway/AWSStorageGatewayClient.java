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
package com.amazonaws.services.storagegateway;

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

import com.amazonaws.services.storagegateway.AWSStorageGatewayClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.services.storagegateway.model.transform.*;

/**
 * Client for accessing AWS Storage Gateway. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to
 * provide seamless and secure integration between an organization's on-premises IT environment and the AWS storage
 * infrastructure. The service enables you to securely upload data to the AWS cloud for cost effective backup and rapid
 * disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewayHTTPRequestsHeaders"
 * >AWS Storage Gateway Required Request Headers</a>: Describes the required headers that you must send with every POST
 * request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewaySigningRequests"
 * >Signing Requests</a>: AWS Storage Gateway requires that you authenticate every request you send; this topic
 * describes how sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#APIErrorResponses">
 * Error Responses</a>: Provides reference information about AWS Storage Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_Operations.html">Operations in AWS
 * Storage Gateway</a>: Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters,
 * response elements, possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage Gateway Regions and
 * Endpoints:</a> Provides a list of each AWS region and endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these resource IDs with the Amazon EC2 API, EC2
 * expects resource IDs in lowercase. You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be <code>vol-AA22BB012345DAF670</code>. When you use this ID
 * with the EC2 API, you must change it to <code>vol-aa22bb012345daf670</code>. Otherwise, the EC2 API might not behave
 * as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway volumes are changing to a longer
 * format. Starting in December 2016, all new volumes and snapshots will be created with a 17-character string. Starting
 * in April 2016, you will be able to use these longer IDs so you can test your systems with the new format. For more
 * information, see <a href="https://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS Resource IDs</a>.
 * </p>
 * <p>
 * For example, a volume Amazon Resource Name (ARN) with the longer volume ID format looks like the following:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>.
 * </p>
 * <p>
 * A snapshot ID with the longer ID format looks like the following: <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a href="https://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement: Heads-up – Longer
 * AWS Storage Gateway volume and snapshot IDs coming in 2016</a>.
 * </p>
 * </important>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSStorageGatewayClient extends AmazonWebServiceClient implements AWSStorageGateway {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSStorageGateway.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "storagegateway";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGatewayRequestException").withModeledClass(
                                    com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableError").withModeledClass(
                                    com.amazonaws.services.storagegateway.model.ServiceUnavailableErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.storagegateway.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.storagegateway.model.AWSStorageGatewayException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AWSStorageGatewayClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSStorageGatewayClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Storage Gateway (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSStorageGatewayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStorageGatewayClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSStorageGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSStorageGatewayClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSStorageGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Storage Gateway (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSStorageGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStorageGatewayClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSStorageGatewayClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Storage Gateway (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSStorageGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Storage Gateway (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSStorageGatewayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSStorageGatewayClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSStorageGatewayClientBuilder builder() {
        return AWSStorageGatewayClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSStorageGatewayClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSStorageGatewayClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://storagegateway.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/storagegateway/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/storagegateway/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Activates the gateway you previously deployed on your host. In the activation process, you specify information
     * such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the
     * gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also
     * associates your gateway with your account; for more information, see <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>
     * <p>
     * You must turn on the gateway VM before you can activate your gateway.
     * </p>
     * </note>
     * 
     * @param activateGatewayRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$ActivationKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayRegion</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayTimezone</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayType</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$TapeDriveType</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$MediumChangerType</a>
     *        </p>
     *        </li>
     * @return Result of the ActivateGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ActivateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ActivateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ActivateGatewayResult activateGateway(ActivateGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeActivateGateway(request);
    }

    @SdkInternalApi
    final ActivateGatewayResult executeActivateGateway(ActivateGatewayRequest activateGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(activateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateGatewayRequest> request = null;
        Response<ActivateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(activateGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivateGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached
     * volume, tape and file gateway type (see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">Storage Gateway
     * Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or
     * more disk IDs that you want to configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return Result of the AddCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddCache" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddCacheResult addCache(AddCacheRequest request) {
        request = beforeClientExecution(request);
        return executeAddCache(request);
    }

    @SdkInternalApi
    final AddCacheResult executeAddCache(AddCacheRequest addCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(addCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCacheRequest> request = null;
        Response<AddCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddCacheResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to
     * categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team.
     * Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * <li>
     * <p>
     * Storage volumes
     * </p>
     * </li>
     * <li>
     * <p>
     * Virtual tapes
     * </p>
     * </li>
     * <li>
     * <p>
     * NFS and SMB file shares
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 50 tags for each resource. Virtual tapes and storage volumes that are recovered to a
     * new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToResource(request);
    }

    @SdkInternalApi
    final AddTagsToResourceResult executeAddTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported
     * for the stored volume, cached volume and tape gateway types.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and
     * one or more disk IDs that you want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return Result of the AddUploadBuffer operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddUploadBuffer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddUploadBuffer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddUploadBufferResult addUploadBuffer(AddUploadBufferRequest request) {
        request = beforeClientExecution(request);
        return executeAddUploadBuffer(request);
    }

    @SdkInternalApi
    final AddUploadBufferResult executeAddUploadBuffer(AddUploadBufferRequest addUploadBufferRequest) {

        ExecutionContext executionContext = createExecutionContext(addUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddUploadBufferRequest> request = null;
        Response<AddUploadBufferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddUploadBufferRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addUploadBufferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddUploadBuffer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddUploadBufferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddUploadBufferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in
     * the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use
     * <a>AddUploadBuffer</a> instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the <a>AddUploadBuffer</a> operation to
     * add upload buffer to a stored volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and
     * one or more disk IDs that you want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>AddWorkingStorageInput$DiskIds</a>
     *        </p>
     *        </li>
     * @return Result of the AddWorkingStorage operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddWorkingStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddWorkingStorage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddWorkingStorageResult addWorkingStorage(AddWorkingStorageRequest request) {
        request = beforeClientExecution(request);
        return executeAddWorkingStorage(request);
    }

    @SdkInternalApi
    final AddWorkingStorageResult executeAddWorkingStorage(AddWorkingStorageRequest addWorkingStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(addWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddWorkingStorageRequest> request = null;
        Response<AddWorkingStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddWorkingStorageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addWorkingStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddWorkingStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddWorkingStorageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddWorkingStorageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and
     * attaching a volume enables you to recover your data from one gateway to a different gateway without creating a
     * snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
     * Amazon EC2 instance.
     * </p>
     * 
     * @param attachVolumeRequest
     *        AttachVolumeInput
     * @return Result of the AttachVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AttachVolume" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AttachVolumeResult attachVolume(AttachVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeAttachVolume(request);
    }

    @SdkInternalApi
    final AttachVolumeResult executeAttachVolume(AttachVolumeRequest attachVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(attachVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachVolumeRequest> request = null;
        Response<AttachVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @return Result of the CancelArchival operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CancelArchival
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CancelArchival" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelArchivalResult cancelArchival(CancelArchivalRequest request) {
        request = beforeClientExecution(request);
        return executeCancelArchival(request);
    }

    @SdkInternalApi
    final CancelArchivalResult executeCancelArchival(CancelArchivalRequest cancelArchivalRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelArchivalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelArchivalRequest> request = null;
        Response<CancelArchivalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelArchivalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelArchivalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelArchival");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelArchivalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelArchivalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is
     * initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @return Result of the CancelRetrieval operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CancelRetrieval
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CancelRetrieval" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelRetrievalResult cancelRetrieval(CancelRetrievalRequest request) {
        request = beforeClientExecution(request);
        return executeCancelRetrieval(request);
    }

    @SdkInternalApi
    final CancelRetrievalResult executeCancelRetrieval(CancelRetrievalRequest cancelRetrievalRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelRetrievalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRetrievalRequest> request = null;
        Response<CancelRetrievalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRetrievalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelRetrievalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelRetrieval");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelRetrievalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelRetrievalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached
     * volume gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a cached volume. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address
     * on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns
     * information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI
     * target ARN that initiators can use to connect to the volume target.
     * </p>
     * <p>
     * Optionally, you can provide the ARN for an existing volume as the <code>SourceVolumeARN</code> for this cached
     * volume, which creates an exact copy of the existing volume’s latest recovery point. The
     * <code>VolumeSizeInBytes</code> value must be equal to or larger than the size of the copied volume, in bytes.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return Result of the CreateCachediSCSIVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateCachediSCSIVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateCachediSCSIVolume"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCachediSCSIVolumeResult createCachediSCSIVolume(CreateCachediSCSIVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCachediSCSIVolume(request);
    }

    @SdkInternalApi
    final CreateCachediSCSIVolumeResult executeCreateCachediSCSIVolume(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(createCachediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCachediSCSIVolumeRequest> request = null;
        Response<CreateCachediSCSIVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCachediSCSIVolumeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCachediSCSIVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCachediSCSIVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCachediSCSIVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCachediSCSIVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a
     * file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS
     * interface. This operation is only supported for file gateways.
     * </p>
     * <important>
     * <p>
     * File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share.
     * Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated
     * in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS
     * STS in an AWS Region in the AWS Identity and Access Management User Guide.
     * </p>
     * <p>
     * File gateway does not support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param createNFSFileShareRequest
     *        CreateNFSFileShareInput
     * @return Result of the CreateNFSFileShare operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateNFSFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateNFSFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNFSFileShareResult createNFSFileShare(CreateNFSFileShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNFSFileShare(request);
    }

    @SdkInternalApi
    final CreateNFSFileShareResult executeCreateNFSFileShare(CreateNFSFileShareRequest createNFSFileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createNFSFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNFSFileShareRequest> request = null;
        Response<CreateNFSFileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNFSFileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNFSFileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNFSFileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNFSFileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNFSFileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is
     * a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB
     * interface. This operation is only supported for file gateways.
     * </p>
     * <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
     * Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
     * activated in this AWS Region, activate it. For information about how to activate AWS STS, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param createSMBFileShareRequest
     *        CreateSMBFileShareInput
     * @return Result of the CreateSMBFileShare operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateSMBFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSMBFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSMBFileShareResult createSMBFileShare(CreateSMBFileShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSMBFileShare(request);
    }

    @SdkInternalApi
    final CreateSMBFileShareResult executeCreateSMBFileShare(CreateSMBFileShareRequest createSMBFileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createSMBFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSMBFileShareRequest> request = null;
        Response<CreateSMBFileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSMBFileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSMBFileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSMBFileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSMBFileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSMBFileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage
     * (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in
     * Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad hoc basis.
     * This API enables you to take ad-hoc snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot"
     * >Editing a Snapshot Schedule</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also
     * provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the
     * snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you
     * a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to
     * create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or
     * DeleteSnapshot in the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html">EC2
     * API reference</a>.
     * </p>
     * </note> <important>
     * <p>
     * Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note
     * on the <a href="https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html">Welcome</a> page.
     * </p>
     * </important>
     * 
     * @param createSnapshotRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateSnapshotInput$SnapshotDescription</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateSnapshotInput$VolumeARN</a>
     *        </p>
     *        </li>
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @throws ServiceUnavailableErrorException
     *         An internal server error has occurred because the service is unavailable. For more information, see the
     *         error and message fields.
     * @sample AWSStorageGateway.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshot(request);
    }

    @SdkInternalApi
    final CreateSnapshotResult executeCreateSnapshot(CreateSnapshotRequest createSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached
     * volume gateway type.
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the volume is consistent and from which you can
     * create a snapshot. To get a list of volume recovery point for cached volume gateway, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a
     * snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In
     * response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or
     * later use it when you want to create a volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in <i>Amazon Elastic Compute
     * Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return Result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @throws ServiceUnavailableErrorException
     *         An internal server error has occurred because the service is unavailable. For more information, see the
     *         error and message fields.
     * @sample AWSStorageGateway.CreateSnapshotFromVolumeRecoveryPoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshotFromVolumeRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(CreateSnapshotFromVolumeRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshotFromVolumeRecoveryPoint(request);
    }

    @SdkInternalApi
    final CreateSnapshotFromVolumeRecoveryPointResult executeCreateSnapshotFromVolumeRecoveryPoint(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotFromVolumeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotFromVolumeRecoveryPointRequest> request = null;
        Response<CreateSnapshotFromVolumeRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotFromVolumeRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSnapshotFromVolumeRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshotFromVolumeRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSnapshotFromVolumeRecoveryPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSnapshotFromVolumeRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the
     * disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty
     * gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on which you are creating the volume. In
     * response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name
     * (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$DiskId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$SnapshotId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$TargetName</a>
     *        </p>
     *        </li>
     * @return Result of the CreateStorediSCSIVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateStorediSCSIVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateStorediSCSIVolume"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStorediSCSIVolumeResult createStorediSCSIVolume(CreateStorediSCSIVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStorediSCSIVolume(request);
    }

    @SdkInternalApi
    final CreateStorediSCSIVolumeResult executeCreateStorediSCSIVolume(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(createStorediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorediSCSIVolumeRequest> request = null;
        Response<CreateStorediSCSIVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorediSCSIVolumeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createStorediSCSIVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStorediSCSIVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStorediSCSIVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateStorediSCSIVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A
     * barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on
     * deleted tapes. This operation is only supported in the tape gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a virtual tape. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * 
     * @param createTapeWithBarcodeRequest
     *        CreateTapeWithBarcodeInput
     * @return Result of the CreateTapeWithBarcode operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateTapeWithBarcode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapeWithBarcode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTapeWithBarcodeResult createTapeWithBarcode(CreateTapeWithBarcodeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTapeWithBarcode(request);
    }

    @SdkInternalApi
    final CreateTapeWithBarcodeResult executeCreateTapeWithBarcode(CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest) {

        ExecutionContext executionContext = createExecutionContext(createTapeWithBarcodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTapeWithBarcodeRequest> request = null;
        Response<CreateTapeWithBarcodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTapeWithBarcodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTapeWithBarcodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTapeWithBarcode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTapeWithBarcodeResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateTapeWithBarcodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation
     * is only supported in the tape gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create virtual tapes. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * 
     * @param createTapesRequest
     *        CreateTapesInput
     * @return Result of the CreateTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTapesResult createTapes(CreateTapesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTapes(request);
    }

    @SdkInternalApi
    final CreateTapesResult executeCreateTapes(CreateTapesRequest createTapesRequest) {

        ExecutionContext executionContext = createExecutionContext(createTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTapesRequest> request = null;
        Response<CreateTapesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTapesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTapesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTapes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTapesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTapesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate
     * limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To
     * specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>DeleteBandwidthRateLimitInput$BandwidthType</a>
     *        </p>
     *        </li>
     * @return Result of the DeleteBandwidthRateLimit operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBandwidthRateLimit(request);
    }

    @SdkInternalApi
    final DeleteBandwidthRateLimitResult executeDeleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBandwidthRateLimitRequest> request = null;
        Response<DeleteBandwidthRateLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBandwidthRateLimitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBandwidthRateLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBandwidthRateLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBandwidthRateLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBandwidthRateLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator
     * pair.
     * </p>
     * 
     * @param deleteChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>DeleteChapCredentialsInput$InitiatorName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DeleteChapCredentialsInput$TargetARN</a>
     *        </p>
     *        </li>
     * @return Result of the DeleteChapCredentials operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChapCredentialsResult deleteChapCredentials(DeleteChapCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChapCredentials(request);
    }

    @SdkInternalApi
    final DeleteChapCredentialsResult executeDeleteChapCredentials(DeleteChapCredentialsRequest deleteChapCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChapCredentialsRequest> request = null;
        Response<DeleteChapCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChapCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChapCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChapCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChapCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteChapCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a file share from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param deleteFileShareRequest
     *        DeleteFileShareInput
     * @return Result of the DeleteFileShare operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteFileShare" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFileShareResult deleteFileShare(DeleteFileShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFileShare(request);
    }

    @SdkInternalApi
    final DeleteFileShareResult executeDeleteFileShare(DeleteFileShareRequest deleteFileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileShareRequest> request = null;
        Response<DeleteFileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your
     * request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from
     * your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted
     * upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next
     * step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots
     * persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS
     * snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription,
     * you can delete your snapshots using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest
     *        A JSON object containing the ID of the gateway to delete.
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGateway(request);
    }

    @SdkInternalApi
    final DeleteGatewayResult executeDeleteGateway(DeleteGatewayRequest deleteGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to
     * delete a snapshot schedule for a volume. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">Working with
     * Snapshots</a>. In the <code>DeleteSnapshotSchedule</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return Result of the DeleteSnapshotSchedule operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshotSchedule(request);
    }

    @SdkInternalApi
    final DeleteSnapshotScheduleResult executeDeleteSnapshotSchedule(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotScheduleRequest> request = null;
        Response<DeleteSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSnapshotScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSnapshotScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @return Result of the DeleteTape operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteTape
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTape" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTapeResult deleteTape(DeleteTapeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTape(request);
    }

    @SdkInternalApi
    final DeleteTapeResult executeDeleteTape(DeleteTapeRequest deleteTapeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTapeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeRequest> request = null;
        Response<DeleteTapeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTapeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTape");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTapeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTapeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the
     * tape gateway type.
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @return Result of the DeleteTapeArchive operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteTapeArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTapeArchive"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTapeArchiveResult deleteTapeArchive(DeleteTapeArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTapeArchive(request);
    }

    @SdkInternalApi
    final DeleteTapeArchiveResult executeDeleteTapeArchive(DeleteTapeArchiveRequest deleteTapeArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeArchiveRequest> request = null;
        Response<DeleteTapeArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTapeArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTapeArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTapeArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTapeArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified storage volume that you previously created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. This operation is only supported in the cached volume and stored volume
     * types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You
     * can reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should
     * also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to
     * query snapshots on the volume you are deleting and check the snapshot status. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to delete.
     * @return Result of the DeleteVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteVolume" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVolume(request);
    }

    @SdkInternalApi
    final DeleteVolumeResult executeDeleteVolume(DeleteVolumeRequest deleteVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVolumeRequest> request = null;
        Response<DeleteVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth
     * rate limiting is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for
     * the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to
     * describe, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeBandwidthRateLimit operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeBandwidthRateLimitResult describeBandwidthRateLimit(DescribeBandwidthRateLimitRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBandwidthRateLimit(request);
    }

    @SdkInternalApi
    final DescribeBandwidthRateLimitResult executeDescribeBandwidthRateLimit(DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBandwidthRateLimitRequest> request = null;
        Response<DescribeBandwidthRateLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBandwidthRateLimitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeBandwidthRateLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBandwidthRateLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBandwidthRateLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeBandwidthRateLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and
     * file gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and
     * used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return Result of the DescribeCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCache" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCacheResult describeCache(DescribeCacheRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCache(request);
    }

    @SdkInternalApi
    final DescribeCacheResult executeDescribeCache(DescribeCacheRequest describeCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheRequest> request = null;
        Response<DescribeCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the gateway volumes specified in the request. This operation is only supported in the
     * cached volume gateway types.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway
     * returns volume information sorted by volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return Result of the DescribeCachediSCSIVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeCachediSCSIVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCachediSCSIVolumes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCachediSCSIVolumes(request);
    }

    @SdkInternalApi
    final DescribeCachediSCSIVolumesResult executeDescribeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCachediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCachediSCSIVolumesRequest> request = null;
        Response<DescribeCachediSCSIVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCachediSCSIVolumesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCachediSCSIVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCachediSCSIVolumes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCachediSCSIVolumesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCachediSCSIVolumesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified
     * iSCSI target, one for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.
     * @return Result of the DescribeChapCredentials operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChapCredentialsResult describeChapCredentials(DescribeChapCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChapCredentials(request);
    }

    @SdkInternalApi
    final DescribeChapCredentialsResult executeDescribeChapCredentials(DescribeChapCredentialsRequest describeChapCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChapCredentialsRequest> request = null;
        Response<DescribeChapCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChapCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeChapCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChapCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChapCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeChapCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state
     * (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the ID of the gateway.
     * @return Result of the DescribeGatewayInformation operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGatewayInformationResult describeGatewayInformation(DescribeGatewayInformationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGatewayInformation(request);
    }

    @SdkInternalApi
    final DescribeGatewayInformationResult executeDescribeGatewayInformation(DescribeGatewayInformationRequest describeGatewayInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayInformationRequest> request = null;
        Response<DescribeGatewayInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayInformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGatewayInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGatewayInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGatewayInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGatewayInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeMaintenanceStartTime operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(DescribeMaintenanceStartTimeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceStartTime(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceStartTimeResult executeDescribeMaintenanceStartTime(DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceStartTimeRequest> request = null;
        Response<DescribeMaintenanceStartTimeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceStartTimeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceStartTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceStartTime");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceStartTimeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceStartTimeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeNFSFileSharesRequest
     *        DescribeNFSFileSharesInput
     * @return Result of the DescribeNFSFileShares operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeNFSFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeNFSFileShares"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNFSFileSharesResult describeNFSFileShares(DescribeNFSFileSharesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNFSFileShares(request);
    }

    @SdkInternalApi
    final DescribeNFSFileSharesResult executeDescribeNFSFileShares(DescribeNFSFileSharesRequest describeNFSFileSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNFSFileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNFSFileSharesRequest> request = null;
        Response<DescribeNFSFileSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNFSFileSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeNFSFileSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNFSFileShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNFSFileSharesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeNFSFileSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeSMBFileSharesRequest
     *        DescribeSMBFileSharesInput
     * @return Result of the DescribeSMBFileShares operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeSMBFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBFileShares"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSMBFileSharesResult describeSMBFileShares(DescribeSMBFileSharesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSMBFileShares(request);
    }

    @SdkInternalApi
    final DescribeSMBFileSharesResult executeDescribeSMBFileShares(DescribeSMBFileSharesRequest describeSMBFileSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSMBFileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSMBFileSharesRequest> request = null;
        Response<DescribeSMBFileSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSMBFileSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSMBFileSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSMBFileShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSMBFileSharesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeSMBFileSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeSMBSettingsRequest
     * @return Result of the DescribeSMBSettings operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeSMBSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSMBSettingsResult describeSMBSettings(DescribeSMBSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSMBSettings(request);
    }

    @SdkInternalApi
    final DescribeSMBSettingsResult executeDescribeSMBSettings(DescribeSMBSettingsRequest describeSMBSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSMBSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSMBSettingsRequest> request = null;
        Response<DescribeSMBSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSMBSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSMBSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSMBSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSMBSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSMBSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes
     * intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the
     * cached volume and stored volume types.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @return Result of the DescribeSnapshotSchedule operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSnapshotScheduleResult describeSnapshotSchedule(DescribeSnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshotSchedule(request);
    }

    @SdkInternalApi
    final DescribeSnapshotScheduleResult executeDescribeSnapshotSchedule(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotScheduleRequest> request = null;
        Response<DescribeSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSnapshotScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSnapshotScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the
     * request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
     * volume ARNs. This operation is only supported in stored volume gateway type.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON object containing a list of <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @return Result of the DescribeStorediSCSIVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeStorediSCSIVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeStorediSCSIVolumes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(DescribeStorediSCSIVolumesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStorediSCSIVolumes(request);
    }

    @SdkInternalApi
    final DescribeStorediSCSIVolumesResult executeDescribeStorediSCSIVolumes(DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStorediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorediSCSIVolumesRequest> request = null;
        Response<DescribeStorediSCSIVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStorediSCSIVolumesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStorediSCSIVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStorediSCSIVolumes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStorediSCSIVolumesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStorediSCSIVolumesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only
     * supported in the tape gateway type.
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway returns a description of all virtual
     * tapes found in the VTS associated with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @return Result of the DescribeTapeArchives operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeTapeArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeArchives"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTapeArchivesResult describeTapeArchives(DescribeTapeArchivesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTapeArchives(request);
    }

    @SdkInternalApi
    final DescribeTapeArchivesResult executeDescribeTapeArchives(DescribeTapeArchivesRequest describeTapeArchivesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTapeArchivesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeArchivesRequest> request = null;
        Response<DescribeTapeArchivesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeArchivesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTapeArchivesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTapeArchives");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTapeArchivesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTapeArchivesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTapeArchivesResult describeTapeArchives() {
        return describeTapeArchives(new DescribeTapeArchivesRequest());
    }

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the specified tape gateway.
     * </p>
     * <p>
     * A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is
     * consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @return Result of the DescribeTapeRecoveryPoints operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeTapeRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(DescribeTapeRecoveryPointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTapeRecoveryPoints(request);
    }

    @SdkInternalApi
    final DescribeTapeRecoveryPointsResult executeDescribeTapeRecoveryPoints(DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTapeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeRecoveryPointsRequest> request = null;
        Response<DescribeTapeRecoveryPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeRecoveryPointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTapeRecoveryPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTapeRecoveryPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTapeRecoveryPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTapeRecoveryPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a <code>TapeARN</code> is
     * not specified, returns a description of all virtual tapes associated with the specified gateway. This operation
     * is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @return Result of the DescribeTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTapesResult describeTapes(DescribeTapesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTapes(request);
    }

    @SdkInternalApi
    final DescribeTapesResult executeDescribeTapes(DescribeTapesRequest describeTapesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapesRequest> request = null;
        Response<DescribeTapesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTapesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTapes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTapesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTapesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume,
     * cached volume and tape gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload
     * buffer space allocated and used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return Result of the DescribeUploadBuffer operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeUploadBuffer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeUploadBuffer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUploadBufferResult describeUploadBuffer(DescribeUploadBufferRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUploadBuffer(request);
    }

    @SdkInternalApi
    final DescribeUploadBufferResult executeDescribeUploadBuffer(DescribeUploadBufferRequest describeUploadBufferRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUploadBufferRequest> request = null;
        Response<DescribeUploadBufferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUploadBufferRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUploadBufferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUploadBuffer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUploadBufferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUploadBufferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS
     * Storage Gateway returns VTL device information.
     * </p>
     * <p>
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @return Result of the DescribeVTLDevices operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeVTLDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeVTLDevices"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeVTLDevicesResult describeVTLDevices(DescribeVTLDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVTLDevices(request);
    }

    @SdkInternalApi
    final DescribeVTLDevicesResult executeDescribeVTLDevices(DescribeVTLDevicesRequest describeVTLDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVTLDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVTLDevicesRequest> request = null;
        Response<DescribeVTLDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVTLDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVTLDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVTLDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVTLDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVTLDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the working storage of a gateway. This operation is only supported in the stored
     * volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use
     * DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add
     * upload buffer to a stored volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage, and it includes the amount of working
     * storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeWorkingStorage operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeWorkingStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeWorkingStorage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkingStorageResult describeWorkingStorage(DescribeWorkingStorageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkingStorage(request);
    }

    @SdkInternalApi
    final DescribeWorkingStorageResult executeDescribeWorkingStorage(DescribeWorkingStorageRequest describeWorkingStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkingStorageRequest> request = null;
        Response<DescribeWorkingStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkingStorageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkingStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkingStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkingStorageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkingStorageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching
     * and attaching a volume enables you to recover your data from one gateway to a different gateway without creating
     * a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
     * Amazon EC2 instance.
     * </p>
     * 
     * @param detachVolumeRequest
     *        AttachVolumeInput
     * @return Result of the DetachVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DetachVolume" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetachVolumeResult detachVolume(DetachVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeDetachVolume(request);
    }

    @SdkInternalApi
    final DetachVolumeResult executeDetachVolume(DetachVolumeRequest detachVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(detachVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachVolumeRequest> request = null;
        Response<DetachVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged,
     * you can disable the gateway so you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported
     * in the tape gateway type.
     * </p>
     * <important>
     * <p>
     * Once a gateway is disabled it cannot be enabled.
     * </p>
     * </important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @return Result of the DisableGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DisableGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DisableGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableGatewayResult disableGateway(DisableGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDisableGateway(request);
    }

    @SdkInternalApi
    final DisableGatewayResult executeDisableGateway(DisableGatewayRequest disableGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(disableGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableGatewayRequest> request = null;
        Response<DisableGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that
     * support the SMB file protocol.
     * </p>
     * 
     * @param joinDomainRequest
     *        JoinDomainInput
     * @return Result of the JoinDomain operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.JoinDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/JoinDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public JoinDomainResult joinDomain(JoinDomainRequest request) {
        request = beforeClientExecution(request);
        return executeJoinDomain(request);
    }

    @SdkInternalApi
    final JoinDomainResult executeJoinDomain(JoinDomainRequest joinDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(joinDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<JoinDomainRequest> request = null;
        Response<JoinDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new JoinDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(joinDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "JoinDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<JoinDomainResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new JoinDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling
     * user account. This operation is only supported for file gateways.
     * </p>
     * 
     * @param listFileSharesRequest
     *        ListFileShareInput
     * @return Result of the ListFileShares operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListFileShares" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFileSharesResult listFileShares(ListFileSharesRequest request) {
        request = beforeClientExecution(request);
        return executeListFileShares(request);
    }

    @SdkInternalApi
    final ListFileSharesResult executeListFileShares(ListFileSharesRequest listFileSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFileSharesRequest> request = null;
        Response<ListFileSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFileSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFileSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFileShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFileSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFileSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by
     * gateway Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you
     * to optionally reduce the number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response (that is, the response returns only a truncated list of
     * your gateways), the response contains a marker that you can specify in your next request to fetch the next page
     * of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     *        A JSON object containing zero or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListGatewaysInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListGatewaysInput$Marker</a>
     *        </p>
     *        </li>
     * @return Result of the ListGateways operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeListGateways(request);
    }

    @SdkInternalApi
    final ListGatewaysResult executeListGateways(ListGatewaysRequest listGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListGatewaysResult listGateways() {
        return listGateways(new ListGatewaysRequest());
    }

    /**
     * <p>
     * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource
     * Name (ARN) of the gateway in the body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured as working storage, cache storage, or
     * stored volume or not configured at all. The response includes a <code>DiskStatus</code> field. This field can
     * have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway),
     * or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the ListLocalDisks operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListLocalDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListLocalDisks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLocalDisksResult listLocalDisks(ListLocalDisksRequest request) {
        request = beforeClientExecution(request);
        return executeListLocalDisks(request);
    }

    @SdkInternalApi
    final ListLocalDisksResult executeListLocalDisks(ListLocalDisksRequest listLocalDisksRequest) {

        ExecutionContext executionContext = createExecutionContext(listLocalDisksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLocalDisksRequest> request = null;
        Response<ListLocalDisksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLocalDisksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLocalDisksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLocalDisks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLocalDisksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLocalDisksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that have been added to the specified resource. This operation is only supported in the cached
     * volume, stored volume and tape gateway type.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTagsForResourceResult listTagsForResource() {
        return listTagsForResource(new ListTagsForResourceRequest());
    }

    /**
     * <p>
     * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes
     * to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
     * operation lists all virtual tapes in both your VTL and VTS.
     * </p>
     * <p>
     * This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can
     * optionally specify the <code>Limit</code> parameter in the body to limit the number of tapes in the response. If
     * the number of tapes returned in the response is truncated, the response includes a <code>Marker</code> element
     * that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported
     * in the tape gateway type.
     * </p>
     * 
     * @param listTapesRequest
     *        A JSON object that contains one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$Marker</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$TapeARNs</a>
     *        </p>
     *        </li>
     * @return Result of the ListTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTapes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTapesResult listTapes(ListTapesRequest request) {
        request = beforeClientExecution(request);
        return executeListTapes(request);
    }

    @SdkInternalApi
    final ListTapesResult executeListTapes(ListTapesRequest listTapesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTapesRequest> request = null;
        Response<ListTapesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTapesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTapesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTapes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTapesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTapesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume
     * is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @return Result of the ListVolumeInitiators operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListVolumeInitiators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeInitiators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVolumeInitiatorsResult listVolumeInitiators(ListVolumeInitiatorsRequest request) {
        request = beforeClientExecution(request);
        return executeListVolumeInitiators(request);
    }

    @SdkInternalApi
    final ListVolumeInitiatorsResult executeListVolumeInitiators(ListVolumeInitiatorsRequest listVolumeInitiatorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVolumeInitiatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeInitiatorsRequest> request = null;
        Response<ListVolumeInitiatorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeInitiatorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVolumeInitiatorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVolumeInitiators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVolumeInitiatorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVolumeInitiatorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway
     * type.
     * </p>
     * <p>
     * Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume.
     * To create a snapshot from a volume recovery point use the <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return Result of the ListVolumeRecoveryPoints operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListVolumeRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(ListVolumeRecoveryPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListVolumeRecoveryPoints(request);
    }

    @SdkInternalApi
    final ListVolumeRecoveryPointsResult executeListVolumeRecoveryPoints(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVolumeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeRecoveryPointsRequest> request = null;
        Response<ListVolumeRecoveryPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeRecoveryPointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVolumeRecoveryPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVolumeRecoveryPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVolumeRecoveryPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVolumeRecoveryPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the
     * volume ARNs. If you want additional volume information, use the <a>DescribeStorediSCSIVolumes</a> or the
     * <a>DescribeCachediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can
     * optionally specify the <code>Limit</code> field in the body to limit the number of volumes in the response. If
     * the number of volumes returned in the response is truncated, the response includes a Marker field. You can use
     * this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only
     * supported in the cached volume and stored volume gateway types.
     * </p>
     * 
     * @param listVolumesRequest
     *        A JSON object that contains one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListVolumesInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListVolumesInput$Marker</a>
     *        </p>
     *        </li>
     * @return Result of the ListVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVolumesResult listVolumes(ListVolumesRequest request) {
        request = beforeClientExecution(request);
        return executeListVolumes(request);
    }

    @SdkInternalApi
    final ListVolumesResult executeListVolumes(ListVolumesRequest listVolumesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumesRequest> request = null;
        Response<ListVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVolumes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVolumesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVolumesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends you notification through CloudWatch Events when all files written to your NFS file share have been uploaded
     * to Amazon S3.
     * </p>
     * <p>
     * AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file
     * share up to that point in time have been uploaded to Amazon S3. These files include files written to the NFS file
     * share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you
     * notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification
     * through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file
     * gateways.
     * </p>
     * <p>
     * For more information, see Getting File Upload Notification in the Storage Gateway User Guide
     * (https://docs.aws.amazon
     * .com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification).
     * </p>
     * 
     * @param notifyWhenUploadedRequest
     * @return Result of the NotifyWhenUploaded operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.NotifyWhenUploaded
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/NotifyWhenUploaded"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public NotifyWhenUploadedResult notifyWhenUploaded(NotifyWhenUploadedRequest request) {
        request = beforeClientExecution(request);
        return executeNotifyWhenUploaded(request);
    }

    @SdkInternalApi
    final NotifyWhenUploadedResult executeNotifyWhenUploaded(NotifyWhenUploadedRequest notifyWhenUploadedRequest) {

        ExecutionContext executionContext = createExecutionContext(notifyWhenUploadedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyWhenUploadedRequest> request = null;
        Response<NotifyWhenUploadedResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyWhenUploadedRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(notifyWhenUploadedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "NotifyWhenUploaded");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<NotifyWhenUploadedResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new NotifyWhenUploadedResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were
     * added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This
     * operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon
     * CloudWatch event when your RefreshCache operation completes. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting Notified About File Operations</a>.
     * </p>
     * <p>
     * When this API is called, it only initiates the refresh operation. When the API call completes and returns a
     * success code, it doesn't necessarily mean that the file refresh has completed. You should use the
     * refresh-complete notification to determine that the operation has completed before you check for new files on the
     * gateway file share. You can subscribe to be notified through an CloudWatch event when your
     * <code>RefreshCache</code> operation completes.
     * </p>
     * 
     * @param refreshCacheRequest
     *        RefreshCacheInput
     * @return Result of the RefreshCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RefreshCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RefreshCache" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RefreshCacheResult refreshCache(RefreshCacheRequest request) {
        request = beforeClientExecution(request);
        return executeRefreshCache(request);
    }

    @SdkInternalApi
    final RefreshCacheResult executeRefreshCache(RefreshCacheRequest refreshCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(refreshCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshCacheRequest> request = null;
        Response<RefreshCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(refreshCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RefreshCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RefreshCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RefreshCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified resource. This operation is only supported in the cached volume,
     * stored volume and tape gateway types.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveTagsFromResourceResult executeRemoveTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveTagsFromResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource() {
        return removeTagsFromResource(new RemoveTagsFromResourceRequest());
    }

    /**
     * <p>
     * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache
     * storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes
     * in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a
     * cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks.
     * This operation is only supported in the cached volume and tape types.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be
     * lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must
     * configure at least one new cache disk for your gateway to function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @return Result of the ResetCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ResetCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ResetCache" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetCacheResult resetCache(ResetCacheRequest request) {
        request = beforeClientExecution(request);
        return executeResetCache(request);
    }

    @SdkInternalApi
    final ResetCacheResult executeResetCache(ResetCacheRequest resetCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(resetCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheRequest> request = null;
        Response<ResetCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetCacheResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in
     * the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway,
     * even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway
     * type.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must
     * archive the tape again before you can retrieve it to another gateway. This operation is only supported in the
     * tape gateway type.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @return Result of the RetrieveTapeArchive operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RetrieveTapeArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeArchive"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetrieveTapeArchiveResult retrieveTapeArchive(RetrieveTapeArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeRetrieveTapeArchive(request);
    }

    @SdkInternalApi
    final RetrieveTapeArchiveResult executeRetrieveTapeArchive(RetrieveTapeArchiveRequest retrieveTapeArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(retrieveTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeArchiveRequest> request = null;
        Response<RetrieveTapeArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retrieveTapeArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetrieveTapeArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetrieveTapeArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RetrieveTapeArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway
     * type.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If
     * your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>
     * <p>
     * The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be
     * retrieved to only a tape gateway. There is no charge for retrieving recovery points.
     * </p>
     * </note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @return Result of the RetrieveTapeRecoveryPoint operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RetrieveTapeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(RetrieveTapeRecoveryPointRequest request) {
        request = beforeClientExecution(request);
        return executeRetrieveTapeRecoveryPoint(request);
    }

    @SdkInternalApi
    final RetrieveTapeRecoveryPointResult executeRetrieveTapeRecoveryPoint(RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest) {

        ExecutionContext executionContext = createExecutionContext(retrieveTapeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeRecoveryPointRequest> request = null;
        Response<RetrieveTapeRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeRecoveryPointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(retrieveTapeRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetrieveTapeRecoveryPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetrieveTapeRecoveryPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RetrieveTapeRecoveryPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the password for your VM local console. When you log in to the local console for the first time, you log in
     * to the VM with the default credentials. We recommend that you set a new password. You don't need to know the
     * default password to set a new password.
     * </p>
     * 
     * @param setLocalConsolePasswordRequest
     *        SetLocalConsolePasswordInput
     * @return Result of the SetLocalConsolePassword operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.SetLocalConsolePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetLocalConsolePassword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetLocalConsolePasswordResult setLocalConsolePassword(SetLocalConsolePasswordRequest request) {
        request = beforeClientExecution(request);
        return executeSetLocalConsolePassword(request);
    }

    @SdkInternalApi
    final SetLocalConsolePasswordResult executeSetLocalConsolePassword(SetLocalConsolePasswordRequest setLocalConsolePasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(setLocalConsolePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLocalConsolePasswordRequest> request = null;
        Response<SetLocalConsolePasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLocalConsolePasswordRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setLocalConsolePasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetLocalConsolePassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetLocalConsolePasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetLocalConsolePasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the password for the guest user <code>smbguest</code>. The <code>smbguest</code> user is the user when the
     * authentication method for the file share is set to <code>GuestAccess</code>.
     * </p>
     * 
     * @param setSMBGuestPasswordRequest
     *        SetSMBGuestPasswordInput
     * @return Result of the SetSMBGuestPassword operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.SetSMBGuestPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetSMBGuestPassword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetSMBGuestPasswordResult setSMBGuestPassword(SetSMBGuestPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeSetSMBGuestPassword(request);
    }

    @SdkInternalApi
    final SetSMBGuestPasswordResult executeSetSMBGuestPassword(SetSMBGuestPasswordRequest setSMBGuestPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(setSMBGuestPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSMBGuestPasswordRequest> request = null;
        Response<SetSMBGuestPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetSMBGuestPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setSMBGuestPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetSMBGuestPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetSMBGuestPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetSMBGuestPasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in
     * the body of your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the
     * host VM.
     * </p>
     * <note>
     * <p>
     * If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to
     * avoid unpredictable conditions.
     * </p>
     * </note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except <a>StartGateway</a>,
     * <a>DescribeGatewayInformation</a>, and <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.
     * </p>
     * <note>
     * <p>
     * When you make a shutdown request, you will get a <code>200 OK</code> success response immediately. However, it
     * might take some time for the gateway to shut down. You can call the <a>DescribeGatewayInformation</a> API to
     * check the status. For more information, see <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway (using <a>DeleteGateway</a>) to no longer
     * pay software charges associated with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest
     *        A JSON object containing the of the gateway to shut down.
     * @return Result of the ShutdownGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ShutdownGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ShutdownGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeShutdownGateway(request);
    }

    @SdkInternalApi
    final ShutdownGatewayResult executeShutdownGateway(ShutdownGatewayRequest shutdownGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(shutdownGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ShutdownGatewayRequest> request = null;
        Response<ShutdownGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ShutdownGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(shutdownGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ShutdownGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ShutdownGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ShutdownGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a gateway that you previously shut down (see <a>ShutdownGateway</a>). After the gateway starts, you can
     * then make other API calls, your applications can read from or write to the gateway's storage volumes and you will
     * be able to take snapshot backups.
     * </p>
     * <note>
     * <p>
     * When you make a request, you will get a 200 OK success response immediately. However, it might take some time for
     * the gateway to be ready. You should call <a>DescribeGatewayInformation</a> and check the status before making any
     * additional API calls. For more information, see <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest
     *        A JSON object containing the of the gateway to start.
     * @return Result of the StartGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.StartGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/StartGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartGatewayResult startGateway(StartGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeStartGateway(request);
    }

    @SdkInternalApi
    final StartGatewayResult executeStartGateway(StartGatewayRequest startGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(startGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartGatewayRequest> request = null;
        Response<StartGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit
     * or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have
     * any limitations on its bandwidth usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec</a>
     *        </p>
     *        </li>
     * @return Result of the UpdateBandwidthRateLimit operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBandwidthRateLimitResult updateBandwidthRateLimit(UpdateBandwidthRateLimitRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBandwidthRateLimit(request);
    }

    @SdkInternalApi
    final UpdateBandwidthRateLimitResult executeUpdateBandwidthRateLimit(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBandwidthRateLimitRequest> request = null;
        Response<UpdateBandwidthRateLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBandwidthRateLimitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateBandwidthRateLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBandwidthRateLimit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBandwidthRateLimitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateBandwidthRateLimitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By
     * default, a gateway does not have CHAP enabled; however, for added security, you might use it.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect
     * with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$InitiatorName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$TargetARN</a>
     *        </p>
     *        </li>
     * @return Result of the UpdateChapCredentials operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChapCredentialsResult updateChapCredentials(UpdateChapCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChapCredentials(request);
    }

    @SdkInternalApi
    final UpdateChapCredentialsResult executeUpdateChapCredentials(UpdateChapCredentialsRequest updateChapCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChapCredentialsRequest> request = null;
        Response<UpdateChapCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChapCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChapCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChapCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChapCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateChapCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to
     * update, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * <note>
     * <p>
     * For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway
     * name. However, changing the name of the gateway has no effect on the gateway's ARN.
     * </p>
     * </note>
     * 
     * @param updateGatewayInformationRequest
     * @return Result of the UpdateGatewayInformation operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewayInformation(request);
    }

    @SdkInternalApi
    final UpdateGatewayInformationResult executeUpdateGatewayInformation(UpdateGatewayInformationRequest updateGatewayInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayInformationRequest> request = null;
        Response<UpdateGatewayInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayInformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGatewayInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewayInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGatewayInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete. You can call <a>DescribeGatewayInformation</a> to verify the gateway is in
     * the <code>STATE_RUNNING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your
     * applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator
     * timeouts for Windows and Linux, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.
     * </p>
     * </important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @return Result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewaySoftwareNow(request);
    }

    @SdkInternalApi
    final UpdateGatewaySoftwareNowResult executeUpdateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewaySoftwareNowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewaySoftwareNowRequest> request = null;
        Response<UpdateGatewaySoftwareNowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewaySoftwareNowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGatewaySoftwareNowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewaySoftwareNow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewaySoftwareNowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGatewaySoftwareNowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a gateway's weekly maintenance start time information, including day and time of the week. The
     * maintenance time is the time in your gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$DayOfMonth</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$HourOfDay</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a>
     *        </p>
     *        </li>
     * @return Result of the UpdateMaintenanceStartTime operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMaintenanceStartTime(request);
    }

    @SdkInternalApi
    final UpdateMaintenanceStartTimeResult executeUpdateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceStartTimeRequest> request = null;
        Response<UpdateMaintenanceStartTimeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceStartTimeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMaintenanceStartTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMaintenanceStartTime");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMaintenanceStartTimeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMaintenanceStartTimeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null.
     * </p>
     * </note>
     * <p>
     * Updates the following file share setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default storage class for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata defaults for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed NFS clients for your file share
     * </p>
     * </li>
     * <li>
     * <p>
     * Squash settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Write status of your file share
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null. This operation is only
     * supported in file gateways.
     * </p>
     * </note>
     * 
     * @param updateNFSFileShareRequest
     *        UpdateNFSFileShareInput
     * @return Result of the UpdateNFSFileShare operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateNFSFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateNFSFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNFSFileShareResult updateNFSFileShare(UpdateNFSFileShareRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNFSFileShare(request);
    }

    @SdkInternalApi
    final UpdateNFSFileShareResult executeUpdateNFSFileShare(UpdateNFSFileShareRequest updateNFSFileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNFSFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNFSFileShareRequest> request = null;
        Response<UpdateNFSFileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNFSFileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNFSFileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNFSFileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNFSFileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNFSFileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Server Message Block (SMB) file share.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null. This operation is only
     * supported for file gateways.
     * </p>
     * </note> <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
     * Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
     * activated in this AWS Region, activate it. For information about how to activate AWS STS, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param updateSMBFileShareRequest
     *        UpdateSMBFileShareInput
     * @return Result of the UpdateSMBFileShare operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateSMBFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSMBFileShareResult updateSMBFileShare(UpdateSMBFileShareRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSMBFileShare(request);
    }

    @SdkInternalApi
    final UpdateSMBFileShareResult executeUpdateSMBFileShare(UpdateSMBFileShareRequest updateSMBFileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSMBFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSMBFileShareRequest> request = null;
        Response<UpdateSMBFileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSMBFileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSMBFileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSMBFileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSMBFileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSMBFileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached
     * volume and stored volume gateway types.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You
     * can use this API to change the snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule
     * information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$Description</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$StartAt</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$VolumeARN</a>
     *        </p>
     *        </li>
     * @return Result of the UpdateSnapshotSchedule operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSnapshotScheduleResult updateSnapshotSchedule(UpdateSnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSnapshotSchedule(request);
    }

    @SdkInternalApi
    final UpdateSnapshotScheduleResult executeUpdateSnapshotSchedule(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSnapshotScheduleRequest> request = null;
        Response<UpdateSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSnapshotScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSnapshotScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSnapshotScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium
     * changer type for the tape gateway. This operation enables you to select a different type of medium changer after
     * a tape gateway is activated. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     * @return Result of the UpdateVTLDeviceType operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateVTLDeviceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateVTLDeviceType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVTLDeviceTypeResult updateVTLDeviceType(UpdateVTLDeviceTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVTLDeviceType(request);
    }

    @SdkInternalApi
    final UpdateVTLDeviceTypeResult executeUpdateVTLDeviceType(UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVTLDeviceTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVTLDeviceTypeRequest> request = null;
        Response<UpdateVTLDeviceTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVTLDeviceTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVTLDeviceTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Storage Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVTLDeviceType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVTLDeviceTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVTLDeviceTypeResultJsonUnmarshaller());
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
