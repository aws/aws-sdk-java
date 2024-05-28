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
package com.amazonaws.services.marketplacecatalog;

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

import com.amazonaws.services.marketplacecatalog.AWSMarketplaceCatalogClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.marketplacecatalog.model.*;

import com.amazonaws.services.marketplacecatalog.model.transform.*;

/**
 * Client for accessing AWS Marketplace Catalog. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Catalog API actions allow you to manage your entities through list, describe, and update capabilities. An entity can
 * be a product or an offer on AWS Marketplace.
 * </p>
 * <p>
 * You can automate your entity update process by integrating the AWS Marketplace Catalog API with your AWS Marketplace
 * product build or deployment pipelines. You can also create your own applications on top of the Catalog API to manage
 * your products on AWS Marketplace.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceCatalogClient extends AmazonWebServiceClient implements AWSMarketplaceCatalog {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMarketplaceCatalog.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "aws-marketplace";

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
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotSupportedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.ResourceNotSupportedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplacecatalog.model.transform.InternalServiceExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.marketplacecatalog.model.AWSMarketplaceCatalogException.class));

    public static AWSMarketplaceCatalogClientBuilder builder() {
        return AWSMarketplaceCatalogClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Catalog using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceCatalogClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Catalog using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceCatalogClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("catalog.marketplace.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/marketplacecatalog/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/marketplacecatalog/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns metadata and content for multiple entities. This is the Batch version of the <code>DescribeEntity</code>
     * API and uses the same IAM permission action as <code>DescribeEntity</code> API.
     * </p>
     * 
     * @param batchDescribeEntitiesRequest
     * @return Result of the BatchDescribeEntities operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied.</p>
     *         <p>
     *         HTTP status code: 403
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @sample AWSMarketplaceCatalog.BatchDescribeEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/BatchDescribeEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDescribeEntitiesResult batchDescribeEntities(BatchDescribeEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDescribeEntities(request);
    }

    @SdkInternalApi
    final BatchDescribeEntitiesResult executeBatchDescribeEntities(BatchDescribeEntitiesRequest batchDescribeEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDescribeEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDescribeEntitiesRequest> request = null;
        Response<BatchDescribeEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDescribeEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDescribeEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDescribeEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDescribeEntitiesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDescribeEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to cancel an open change request. Must be sent before the status of the request changes to
     * <code>APPLYING</code>, the final stage of completing your change request. You can describe a change during the
     * 60-day request history retention period for API calls.
     * </p>
     * 
     * @param cancelChangeSetRequest
     * @return Result of the CancelChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ResourceInUseException
     *         The resource is currently in use.
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.CancelChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/CancelChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelChangeSetResult cancelChangeSet(CancelChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeCancelChangeSet(request);
    }

    @SdkInternalApi
    final CancelChangeSetResult executeCancelChangeSet(CancelChangeSetRequest cancelChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelChangeSetRequest> request = null;
        Response<CancelChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resource-based policy on an entity that is identified by its resource ARN.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a given change set.
     * </p>
     * 
     * @param describeChangeSetRequest
     * @return Result of the DescribeChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChangeSet(request);
    }

    @SdkInternalApi
    final DescribeChangeSetResult executeDescribeChangeSet(DescribeChangeSetRequest describeChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChangeSetRequest> request = null;
        Response<DescribeChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata and content of the entity.
     * </p>
     * 
     * @param describeEntityRequest
     * @return Result of the DescribeEntity operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotSupportedException
     *         Currently, the specified resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.DescribeEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEntityResult describeEntity(DescribeEntityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEntity(request);
    }

    @SdkInternalApi
    final DescribeEntityResult executeDescribeEntity(DescribeEntityRequest describeEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntityRequest> request = null;
        Response<DescribeEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEntityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a resource-based policy of an entity that is identified by its resource ARN.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicy(request);
    }

    @SdkInternalApi
    final GetResourcePolicyResult executeGetResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of change sets owned by the account being used to make the call. You can filter this list by
     * providing any combination of <code>entityId</code>, <code>ChangeSetName</code>, and status. If you provide more
     * than one filter, the API operation applies a logical AND between the filters.
     * </p>
     * <p>
     * You can describe a change during the 60-day request history retention period for API calls.
     * </p>
     * 
     * @param listChangeSetsRequest
     * @return Result of the ListChangeSets operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListChangeSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListChangeSets(request);
    }

    @SdkInternalApi
    final ListChangeSetsResult executeListChangeSets(ListChangeSetsRequest listChangeSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChangeSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangeSetsRequest> request = null;
        Response<ListChangeSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChangeSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChangeSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChangeSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChangeSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChangeSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the list of entities of a given type.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return Result of the ListEntities operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEntitiesResult listEntities(ListEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListEntities(request);
    }

    @SdkInternalApi
    final ListEntitiesResult executeListEntities(ListEntitiesRequest listEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesRequest> request = null;
        Response<ListEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags that have been added to a resource (either an <a
     * href="https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#catalog-api-entities"
     * >entity</a> or <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets"
     * >change set</a>).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.</p>
     *         <p>
     *         HTTP status code: 404
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
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
     * Attaches a resource-based policy to an entity. Examples of an entity include: <code>AmiProduct</code> and
     * <code>ContainerProduct</code>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to request changes for your entities. Within a single <code>ChangeSet</code>, you can't start the same
     * change type against the same entity multiple times. Additionally, when a <code>ChangeSet</code> is running, all
     * the entities targeted by the different changes are locked until the change set has completed (either succeeded,
     * cancelled, or failed). If you try to start a change set containing a change against an entity that is already
     * locked, you will receive a <code>ResourceInUseException</code> error.
     * </p>
     * <p>
     * For example, you can't start the <code>ChangeSet</code> described in the <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/API_StartChangeSet.html#API_StartChangeSet_Examples"
     * >example</a> later in this topic because it contains two changes to run the same change type (
     * <code>AddRevisions</code>) against the same entity (<code>entity-id@1</code>).
     * </p>
     * <p>
     * For more information about working with change sets, see <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets">
     * Working with change sets</a>. For information about change types for single-AMI products, see <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/ami-products.html#working-with-single-AMI-products"
     * >Working with single-AMI products</a>. Also, for more information about change types available for
     * container-based products, see <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/container-products.html#working-with-container-products"
     * >Working with container products</a>.
     * </p>
     * 
     * @param startChangeSetRequest
     * @return Result of the StartChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ResourceInUseException
     *         The resource is currently in use.
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @throws ServiceQuotaExceededException
     *         The maximum number of open requests per account has been exceeded.
     * @sample AWSMarketplaceCatalog.StartChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartChangeSetResult startChangeSet(StartChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeStartChangeSet(request);
    }

    @SdkInternalApi
    final StartChangeSetResult executeStartChangeSet(StartChangeSetRequest startChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(startChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartChangeSetRequest> request = null;
        Response<StartChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a resource (either an <a
     * href="https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#catalog-api-entities"
     * >entity</a> or <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets"
     * >change set</a>).
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.</p>
     *         <p>
     *         HTTP status code: 404
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
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
     * Removes a tag or list of tags from a resource (either an <a
     * href="https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#catalog-api-entities"
     * >entity</a> or <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets"
     * >change set</a>).
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.</p>
     *         <p>
     *         HTTP status code: 404
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Catalog");
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
