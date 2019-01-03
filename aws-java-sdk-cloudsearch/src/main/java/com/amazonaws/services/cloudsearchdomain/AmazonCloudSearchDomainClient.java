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
package com.amazonaws.services.cloudsearchdomain;

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

import com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomainClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.services.cloudsearchdomain.model.transform.*;

/**
 * Client for accessing Amazon CloudSearch Domain. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * You use the AmazonCloudSearch2013 API to upload documents to a search domain and search those documents.
 * </p>
 * <p>
 * The endpoints for submitting <code>UploadDocuments</code>, <code>Search</code>, and <code>Suggest</code> requests are
 * domain-specific. To get the endpoints for your domain, use the Amazon CloudSearch configuration service
 * <code>DescribeDomains</code> action. The domain endpoints are also displayed on the domain dashboard in the Amazon
 * CloudSearch console. You submit suggest requests to the search endpoint.
 * </p>
 * <p>
 * For more information, see the <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide">Amazon
 * CloudSearch Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudSearchDomainClient extends AmazonWebServiceClient implements AmazonCloudSearchDomain {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudSearchDomain.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudsearch";

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
                            new JsonErrorShapeMetadata().withErrorCode("SearchException").withModeledClass(
                                    com.amazonaws.services.cloudsearchdomain.model.SearchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentServiceException").withModeledClass(
                                    com.amazonaws.services.cloudsearchdomain.model.DocumentServiceException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudsearchdomain.model.AmazonCloudSearchDomainException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudSearch Domain (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudSearchDomainClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudSearch Domain (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudSearchDomainClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudSearch Domain (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudSearchDomainClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudSearch Domain (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudSearchDomainClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudSearchDomainClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudSearchDomainClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudSearchDomainClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudSearchDomainClientBuilder builder() {
        return AmazonCloudSearchDomainClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudSearchDomainClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch Domain using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudSearchDomainClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudsearchdomain/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudsearchdomain/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves a list of documents that match the specified search criteria. How you specify the search criteria
     * depends on which query parser you use. Amazon CloudSearch supports four query parsers:
     * </p>
     * <ul>
     * <li><code>simple</code>: search all <code>text</code> and <code>text-array</code> fields for the specified
     * string. Search for phrases, individual terms, and prefixes.</li>
     * <li><code>structured</code>: search specific fields, construct compound queries using Boolean operators, and use
     * advanced features such as term boosting and proximity searching.</li>
     * <li><code>lucene</code>: specify search criteria using the Apache Lucene query parser syntax.</li>
     * <li><code>dismax</code>: specify search criteria using the simplified subset of the Apache Lucene query parser
     * syntax defined by the DisMax query parser.</li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching Your Data</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * <p>
     * The endpoint for submitting <code>Search</code> requests is domain-specific. You submit search requests to a
     * domain's search endpoint. To get the search endpoint for your domain, use the Amazon CloudSearch configuration
     * service <code>DescribeDomains</code> action. A domain's endpoints are also displayed on the domain dashboard in
     * the Amazon CloudSearch console.
     * </p>
     * 
     * @param searchRequest
     *        Container for the parameters to the <code>Search</code> request.
     * @return Result of the Search operation returned by the service.
     * @throws SearchException
     *         Information about any problems encountered while processing a search request.
     * @sample AmazonCloudSearchDomain.Search
     */
    @Override
    public SearchResult search(SearchRequest request) {
        request = beforeClientExecution(request);
        return executeSearch(request);
    }

    @SdkInternalApi
    final SearchResult executeSearch(SearchRequest searchRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRequest> request = null;
        Response<SearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch Domain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Search");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves autocomplete suggestions for a partial query string. You can use suggestions enable you to display
     * likely matches before users finish typing. In Amazon CloudSearch, suggestions are based on the contents of a
     * particular text field. When you request suggestions, Amazon CloudSearch finds all of the documents whose values
     * in the suggester field start with the specified query string. The beginning of the field must match the query
     * string to be considered a match.
     * </p>
     * <p>
     * For more information about configuring suggesters and retrieving suggestions, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html">Getting
     * Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * <p>
     * The endpoint for submitting <code>Suggest</code> requests is domain-specific. You submit suggest requests to a
     * domain's search endpoint. To get the search endpoint for your domain, use the Amazon CloudSearch configuration
     * service <code>DescribeDomains</code> action. A domain's endpoints are also displayed on the domain dashboard in
     * the Amazon CloudSearch console.
     * </p>
     * 
     * @param suggestRequest
     *        Container for the parameters to the <code>Suggest</code> request.
     * @return Result of the Suggest operation returned by the service.
     * @throws SearchException
     *         Information about any problems encountered while processing a search request.
     * @sample AmazonCloudSearchDomain.Suggest
     */
    @Override
    public SuggestResult suggest(SuggestRequest request) {
        request = beforeClientExecution(request);
        return executeSuggest(request);
    }

    @SdkInternalApi
    final SuggestResult executeSuggest(SuggestRequest suggestRequest) {

        ExecutionContext executionContext = createExecutionContext(suggestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SuggestRequest> request = null;
        Response<SuggestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SuggestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(suggestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch Domain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Suggest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SuggestResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SuggestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Posts a batch of documents to a search domain for indexing. A document batch is a collection of add and delete
     * operations that represent the documents you want to add, update, or delete from your domain. Batches can be
     * described in either JSON or XML. Each item that you want Amazon CloudSearch to return as a search result (such as
     * a product) is represented as a document. Every document has a unique ID and one or more fields that contain the
     * data that you want to search and return in results. Individual documents cannot contain more than 1 MB of data.
     * The entire batch cannot exceed 5 MB. To get the best possible upload performance, group add and delete operations
     * in batches that are close the 5 MB limit. Submitting a large volume of single-document batches can overload a
     * domain's document service.
     * </p>
     * <p>
     * The endpoint for submitting <code>UploadDocuments</code> requests is domain-specific. To get the document
     * endpoint for your domain, use the Amazon CloudSearch configuration service <code>DescribeDomains</code> action. A
     * domain's endpoints are also displayed on the domain dashboard in the Amazon CloudSearch console.
     * </p>
     * <p>
     * For more information about formatting your data for Amazon CloudSearch, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html">Preparing Your Data</a>
     * in the <i>Amazon CloudSearch Developer Guide</i>. For more information about uploading data for indexing, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html">Uploading Data</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param uploadDocumentsRequest
     *        Container for the parameters to the <code>UploadDocuments</code> request.
     * @return Result of the UploadDocuments operation returned by the service.
     * @throws DocumentServiceException
     *         Information about any problems encountered while processing an upload request.
     * @sample AmazonCloudSearchDomain.UploadDocuments
     */
    @Override
    public UploadDocumentsResult uploadDocuments(UploadDocumentsRequest request) {
        request = beforeClientExecution(request);
        return executeUploadDocuments(request);
    }

    @SdkInternalApi
    final UploadDocumentsResult executeUploadDocuments(UploadDocumentsRequest uploadDocumentsRequest) {

        ExecutionContext executionContext = createExecutionContext(uploadDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadDocumentsRequest> request = null;
        Response<UploadDocumentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadDocumentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(uploadDocumentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch Domain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadDocuments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UploadDocumentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UploadDocumentsResultJsonUnmarshaller());
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
