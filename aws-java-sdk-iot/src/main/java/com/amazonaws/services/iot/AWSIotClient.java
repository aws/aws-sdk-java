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
package com.amazonaws.services.iot;

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

import com.amazonaws.services.iot.AWSIotClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.services.iot.model.transform.*;

/**
 * Client for accessing AWS IoT. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between Internet-connected devices (such as sensors, actuators,
 * embedded devices, or smart appliances) and the AWS cloud. You can discover your custom IoT-Data endpoint to
 * communicate with, configure rules for data processing and integration with other services, organize resources
 * associated with each device (Registry), configure logging, and create and manage policies and credentials to
 * authenticate devices.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html">Developer Guide</a>.
 * </p>
 * <p>
 * For information about how to use the credentials provider for AWS IoT, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorizing-direct-aws.html">Authorizing Direct Calls to
 * AWS Services</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIotClient extends AmazonWebServiceClient implements AWSIot {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIot.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "execute-api";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.iot.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.iot.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TransferAlreadyCompletedException").withModeledClass(
                                    com.amazonaws.services.iot.model.TransferAlreadyCompletedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotConfiguredException").withModeledClass(
                                    com.amazonaws.services.iot.model.NotConfiguredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.iot.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyException").withModeledClass(
                                    com.amazonaws.services.iot.model.MalformedPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidQueryException").withModeledClass(
                                    com.amazonaws.services.iot.model.InvalidQueryException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateTransitionException").withModeledClass(
                                    com.amazonaws.services.iot.model.InvalidStateTransitionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceRegistrationFailureException").withModeledClass(
                                    com.amazonaws.services.iot.model.ResourceRegistrationFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeleteConflictException").withModeledClass(
                                    com.amazonaws.services.iot.model.DeleteConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.iot.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CertificateConflictException").withModeledClass(
                                    com.amazonaws.services.iot.model.CertificateConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RegistrationCodeValidationException").withModeledClass(
                                    com.amazonaws.services.iot.model.RegistrationCodeValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResponseException").withModeledClass(
                                    com.amazonaws.services.iot.model.InvalidResponseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAggregationException").withModeledClass(
                                    com.amazonaws.services.iot.model.InvalidAggregationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.iot.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SqlParseException").withModeledClass(
                                    com.amazonaws.services.iot.model.SqlParseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictingResourceUpdateException").withModeledClass(
                                    com.amazonaws.services.iot.model.ConflictingResourceUpdateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.iot.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                                    com.amazonaws.services.iot.model.InternalException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VersionsLimitExceededException").withModeledClass(
                                    com.amazonaws.services.iot.model.VersionsLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TransferConflictException").withModeledClass(
                                    com.amazonaws.services.iot.model.TransferConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IndexNotReadyException").withModeledClass(
                                    com.amazonaws.services.iot.model.IndexNotReadyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.iot.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CertificateStateException").withModeledClass(
                                    com.amazonaws.services.iot.model.CertificateStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VersionConflictException").withModeledClass(
                                    com.amazonaws.services.iot.model.VersionConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.iot.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CertificateValidationException").withModeledClass(
                                    com.amazonaws.services.iot.model.CertificateValidationException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iot.model.AWSIotException.class));

    /**
     * Constructs a new client to invoke service methods on AWS IoT. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AWSIotClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSIotClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS IoT (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSIotClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSIotClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSIotClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSIotClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS IoT (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSIotClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSIotClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified AWS account credentials provider
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS IoT (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSIotClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS IoT (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSIotClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSIotClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSIotClientBuilder builder() {
        return AWSIotClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIotClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIotClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://iot.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iot/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iot/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @return Result of the AcceptCertificateTransfer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because the transfer is already complete.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AcceptCertificateTransfer
     */
    @Override
    public AcceptCertificateTransferResult acceptCertificateTransfer(AcceptCertificateTransferRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptCertificateTransfer(request);
    }

    @SdkInternalApi
    final AcceptCertificateTransferResult executeAcceptCertificateTransfer(AcceptCertificateTransferRequest acceptCertificateTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptCertificateTransferRequest> request = null;
        Response<AcceptCertificateTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptCertificateTransferRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptCertificateTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptCertificateTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptCertificateTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptCertificateTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a thing to a billing group.
     * </p>
     * 
     * @param addThingToBillingGroupRequest
     * @return Result of the AddThingToBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.AddThingToBillingGroup
     */
    @Override
    public AddThingToBillingGroupResult addThingToBillingGroup(AddThingToBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAddThingToBillingGroup(request);
    }

    @SdkInternalApi
    final AddThingToBillingGroupResult executeAddThingToBillingGroup(AddThingToBillingGroupRequest addThingToBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(addThingToBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddThingToBillingGroupRequest> request = null;
        Response<AddThingToBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddThingToBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addThingToBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddThingToBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddThingToBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddThingToBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a thing to a thing group.
     * </p>
     * 
     * @param addThingToThingGroupRequest
     * @return Result of the AddThingToThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.AddThingToThingGroup
     */
    @Override
    public AddThingToThingGroupResult addThingToThingGroup(AddThingToThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAddThingToThingGroup(request);
    }

    @SdkInternalApi
    final AddThingToThingGroupResult executeAddThingToThingGroup(AddThingToThingGroupRequest addThingToThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(addThingToThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddThingToThingGroupRequest> request = null;
        Response<AddThingToThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddThingToThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addThingToThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddThingToThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddThingToThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddThingToThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a group with a continuous job. The following criteria must be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The job must have been created with the <code>targetSelection</code> field set to "CONTINUOUS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The job status must currently be "IN_PROGRESS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of targets associated with a job must not exceed 100.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateTargetsWithJobRequest
     * @return Result of the AssociateTargetsWithJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.AssociateTargetsWithJob
     */
    @Override
    public AssociateTargetsWithJobResult associateTargetsWithJob(AssociateTargetsWithJobRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTargetsWithJob(request);
    }

    @SdkInternalApi
    final AssociateTargetsWithJobResult executeAssociateTargetsWithJob(AssociateTargetsWithJobRequest associateTargetsWithJobRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTargetsWithJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTargetsWithJobRequest> request = null;
        Response<AssociateTargetsWithJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTargetsWithJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateTargetsWithJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTargetsWithJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTargetsWithJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateTargetsWithJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a policy to the specified target.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return Result of the AttachPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.AttachPolicy
     */
    @Override
    public AttachPolicyResult attachPolicy(AttachPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachPolicy(request);
    }

    @SdkInternalApi
    final AttachPolicyResult executeAttachPolicy(AttachPolicyRequest attachPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(attachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPolicyRequest> request = null;
        Response<AttachPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate or other credential).
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>AttachPolicy</a> instead.
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @return Result of the AttachPrincipalPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.AttachPrincipalPolicy
     */
    @Override
    @Deprecated
    public AttachPrincipalPolicyResult attachPrincipalPolicy(AttachPrincipalPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachPrincipalPolicy(request);
    }

    @SdkInternalApi
    final AttachPrincipalPolicyResult executeAttachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(attachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPrincipalPolicyRequest> request = null;
        Response<AttachPrincipalPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPrincipalPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachPrincipalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachPrincipalPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachPrincipalPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AttachPrincipalPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a Device Defender security profile with a thing group or with this account. Each thing group or
     * account can have up to five security profiles associated with it.
     * </p>
     * 
     * @param attachSecurityProfileRequest
     * @return Result of the AttachSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AttachSecurityProfile
     */
    @Override
    public AttachSecurityProfileResult attachSecurityProfile(AttachSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeAttachSecurityProfile(request);
    }

    @SdkInternalApi
    final AttachSecurityProfileResult executeAttachSecurityProfile(AttachSecurityProfileRequest attachSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(attachSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachSecurityProfileRequest> request = null;
        Response<AttachSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AttachSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @return Result of the AttachThingPrincipal operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AttachThingPrincipal
     */
    @Override
    public AttachThingPrincipalResult attachThingPrincipal(AttachThingPrincipalRequest request) {
        request = beforeClientExecution(request);
        return executeAttachThingPrincipal(request);
    }

    @SdkInternalApi
    final AttachThingPrincipalResult executeAttachThingPrincipal(AttachThingPrincipalRequest attachThingPrincipalRequest) {

        ExecutionContext executionContext = createExecutionContext(attachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachThingPrincipalRequest> request = null;
        Response<AttachThingPrincipalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachThingPrincipalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachThingPrincipalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachThingPrincipal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachThingPrincipalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachThingPrincipalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in
     * progress, an "InvalidRequestException" occurs.
     * </p>
     * 
     * @param cancelAuditTaskRequest
     * @return Result of the CancelAuditTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelAuditTask
     */
    @Override
    public CancelAuditTaskResult cancelAuditTask(CancelAuditTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCancelAuditTask(request);
    }

    @SdkInternalApi
    final CancelAuditTaskResult executeCancelAuditTask(CancelAuditTaskRequest cancelAuditTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelAuditTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelAuditTaskRequest> request = null;
        Response<CancelAuditTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelAuditTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelAuditTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelAuditTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelAuditTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelAuditTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
     * can use <a>RejectCertificateTransfer</a> instead.) After transfer, AWS IoT returns the certificate to the source
     * account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
     * INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @return Result of the CancelCertificateTransfer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because the transfer is already complete.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelCertificateTransfer
     */
    @Override
    public CancelCertificateTransferResult cancelCertificateTransfer(CancelCertificateTransferRequest request) {
        request = beforeClientExecution(request);
        return executeCancelCertificateTransfer(request);
    }

    @SdkInternalApi
    final CancelCertificateTransferResult executeCancelCertificateTransfer(CancelCertificateTransferRequest cancelCertificateTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelCertificateTransferRequest> request = null;
        Response<CancelCertificateTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelCertificateTransferRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelCertificateTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelCertificateTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelCertificateTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelCertificateTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a job.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CancelJob
     */
    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJob(request);
    }

    @SdkInternalApi
    final CancelJobResult executeCancelJob(CancelJobRequest cancelJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the execution of a job for a given thing.
     * </p>
     * 
     * @param cancelJobExecutionRequest
     * @return Result of the CancelJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidStateTransitionException
     *         An attempt was made to change to an invalid state, for example by deleting a job or a job execution which
     *         is "IN_PROGRESS" without setting the <code>force</code> parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.CancelJobExecution
     */
    @Override
    public CancelJobExecutionResult cancelJobExecution(CancelJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJobExecution(request);
    }

    @SdkInternalApi
    final CancelJobExecutionResult executeCancelJobExecution(CancelJobExecutionRequest cancelJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobExecutionRequest> request = null;
        Response<CancelJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Clears the default authorizer.
     * </p>
     * 
     * @param clearDefaultAuthorizerRequest
     * @return Result of the ClearDefaultAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ClearDefaultAuthorizer
     */
    @Override
    public ClearDefaultAuthorizerResult clearDefaultAuthorizer(ClearDefaultAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeClearDefaultAuthorizer(request);
    }

    @SdkInternalApi
    final ClearDefaultAuthorizerResult executeClearDefaultAuthorizer(ClearDefaultAuthorizerRequest clearDefaultAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(clearDefaultAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ClearDefaultAuthorizerRequest> request = null;
        Response<ClearDefaultAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ClearDefaultAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(clearDefaultAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ClearDefaultAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ClearDefaultAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ClearDefaultAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an authorizer.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateAuthorizer
     */
    @Override
    public CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAuthorizer(request);
    }

    @SdkInternalApi
    final CreateAuthorizerResult executeCreateAuthorizer(CreateAuthorizerRequest createAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(createAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAuthorizerRequest> request = null;
        Response<CreateAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a billing group.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return Result of the CreateBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateBillingGroup
     */
    @Override
    public CreateBillingGroupResult createBillingGroup(CreateBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBillingGroup(request);
    }

    @SdkInternalApi
    final CreateBillingGroupResult executeCreateBillingGroup(CreateBillingGroupRequest createBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBillingGroupRequest> request = null;
        Response<CreateBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing request.
     * </p>
     * <p>
     * <b>Note:</b> The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or
     * an ECC key from NIST P-256 or NIST P-384 curves.
     * </p>
     * <p>
     * <b>Note:</b> Reusing the same certificate signing request (CSR) results in a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that
     * directory, and then specifying that directory on the command line. The following commands show how to create a
     * batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory my-csr-directory:
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot
     * create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the
     * certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest
     *        The input for the CreateCertificateFromCsr operation.
     * @return Result of the CreateCertificateFromCsr operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateCertificateFromCsr
     */
    @Override
    public CreateCertificateFromCsrResult createCertificateFromCsr(CreateCertificateFromCsrRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCertificateFromCsr(request);
    }

    @SdkInternalApi
    final CreateCertificateFromCsrResult executeCreateCertificateFromCsr(CreateCertificateFromCsrRequest createCertificateFromCsrRequest) {

        ExecutionContext executionContext = createExecutionContext(createCertificateFromCsrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateFromCsrRequest> request = null;
        Response<CreateCertificateFromCsrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateFromCsrRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCertificateFromCsrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCertificateFromCsr");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCertificateFromCsrResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCertificateFromCsrResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a dynamic thing group.
     * </p>
     * 
     * @param createDynamicThingGroupRequest
     * @return Result of the CreateDynamicThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.CreateDynamicThingGroup
     */
    @Override
    public CreateDynamicThingGroupResult createDynamicThingGroup(CreateDynamicThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDynamicThingGroup(request);
    }

    @SdkInternalApi
    final CreateDynamicThingGroupResult executeCreateDynamicThingGroup(CreateDynamicThingGroupRequest createDynamicThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDynamicThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDynamicThingGroupRequest> request = null;
        Response<CreateDynamicThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDynamicThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDynamicThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDynamicThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDynamicThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDynamicThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CreateJob
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this certificate, so it is important to keep
     * it in a secure location.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.
     * @return Result of the CreateKeysAndCertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateKeysAndCertificate
     */
    @Override
    public CreateKeysAndCertificateResult createKeysAndCertificate(CreateKeysAndCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKeysAndCertificate(request);
    }

    @SdkInternalApi
    final CreateKeysAndCertificateResult executeCreateKeysAndCertificate(CreateKeysAndCertificateRequest createKeysAndCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(createKeysAndCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeysAndCertificateRequest> request = null;
        Response<CreateKeysAndCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeysAndCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createKeysAndCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKeysAndCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKeysAndCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateKeysAndCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS IoT OTAUpdate on a target group of things or groups.
     * </p>
     * 
     * @param createOTAUpdateRequest
     * @return Result of the CreateOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CreateOTAUpdate
     */
    @Override
    public CreateOTAUpdateResult createOTAUpdate(CreateOTAUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOTAUpdate(request);
    }

    @SdkInternalApi
    final CreateOTAUpdateResult executeCreateOTAUpdate(CreateOTAUpdateRequest createOTAUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(createOTAUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOTAUpdateRequest> request = null;
        Response<CreateOTAUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOTAUpdateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOTAUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOTAUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOTAUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOTAUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation creates a policy version with a version
     * identifier of <b>1</b> and sets <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws MalformedPolicyException
     *         The policy documentation is not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreatePolicy
     */
    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicy(request);
    }

    @SdkInternalApi
    final CreatePolicyResult executeCreatePolicy(CreatePolicyRequest createPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed
     * policy can have up to five versions. If the policy has five versions, you must use <a>DeletePolicyVersion</a> to
     * delete an existing version before you create a new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version. The default version is the operative
     * version (that is, the version that is in effect for the certificates to which the policy is attached).
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @return Result of the CreatePolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws MalformedPolicyException
     *         The policy documentation is not valid.
     * @throws VersionsLimitExceededException
     *         The number of policy versions exceeds the limit.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreatePolicyVersion
     */
    @Override
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicyVersion(request);
    }

    @SdkInternalApi
    final CreatePolicyVersionResult executeCreatePolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyVersionRequest> request = null;
        Response<CreatePolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePolicyVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePolicyVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a role alias.
     * </p>
     * 
     * @param createRoleAliasRequest
     * @return Result of the CreateRoleAlias operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateRoleAlias
     */
    @Override
    public CreateRoleAliasResult createRoleAlias(CreateRoleAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoleAlias(request);
    }

    @SdkInternalApi
    final CreateRoleAliasResult executeCreateRoleAlias(CreateRoleAliasRequest createRoleAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createRoleAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoleAliasRequest> request = null;
        Response<CreateRoleAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoleAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRoleAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoleAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRoleAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRoleAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a scheduled audit that is run at a specified time interval.
     * </p>
     * 
     * @param createScheduledAuditRequest
     * @return Result of the CreateScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.CreateScheduledAudit
     */
    @Override
    public CreateScheduledAuditResult createScheduledAudit(CreateScheduledAuditRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScheduledAudit(request);
    }

    @SdkInternalApi
    final CreateScheduledAuditResult executeCreateScheduledAudit(CreateScheduledAuditRequest createScheduledAuditRequest) {

        ExecutionContext executionContext = createExecutionContext(createScheduledAuditRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScheduledAuditRequest> request = null;
        Response<CreateScheduledAuditResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScheduledAuditRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScheduledAuditRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScheduledAudit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScheduledAuditResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScheduledAuditResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Device Defender security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return Result of the CreateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateSecurityProfile
     */
    @Override
    public CreateSecurityProfileResult createSecurityProfile(CreateSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSecurityProfile(request);
    }

    @SdkInternalApi
    final CreateSecurityProfileResult executeCreateSecurityProfile(CreateSecurityProfileRequest createSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityProfileRequest> request = null;
        Response<CreateSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
     * chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
     * a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
     * created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
     * within last 90 days, we will resurrect that old stream by incrementing the version by 1.
     * </p>
     * 
     * @param createStreamRequest
     * @return Result of the CreateStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateStream
     */
    @Override
    public CreateStreamResult createStream(CreateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStream(request);
    }

    @SdkInternalApi
    final CreateStreamResult executeCreateStream(CreateStreamRequest createStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamRequest> request = null;
        Response<CreateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a thing record in the registry. If this call is made multiple times using the same thing name and
     * configuration, the call will succeed. If this call is made with the same thing name but different configuration a
     * <code>ResourceAlreadyExistsException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html">Authorization</a> for information
     * about authorizing control plane actions.
     * </p>
     * </note>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @return Result of the CreateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.CreateThing
     */
    @Override
    public CreateThingResult createThing(CreateThingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateThing(request);
    }

    @SdkInternalApi
    final CreateThingResult executeCreateThing(CreateThingRequest createThingRequest) {

        ExecutionContext executionContext = createExecutionContext(createThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingRequest> request = null;
        Response<CreateThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a thing group.
     * </p>
     * <note>
     * <p>
     * This is a control plane operation. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html">Authorization</a> for information
     * about authorizing control plane actions.
     * </p>
     * </note>
     * 
     * @param createThingGroupRequest
     * @return Result of the CreateThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateThingGroup
     */
    @Override
    public CreateThingGroupResult createThingGroup(CreateThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateThingGroup(request);
    }

    @SdkInternalApi
    final CreateThingGroupResult executeCreateThingGroup(CreateThingGroupRequest createThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingGroupRequest> request = null;
        Response<CreateThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new thing type.
     * </p>
     * 
     * @param createThingTypeRequest
     *        The input for the CreateThingType operation.
     * @return Result of the CreateThingType operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIot.CreateThingType
     */
    @Override
    public CreateThingTypeResult createThingType(CreateThingTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateThingType(request);
    }

    @SdkInternalApi
    final CreateThingTypeResult executeCreateThingType(CreateThingTypeRequest createThingTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingTypeRequest> request = null;
        Response<CreateThingTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createThingTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateThingType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateThingTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateThingTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
     * be able to access data processed by the rule.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @return Result of the CreateTopicRule operation returned by the service.
     * @throws SqlParseException
     *         The Rule-SQL expression can't be parsed correctly.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.CreateTopicRule
     */
    @Override
    public CreateTopicRuleResult createTopicRule(CreateTopicRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTopicRule(request);
    }

    @SdkInternalApi
    final CreateTopicRuleResult executeCreateTopicRule(CreateTopicRuleRequest createTopicRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTopicRuleRequest> request = null;
        Response<CreateTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTopicRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTopicRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTopicRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTopicRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
     * deleted and all audit checks are reset to disabled.
     * </p>
     * 
     * @param deleteAccountAuditConfigurationRequest
     * @return Result of the DeleteAccountAuditConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteAccountAuditConfiguration
     */
    @Override
    public DeleteAccountAuditConfigurationResult deleteAccountAuditConfiguration(DeleteAccountAuditConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountAuditConfiguration(request);
    }

    @SdkInternalApi
    final DeleteAccountAuditConfigurationResult executeDeleteAccountAuditConfiguration(
            DeleteAccountAuditConfigurationRequest deleteAccountAuditConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountAuditConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountAuditConfigurationRequest> request = null;
        Response<DeleteAccountAuditConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountAuditConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAccountAuditConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountAuditConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountAuditConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAccountAuditConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return Result of the DeleteAuthorizer operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteAuthorizer
     */
    @Override
    public DeleteAuthorizerResult deleteAuthorizer(DeleteAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAuthorizer(request);
    }

    @SdkInternalApi
    final DeleteAuthorizerResult executeDeleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAuthorizerRequest> request = null;
        Response<DeleteAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return Result of the DeleteBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteBillingGroup
     */
    @Override
    public DeleteBillingGroupResult deleteBillingGroup(DeleteBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBillingGroup(request);
    }

    @SdkInternalApi
    final DeleteBillingGroupResult executeDeleteBillingGroup(DeleteBillingGroupRequest deleteBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBillingGroupRequest> request = null;
        Response<DeleteBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a registered CA certificate.
     * </p>
     * 
     * @param deleteCACertificateRequest
     *        Input for the DeleteCACertificate operation.
     * @return Result of the DeleteCACertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DeleteCACertificate
     */
    @Override
    public DeleteCACertificateResult deleteCACertificate(DeleteCACertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCACertificate(request);
    }

    @SdkInternalApi
    final DeleteCACertificateResult executeDeleteCACertificate(DeleteCACertificateRequest deleteCACertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCACertificateRequest> request = null;
        Response<DeleteCACertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCACertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCACertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCACertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCACertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCACertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
     * certificate, first use the <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE status.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DeleteCertificate
     */
    @Override
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCertificate(request);
    }

    @SdkInternalApi
    final DeleteCertificateResult executeDeleteCertificate(DeleteCertificateRequest deleteCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<DeleteCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dynamic thing group.
     * </p>
     * 
     * @param deleteDynamicThingGroupRequest
     * @return Result of the DeleteDynamicThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteDynamicThingGroup
     */
    @Override
    public DeleteDynamicThingGroupResult deleteDynamicThingGroup(DeleteDynamicThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDynamicThingGroup(request);
    }

    @SdkInternalApi
    final DeleteDynamicThingGroupResult executeDeleteDynamicThingGroup(DeleteDynamicThingGroupRequest deleteDynamicThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDynamicThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDynamicThingGroupRequest> request = null;
        Response<DeleteDynamicThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDynamicThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDynamicThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDynamicThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDynamicThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDynamicThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a job and its related job executions.
     * </p>
     * <p>
     * Deleting a job may take time, depending on the number of job executions created for the job and various other
     * factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS".
     * Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error.
     * </p>
     * <p>
     * Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidStateTransitionException
     *         An attempt was made to change to an invalid state, for example by deleting a job or a job execution which
     *         is "IN_PROGRESS" without setting the <code>force</code> parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DeleteJob
     */
    @Override
    public DeleteJobResult deleteJob(DeleteJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJob(request);
    }

    @SdkInternalApi
    final DeleteJobResult executeDeleteJob(DeleteJobRequest deleteJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a job execution.
     * </p>
     * 
     * @param deleteJobExecutionRequest
     * @return Result of the DeleteJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidStateTransitionException
     *         An attempt was made to change to an invalid state, for example by deleting a job or a job execution which
     *         is "IN_PROGRESS" without setting the <code>force</code> parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DeleteJobExecution
     */
    @Override
    public DeleteJobExecutionResult deleteJobExecution(DeleteJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJobExecution(request);
    }

    @SdkInternalApi
    final DeleteJobExecutionResult executeDeleteJobExecution(DeleteJobExecutionRequest deleteJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobExecutionRequest> request = null;
        Response<DeleteJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an OTA update.
     * </p>
     * 
     * @param deleteOTAUpdateRequest
     * @return Result of the DeleteOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.DeleteOTAUpdate
     */
    @Override
    public DeleteOTAUpdateResult deleteOTAUpdate(DeleteOTAUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOTAUpdate(request);
    }

    @SdkInternalApi
    final DeleteOTAUpdateResult executeDeleteOTAUpdate(DeleteOTAUpdateRequest deleteOTAUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOTAUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOTAUpdateRequest> request = null;
        Response<DeleteOTAUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOTAUpdateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOTAUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOTAUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOTAUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOTAUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the
     * DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete
     * the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeletePolicy
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicy(request);
    }

    @SdkInternalApi
    final DeletePolicyResult executeDeletePolicy(DeletePolicyRequest deletePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<DeletePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
     * this API. To delete the default version of a policy, use <a>DeletePolicy</a>. To find out which version of a
     * policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @return Result of the DeletePolicyVersion operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeletePolicyVersion
     */
    @Override
    public DeletePolicyVersionResult deletePolicyVersion(DeletePolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicyVersion(request);
    }

    @SdkInternalApi
    final DeletePolicyVersionResult executeDeletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyVersionRequest> request = null;
        Response<DeletePolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a CA certificate registration code.
     * </p>
     * 
     * @param deleteRegistrationCodeRequest
     *        The input for the DeleteRegistrationCode operation.
     * @return Result of the DeleteRegistrationCode operation returned by the service.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteRegistrationCode
     */
    @Override
    public DeleteRegistrationCodeResult deleteRegistrationCode(DeleteRegistrationCodeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRegistrationCode(request);
    }

    @SdkInternalApi
    final DeleteRegistrationCodeResult executeDeleteRegistrationCode(DeleteRegistrationCodeRequest deleteRegistrationCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRegistrationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegistrationCodeRequest> request = null;
        Response<DeleteRegistrationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegistrationCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRegistrationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRegistrationCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRegistrationCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRegistrationCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a role alias
     * </p>
     * 
     * @param deleteRoleAliasRequest
     * @return Result of the DeleteRoleAlias operation returned by the service.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DeleteRoleAlias
     */
    @Override
    public DeleteRoleAliasResult deleteRoleAlias(DeleteRoleAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoleAlias(request);
    }

    @SdkInternalApi
    final DeleteRoleAliasResult executeDeleteRoleAlias(DeleteRoleAliasRequest deleteRoleAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoleAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoleAliasRequest> request = null;
        Response<DeleteRoleAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoleAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRoleAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoleAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoleAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRoleAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a scheduled audit.
     * </p>
     * 
     * @param deleteScheduledAuditRequest
     * @return Result of the DeleteScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteScheduledAudit
     */
    @Override
    public DeleteScheduledAuditResult deleteScheduledAudit(DeleteScheduledAuditRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScheduledAudit(request);
    }

    @SdkInternalApi
    final DeleteScheduledAuditResult executeDeleteScheduledAudit(DeleteScheduledAuditRequest deleteScheduledAuditRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduledAuditRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledAuditRequest> request = null;
        Response<DeleteScheduledAuditResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduledAuditRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduledAuditRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScheduledAudit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduledAuditResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScheduledAuditResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Device Defender security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return Result of the DeleteSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @sample AWSIot.DeleteSecurityProfile
     */
    @Override
    public DeleteSecurityProfileResult deleteSecurityProfile(DeleteSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSecurityProfile(request);
    }

    @SdkInternalApi
    final DeleteSecurityProfileResult executeDeleteSecurityProfile(DeleteSecurityProfileRequest deleteSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityProfileRequest> request = null;
        Response<DeleteSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a stream.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return Result of the DeleteStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or more resources.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteStream
     */
    @Override
    public DeleteStreamResult deleteStream(DeleteStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStream(request);
    }

    @SdkInternalApi
    final DeleteStreamResult executeDeleteStream(DeleteStreamRequest deleteStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamRequest> request = null;
        Response<DeleteStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
     * thing that doesn't exist.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @return Result of the DeleteThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThing
     */
    @Override
    public DeleteThingResult deleteThing(DeleteThingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteThing(request);
    }

    @SdkInternalApi
    final DeleteThingResult executeDeleteThing(DeleteThingRequest deleteThingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingRequest> request = null;
        Response<DeleteThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a thing group.
     * </p>
     * 
     * @param deleteThingGroupRequest
     * @return Result of the DeleteThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThingGroup
     */
    @Override
    public DeleteThingGroupResult deleteThingGroup(DeleteThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteThingGroup(request);
    }

    @SdkInternalApi
    final DeleteThingGroupResult executeDeleteThingGroup(DeleteThingGroupRequest deleteThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingGroupRequest> request = null;
        Response<DeleteThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
     * thing type, first mark it as deprecated by calling <a>DeprecateThingType</a>, then remove any associated things
     * by calling <a>UpdateThing</a> to change the thing type on any associated thing, and finally use
     * <a>DeleteThingType</a> to delete the thing type.
     * </p>
     * 
     * @param deleteThingTypeRequest
     *        The input for the DeleteThingType operation.
     * @return Result of the DeleteThingType operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThingType
     */
    @Override
    public DeleteThingTypeResult deleteThingType(DeleteThingTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteThingType(request);
    }

    @SdkInternalApi
    final DeleteThingTypeResult executeDeleteThingType(DeleteThingTypeRequest deleteThingTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingTypeRequest> request = null;
        Response<DeleteThingTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThingTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteThingType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThingTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteThingTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @return Result of the DeleteTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.DeleteTopicRule
     */
    @Override
    public DeleteTopicRuleResult deleteTopicRule(DeleteTopicRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTopicRule(request);
    }

    @SdkInternalApi
    final DeleteTopicRuleResult executeDeleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTopicRuleRequest> request = null;
        Response<DeleteTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTopicRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTopicRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTopicRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTopicRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a logging level.
     * </p>
     * 
     * @param deleteV2LoggingLevelRequest
     * @return Result of the DeleteV2LoggingLevel operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DeleteV2LoggingLevel
     */
    @Override
    public DeleteV2LoggingLevelResult deleteV2LoggingLevel(DeleteV2LoggingLevelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteV2LoggingLevel(request);
    }

    @SdkInternalApi
    final DeleteV2LoggingLevelResult executeDeleteV2LoggingLevel(DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteV2LoggingLevelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteV2LoggingLevelRequest> request = null;
        Response<DeleteV2LoggingLevelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteV2LoggingLevelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteV2LoggingLevelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteV2LoggingLevel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteV2LoggingLevelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteV2LoggingLevelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecates a thing type. You can not associate new things with deprecated thing type.
     * </p>
     * 
     * @param deprecateThingTypeRequest
     *        The input for the DeprecateThingType operation.
     * @return Result of the DeprecateThingType operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeprecateThingType
     */
    @Override
    public DeprecateThingTypeResult deprecateThingType(DeprecateThingTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeprecateThingType(request);
    }

    @SdkInternalApi
    final DeprecateThingTypeResult executeDeprecateThingType(DeprecateThingTypeRequest deprecateThingTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deprecateThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprecateThingTypeRequest> request = null;
        Response<DeprecateThingTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprecateThingTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deprecateThingTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeprecateThingType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeprecateThingTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeprecateThingTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * 
     * @param describeAccountAuditConfigurationRequest
     * @return Result of the DescribeAccountAuditConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAccountAuditConfiguration
     */
    @Override
    public DescribeAccountAuditConfigurationResult describeAccountAuditConfiguration(DescribeAccountAuditConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAuditConfiguration(request);
    }

    @SdkInternalApi
    final DescribeAccountAuditConfigurationResult executeDescribeAccountAuditConfiguration(
            DescribeAccountAuditConfigurationRequest describeAccountAuditConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAuditConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAuditConfigurationRequest> request = null;
        Response<DescribeAccountAuditConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAuditConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountAuditConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAuditConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountAuditConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountAuditConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Device Defender audit.
     * </p>
     * 
     * @param describeAuditTaskRequest
     * @return Result of the DescribeAuditTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuditTask
     */
    @Override
    public DescribeAuditTaskResult describeAuditTask(DescribeAuditTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAuditTask(request);
    }

    @SdkInternalApi
    final DescribeAuditTaskResult executeDescribeAuditTask(DescribeAuditTaskRequest describeAuditTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAuditTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAuditTaskRequest> request = null;
        Response<DescribeAuditTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAuditTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAuditTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAuditTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAuditTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAuditTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an authorizer.
     * </p>
     * 
     * @param describeAuthorizerRequest
     * @return Result of the DescribeAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeAuthorizer
     */
    @Override
    public DescribeAuthorizerResult describeAuthorizer(DescribeAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAuthorizer(request);
    }

    @SdkInternalApi
    final DescribeAuthorizerResult executeDescribeAuthorizer(DescribeAuthorizerRequest describeAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAuthorizerRequest> request = null;
        Response<DescribeAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a billing group.
     * </p>
     * 
     * @param describeBillingGroupRequest
     * @return Result of the DescribeBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeBillingGroup
     */
    @Override
    public DescribeBillingGroupResult describeBillingGroup(DescribeBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBillingGroup(request);
    }

    @SdkInternalApi
    final DescribeBillingGroupResult executeDescribeBillingGroup(DescribeBillingGroupRequest describeBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBillingGroupRequest> request = null;
        Response<DescribeBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a registered CA certificate.
     * </p>
     * 
     * @param describeCACertificateRequest
     *        The input for the DescribeCACertificate operation.
     * @return Result of the DescribeCACertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeCACertificate
     */
    @Override
    public DescribeCACertificateResult describeCACertificate(DescribeCACertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCACertificate(request);
    }

    @SdkInternalApi
    final DescribeCACertificateResult executeDescribeCACertificate(DescribeCACertificateRequest describeCACertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCACertificateRequest> request = null;
        Response<DescribeCACertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCACertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCACertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCACertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCACertificateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeCACertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeCertificate
     */
    @Override
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificate(request);
    }

    @SdkInternalApi
    final DescribeCertificateResult executeDescribeCertificate(DescribeCertificateRequest describeCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the default authorizer.
     * </p>
     * 
     * @param describeDefaultAuthorizerRequest
     * @return Result of the DescribeDefaultAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeDefaultAuthorizer
     */
    @Override
    public DescribeDefaultAuthorizerResult describeDefaultAuthorizer(DescribeDefaultAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDefaultAuthorizer(request);
    }

    @SdkInternalApi
    final DescribeDefaultAuthorizerResult executeDescribeDefaultAuthorizer(DescribeDefaultAuthorizerRequest describeDefaultAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDefaultAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDefaultAuthorizerRequest> request = null;
        Response<DescribeDefaultAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDefaultAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDefaultAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDefaultAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDefaultAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDefaultAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @return Result of the DescribeEndpoint operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeEndpoint
     */
    @Override
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpoint(request);
    }

    @SdkInternalApi
    final DescribeEndpointResult executeDescribeEndpoint(DescribeEndpointRequest describeEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes event configurations.
     * </p>
     * 
     * @param describeEventConfigurationsRequest
     * @return Result of the DescribeEventConfigurations operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeEventConfigurations
     */
    @Override
    public DescribeEventConfigurationsResult describeEventConfigurations(DescribeEventConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventConfigurations(request);
    }

    @SdkInternalApi
    final DescribeEventConfigurationsResult executeDescribeEventConfigurations(DescribeEventConfigurationsRequest describeEventConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventConfigurationsRequest> request = null;
        Response<DescribeEventConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEventConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEventConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a search index.
     * </p>
     * 
     * @param describeIndexRequest
     * @return Result of the DescribeIndex operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeIndex
     */
    @Override
    public DescribeIndexResult describeIndex(DescribeIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIndex(request);
    }

    @SdkInternalApi
    final DescribeIndexResult executeDescribeIndex(DescribeIndexRequest describeIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIndexRequest> request = null;
        Response<DescribeIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a job.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DescribeJob
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJob(request);
    }

    @SdkInternalApi
    final DescribeJobResult executeDescribeJob(DescribeJobRequest describeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return Result of the DescribeJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.DescribeJobExecution
     */
    @Override
    public DescribeJobExecutionResult describeJobExecution(DescribeJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobExecution(request);
    }

    @SdkInternalApi
    final DescribeJobExecutionResult executeDescribeJobExecution(DescribeJobExecutionRequest describeJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobExecutionRequest> request = null;
        Response<DescribeJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a role alias.
     * </p>
     * 
     * @param describeRoleAliasRequest
     * @return Result of the DescribeRoleAlias operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeRoleAlias
     */
    @Override
    public DescribeRoleAliasResult describeRoleAlias(DescribeRoleAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRoleAlias(request);
    }

    @SdkInternalApi
    final DescribeRoleAliasResult executeDescribeRoleAlias(DescribeRoleAliasRequest describeRoleAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRoleAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRoleAliasRequest> request = null;
        Response<DescribeRoleAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRoleAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRoleAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRoleAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRoleAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRoleAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a scheduled audit.
     * </p>
     * 
     * @param describeScheduledAuditRequest
     * @return Result of the DescribeScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeScheduledAudit
     */
    @Override
    public DescribeScheduledAuditResult describeScheduledAudit(DescribeScheduledAuditRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScheduledAudit(request);
    }

    @SdkInternalApi
    final DescribeScheduledAuditResult executeDescribeScheduledAudit(DescribeScheduledAuditRequest describeScheduledAuditRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduledAuditRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledAuditRequest> request = null;
        Response<DescribeScheduledAuditResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduledAuditRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScheduledAuditRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScheduledAudit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScheduledAuditResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScheduledAuditResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Device Defender security profile.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return Result of the DescribeSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeSecurityProfile
     */
    @Override
    public DescribeSecurityProfileResult describeSecurityProfile(DescribeSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSecurityProfile(request);
    }

    @SdkInternalApi
    final DescribeSecurityProfileResult executeDescribeSecurityProfile(DescribeSecurityProfileRequest describeSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecurityProfileRequest> request = null;
        Response<DescribeSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSecurityProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a stream.
     * </p>
     * 
     * @param describeStreamRequest
     * @return Result of the DescribeStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeStream
     */
    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStream(request);
    }

    @SdkInternalApi
    final DescribeStreamResult executeDescribeStream(DescribeStreamRequest describeStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @return Result of the DescribeThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeThing
     */
    @Override
    public DescribeThingResult describeThing(DescribeThingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThing(request);
    }

    @SdkInternalApi
    final DescribeThingResult executeDescribeThing(DescribeThingRequest describeThingRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingRequest> request = null;
        Response<DescribeThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe a thing group.
     * </p>
     * 
     * @param describeThingGroupRequest
     * @return Result of the DescribeThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeThingGroup
     */
    @Override
    public DescribeThingGroupResult describeThingGroup(DescribeThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThingGroup(request);
    }

    @SdkInternalApi
    final DescribeThingGroupResult executeDescribeThingGroup(DescribeThingGroupRequest describeThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingGroupRequest> request = null;
        Response<DescribeThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a bulk thing provisioning task.
     * </p>
     * 
     * @param describeThingRegistrationTaskRequest
     * @return Result of the DescribeThingRegistrationTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeThingRegistrationTask
     */
    @Override
    public DescribeThingRegistrationTaskResult describeThingRegistrationTask(DescribeThingRegistrationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThingRegistrationTask(request);
    }

    @SdkInternalApi
    final DescribeThingRegistrationTaskResult executeDescribeThingRegistrationTask(DescribeThingRegistrationTaskRequest describeThingRegistrationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThingRegistrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingRegistrationTaskRequest> request = null;
        Response<DescribeThingRegistrationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingRegistrationTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeThingRegistrationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThingRegistrationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThingRegistrationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeThingRegistrationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified thing type.
     * </p>
     * 
     * @param describeThingTypeRequest
     *        The input for the DescribeThingType operation.
     * @return Result of the DescribeThingType operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeThingType
     */
    @Override
    public DescribeThingTypeResult describeThingType(DescribeThingTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThingType(request);
    }

    @SdkInternalApi
    final DescribeThingTypeResult executeDescribeThingType(DescribeThingTypeRequest describeThingTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThingTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingTypeRequest> request = null;
        Response<DescribeThingTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeThingTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThingType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThingTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeThingTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a policy from the specified target.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return Result of the DetachPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.DetachPolicy
     */
    @Override
    public DetachPolicyResult detachPolicy(DetachPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachPolicy(request);
    }

    @SdkInternalApi
    final DetachPolicyResult executeDetachPolicy(DetachPolicyRequest detachPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(detachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPolicyRequest> request = null;
        Response<DetachPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>DetachPolicy</a> instead.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @return Result of the DetachPrincipalPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachPrincipalPolicy
     */
    @Override
    @Deprecated
    public DetachPrincipalPolicyResult detachPrincipalPolicy(DetachPrincipalPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachPrincipalPolicy(request);
    }

    @SdkInternalApi
    final DetachPrincipalPolicyResult executeDetachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(detachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPrincipalPolicyRequest> request = null;
        Response<DetachPrincipalPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPrincipalPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachPrincipalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachPrincipalPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachPrincipalPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DetachPrincipalPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a Device Defender security profile from a thing group or from this account.
     * </p>
     * 
     * @param detachSecurityProfileRequest
     * @return Result of the DetachSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachSecurityProfile
     */
    @Override
    public DetachSecurityProfileResult detachSecurityProfile(DetachSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDetachSecurityProfile(request);
    }

    @SdkInternalApi
    final DetachSecurityProfileResult executeDetachSecurityProfile(DetachSecurityProfileRequest detachSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(detachSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachSecurityProfileRequest> request = null;
        Response<DetachSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DetachSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * <note>
     * <p>
     * This call is asynchronous. It might take several seconds for the detachment to propagate.
     * </p>
     * </note>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @return Result of the DetachThingPrincipal operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachThingPrincipal
     */
    @Override
    public DetachThingPrincipalResult detachThingPrincipal(DetachThingPrincipalRequest request) {
        request = beforeClientExecution(request);
        return executeDetachThingPrincipal(request);
    }

    @SdkInternalApi
    final DetachThingPrincipalResult executeDetachThingPrincipal(DetachThingPrincipalRequest detachThingPrincipalRequest) {

        ExecutionContext executionContext = createExecutionContext(detachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachThingPrincipalRequest> request = null;
        Response<DetachThingPrincipalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachThingPrincipalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachThingPrincipalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachThingPrincipal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachThingPrincipalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachThingPrincipalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the rule.
     * </p>
     * 
     * @param disableTopicRuleRequest
     *        The input for the DisableTopicRuleRequest operation.
     * @return Result of the DisableTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.DisableTopicRule
     */
    @Override
    public DisableTopicRuleResult disableTopicRule(DisableTopicRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDisableTopicRule(request);
    }

    @SdkInternalApi
    final DisableTopicRuleResult executeDisableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(disableTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableTopicRuleRequest> request = null;
        Response<DisableTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableTopicRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableTopicRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableTopicRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableTopicRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the rule.
     * </p>
     * 
     * @param enableTopicRuleRequest
     *        The input for the EnableTopicRuleRequest operation.
     * @return Result of the EnableTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.EnableTopicRule
     */
    @Override
    public EnableTopicRuleResult enableTopicRule(EnableTopicRuleRequest request) {
        request = beforeClientExecution(request);
        return executeEnableTopicRule(request);
    }

    @SdkInternalApi
    final EnableTopicRuleResult executeEnableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(enableTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableTopicRuleRequest> request = null;
        Response<EnableTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableTopicRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableTopicRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableTopicRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableTopicRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
     * connects to the AWS IoT device gateway.
     * </p>
     * 
     * @param getEffectivePoliciesRequest
     * @return Result of the GetEffectivePolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.GetEffectivePolicies
     */
    @Override
    public GetEffectivePoliciesResult getEffectivePolicies(GetEffectivePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEffectivePolicies(request);
    }

    @SdkInternalApi
    final GetEffectivePoliciesResult executeGetEffectivePolicies(GetEffectivePoliciesRequest getEffectivePoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEffectivePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEffectivePoliciesRequest> request = null;
        Response<GetEffectivePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEffectivePoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEffectivePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEffectivePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEffectivePoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEffectivePoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the search configuration.
     * </p>
     * 
     * @param getIndexingConfigurationRequest
     * @return Result of the GetIndexingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetIndexingConfiguration
     */
    @Override
    public GetIndexingConfigurationResult getIndexingConfiguration(GetIndexingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetIndexingConfiguration(request);
    }

    @SdkInternalApi
    final GetIndexingConfigurationResult executeGetIndexingConfiguration(GetIndexingConfigurationRequest getIndexingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getIndexingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIndexingConfigurationRequest> request = null;
        Response<GetIndexingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIndexingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getIndexingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIndexingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIndexingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetIndexingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a job document.
     * </p>
     * 
     * @param getJobDocumentRequest
     * @return Result of the GetJobDocument operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetJobDocument
     */
    @Override
    public GetJobDocumentResult getJobDocument(GetJobDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobDocument(request);
    }

    @SdkInternalApi
    final GetJobDocumentResult executeGetJobDocument(GetJobDocumentRequest getJobDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobDocumentRequest> request = null;
        Response<GetJobDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use <code>GetV2LoggingOptions</code> instead.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @return Result of the GetLoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetLoggingOptions
     */
    @Override
    public GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoggingOptions(request);
    }

    @SdkInternalApi
    final GetLoggingOptionsResult executeGetLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingOptionsRequest> request = null;
        Response<GetLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an OTA update.
     * </p>
     * 
     * @param getOTAUpdateRequest
     * @return Result of the GetOTAUpdate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.GetOTAUpdate
     */
    @Override
    public GetOTAUpdateResult getOTAUpdate(GetOTAUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeGetOTAUpdate(request);
    }

    @SdkInternalApi
    final GetOTAUpdateResult executeGetOTAUpdate(GetOTAUpdateRequest getOTAUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(getOTAUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOTAUpdateRequest> request = null;
        Response<GetOTAUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOTAUpdateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOTAUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOTAUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOTAUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOTAUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy with the policy document of the default version.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetPolicy
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicy(request);
    }

    @SdkInternalApi
    final GetPolicyResult executeGetPolicy(GetPolicyRequest getPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @return Result of the GetPolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetPolicyVersion
     */
    @Override
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicyVersion(request);
    }

    @SdkInternalApi
    final GetPolicyVersionResult executeGetPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyVersionRequest> request = null;
        Response<GetPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a registration code used to register a CA certificate with AWS IoT.
     * </p>
     * 
     * @param getRegistrationCodeRequest
     *        The input to the GetRegistrationCode operation.
     * @return Result of the GetRegistrationCode operation returned by the service.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @sample AWSIot.GetRegistrationCode
     */
    @Override
    public GetRegistrationCodeResult getRegistrationCode(GetRegistrationCodeRequest request) {
        request = beforeClientExecution(request);
        return executeGetRegistrationCode(request);
    }

    @SdkInternalApi
    final GetRegistrationCodeResult executeGetRegistrationCode(GetRegistrationCodeRequest getRegistrationCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(getRegistrationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegistrationCodeRequest> request = null;
        Response<GetRegistrationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegistrationCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRegistrationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRegistrationCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRegistrationCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRegistrationCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets statistics about things that match the specified query.
     * </p>
     * 
     * @param getStatisticsRequest
     * @return Result of the GetStatistics operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws InvalidAggregationException
     *         The aggregation is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.GetStatistics
     */
    @Override
    public GetStatisticsResult getStatistics(GetStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetStatistics(request);
    }

    @SdkInternalApi
    final GetStatisticsResult executeGetStatistics(GetStatisticsRequest getStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStatisticsRequest> request = null;
        Response<GetStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the rule.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @return Result of the GetTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.GetTopicRule
     */
    @Override
    public GetTopicRuleResult getTopicRule(GetTopicRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetTopicRule(request);
    }

    @SdkInternalApi
    final GetTopicRuleResult executeGetTopicRule(GetTopicRuleRequest getTopicRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTopicRuleRequest> request = null;
        Response<GetTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTopicRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTopicRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTopicRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTopicRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the fine grained logging options.
     * </p>
     * 
     * @param getV2LoggingOptionsRequest
     * @return Result of the GetV2LoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws NotConfiguredException
     *         The resource is not configured.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetV2LoggingOptions
     */
    @Override
    public GetV2LoggingOptionsResult getV2LoggingOptions(GetV2LoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetV2LoggingOptions(request);
    }

    @SdkInternalApi
    final GetV2LoggingOptionsResult executeGetV2LoggingOptions(GetV2LoggingOptionsRequest getV2LoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getV2LoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetV2LoggingOptionsRequest> request = null;
        Response<GetV2LoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetV2LoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getV2LoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetV2LoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetV2LoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetV2LoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the active violations for a given Device Defender security profile.
     * </p>
     * 
     * @param listActiveViolationsRequest
     * @return Result of the ListActiveViolations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListActiveViolations
     */
    @Override
    public ListActiveViolationsResult listActiveViolations(ListActiveViolationsRequest request) {
        request = beforeClientExecution(request);
        return executeListActiveViolations(request);
    }

    @SdkInternalApi
    final ListActiveViolationsResult executeListActiveViolations(ListActiveViolationsRequest listActiveViolationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listActiveViolationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActiveViolationsRequest> request = null;
        Response<ListActiveViolationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActiveViolationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActiveViolationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListActiveViolations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListActiveViolationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListActiveViolationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the policies attached to the specified thing group.
     * </p>
     * 
     * @param listAttachedPoliciesRequest
     * @return Result of the ListAttachedPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.ListAttachedPolicies
     */
    @Override
    public ListAttachedPoliciesResult listAttachedPolicies(ListAttachedPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachedPolicies(request);
    }

    @SdkInternalApi
    final ListAttachedPoliciesResult executeListAttachedPolicies(ListAttachedPoliciesRequest listAttachedPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttachedPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedPoliciesRequest> request = null;
        Response<ListAttachedPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttachedPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachedPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttachedPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttachedPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
     * period. (Findings are retained for 180 days.)
     * </p>
     * 
     * @param listAuditFindingsRequest
     * @return Result of the ListAuditFindings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditFindings
     */
    @Override
    public ListAuditFindingsResult listAuditFindings(ListAuditFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeListAuditFindings(request);
    }

    @SdkInternalApi
    final ListAuditFindingsResult executeListAuditFindings(ListAuditFindingsRequest listAuditFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAuditFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAuditFindingsRequest> request = null;
        Response<ListAuditFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAuditFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAuditFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAuditFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAuditFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAuditFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Device Defender audits that have been performed during a given time period.
     * </p>
     * 
     * @param listAuditTasksRequest
     * @return Result of the ListAuditTasks operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuditTasks
     */
    @Override
    public ListAuditTasksResult listAuditTasks(ListAuditTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListAuditTasks(request);
    }

    @SdkInternalApi
    final ListAuditTasksResult executeListAuditTasks(ListAuditTasksRequest listAuditTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAuditTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAuditTasksRequest> request = null;
        Response<ListAuditTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAuditTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAuditTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAuditTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAuditTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAuditTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the authorizers registered in your account.
     * </p>
     * 
     * @param listAuthorizersRequest
     * @return Result of the ListAuthorizers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListAuthorizers
     */
    @Override
    public ListAuthorizersResult listAuthorizers(ListAuthorizersRequest request) {
        request = beforeClientExecution(request);
        return executeListAuthorizers(request);
    }

    @SdkInternalApi
    final ListAuthorizersResult executeListAuthorizers(ListAuthorizersRequest listAuthorizersRequest) {

        ExecutionContext executionContext = createExecutionContext(listAuthorizersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAuthorizersRequest> request = null;
        Response<ListAuthorizersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAuthorizersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAuthorizersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAuthorizers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAuthorizersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAuthorizersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the billing groups you have created.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return Result of the ListBillingGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListBillingGroups
     */
    @Override
    public ListBillingGroupsResult listBillingGroups(ListBillingGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListBillingGroups(request);
    }

    @SdkInternalApi
    final ListBillingGroupsResult executeListBillingGroups(ListBillingGroupsRequest listBillingGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBillingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBillingGroupsRequest> request = null;
        Response<ListBillingGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBillingGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBillingGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBillingGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBillingGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBillingGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the CA certificates registered for your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * 
     * @param listCACertificatesRequest
     *        Input for the ListCACertificates operation.
     * @return Result of the ListCACertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCACertificates
     */
    @Override
    public ListCACertificatesResult listCACertificates(ListCACertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCACertificates(request);
    }

    @SdkInternalApi
    final ListCACertificatesResult executeListCACertificates(ListCACertificatesRequest listCACertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCACertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCACertificatesRequest> request = null;
        Response<ListCACertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCACertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCACertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCACertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCACertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCACertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the certificates registered in your AWS account.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
     * results.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @return Result of the ListCertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCertificates
     */
    @Override
    public ListCertificatesResult listCertificates(ListCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCertificates(request);
    }

    @SdkInternalApi
    final ListCertificatesResult executeListCertificates(ListCertificatesRequest listCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the device certificates signed by the specified CA certificate.
     * </p>
     * 
     * @param listCertificatesByCARequest
     *        The input to the ListCertificatesByCA operation.
     * @return Result of the ListCertificatesByCA operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCertificatesByCA
     */
    @Override
    public ListCertificatesByCAResult listCertificatesByCA(ListCertificatesByCARequest request) {
        request = beforeClientExecution(request);
        return executeListCertificatesByCA(request);
    }

    @SdkInternalApi
    final ListCertificatesByCAResult executeListCertificatesByCA(ListCertificatesByCARequest listCertificatesByCARequest) {

        ExecutionContext executionContext = createExecutionContext(listCertificatesByCARequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesByCARequest> request = null;
        Response<ListCertificatesByCAResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesByCARequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCertificatesByCARequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCertificatesByCA");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCertificatesByCAResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCertificatesByCAResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the search indices.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListIndices
     */
    @Override
    public ListIndicesResult listIndices(ListIndicesRequest request) {
        request = beforeClientExecution(request);
        return executeListIndices(request);
    }

    @SdkInternalApi
    final ListIndicesResult executeListIndices(ListIndicesRequest listIndicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIndicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIndicesRequest> request = null;
        Response<ListIndicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIndicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIndicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIndices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIndicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIndicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the job executions for a job.
     * </p>
     * 
     * @param listJobExecutionsForJobRequest
     * @return Result of the ListJobExecutionsForJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListJobExecutionsForJob
     */
    @Override
    public ListJobExecutionsForJobResult listJobExecutionsForJob(ListJobExecutionsForJobRequest request) {
        request = beforeClientExecution(request);
        return executeListJobExecutionsForJob(request);
    }

    @SdkInternalApi
    final ListJobExecutionsForJobResult executeListJobExecutionsForJob(ListJobExecutionsForJobRequest listJobExecutionsForJobRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobExecutionsForJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobExecutionsForJobRequest> request = null;
        Response<ListJobExecutionsForJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobExecutionsForJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listJobExecutionsForJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobExecutionsForJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobExecutionsForJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListJobExecutionsForJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the job executions for the specified thing.
     * </p>
     * 
     * @param listJobExecutionsForThingRequest
     * @return Result of the ListJobExecutionsForThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListJobExecutionsForThing
     */
    @Override
    public ListJobExecutionsForThingResult listJobExecutionsForThing(ListJobExecutionsForThingRequest request) {
        request = beforeClientExecution(request);
        return executeListJobExecutionsForThing(request);
    }

    @SdkInternalApi
    final ListJobExecutionsForThingResult executeListJobExecutionsForThing(ListJobExecutionsForThingRequest listJobExecutionsForThingRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobExecutionsForThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobExecutionsForThingRequest> request = null;
        Response<ListJobExecutionsForThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobExecutionsForThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listJobExecutionsForThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobExecutionsForThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobExecutionsForThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListJobExecutionsForThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListJobs
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists OTA updates.
     * </p>
     * 
     * @param listOTAUpdatesRequest
     * @return Result of the ListOTAUpdates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListOTAUpdates
     */
    @Override
    public ListOTAUpdatesResult listOTAUpdates(ListOTAUpdatesRequest request) {
        request = beforeClientExecution(request);
        return executeListOTAUpdates(request);
    }

    @SdkInternalApi
    final ListOTAUpdatesResult executeListOTAUpdates(ListOTAUpdatesRequest listOTAUpdatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listOTAUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOTAUpdatesRequest> request = null;
        Response<ListOTAUpdatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOTAUpdatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOTAUpdatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOTAUpdates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOTAUpdatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOTAUpdatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists certificates that are being transferred but not yet accepted.
     * </p>
     * 
     * @param listOutgoingCertificatesRequest
     *        The input to the ListOutgoingCertificates operation.
     * @return Result of the ListOutgoingCertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListOutgoingCertificates
     */
    @Override
    public ListOutgoingCertificatesResult listOutgoingCertificates(ListOutgoingCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListOutgoingCertificates(request);
    }

    @SdkInternalApi
    final ListOutgoingCertificatesResult executeListOutgoingCertificates(ListOutgoingCertificatesRequest listOutgoingCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listOutgoingCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOutgoingCertificatesRequest> request = null;
        Response<ListOutgoingCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOutgoingCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOutgoingCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOutgoingCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOutgoingCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOutgoingCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @return Result of the ListPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicies
     */
    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicies(request);
    }

    @SdkInternalApi
    final ListPoliciesResult executeListPolicies(ListPoliciesRequest listPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the principals associated with the specified policy.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListTargetsForPolicy</a> instead.
     * </p>
     * 
     * @param listPolicyPrincipalsRequest
     *        The input for the ListPolicyPrincipals operation.
     * @return Result of the ListPolicyPrincipals operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicyPrincipals
     */
    @Override
    @Deprecated
    public ListPolicyPrincipalsResult listPolicyPrincipals(ListPolicyPrincipalsRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicyPrincipals(request);
    }

    @SdkInternalApi
    final ListPolicyPrincipalsResult executeListPolicyPrincipals(ListPolicyPrincipalsRequest listPolicyPrincipalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPolicyPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyPrincipalsRequest> request = null;
        Response<ListPolicyPrincipalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyPrincipalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPolicyPrincipalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicyPrincipals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPolicyPrincipalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPolicyPrincipalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of the specified policy and identifies the default version.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @return Result of the ListPolicyVersions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicyVersions
     */
    @Override
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicyVersions(request);
    }

    @SdkInternalApi
    final ListPolicyVersionsResult executeListPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyVersionsRequest> request = null;
        Response<ListPolicyVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPolicyVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicyVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPolicyVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPolicyVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in <a
     * href=
     * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >AmazonCognito Identity format</a>.
     * </p>
     * <p>
     * <b>Note:</b> This API is deprecated. Please use <a>ListAttachedPolicies</a> instead.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @return Result of the ListPrincipalPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPrincipalPolicies
     */
    @Override
    @Deprecated
    public ListPrincipalPoliciesResult listPrincipalPolicies(ListPrincipalPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPrincipalPolicies(request);
    }

    @SdkInternalApi
    final ListPrincipalPoliciesResult executeListPrincipalPolicies(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPrincipalPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalPoliciesRequest> request = null;
        Response<ListPrincipalPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPrincipalPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPrincipalPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPrincipalPoliciesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPrincipalPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @return Result of the ListPrincipalThings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListPrincipalThings
     */
    @Override
    public ListPrincipalThingsResult listPrincipalThings(ListPrincipalThingsRequest request) {
        request = beforeClientExecution(request);
        return executeListPrincipalThings(request);
    }

    @SdkInternalApi
    final ListPrincipalThingsResult executeListPrincipalThings(ListPrincipalThingsRequest listPrincipalThingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPrincipalThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalThingsRequest> request = null;
        Response<ListPrincipalThingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalThingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPrincipalThingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPrincipalThings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPrincipalThingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPrincipalThingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the role aliases registered in your account.
     * </p>
     * 
     * @param listRoleAliasesRequest
     * @return Result of the ListRoleAliases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListRoleAliases
     */
    @Override
    public ListRoleAliasesResult listRoleAliases(ListRoleAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListRoleAliases(request);
    }

    @SdkInternalApi
    final ListRoleAliasesResult executeListRoleAliases(ListRoleAliasesRequest listRoleAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoleAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoleAliasesRequest> request = null;
        Response<ListRoleAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoleAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRoleAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoleAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoleAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRoleAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of your scheduled audits.
     * </p>
     * 
     * @param listScheduledAuditsRequest
     * @return Result of the ListScheduledAudits operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListScheduledAudits
     */
    @Override
    public ListScheduledAuditsResult listScheduledAudits(ListScheduledAuditsRequest request) {
        request = beforeClientExecution(request);
        return executeListScheduledAudits(request);
    }

    @SdkInternalApi
    final ListScheduledAuditsResult executeListScheduledAudits(ListScheduledAuditsRequest listScheduledAuditsRequest) {

        ExecutionContext executionContext = createExecutionContext(listScheduledAuditsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScheduledAuditsRequest> request = null;
        Response<ListScheduledAuditsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScheduledAuditsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScheduledAuditsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScheduledAudits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScheduledAuditsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScheduledAuditsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Device Defender security profiles you have created. You can use filters to list only those security
     * profiles associated with a thing group or only those associated with your account.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return Result of the ListSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListSecurityProfiles
     */
    @Override
    public ListSecurityProfilesResult listSecurityProfiles(ListSecurityProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityProfiles(request);
    }

    @SdkInternalApi
    final ListSecurityProfilesResult executeListSecurityProfiles(ListSecurityProfilesRequest listSecurityProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityProfilesRequest> request = null;
        Response<ListSecurityProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecurityProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecurityProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Device Defender security profiles attached to a target (thing group).
     * </p>
     * 
     * @param listSecurityProfilesForTargetRequest
     * @return Result of the ListSecurityProfilesForTarget operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListSecurityProfilesForTarget
     */
    @Override
    public ListSecurityProfilesForTargetResult listSecurityProfilesForTarget(ListSecurityProfilesForTargetRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityProfilesForTarget(request);
    }

    @SdkInternalApi
    final ListSecurityProfilesForTargetResult executeListSecurityProfilesForTarget(ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityProfilesForTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityProfilesForTargetRequest> request = null;
        Response<ListSecurityProfilesForTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityProfilesForTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSecurityProfilesForTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityProfilesForTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityProfilesForTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSecurityProfilesForTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the streams in your AWS account.
     * </p>
     * 
     * @param listStreamsRequest
     * @return Result of the ListStreams operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListStreams
     */
    @Override
    public ListStreamsResult listStreams(ListStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreams(request);
    }

    @SdkInternalApi
    final ListStreamsResult executeListStreams(ListStreamsRequest listStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListTagsForResource
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
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

    /**
     * <p>
     * List targets for the specified policy.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return Result of the ListTargetsForPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.ListTargetsForPolicy
     */
    @Override
    public ListTargetsForPolicyResult listTargetsForPolicy(ListTargetsForPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeListTargetsForPolicy(request);
    }

    @SdkInternalApi
    final ListTargetsForPolicyResult executeListTargetsForPolicy(ListTargetsForPolicyRequest listTargetsForPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetsForPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsForPolicyRequest> request = null;
        Response<ListTargetsForPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsForPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetsForPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargetsForPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetsForPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTargetsForPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the targets (thing groups) associated with a given Device Defender security profile.
     * </p>
     * 
     * @param listTargetsForSecurityProfileRequest
     * @return Result of the ListTargetsForSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListTargetsForSecurityProfile
     */
    @Override
    public ListTargetsForSecurityProfileResult listTargetsForSecurityProfile(ListTargetsForSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeListTargetsForSecurityProfile(request);
    }

    @SdkInternalApi
    final ListTargetsForSecurityProfileResult executeListTargetsForSecurityProfile(ListTargetsForSecurityProfileRequest listTargetsForSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetsForSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsForSecurityProfileRequest> request = null;
        Response<ListTargetsForSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsForSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTargetsForSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargetsForSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetsForSecurityProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTargetsForSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the thing groups in your account.
     * </p>
     * 
     * @param listThingGroupsRequest
     * @return Result of the ListThingGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListThingGroups
     */
    @Override
    public ListThingGroupsResult listThingGroups(ListThingGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListThingGroups(request);
    }

    @SdkInternalApi
    final ListThingGroupsResult executeListThingGroups(ListThingGroupsRequest listThingGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingGroupsRequest> request = null;
        Response<ListThingGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThingGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThingGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the thing groups to which the specified thing belongs.
     * </p>
     * 
     * @param listThingGroupsForThingRequest
     * @return Result of the ListThingGroupsForThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListThingGroupsForThing
     */
    @Override
    public ListThingGroupsForThingResult listThingGroupsForThing(ListThingGroupsForThingRequest request) {
        request = beforeClientExecution(request);
        return executeListThingGroupsForThing(request);
    }

    @SdkInternalApi
    final ListThingGroupsForThingResult executeListThingGroupsForThing(ListThingGroupsForThingRequest listThingGroupsForThingRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingGroupsForThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingGroupsForThingRequest> request = null;
        Response<ListThingGroupsForThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingGroupsForThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listThingGroupsForThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingGroupsForThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingGroupsForThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListThingGroupsForThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
     * groups, and roles, Amazon Cognito identities or federated identities.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @return Result of the ListThingPrincipals operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListThingPrincipals
     */
    @Override
    public ListThingPrincipalsResult listThingPrincipals(ListThingPrincipalsRequest request) {
        request = beforeClientExecution(request);
        return executeListThingPrincipals(request);
    }

    @SdkInternalApi
    final ListThingPrincipalsResult executeListThingPrincipals(ListThingPrincipalsRequest listThingPrincipalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingPrincipalsRequest> request = null;
        Response<ListThingPrincipalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingPrincipalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThingPrincipalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingPrincipals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingPrincipalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThingPrincipalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information about the thing registration tasks.
     * </p>
     * 
     * @param listThingRegistrationTaskReportsRequest
     * @return Result of the ListThingRegistrationTaskReports operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingRegistrationTaskReports
     */
    @Override
    public ListThingRegistrationTaskReportsResult listThingRegistrationTaskReports(ListThingRegistrationTaskReportsRequest request) {
        request = beforeClientExecution(request);
        return executeListThingRegistrationTaskReports(request);
    }

    @SdkInternalApi
    final ListThingRegistrationTaskReportsResult executeListThingRegistrationTaskReports(
            ListThingRegistrationTaskReportsRequest listThingRegistrationTaskReportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingRegistrationTaskReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingRegistrationTaskReportsRequest> request = null;
        Response<ListThingRegistrationTaskReportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingRegistrationTaskReportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listThingRegistrationTaskReportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingRegistrationTaskReports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingRegistrationTaskReportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListThingRegistrationTaskReportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List bulk thing provisioning tasks.
     * </p>
     * 
     * @param listThingRegistrationTasksRequest
     * @return Result of the ListThingRegistrationTasks operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingRegistrationTasks
     */
    @Override
    public ListThingRegistrationTasksResult listThingRegistrationTasks(ListThingRegistrationTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListThingRegistrationTasks(request);
    }

    @SdkInternalApi
    final ListThingRegistrationTasksResult executeListThingRegistrationTasks(ListThingRegistrationTasksRequest listThingRegistrationTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingRegistrationTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingRegistrationTasksRequest> request = null;
        Response<ListThingRegistrationTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingRegistrationTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listThingRegistrationTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingRegistrationTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingRegistrationTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListThingRegistrationTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the existing thing types.
     * </p>
     * 
     * @param listThingTypesRequest
     *        The input for the ListThingTypes operation.
     * @return Result of the ListThingTypes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingTypes
     */
    @Override
    public ListThingTypesResult listThingTypes(ListThingTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListThingTypes(request);
    }

    @SdkInternalApi
    final ListThingTypesResult executeListThingTypes(ListThingTypesRequest listThingTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingTypesRequest> request = null;
        Response<ListThingTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThingTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThingTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your things. Use the <b>attributeName</b> and <b>attributeValue</b> parameters to filter your things. For
     * example, calling <code>ListThings</code> with attributeName=Color and attributeValue=Red retrieves all things in
     * the registry that contain an attribute <b>Color</b> with the value <b>Red</b>.
     * </p>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @return Result of the ListThings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThings
     */
    @Override
    public ListThingsResult listThings(ListThingsRequest request) {
        request = beforeClientExecution(request);
        return executeListThings(request);
    }

    @SdkInternalApi
    final ListThingsResult executeListThings(ListThingsRequest listThingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingsRequest> request = null;
        Response<ListThingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the things you have added to the given billing group.
     * </p>
     * 
     * @param listThingsInBillingGroupRequest
     * @return Result of the ListThingsInBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.ListThingsInBillingGroup
     */
    @Override
    public ListThingsInBillingGroupResult listThingsInBillingGroup(ListThingsInBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeListThingsInBillingGroup(request);
    }

    @SdkInternalApi
    final ListThingsInBillingGroupResult executeListThingsInBillingGroup(ListThingsInBillingGroupRequest listThingsInBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingsInBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingsInBillingGroupRequest> request = null;
        Response<ListThingsInBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingsInBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listThingsInBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingsInBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingsInBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListThingsInBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the things in the specified group.
     * </p>
     * 
     * @param listThingsInThingGroupRequest
     * @return Result of the ListThingsInThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.ListThingsInThingGroup
     */
    @Override
    public ListThingsInThingGroupResult listThingsInThingGroup(ListThingsInThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeListThingsInThingGroup(request);
    }

    @SdkInternalApi
    final ListThingsInThingGroupResult executeListThingsInThingGroup(ListThingsInThingGroupRequest listThingsInThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(listThingsInThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingsInThingGroupRequest> request = null;
        Response<ListThingsInThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingsInThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThingsInThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThingsInThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThingsInThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListThingsInThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @return Result of the ListTopicRules operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListTopicRules
     */
    @Override
    public ListTopicRulesResult listTopicRules(ListTopicRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListTopicRules(request);
    }

    @SdkInternalApi
    final ListTopicRulesResult executeListTopicRules(ListTopicRulesRequest listTopicRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTopicRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicRulesRequest> request = null;
        Response<ListTopicRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTopicRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTopicRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTopicRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTopicRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists logging levels.
     * </p>
     * 
     * @param listV2LoggingLevelsRequest
     * @return Result of the ListV2LoggingLevels operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws NotConfiguredException
     *         The resource is not configured.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListV2LoggingLevels
     */
    @Override
    public ListV2LoggingLevelsResult listV2LoggingLevels(ListV2LoggingLevelsRequest request) {
        request = beforeClientExecution(request);
        return executeListV2LoggingLevels(request);
    }

    @SdkInternalApi
    final ListV2LoggingLevelsResult executeListV2LoggingLevels(ListV2LoggingLevelsRequest listV2LoggingLevelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listV2LoggingLevelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListV2LoggingLevelsRequest> request = null;
        Response<ListV2LoggingLevelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListV2LoggingLevelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listV2LoggingLevelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListV2LoggingLevels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListV2LoggingLevelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListV2LoggingLevelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Device Defender security profile violations discovered during the given time period. You can use
     * filters to limit the results to those alerts issued for a particular security profile, behavior or thing
     * (device).
     * </p>
     * 
     * @param listViolationEventsRequest
     * @return Result of the ListViolationEvents operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListViolationEvents
     */
    @Override
    public ListViolationEventsResult listViolationEvents(ListViolationEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListViolationEvents(request);
    }

    @SdkInternalApi
    final ListViolationEventsResult executeListViolationEvents(ListViolationEventsRequest listViolationEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listViolationEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListViolationEventsRequest> request = null;
        Response<ListViolationEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListViolationEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listViolationEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListViolationEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListViolationEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListViolationEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
     * can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
     * subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
     * have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
     * certificates with the RegisterCertificate API.
     * </p>
     * 
     * @param registerCACertificateRequest
     *        The input to the RegisterCACertificate operation.
     * @return Result of the RegisterCACertificate operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws RegistrationCodeValidationException
     *         The registration code is invalid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RegisterCACertificate
     */
    @Override
    public RegisterCACertificateResult registerCACertificate(RegisterCACertificateRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterCACertificate(request);
    }

    @SdkInternalApi
    final RegisterCACertificateResult executeRegisterCACertificate(RegisterCACertificateRequest registerCACertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(registerCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCACertificateRequest> request = null;
        Response<RegisterCACertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCACertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerCACertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterCACertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterCACertificateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RegisterCACertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
     * field, you must specify the CA certificate that was used to sign the device certificate being registered.
     * </p>
     * 
     * @param registerCertificateRequest
     *        The input to the RegisterCertificate operation.
     * @return Result of the RegisterCertificate operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws CertificateConflictException
     *         Unable to verify the CA certificate used to sign the device certificate you are attempting to register.
     *         This is happens when you have registered more than one CA certificate that has the same subject field and
     *         public key.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RegisterCertificate
     */
    @Override
    public RegisterCertificateResult registerCertificate(RegisterCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterCertificate(request);
    }

    @SdkInternalApi
    final RegisterCertificateResult executeRegisterCertificate(RegisterCertificateRequest registerCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(registerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCertificateRequest> request = null;
        Response<RegisterCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions a thing.
     * </p>
     * 
     * @param registerThingRequest
     * @return Result of the RegisterThing operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @throws ResourceRegistrationFailureException
     *         The resource registration failed.
     * @sample AWSIot.RegisterThing
     */
    @Override
    public RegisterThingResult registerThing(RegisterThingRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterThing(request);
    }

    @SdkInternalApi
    final RegisterThingResult executeRegisterThing(RegisterThingRequest registerThingRequest) {

        ExecutionContext executionContext = createExecutionContext(registerThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterThingRequest> request = null;
        Response<RegisterThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterThingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status
     * changes from <b>PENDING_TRANSFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a> to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After it is called, the certificate will be
     * returned to the source's account in the INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @return Result of the RejectCertificateTransfer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because the transfer is already complete.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RejectCertificateTransfer
     */
    @Override
    public RejectCertificateTransferResult rejectCertificateTransfer(RejectCertificateTransferRequest request) {
        request = beforeClientExecution(request);
        return executeRejectCertificateTransfer(request);
    }

    @SdkInternalApi
    final RejectCertificateTransferResult executeRejectCertificateTransfer(RejectCertificateTransferRequest rejectCertificateTransferRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectCertificateTransferRequest> request = null;
        Response<RejectCertificateTransferResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectCertificateTransferRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectCertificateTransferRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectCertificateTransfer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectCertificateTransferResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectCertificateTransferResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the given thing from the billing group.
     * </p>
     * 
     * @param removeThingFromBillingGroupRequest
     * @return Result of the RemoveThingFromBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.RemoveThingFromBillingGroup
     */
    @Override
    public RemoveThingFromBillingGroupResult removeThingFromBillingGroup(RemoveThingFromBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveThingFromBillingGroup(request);
    }

    @SdkInternalApi
    final RemoveThingFromBillingGroupResult executeRemoveThingFromBillingGroup(RemoveThingFromBillingGroupRequest removeThingFromBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(removeThingFromBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveThingFromBillingGroupRequest> request = null;
        Response<RemoveThingFromBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveThingFromBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeThingFromBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveThingFromBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveThingFromBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveThingFromBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove the specified thing from the specified group.
     * </p>
     * 
     * @param removeThingFromThingGroupRequest
     * @return Result of the RemoveThingFromThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.RemoveThingFromThingGroup
     */
    @Override
    public RemoveThingFromThingGroupResult removeThingFromThingGroup(RemoveThingFromThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveThingFromThingGroup(request);
    }

    @SdkInternalApi
    final RemoveThingFromThingGroupResult executeRemoveThingFromThingGroup(RemoveThingFromThingGroupRequest removeThingFromThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(removeThingFromThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveThingFromThingGroupRequest> request = null;
        Response<RemoveThingFromThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveThingFromThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeThingFromThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveThingFromThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveThingFromThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveThingFromThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
     * action. Any user who has permission to create rules will be able to access data processed by the rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @return Result of the ReplaceTopicRule operation returned by the service.
     * @throws SqlParseException
     *         The Rule-SQL expression can't be parsed correctly.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ConflictingResourceUpdateException
     *         A conflicting resource update exception. This exception is thrown when two pending updates cause a
     *         conflict.
     * @sample AWSIot.ReplaceTopicRule
     */
    @Override
    public ReplaceTopicRuleResult replaceTopicRule(ReplaceTopicRuleRequest request) {
        request = beforeClientExecution(request);
        return executeReplaceTopicRule(request);
    }

    @SdkInternalApi
    final ReplaceTopicRuleResult executeReplaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(replaceTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplaceTopicRuleRequest> request = null;
        Response<ReplaceTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplaceTopicRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(replaceTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReplaceTopicRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReplaceTopicRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReplaceTopicRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The query search index.
     * </p>
     * 
     * @param searchIndexRequest
     * @return Result of the SearchIndex operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @throws IndexNotReadyException
     *         The index is not ready.
     * @sample AWSIot.SearchIndex
     */
    @Override
    public SearchIndexResult searchIndex(SearchIndexRequest request) {
        request = beforeClientExecution(request);
        return executeSearchIndex(request);
    }

    @SdkInternalApi
    final SearchIndexResult executeSearchIndex(SearchIndexRequest searchIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(searchIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchIndexRequest> request = null;
        Response<SearchIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the default authorizer. This will be used if a websocket connection is made without specifying an
     * authorizer.
     * </p>
     * 
     * @param setDefaultAuthorizerRequest
     * @return Result of the SetDefaultAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIot.SetDefaultAuthorizer
     */
    @Override
    public SetDefaultAuthorizerResult setDefaultAuthorizer(SetDefaultAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeSetDefaultAuthorizer(request);
    }

    @SdkInternalApi
    final SetDefaultAuthorizerResult executeSetDefaultAuthorizer(SetDefaultAuthorizerRequest setDefaultAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(setDefaultAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultAuthorizerRequest> request = null;
        Response<SetDefaultAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setDefaultAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDefaultAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetDefaultAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetDefaultAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version. This action
     * affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
     * the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @return Result of the SetDefaultPolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.SetDefaultPolicyVersion
     */
    @Override
    public SetDefaultPolicyVersionResult setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeSetDefaultPolicyVersion(request);
    }

    @SdkInternalApi
    final SetDefaultPolicyVersionResult executeSetDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(setDefaultPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultPolicyVersionRequest> request = null;
        Response<SetDefaultPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultPolicyVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setDefaultPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDefaultPolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetDefaultPolicyVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetDefaultPolicyVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the logging options.
     * </p>
     * <p>
     * NOTE: use of this command is not recommended. Use <code>SetV2LoggingOptions</code> instead.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @return Result of the SetLoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.SetLoggingOptions
     */
    @Override
    public SetLoggingOptionsResult setLoggingOptions(SetLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeSetLoggingOptions(request);
    }

    @SdkInternalApi
    final SetLoggingOptionsResult executeSetLoggingOptions(SetLoggingOptionsRequest setLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(setLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoggingOptionsRequest> request = null;
        Response<SetLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the logging level.
     * </p>
     * 
     * @param setV2LoggingLevelRequest
     * @return Result of the SetV2LoggingLevel operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws NotConfiguredException
     *         The resource is not configured.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.SetV2LoggingLevel
     */
    @Override
    public SetV2LoggingLevelResult setV2LoggingLevel(SetV2LoggingLevelRequest request) {
        request = beforeClientExecution(request);
        return executeSetV2LoggingLevel(request);
    }

    @SdkInternalApi
    final SetV2LoggingLevelResult executeSetV2LoggingLevel(SetV2LoggingLevelRequest setV2LoggingLevelRequest) {

        ExecutionContext executionContext = createExecutionContext(setV2LoggingLevelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetV2LoggingLevelRequest> request = null;
        Response<SetV2LoggingLevelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetV2LoggingLevelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setV2LoggingLevelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetV2LoggingLevel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetV2LoggingLevelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetV2LoggingLevelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the logging options for the V2 logging service.
     * </p>
     * 
     * @param setV2LoggingOptionsRequest
     * @return Result of the SetV2LoggingOptions operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.SetV2LoggingOptions
     */
    @Override
    public SetV2LoggingOptionsResult setV2LoggingOptions(SetV2LoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeSetV2LoggingOptions(request);
    }

    @SdkInternalApi
    final SetV2LoggingOptionsResult executeSetV2LoggingOptions(SetV2LoggingOptionsRequest setV2LoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(setV2LoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetV2LoggingOptionsRequest> request = null;
        Response<SetV2LoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetV2LoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setV2LoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetV2LoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetV2LoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetV2LoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an on-demand Device Defender audit.
     * </p>
     * 
     * @param startOnDemandAuditTaskRequest
     * @return Result of the StartOnDemandAuditTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.StartOnDemandAuditTask
     */
    @Override
    public StartOnDemandAuditTaskResult startOnDemandAuditTask(StartOnDemandAuditTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartOnDemandAuditTask(request);
    }

    @SdkInternalApi
    final StartOnDemandAuditTaskResult executeStartOnDemandAuditTask(StartOnDemandAuditTaskRequest startOnDemandAuditTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startOnDemandAuditTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartOnDemandAuditTaskRequest> request = null;
        Response<StartOnDemandAuditTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartOnDemandAuditTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startOnDemandAuditTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartOnDemandAuditTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartOnDemandAuditTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartOnDemandAuditTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a bulk thing provisioning task.
     * </p>
     * 
     * @param startThingRegistrationTaskRequest
     * @return Result of the StartThingRegistrationTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.StartThingRegistrationTask
     */
    @Override
    public StartThingRegistrationTaskResult startThingRegistrationTask(StartThingRegistrationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartThingRegistrationTask(request);
    }

    @SdkInternalApi
    final StartThingRegistrationTaskResult executeStartThingRegistrationTask(StartThingRegistrationTaskRequest startThingRegistrationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startThingRegistrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartThingRegistrationTaskRequest> request = null;
        Response<StartThingRegistrationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartThingRegistrationTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startThingRegistrationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartThingRegistrationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartThingRegistrationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartThingRegistrationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a bulk thing provisioning task.
     * </p>
     * 
     * @param stopThingRegistrationTaskRequest
     * @return Result of the StopThingRegistrationTask operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.StopThingRegistrationTask
     */
    @Override
    public StopThingRegistrationTaskResult stopThingRegistrationTask(StopThingRegistrationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopThingRegistrationTask(request);
    }

    @SdkInternalApi
    final StopThingRegistrationTaskResult executeStopThingRegistrationTask(StopThingRegistrationTaskRequest stopThingRegistrationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopThingRegistrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopThingRegistrationTaskRequest> request = null;
        Response<StopThingRegistrationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopThingRegistrationTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopThingRegistrationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopThingRegistrationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopThingRegistrationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopThingRegistrationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.TagResource
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to
     * test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
     * </p>
     * 
     * @param testAuthorizationRequest
     * @return Result of the TestAuthorization operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIot.TestAuthorization
     */
    @Override
    public TestAuthorizationResult testAuthorization(TestAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeTestAuthorization(request);
    }

    @SdkInternalApi
    final TestAuthorizationResult executeTestAuthorization(TestAuthorizationRequest testAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(testAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestAuthorizationRequest> request = null;
        Response<TestAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
     * custom authorization behavior of devices that connect to the AWS IoT device gateway.
     * </p>
     * 
     * @param testInvokeAuthorizerRequest
     * @return Result of the TestInvokeAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidResponseException
     *         The response is invalid.
     * @sample AWSIot.TestInvokeAuthorizer
     */
    @Override
    public TestInvokeAuthorizerResult testInvokeAuthorizer(TestInvokeAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeTestInvokeAuthorizer(request);
    }

    @SdkInternalApi
    final TestInvokeAuthorizerResult executeTestInvokeAuthorizer(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(testInvokeAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestInvokeAuthorizerRequest> request = null;
        Response<TestInvokeAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestInvokeAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testInvokeAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestInvokeAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestInvokeAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestInvokeAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
     * target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to
     * deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach
     * them.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @return Result of the TransferCertificate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws TransferConflictException
     *         You can't transfer the certificate because authorization policies are still attached.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.TransferCertificate
     */
    @Override
    public TransferCertificateResult transferCertificate(TransferCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeTransferCertificate(request);
    }

    @SdkInternalApi
    final TransferCertificateResult executeTransferCertificate(TransferCertificateRequest transferCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(transferCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferCertificateRequest> request = null;
        Response<TransferCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(transferCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TransferCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TransferCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TransferCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.UntagResource
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
     * notifications are sent and which audit checks are enabled or disabled.
     * </p>
     * 
     * @param updateAccountAuditConfigurationRequest
     * @return Result of the UpdateAccountAuditConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateAccountAuditConfiguration
     */
    @Override
    public UpdateAccountAuditConfigurationResult updateAccountAuditConfiguration(UpdateAccountAuditConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountAuditConfiguration(request);
    }

    @SdkInternalApi
    final UpdateAccountAuditConfigurationResult executeUpdateAccountAuditConfiguration(
            UpdateAccountAuditConfigurationRequest updateAccountAuditConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountAuditConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountAuditConfigurationRequest> request = null;
        Response<UpdateAccountAuditConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountAuditConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAccountAuditConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountAuditConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountAuditConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAccountAuditConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateAuthorizer
     */
    @Override
    public UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAuthorizer(request);
    }

    @SdkInternalApi
    final UpdateAuthorizerResult executeUpdateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAuthorizerRequest> request = null;
        Response<UpdateAuthorizerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAuthorizerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAuthorizerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAuthorizer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAuthorizerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAuthorizerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates information about the billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return Result of the UpdateBillingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateBillingGroup
     */
    @Override
    public UpdateBillingGroupResult updateBillingGroup(UpdateBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBillingGroup(request);
    }

    @SdkInternalApi
    final UpdateBillingGroupResult executeUpdateBillingGroup(UpdateBillingGroupRequest updateBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBillingGroupRequest> request = null;
        Response<UpdateBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a registered CA certificate.
     * </p>
     * 
     * @param updateCACertificateRequest
     *        The input to the UpdateCACertificate operation.
     * @return Result of the UpdateCACertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateCACertificate
     */
    @Override
    public UpdateCACertificateResult updateCACertificate(UpdateCACertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCACertificate(request);
    }

    @SdkInternalApi
    final UpdateCACertificateResult executeUpdateCACertificate(UpdateCACertificateRequest updateCACertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCACertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCACertificateRequest> request = null;
        Response<UpdateCACertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCACertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCACertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCACertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCACertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCACertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is idempotent.
     * </p>
     * <p>
     * Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
     * but these devices will be unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @return Result of the UpdateCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateCertificate
     */
    @Override
    public UpdateCertificateResult updateCertificate(UpdateCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCertificate(request);
    }

    @SdkInternalApi
    final UpdateCertificateResult executeUpdateCertificate(UpdateCertificateRequest updateCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCertificateRequest> request = null;
        Response<UpdateCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a dynamic thing group.
     * </p>
     * 
     * @param updateDynamicThingGroupRequest
     * @return Result of the UpdateDynamicThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidQueryException
     *         The query is invalid.
     * @sample AWSIot.UpdateDynamicThingGroup
     */
    @Override
    public UpdateDynamicThingGroupResult updateDynamicThingGroup(UpdateDynamicThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDynamicThingGroup(request);
    }

    @SdkInternalApi
    final UpdateDynamicThingGroupResult executeUpdateDynamicThingGroup(UpdateDynamicThingGroupRequest updateDynamicThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDynamicThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDynamicThingGroupRequest> request = null;
        Response<UpdateDynamicThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDynamicThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDynamicThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDynamicThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDynamicThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDynamicThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the event configurations.
     * </p>
     * 
     * @param updateEventConfigurationsRequest
     * @return Result of the UpdateEventConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.UpdateEventConfigurations
     */
    @Override
    public UpdateEventConfigurationsResult updateEventConfigurations(UpdateEventConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventConfigurations(request);
    }

    @SdkInternalApi
    final UpdateEventConfigurationsResult executeUpdateEventConfigurations(UpdateEventConfigurationsRequest updateEventConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventConfigurationsRequest> request = null;
        Response<UpdateEventConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEventConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEventConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEventConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the search configuration.
     * </p>
     * 
     * @param updateIndexingConfigurationRequest
     * @return Result of the UpdateIndexingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateIndexingConfiguration
     */
    @Override
    public UpdateIndexingConfigurationResult updateIndexingConfiguration(UpdateIndexingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIndexingConfiguration(request);
    }

    @SdkInternalApi
    final UpdateIndexingConfigurationResult executeUpdateIndexingConfiguration(UpdateIndexingConfigurationRequest updateIndexingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIndexingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIndexingConfigurationRequest> request = null;
        Response<UpdateIndexingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIndexingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIndexingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIndexingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIndexingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIndexingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates supported fields of the specified job.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.UpdateJob
     */
    @Override
    public UpdateJobResult updateJob(UpdateJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJob(request);
    }

    @SdkInternalApi
    final UpdateJobResult executeUpdateJob(UpdateJobRequest updateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a role alias.
     * </p>
     * 
     * @param updateRoleAliasRequest
     * @return Result of the UpdateRoleAlias operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateRoleAlias
     */
    @Override
    public UpdateRoleAliasResult updateRoleAlias(UpdateRoleAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoleAlias(request);
    }

    @SdkInternalApi
    final UpdateRoleAliasResult executeUpdateRoleAlias(UpdateRoleAliasRequest updateRoleAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoleAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoleAliasRequest> request = null;
        Response<UpdateRoleAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoleAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRoleAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoleAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoleAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRoleAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
     * </p>
     * 
     * @param updateScheduledAuditRequest
     * @return Result of the UpdateScheduledAudit operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateScheduledAudit
     */
    @Override
    public UpdateScheduledAuditResult updateScheduledAudit(UpdateScheduledAuditRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScheduledAudit(request);
    }

    @SdkInternalApi
    final UpdateScheduledAuditResult executeUpdateScheduledAudit(UpdateScheduledAuditRequest updateScheduledAuditRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScheduledAuditRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScheduledAuditRequest> request = null;
        Response<UpdateScheduledAuditResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScheduledAuditRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScheduledAuditRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScheduledAudit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScheduledAuditResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateScheduledAuditResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Device Defender security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return Result of the UpdateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateSecurityProfile
     */
    @Override
    public UpdateSecurityProfileResult updateSecurityProfile(UpdateSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecurityProfile(request);
    }

    @SdkInternalApi
    final UpdateSecurityProfileResult executeUpdateSecurityProfile(UpdateSecurityProfileRequest updateSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecurityProfileRequest> request = null;
        Response<UpdateSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing stream. The stream version will be incremented by one.
     * </p>
     * 
     * @param updateStreamRequest
     * @return Result of the UpdateStream operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateStream
     */
    @Override
    public UpdateStreamResult updateStream(UpdateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStream(request);
    }

    @SdkInternalApi
    final UpdateStreamResult executeUpdateStream(UpdateStreamRequest updateStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamRequest> request = null;
        Response<UpdateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @return Result of the UpdateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThing
     */
    @Override
    public UpdateThingResult updateThing(UpdateThingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThing(request);
    }

    @SdkInternalApi
    final UpdateThingResult executeUpdateThing(UpdateThingRequest updateThingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingRequest> request = null;
        Response<UpdateThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a thing group.
     * </p>
     * 
     * @param updateThingGroupRequest
     * @return Result of the UpdateThingGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws VersionConflictException
     *         An exception thrown when the version of an entity specified with the <code>expectedVersion</code>
     *         parameter does not match the latest version in the system.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThingGroup
     */
    @Override
    public UpdateThingGroupResult updateThingGroup(UpdateThingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThingGroup(request);
    }

    @SdkInternalApi
    final UpdateThingGroupResult executeUpdateThingGroup(UpdateThingGroupRequest updateThingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingGroupRequest> request = null;
        Response<UpdateThingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateThingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the groups to which the thing belongs.
     * </p>
     * 
     * @param updateThingGroupsForThingRequest
     * @return Result of the UpdateThingGroupsForThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThingGroupsForThing
     */
    @Override
    public UpdateThingGroupsForThingResult updateThingGroupsForThing(UpdateThingGroupsForThingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThingGroupsForThing(request);
    }

    @SdkInternalApi
    final UpdateThingGroupsForThingResult executeUpdateThingGroupsForThing(UpdateThingGroupsForThingRequest updateThingGroupsForThingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThingGroupsForThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingGroupsForThingRequest> request = null;
        Response<UpdateThingGroupsForThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingGroupsForThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateThingGroupsForThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThingGroupsForThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThingGroupsForThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateThingGroupsForThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates a Device Defender security profile behaviors specification.
     * </p>
     * 
     * @param validateSecurityProfileBehaviorsRequest
     * @return Result of the ValidateSecurityProfileBehaviors operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ValidateSecurityProfileBehaviors
     */
    @Override
    public ValidateSecurityProfileBehaviorsResult validateSecurityProfileBehaviors(ValidateSecurityProfileBehaviorsRequest request) {
        request = beforeClientExecution(request);
        return executeValidateSecurityProfileBehaviors(request);
    }

    @SdkInternalApi
    final ValidateSecurityProfileBehaviorsResult executeValidateSecurityProfileBehaviors(
            ValidateSecurityProfileBehaviorsRequest validateSecurityProfileBehaviorsRequest) {

        ExecutionContext executionContext = createExecutionContext(validateSecurityProfileBehaviorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateSecurityProfileBehaviorsRequest> request = null;
        Response<ValidateSecurityProfileBehaviorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateSecurityProfileBehaviorsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validateSecurityProfileBehaviorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateSecurityProfileBehaviors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateSecurityProfileBehaviorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateSecurityProfileBehaviorsResultJsonUnmarshaller());
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
