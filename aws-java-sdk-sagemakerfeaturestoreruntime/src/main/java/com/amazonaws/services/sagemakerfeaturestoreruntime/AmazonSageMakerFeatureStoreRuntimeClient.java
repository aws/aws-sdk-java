/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakerfeaturestoreruntime;

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

import com.amazonaws.services.sagemakerfeaturestoreruntime.AmazonSageMakerFeatureStoreRuntimeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sagemakerfeaturestoreruntime.model.*;
import com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.*;

/**
 * Client for accessing Amazon SageMaker Feature Store Runtime. All service calls made using this client are blocking,
 * and will not return until the service call completes.
 * <p>
 * <p>
 * Contains all data plane API operations and data types for the Amazon SageMaker Feature Store. Use this API to put,
 * delete, and retrieve (get) features from a feature store.
 * </p>
 * <p>
 * Use the following operations to configure your <code>OnlineStore</code> and <code>OfflineStore</code> features, and
 * to create and manage feature groups:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateFeatureGroup.html">CreateFeatureGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_DeleteFeatureGroup.html">DeleteFeatureGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_DescribeFeatureGroup.html">DescribeFeatureGroup
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ListFeatureGroups.html">ListFeatureGroups</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerFeatureStoreRuntimeClient extends AmazonWebServiceClient implements AmazonSageMakerFeatureStoreRuntime {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSageMakerFeatureStoreRuntime.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sagemaker";

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
                            new JsonErrorShapeMetadata().withErrorCode("ValidationError").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.ValidationErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailable").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessForbidden").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.AccessForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailure").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.sagemakerfeaturestoreruntime.model.AmazonSageMakerFeatureStoreRuntimeException.class));

    public static AmazonSageMakerFeatureStoreRuntimeClientBuilder builder() {
        return AmazonSageMakerFeatureStoreRuntimeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SageMaker Feature Store Runtime using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerFeatureStoreRuntimeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SageMaker Feature Store Runtime using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerFeatureStoreRuntimeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("featurestore-runtime.sagemaker.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sagemakerfeaturestoreruntime/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sagemakerfeaturestoreruntime/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves a batch of <code>Records</code> from a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param batchGetRecordRequest
     * @return Result of the BatchGetRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.BatchGetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetRecordResult batchGetRecord(BatchGetRecordRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetRecord(request);
    }

    @SdkInternalApi
    final BatchGetRecordResult executeBatchGetRecord(BatchGetRecordRequest batchGetRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetRecordRequest> request = null;
        Response<BatchGetRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker FeatureStore Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetRecordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetRecordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <code>Record</code> from a <code>FeatureGroup</code>. A new record will show up in the
     * <code>OfflineStore</code> when the <code>DeleteRecord</code> API is called. This record will have a value of
     * <code>True</code> in the <code>is_deleted</code> column.
     * </p>
     * 
     * @param deleteRecordRequest
     * @return Result of the DeleteRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.DeleteRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/DeleteRecord"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRecordResult deleteRecord(DeleteRecordRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecord(request);
    }

    @SdkInternalApi
    final DeleteRecordResult executeDeleteRecord(DeleteRecordRequest deleteRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecordRequest> request = null;
        Response<DeleteRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker FeatureStore Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRecordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use for <code>OnlineStore</code> serving from a <code>FeatureStore</code>. Only the latest records stored in the
     * <code>OnlineStore</code> can be retrieved. If no Record with <code>RecordIdentifierValue</code> is found, then an
     * empty result is returned.
     * </p>
     * 
     * @param getRecordRequest
     * @return Result of the GetRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws ResourceNotFoundException
     *         A resource that is required to perform an action was not found.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.GetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/GetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecordResult getRecord(GetRecordRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecord(request);
    }

    @SdkInternalApi
    final GetRecordResult executeGetRecord(GetRecordRequest getRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecordRequest> request = null;
        Response<GetRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker FeatureStore Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecordResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRecordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used for data ingestion into the <code>FeatureStore</code>. The <code>PutRecord</code> API writes to both the
     * <code>OnlineStore</code> and <code>OfflineStore</code>. If the record is the latest record for the
     * <code>recordIdentifier</code>, the record is written to both the <code>OnlineStore</code> and
     * <code>OfflineStore</code>. If the record is a historic record, it is written only to the
     * <code>OfflineStore</code>.
     * </p>
     * 
     * @param putRecordRequest
     * @return Result of the PutRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/PutRecord"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRecordResult putRecord(PutRecordRequest request) {
        request = beforeClientExecution(request);
        return executePutRecord(request);
    }

    @SdkInternalApi
    final PutRecordResult executePutRecord(PutRecordRequest putRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(putRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordRequest> request = null;
        Response<PutRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker FeatureStore Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRecordResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRecordResultJsonUnmarshaller());
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
