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
package com.amazonaws.services.elasticsearch;

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

import com.amazonaws.services.elasticsearch.AWSElasticsearchClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.services.elasticsearch.model.transform.*;

/**
 * Client for accessing Amazon Elasticsearch Service. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <fullname>Amazon Elasticsearch Configuration Service</fullname>
 * <p>
 * Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.
 * </p>
 * <p>
 * For sample code that uses the Configuration API, see the <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html">Amazon
 * Elasticsearch Service Developer Guide</a>. The guide also contains <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html">sample code
 * for sending signed HTTP requests to the Elasticsearch APIs</a>.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example,
 * es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions" target="_blank">Regions
 * and Endpoints</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSElasticsearchClient extends AmazonWebServiceClient implements AWSElasticsearch {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSElasticsearch.class);

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
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DisabledOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.DisabledOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.InvalidTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BaseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.BaseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.elasticsearch.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.elasticsearch.model.AWSElasticsearchException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSElasticsearchClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSElasticsearchClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Elasticsearch Service (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSElasticsearchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticsearchClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSElasticsearchClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSElasticsearchClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSElasticsearchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Elasticsearch Service (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSElasticsearchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticsearchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSElasticsearchClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSElasticsearchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Elasticsearch Service (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSElasticsearchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticsearchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Elasticsearch Service (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSElasticsearchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticsearchClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSElasticsearchClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSElasticsearchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSElasticsearchClientBuilder builder() {
        return AWSElasticsearchClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSElasticsearchClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elasticsearch Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSElasticsearchClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://es.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticsearch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticsearch/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Allows the destination domain owner to accept an inbound cross-cluster search connection request.
     * </p>
     * 
     * @param acceptInboundCrossClusterSearchConnectionRequest
     *        Container for the parameters to the <code><a>AcceptInboundCrossClusterSearchConnection</a></code>
     *        operation.
     * @return Result of the AcceptInboundCrossClusterSearchConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.AcceptInboundCrossClusterSearchConnection
     */
    @Override
    public AcceptInboundCrossClusterSearchConnectionResult acceptInboundCrossClusterSearchConnection(AcceptInboundCrossClusterSearchConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptInboundCrossClusterSearchConnection(request);
    }

    @SdkInternalApi
    final AcceptInboundCrossClusterSearchConnectionResult executeAcceptInboundCrossClusterSearchConnection(
            AcceptInboundCrossClusterSearchConnectionRequest acceptInboundCrossClusterSearchConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptInboundCrossClusterSearchConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInboundCrossClusterSearchConnectionRequest> request = null;
        Response<AcceptInboundCrossClusterSearchConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInboundCrossClusterSearchConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptInboundCrossClusterSearchConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptInboundCrossClusterSearchConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptInboundCrossClusterSearchConnectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AcceptInboundCrossClusterSearchConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An
     * Elasticsearch domain may have up to 10 tags. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more information.</a>
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want
     *        to attach to the Elasticsearch domain.
     * @return Result of the AddTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.AddTags
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Associates a package with an Amazon ES domain.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for request parameters to <code> <a>AssociatePackage</a> </code> operation.
     * @return Result of the AssociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AWSElasticsearch.AssociatePackage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before
     * the <code>AutomatedUpdateDate</code> and when the <code>UpdateStatus</code> is in the <code>PENDING_UPDATE</code>
     * state.
     * </p>
     * 
     * @param cancelElasticsearchServiceSoftwareUpdateRequest
     *        Container for the parameters to the <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code>
     *        operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software
     *        update on.
     * @return Result of the CancelElasticsearchServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.CancelElasticsearchServiceSoftwareUpdate
     */
    @Override
    public CancelElasticsearchServiceSoftwareUpdateResult cancelElasticsearchServiceSoftwareUpdate(CancelElasticsearchServiceSoftwareUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeCancelElasticsearchServiceSoftwareUpdate(request);
    }

    @SdkInternalApi
    final CancelElasticsearchServiceSoftwareUpdateResult executeCancelElasticsearchServiceSoftwareUpdate(
            CancelElasticsearchServiceSoftwareUpdateRequest cancelElasticsearchServiceSoftwareUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelElasticsearchServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelElasticsearchServiceSoftwareUpdateRequest> request = null;
        Response<CancelElasticsearchServiceSoftwareUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelElasticsearchServiceSoftwareUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelElasticsearchServiceSoftwareUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelElasticsearchServiceSoftwareUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelElasticsearchServiceSoftwareUpdateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CancelElasticsearchServiceSoftwareUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Elasticsearch domain. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param createElasticsearchDomainRequest
     * @return Result of the CreateElasticsearchDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.CreateElasticsearchDomain
     */
    @Override
    public CreateElasticsearchDomainResult createElasticsearchDomain(CreateElasticsearchDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateElasticsearchDomain(request);
    }

    @SdkInternalApi
    final CreateElasticsearchDomainResult executeCreateElasticsearchDomain(CreateElasticsearchDomainRequest createElasticsearchDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateElasticsearchDomainRequest> request = null;
        Response<CreateElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateElasticsearchDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateElasticsearchDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateElasticsearchDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateElasticsearchDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cross-cluster search connection from a source domain to a destination domain.
     * </p>
     * 
     * @param createOutboundCrossClusterSearchConnectionRequest
     *        Container for the parameters to the <code><a>CreateOutboundCrossClusterSearchConnection</a></code>
     *        operation.
     * @return Result of the CreateOutboundCrossClusterSearchConnection operation returned by the service.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.CreateOutboundCrossClusterSearchConnection
     */
    @Override
    public CreateOutboundCrossClusterSearchConnectionResult createOutboundCrossClusterSearchConnection(CreateOutboundCrossClusterSearchConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOutboundCrossClusterSearchConnection(request);
    }

    @SdkInternalApi
    final CreateOutboundCrossClusterSearchConnectionResult executeCreateOutboundCrossClusterSearchConnection(
            CreateOutboundCrossClusterSearchConnectionRequest createOutboundCrossClusterSearchConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createOutboundCrossClusterSearchConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOutboundCrossClusterSearchConnectionRequest> request = null;
        Response<CreateOutboundCrossClusterSearchConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOutboundCrossClusterSearchConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createOutboundCrossClusterSearchConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOutboundCrossClusterSearchConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOutboundCrossClusterSearchConnectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateOutboundCrossClusterSearchConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a package for use with Amazon ES domains.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to <code> <a>CreatePackage</a> </code> operation.
     * @return Result of the CreatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.CreatePackage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot
     * be recovered.
     * </p>
     * 
     * @param deleteElasticsearchDomainRequest
     *        Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the
     *        name of the Elasticsearch domain that you want to delete.
     * @return Result of the DeleteElasticsearchDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DeleteElasticsearchDomain
     */
    @Override
    public DeleteElasticsearchDomainResult deleteElasticsearchDomain(DeleteElasticsearchDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteElasticsearchDomain(request);
    }

    @SdkInternalApi
    final DeleteElasticsearchDomainResult executeDeleteElasticsearchDomain(DeleteElasticsearchDomainRequest deleteElasticsearchDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteElasticsearchDomainRequest> request = null;
        Response<DeleteElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteElasticsearchDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteElasticsearchDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteElasticsearchDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteElasticsearchDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion
     * will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before
     * deleting the role. See <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-enabling-slr"
     * target="_blank">Deleting Elasticsearch Service Role</a> in <i>VPC Endpoints for Amazon Elasticsearch Service
     * Domains</i>.
     * </p>
     * 
     * @param deleteElasticsearchServiceRoleRequest
     * @return Result of the DeleteElasticsearchServiceRole operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DeleteElasticsearchServiceRole
     */
    @Override
    public DeleteElasticsearchServiceRoleResult deleteElasticsearchServiceRole(DeleteElasticsearchServiceRoleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteElasticsearchServiceRole(request);
    }

    @SdkInternalApi
    final DeleteElasticsearchServiceRoleResult executeDeleteElasticsearchServiceRole(DeleteElasticsearchServiceRoleRequest deleteElasticsearchServiceRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteElasticsearchServiceRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteElasticsearchServiceRoleRequest> request = null;
        Response<DeleteElasticsearchServiceRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteElasticsearchServiceRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteElasticsearchServiceRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteElasticsearchServiceRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteElasticsearchServiceRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteElasticsearchServiceRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the destination domain owner to delete an existing inbound cross-cluster search connection.
     * </p>
     * 
     * @param deleteInboundCrossClusterSearchConnectionRequest
     *        Container for the parameters to the <code><a>DeleteInboundCrossClusterSearchConnection</a></code>
     *        operation.
     * @return Result of the DeleteInboundCrossClusterSearchConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.DeleteInboundCrossClusterSearchConnection
     */
    @Override
    public DeleteInboundCrossClusterSearchConnectionResult deleteInboundCrossClusterSearchConnection(DeleteInboundCrossClusterSearchConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInboundCrossClusterSearchConnection(request);
    }

    @SdkInternalApi
    final DeleteInboundCrossClusterSearchConnectionResult executeDeleteInboundCrossClusterSearchConnection(
            DeleteInboundCrossClusterSearchConnectionRequest deleteInboundCrossClusterSearchConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInboundCrossClusterSearchConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInboundCrossClusterSearchConnectionRequest> request = null;
        Response<DeleteInboundCrossClusterSearchConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInboundCrossClusterSearchConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInboundCrossClusterSearchConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInboundCrossClusterSearchConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInboundCrossClusterSearchConnectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteInboundCrossClusterSearchConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the source domain owner to delete an existing outbound cross-cluster search connection.
     * </p>
     * 
     * @param deleteOutboundCrossClusterSearchConnectionRequest
     *        Container for the parameters to the <code><a>DeleteOutboundCrossClusterSearchConnection</a></code>
     *        operation.
     * @return Result of the DeleteOutboundCrossClusterSearchConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.DeleteOutboundCrossClusterSearchConnection
     */
    @Override
    public DeleteOutboundCrossClusterSearchConnectionResult deleteOutboundCrossClusterSearchConnection(DeleteOutboundCrossClusterSearchConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOutboundCrossClusterSearchConnection(request);
    }

    @SdkInternalApi
    final DeleteOutboundCrossClusterSearchConnectionResult executeDeleteOutboundCrossClusterSearchConnection(
            DeleteOutboundCrossClusterSearchConnectionRequest deleteOutboundCrossClusterSearchConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOutboundCrossClusterSearchConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOutboundCrossClusterSearchConnectionRequest> request = null;
        Response<DeleteOutboundCrossClusterSearchConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOutboundCrossClusterSearchConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOutboundCrossClusterSearchConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOutboundCrossClusterSearchConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOutboundCrossClusterSearchConnectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteOutboundCrossClusterSearchConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete the package.
     * </p>
     * 
     * @param deletePackageRequest
     *        Container for request parameters to <code> <a>DeletePackage</a> </code> operation.
     * @return Result of the DeletePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AWSElasticsearch.DeletePackage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Provides scheduled Auto-Tune action details for the Elasticsearch domain, such as Auto-Tune action type,
     * description, severity, and scheduled date.
     * </p>
     * 
     * @param describeDomainAutoTunesRequest
     *        Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
     * @return Result of the DescribeDomainAutoTunes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DescribeDomainAutoTunes
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID,
     * domain endpoint, and domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainRequest
     *        Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
     * @return Result of the DescribeElasticsearchDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchDomain
     */
    @Override
    public DescribeElasticsearchDomainResult describeElasticsearchDomain(DescribeElasticsearchDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeElasticsearchDomain(request);
    }

    @SdkInternalApi
    final DescribeElasticsearchDomainResult executeDescribeElasticsearchDomain(DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainRequest> request = null;
        Response<DescribeElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeElasticsearchDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeElasticsearchDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeElasticsearchDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation
     * date, update version, and update date for cluster options.
     * </p>
     * 
     * @param describeElasticsearchDomainConfigRequest
     *        Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies
     *        the domain name for which you want configuration information.
     * @return Result of the DescribeElasticsearchDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchDomainConfig
     */
    @Override
    public DescribeElasticsearchDomainConfigResult describeElasticsearchDomainConfig(DescribeElasticsearchDomainConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeElasticsearchDomainConfig(request);
    }

    @SdkInternalApi
    final DescribeElasticsearchDomainConfigResult executeDescribeElasticsearchDomainConfig(
            DescribeElasticsearchDomainConfigRequest describeElasticsearchDomainConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainConfigRequest> request = null;
        Response<DescribeElasticsearchDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeElasticsearchDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeElasticsearchDomainConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeElasticsearchDomainConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeElasticsearchDomainConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID,
     * domain endpoint, and domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainsRequest
     *        Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By
     *        default, the API returns the status of all Elasticsearch domains.
     * @return Result of the DescribeElasticsearchDomains operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchDomains
     */
    @Override
    public DescribeElasticsearchDomainsResult describeElasticsearchDomains(DescribeElasticsearchDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeElasticsearchDomains(request);
    }

    @SdkInternalApi
    final DescribeElasticsearchDomainsResult executeDescribeElasticsearchDomains(DescribeElasticsearchDomainsRequest describeElasticsearchDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainsRequest> request = null;
        Response<DescribeElasticsearchDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeElasticsearchDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeElasticsearchDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeElasticsearchDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeElasticsearchDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain,
     * specify the <code> <a>DomainName</a> </code> to know what Limits are supported for modifying.
     * </p>
     * 
     * @param describeElasticsearchInstanceTypeLimitsRequest
     *        Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
     * @return Result of the DescribeElasticsearchInstanceTypeLimits operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DescribeElasticsearchInstanceTypeLimits
     */
    @Override
    public DescribeElasticsearchInstanceTypeLimitsResult describeElasticsearchInstanceTypeLimits(DescribeElasticsearchInstanceTypeLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeElasticsearchInstanceTypeLimits(request);
    }

    @SdkInternalApi
    final DescribeElasticsearchInstanceTypeLimitsResult executeDescribeElasticsearchInstanceTypeLimits(
            DescribeElasticsearchInstanceTypeLimitsRequest describeElasticsearchInstanceTypeLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeElasticsearchInstanceTypeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchInstanceTypeLimitsRequest> request = null;
        Response<DescribeElasticsearchInstanceTypeLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchInstanceTypeLimitsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeElasticsearchInstanceTypeLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeElasticsearchInstanceTypeLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeElasticsearchInstanceTypeLimitsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeElasticsearchInstanceTypeLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the inbound cross-cluster search connections for a destination domain.
     * </p>
     * 
     * @param describeInboundCrossClusterSearchConnectionsRequest
     *        Container for the parameters to the <code><a>DescribeInboundCrossClusterSearchConnections</a></code>
     *        operation.
     * @return Result of the DescribeInboundCrossClusterSearchConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The request processing has failed because of invalid pagination token provided by customer. Returns an
     *         HTTP status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.DescribeInboundCrossClusterSearchConnections
     */
    @Override
    public DescribeInboundCrossClusterSearchConnectionsResult describeInboundCrossClusterSearchConnections(
            DescribeInboundCrossClusterSearchConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInboundCrossClusterSearchConnections(request);
    }

    @SdkInternalApi
    final DescribeInboundCrossClusterSearchConnectionsResult executeDescribeInboundCrossClusterSearchConnections(
            DescribeInboundCrossClusterSearchConnectionsRequest describeInboundCrossClusterSearchConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInboundCrossClusterSearchConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInboundCrossClusterSearchConnectionsRequest> request = null;
        Response<DescribeInboundCrossClusterSearchConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInboundCrossClusterSearchConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInboundCrossClusterSearchConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInboundCrossClusterSearchConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInboundCrossClusterSearchConnectionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeInboundCrossClusterSearchConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the outbound cross-cluster search connections for a source domain.
     * </p>
     * 
     * @param describeOutboundCrossClusterSearchConnectionsRequest
     *        Container for the parameters to the <code><a>DescribeOutboundCrossClusterSearchConnections</a></code>
     *        operation.
     * @return Result of the DescribeOutboundCrossClusterSearchConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The request processing has failed because of invalid pagination token provided by customer. Returns an
     *         HTTP status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.DescribeOutboundCrossClusterSearchConnections
     */
    @Override
    public DescribeOutboundCrossClusterSearchConnectionsResult describeOutboundCrossClusterSearchConnections(
            DescribeOutboundCrossClusterSearchConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOutboundCrossClusterSearchConnections(request);
    }

    @SdkInternalApi
    final DescribeOutboundCrossClusterSearchConnectionsResult executeDescribeOutboundCrossClusterSearchConnections(
            DescribeOutboundCrossClusterSearchConnectionsRequest describeOutboundCrossClusterSearchConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOutboundCrossClusterSearchConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOutboundCrossClusterSearchConnectionsRequest> request = null;
        Response<DescribeOutboundCrossClusterSearchConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOutboundCrossClusterSearchConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOutboundCrossClusterSearchConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOutboundCrossClusterSearchConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOutboundCrossClusterSearchConnectionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeOutboundCrossClusterSearchConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes all packages available to Amazon ES. Includes options for filtering, limiting the number of results,
     * and pagination.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for request parameters to <code> <a>DescribePackage</a> </code> operation.
     * @return Result of the DescribePackages operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.DescribePackages
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Lists available reserved Elasticsearch instance offerings.
     * </p>
     * 
     * @param describeReservedElasticsearchInstanceOfferingsRequest
     *        Container for parameters to <code>DescribeReservedElasticsearchInstanceOfferings</code>
     * @return Result of the DescribeReservedElasticsearchInstanceOfferings operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.DescribeReservedElasticsearchInstanceOfferings
     */
    @Override
    public DescribeReservedElasticsearchInstanceOfferingsResult describeReservedElasticsearchInstanceOfferings(
            DescribeReservedElasticsearchInstanceOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedElasticsearchInstanceOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedElasticsearchInstanceOfferingsResult executeDescribeReservedElasticsearchInstanceOfferings(
            DescribeReservedElasticsearchInstanceOfferingsRequest describeReservedElasticsearchInstanceOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedElasticsearchInstanceOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedElasticsearchInstanceOfferingsRequest> request = null;
        Response<DescribeReservedElasticsearchInstanceOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedElasticsearchInstanceOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedElasticsearchInstanceOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedElasticsearchInstanceOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedElasticsearchInstanceOfferingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeReservedElasticsearchInstanceOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about reserved Elasticsearch instances for this account.
     * </p>
     * 
     * @param describeReservedElasticsearchInstancesRequest
     *        Container for parameters to <code>DescribeReservedElasticsearchInstances</code>
     * @return Result of the DescribeReservedElasticsearchInstances operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.DescribeReservedElasticsearchInstances
     */
    @Override
    public DescribeReservedElasticsearchInstancesResult describeReservedElasticsearchInstances(DescribeReservedElasticsearchInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedElasticsearchInstances(request);
    }

    @SdkInternalApi
    final DescribeReservedElasticsearchInstancesResult executeDescribeReservedElasticsearchInstances(
            DescribeReservedElasticsearchInstancesRequest describeReservedElasticsearchInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedElasticsearchInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedElasticsearchInstancesRequest> request = null;
        Response<DescribeReservedElasticsearchInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedElasticsearchInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedElasticsearchInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedElasticsearchInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedElasticsearchInstancesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeReservedElasticsearchInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dissociates a package from the Amazon ES domain.
     * </p>
     * 
     * @param dissociatePackageRequest
     *        Container for request parameters to <code> <a>DissociatePackage</a> </code> operation.
     * @return Result of the DissociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AWSElasticsearch.DissociatePackage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a
     * <code> <a>DomainName</a> </code> to get all upgrade compatible Elasticsearch versions for that specific domain.
     * </p>
     * 
     * @param getCompatibleElasticsearchVersionsRequest
     *        Container for request parameters to <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * @return Result of the GetCompatibleElasticsearchVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.GetCompatibleElasticsearchVersions
     */
    @Override
    public GetCompatibleElasticsearchVersionsResult getCompatibleElasticsearchVersions(GetCompatibleElasticsearchVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCompatibleElasticsearchVersions(request);
    }

    @SdkInternalApi
    final GetCompatibleElasticsearchVersionsResult executeGetCompatibleElasticsearchVersions(
            GetCompatibleElasticsearchVersionsRequest getCompatibleElasticsearchVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCompatibleElasticsearchVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCompatibleElasticsearchVersionsRequest> request = null;
        Response<GetCompatibleElasticsearchVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCompatibleElasticsearchVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCompatibleElasticsearchVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCompatibleElasticsearchVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCompatibleElasticsearchVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCompatibleElasticsearchVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of versions of the package, along with their creation time and commit message.
     * </p>
     * 
     * @param getPackageVersionHistoryRequest
     *        Container for request parameters to <code> <a>GetPackageVersionHistory</a> </code> operation.
     * @return Result of the GetPackageVersionHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.GetPackageVersionHistory
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for request parameters to <code> <a>GetUpgradeHistory</a> </code> operation.
     * @return Result of the GetUpgradeHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.GetUpgradeHistory
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for request parameters to <code> <a>GetUpgradeStatus</a> </code> operation.
     * @return Result of the GetUpgradeStatus operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.GetUpgradeStatus
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Returns the name of all Elasticsearch domains owned by the current user's account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.ListDomainNames
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Lists all Amazon ES domains associated with the package.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for request parameters to <code> <a>ListDomainsForPackage</a> </code> operation.
     * @return Result of the ListDomainsForPackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.ListDomainsForPackage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     * </p>
     * 
     * @param listElasticsearchInstanceTypesRequest
     *        Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
     * @return Result of the ListElasticsearchInstanceTypes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.ListElasticsearchInstanceTypes
     */
    @Override
    public ListElasticsearchInstanceTypesResult listElasticsearchInstanceTypes(ListElasticsearchInstanceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListElasticsearchInstanceTypes(request);
    }

    @SdkInternalApi
    final ListElasticsearchInstanceTypesResult executeListElasticsearchInstanceTypes(ListElasticsearchInstanceTypesRequest listElasticsearchInstanceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listElasticsearchInstanceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListElasticsearchInstanceTypesRequest> request = null;
        Response<ListElasticsearchInstanceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListElasticsearchInstanceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listElasticsearchInstanceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListElasticsearchInstanceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListElasticsearchInstanceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListElasticsearchInstanceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all supported Elasticsearch versions
     * </p>
     * 
     * @param listElasticsearchVersionsRequest
     *        Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation.
     *        <p>
     *        Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single
     *        call.
     *        </p>
     *        <p>
     *        Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does
     *        not contain a NextToken, then there are no more results to retrieve.
     *        </p>
     * @return Result of the ListElasticsearchVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.ListElasticsearchVersions
     */
    @Override
    public ListElasticsearchVersionsResult listElasticsearchVersions(ListElasticsearchVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListElasticsearchVersions(request);
    }

    @SdkInternalApi
    final ListElasticsearchVersionsResult executeListElasticsearchVersions(ListElasticsearchVersionsRequest listElasticsearchVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listElasticsearchVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListElasticsearchVersionsRequest> request = null;
        Response<ListElasticsearchVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListElasticsearchVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listElasticsearchVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListElasticsearchVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListElasticsearchVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListElasticsearchVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all packages associated with the Amazon ES domain.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for request parameters to <code> <a>ListPackagesForDomain</a> </code> operation.
     * @return Result of the ListPackagesForDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.ListPackagesForDomain
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Returns all tags for the given Elasticsearch domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code>
     *        for the Elasticsearch domain to which the tags are attached that you want to view are attached.
     * @return Result of the ListTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.ListTags
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Allows you to purchase reserved Elasticsearch instances.
     * </p>
     * 
     * @param purchaseReservedElasticsearchInstanceOfferingRequest
     *        Container for parameters to <code>PurchaseReservedElasticsearchInstanceOffering</code>
     * @return Result of the PurchaseReservedElasticsearchInstanceOffering operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.PurchaseReservedElasticsearchInstanceOffering
     */
    @Override
    public PurchaseReservedElasticsearchInstanceOfferingResult purchaseReservedElasticsearchInstanceOffering(
            PurchaseReservedElasticsearchInstanceOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedElasticsearchInstanceOffering(request);
    }

    @SdkInternalApi
    final PurchaseReservedElasticsearchInstanceOfferingResult executePurchaseReservedElasticsearchInstanceOffering(
            PurchaseReservedElasticsearchInstanceOfferingRequest purchaseReservedElasticsearchInstanceOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedElasticsearchInstanceOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedElasticsearchInstanceOfferingRequest> request = null;
        Response<PurchaseReservedElasticsearchInstanceOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedElasticsearchInstanceOfferingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(purchaseReservedElasticsearchInstanceOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedElasticsearchInstanceOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseReservedElasticsearchInstanceOfferingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PurchaseReservedElasticsearchInstanceOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the destination domain owner to reject an inbound cross-cluster search connection request.
     * </p>
     * 
     * @param rejectInboundCrossClusterSearchConnectionRequest
     *        Container for the parameters to the <code><a>RejectInboundCrossClusterSearchConnection</a></code>
     *        operation.
     * @return Result of the RejectInboundCrossClusterSearchConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AWSElasticsearch.RejectInboundCrossClusterSearchConnection
     */
    @Override
    public RejectInboundCrossClusterSearchConnectionResult rejectInboundCrossClusterSearchConnection(RejectInboundCrossClusterSearchConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeRejectInboundCrossClusterSearchConnection(request);
    }

    @SdkInternalApi
    final RejectInboundCrossClusterSearchConnectionResult executeRejectInboundCrossClusterSearchConnection(
            RejectInboundCrossClusterSearchConnectionRequest rejectInboundCrossClusterSearchConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectInboundCrossClusterSearchConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectInboundCrossClusterSearchConnectionRequest> request = null;
        Response<RejectInboundCrossClusterSearchConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectInboundCrossClusterSearchConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectInboundCrossClusterSearchConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectInboundCrossClusterSearchConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectInboundCrossClusterSearchConnectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RejectInboundCrossClusterSearchConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified set of tags from the specified Elasticsearch domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code>
     *        for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.RemoveTags
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Schedules a service software update for an Amazon ES domain.
     * </p>
     * 
     * @param startElasticsearchServiceSoftwareUpdateRequest
     *        Container for the parameters to the <code><a>StartElasticsearchServiceSoftwareUpdate</a></code> operation.
     *        Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on.
     * @return Result of the StartElasticsearchServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.StartElasticsearchServiceSoftwareUpdate
     */
    @Override
    public StartElasticsearchServiceSoftwareUpdateResult startElasticsearchServiceSoftwareUpdate(StartElasticsearchServiceSoftwareUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeStartElasticsearchServiceSoftwareUpdate(request);
    }

    @SdkInternalApi
    final StartElasticsearchServiceSoftwareUpdateResult executeStartElasticsearchServiceSoftwareUpdate(
            StartElasticsearchServiceSoftwareUpdateRequest startElasticsearchServiceSoftwareUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(startElasticsearchServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartElasticsearchServiceSoftwareUpdateRequest> request = null;
        Response<StartElasticsearchServiceSoftwareUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartElasticsearchServiceSoftwareUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startElasticsearchServiceSoftwareUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartElasticsearchServiceSoftwareUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartElasticsearchServiceSoftwareUpdateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartElasticsearchServiceSoftwareUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type
     * and the number of instances.
     * </p>
     * 
     * @param updateElasticsearchDomainConfigRequest
     *        Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the
     *        type and number of instances in the domain cluster.
     * @return Result of the UpdateElasticsearchDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.UpdateElasticsearchDomainConfig
     */
    @Override
    public UpdateElasticsearchDomainConfigResult updateElasticsearchDomainConfig(UpdateElasticsearchDomainConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateElasticsearchDomainConfig(request);
    }

    @SdkInternalApi
    final UpdateElasticsearchDomainConfigResult executeUpdateElasticsearchDomainConfig(
            UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateElasticsearchDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateElasticsearchDomainConfigRequest> request = null;
        Response<UpdateElasticsearchDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateElasticsearchDomainConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateElasticsearchDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateElasticsearchDomainConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateElasticsearchDomainConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateElasticsearchDomainConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a package for use with Amazon ES domains.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to <code> <a>UpdatePackage</a> </code> operation.
     * @return Result of the UpdatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AWSElasticsearch.UpdatePackage
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
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
     * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch
     * version.
     * </p>
     * 
     * @param upgradeElasticsearchDomainRequest
     *        Container for request parameters to <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
     * @return Result of the UpgradeElasticsearchDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AWSElasticsearch.UpgradeElasticsearchDomain
     */
    @Override
    public UpgradeElasticsearchDomainResult upgradeElasticsearchDomain(UpgradeElasticsearchDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeElasticsearchDomain(request);
    }

    @SdkInternalApi
    final UpgradeElasticsearchDomainResult executeUpgradeElasticsearchDomain(UpgradeElasticsearchDomainRequest upgradeElasticsearchDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeElasticsearchDomainRequest> request = null;
        Response<UpgradeElasticsearchDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeElasticsearchDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(upgradeElasticsearchDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elasticsearch Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeElasticsearchDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeElasticsearchDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpgradeElasticsearchDomainResultJsonUnmarshaller());
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
