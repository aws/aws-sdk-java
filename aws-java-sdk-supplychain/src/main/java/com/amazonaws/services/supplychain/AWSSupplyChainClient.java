/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.supplychain;

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

import com.amazonaws.services.supplychain.AWSSupplyChainClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.supplychain.model.*;

import com.amazonaws.services.supplychain.model.transform.*;

/**
 * Client for accessing AWS Supply Chain. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Supply Chain is a cloud-based application that works with your enterprise resource planning (ERP) and supply
 * chain management systems. Using AWS Supply Chain, you can connect and extract your inventory, supply, and demand
 * related data from existing ERP or supply chain systems into a single data model.
 * </p>
 * <p>
 * The AWS Supply Chain API supports configuration data import for Supply Planning.
 * </p>
 * <p>
 * All AWS Supply chain API operations are Amazon-authenticated and certificate-signed. They not only require the use of
 * the AWS SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help
 * facilitate access, trust, and permission policies.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSupplyChainClient extends AmazonWebServiceClient implements AWSSupplyChain {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSupplyChain.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "scn";

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
                                    com.amazonaws.services.supplychain.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supplychain.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supplychain.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supplychain.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supplychain.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supplychain.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supplychain.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.supplychain.model.AWSSupplyChainException.class));

    public static AWSSupplyChainClientBuilder builder() {
        return AWSSupplyChainClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Supply Chain using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSupplyChainClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Supply Chain using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSupplyChainClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("scn.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/supplychain/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/supplychain/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * CreateBillOfMaterialsImportJob creates an import job for the Product Bill Of Materials (BOM) entity. For
     * information on the product_bom entity, see the AWS Supply Chain User Guide.
     * </p>
     * <p>
     * The CSV file must be located in an Amazon S3 location accessible to AWS Supply Chain. It is recommended to use
     * the same Amazon S3 bucket created during your AWS Supply Chain instance creation.
     * </p>
     * 
     * @param createBillOfMaterialsImportJobRequest
     *        The request parameters for CreateBillOfMaterialsImportJob.
     * @return Result of the CreateBillOfMaterialsImportJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You do not have the required privileges to perform this action.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @sample AWSSupplyChain.CreateBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/CreateBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBillOfMaterialsImportJobResult createBillOfMaterialsImportJob(CreateBillOfMaterialsImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBillOfMaterialsImportJob(request);
    }

    @SdkInternalApi
    final CreateBillOfMaterialsImportJobResult executeCreateBillOfMaterialsImportJob(CreateBillOfMaterialsImportJobRequest createBillOfMaterialsImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createBillOfMaterialsImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBillOfMaterialsImportJobRequest> request = null;
        Response<CreateBillOfMaterialsImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBillOfMaterialsImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createBillOfMaterialsImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SupplyChain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBillOfMaterialsImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBillOfMaterialsImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateBillOfMaterialsImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get status and details of a BillOfMaterialsImportJob.
     * </p>
     * 
     * @param getBillOfMaterialsImportJobRequest
     *        The request parameters for GetBillOfMaterialsImportJob.
     * @return Result of the GetBillOfMaterialsImportJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have the required privileges to perform this action.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @sample AWSSupplyChain.GetBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/GetBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBillOfMaterialsImportJobResult getBillOfMaterialsImportJob(GetBillOfMaterialsImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetBillOfMaterialsImportJob(request);
    }

    @SdkInternalApi
    final GetBillOfMaterialsImportJobResult executeGetBillOfMaterialsImportJob(GetBillOfMaterialsImportJobRequest getBillOfMaterialsImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getBillOfMaterialsImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBillOfMaterialsImportJobRequest> request = null;
        Response<GetBillOfMaterialsImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBillOfMaterialsImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBillOfMaterialsImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SupplyChain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBillOfMaterialsImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBillOfMaterialsImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBillOfMaterialsImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Send transactional data events with real-time data for analysis or monitoring.
     * </p>
     * 
     * @param sendDataIntegrationEventRequest
     *        The request parameters for SendDataIntegrationEvent.
     * @return Result of the SendDataIntegrationEvent operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have the required privileges to perform this action.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @sample AWSSupplyChain.SendDataIntegrationEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/SendDataIntegrationEvent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendDataIntegrationEventResult sendDataIntegrationEvent(SendDataIntegrationEventRequest request) {
        request = beforeClientExecution(request);
        return executeSendDataIntegrationEvent(request);
    }

    @SdkInternalApi
    final SendDataIntegrationEventResult executeSendDataIntegrationEvent(SendDataIntegrationEventRequest sendDataIntegrationEventRequest) {

        ExecutionContext executionContext = createExecutionContext(sendDataIntegrationEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendDataIntegrationEventRequest> request = null;
        Response<SendDataIntegrationEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendDataIntegrationEventRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendDataIntegrationEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SupplyChain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendDataIntegrationEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendDataIntegrationEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendDataIntegrationEventResultJsonUnmarshaller());
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
