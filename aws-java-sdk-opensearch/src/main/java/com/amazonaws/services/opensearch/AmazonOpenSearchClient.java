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
package com.amazonaws.services.opensearch;

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

import com.amazonaws.services.opensearch.AmazonOpenSearchClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.services.opensearch.model.transform.*;

/**
 * Client for accessing Amazon OpenSearch Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Use the Amazon OpenSearch Service configuration API to create, configure, and manage OpenSearch Service domains. The
 * endpoint for configuration service requests is Region specific: es.<i>region</i>.amazonaws.com. For example,
 * es.us-east-1.amazonaws.com. For a current list of supported Regions and endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#service-regions">Amazon Web Services service
 * endpoints</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchClient extends AmazonWebServiceClient implements AmazonOpenSearch {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonOpenSearch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "es";

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
                            new JsonErrorShapeMetadata().withErrorCode("DisabledOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.DisabledOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SlotNotAvailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.SlotNotAvailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.DependencyFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.InvalidTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BaseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.BaseExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.opensearch.model.AmazonOpenSearchException.class));

    public static AmazonOpenSearchClientBuilder builder() {
        return AmazonOpenSearchClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon OpenSearch Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOpenSearchClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon OpenSearch Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOpenSearchClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("es.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/opensearch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/opensearch/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Allows the destination Amazon OpenSearch Service domain owner to accept an inbound cross-cluster search
     * connection request. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param acceptInboundConnectionRequest
     *        Container for the parameters to the <code>AcceptInboundConnection</code> operation.
     * @return Result of the AcceptInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.AcceptInboundConnection
     */
    @Override
    public AcceptInboundConnectionResult acceptInboundConnection(AcceptInboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptInboundConnection(request);
    }

    @SdkInternalApi
    final AcceptInboundConnectionResult executeAcceptInboundConnection(AcceptInboundConnectionRequest acceptInboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptInboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInboundConnectionRequest> request = null;
        Response<AcceptInboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptInboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptInboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptInboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptInboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new direct-query data source to the specified domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/direct-query-s3-creating.html"
     * >Creating Amazon OpenSearch Service data source integrations with Amazon S3</a>.
     * </p>
     * 
     * @param addDataSourceRequest
     *        Container for the parameters to the <code>AddDataSource</code> operation.
     * @return Result of the AddDataSource operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws DependencyFailureException
     *         An exception for when a failure in one of the dependencies results in the service being unable to fetch
     *         details about the resource.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @sample AmazonOpenSearch.AddDataSource
     */
    @Override
    public AddDataSourceResult addDataSource(AddDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddDataSource(request);
    }

    @SdkInternalApi
    final AddDataSourceResult executeAddDataSource(AddDataSourceRequest addDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddDataSourceRequest> request = null;
        Response<AddDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches tags to an existing Amazon OpenSearch Service domain. Tags are a set of case-sensitive key-value pairs.
     * A domain can have up to 10 tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-awsresourcetagging.html"
     * >Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code>AddTags</code> operation. Specifies the tags to attach to the
     *        domain.
     * @return Result of the AddTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.AddTags
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code>AssociatePackage</code> operation.
     * @return Result of the AssociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use.
     * @sample AmazonOpenSearch.AssociatePackage
     */
    @Override
    public AssociatePackageResult associatePackage(AssociatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePackage(request);
    }

    @SdkInternalApi
    final AssociatePackageResult executeAssociatePackage(AssociatePackageRequest associatePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePackageRequest> request = null;
        Response<AssociatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associatePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param authorizeVpcEndpointAccessRequest
     * @return Result of the AuthorizeVpcEndpointAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.AuthorizeVpcEndpointAccess
     */
    @Override
    public AuthorizeVpcEndpointAccessResult authorizeVpcEndpointAccess(AuthorizeVpcEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeAuthorizeVpcEndpointAccess(request);
    }

    @SdkInternalApi
    final AuthorizeVpcEndpointAccessResult executeAuthorizeVpcEndpointAccess(AuthorizeVpcEndpointAccessRequest authorizeVpcEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(authorizeVpcEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeVpcEndpointAccessRequest> request = null;
        Response<AuthorizeVpcEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeVpcEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(authorizeVpcEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AuthorizeVpcEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AuthorizeVpcEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AuthorizeVpcEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a pending configuration change on an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param cancelDomainConfigChangeRequest
     * @return Result of the CancelDomainConfigChange operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.CancelDomainConfigChange
     */
    @Override
    public CancelDomainConfigChangeResult cancelDomainConfigChange(CancelDomainConfigChangeRequest request) {
        request = beforeClientExecution(request);
        return executeCancelDomainConfigChange(request);
    }

    @SdkInternalApi
    final CancelDomainConfigChangeResult executeCancelDomainConfigChange(CancelDomainConfigChangeRequest cancelDomainConfigChangeRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelDomainConfigChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDomainConfigChangeRequest> request = null;
        Response<CancelDomainConfigChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDomainConfigChangeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelDomainConfigChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelDomainConfigChange");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelDomainConfigChangeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelDomainConfigChangeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this
     * operation before the <code>AutomatedUpdateDate</code> and when the domain's <code>UpdateStatus</code> is
     * <code>PENDING_UPDATE</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">Service
     * software updates in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param cancelServiceSoftwareUpdateRequest
     *        Container for the request parameters to cancel a service software update.
     * @return Result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.CancelServiceSoftwareUpdate
     */
    @Override
    public CancelServiceSoftwareUpdateResult cancelServiceSoftwareUpdate(CancelServiceSoftwareUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeCancelServiceSoftwareUpdate(request);
    }

    @SdkInternalApi
    final CancelServiceSoftwareUpdateResult executeCancelServiceSoftwareUpdate(CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelServiceSoftwareUpdateRequest> request = null;
        Response<CancelServiceSoftwareUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelServiceSoftwareUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelServiceSoftwareUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelServiceSoftwareUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelServiceSoftwareUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelServiceSoftwareUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws InvalidTypeException
     *         An exception for trying to create or access a sub-resource that's either invalid or not supported.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.CreateDomain
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cross-cluster search connection from a source Amazon OpenSearch Service domain to a destination
     * domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param createOutboundConnectionRequest
     *        Container for the parameters to the <code>CreateOutboundConnection</code> operation.
     * @return Result of the CreateOutboundConnection operation returned by the service.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.CreateOutboundConnection
     */
    @Override
    public CreateOutboundConnectionResult createOutboundConnection(CreateOutboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOutboundConnection(request);
    }

    @SdkInternalApi
    final CreateOutboundConnectionResult executeCreateOutboundConnection(CreateOutboundConnectionRequest createOutboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createOutboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOutboundConnectionRequest> request = null;
        Response<CreateOutboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOutboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createOutboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOutboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOutboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateOutboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code>CreatePackage</code> operation.
     * @return Result of the CreatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws InvalidTypeException
     *         An exception for trying to create or access a sub-resource that's either invalid or not supported.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.CreatePackage
     */
    @Override
    public CreatePackageResult createPackage(CreatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePackage(request);
    }

    @SdkInternalApi
    final CreatePackageResult executeCreatePackage(CreatePackageRequest createPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(createPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackageRequest> request = null;
        Response<CreatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon OpenSearch Service-managed VPC endpoint.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @return Result of the CreateVpcEndpoint operation returned by the service.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.CreateVpcEndpoint
     */
    @Override
    public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVpcEndpoint(request);
    }

    @SdkInternalApi
    final CreateVpcEndpointResult executeCreateVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcEndpointRequest> request = null;
        Response<CreateVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVpcEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a direct-query data source. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/direct-query-s3-delete.html">Deleting
     * an Amazon OpenSearch Service data source with Amazon S3</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     *        Container for the parameters to the <code>DeleteDataSource</code> operation.
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws DependencyFailureException
     *         An exception for when a failure in one of the dependencies results in the service being unable to fetch
     *         details about the resource.
     * @sample AmazonOpenSearch.DeleteDataSource
     */
    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSource(request);
    }

    @SdkInternalApi
    final DeleteDataSourceResult executeDeleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service domain and all of its data. You can't recover a domain after you delete it.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code>DeleteDomain</code> operation.
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DeleteDomain
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the destination Amazon OpenSearch Service domain owner to delete an existing inbound cross-cluster search
     * connection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param deleteInboundConnectionRequest
     *        Container for the parameters to the <code>DeleteInboundConnection</code> operation.
     * @return Result of the DeleteInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DeleteInboundConnection
     */
    @Override
    public DeleteInboundConnectionResult deleteInboundConnection(DeleteInboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInboundConnection(request);
    }

    @SdkInternalApi
    final DeleteInboundConnectionResult executeDeleteInboundConnection(DeleteInboundConnectionRequest deleteInboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInboundConnectionRequest> request = null;
        Response<DeleteInboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the source Amazon OpenSearch Service domain owner to delete an existing outbound cross-cluster search
     * connection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param deleteOutboundConnectionRequest
     *        Container for the parameters to the <code>DeleteOutboundConnection</code> operation.
     * @return Result of the DeleteOutboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DeleteOutboundConnection
     */
    @Override
    public DeleteOutboundConnectionResult deleteOutboundConnection(DeleteOutboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOutboundConnection(request);
    }

    @SdkInternalApi
    final DeleteOutboundConnectionResult executeDeleteOutboundConnection(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOutboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOutboundConnectionRequest> request = null;
        Response<DeleteOutboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOutboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOutboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOutboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOutboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteOutboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service package. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param deletePackageRequest
     *        Deletes a package from OpenSearch Service. The package can't be associated with any OpenSearch Service
     *        domain.
     * @return Result of the DeletePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use.
     * @sample AmazonOpenSearch.DeletePackage
     */
    @Override
    public DeletePackageResult deletePackage(DeletePackageRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePackage(request);
    }

    @SdkInternalApi
    final DeletePackageResult executeDeletePackage(DeletePackageRequest deletePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackageRequest> request = null;
        Response<DeletePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @return Result of the DeleteVpcEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.DeleteVpcEndpoint
     */
    @Override
    public DeleteVpcEndpointResult deleteVpcEndpoint(DeleteVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVpcEndpoint(request);
    }

    @SdkInternalApi
    final DeleteVpcEndpointResult executeDeleteVpcEndpoint(DeleteVpcEndpointRequest deleteVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcEndpointRequest> request = null;
        Response<DeleteVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVpcEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the domain configuration for the specified Amazon OpenSearch Service domain, including the domain ID,
     * domain service endpoint, and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code>DescribeDomain</code> operation.
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribeDomain
     */
    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomain(request);
    }

    @SdkInternalApi
    final DescribeDomainResult executeDescribeDomain(DescribeDomainRequest describeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of optimizations that Auto-Tune has made to an Amazon OpenSearch Service domain. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
     * OpenSearch Service</a>.
     * </p>
     * 
     * @param describeDomainAutoTunesRequest
     *        Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
     * @return Result of the DescribeDomainAutoTunes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribeDomainAutoTunes
     */
    @Override
    public DescribeDomainAutoTunesResult describeDomainAutoTunes(DescribeDomainAutoTunesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainAutoTunes(request);
    }

    @SdkInternalApi
    final DescribeDomainAutoTunesResult executeDescribeDomainAutoTunes(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainAutoTunesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainAutoTunesRequest> request = null;
        Response<DescribeDomainAutoTunesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainAutoTunesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDomainAutoTunesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainAutoTunes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainAutoTunesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDomainAutoTunesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the current blue/green deployment happening on an Amazon OpenSearch Service domain. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-configuration-changes.html"
     * >Making configuration changes in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeDomainChangeProgressRequest
     *        Container for the parameters to the <code>DescribeDomainChangeProgress</code> operation.
     * @return Result of the DescribeDomainChangeProgress operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribeDomainChangeProgress
     */
    @Override
    public DescribeDomainChangeProgressResult describeDomainChangeProgress(DescribeDomainChangeProgressRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainChangeProgress(request);
    }

    @SdkInternalApi
    final DescribeDomainChangeProgressResult executeDescribeDomainChangeProgress(DescribeDomainChangeProgressRequest describeDomainChangeProgressRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainChangeProgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainChangeProgressRequest> request = null;
        Response<DescribeDomainChangeProgressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainChangeProgressRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDomainChangeProgressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainChangeProgress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainChangeProgressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDomainChangeProgressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the configuration of an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation.
     * @return Result of the DescribeDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribeDomainConfig
     */
    @Override
    public DescribeDomainConfigResult describeDomainConfig(DescribeDomainConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainConfig(request);
    }

    @SdkInternalApi
    final DescribeDomainConfigResult executeDescribeDomainConfig(DescribeDomainConfigRequest describeDomainConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainConfigRequest> request = null;
        Response<DescribeDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about domain and node health, the standby Availability Zone, number of nodes per Availability
     * Zone, and shard count per node.
     * </p>
     * 
     * @param describeDomainHealthRequest
     *        Container for the parameters to the <code>DescribeDomainHealth</code> operation.
     * @return Result of the DescribeDomainHealth operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DescribeDomainHealth
     */
    @Override
    public DescribeDomainHealthResult describeDomainHealth(DescribeDomainHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainHealth(request);
    }

    @SdkInternalApi
    final DescribeDomainHealthResult executeDescribeDomainHealth(DescribeDomainHealthRequest describeDomainHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainHealthRequest> request = null;
        Response<DescribeDomainHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainHealthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainHealthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about domain and nodes, including data nodes, master nodes, ultrawarm nodes, Availability
     * Zone(s), standby nodes, node configurations, and node states.
     * </p>
     * 
     * @param describeDomainNodesRequest
     *        Container for the parameters to the <code>DescribeDomainNodes</code> operation.
     * @return Result of the DescribeDomainNodes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws DependencyFailureException
     *         An exception for when a failure in one of the dependencies results in the service being unable to fetch
     *         details about the resource.
     * @sample AmazonOpenSearch.DescribeDomainNodes
     */
    @Override
    public DescribeDomainNodesResult describeDomainNodes(DescribeDomainNodesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainNodes(request);
    }

    @SdkInternalApi
    final DescribeDomainNodesResult executeDescribeDomainNodes(DescribeDomainNodesRequest describeDomainNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainNodesRequest> request = null;
        Response<DescribeDomainNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainNodesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns domain configuration information about the specified Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code>DescribeDomains</code> operation.
     * @return Result of the DescribeDomains operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribeDomains
     */
    @Override
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomains(request);
    }

    @SdkInternalApi
    final DescribeDomainsResult executeDescribeDomains(DescribeDomainsRequest describeDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainsRequest> request = null;
        Response<DescribeDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the progress of a pre-update dry run analysis on an Amazon OpenSearch Service domain. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-configuration-changes#dryrun"
     * >Determining whether a change will cause a blue/green deployment</a>.
     * </p>
     * 
     * @param describeDryRunProgressRequest
     * @return Result of the DescribeDryRunProgress operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DescribeDryRunProgress
     */
    @Override
    public DescribeDryRunProgressResult describeDryRunProgress(DescribeDryRunProgressRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDryRunProgress(request);
    }

    @SdkInternalApi
    final DescribeDryRunProgressResult executeDescribeDryRunProgress(DescribeDryRunProgressRequest describeDryRunProgressRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDryRunProgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDryRunProgressRequest> request = null;
        Response<DescribeDryRunProgressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDryRunProgressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDryRunProgressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDryRunProgress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDryRunProgressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDryRunProgressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the inbound cross-cluster search connections for a destination (remote) Amazon OpenSearch Service
     * domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeInboundConnectionsRequest
     *        Container for the parameters to the <code>DescribeInboundConnections</code> operation.
     * @return Result of the DescribeInboundConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         Request processing failed because you provided an invalid pagination token.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DescribeInboundConnections
     */
    @Override
    public DescribeInboundConnectionsResult describeInboundConnections(DescribeInboundConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInboundConnections(request);
    }

    @SdkInternalApi
    final DescribeInboundConnectionsResult executeDescribeInboundConnections(DescribeInboundConnectionsRequest describeInboundConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInboundConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInboundConnectionsRequest> request = null;
        Response<DescribeInboundConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInboundConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInboundConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInboundConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInboundConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInboundConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the instance count, storage, and master node limits for a given OpenSearch or Elasticsearch version and
     * instance type.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code>DescribeInstanceTypeLimits</code> operation.
     * @return Result of the DescribeInstanceTypeLimits operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws InvalidTypeException
     *         An exception for trying to create or access a sub-resource that's either invalid or not supported.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribeInstanceTypeLimits
     */
    @Override
    public DescribeInstanceTypeLimitsResult describeInstanceTypeLimits(DescribeInstanceTypeLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceTypeLimits(request);
    }

    @SdkInternalApi
    final DescribeInstanceTypeLimitsResult executeDescribeInstanceTypeLimits(DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceTypeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceTypeLimitsRequest> request = null;
        Response<DescribeInstanceTypeLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceTypeLimitsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceTypeLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceTypeLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceTypeLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceTypeLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the outbound cross-cluster connections for a local (source) Amazon OpenSearch Service domain. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeOutboundConnectionsRequest
     *        Container for the parameters to the <code>DescribeOutboundConnections</code> operation.
     * @return Result of the DescribeOutboundConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         Request processing failed because you provided an invalid pagination token.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DescribeOutboundConnections
     */
    @Override
    public DescribeOutboundConnectionsResult describeOutboundConnections(DescribeOutboundConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOutboundConnections(request);
    }

    @SdkInternalApi
    final DescribeOutboundConnectionsResult executeDescribeOutboundConnections(DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOutboundConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOutboundConnectionsRequest> request = null;
        Response<DescribeOutboundConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOutboundConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOutboundConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOutboundConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOutboundConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOutboundConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes all packages available to OpenSearch Service. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code>DescribePackage</code> operation.
     * @return Result of the DescribePackages operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.DescribePackages
     */
    @Override
    public DescribePackagesResult describePackages(DescribePackagesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackages(request);
    }

    @SdkInternalApi
    final DescribePackagesResult executeDescribePackages(DescribePackagesRequest describePackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackagesRequest> request = null;
        Response<DescribePackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available Amazon OpenSearch Service Reserved Instance offerings for a given Region. For more
     * information, see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved
     * Instances in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for the request parameters to a <code>DescribeReservedInstanceOfferings</code> operation.
     * @return Result of the DescribeReservedInstanceOfferings operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.DescribeReservedInstanceOfferings
     */
    @Override
    public DescribeReservedInstanceOfferingsResult describeReservedInstanceOfferings(DescribeReservedInstanceOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedInstanceOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedInstanceOfferingsResult executeDescribeReservedInstanceOfferings(
            DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedInstanceOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstanceOfferingsRequest> request = null;
        Response<DescribeReservedInstanceOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstanceOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedInstanceOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedInstanceOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedInstanceOfferingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReservedInstanceOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the Amazon OpenSearch Service instances that you have reserved in a given Region. For more information,
     * see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved Instances in
     * Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for the request parameters to the <code>DescribeReservedInstances</code> operation.
     * @return Result of the DescribeReservedInstances operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.DescribeReservedInstances
     */
    @Override
    public DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedInstances(request);
    }

    @SdkInternalApi
    final DescribeReservedInstancesResult executeDescribeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstancesRequest> request = null;
        Response<DescribeReservedInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReservedInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more Amazon OpenSearch Service-managed VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     * @return Result of the DescribeVpcEndpoints operation returned by the service.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.DescribeVpcEndpoints
     */
    @Override
    public DescribeVpcEndpointsResult describeVpcEndpoints(DescribeVpcEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVpcEndpoints(request);
    }

    @SdkInternalApi
    final DescribeVpcEndpointsResult executeDescribeVpcEndpoints(DescribeVpcEndpointsRequest describeVpcEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVpcEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpcEndpointsRequest> request = null;
        Response<DescribeVpcEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpcEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVpcEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVpcEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVpcEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVpcEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a package from the specified Amazon OpenSearch Service domain. The package can't be in use with any
     * OpenSearch index for the dissociation to succeed. The package is still available in OpenSearch Service for
     * association later. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param dissociatePackageRequest
     *        Container for the request parameters to the <code>DissociatePackage</code> operation.
     * @return Result of the DissociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use.
     * @sample AmazonOpenSearch.DissociatePackage
     */
    @Override
    public DissociatePackageResult dissociatePackage(DissociatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeDissociatePackage(request);
    }

    @SdkInternalApi
    final DissociatePackageResult executeDissociatePackage(DissociatePackageRequest dissociatePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(dissociatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DissociatePackageRequest> request = null;
        Response<DissociatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DissociatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(dissociatePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DissociatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DissociatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DissociatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code>GetCompatibleVersions</code> operation.
     * @return Result of the GetCompatibleVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.GetCompatibleVersions
     */
    @Override
    public GetCompatibleVersionsResult getCompatibleVersions(GetCompatibleVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCompatibleVersions(request);
    }

    @SdkInternalApi
    final GetCompatibleVersionsResult executeGetCompatibleVersions(GetCompatibleVersionsRequest getCompatibleVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCompatibleVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCompatibleVersionsRequest> request = null;
        Response<GetCompatibleVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCompatibleVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCompatibleVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCompatibleVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCompatibleVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetCompatibleVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a direct query data source.
     * </p>
     * 
     * @param getDataSourceRequest
     *        Container for the parameters to the <code>GetDataSource</code> operation.
     * @return Result of the GetDataSource operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws DependencyFailureException
     *         An exception for when a failure in one of the dependencies results in the service being unable to fetch
     *         details about the resource.
     * @sample AmazonOpenSearch.GetDataSource
     */
    @Override
    public GetDataSourceResult getDataSource(GetDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSource(request);
    }

    @SdkInternalApi
    final GetDataSourceResult executeGetDataSource(GetDataSourceRequest getDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSourceRequest> request = null;
        Response<GetDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The status of the maintenance action.
     * </p>
     * 
     * @param getDomainMaintenanceStatusRequest
     *        Container for the parameters to the <code>GetDomainMaintenanceStatus</code> operation.
     * @return Result of the GetDomainMaintenanceStatus operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.GetDomainMaintenanceStatus
     */
    @Override
    public GetDomainMaintenanceStatusResult getDomainMaintenanceStatus(GetDomainMaintenanceStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainMaintenanceStatus(request);
    }

    @SdkInternalApi
    final GetDomainMaintenanceStatusResult executeGetDomainMaintenanceStatus(GetDomainMaintenanceStatusRequest getDomainMaintenanceStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainMaintenanceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainMaintenanceStatusRequest> request = null;
        Response<GetDomainMaintenanceStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainMaintenanceStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDomainMaintenanceStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainMaintenanceStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainMaintenanceStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDomainMaintenanceStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Amazon OpenSearch Service package versions, along with their creation time, commit message, and
     * plugin properties (if the package is a zip plugin package). For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param getPackageVersionHistoryRequest
     *        Container for the request parameters to the <code>GetPackageVersionHistory</code> operation.
     * @return Result of the GetPackageVersionHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.GetPackageVersionHistory
     */
    @Override
    public GetPackageVersionHistoryResult getPackageVersionHistory(GetPackageVersionHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetPackageVersionHistory(request);
    }

    @SdkInternalApi
    final GetPackageVersionHistoryResult executeGetPackageVersionHistory(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getPackageVersionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPackageVersionHistoryRequest> request = null;
        Response<GetPackageVersionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPackageVersionHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPackageVersionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPackageVersionHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPackageVersionHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPackageVersionHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code>GetUpgradeHistory</code> operation.
     * @return Result of the GetUpgradeHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.GetUpgradeHistory
     */
    @Override
    public GetUpgradeHistoryResult getUpgradeHistory(GetUpgradeHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetUpgradeHistory(request);
    }

    @SdkInternalApi
    final GetUpgradeHistoryResult executeGetUpgradeHistory(GetUpgradeHistoryRequest getUpgradeHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getUpgradeHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUpgradeHistoryRequest> request = null;
        Response<GetUpgradeHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUpgradeHistoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUpgradeHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUpgradeHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUpgradeHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUpgradeHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the most recent status of the last upgrade or upgrade eligibility check performed on an Amazon OpenSearch
     * Service domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code>GetUpgradeStatus</code> operation.
     * @return Result of the GetUpgradeStatus operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.GetUpgradeStatus
     */
    @Override
    public GetUpgradeStatusResult getUpgradeStatus(GetUpgradeStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetUpgradeStatus(request);
    }

    @SdkInternalApi
    final GetUpgradeStatusResult executeGetUpgradeStatus(GetUpgradeStatusRequest getUpgradeStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getUpgradeStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUpgradeStatusRequest> request = null;
        Response<GetUpgradeStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUpgradeStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUpgradeStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUpgradeStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUpgradeStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUpgradeStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists direct-query data sources for a specific domain. For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/direct-query-s3.html">Working with
     * Amazon OpenSearch Service direct queries with Amazon S3</a>.
     * </p>
     * 
     * @param listDataSourcesRequest
     *        Container for the parameters to the <code>ListDataSources</code> operation.
     * @return Result of the ListDataSources operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws DependencyFailureException
     *         An exception for when a failure in one of the dependencies results in the service being unable to fetch
     *         details about the resource.
     * @sample AmazonOpenSearch.ListDataSources
     */
    @Override
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSources(request);
    }

    @SdkInternalApi
    final ListDataSourcesResult executeListDataSources(ListDataSourcesRequest listDataSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourcesRequest> request = null;
        Response<ListDataSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of maintenance actions for the domain.
     * </p>
     * 
     * @param listDomainMaintenancesRequest
     *        Container for the parameters to the <code>ListDomainMaintenances</code> operation.
     * @return Result of the ListDomainMaintenances operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.ListDomainMaintenances
     */
    @Override
    public ListDomainMaintenancesResult listDomainMaintenances(ListDomainMaintenancesRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainMaintenances(request);
    }

    @SdkInternalApi
    final ListDomainMaintenancesResult executeListDomainMaintenances(ListDomainMaintenancesRequest listDomainMaintenancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainMaintenancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainMaintenancesRequest> request = null;
        Response<ListDomainMaintenancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainMaintenancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainMaintenancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainMaintenances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainMaintenancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDomainMaintenancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the names of all Amazon OpenSearch Service domains owned by the current user in the active Region.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code>ListDomainNames</code> operation.
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.ListDomainNames
     */
    @Override
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainNames(request);
    }

    @SdkInternalApi
    final ListDomainNamesResult executeListDomainNames(ListDomainNamesRequest listDomainNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainNamesRequest> request = null;
        Response<ListDomainNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainNamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with a given package. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code>ListDomainsForPackage</code> operation.
     * @return Result of the ListDomainsForPackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.ListDomainsForPackage
     */
    @Override
    public ListDomainsForPackageResult listDomainsForPackage(ListDomainsForPackageRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainsForPackage(request);
    }

    @SdkInternalApi
    final ListDomainsForPackageResult executeListDomainsForPackage(ListDomainsForPackageRequest listDomainsForPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsForPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsForPackageRequest> request = null;
        Response<ListDomainsForPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsForPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsForPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainsForPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsForPackageResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDomainsForPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
     * </p>
     * 
     * @param listInstanceTypeDetailsRequest
     * @return Result of the ListInstanceTypeDetails operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.ListInstanceTypeDetails
     */
    @Override
    public ListInstanceTypeDetailsResult listInstanceTypeDetails(ListInstanceTypeDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceTypeDetails(request);
    }

    @SdkInternalApi
    final ListInstanceTypeDetailsResult executeListInstanceTypeDetails(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceTypeDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceTypeDetailsRequest> request = null;
        Response<ListInstanceTypeDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceTypeDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInstanceTypeDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceTypeDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceTypeDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInstanceTypeDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all packages associated with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code>ListPackagesForDomain</code> operation.
     * @return Result of the ListPackagesForDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.ListPackagesForDomain
     */
    @Override
    public ListPackagesForDomainResult listPackagesForDomain(ListPackagesForDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListPackagesForDomain(request);
    }

    @SdkInternalApi
    final ListPackagesForDomainResult executeListPackagesForDomain(ListPackagesForDomainRequest listPackagesForDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackagesForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagesForDomainRequest> request = null;
        Response<ListPackagesForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagesForDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackagesForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackagesForDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackagesForDomainResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPackagesForDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of configuration changes that are scheduled for a domain. These changes can be <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">service
     * software updates</a> or <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html#auto-tune-types"
     * >blue/green Auto-Tune enhancements</a>.
     * </p>
     * 
     * @param listScheduledActionsRequest
     * @return Result of the ListScheduledActions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InvalidPaginationTokenException
     *         Request processing failed because you provided an invalid pagination token.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.ListScheduledActions
     */
    @Override
    public ListScheduledActionsResult listScheduledActions(ListScheduledActionsRequest request) {
        request = beforeClientExecution(request);
        return executeListScheduledActions(request);
    }

    @SdkInternalApi
    final ListScheduledActionsResult executeListScheduledActions(ListScheduledActionsRequest listScheduledActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listScheduledActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScheduledActionsRequest> request = null;
        Response<ListScheduledActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScheduledActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScheduledActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScheduledActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScheduledActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScheduledActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all resource tags for an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-awsresourcetagging.html"
     * >Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code>ListTags</code> operation.
     * @return Result of the ListTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.ListTags
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all versions of OpenSearch and Elasticsearch that Amazon OpenSearch Service supports.
     * </p>
     * 
     * @param listVersionsRequest
     *        Container for the request parameters to the <code>ListVersions</code> operation.
     * @return Result of the ListVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.ListVersions
     */
    @Override
    public ListVersionsResult listVersions(ListVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListVersions(request);
    }

    @SdkInternalApi
    final ListVersionsResult executeListVersions(ListVersionsRequest listVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVersionsRequest> request = null;
        Response<ListVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about each Amazon Web Services principal that is allowed to access a given Amazon
     * OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param listVpcEndpointAccessRequest
     * @return Result of the ListVpcEndpointAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.ListVpcEndpointAccess
     */
    @Override
    public ListVpcEndpointAccessResult listVpcEndpointAccess(ListVpcEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeListVpcEndpointAccess(request);
    }

    @SdkInternalApi
    final ListVpcEndpointAccessResult executeListVpcEndpointAccess(ListVpcEndpointAccessRequest listVpcEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(listVpcEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVpcEndpointAccessRequest> request = null;
        Response<ListVpcEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVpcEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVpcEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVpcEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVpcEndpointAccessResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListVpcEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current Amazon Web Services account and
     * Region.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @return Result of the ListVpcEndpoints operation returned by the service.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.ListVpcEndpoints
     */
    @Override
    public ListVpcEndpointsResult listVpcEndpoints(ListVpcEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListVpcEndpoints(request);
    }

    @SdkInternalApi
    final ListVpcEndpointsResult executeListVpcEndpoints(ListVpcEndpointsRequest listVpcEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVpcEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVpcEndpointsRequest> request = null;
        Response<ListVpcEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVpcEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVpcEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVpcEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVpcEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVpcEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints associated with a particular domain.
     * </p>
     * 
     * @param listVpcEndpointsForDomainRequest
     * @return Result of the ListVpcEndpointsForDomain operation returned by the service.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.ListVpcEndpointsForDomain
     */
    @Override
    public ListVpcEndpointsForDomainResult listVpcEndpointsForDomain(ListVpcEndpointsForDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListVpcEndpointsForDomain(request);
    }

    @SdkInternalApi
    final ListVpcEndpointsForDomainResult executeListVpcEndpointsForDomain(ListVpcEndpointsForDomainRequest listVpcEndpointsForDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listVpcEndpointsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVpcEndpointsForDomainRequest> request = null;
        Response<ListVpcEndpointsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVpcEndpointsForDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVpcEndpointsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVpcEndpointsForDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVpcEndpointsForDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVpcEndpointsForDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to purchase Amazon OpenSearch Service Reserved Instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for request parameters to the <code>PurchaseReservedInstanceOffering</code> operation.
     * @return Result of the PurchaseReservedInstanceOffering operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.PurchaseReservedInstanceOffering
     */
    @Override
    public PurchaseReservedInstanceOfferingResult purchaseReservedInstanceOffering(PurchaseReservedInstanceOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedInstanceOffering(request);
    }

    @SdkInternalApi
    final PurchaseReservedInstanceOfferingResult executePurchaseReservedInstanceOffering(
            PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedInstanceOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedInstanceOfferingRequest> request = null;
        Response<PurchaseReservedInstanceOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedInstanceOfferingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(purchaseReservedInstanceOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedInstanceOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseReservedInstanceOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PurchaseReservedInstanceOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the remote Amazon OpenSearch Service domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the request parameters to the <code>RejectInboundConnection</code> operation.
     * @return Result of the RejectInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.RejectInboundConnection
     */
    @Override
    public RejectInboundConnectionResult rejectInboundConnection(RejectInboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeRejectInboundConnection(request);
    }

    @SdkInternalApi
    final RejectInboundConnectionResult executeRejectInboundConnection(RejectInboundConnectionRequest rejectInboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectInboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectInboundConnectionRequest> request = null;
        Response<RejectInboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectInboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectInboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectInboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectInboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectInboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified set of tags from an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-awsresorcetagging"
     * > Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the request parameters to the <code>RemoveTags</code> operation.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.RemoveTags
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTags(request);
    }

    @SdkInternalApi
    final RemoveTagsResult executeRemoveTags(RemoveTagsRequest removeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes access to an Amazon OpenSearch Service domain that was provided through an interface VPC endpoint.
     * </p>
     * 
     * @param revokeVpcEndpointAccessRequest
     * @return Result of the RevokeVpcEndpointAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.RevokeVpcEndpointAccess
     */
    @Override
    public RevokeVpcEndpointAccessResult revokeVpcEndpointAccess(RevokeVpcEndpointAccessRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeVpcEndpointAccess(request);
    }

    @SdkInternalApi
    final RevokeVpcEndpointAccessResult executeRevokeVpcEndpointAccess(RevokeVpcEndpointAccessRequest revokeVpcEndpointAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeVpcEndpointAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeVpcEndpointAccessRequest> request = null;
        Response<RevokeVpcEndpointAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeVpcEndpointAccessRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(revokeVpcEndpointAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeVpcEndpointAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeVpcEndpointAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RevokeVpcEndpointAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the node maintenance process on the data node. These processes can include a node reboot, an Opensearch or
     * Elasticsearch process restart, or a Dashboard or Kibana restart.
     * </p>
     * 
     * @param startDomainMaintenanceRequest
     *        Container for the parameters to the <code>StartDomainMaintenance</code> operation.
     * @return Result of the StartDomainMaintenance operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @sample AmazonOpenSearch.StartDomainMaintenance
     */
    @Override
    public StartDomainMaintenanceResult startDomainMaintenance(StartDomainMaintenanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartDomainMaintenance(request);
    }

    @SdkInternalApi
    final StartDomainMaintenanceResult executeStartDomainMaintenance(StartDomainMaintenanceRequest startDomainMaintenanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startDomainMaintenanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDomainMaintenanceRequest> request = null;
        Response<StartDomainMaintenanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDomainMaintenanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDomainMaintenanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDomainMaintenance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDomainMaintenanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDomainMaintenanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">Service
     * software updates in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the request parameters to the <code>StartServiceSoftwareUpdate</code> operation.
     * @return Result of the StartServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.StartServiceSoftwareUpdate
     */
    @Override
    public StartServiceSoftwareUpdateResult startServiceSoftwareUpdate(StartServiceSoftwareUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeStartServiceSoftwareUpdate(request);
    }

    @SdkInternalApi
    final StartServiceSoftwareUpdateResult executeStartServiceSoftwareUpdate(StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(startServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartServiceSoftwareUpdateRequest> request = null;
        Response<StartServiceSoftwareUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartServiceSoftwareUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startServiceSoftwareUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartServiceSoftwareUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartServiceSoftwareUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartServiceSoftwareUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a direct-query data source. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/direct-query-s3-creating.html">Working
     * with Amazon OpenSearch Service data source integrations with Amazon S3</a>.
     * </p>
     * 
     * @param updateDataSourceRequest
     *        Container for the parameters to the <code>UpdateDataSource</code> operation.
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws DependencyFailureException
     *         An exception for when a failure in one of the dependencies results in the service being unable to fetch
     *         details about the resource.
     * @sample AmazonOpenSearch.UpdateDataSource
     */
    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSource(request);
    }

    @SdkInternalApi
    final UpdateDataSourceResult executeUpdateDataSource(UpdateDataSourceRequest updateDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the cluster configuration of the specified Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the request parameters to the <code>UpdateDomain</code> operation.
     * @return Result of the UpdateDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws InvalidTypeException
     *         An exception for trying to create or access a sub-resource that's either invalid or not supported.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.UpdateDomainConfig
     */
    @Override
    public UpdateDomainConfigResult updateDomainConfig(UpdateDomainConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainConfig(request);
    }

    @SdkInternalApi
    final UpdateDomainConfigResult executeUpdateDomainConfig(UpdateDomainConfigRequest updateDomainConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainConfigRequest> request = null;
        Response<UpdateDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code>UpdatePackage</code> operation.
     * @return Result of the UpdatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws AccessDeniedException
     *         An error occurred because you don't have permissions to access the resource.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.UpdatePackage
     */
    @Override
    public UpdatePackageResult updatePackage(UpdatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePackage(request);
    }

    @SdkInternalApi
    final UpdatePackageResult executeUpdatePackage(UpdatePackageRequest updatePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePackageRequest> request = null;
        Response<UpdatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reschedules a planned domain configuration change for a later time. This change can be a scheduled <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">service
     * software update</a> or a <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html#auto-tune-types"
     * >blue/green Auto-Tune enhancement</a>.
     * </p>
     * 
     * @param updateScheduledActionRequest
     * @return Result of the UpdateScheduledAction operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws SlotNotAvailableException
     *         An exception for attempting to schedule a domain action during an unavailable time slot.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use.
     * @throws LimitExceededException
     *         An exception for trying to create more than the allowed number of resources or sub-resources.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @sample AmazonOpenSearch.UpdateScheduledAction
     */
    @Override
    public UpdateScheduledActionResult updateScheduledAction(UpdateScheduledActionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScheduledAction(request);
    }

    @SdkInternalApi
    final UpdateScheduledActionResult executeUpdateScheduledAction(UpdateScheduledActionRequest updateScheduledActionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScheduledActionRequest> request = null;
        Response<UpdateScheduledActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScheduledActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScheduledActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScheduledAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScheduledActionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateScheduledActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @return Result of the UpdateVpcEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.UpdateVpcEndpoint
     */
    @Override
    public UpdateVpcEndpointResult updateVpcEndpoint(UpdateVpcEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVpcEndpoint(request);
    }

    @SdkInternalApi
    final UpdateVpcEndpointResult executeUpdateVpcEndpoint(UpdateVpcEndpointRequest updateVpcEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVpcEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVpcEndpointRequest> request = null;
        Response<UpdateVpcEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVpcEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVpcEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVpcEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVpcEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVpcEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to either upgrade your Amazon OpenSearch Service domain or perform an upgrade eligibility check to a
     * compatible version of OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to the <code>UpgradeDomain</code> operation.
     * @return Result of the UpgradeDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access an unsupported operation.
     * @throws ValidationException
     *         An exception for accessing or deleting a resource that doesn't exist.
     * @throws InternalException
     *         Request processing failed because of an unknown error, exception, or internal failure.
     * @sample AmazonOpenSearch.UpgradeDomain
     */
    @Override
    public UpgradeDomainResult upgradeDomain(UpgradeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeDomain(request);
    }

    @SdkInternalApi
    final UpgradeDomainResult executeUpgradeDomain(UpgradeDomainRequest upgradeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeDomainRequest> request = null;
        Response<UpgradeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(upgradeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpgradeDomainResultJsonUnmarshaller());
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
