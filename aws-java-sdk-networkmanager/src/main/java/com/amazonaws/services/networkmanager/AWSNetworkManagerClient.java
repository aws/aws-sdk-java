/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager;

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

import com.amazonaws.services.networkmanager.AWSNetworkManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.services.networkmanager.model.transform.*;

/**
 * Client for accessing NetworkManager. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Transit Gateway Network Manager (Network Manager) enables you to create a global network, in which you can monitor
 * your AWS and on-premises networks that are built around transit gateways.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSNetworkManagerClient extends AmazonWebServiceClient implements AWSNetworkManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSNetworkManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "networkmanager";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.networkmanager.model.AWSNetworkManagerException.class));

    public static AWSNetworkManagerClientBuilder builder() {
        return AWSNetworkManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on NetworkManager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSNetworkManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on NetworkManager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSNetworkManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("networkmanager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/networkmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/networkmanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be
     * associated with the specified device.
     * </p>
     * <p>
     * You can only associate customer gateways that are connected to a VPN attachment on a transit gateway. The transit
     * gateway must be registered in your global network. When you register a transit gateway, customer gateways that
     * are connected to the transit gateway are automatically included in the global network. To list customer gateways
     * that are connected to a transit gateway, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnConnections.html"
     * >DescribeVpnConnections</a> EC2 API and filter by <code>transit-gateway-id</code>.
     * </p>
     * <p>
     * You cannot associate a customer gateway with more than one device and link.
     * </p>
     * 
     * @param associateCustomerGatewayRequest
     * @return Result of the AssociateCustomerGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateCustomerGatewayResult associateCustomerGateway(AssociateCustomerGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateCustomerGateway(request);
    }

    @SdkInternalApi
    final AssociateCustomerGatewayResult executeAssociateCustomerGateway(AssociateCustomerGatewayRequest associateCustomerGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(associateCustomerGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCustomerGatewayRequest> request = null;
        Response<AssociateCustomerGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCustomerGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateCustomerGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateCustomerGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateCustomerGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateCustomerGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a link to a device. A device can be associated to multiple links and a link can be associated to
     * multiple devices. The device and link must be in the same global network and the same site.
     * </p>
     * 
     * @param associateLinkRequest
     * @return Result of the AssociateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateLink" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateLinkResult associateLink(AssociateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateLink(request);
    }

    @SdkInternalApi
    final AssociateLinkResult executeAssociateLink(AssociateLinkRequest associateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(associateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateLinkRequest> request = null;
        Response<AssociateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site
     * is used for visualization in the Network Manager console.
     * </p>
     * 
     * @param createDeviceRequest
     * @return Result of the CreateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDeviceResult createDevice(CreateDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDevice(request);
    }

    @SdkInternalApi
    final CreateDeviceResult executeCreateDevice(CreateDeviceRequest createDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeviceRequest> request = null;
        Response<CreateDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new, empty global network.
     * </p>
     * 
     * @param createGlobalNetworkRequest
     * @return Result of the CreateGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGlobalNetworkResult createGlobalNetwork(CreateGlobalNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlobalNetwork(request);
    }

    @SdkInternalApi
    final CreateGlobalNetworkResult executeCreateGlobalNetwork(CreateGlobalNetworkRequest createGlobalNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlobalNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalNetworkRequest> request = null;
        Response<CreateGlobalNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlobalNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGlobalNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGlobalNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGlobalNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGlobalNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new link for a specified site.
     * </p>
     * 
     * @param createLinkRequest
     * @return Result of the CreateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLinkResult createLink(CreateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLink(request);
    }

    @SdkInternalApi
    final CreateLinkResult executeCreateLink(CreateLinkRequest createLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(createLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLinkRequest> request = null;
        Response<CreateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new site in a global network.
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSiteResult createSite(CreateSiteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSite(request);
    }

    @SdkInternalApi
    final CreateSiteResult executeCreateSite(CreateSiteRequest createSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(createSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSiteRequest> request = null;
        Response<CreateSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeviceResult deleteDevice(DeleteDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevice(request);
    }

    @SdkInternalApi
    final DeleteDeviceResult executeDeleteDevice(DeleteDeviceRequest deleteDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceRequest> request = null;
        Response<DeleteDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites)
     * and deregister all transit gateways.
     * </p>
     * 
     * @param deleteGlobalNetworkRequest
     * @return Result of the DeleteGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGlobalNetworkResult deleteGlobalNetwork(DeleteGlobalNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGlobalNetwork(request);
    }

    @SdkInternalApi
    final DeleteGlobalNetworkResult executeDeleteGlobalNetwork(DeleteGlobalNetworkRequest deleteGlobalNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGlobalNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlobalNetworkRequest> request = null;
        Response<DeleteGlobalNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGlobalNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGlobalNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGlobalNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGlobalNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGlobalNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
     * </p>
     * 
     * @param deleteLinkRequest
     * @return Result of the DeleteLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLinkResult deleteLink(DeleteLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLink(request);
    }

    @SdkInternalApi
    final DeleteLinkResult executeDeleteLink(DeleteLinkRequest deleteLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLinkRequest> request = null;
        Response<DeleteLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing site. The site cannot be associated with any device or link.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSiteResult deleteSite(DeleteSiteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSite(request);
    }

    @SdkInternalApi
    final DeleteSiteResult executeDeleteSite(DeleteSiteRequest deleteSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSiteRequest> request = null;
        Response<DeleteSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or
     * modify any of its attachments. This action removes any customer gateway associations.
     * </p>
     * 
     * @param deregisterTransitGatewayRequest
     * @return Result of the DeregisterTransitGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeregisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeregisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterTransitGatewayResult deregisterTransitGateway(DeregisterTransitGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTransitGateway(request);
    }

    @SdkInternalApi
    final DeregisterTransitGatewayResult executeDeregisterTransitGateway(DeregisterTransitGatewayRequest deregisterTransitGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTransitGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTransitGatewayRequest> request = null;
        Response<DeregisterTransitGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTransitGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterTransitGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTransitGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterTransitGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterTransitGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more global networks. By default, all global networks are described. To describe the objects in
     * your global network, you must use the appropriate <code>Get*</code> action. For example, to list the transit
     * gateways in your global network, use <a>GetTransitGatewayRegistrations</a>.
     * </p>
     * 
     * @param describeGlobalNetworksRequest
     * @return Result of the DescribeGlobalNetworks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DescribeGlobalNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGlobalNetworksResult describeGlobalNetworks(DescribeGlobalNetworksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGlobalNetworks(request);
    }

    @SdkInternalApi
    final DescribeGlobalNetworksResult executeDescribeGlobalNetworks(DescribeGlobalNetworksRequest describeGlobalNetworksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGlobalNetworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalNetworksRequest> request = null;
        Response<DescribeGlobalNetworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGlobalNetworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGlobalNetworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGlobalNetworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGlobalNetworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGlobalNetworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a customer gateway from a device and a link.
     * </p>
     * 
     * @param disassociateCustomerGatewayRequest
     * @return Result of the DisassociateCustomerGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateCustomerGatewayResult disassociateCustomerGateway(DisassociateCustomerGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateCustomerGateway(request);
    }

    @SdkInternalApi
    final DisassociateCustomerGatewayResult executeDisassociateCustomerGateway(DisassociateCustomerGatewayRequest disassociateCustomerGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateCustomerGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCustomerGatewayRequest> request = null;
        Response<DisassociateCustomerGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCustomerGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateCustomerGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateCustomerGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateCustomerGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateCustomerGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an existing device from a link. You must first disassociate any customer gateways that are
     * associated with the link.
     * </p>
     * 
     * @param disassociateLinkRequest
     * @return Result of the DisassociateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateLink"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateLinkResult disassociateLink(DisassociateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateLink(request);
    }

    @SdkInternalApi
    final DisassociateLinkResult executeDisassociateLink(DisassociateLinkRequest disassociateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateLinkRequest> request = null;
        Response<DisassociateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the association information for customer gateways that are associated with devices and links in your global
     * network.
     * </p>
     * 
     * @param getCustomerGatewayAssociationsRequest
     * @return Result of the GetCustomerGatewayAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCustomerGatewayAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCustomerGatewayAssociationsResult getCustomerGatewayAssociations(GetCustomerGatewayAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCustomerGatewayAssociations(request);
    }

    @SdkInternalApi
    final GetCustomerGatewayAssociationsResult executeGetCustomerGatewayAssociations(GetCustomerGatewayAssociationsRequest getCustomerGatewayAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCustomerGatewayAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomerGatewayAssociationsRequest> request = null;
        Response<GetCustomerGatewayAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomerGatewayAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCustomerGatewayAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCustomerGatewayAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCustomerGatewayAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCustomerGatewayAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more of your devices in a global network.
     * </p>
     * 
     * @param getDevicesRequest
     * @return Result of the GetDevices operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDevicesResult getDevices(GetDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevices(request);
    }

    @SdkInternalApi
    final GetDevicesResult executeGetDevices(GetDevicesRequest getDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicesRequest> request = null;
        Response<GetDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
     * </p>
     * 
     * @param getLinkAssociationsRequest
     * @return Result of the GetLinkAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetLinkAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinkAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLinkAssociationsResult getLinkAssociations(GetLinkAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLinkAssociations(request);
    }

    @SdkInternalApi
    final GetLinkAssociationsResult executeGetLinkAssociations(GetLinkAssociationsRequest getLinkAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLinkAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLinkAssociationsRequest> request = null;
        Response<GetLinkAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLinkAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLinkAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLinkAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLinkAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLinkAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more links in a specified global network.
     * </p>
     * <p>
     * If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type
     * and provider in the same request.
     * </p>
     * 
     * @param getLinksRequest
     * @return Result of the GetLinks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLinksResult getLinks(GetLinksRequest request) {
        request = beforeClientExecution(request);
        return executeGetLinks(request);
    }

    @SdkInternalApi
    final GetLinksResult executeGetLinks(GetLinksRequest getLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(getLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLinksRequest> request = null;
        Response<GetLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLinksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more of your sites in a global network.
     * </p>
     * 
     * @param getSitesRequest
     * @return Result of the GetSites operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSites" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSitesResult getSites(GetSitesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSites(request);
    }

    @SdkInternalApi
    final GetSitesResult executeGetSites(GetSitesRequest getSitesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSitesRequest> request = null;
        Response<GetSitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSitesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the transit gateway registrations in a specified global network.
     * </p>
     * 
     * @param getTransitGatewayRegistrationsRequest
     * @return Result of the GetTransitGatewayRegistrations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTransitGatewayRegistrationsResult getTransitGatewayRegistrations(GetTransitGatewayRegistrationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransitGatewayRegistrations(request);
    }

    @SdkInternalApi
    final GetTransitGatewayRegistrationsResult executeGetTransitGatewayRegistrations(GetTransitGatewayRegistrationsRequest getTransitGatewayRegistrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransitGatewayRegistrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransitGatewayRegistrationsRequest> request = null;
        Response<GetTransitGatewayRegistrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransitGatewayRegistrationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTransitGatewayRegistrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransitGatewayRegistrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransitGatewayRegistrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTransitGatewayRegistrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
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
     * Registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be
     * owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than
     * one global network.
     * </p>
     * 
     * @param registerTransitGatewayRequest
     * @return Result of the RegisterTransitGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.RegisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterTransitGatewayResult registerTransitGateway(RegisterTransitGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTransitGateway(request);
    }

    @SdkInternalApi
    final RegisterTransitGatewayResult executeRegisterTransitGateway(RegisterTransitGatewayRequest registerTransitGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTransitGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTransitGatewayRequest> request = null;
        Response<RegisterTransitGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTransitGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerTransitGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTransitGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterTransitGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterTransitGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
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
     * Removes tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
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
     * Updates the details for an existing device. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDeviceResult updateDevice(UpdateDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevice(request);
    }

    @SdkInternalApi
    final UpdateDeviceResult executeUpdateDevice(UpdateDeviceRequest updateDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceRequest> request = null;
        Response<UpdateDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
     * </p>
     * 
     * @param updateGlobalNetworkRequest
     * @return Result of the UpdateGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGlobalNetworkResult updateGlobalNetwork(UpdateGlobalNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalNetwork(request);
    }

    @SdkInternalApi
    final UpdateGlobalNetworkResult executeUpdateGlobalNetwork(UpdateGlobalNetworkRequest updateGlobalNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalNetworkRequest> request = null;
        Response<UpdateGlobalNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlobalNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details for an existing link. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateLinkRequest
     * @return Result of the UpdateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLinkResult updateLink(UpdateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLink(request);
    }

    @SdkInternalApi
    final UpdateLinkResult executeUpdateLink(UpdateLinkRequest updateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLinkRequest> request = null;
        Response<UpdateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the information for an existing site. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSiteResult updateSite(UpdateSiteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSite(request);
    }

    @SdkInternalApi
    final UpdateSiteResult executeUpdateSite(UpdateSiteRequest updateSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSiteRequest> request = null;
        Response<UpdateSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSiteResultJsonUnmarshaller());
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
