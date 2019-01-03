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
package com.amazonaws.services.simpledb;

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

import com.amazonaws.services.simpledb.AmazonSimpleDBClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.services.simpledb.model.transform.*;

/**
 * Client for accessing Amazon SimpleDB. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * Amazon SimpleDB is a web service providing the core database functions of data indexing and querying in the cloud. By
 * offloading the time and effort associated with building and operating a web-scale database, SimpleDB provides
 * developers the freedom to focus on application development.
 * <p>
 * A traditional, clustered relational database requires a sizable upfront capital outlay, is complex to design, and
 * often requires extensive and repetitive database administration. Amazon SimpleDB is dramatically simpler, requiring
 * no schema, automatically indexing your data and providing a simple API for storage and access. This approach
 * eliminates the administrative burden of data modeling, index maintenance, and performance tuning. Developers gain
 * access to this functionality within Amazon's proven computing environment, are able to scale instantly, and pay only
 * for what they use.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/simpledb/">http://aws.amazon.com/simpledb/</a> for more information.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSimpleDBClient extends AmazonWebServiceClient implements AmazonSimpleDB {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSimpleDB.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sdb";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AmazonSimpleDBClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSimpleDBClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon SimpleDB (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonSimpleDBClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleDBClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonSimpleDBClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonSimpleDBClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonSimpleDBClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SimpleDB (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonSimpleDBClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleDBClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleDBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonSimpleDBClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSimpleDBClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SimpleDB (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonSimpleDBClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleDBClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SimpleDB (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonSimpleDBClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleDBClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSimpleDBClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonSimpleDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonSimpleDBClientBuilder builder() {
        return AmazonSimpleDBClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleDBClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SimpleDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleDBClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new NumberItemAttributesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberSubmittedItemsExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNumberPredicatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberDomainBytesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AttributeDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberDomainsExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDomainExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RequestTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateItemNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyRequestedAttributesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberSubmittedAttributesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidQueryExpressionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberDomainAttributesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNumberValueTestsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller(com.amazonaws.services.simpledb.model.AmazonSimpleDBException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("sdb.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/simpledb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/simpledb/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This
     * enables Amazon SimpleDB to optimize requests, which generally yields better throughput.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>1 MB request size</li>
     * <li>25 item limit per BatchDeleteAttributes operation</li>
     * </ul>
     * </p>
     * 
     * @param batchDeleteAttributesRequest
     * @return Result of the BatchDeleteAttributes operation returned by the service.
     * @sample AmazonSimpleDB.BatchDeleteAttributes
     */
    @Override
    public BatchDeleteAttributesResult batchDeleteAttributes(BatchDeleteAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteAttributes(request);
    }

    @SdkInternalApi
    final BatchDeleteAttributesResult executeBatchDeleteAttributes(BatchDeleteAttributesRequest batchDeleteAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteAttributesRequest> request = null;
        Response<BatchDeleteAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteAttributesRequestMarshaller().marshall(super.beforeMarshalling(batchDeleteAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchDeleteAttributesResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<BatchDeleteAttributesResult>(
                    new BatchDeleteAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>BatchPutAttributes</code> operation creates or replaces attributes within one or more items. By using
     * this operation, the client can perform multiple <a>PutAttribute</a> operation with a single call. This helps
     * yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce
     * better throughput.
     * </p>
     * <p>
     * The client may specify the item name with the <code>Item.X.ItemName</code> parameter. The client may specify new
     * attributes using a combination of the <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> parameters. The client may specify the first attribute for the first item
     * using the parameters <code>Item.0.Attribute.0.Name</code> and <code>Item.0.Attribute.0.Value</code>, and for the
     * second attribute for the first item by the parameters <code>Item.0.Attribute.1.Name</code> and
     * <code>Item.0.Attribute.1.Value</code>, and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified within an item by their name/value combination. For example, a single item can
     * have the attributes <code>{ "first_name", "first_value" }</code> and
     * <code>{ "first_name", "second_value" }</code>. However, it cannot have two attribute instances where both the
     * <code>Item.X.Attribute.Y.Name</code> and <code>Item.X.Attribute.Y.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requester can supply the <code>Replace</code> parameter for each individual value. Setting this
     * value to <code>true</code> will cause the new attribute values to replace the existing attribute values. For
     * example, if an item <code>I</code> has the attributes <code>{ 'a', '1' }, { 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requester does a BatchPutAttributes of <code>{'I', 'b', '4' }</code> with the
     * Replace parameter set to true, the final attributes of the item will be <code>{ 'a', '1' }</code> and
     * <code>{ 'b', '4' }</code>, replacing the previous values of the 'b' attribute with the new value.
     * </p>
     * <important> This operation is vulnerable to exceeding the maximum URL size when making a REST request using the
     * HTTP GET method. This operation does not support conditions using <code>Expected.X.Name</code>,
     * <code>Expected.X.Value</code>, or <code>Expected.X.Exists</code>. </important>
     * <p>
     * You can execute multiple <code>BatchPutAttributes</code> operations and other operations in parallel. However,
     * large numbers of concurrent <code>BatchPutAttributes</code> calls can result in Service Unavailable (503)
     * responses.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 attribute name-value pairs per item</li>
     * <li>1 MB request size</li>
     * <li>1 billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
     * </ul>
     * </p>
     * 
     * @param batchPutAttributesRequest
     * @return Result of the BatchPutAttributes operation returned by the service.
     * @throws DuplicateItemNameException
     *         The item name was specified more than once.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws NumberItemAttributesExceededException
     *         Too many attributes in this item.
     * @throws NumberDomainAttributesExceededException
     *         Too many attributes in this domain.
     * @throws NumberDomainBytesExceededException
     *         Too many bytes in this domain.
     * @throws NumberSubmittedItemsExceededException
     *         Too many items exist in a single call.
     * @throws NumberSubmittedAttributesExceededException
     *         Too many attributes exist in a single call.
     * @sample AmazonSimpleDB.BatchPutAttributes
     */
    @Override
    public BatchPutAttributesResult batchPutAttributes(BatchPutAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutAttributes(request);
    }

    @SdkInternalApi
    final BatchPutAttributesResult executeBatchPutAttributes(BatchPutAttributesRequest batchPutAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutAttributesRequest> request = null;
        Response<BatchPutAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutAttributesRequestMarshaller().marshall(super.beforeMarshalling(batchPutAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchPutAttributesResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<BatchPutAttributesResult>(
                    new BatchPutAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateDomain</code> operation creates a new domain. The domain name should be unique among the domains
     * associated with the Access Key ID provided in the request. The <code>CreateDomain</code> operation may take 10 or
     * more seconds to complete.
     * </p>
     * <p>
     * The client can create up to 100 domains per account.
     * </p>
     * <p>
     * If the client requires additional domains, go to <a
     * href="http://aws.amazon.com/contact-us/simpledb-limit-request/">
     * http://aws.amazon.com/contact-us/simpledb-limit-request/</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NumberDomainsExceededException
     *         Too many domains exist per this account.
     * @sample AmazonSimpleDB.CreateDomain
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateDomainResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<CreateDomainResult>(
                    new CreateDomainResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is
     * deleted.
     * </p>
     * <p>
     * <code>DeleteAttributes</code> is an idempotent operation; running it multiple times on the same item or attribute
     * does not result in an error response.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model,
     * performing a <a>GetAttributes</a> or <a>Select</a> operation (read) immediately after a
     * <code>DeleteAttributes</code> or <a>PutAttributes</a> operation (write) might not return updated item data.
     * </p>
     * 
     * @param deleteAttributesRequest
     * @return Result of the DeleteAttributes operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws AttributeDoesNotExistException
     *         The specified attribute does not exist.
     * @sample AmazonSimpleDB.DeleteAttributes
     */
    @Override
    public DeleteAttributesResult deleteAttributes(DeleteAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAttributes(request);
    }

    @SdkInternalApi
    final DeleteAttributesResult executeDeleteAttributes(DeleteAttributesRequest deleteAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttributesRequest> request = null;
        Response<DeleteAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttributesRequestMarshaller().marshall(super.beforeMarshalling(deleteAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAttributesResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<DeleteAttributesResult>(
                    new DeleteAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items (and their attributes) in the domain are
     * deleted as well. The <code>DeleteDomain</code> operation might take 10 or more seconds to complete.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @sample AmazonSimpleDB.DeleteDomain
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDomainResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<DeleteDomainResult>(
                    new DeleteDomainResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the domain, including when the domain was created, the number of items and attributes
     * in the domain, and the size of the attribute names and values.
     * </p>
     * 
     * @param domainMetadataRequest
     * @return Result of the DomainMetadata operation returned by the service.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @sample AmazonSimpleDB.DomainMetadata
     */
    @Override
    public DomainMetadataResult domainMetadata(DomainMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeDomainMetadata(request);
    }

    @SdkInternalApi
    final DomainMetadataResult executeDomainMetadata(DomainMetadataRequest domainMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(domainMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DomainMetadataRequest> request = null;
        Response<DomainMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DomainMetadataRequestMarshaller().marshall(super.beforeMarshalling(domainMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DomainMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DomainMetadataResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<DomainMetadataResult>(
                    new DomainMetadataResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be
     * limited to one or more attributes by specifying an attribute name parameter.
     * </p>
     * <p>
     * If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The
     * system does not return an error as it cannot guarantee the item does not exist on other replicas.
     * </p>
     * 
     * @param getAttributesRequest
     * @return Result of the GetAttributes operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @sample AmazonSimpleDB.GetAttributes
     */
    @Override
    public GetAttributesResult getAttributes(GetAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetAttributes(request);
    }

    @SdkInternalApi
    final GetAttributesResult executeGetAttributes(GetAttributesRequest getAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttributesRequest> request = null;
        Response<GetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttributesRequestMarshaller().marshall(super.beforeMarshalling(getAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAttributesResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<GetAttributesResult>(
                    new GetAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated with the Access Key ID. It returns domain
     * names up to the limit set by <a href="#MaxNumberOfDomains">MaxNumberOfDomains</a>. A <a
     * href="#NextToken">NextToken</a> is returned if there are more than <code>MaxNumberOfDomains</code> domains.
     * Calling <code>ListDomains</code> successive times with the <code>NextToken</code> provided by the operation
     * returns up to <code>MaxNumberOfDomains</code> more domain names with each successive operation call.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidNextTokenException
     *         The specified NextToken is not valid.
     * @sample AmazonSimpleDB.ListDomains
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDomainsResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<ListDomainsResult>(
                    new ListDomainsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDomainsResult listDomains() {
        return listDomains(new ListDomainsRequest());
    }

    /**
     * <p>
     * The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes
     * using a combination of the <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code> parameters. The
     * client specifies the first attribute by the parameters <code>Attribute.0.Name</code> and
     * <code>Attribute.0.Value</code>, the second attribute by the parameters <code>Attribute.1.Name</code> and
     * <code>Attribute.1.Value</code>, and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified in an item by their name/value combination. For example, a single item can
     * have the attributes <code>{ "first_name", "first_value" }</code> and <code>{ "first_name", second_value" }</code>
     * . However, it cannot have two attribute instances where both the <code>Attribute.X.Name</code> and
     * <code>Attribute.X.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requestor can supply the <code>Replace</code> parameter for each individual attribute. Setting
     * this value to <code>true</code> causes the new attribute value to replace the existing attribute value(s). For
     * example, if an item has the attributes <code>{ 'a', '1' }</code>, <code>{ 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requestor calls <code>PutAttributes</code> using the attributes
     * <code>{ 'b', '4' }</code> with the <code>Replace</code> parameter set to true, the final attributes of the item
     * are changed to <code>{ 'a', '1' }</code> and <code>{ 'b', '4' }</code>, which replaces the previous values of the
     * 'b' attribute with the new value.
     * </p>
     * <p>
     * You cannot specify an empty string as an attribute name.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an
     * immediate <a>GetAttributes</a> or <a>Select</a> operation (read) immediately after a <a>PutAttributes</a> or
     * <a>DeleteAttributes</a> operation (write) might not return the updated data.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 total attribute name-value pairs per item</li>
     * <li>One billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * </ul>
     * </p>
     * 
     * @param putAttributesRequest
     * @return Result of the PutAttributes operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws NumberDomainAttributesExceededException
     *         Too many attributes in this domain.
     * @throws NumberDomainBytesExceededException
     *         Too many bytes in this domain.
     * @throws NumberItemAttributesExceededException
     *         Too many attributes in this item.
     * @throws AttributeDoesNotExistException
     *         The specified attribute does not exist.
     * @sample AmazonSimpleDB.PutAttributes
     */
    @Override
    public PutAttributesResult putAttributes(PutAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutAttributes(request);
    }

    @SdkInternalApi
    final PutAttributesResult executePutAttributes(PutAttributesRequest putAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAttributesRequest> request = null;
        Response<PutAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAttributesRequestMarshaller().marshall(super.beforeMarshalling(putAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutAttributesResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<PutAttributesResult>(
                    new PutAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>Select</code> operation returns a set of attributes for <code>ItemNames</code> that match the select
     * expression. <code>Select</code> is similar to the standard SQL SELECT statement.
     * </p>
     * <p>
     * The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number
     * of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but
     * each individual item is 10 kB in size, the system returns 100 items and an appropriate <code>NextToken</code> so
     * the client can access the next page of results.
     * </p>
     * <p>
     * For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the
     * Developer Guide.
     * </p>
     * 
     * @param selectRequest
     * @return Result of the Select operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidNextTokenException
     *         The specified NextToken is not valid.
     * @throws InvalidNumberPredicatesException
     *         Too many predicates exist in the query expression.
     * @throws InvalidNumberValueTestsException
     *         Too many predicates exist in the query expression.
     * @throws InvalidQueryExpressionException
     *         The specified query expression syntax is not valid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws RequestTimeoutException
     *         A timeout occurred when attempting to query the specified domain with specified query expression.
     * @throws TooManyRequestedAttributesException
     *         Too many attributes requested.
     * @sample AmazonSimpleDB.Select
     */
    @Override
    public SelectResult select(SelectRequest request) {
        request = beforeClientExecution(request);
        return executeSelect(request);
    }

    @SdkInternalApi
    final SelectResult executeSelect(SelectRequest selectRequest) {

        ExecutionContext executionContext = createExecutionContext(selectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SelectRequest> request = null;
        Response<SelectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SelectRequestMarshaller().marshall(super.beforeMarshalling(selectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SimpleDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Select");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SelectResult> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<SelectResult>(
                    new SelectResultStaxUnmarshaller());
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
    public com.amazonaws.services.simpledb.SimpleDBResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        ResponseMetadata metadata = client.getResponseMetadataForRequest(request);
        if (metadata != null)
            return new com.amazonaws.services.simpledb.SimpleDBResponseMetadata(metadata);
        else
            return null;
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
