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
package com.amazonaws.services.cloudsearchv2;

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

import com.amazonaws.services.cloudsearchv2.AmazonCloudSearchClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.services.cloudsearchv2.model.transform.*;

/**
 * Client for accessing Amazon CloudSearch. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon CloudSearch Configuration Service</fullname>
 * <p>
 * You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
 * service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
 * via HTTP GET or POST with a query parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: cloudsearch.<i>region</i>.amazonaws.com. For
 * example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region" target="_blank">Regions and
 * Endpoints</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudSearchClient extends AmazonWebServiceClient implements AmazonCloudSearch {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudSearch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudsearch";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudSearchClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudSearchClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudSearch (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudSearchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudSearchClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudSearchClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudSearchClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudSearchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudSearch (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudSearchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudSearchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudSearchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudSearchClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudSearch (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudSearchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudSearchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudSearch (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudSearchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudSearchClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudSearchClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudSearchClientBuilder builder() {
        return AmazonCloudSearchClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudSearchClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudSearch using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudSearchClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new DisabledOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BaseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTypeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.cloudsearchv2.model.AmazonCloudSearchException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://cloudsearch.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudsearchv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudsearchv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Indexes the search suggestions. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"
     * >Configuring Suggesters</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param buildSuggestersRequest
     *        Container for the parameters to the <code><a>BuildSuggester</a></code> operation. Specifies the name of
     *        the domain you want to update.
     * @return Result of the BuildSuggesters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.BuildSuggesters
     */
    @Override
    public BuildSuggestersResult buildSuggesters(BuildSuggestersRequest request) {
        request = beforeClientExecution(request);
        return executeBuildSuggesters(request);
    }

    @SdkInternalApi
    final BuildSuggestersResult executeBuildSuggesters(BuildSuggestersRequest buildSuggestersRequest) {

        ExecutionContext executionContext = createExecutionContext(buildSuggestersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BuildSuggestersRequest> request = null;
        Response<BuildSuggestersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BuildSuggestersRequestMarshaller().marshall(super.beforeMarshalling(buildSuggestersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BuildSuggesters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BuildSuggestersResult> responseHandler = new StaxResponseHandler<BuildSuggestersResult>(
                    new BuildSuggestersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new search domain. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"
     * target="_blank">Creating a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param createDomainRequest
     *        Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the
     *        new search domain.
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @sample AmazonCloudSearch.CreateDomain
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
                request = new CreateDomainRequestMarshaller().marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateDomainResult> responseHandler = new StaxResponseHandler<CreateDomainResult>(new CreateDomainResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures an analysis scheme that can be applied to a <code>text</code> or <code>text-array</code> field to
     * define language-specific text processing options. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"
     * target="_blank">Configuring Analysis Schemes</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineAnalysisSchemeRequest
     *        Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name
     *        of the domain you want to update and the analysis scheme configuration.
     * @return Result of the DefineAnalysisScheme operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineAnalysisScheme
     */
    @Override
    public DefineAnalysisSchemeResult defineAnalysisScheme(DefineAnalysisSchemeRequest request) {
        request = beforeClientExecution(request);
        return executeDefineAnalysisScheme(request);
    }

    @SdkInternalApi
    final DefineAnalysisSchemeResult executeDefineAnalysisScheme(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) {

        ExecutionContext executionContext = createExecutionContext(defineAnalysisSchemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineAnalysisSchemeRequest> request = null;
        Response<DefineAnalysisSchemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineAnalysisSchemeRequestMarshaller().marshall(super.beforeMarshalling(defineAnalysisSchemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DefineAnalysisScheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DefineAnalysisSchemeResult> responseHandler = new StaxResponseHandler<DefineAnalysisSchemeResult>(
                    new DefineAnalysisSchemeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures an <code><a>Expression</a></code> for the search domain. Used to create new expressions and modify
     * existing ones. If the expression exists, the new configuration replaces the old one. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineExpressionRequest
     *        Container for the parameters to the <code><a>DefineExpression</a></code> operation. Specifies the name of
     *        the domain you want to update and the expression you want to configure.
     * @return Result of the DefineExpression operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineExpression
     */
    @Override
    public DefineExpressionResult defineExpression(DefineExpressionRequest request) {
        request = beforeClientExecution(request);
        return executeDefineExpression(request);
    }

    @SdkInternalApi
    final DefineExpressionResult executeDefineExpression(DefineExpressionRequest defineExpressionRequest) {

        ExecutionContext executionContext = createExecutionContext(defineExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineExpressionRequest> request = null;
        Response<DefineExpressionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineExpressionRequestMarshaller().marshall(super.beforeMarshalling(defineExpressionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DefineExpression");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DefineExpressionResult> responseHandler = new StaxResponseHandler<DefineExpressionResult>(
                    new DefineExpressionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures an <code><a>IndexField</a></code> for the search domain. Used to create new fields and modify existing
     * ones. You must specify the name of the domain you are configuring and an index field configuration. The index
     * field configuration specifies a unique name, the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code><a>IndexFieldType</a></code>. If the field exists, the new
     * configuration replaces the old one. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineIndexFieldRequest
     *        Container for the parameters to the <code><a>DefineIndexField</a></code> operation. Specifies the name of
     *        the domain you want to update and the index field configuration.
     * @return Result of the DefineIndexField operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineIndexField
     */
    @Override
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest request) {
        request = beforeClientExecution(request);
        return executeDefineIndexField(request);
    }

    @SdkInternalApi
    final DefineIndexFieldResult executeDefineIndexField(DefineIndexFieldRequest defineIndexFieldRequest) {

        ExecutionContext executionContext = createExecutionContext(defineIndexFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineIndexFieldRequest> request = null;
        Response<DefineIndexFieldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineIndexFieldRequestMarshaller().marshall(super.beforeMarshalling(defineIndexFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DefineIndexField");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DefineIndexFieldResult> responseHandler = new StaxResponseHandler<DefineIndexFieldResult>(
                    new DefineIndexFieldResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish
     * typing their queries. When you configure a suggester, you must specify the name of the text field you want to
     * search for possible matches and a unique name for the suggester. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"
     * target="_blank">Getting Search Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineSuggesterRequest
     *        Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of
     *        the domain you want to update and the suggester configuration.
     * @return Result of the DefineSuggester operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineSuggester
     */
    @Override
    public DefineSuggesterResult defineSuggester(DefineSuggesterRequest request) {
        request = beforeClientExecution(request);
        return executeDefineSuggester(request);
    }

    @SdkInternalApi
    final DefineSuggesterResult executeDefineSuggester(DefineSuggesterRequest defineSuggesterRequest) {

        ExecutionContext executionContext = createExecutionContext(defineSuggesterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineSuggesterRequest> request = null;
        Response<DefineSuggesterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineSuggesterRequestMarshaller().marshall(super.beforeMarshalling(defineSuggesterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DefineSuggester");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DefineSuggesterResult> responseHandler = new StaxResponseHandler<DefineSuggesterResult>(
                    new DefineSuggesterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an analysis scheme. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"
     * target="_blank">Configuring Analysis Schemes</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteAnalysisSchemeRequest
     *        Container for the parameters to the <code><a>DeleteAnalysisScheme</a></code> operation. Specifies the name
     *        of the domain you want to update and the analysis scheme you want to delete.
     * @return Result of the DeleteAnalysisScheme operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteAnalysisScheme
     */
    @Override
    public DeleteAnalysisSchemeResult deleteAnalysisScheme(DeleteAnalysisSchemeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnalysisScheme(request);
    }

    @SdkInternalApi
    final DeleteAnalysisSchemeResult executeDeleteAnalysisScheme(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnalysisSchemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnalysisSchemeRequest> request = null;
        Response<DeleteAnalysisSchemeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnalysisSchemeRequestMarshaller().marshall(super.beforeMarshalling(deleteAnalysisSchemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnalysisScheme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAnalysisSchemeResult> responseHandler = new StaxResponseHandler<DeleteAnalysisSchemeResult>(
                    new DeleteAnalysisSchemeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"
     * target="_blank">Deleting a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code><a>DeleteDomain</a></code> operation. Specifies the name of the
     *        domain you want to delete.
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @sample AmazonCloudSearch.DeleteDomain
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
                request = new DeleteDomainRequestMarshaller().marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDomainResult> responseHandler = new StaxResponseHandler<DeleteDomainResult>(new DeleteDomainResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an <code><a>Expression</a></code> from the search domain. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteExpressionRequest
     *        Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of
     *        the domain you want to update and the name of the expression you want to delete.
     * @return Result of the DeleteExpression operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteExpression
     */
    @Override
    public DeleteExpressionResult deleteExpression(DeleteExpressionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExpression(request);
    }

    @SdkInternalApi
    final DeleteExpressionResult executeDeleteExpression(DeleteExpressionRequest deleteExpressionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExpressionRequest> request = null;
        Response<DeleteExpressionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExpressionRequestMarshaller().marshall(super.beforeMarshalling(deleteExpressionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExpression");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteExpressionResult> responseHandler = new StaxResponseHandler<DeleteExpressionResult>(
                    new DeleteExpressionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an <code><a>IndexField</a></code> from the search domain. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteIndexFieldRequest
     *        Container for the parameters to the <code><a>DeleteIndexField</a></code> operation. Specifies the name of
     *        the domain you want to update and the name of the index field you want to delete.
     * @return Result of the DeleteIndexField operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteIndexField
     */
    @Override
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIndexField(request);
    }

    @SdkInternalApi
    final DeleteIndexFieldResult executeDeleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIndexFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIndexFieldRequest> request = null;
        Response<DeleteIndexFieldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIndexFieldRequestMarshaller().marshall(super.beforeMarshalling(deleteIndexFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIndexField");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteIndexFieldResult> responseHandler = new StaxResponseHandler<DeleteIndexFieldResult>(
                    new DeleteIndexFieldResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a suggester. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"
     * target="_blank">Getting Search Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteSuggesterRequest
     *        Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of
     *        the domain you want to update and name of the suggester you want to delete.
     * @return Result of the DeleteSuggester operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteSuggester
     */
    @Override
    public DeleteSuggesterResult deleteSuggester(DeleteSuggesterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSuggester(request);
    }

    @SdkInternalApi
    final DeleteSuggesterResult executeDeleteSuggester(DeleteSuggesterRequest deleteSuggesterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSuggesterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSuggesterRequest> request = null;
        Response<DeleteSuggesterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSuggesterRequestMarshaller().marshall(super.beforeMarshalling(deleteSuggesterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSuggester");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteSuggesterResult> responseHandler = new StaxResponseHandler<DeleteSuggesterResult>(
                    new DeleteSuggesterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing
     * options for a <code>text</code> field. Can be limited to specific analysis schemes by name. By default, shows all
     * analysis schemes and includes any pending changes to the configuration. Set the <code>Deployed</code> option to
     * <code>true</code> to show the active configuration and exclude pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"
     * target="_blank">Configuring Analysis Schemes</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeAnalysisSchemesRequest
     *        Container for the parameters to the <code><a>DescribeAnalysisSchemes</a></code> operation. Specifies the
     *        name of the domain you want to describe. To limit the response to particular analysis schemes, specify the
     *        names of the analysis schemes you want to describe. To show the active configuration and exclude any
     *        pending changes, set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeAnalysisSchemes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeAnalysisSchemes
     */
    @Override
    public DescribeAnalysisSchemesResult describeAnalysisSchemes(DescribeAnalysisSchemesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnalysisSchemes(request);
    }

    @SdkInternalApi
    final DescribeAnalysisSchemesResult executeDescribeAnalysisSchemes(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnalysisSchemesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnalysisSchemesRequest> request = null;
        Response<DescribeAnalysisSchemesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnalysisSchemesRequestMarshaller().marshall(super.beforeMarshalling(describeAnalysisSchemesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnalysisSchemes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAnalysisSchemesResult> responseHandler = new StaxResponseHandler<DescribeAnalysisSchemesResult>(
                    new DescribeAnalysisSchemesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the availability options configured for a domain. By default, shows the configuration with any pending
     * changes. Set the <code>Deployed</code> option to <code>true</code> to show the active configuration and exclude
     * pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"
     * target="_blank">Configuring Availability Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeAvailabilityOptionsRequest
     *        Container for the parameters to the <code><a>DescribeAvailabilityOptions</a></code> operation. Specifies
     *        the name of the domain you want to describe. To show the active configuration and exclude any pending
     *        changes, set the Deployed option to <code>true</code>.
     * @return Result of the DescribeAvailabilityOptions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws DisabledOperationException
     *         The request was rejected because it attempted an operation which is not enabled.
     * @sample AmazonCloudSearch.DescribeAvailabilityOptions
     */
    @Override
    public DescribeAvailabilityOptionsResult describeAvailabilityOptions(DescribeAvailabilityOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAvailabilityOptions(request);
    }

    @SdkInternalApi
    final DescribeAvailabilityOptionsResult executeDescribeAvailabilityOptions(DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAvailabilityOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAvailabilityOptionsRequest> request = null;
        Response<DescribeAvailabilityOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAvailabilityOptionsRequestMarshaller().marshall(super.beforeMarshalling(describeAvailabilityOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAvailabilityOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAvailabilityOptionsResult> responseHandler = new StaxResponseHandler<DescribeAvailabilityOptionsResult>(
                    new DescribeAvailabilityOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all
     * domains by default. To get the number of searchable documents in a domain, use the console or submit a
     * <code>matchall</code> request to your domain's search endpoint:
     * <code>q=matchall&amp;amp;q.parser=structured&amp;amp;size=0</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"
     * target="_blank">Getting Information about a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code><a>DescribeDomains</a></code> operation. By default shows the
     *        status of all domains. To restrict the response to particular domains, specify the names of the domains
     *        you want to describe.
     * @return Result of the DescribeDomains operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @sample AmazonCloudSearch.DescribeDomains
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
                request = new DescribeDomainsRequestMarshaller().marshall(super.beforeMarshalling(describeDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDomainsResult> responseHandler = new StaxResponseHandler<DescribeDomainsResult>(
                    new DescribeDomainsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDomainsResult describeDomains() {
        return describeDomains(new DescribeDomainsRequest());
    }

    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By
     * default, shows all expressions and includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active configuration and exclude pending changes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeExpressionsRequest
     *        Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of
     *        the domain you want to describe. To restrict the response to particular expressions, specify the names of
     *        the expressions you want to describe. To show the active configuration and exclude any pending changes,
     *        set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeExpressions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeExpressions
     */
    @Override
    public DescribeExpressionsResult describeExpressions(DescribeExpressionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExpressions(request);
    }

    @SdkInternalApi
    final DescribeExpressionsResult executeDescribeExpressions(DescribeExpressionsRequest describeExpressionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExpressionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExpressionsRequest> request = null;
        Response<DescribeExpressionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExpressionsRequestMarshaller().marshall(super.beforeMarshalling(describeExpressionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExpressions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeExpressionsResult> responseHandler = new StaxResponseHandler<DescribeExpressionsResult>(
                    new DescribeExpressionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the index fields configured for the search domain. Can be limited to specific fields by
     * name. By default, shows all fields and includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active configuration and exclude pending changes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"
     * target="_blank">Getting Domain Information</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeIndexFieldsRequest
     *        Container for the parameters to the <code><a>DescribeIndexFields</a></code> operation. Specifies the name
     *        of the domain you want to describe. To restrict the response to particular index fields, specify the names
     *        of the index fields you want to describe. To show the active configuration and exclude any pending
     *        changes, set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeIndexFields operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeIndexFields
     */
    @Override
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIndexFields(request);
    }

    @SdkInternalApi
    final DescribeIndexFieldsResult executeDescribeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIndexFieldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIndexFieldsRequest> request = null;
        Response<DescribeIndexFieldsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIndexFieldsRequestMarshaller().marshall(super.beforeMarshalling(describeIndexFieldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIndexFields");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeIndexFieldsResult> responseHandler = new StaxResponseHandler<DescribeIndexFieldsResult>(
                    new DescribeIndexFieldsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search
     * instance type and replication count. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"
     * target="_blank">Configuring Scaling Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeScalingParametersRequest
     *        Container for the parameters to the <code><a>DescribeScalingParameters</a></code> operation. Specifies the
     *        name of the domain you want to describe.
     * @return Result of the DescribeScalingParameters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeScalingParameters
     */
    @Override
    public DescribeScalingParametersResult describeScalingParameters(DescribeScalingParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingParameters(request);
    }

    @SdkInternalApi
    final DescribeScalingParametersResult executeDescribeScalingParameters(DescribeScalingParametersRequest describeScalingParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingParametersRequest> request = null;
        Response<DescribeScalingParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingParametersRequestMarshaller().marshall(super.beforeMarshalling(describeScalingParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeScalingParametersResult> responseHandler = new StaxResponseHandler<DescribeScalingParametersResult>(
                    new DescribeScalingParametersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the access policies that control access to the domain's document and search endpoints. By
     * default, shows the configuration with any pending changes. Set the <code>Deployed</code> option to
     * <code>true</code> to show the active configuration and exclude pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"
     * target="_blank">Configuring Access for a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeServiceAccessPoliciesRequest
     *        Container for the parameters to the <code><a>DescribeServiceAccessPolicies</a></code> operation. Specifies
     *        the name of the domain you want to describe. To show the active configuration and exclude any pending
     *        changes, set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeServiceAccessPolicies operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeServiceAccessPolicies
     */
    @Override
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceAccessPolicies(request);
    }

    @SdkInternalApi
    final DescribeServiceAccessPoliciesResult executeDescribeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceAccessPoliciesRequest> request = null;
        Response<DescribeServiceAccessPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceAccessPoliciesRequestMarshaller().marshall(super.beforeMarshalling(describeServiceAccessPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceAccessPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeServiceAccessPoliciesResult> responseHandler = new StaxResponseHandler<DescribeServiceAccessPoliciesResult>(
                    new DescribeServiceAccessPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users
     * finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and
     * includes any pending changes to the configuration. Set the <code>Deployed</code> option to <code>true</code> to
     * show the active configuration and exclude pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"
     * target="_blank">Getting Search Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeSuggestersRequest
     *        Container for the parameters to the <code><a>DescribeSuggester</a></code> operation. Specifies the name of
     *        the domain you want to describe. To restrict the response to particular suggesters, specify the names of
     *        the suggesters you want to describe. To show the active configuration and exclude any pending changes, set
     *        the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeSuggesters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeSuggesters
     */
    @Override
    public DescribeSuggestersResult describeSuggesters(DescribeSuggestersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSuggesters(request);
    }

    @SdkInternalApi
    final DescribeSuggestersResult executeDescribeSuggesters(DescribeSuggestersRequest describeSuggestersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSuggestersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSuggestersRequest> request = null;
        Response<DescribeSuggestersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSuggestersRequestMarshaller().marshall(super.beforeMarshalling(describeSuggestersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSuggesters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSuggestersResult> responseHandler = new StaxResponseHandler<DescribeSuggestersResult>(
                    new DescribeSuggestersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
     * invoked to activate options whose <a>OptionStatus</a> is <code>RequiresIndexDocuments</code>.
     * </p>
     * 
     * @param indexDocumentsRequest
     *        Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of
     *        the domain you want to re-index.
     * @return Result of the IndexDocuments operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.IndexDocuments
     */
    @Override
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest request) {
        request = beforeClientExecution(request);
        return executeIndexDocuments(request);
    }

    @SdkInternalApi
    final IndexDocumentsResult executeIndexDocuments(IndexDocumentsRequest indexDocumentsRequest) {

        ExecutionContext executionContext = createExecutionContext(indexDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IndexDocumentsRequest> request = null;
        Response<IndexDocumentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IndexDocumentsRequestMarshaller().marshall(super.beforeMarshalling(indexDocumentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IndexDocuments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<IndexDocumentsResult> responseHandler = new StaxResponseHandler<IndexDocumentsResult>(
                    new IndexDocumentsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonCloudSearch.ListDomainNames
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
                request = new ListDomainNamesRequestMarshaller().marshall(super.beforeMarshalling(listDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDomainNamesResult> responseHandler = new StaxResponseHandler<ListDomainNamesResult>(
                    new ListDomainNamesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDomainNamesResult listDomainNames() {
        return listDomainNames(new ListDomainNamesRequest());
    }

    /**
     * <p>
     * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch
     * domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a
     * service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"
     * target="_blank">Configuring Availability Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param updateAvailabilityOptionsRequest
     *        Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the
     *        name of the domain you want to update and the Multi-AZ availability option.
     * @return Result of the UpdateAvailabilityOptions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws DisabledOperationException
     *         The request was rejected because it attempted an operation which is not enabled.
     * @sample AmazonCloudSearch.UpdateAvailabilityOptions
     */
    @Override
    public UpdateAvailabilityOptionsResult updateAvailabilityOptions(UpdateAvailabilityOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAvailabilityOptions(request);
    }

    @SdkInternalApi
    final UpdateAvailabilityOptionsResult executeUpdateAvailabilityOptions(UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAvailabilityOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAvailabilityOptionsRequest> request = null;
        Response<UpdateAvailabilityOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAvailabilityOptionsRequestMarshaller().marshall(super.beforeMarshalling(updateAvailabilityOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAvailabilityOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateAvailabilityOptionsResult> responseHandler = new StaxResponseHandler<UpdateAvailabilityOptionsResult>(
                    new UpdateAvailabilityOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance
     * type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of
     * data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"
     * target="_blank">Configuring Scaling Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param updateScalingParametersRequest
     *        Container for the parameters to the <code><a>UpdateScalingParameters</a></code> operation. Specifies the
     *        name of the domain you want to update and the scaling parameters you want to configure.
     * @return Result of the UpdateScalingParameters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @sample AmazonCloudSearch.UpdateScalingParameters
     */
    @Override
    public UpdateScalingParametersResult updateScalingParameters(UpdateScalingParametersRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScalingParameters(request);
    }

    @SdkInternalApi
    final UpdateScalingParametersResult executeUpdateScalingParameters(UpdateScalingParametersRequest updateScalingParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScalingParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScalingParametersRequest> request = null;
        Response<UpdateScalingParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScalingParametersRequestMarshaller().marshall(super.beforeMarshalling(updateScalingParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScalingParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateScalingParametersResult> responseHandler = new StaxResponseHandler<UpdateScalingParametersResult>(
                    new UpdateScalingParametersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures the access rules that control access to the domain's document and search endpoints. For more
     * information, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"
     * target="_blank"> Configuring Access for an Amazon CloudSearch Domain</a>.
     * </p>
     * 
     * @param updateServiceAccessPoliciesRequest
     *        Container for the parameters to the <code><a>UpdateServiceAccessPolicies</a></code> operation. Specifies
     *        the name of the domain you want to update and the access rules you want to configure.
     * @return Result of the UpdateServiceAccessPolicies operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @sample AmazonCloudSearch.UpdateServiceAccessPolicies
     */
    @Override
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceAccessPolicies(request);
    }

    @SdkInternalApi
    final UpdateServiceAccessPoliciesResult executeUpdateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceAccessPoliciesRequest> request = null;
        Response<UpdateServiceAccessPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceAccessPoliciesRequestMarshaller().marshall(super.beforeMarshalling(updateServiceAccessPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceAccessPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateServiceAccessPoliciesResult> responseHandler = new StaxResponseHandler<UpdateServiceAccessPoliciesResult>(
                    new UpdateServiceAccessPoliciesResultStaxUnmarshaller());
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
