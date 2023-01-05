/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g;

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

import com.amazonaws.services.private5g.AWSPrivate5GClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.private5g.model.*;
import com.amazonaws.services.private5g.model.transform.*;

/**
 * Client for accessing AWS Private 5G. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Private 5G is a managed service that makes it easy to deploy, operate, and scale your own private
 * mobile network at your on-premises location. Private 5G provides the pre-configured hardware and software for mobile
 * networks, helps automate setup, and scales capacity on demand to support additional devices as needed.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPrivate5GClient extends AmazonWebServiceClient implements AWSPrivate5G {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSPrivate5G.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "private-networks";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.private5g.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.private5g.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.private5g.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.private5g.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.private5g.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.private5g.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.private5g.model.AWSPrivate5GException.class));

    public static AWSPrivate5GClientBuilder builder() {
        return AWSPrivate5GClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Private 5G using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPrivate5GClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Private 5G using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPrivate5GClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("private-networks.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/private5g/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/private5g/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Acknowledges that the specified network order was received.
     * </p>
     * 
     * @param acknowledgeOrderReceiptRequest
     * @return Result of the AcknowledgeOrderReceipt operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.AcknowledgeOrderReceipt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/AcknowledgeOrderReceipt"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcknowledgeOrderReceiptResult acknowledgeOrderReceipt(AcknowledgeOrderReceiptRequest request) {
        request = beforeClientExecution(request);
        return executeAcknowledgeOrderReceipt(request);
    }

    @SdkInternalApi
    final AcknowledgeOrderReceiptResult executeAcknowledgeOrderReceipt(AcknowledgeOrderReceiptRequest acknowledgeOrderReceiptRequest) {

        ExecutionContext executionContext = createExecutionContext(acknowledgeOrderReceiptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeOrderReceiptRequest> request = null;
        Response<AcknowledgeOrderReceiptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeOrderReceiptRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acknowledgeOrderReceiptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcknowledgeOrderReceipt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcknowledgeOrderReceiptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcknowledgeOrderReceiptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates the specified device identifier.
     * </p>
     * 
     * @param activateDeviceIdentifierRequest
     * @return Result of the ActivateDeviceIdentifier operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ActivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ActivateDeviceIdentifierResult activateDeviceIdentifier(ActivateDeviceIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeActivateDeviceIdentifier(request);
    }

    @SdkInternalApi
    final ActivateDeviceIdentifierResult executeActivateDeviceIdentifier(ActivateDeviceIdentifierRequest activateDeviceIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(activateDeviceIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateDeviceIdentifierRequest> request = null;
        Response<ActivateDeviceIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateDeviceIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(activateDeviceIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateDeviceIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateDeviceIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ActivateDeviceIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates the specified network site.
     * </p>
     * 
     * @param activateNetworkSiteRequest
     * @return Result of the ActivateNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ActivateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ActivateNetworkSiteResult activateNetworkSite(ActivateNetworkSiteRequest request) {
        request = beforeClientExecution(request);
        return executeActivateNetworkSite(request);
    }

    @SdkInternalApi
    final ActivateNetworkSiteResult executeActivateNetworkSite(ActivateNetworkSiteRequest activateNetworkSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(activateNetworkSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateNetworkSiteRequest> request = null;
        Response<ActivateNetworkSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateNetworkSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(activateNetworkSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateNetworkSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateNetworkSiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivateNetworkSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures the specified network resource.
     * </p>
     * <p>
     * Use this action to specify the geographic position of the hardware. You must provide Certified Professional
     * Installer (CPI) credentials in the request so that we can obtain spectrum grants. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html">Radio units</a> in the
     * <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param configureAccessPointRequest
     * @return Result of the ConfigureAccessPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ConfigureAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ConfigureAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfigureAccessPointResult configureAccessPoint(ConfigureAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeConfigureAccessPoint(request);
    }

    @SdkInternalApi
    final ConfigureAccessPointResult executeConfigureAccessPoint(ConfigureAccessPointRequest configureAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(configureAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfigureAccessPointRequest> request = null;
        Response<ConfigureAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfigureAccessPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(configureAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfigureAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfigureAccessPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ConfigureAccessPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a network.
     * </p>
     * 
     * @param createNetworkRequest
     * @return Result of the CreateNetwork operation returned by the service.
     * @throws LimitExceededException
     *         The limit was exceeded.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateNetworkResult createNetwork(CreateNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNetwork(request);
    }

    @SdkInternalApi
    final CreateNetworkResult executeCreateNetwork(CreateNetworkRequest createNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkRequest> request = null;
        Response<CreateNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a network site.
     * </p>
     * 
     * @param createNetworkSiteRequest
     * @return Result of the CreateNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.CreateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNetworkSiteResult createNetworkSite(CreateNetworkSiteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNetworkSite(request);
    }

    @SdkInternalApi
    final CreateNetworkSiteResult executeCreateNetworkSite(CreateNetworkSiteRequest createNetworkSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(createNetworkSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkSiteRequest> request = null;
        Response<CreateNetworkSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNetworkSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNetworkSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNetworkSiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNetworkSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deactivates the specified device identifier.
     * </p>
     * 
     * @param deactivateDeviceIdentifierRequest
     * @return Result of the DeactivateDeviceIdentifier operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.DeactivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeactivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeactivateDeviceIdentifierResult deactivateDeviceIdentifier(DeactivateDeviceIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeDeactivateDeviceIdentifier(request);
    }

    @SdkInternalApi
    final DeactivateDeviceIdentifierResult executeDeactivateDeviceIdentifier(DeactivateDeviceIdentifierRequest deactivateDeviceIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(deactivateDeviceIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivateDeviceIdentifierRequest> request = null;
        Response<DeactivateDeviceIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivateDeviceIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deactivateDeviceIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeactivateDeviceIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeactivateDeviceIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeactivateDeviceIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified network. You must delete network sites before you delete the network. For more information,
     * see <a href="https://docs.aws.amazon.com/private-networks/latest/APIReference/API_DeleteNetworkSite.html">
     * DeleteNetworkSite</a> in the <i>API Reference for Amazon Web Services Private 5G</i>.
     * </p>
     * 
     * @param deleteNetworkRequest
     * @return Result of the DeleteNetwork operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.DeleteNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteNetworkResult deleteNetwork(DeleteNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNetwork(request);
    }

    @SdkInternalApi
    final DeleteNetworkResult executeDeleteNetwork(DeleteNetworkRequest deleteNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkRequest> request = null;
        Response<DeleteNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified network site. Return the hardware after you delete the network site. You are responsible
     * for minimum charges. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/hardware-maintenance.html">Hardware
     * returns</a> in the <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param deleteNetworkSiteRequest
     * @return Result of the DeleteNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.DeleteNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNetworkSiteResult deleteNetworkSite(DeleteNetworkSiteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNetworkSite(request);
    }

    @SdkInternalApi
    final DeleteNetworkSiteResult executeDeleteNetworkSite(DeleteNetworkSiteRequest deleteNetworkSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNetworkSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkSiteRequest> request = null;
        Response<DeleteNetworkSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNetworkSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNetworkSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNetworkSiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNetworkSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified device identifier.
     * </p>
     * 
     * @param getDeviceIdentifierRequest
     * @return Result of the GetDeviceIdentifier operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDeviceIdentifierResult getDeviceIdentifier(GetDeviceIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeviceIdentifier(request);
    }

    @SdkInternalApi
    final GetDeviceIdentifierResult executeGetDeviceIdentifier(GetDeviceIdentifierRequest getDeviceIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceIdentifierRequest> request = null;
        Response<GetDeviceIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeviceIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified network.
     * </p>
     * 
     * @param getNetworkRequest
     * @return Result of the GetNetwork operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetwork" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetNetworkResult getNetwork(GetNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetwork(request);
    }

    @SdkInternalApi
    final GetNetworkResult executeGetNetwork(GetNetworkRequest getNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkRequest> request = null;
        Response<GetNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified network resource.
     * </p>
     * 
     * @param getNetworkResourceRequest
     * @return Result of the GetNetworkResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetNetworkResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkResourceResult getNetworkResource(GetNetworkResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkResource(request);
    }

    @SdkInternalApi
    final GetNetworkResourceResult executeGetNetworkResource(GetNetworkResourceRequest getNetworkResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkResourceRequest> request = null;
        Response<GetNetworkResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified network site.
     * </p>
     * 
     * @param getNetworkSiteRequest
     * @return Result of the GetNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkSite" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetNetworkSiteResult getNetworkSite(GetNetworkSiteRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkSite(request);
    }

    @SdkInternalApi
    final GetNetworkSiteResult executeGetNetworkSite(GetNetworkSiteRequest getNetworkSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkSiteRequest> request = null;
        Response<GetNetworkSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkSiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @return Result of the GetOrder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOrderResult getOrder(GetOrderRequest request) {
        request = beforeClientExecution(request);
        return executeGetOrder(request);
    }

    @SdkInternalApi
    final GetOrderResult executeGetOrder(GetOrderRequest getOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(getOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOrderRequest> request = null;
        Response<GetOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOrderResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists device identifiers. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order, the status of device identifiers, or the ARN of the traffic
     * group.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you specify multiple filters, filters are joined with an OR, and the request </code>
     * </pre>
     * <p>
     * returns results that match all of the specified filters.
     * </p>
     * </p>
     * 
     * @param listDeviceIdentifiersRequest
     * @return Result of the ListDeviceIdentifiers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListDeviceIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListDeviceIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDeviceIdentifiersResult listDeviceIdentifiers(ListDeviceIdentifiersRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceIdentifiers(request);
    }

    @SdkInternalApi
    final ListDeviceIdentifiersResult executeListDeviceIdentifiers(ListDeviceIdentifiersRequest listDeviceIdentifiersRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceIdentifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceIdentifiersRequest> request = null;
        Response<ListDeviceIdentifiersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceIdentifiersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceIdentifiersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceIdentifiers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceIdentifiersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDeviceIdentifiersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists network resources. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order or the status of network resources.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listNetworkResourcesRequest
     * @return Result of the ListNetworkResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNetworkResourcesResult listNetworkResources(ListNetworkResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworkResources(request);
    }

    @SdkInternalApi
    final ListNetworkResourcesResult executeListNetworkResources(ListNetworkResourcesRequest listNetworkResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworkResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworkResourcesRequest> request = null;
        Response<ListNetworkResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworkResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNetworkResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworkResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworkResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNetworkResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists network sites. Add filters to your request to return a more specific list of results. Use filters to match
     * the status of the network site.
     * </p>
     * 
     * @param listNetworkSitesRequest
     * @return Result of the ListNetworkSites operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListNetworkSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkSites"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNetworkSitesResult listNetworkSites(ListNetworkSitesRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworkSites(request);
    }

    @SdkInternalApi
    final ListNetworkSitesResult executeListNetworkSites(ListNetworkSitesRequest listNetworkSitesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworkSitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworkSitesRequest> request = null;
        Response<ListNetworkSitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworkSitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNetworkSitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworkSites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworkSitesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNetworkSitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists networks. Add filters to your request to return a more specific list of results. Use filters to match the
     * status of the network.
     * </p>
     * 
     * @param listNetworksRequest
     * @return Result of the ListNetworks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNetworksResult listNetworks(ListNetworksRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworks(request);
    }

    @SdkInternalApi
    final ListNetworksResult executeListNetworks(ListNetworksRequest listNetworksRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworksRequest> request = null;
        Response<ListNetworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNetworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNetworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists orders. Add filters to your request to return a more specific list of results. Use filters to match the
     * Amazon Resource Name (ARN) of the network site or the status of the order.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listOrdersRequest
     * @return Result of the ListOrders operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOrdersResult listOrders(ListOrdersRequest request) {
        request = beforeClientExecution(request);
        return executeListOrders(request);
    }

    @SdkInternalApi
    final ListOrdersResult executeListOrders(ListOrdersRequest listOrdersRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrdersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrdersRequest> request = null;
        Response<ListOrdersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrdersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOrdersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrdersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOrdersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSPrivate5G.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
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
     * Checks the health of the service.
     * </p>
     * 
     * @param pingRequest
     * @return Result of the Ping operation returned by the service.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.Ping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Ping" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PingResult ping(PingRequest request) {
        request = beforeClientExecution(request);
        return executePing(request);
    }

    @SdkInternalApi
    final PingResult executePing(PingRequest pingRequest) {

        ExecutionContext executionContext = createExecutionContext(pingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PingRequest> request = null;
        Response<PingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Ping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PingResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSPrivate5G.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
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
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSPrivate5G.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
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
     * Updates the specified network site.
     * </p>
     * 
     * @param updateNetworkSiteRequest
     * @return Result of the UpdateNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.UpdateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNetworkSiteResult updateNetworkSite(UpdateNetworkSiteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNetworkSite(request);
    }

    @SdkInternalApi
    final UpdateNetworkSiteResult executeUpdateNetworkSite(UpdateNetworkSiteRequest updateNetworkSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNetworkSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkSiteRequest> request = null;
        Response<UpdateNetworkSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNetworkSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNetworkSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNetworkSiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNetworkSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified network site plan.
     * </p>
     * 
     * @param updateNetworkSitePlanRequest
     * @return Result of the UpdateNetworkSitePlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.UpdateNetworkSitePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSitePlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNetworkSitePlanResult updateNetworkSitePlan(UpdateNetworkSitePlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNetworkSitePlan(request);
    }

    @SdkInternalApi
    final UpdateNetworkSitePlanResult executeUpdateNetworkSitePlan(UpdateNetworkSitePlanRequest updateNetworkSitePlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNetworkSitePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkSitePlanRequest> request = null;
        Response<UpdateNetworkSitePlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkSitePlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNetworkSitePlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "PrivateNetworks");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNetworkSitePlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNetworkSitePlanResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateNetworkSitePlanResultJsonUnmarshaller());
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

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
