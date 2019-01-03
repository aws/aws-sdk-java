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
package com.amazonaws.services.mediastoredata;

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

import com.amazonaws.services.mediastoredata.AWSMediaStoreDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediastoredata.model.*;
import com.amazonaws.services.mediastoredata.model.transform.*;

/**
 * Client for accessing MediaStore Data. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
 * fundamental entities that are stored in AWS Elemental MediaStore.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaStoreDataClient extends AmazonWebServiceClient implements AWSMediaStoreData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaStoreData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediastore";

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
                            new JsonErrorShapeMetadata().withErrorCode("RequestedRangeNotSatisfiableException").withModeledClass(
                                    com.amazonaws.services.mediastoredata.model.RequestedRangeNotSatisfiableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ObjectNotFoundException").withModeledClass(
                                    com.amazonaws.services.mediastoredata.model.ObjectNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.mediastoredata.model.InternalServerErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContainerNotFoundException").withModeledClass(
                                    com.amazonaws.services.mediastoredata.model.ContainerNotFoundException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediastoredata.model.AWSMediaStoreDataException.class));

    public static AWSMediaStoreDataClientBuilder builder() {
        return AWSMediaStoreDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaStore Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaStoreDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaStore Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaStoreDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("data.mediastore.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediastoredata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediastoredata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes an object at the specified path.
     * </p>
     * 
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws ObjectNotFoundException
     *         Could not perform an operation on an object that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteObjectResult deleteObject(DeleteObjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteObject(request);
    }

    @SdkInternalApi
    final DeleteObjectResult executeDeleteObject(DeleteObjectRequest deleteObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteObjectRequest> request = null;
        Response<DeleteObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the headers for an object at the specified path.
     * </p>
     * 
     * @param describeObjectRequest
     * @return Result of the DescribeObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws ObjectNotFoundException
     *         Could not perform an operation on an object that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.DescribeObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DescribeObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeObjectResult describeObject(DescribeObjectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeObject(request);
    }

    @SdkInternalApi
    final DescribeObjectResult executeDescribeObject(DescribeObjectRequest describeObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeObjectRequest> request = null;
        Response<DescribeObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Downloads the object at the specified path.
     * </p>
     * 
     * @param getObjectRequest
     * @return Result of the GetObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws ObjectNotFoundException
     *         Could not perform an operation on an object that does not exist.
     * @throws RequestedRangeNotSatisfiableException
     *         The requested content range is not valid.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.GetObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/GetObject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetObjectResult getObject(GetObjectRequest request) {
        request = beforeClientExecution(request);
        return executeGetObject(request);
    }

    @SdkInternalApi
    final GetObjectResult executeGetObject(GetObjectRequest getObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(getObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetObjectRequest> request = null;
        Response<GetObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetObjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of metadata entries about folders and objects in the specified folder.
     * </p>
     * 
     * @param listItemsRequest
     * @return Result of the ListItems operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.ListItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/ListItems" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListItemsResult listItems(ListItemsRequest request) {
        request = beforeClientExecution(request);
        return executeListItems(request);
    }

    @SdkInternalApi
    final ListItemsResult executeListItems(ListItemsRequest listItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(listItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListItemsRequest> request = null;
        Response<ListItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListItemsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads an object to the specified path. Object sizes are limited to 25 MB.
     * </p>
     * 
     * @param putObjectRequest
     * @return Result of the PutObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutObjectResult putObject(PutObjectRequest request) {
        request = beforeClientExecution(request);
        return executePutObject(request);
    }

    @SdkInternalApi
    final PutObjectResult executePutObject(PutObjectRequest putObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(putObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutObjectRequest> request = null;
        Response<PutObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaStore Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutObjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutObjectResultJsonUnmarshaller());
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
