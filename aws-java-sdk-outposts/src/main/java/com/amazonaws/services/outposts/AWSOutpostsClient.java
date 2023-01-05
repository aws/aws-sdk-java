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
package com.amazonaws.services.outposts;

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

import com.amazonaws.services.outposts.AWSOutpostsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.services.outposts.model.transform.*;

/**
 * Client for accessing Outposts. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon Web Services Outposts is a fully managed service that extends Amazon Web Services infrastructure, APIs, and
 * tools to customer premises. By providing local access to Amazon Web Services managed infrastructure, Amazon Web
 * Services Outposts enables customers to build and run applications on premises using the same programming interfaces
 * as in Amazon Web Services Regions, while using local compute and storage resources for lower latency and local data
 * processing needs.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOutpostsClient extends AmazonWebServiceClient implements AWSOutposts {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOutposts.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "outposts";

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.outposts.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.outposts.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.outposts.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.outposts.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.outposts.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.outposts.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.outposts.model.AWSOutpostsException.class));

    public static AWSOutpostsClientBuilder builder() {
        return AWSOutpostsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Outposts using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOutpostsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Outposts using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOutpostsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("outposts.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/outposts/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/outposts/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels the specified order for an Outpost.
     * </p>
     * 
     * @param cancelOrderRequest
     * @return Result of the CancelOrder operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.CancelOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CancelOrder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelOrderResult cancelOrder(CancelOrderRequest request) {
        request = beforeClientExecution(request);
        return executeCancelOrder(request);
    }

    @SdkInternalApi
    final CancelOrderResult executeCancelOrder(CancelOrderRequest cancelOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelOrderRequest> request = null;
        Response<CancelOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelOrderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an order for an Outpost.
     * </p>
     * 
     * @param createOrderRequest
     * @return Result of the CreateOrder operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOrder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateOrderResult createOrder(CreateOrderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOrder(request);
    }

    @SdkInternalApi
    final CreateOrderResult executeCreateOrder(CreateOrderRequest createOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(createOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrderRequest> request = null;
        Response<CreateOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOrderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * <p>
     * You can specify either an Availability one or an AZ ID.
     * </p>
     * 
     * @param createOutpostRequest
     * @return Result of the CreateOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateOutpostResult createOutpost(CreateOutpostRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOutpost(request);
    }

    @SdkInternalApi
    final CreateOutpostResult executeCreateOutpost(CreateOutpostRequest createOutpostRequest) {

        ExecutionContext executionContext = createExecutionContext(createOutpostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOutpostRequest> request = null;
        Response<CreateOutpostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOutpostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOutpostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOutpost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOutpostResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOutpostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a site for an Outpost.
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateSite" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * Deletes the specified Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @return Result of the DeleteOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteOutpostResult deleteOutpost(DeleteOutpostRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOutpost(request);
    }

    @SdkInternalApi
    final DeleteOutpostResult executeDeleteOutpost(DeleteOutpostRequest deleteOutpostRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOutpostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOutpostRequest> request = null;
        Response<DeleteOutpostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOutpostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOutpostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOutpost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOutpostResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOutpostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * Gets information about the specified catalog item.
     * </p>
     * 
     * @param getCatalogItemRequest
     * @return Result of the GetCatalogItem operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetCatalogItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCatalogItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCatalogItemResult getCatalogItem(GetCatalogItemRequest request) {
        request = beforeClientExecution(request);
        return executeGetCatalogItem(request);
    }

    @SdkInternalApi
    final GetCatalogItemResult executeGetCatalogItem(GetCatalogItemRequest getCatalogItemRequest) {

        ExecutionContext executionContext = createExecutionContext(getCatalogItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCatalogItemRequest> request = null;
        Response<GetCatalogItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCatalogItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCatalogItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCatalogItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCatalogItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCatalogItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * Amazon Web Services uses this action to install Outpost servers.
     * </p>
     * </note>
     * <p>
     * Gets information about the specified connection.
     * </p>
     * <p>
     * Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to
     * secure it. For more information, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/security-iam-awsmanpol.html"> Amazon Web Services
     * managed policies for Amazon Web Services Outposts</a> and <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/logging-using-cloudtrail.html"> Logging Amazon Web
     * Services Outposts API calls with Amazon Web Services CloudTrail</a> in the <i>Amazon Web Services Outposts User
     * Guide</i>.
     * </p>
     * 
     * @param getConnectionRequest
     * @return Result of the GetConnection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetConnectionResult getConnection(GetConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnection(request);
    }

    @SdkInternalApi
    final GetConnectionResult executeGetConnection(GetConnectionRequest getConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionRequest> request = null;
        Response<GetConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @return Result of the GetOrder operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOrder" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @return Result of the GetOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOutpostResult getOutpost(GetOutpostRequest request) {
        request = beforeClientExecution(request);
        return executeGetOutpost(request);
    }

    @SdkInternalApi
    final GetOutpostResult executeGetOutpost(GetOutpostRequest getOutpostRequest) {

        ExecutionContext executionContext = createExecutionContext(getOutpostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOutpostRequest> request = null;
        Response<GetOutpostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOutpostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOutpostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOutpost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOutpostResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOutpostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @return Result of the GetOutpostInstanceTypes operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOutpostInstanceTypesResult getOutpostInstanceTypes(GetOutpostInstanceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetOutpostInstanceTypes(request);
    }

    @SdkInternalApi
    final GetOutpostInstanceTypesResult executeGetOutpostInstanceTypes(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getOutpostInstanceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOutpostInstanceTypesRequest> request = null;
        Response<GetOutpostInstanceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOutpostInstanceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOutpostInstanceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOutpostInstanceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOutpostInstanceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOutpostInstanceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified Outpost site.
     * </p>
     * 
     * @param getSiteRequest
     * @return Result of the GetSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSiteResult getSite(GetSiteRequest request) {
        request = beforeClientExecution(request);
        return executeGetSite(request);
    }

    @SdkInternalApi
    final GetSiteResult executeGetSite(GetSiteRequest getSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(getSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSiteRequest> request = null;
        Response<GetSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the site address of the specified site.
     * </p>
     * 
     * @param getSiteAddressRequest
     * @return Result of the GetSiteAddress operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSiteAddressResult getSiteAddress(GetSiteAddressRequest request) {
        request = beforeClientExecution(request);
        return executeGetSiteAddress(request);
    }

    @SdkInternalApi
    final GetSiteAddressResult executeGetSiteAddress(GetSiteAddressRequest getSiteAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(getSiteAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSiteAddressRequest> request = null;
        Response<GetSiteAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSiteAddressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSiteAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSiteAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSiteAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSiteAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the hardware assets for the specified Outpost.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listAssetsRequest
     * @return Result of the ListAssets operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAssetsResult listAssets(ListAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssets(request);
    }

    @SdkInternalApi
    final ListAssetsResult executeListAssets(ListAssetsRequest listAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetsRequest> request = null;
        Response<ListAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the items in the catalog.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listCatalogItemsRequest
     * @return Result of the ListCatalogItems operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListCatalogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCatalogItems" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCatalogItemsResult listCatalogItems(ListCatalogItemsRequest request) {
        request = beforeClientExecution(request);
        return executeListCatalogItems(request);
    }

    @SdkInternalApi
    final ListCatalogItemsResult executeListCatalogItems(ListCatalogItemsRequest listCatalogItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCatalogItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCatalogItemsRequest> request = null;
        Response<ListCatalogItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCatalogItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCatalogItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCatalogItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCatalogItemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCatalogItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Outpost orders for your Amazon Web Services account.
     * </p>
     * 
     * @param listOrdersRequest
     * @return Result of the ListOrders operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOrders" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * Lists the Outposts for your Amazon Web Services account.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listOutpostsRequest
     * @return Result of the ListOutposts operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOutpostsResult listOutposts(ListOutpostsRequest request) {
        request = beforeClientExecution(request);
        return executeListOutposts(request);
    }

    @SdkInternalApi
    final ListOutpostsResult executeListOutposts(ListOutpostsRequest listOutpostsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOutpostsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOutpostsRequest> request = null;
        Response<ListOutpostsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOutpostsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOutpostsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOutposts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOutpostsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOutpostsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Outpost sites for your Amazon Web Services account. Use filters to return specific results.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listSitesRequest
     * @return Result of the ListSites operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSitesResult listSites(ListSitesRequest request) {
        request = beforeClientExecution(request);
        return executeListSites(request);
    }

    @SdkInternalApi
    final ListSitesResult executeListSites(ListSitesRequest listSitesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSitesRequest> request = null;
        Response<ListSitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSitesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSitesResultJsonUnmarshaller());
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
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @sample AWSOutposts.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * <note>
     * <p>
     * Amazon Web Services uses this action to install Outpost servers.
     * </p>
     * </note>
     * <p>
     * Starts the connection required for Outpost server installation.
     * </p>
     * <p>
     * Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to
     * secure it. For more information, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/security-iam-awsmanpol.html"> Amazon Web Services
     * managed policies for Amazon Web Services Outposts</a> and <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/logging-using-cloudtrail.html"> Logging Amazon Web
     * Services Outposts API calls with Amazon Web Services CloudTrail</a> in the <i>Amazon Web Services Outposts User
     * Guide</i>.
     * </p>
     * 
     * @param startConnectionRequest
     * @return Result of the StartConnection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.StartConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartConnectionResult startConnection(StartConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeStartConnection(request);
    }

    @SdkInternalApi
    final StartConnectionResult executeStartConnection(StartConnectionRequest startConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(startConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConnectionRequest> request = null;
        Response<StartConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartConnectionResultJsonUnmarshaller());
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
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @sample AWSOutposts.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @sample AWSOutposts.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * Updates an Outpost.
     * </p>
     * 
     * @param updateOutpostRequest
     * @return Result of the UpdateOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateOutpostResult updateOutpost(UpdateOutpostRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOutpost(request);
    }

    @SdkInternalApi
    final UpdateOutpostResult executeUpdateOutpost(UpdateOutpostRequest updateOutpostRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOutpostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOutpostRequest> request = null;
        Response<UpdateOutpostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOutpostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateOutpostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOutpost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOutpostResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateOutpostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified site.
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSite" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
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
     * <p>
     * Updates the address of the specified site.
     * </p>
     * <p>
     * You can't update a site address if there is an order in progress. You must wait for the order to complete or
     * cancel the order.
     * </p>
     * <p>
     * You can update the operating address before you place an order at the site, or after all Outposts that belong to
     * the site have been deactivated.
     * </p>
     * 
     * @param updateSiteAddressRequest
     * @return Result of the UpdateSiteAddress operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSiteAddressResult updateSiteAddress(UpdateSiteAddressRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSiteAddress(request);
    }

    @SdkInternalApi
    final UpdateSiteAddressResult executeUpdateSiteAddress(UpdateSiteAddressRequest updateSiteAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSiteAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSiteAddressRequest> request = null;
        Response<UpdateSiteAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSiteAddressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSiteAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSiteAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSiteAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSiteAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the physical and logistical details for a rack at a site. For more information about hardware requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     * readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <p>
     * To update a rack at a site with an order of <code>IN_PROGRESS</code>, you must wait for the order to complete or
     * cancel the order.
     * </p>
     * 
     * @param updateSiteRackPhysicalPropertiesRequest
     * @return Result of the UpdateSiteRackPhysicalProperties operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateSiteRackPhysicalProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteRackPhysicalProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSiteRackPhysicalPropertiesResult updateSiteRackPhysicalProperties(UpdateSiteRackPhysicalPropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSiteRackPhysicalProperties(request);
    }

    @SdkInternalApi
    final UpdateSiteRackPhysicalPropertiesResult executeUpdateSiteRackPhysicalProperties(
            UpdateSiteRackPhysicalPropertiesRequest updateSiteRackPhysicalPropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSiteRackPhysicalPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSiteRackPhysicalPropertiesRequest> request = null;
        Response<UpdateSiteRackPhysicalPropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSiteRackPhysicalPropertiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSiteRackPhysicalPropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Outposts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSiteRackPhysicalProperties");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSiteRackPhysicalPropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSiteRackPhysicalPropertiesResultJsonUnmarshaller());
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
