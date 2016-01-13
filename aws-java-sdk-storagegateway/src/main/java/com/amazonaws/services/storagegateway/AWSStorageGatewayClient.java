/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.services.storagegateway.model.transform.*;

/**
 * Client for accessing AWS Storage Gateway. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software
 * appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and AWS's storage
 * infrastructure. The service enables you to securely upload data to the AWS
 * cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway
 * Service API Reference</i>:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html"
 * >AWS Storage Gateway Required Request Headers</a>: Describes the required
 * headers that you must send with every POST request to AWS Storage Gateway.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html"
 * >Signing Requests</a>: AWS Storage Gateway requires that you authenticate
 * every request you send; this topic describes how sign such a request.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/APIErrorResponses.html"
 * >Error Responses</a>: Provides reference information about AWS Storage
 * Gateway errors.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html"
 * >Operations in AWS Storage Gateway</a>: Contains detailed descriptions of all
 * AWS Storage Gateway operations, their request parameters, response elements,
 * possible errors, and examples of requests and responses.</li>
 * <li><a
 * href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html">AWS
 * Storage Gateway Regions and Endpoints</a>: Provides a list of each of the
 * regions and endpoints available for use with AWS Storage Gateway.</li>
 * </ul>
 */
public class AWSStorageGatewayClient extends AmazonWebServiceClient implements
        AWSStorageGateway {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSStorageGateway.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "storagegateway";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "storagegateway";

    /**
     * List of exception unmarshallers for all AWS Storage Gateway exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSStorageGatewayClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Storage Gateway (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSStorageGatewayClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSStorageGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Storage Gateway (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSStorageGatewayClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Storage Gateway (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSStorageGatewayClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Storage Gateway
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Storage Gateway (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSStorageGatewayClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException.class,
                        "InvalidGatewayRequestException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.storagegateway.model.InternalServerErrorException.class,
                        "InternalServerError"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://storagegateway.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/storagegateway/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/storagegateway/request.handler2s"));
    }

    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * host. For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedActivateGateway-common.html"
     * > Activate the AWS Storage Gateway</a>. In the activation process, you
     * specify information such as the region you want to use for storing
     * snapshots, the time zone for scheduled snapshots the gateway snapshot
     * schedule window, an activation key, and a name for your gateway. The
     * activation process also associates your gateway with your account; for
     * more information, see <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>You must turn on the gateway VM before you can activate your
     * gateway.</note>
     * 
     * @param activateGatewayRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>ActivateGatewayInput$ActivationKey</a></li>
     *        <li><a>GatewayName</a></li>
     *        <li><a>ActivateGatewayInput$GatewayRegion</a></li>
     *        <li><a>ActivateGatewayInput$GatewayTimezone</a></li>
     *        <li><a>ActivateGatewayInput$GatewayType</a></li>
     *        <li><a>ActivateGatewayInput$TapeDriveType</a></li>
     *        <li><a>ActivateGatewayInput$MediumChangerType</a></li>
     * @return Result of the ActivateGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ActivateGateway
     */
    @Override
    public ActivateGatewayResult activateGateway(
            ActivateGatewayRequest activateGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(activateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateGatewayRequest> request = null;
        Response<ActivateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateGatewayRequestMarshaller().marshall(super
                        .beforeMarshalling(activateGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ActivateGatewayResult> responseHandler = new JsonResponseHandler<ActivateGatewayResult>(
                    new ActivateGatewayResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures one or more gateway local disks as cache for a
     * cached-volume gateway. This operation is supported only for the
     * gateway-cached volume architecture (see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html"
     * >Storage Gateway Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return Result of the AddCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.AddCache
     */
    @Override
    public AddCacheResult addCache(AddCacheRequest addCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(addCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCacheRequest> request = null;
        Response<AddCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCacheRequestMarshaller().marshall(super
                        .beforeMarshalling(addCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddCacheResult> responseHandler = new JsonResponseHandler<AddCacheResult>(
                    new AddCacheResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation adds one or more tags to the specified resource. You use
     * tags to add metadata to resources, which you can use to categorize these
     * resources. For example, you can categorize resources by purpose, owner,
     * environment, or team. Each tag consists of a key and a value, which you
     * define. You can add tags to the following AWS Storage Gateway resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Storage Volumes
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Virtual Tapes
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 10 tags for each resource. Virtual tapes and
     * storage volumes that are recovered to a new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @return Result of the AddTagsToResource operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.AddTagsToResource
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(
            AddTagsToResourceRequest addTagsToResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddTagsToResourceResult> responseHandler = new JsonResponseHandler<AddTagsToResourceResult>(
                    new AddTagsToResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures one or more gateway local disks as upload
     * buffer for a specified gateway. This operation is supported for both the
     * gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return Result of the AddUploadBuffer operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.AddUploadBuffer
     */
    @Override
    public AddUploadBufferResult addUploadBuffer(
            AddUploadBufferRequest addUploadBufferRequest) {
        ExecutionContext executionContext = createExecutionContext(addUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddUploadBufferRequest> request = null;
        Response<AddUploadBufferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddUploadBufferRequestMarshaller().marshall(super
                        .beforeMarshalling(addUploadBufferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddUploadBufferResult> responseHandler = new JsonResponseHandler<AddUploadBufferResult>(
                    new AddUploadBufferResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage for a gateway. This operation is supported only for the
     * gateway-stored volume architecture. This operation is deprecated method
     * in cached-volumes API version (20120630). Use AddUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the <a>AddUploadBuffer</a> operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that you
     * want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>AddWorkingStorageInput$DiskIds</a></li>
     * @return Result of the AddWorkingStorage operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.AddWorkingStorage
     */
    @Override
    public AddWorkingStorageResult addWorkingStorage(
            AddWorkingStorageRequest addWorkingStorageRequest) {
        ExecutionContext executionContext = createExecutionContext(addWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddWorkingStorageRequest> request = null;
        Response<AddWorkingStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddWorkingStorageRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(addWorkingStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddWorkingStorageResult> responseHandler = new JsonResponseHandler<AddWorkingStorageResult>(
                    new AddWorkingStorageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after
     * the archiving process is initiated.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @return Result of the CancelArchival operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CancelArchival
     */
    @Override
    public CancelArchivalResult cancelArchival(
            CancelArchivalRequest cancelArchivalRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelArchivalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelArchivalRequest> request = null;
        Response<CancelArchivalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelArchivalRequestMarshaller().marshall(super
                        .beforeMarshalling(cancelArchivalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CancelArchivalResult> responseHandler = new JsonResponseHandler<CancelArchivalResult>(
                    new CancelArchivalResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to
     * a gateway after the retrieval process is initiated. The virtual tape is
     * returned to the VTS.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @return Result of the CancelRetrieval operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CancelRetrieval
     */
    @Override
    public CancelRetrievalResult cancelRetrieval(
            CancelRetrievalRequest cancelRetrievalRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelRetrievalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRetrievalRequest> request = null;
        Response<CancelRetrievalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRetrievalRequestMarshaller().marshall(super
                        .beforeMarshalling(cancelRetrievalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CancelRetrievalResult> responseHandler = new JsonResponseHandler<CancelRetrievalResult>(
                    new CancelRetrievalResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a cached volume on a specified cached gateway.
     * This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <note>Cache storage must be allocated to the gateway before you can
     * create a cached volume. Use the <a>AddCache</a> operation to add cache
     * storage to a gateway. </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, AWS Storage Gateway
     * creates the volume and returns information about it such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return Result of the CreateCachediSCSIVolume operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CreateCachediSCSIVolume
     */
    @Override
    public CreateCachediSCSIVolumeResult createCachediSCSIVolume(
            CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(createCachediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCachediSCSIVolumeRequest> request = null;
        Response<CreateCachediSCSIVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCachediSCSIVolumeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createCachediSCSIVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateCachediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateCachediSCSIVolumeResult>(
                    new CreateCachediSCSIVolumeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (S3) for durable off-site
     * recovery, as well as import the data to an Amazon Elastic Block Store
     * (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take
     * snapshots of your gateway volume on a scheduled or ad-hoc basis. This API
     * enables you to take ad-hoc snapshot. For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working With Snapshots in the AWS Storage Gateway Console</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage Gateway
     * Console. In response, AWS Storage Gateway returns you a snapshot ID. You
     * can use this snapshot ID to check the snapshot progress or later use it
     * when you want to create a volume from a snapshot.
     * </p>
     * <note>To list or delete a snapshot, you must use the Amazon EC2 API. For
     * more information, see DescribeSnapshots or DeleteSnapshot in the <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html"
     * >EC2 API reference</a>.</note>
     * 
     * @param createSnapshotRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>CreateSnapshotInput$SnapshotDescription</a></li>
     *        <li><a>CreateSnapshotInput$VolumeARN</a></li>
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CreateSnapshot
     */
    @Override
    public CreateSnapshotResult createSnapshot(
            CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super
                        .beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateSnapshotResult> responseHandler = new JsonResponseHandler<CreateSnapshotResult>(
                    new CreateSnapshotResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation initiates a snapshot of a gateway from a volume recovery
     * point. This operation is supported only for the gateway-cached volume
     * architecture (see ).
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get a
     * list of volume recovery point for gateway-cached volumes, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You must
     * also provide a description for the snapshot. When AWS Storage Gateway
     * takes a snapshot of the specified volume, the snapshot and its
     * description appear in the AWS Storage Gateway console. In response, AWS
     * Storage Gateway returns you a snapshot ID. You can use this snapshot ID
     * to check the snapshot progress or later use it when you want to create a
     * volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, in <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return Result of the CreateSnapshotFromVolumeRecoveryPoint operation
     *         returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CreateSnapshotFromVolumeRecoveryPoint
     */
    @Override
    public CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotFromVolumeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotFromVolumeRecoveryPointRequest> request = null;
        Response<CreateSnapshotFromVolumeRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotFromVolumeRecoveryPointRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createSnapshotFromVolumeRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateSnapshotFromVolumeRecoveryPointResult> responseHandler = new JsonResponseHandler<CreateSnapshotFromVolumeRecoveryPointResult>(
                    new CreateSnapshotFromVolumeRecoveryPointResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a volume on a specified gateway. This operation is
     * supported only for the gateway-stored volume architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can
     * choose to preserve existing data on the disk, create volume from an
     * existing snapshot, or create an empty volume. If you choose to create an
     * empty gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on
     * which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>CreateStorediSCSIVolumeInput$DiskId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$PreserveExistingData</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$SnapshotId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$TargetName</a></li>
     * @return Result of the CreateStorediSCSIVolume operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CreateStorediSCSIVolume
     */
    @Override
    public CreateStorediSCSIVolumeResult createStorediSCSIVolume(
            CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(createStorediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorediSCSIVolumeRequest> request = null;
        Response<CreateStorediSCSIVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorediSCSIVolumeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createStorediSCSIVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateStorediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateStorediSCSIVolumeResult>(
                    new CreateStorediSCSIVolumeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes
     * and then archive the tapes.
     * </p>
     * <note>Cache storage must be allocated to the gateway before you can
     * create virtual tapes. Use the <a>AddCache</a> operation to add cache
     * storage to a gateway. </note>
     * 
     * @param createTapesRequest
     *        CreateTapesInput
     * @return Result of the CreateTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.CreateTapes
     */
    @Override
    public CreateTapesResult createTapes(CreateTapesRequest createTapesRequest) {
        ExecutionContext executionContext = createExecutionContext(createTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTapesRequest> request = null;
        Response<CreateTapesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTapesRequestMarshaller().marshall(super
                        .beforeMarshalling(createTapesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateTapesResult> responseHandler = new JsonResponseHandler<CreateTapesResult>(
                    new CreateTapesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes the bandwidth rate limits of a gateway. You can
     * delete either the upload and download bandwidth rate limit, or you can
     * delete both. If you delete only one of the limits, the other limit
     * remains unchanged. To specify which gateway to work with, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     * @return Result of the DeleteBandwidthRateLimit operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteBandwidthRateLimit
     */
    @Override
    public DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(
            DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBandwidthRateLimitRequest> request = null;
        Response<DeleteBandwidthRateLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBandwidthRateLimitRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteBandwidthRateLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DeleteBandwidthRateLimitResult>(
                    new DeleteBandwidthRateLimitResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol (CHAP)
     * credentials for a specified iSCSI target and initiator pair.
     * </p>
     * 
     * @param deleteChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>DeleteChapCredentialsInput$InitiatorName</a></li>
     *        <li><a>DeleteChapCredentialsInput$TargetARN</a></li>
     * @return Result of the DeleteChapCredentials operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteChapCredentials
     */
    @Override
    public DeleteChapCredentialsResult deleteChapCredentials(
            DeleteChapCredentialsRequest deleteChapCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChapCredentialsRequest> request = null;
        Response<DeleteChapCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChapCredentialsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteChapCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteChapCredentialsResult> responseHandler = new JsonResponseHandler<DeleteChapCredentialsResult>(
                    new DeleteChapCredentialsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes a gateway. To specify which gateway to delete, use
     * the Amazon Resource Name (ARN) of the gateway in your request. The
     * operation deletes the gateway; however, it does not delete the gateway
     * virtual machine (VM) from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots
     * of the gateway volumes are not deleted upon deleting the gateway,
     * however, pending snapshots will not complete. After you delete a gateway,
     * your next step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however,
     * your existing Amazon EBS snapshots persist and you will continue to be
     * billed for these snapshots. You can choose to remove all remaining Amazon
     * EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer
     * not to cancel your Amazon EC2 subscription, you can delete your snapshots
     * using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail
     * Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest
     *        A JSON object containing the id of the gateway to delete.
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteGateway
     */
    @Override
    public DeleteGatewayResult deleteGateway(
            DeleteGatewayRequest deleteGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteGatewayResult> responseHandler = new JsonResponseHandler<DeleteGatewayResult>(
                    new DeleteGatewayResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad-hoc
     * basis. This API enables you to delete a snapshot schedule for a volume.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working with Snapshots</a>. In the <code>DeleteSnapshotSchedule</code>
     * request, you identify the volume by providing its Amazon Resource Name
     * (ARN).
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in
     * <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return Result of the DeleteSnapshotSchedule operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteSnapshotSchedule
     */
    @Override
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(
            DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotScheduleRequest> request = null;
        Response<DeleteSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotScheduleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DeleteSnapshotScheduleResult>(
                    new DeleteSnapshotScheduleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @return Result of the DeleteTape operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteTape
     */
    @Override
    public DeleteTapeResult deleteTape(DeleteTapeRequest deleteTapeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTapeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeRequest> request = null;
        Response<DeleteTapeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteTapeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTapeResult> responseHandler = new JsonResponseHandler<DeleteTapeResult>(
                    new DeleteTapeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @return Result of the DeleteTapeArchive operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteTapeArchive
     */
    @Override
    public DeleteTapeArchiveResult deleteTapeArchive(
            DeleteTapeArchiveRequest deleteTapeArchiveRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeArchiveRequest> request = null;
        Response<DeleteTapeArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeArchiveRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteTapeArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTapeArchiveResult> responseHandler = new JsonResponseHandler<DeleteTapeArchiveResult>(
                    new DeleteTapeArchiveResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes the specified gateway volume that you previously
     * created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. For gateway-stored volumes, the local
     * disk that was configured as the storage volume is not deleted. You can
     * reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic Compute
     * Cloud (Amazon EC2) API to query snapshots on the volume you are deleting
     * and check the snapshot status. For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to
     *        delete.
     * @return Result of the DeleteVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DeleteVolume
     */
    @Override
    public DeleteVolumeResult deleteVolume(
            DeleteVolumeRequest deleteVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVolumeRequest> request = null;
        Response<DeleteVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVolumeRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteVolumeResult> responseHandler = new JsonResponseHandler<DeleteVolumeResult>(
                    new DeleteVolumeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the bandwidth rate limits of a gateway. By
     * default, these limits are not set, which means no bandwidth rate limiting
     * is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To specify
     * which gateway to describe, use the Amazon Resource Name (ARN) of the
     * gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeBandwidthRateLimit operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeBandwidthRateLimit
     */
    @Override
    public DescribeBandwidthRateLimitResult describeBandwidthRateLimit(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBandwidthRateLimitRequest> request = null;
        Response<DescribeBandwidthRateLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBandwidthRateLimitRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeBandwidthRateLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DescribeBandwidthRateLimitResult>(
                    new DescribeBandwidthRateLimitResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about the cache of a gateway. This
     * operation is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return Result of the DescribeCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeCache
     */
    @Override
    public DescribeCacheResult describeCache(
            DescribeCacheRequest describeCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheRequest> request = null;
        Response<DescribeCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheRequestMarshaller().marshall(super
                        .beforeMarshalling(describeCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeCacheResult> responseHandler = new JsonResponseHandler<DescribeCacheResult>(
                    new DescribeCacheResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns a description of the gateway volumes specified in
     * the request. This operation is supported only for the gateway-cached
     * volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In
     * the response Amazon Storage Gateway returns volume information sorted by
     * volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return Result of the DescribeCachediSCSIVolumes operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeCachediSCSIVolumes
     */
    @Override
    public DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCachediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCachediSCSIVolumesRequest> request = null;
        Response<DescribeCachediSCSIVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCachediSCSIVolumesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeCachediSCSIVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeCachediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeCachediSCSIVolumesResult>(
                    new DescribeCachediSCSIVolumesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target, one
     * for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the
     *        iSCSI volume target.
     * @return Result of the DescribeChapCredentials operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeChapCredentials
     */
    @Override
    public DescribeChapCredentialsResult describeChapCredentials(
            DescribeChapCredentialsRequest describeChapCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChapCredentialsRequest> request = null;
        Response<DescribeChapCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChapCredentialsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeChapCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeChapCredentialsResult> responseHandler = new JsonResponseHandler<DescribeChapCredentialsResult>(
                    new DescribeChapCredentialsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns metadata about a gateway such as its name, network
     * interfaces, configured time zone, and the state (whether the gateway is
     * running or not). To specify which gateway to describe, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the id of the gateway.
     * @return Result of the DescribeGatewayInformation operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeGatewayInformation
     */
    @Override
    public DescribeGatewayInformationResult describeGatewayInformation(
            DescribeGatewayInformationRequest describeGatewayInformationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayInformationRequest> request = null;
        Response<DescribeGatewayInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayInformationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeGatewayInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeGatewayInformationResult> responseHandler = new JsonResponseHandler<DescribeGatewayInformationResult>(
                    new DescribeGatewayInformationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms of
     * the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeMaintenanceStartTime operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeMaintenanceStartTime
     */
    @Override
    public DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceStartTimeRequest> request = null;
        Response<DescribeMaintenanceStartTimeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceStartTimeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeMaintenanceStartTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceStartTimeResult>(
                    new DescribeMaintenanceStartTimeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation describes the snapshot schedule for the specified gateway
     * volume. The snapshot schedule information includes intervals at which
     * snapshots are automatically initiated on the volume.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the
     *        <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @return Result of the DescribeSnapshotSchedule operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeSnapshotSchedule
     */
    @Override
    public DescribeSnapshotScheduleResult describeSnapshotSchedule(
            DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotScheduleRequest> request = null;
        Response<DescribeSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotScheduleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DescribeSnapshotScheduleResult>(
                    new DescribeSnapshotScheduleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the description of the gateway volumes specified
     * in the request. The list of gateway volumes in the request must be from
     * one gateway. In the response Amazon Storage Gateway returns volume
     * information sorted by volume ARNs.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON Object containing a list of
     *        <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @return Result of the DescribeStorediSCSIVolumes operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeStorediSCSIVolumes
     */
    @Override
    public DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStorediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorediSCSIVolumesRequest> request = null;
        Response<DescribeStorediSCSIVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStorediSCSIVolumesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeStorediSCSIVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeStorediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeStorediSCSIVolumesResult>(
                    new DescribeStorediSCSIVolumesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape
     * shelf (VTS).
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway
     * returns a description of all virtual tapes found in the VTS associated
     * with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @return Result of the DescribeTapeArchives operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeTapeArchives
     */
    @Override
    public DescribeTapeArchivesResult describeTapeArchives(
            DescribeTapeArchivesRequest describeTapeArchivesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTapeArchivesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeArchivesRequest> request = null;
        Response<DescribeTapeArchivesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeArchivesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeTapeArchivesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTapeArchivesResult> responseHandler = new JsonResponseHandler<DescribeTapeArchivesResult>(
                    new DescribeTapeArchivesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Returns a list of virtual tape recovery points that are available for the
     * specified gateway-VTL.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the virtual tape is consistent. If your gateway crashes,
     * virtual tapes that have recovery points can be recovered to a new
     * gateway.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @return Result of the DescribeTapeRecoveryPoints operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeTapeRecoveryPoints
     */
    @Override
    public DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTapeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeRecoveryPointsRequest> request = null;
        Response<DescribeTapeRecoveryPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeRecoveryPointsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeTapeRecoveryPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTapeRecoveryPointsResult> responseHandler = new JsonResponseHandler<DescribeTapeRecoveryPointsResult>(
                    new DescribeTapeRecoveryPointsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of
     * virtual tapes. If a <code>TapeARN</code> is not specified, returns a
     * description of all virtual tapes associated with the specified gateway.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @return Result of the DescribeTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeTapes
     */
    @Override
    public DescribeTapesResult describeTapes(
            DescribeTapesRequest describeTapesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapesRequest> request = null;
        Response<DescribeTapesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapesRequestMarshaller().marshall(super
                        .beforeMarshalling(describeTapesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTapesResult> responseHandler = new JsonResponseHandler<DescribeTapesResult>(
                    new DescribeTapesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about the upload buffer of a gateway.
     * This operation is supported for both the gateway-stored and
     * gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return Result of the DescribeUploadBuffer operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeUploadBuffer
     */
    @Override
    public DescribeUploadBufferResult describeUploadBuffer(
            DescribeUploadBufferRequest describeUploadBufferRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUploadBufferRequest> request = null;
        Response<DescribeUploadBufferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUploadBufferRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeUploadBufferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeUploadBufferResult> responseHandler = new JsonResponseHandler<DescribeUploadBufferResult>(
                    new DescribeUploadBufferResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the
     * specified gateway. In the response, AWS Storage Gateway returns VTL
     * device information.
     * </p>
     * <p>
     * The list of VTL devices must be from one gateway.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @return Result of the DescribeVTLDevices operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeVTLDevices
     */
    @Override
    public DescribeVTLDevicesResult describeVTLDevices(
            DescribeVTLDevicesRequest describeVTLDevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVTLDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVTLDevicesRequest> request = null;
        Response<DescribeVTLDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVTLDevicesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeVTLDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeVTLDevicesResult> responseHandler = new JsonResponseHandler<DescribeVTLDevicesResult>(
                    new DescribeVTLDevicesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. This operation is supported only for the gateway-stored volume
     * architecture. This operation is deprecated in cached-volumes API version
     * (20120630). Use DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the DescribeUploadBuffer operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeWorkingStorage operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DescribeWorkingStorage
     */
    @Override
    public DescribeWorkingStorageResult describeWorkingStorage(
            DescribeWorkingStorageRequest describeWorkingStorageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkingStorageRequest> request = null;
        Response<DescribeWorkingStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkingStorageRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeWorkingStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeWorkingStorageResult> responseHandler = new JsonResponseHandler<DescribeWorkingStorageResult>(
                    new DescribeWorkingStorageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables a gateway when the gateway is no longer functioning. For
     * example, if your gateway VM is damaged, you can disable the gateway so
     * you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a gateway-VTL that is not reachable or not
     * functioning.
     * </p>
     * <important>Once a gateway is disabled it cannot be enabled.</important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @return Result of the DisableGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.DisableGateway
     */
    @Override
    public DisableGatewayResult disableGateway(
            DisableGatewayRequest disableGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(disableGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableGatewayRequest> request = null;
        Response<DisableGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableGatewayRequestMarshaller().marshall(super
                        .beforeMarshalling(disableGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableGatewayResult> responseHandler = new JsonResponseHandler<DisableGatewayResult>(
                    new DisableGatewayResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway Amazon
     * Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch the
     * next page of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     *        A JSON object containing zero or more of the following fields:</p>
     *        <ul>
     *        <li><a>ListGatewaysInput$Limit</a></li>
     *        <li><a>ListGatewaysInput$Marker</a></li>
     * @return Result of the ListGateways operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ListGateways
     */
    @Override
    public ListGatewaysResult listGateways(
            ListGatewaysRequest listGatewaysRequest) {
        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestMarshaller().marshall(super
                        .beforeMarshalling(listGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListGatewaysResult> responseHandler = new JsonResponseHandler<ListGatewaysResult>(
                    new ListGatewaysResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * This operation returns a list of the gateway's local disks. To specify
     * which gateway to describe, you use the Amazon Resource Name (ARN) of the
     * gateway in the body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured
     * as working storage, cache storage, or stored volume or not configured at
     * all. The response includes a <code>DiskStatus</code> field. This field
     * can have a value of present (the disk is available to use), missing (the
     * disk is no longer connected to the gateway), or mismatch (the disk node
     * is occupied by a disk that has incorrect metadata or the disk content is
     * corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the ListLocalDisks operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ListLocalDisks
     */
    @Override
    public ListLocalDisksResult listLocalDisks(
            ListLocalDisksRequest listLocalDisksRequest) {
        ExecutionContext executionContext = createExecutionContext(listLocalDisksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLocalDisksRequest> request = null;
        Response<ListLocalDisksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLocalDisksRequestMarshaller().marshall(super
                        .beforeMarshalling(listLocalDisksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListLocalDisksResult> responseHandler = new JsonResponseHandler<ListLocalDisksResult>(
                    new ListLocalDisksResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists the tags that have been added to the specified
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * This operation lists iSCSI initiators that are connected to a volume. You
     * can use this operation to determine whether a volume is being used or
     * not.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @return Result of the ListVolumeInitiators operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ListVolumeInitiators
     */
    @Override
    public ListVolumeInitiatorsResult listVolumeInitiators(
            ListVolumeInitiatorsRequest listVolumeInitiatorsRequest) {
        ExecutionContext executionContext = createExecutionContext(listVolumeInitiatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeInitiatorsRequest> request = null;
        Response<ListVolumeInitiatorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeInitiatorsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listVolumeInitiatorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListVolumeInitiatorsResult> responseHandler = new JsonResponseHandler<ListVolumeInitiatorsResult>(
                    new ListVolumeInitiatorsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists the recovery points for a specified gateway. This
     * operation is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery
     * point is a point in time at which all data of the volume is consistent
     * and from which you can create a snapshot. To create a snapshot from a
     * volume recovery point use the
     * <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return Result of the ListVolumeRecoveryPoints operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ListVolumeRecoveryPoints
     */
    @Override
    public ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(
            ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest) {
        ExecutionContext executionContext = createExecutionContext(listVolumeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeRecoveryPointsRequest> request = null;
        Response<ListVolumeRecoveryPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeRecoveryPointsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listVolumeRecoveryPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListVolumeRecoveryPointsResult> responseHandler = new JsonResponseHandler<ListVolumeRecoveryPointsResult>(
                    new ListVolumeRecoveryPointsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists the iSCSI stored volumes of a gateway. Results are
     * sorted by volume ARN. The response includes only the volume ARNs. If you
     * want additional volume information, use the
     * <a>DescribeStorediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this Marker
     * value in your subsequent request to retrieve the next set of volumes.
     * </p>
     * 
     * @param listVolumesRequest
     *        A JSON object that contains one or more of the following
     *        fields:</p>
     *        <ul>
     *        <li><a>ListVolumesInput$Limit</a></li>
     *        <li><a>ListVolumesInput$Marker</a></li>
     * @return Result of the ListVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ListVolumes
     */
    @Override
    public ListVolumesResult listVolumes(ListVolumesRequest listVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(listVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumesRequest> request = null;
        Response<ListVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumesRequestMarshaller().marshall(super
                        .beforeMarshalling(listVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListVolumesResult> responseHandler = new JsonResponseHandler<ListVolumesResult>(
                    new ListVolumesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation removes one or more tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @return Result of the RemoveTagsFromResource operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.RemoveTagsFromResource
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RemoveTagsFromResourceResult> responseHandler = new JsonResponseHandler<RemoveTagsFromResourceResult>(
                    new RemoveTagsFromResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * This operation resets all cache disks that have encountered a error and
     * makes the disks available for reconfiguration as cache storage. If your
     * cache disk encounters a error, the gateway prevents read and write
     * operations on virtual tapes in the gateway. For example, an error can
     * occur when a disk is corrupted or removed from the gateway. When a cache
     * is reset, the gateway loses its cache storage. At this point you can
     * reconfigure the disks as cache disks.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been
     * uploaded to Amazon S3 yet, that data can be lost. After you reset cache
     * disks, there will be no configured cache disks left in the gateway, so
     * you must configure at least one new cache disk for your gateway to
     * function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @return Result of the ResetCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ResetCache
     */
    @Override
    public ResetCacheResult resetCache(ResetCacheRequest resetCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(resetCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheRequest> request = null;
        Response<ResetCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetCacheRequestMarshaller().marshall(super
                        .beforeMarshalling(resetCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ResetCacheResult> responseHandler = new JsonResponseHandler<ResetCacheResult>(
                    new ResetCacheResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a
     * gateway-VTL. Virtual tapes archived in the VTS are not associated with
     * any gateway. However after a tape is retrieved, it is associated with a
     * gateway, even though it is also listed in the VTS.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be
     * retrieved again to another gateway. You must archive the tape again
     * before you can retrieve it to another gateway.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @return Result of the RetrieveTapeArchive operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.RetrieveTapeArchive
     */
    @Override
    public RetrieveTapeArchiveResult retrieveTapeArchive(
            RetrieveTapeArchiveRequest retrieveTapeArchiveRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeArchiveRequest> request = null;
        Response<RetrieveTapeArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeArchiveRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(retrieveTapeArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RetrieveTapeArchiveResult> responseHandler = new JsonResponseHandler<RetrieveTapeArchiveResult>(
                    new RetrieveTapeArchiveResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the tape is consistent. If your gateway crashes, virtual
     * tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>The virtual tape can be retrieved to only one gateway. The
     * retrieved tape is read-only. The virtual tape can be retrieved to only a
     * gateway-VTL. There is no charge for retrieving recovery points.</note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @return Result of the RetrieveTapeRecoveryPoint operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.RetrieveTapeRecoveryPoint
     */
    @Override
    public RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveTapeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeRecoveryPointRequest> request = null;
        Response<RetrieveTapeRecoveryPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeRecoveryPointRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(retrieveTapeRecoveryPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RetrieveTapeRecoveryPointResult> responseHandler = new JsonResponseHandler<RetrieveTapeRecoveryPointResult>(
                    new RetrieveTapeRecoveryPointResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation shuts down a gateway. To specify which gateway to shut
     * down, use the Amazon Resource Name (ARN) of the gateway in the body of
     * your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * storage gateway's virtual machine (VM) and not the VM.
     * </p>
     * <note>If you want to shut down the VM, it is recommended that you first
     * shut down the gateway component in the VM to avoid unpredictable
     * conditions.</note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * <a>StartGateway</a>, <a>DescribeGatewayInformation</a>, and
     * <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage
     * volumes, and there are no snapshots taken.
     * </p>
     * <note>When you make a shutdown request, you will get a
     * <code>200 OK</code> success response immediately. However, it might take
     * some time for the gateway to shut down. You can call the
     * <a>DescribeGatewayInformation</a> API to check the status. For more
     * information, see <a>ActivateGateway</a>.</note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using <a>DeleteGateway</a>) to no longer pay software charges associated
     * with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest
     *        A JSON object containing the of the gateway to shut down.
     * @return Result of the ShutdownGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.ShutdownGateway
     */
    @Override
    public ShutdownGatewayResult shutdownGateway(
            ShutdownGatewayRequest shutdownGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(shutdownGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ShutdownGatewayRequest> request = null;
        Response<ShutdownGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ShutdownGatewayRequestMarshaller().marshall(super
                        .beforeMarshalling(shutdownGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ShutdownGatewayResult> responseHandler = new JsonResponseHandler<ShutdownGatewayResult>(
                    new ShutdownGatewayResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation starts a gateway that you previously shut down (see
     * <a>ShutdownGateway</a>). After the gateway starts, you can then make
     * other API calls, your applications can read from or write to the
     * gateway's storage volumes and you will be able to take snapshot backups.
     * </p>
     * <note>When you make a request, you will get a 200 OK success response
     * immediately. However, it might take some time for the gateway to be
     * ready. You should call <a>DescribeGatewayInformation</a> and check the
     * status before making any additional API calls. For more information, see
     * <a>ActivateGateway</a>.</note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest
     *        A JSON object containing the of the gateway to start.
     * @return Result of the StartGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.StartGateway
     */
    @Override
    public StartGatewayResult startGateway(
            StartGatewayRequest startGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(startGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartGatewayRequest> request = null;
        Response<StartGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartGatewayRequestMarshaller().marshall(super
                        .beforeMarshalling(startGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StartGatewayResult> responseHandler = new JsonResponseHandler<StartGatewayResult>(
                    new StartGatewayResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the bandwidth rate limits of a gateway. You can
     * update both the upload and download bandwidth rate limit or specify only
     * one of the two. If you don't set a bandwidth rate limit, the existing
     * rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't
     * set any limit, the gateway does not have any limitations on its bandwidth
     * usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec
     *        </a></li>
     *        <li>
     *        <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec
     *        </a></li>
     * @return Result of the UpdateBandwidthRateLimit operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateBandwidthRateLimit
     */
    @Override
    public UpdateBandwidthRateLimitResult updateBandwidthRateLimit(
            UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest) {
        ExecutionContext executionContext = createExecutionContext(updateBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBandwidthRateLimitRequest> request = null;
        Response<UpdateBandwidthRateLimitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBandwidthRateLimitRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateBandwidthRateLimitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<UpdateBandwidthRateLimitResult>(
                    new UpdateBandwidthRateLimitResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target
     * are closed and initiators must reconnect with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>UpdateChapCredentialsInput$InitiatorName</a></li>
     *        <li>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a></li>
     *        <li><a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a></li>
     *        <li><a>UpdateChapCredentialsInput$TargetARN</a></li>
     * @return Result of the UpdateChapCredentials operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateChapCredentials
     */
    @Override
    public UpdateChapCredentialsResult updateChapCredentials(
            UpdateChapCredentialsRequest updateChapCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChapCredentialsRequest> request = null;
        Response<UpdateChapCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChapCredentialsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateChapCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateChapCredentialsResult> responseHandler = new JsonResponseHandler<UpdateChapCredentialsResult>(
                    new UpdateChapCredentialsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the gateway's
     * name and time zone. To specify which gateway to update, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @return Result of the UpdateGatewayInformation operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateGatewayInformation
     */
    @Override
    public UpdateGatewayInformationResult updateGatewayInformation(
            UpdateGatewayInformationRequest updateGatewayInformationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayInformationRequest> request = null;
        Response<UpdateGatewayInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayInformationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateGatewayInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateGatewayInformationResult> responseHandler = new JsonResponseHandler<UpdateGatewayInformationResult>(
                    new UpdateGatewayInformationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update.
     * </p>
     * <note>When you make this request, you get a <code>200 OK</code> success
     * response immediately. However, it might take some time for the update to
     * complete. You can call <a>DescribeGatewayInformation</a> to verify the
     * gateway is in the <code>STATE_RUNNING</code> state.</note> <important>A
     * software update forces a system restart of your gateway. You can minimize
     * the chance of any disruption to your applications by increasing your
     * iSCSI Initiators' timeouts. For more information about increasing iSCSI
     * Initiator timeouts for Windows and Linux, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.</important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @return Result of the UpdateGatewaySoftwareNow operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateGatewaySoftwareNow
     */
    @Override
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(
            UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGatewaySoftwareNowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewaySoftwareNowRequest> request = null;
        Response<UpdateGatewaySoftwareNowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewaySoftwareNowRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateGatewaySoftwareNowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateGatewaySoftwareNowResult> responseHandler = new JsonResponseHandler<UpdateGatewaySoftwareNowResult>(
                    new UpdateGatewaySoftwareNowResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time is
     * the time in your gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li><a>UpdateMaintenanceStartTimeInput$DayOfWeek</a></li>
     *        <li><a>UpdateMaintenanceStartTimeInput$HourOfDay</a></li>
     *        <li><a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a></li>
     * @return Result of the UpdateMaintenanceStartTime operation returned by
     *         the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateMaintenanceStartTime
     */
    @Override
    public UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest) {
        ExecutionContext executionContext = createExecutionContext(updateMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceStartTimeRequest> request = null;
        Response<UpdateMaintenanceStartTimeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceStartTimeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateMaintenanceStartTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceStartTimeResult>(
                    new UpdateMaintenanceStartTimeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting
     * at the creation time of the volume. You can use this API to change the
     * snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including when
     * you want the snapshot to begin on a day and the frequency (in hours) of
     * snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>UpdateSnapshotScheduleInput$Description</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$RecurrenceInHours</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$StartAt</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$VolumeARN</a></li>
     * @return Result of the UpdateSnapshotSchedule operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateSnapshotSchedule
     */
    @Override
    public UpdateSnapshotScheduleResult updateSnapshotSchedule(
            UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSnapshotScheduleRequest> request = null;
        Response<UpdateSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSnapshotScheduleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateSnapshotScheduleResult> responseHandler = new JsonResponseHandler<UpdateSnapshotScheduleResult>(
                    new UpdateSnapshotScheduleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the type of medium changer in a gateway-VTL. When
     * you activate a gateway-VTL, you select a medium changer type for the
     * gateway-VTL. This operation enables you to select a different type of
     * medium changer after a gateway-VTL is activated.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     *        UpdateVTLDeviceTypeInput
     * @return Result of the UpdateVTLDeviceType operation returned by the
     *         service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was
     *         issued to the service. See the error and message fields for more
     *         information.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. See the
     *         error and message fields for more information.
     * @sample AWSStorageGateway.UpdateVTLDeviceType
     */
    @Override
    public UpdateVTLDeviceTypeResult updateVTLDeviceType(
            UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(updateVTLDeviceTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVTLDeviceTypeRequest> request = null;
        Response<UpdateVTLDeviceTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVTLDeviceTypeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateVTLDeviceTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateVTLDeviceTypeResult> responseHandler = new JsonResponseHandler<UpdateVTLDeviceTypeResult>(
                    new UpdateVTLDeviceTypeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
