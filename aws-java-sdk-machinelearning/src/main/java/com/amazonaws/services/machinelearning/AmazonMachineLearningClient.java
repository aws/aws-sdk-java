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
package com.amazonaws.services.machinelearning;

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

import com.amazonaws.services.machinelearning.AmazonMachineLearningClientBuilder;
import com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.services.machinelearning.model.transform.*;

/**
 * Client for accessing Amazon Machine Learning. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMachineLearningClient extends AmazonWebServiceClient implements AmazonMachineLearning {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMachineLearning.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "machinelearning";

    private volatile AmazonMachineLearningWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.InvalidTagException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.IdempotentParameterMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagLimitExceededException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.TagLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PredictorNotMountedException").withModeledClass(
                                    com.amazonaws.services.machinelearning.model.PredictorNotMountedException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.machinelearning.model.AmazonMachineLearningException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning. A credentials provider chain will
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
     * @deprecated use {@link AmazonMachineLearningClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonMachineLearningClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon Machine Learning (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonMachineLearningClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonMachineLearningClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonMachineLearningClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonMachineLearningClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonMachineLearningClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Machine Learning (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonMachineLearningClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonMachineLearningClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonMachineLearningClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonMachineLearningClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Machine Learning (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonMachineLearningClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonMachineLearningClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Machine Learning (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonMachineLearningClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonMachineLearningClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonMachineLearningClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonMachineLearningClientBuilder builder() {
        return AmazonMachineLearningClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMachineLearningClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Machine Learning using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMachineLearningClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://machinelearning.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/machinelearning/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/machinelearning/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you
     * add a tag using a key that is already associated with the ML object, <code>AddTags</code> updates the tag's
     * value.
     * </p>
     * 
     * @param addTagsRequest
     * @return Result of the AddTags operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InvalidTagException
     * @throws TagLimitExceededException
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.AddTags
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
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
     * Generates predictions for a group of observations. The observations to process exist in one or more data files
     * referenced by a <code>DataSource</code>. This operation creates a new <code>BatchPrediction</code>, and uses an
     * <code>MLModel</code> and the data files referenced by the <code>DataSource</code> as information sources.
     * </p>
     * <p>
     * <code>CreateBatchPrediction</code> is an asynchronous operation. In response to
     * <code>CreateBatchPrediction</code>, Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>BatchPrediction</code> status to <code>PENDING</code>. After the <code>BatchPrediction</code> completes,
     * Amazon ML sets the status to <code>COMPLETED</code>.
     * </p>
     * <p>
     * You can poll for status updates by using the <a>GetBatchPrediction</a> operation and checking the
     * <code>Status</code> parameter of the result. After the <code>COMPLETED</code> status appears, the results are
     * available in the location specified by the <code>OutputUri</code> parameter.
     * </p>
     * 
     * @param createBatchPredictionRequest
     * @return Result of the CreateBatchPrediction operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This can result from retrying a request
     *         using a parameter that was not present in the original request.
     * @sample AmazonMachineLearning.CreateBatchPrediction
     */
    @Override
    public CreateBatchPredictionResult createBatchPrediction(CreateBatchPredictionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBatchPrediction(request);
    }

    @SdkInternalApi
    final CreateBatchPredictionResult executeCreateBatchPrediction(CreateBatchPredictionRequest createBatchPredictionRequest) {

        ExecutionContext executionContext = createExecutionContext(createBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBatchPredictionRequest> request = null;
        Response<CreateBatchPredictionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBatchPredictionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBatchPrediction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBatchPredictionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateBatchPredictionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> object from an <a href="http://aws.amazon.com/rds/"> Amazon Relational Database
     * Service</a> (Amazon RDS). A <code>DataSource</code> references data that can be used to perform
     * <code>CreateMLModel</code>, <code>CreateEvaluation</code>, or <code>CreateBatchPrediction</code> operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRDS</code> is an asynchronous operation. In response to
     * <code>CreateDataSourceFromRDS</code>, Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code>. After the <code>DataSource</code> is created and ready
     * for use, Amazon ML sets the <code>Status</code> parameter to <code>COMPLETED</code>. <code>DataSource</code> in
     * the <code>COMPLETED</code> or <code>PENDING</code> state can be used only to perform
     * <code>&gt;CreateMLModel</code>&gt;, <code>CreateEvaluation</code>, or <code>CreateBatchPrediction</code>
     * operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the <code>Status</code> parameter to <code>FAILED</code> and
     * includes an error message in the <code>Message</code> attribute of the <code>GetDataSource</code> operation
     * response.
     * </p>
     * 
     * @param createDataSourceFromRDSRequest
     * @return Result of the CreateDataSourceFromRDS operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This can result from retrying a request
     *         using a parameter that was not present in the original request.
     * @sample AmazonMachineLearning.CreateDataSourceFromRDS
     */
    @Override
    public CreateDataSourceFromRDSResult createDataSourceFromRDS(CreateDataSourceFromRDSRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSourceFromRDS(request);
    }

    @SdkInternalApi
    final CreateDataSourceFromRDSResult executeCreateDataSourceFromRDS(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceFromRDSRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceFromRDSRequest> request = null;
        Response<CreateDataSourceFromRDSResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceFromRDSRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataSourceFromRDSRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSourceFromRDS");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceFromRDSResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataSourceFromRDSResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> from a database hosted on an Amazon Redshift cluster. A <code>DataSource</code>
     * references data that can be used to perform either <code>CreateMLModel</code>, <code>CreateEvaluation</code>, or
     * <code>CreateBatchPrediction</code> operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRedshift</code> is an asynchronous operation. In response to
     * <code>CreateDataSourceFromRedshift</code>, Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code>. After the <code>DataSource</code> is created and ready
     * for use, Amazon ML sets the <code>Status</code> parameter to <code>COMPLETED</code>. <code>DataSource</code> in
     * <code>COMPLETED</code> or <code>PENDING</code> states can be used to perform only <code>CreateMLModel</code>,
     * <code>CreateEvaluation</code>, or <code>CreateBatchPrediction</code> operations.
     * </p>
     * <p>
     * If Amazon ML can't accept the input source, it sets the <code>Status</code> parameter to <code>FAILED</code> and
     * includes an error message in the <code>Message</code> attribute of the <code>GetDataSource</code> operation
     * response.
     * </p>
     * <p>
     * The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified
     * by a <code>SelectSqlQuery</code> query. Amazon ML executes an <code>Unload</code> command in Amazon Redshift to
     * transfer the result set of the <code>SelectSqlQuery</code> query to <code>S3StagingLocation</code>.
     * </p>
     * <p>
     * After the <code>DataSource</code> has been created, it's ready for use in evaluations and batch predictions. If
     * you plan to use the <code>DataSource</code> to train an <code>MLModel</code>, the <code>DataSource</code> also
     * requires a recipe. A recipe describes how each input variable will be used in training an <code>MLModel</code>.
     * Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it
     * be combined with another variable or will it be split apart into word combinations? The recipe provides answers
     * to these questions.
     * </p>
     * <?oxy_insert_start author="laurama" timestamp="20160406T153842-0700">
     * <p>
     * You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon
     * Redshift datasource to create a new datasource. To do so, call <code>GetDataSource</code> for an existing
     * datasource and copy the values to a <code>CreateDataSource</code> call. Change the settings that you want to
     * change and make sure that all required fields have the appropriate values.
     * </p>
     * <?oxy_insert_end>
     * 
     * @param createDataSourceFromRedshiftRequest
     * @return Result of the CreateDataSourceFromRedshift operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This can result from retrying a request
     *         using a parameter that was not present in the original request.
     * @sample AmazonMachineLearning.CreateDataSourceFromRedshift
     */
    @Override
    public CreateDataSourceFromRedshiftResult createDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSourceFromRedshift(request);
    }

    @SdkInternalApi
    final CreateDataSourceFromRedshiftResult executeCreateDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceFromRedshiftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceFromRedshiftRequest> request = null;
        Response<CreateDataSourceFromRedshiftResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceFromRedshiftRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataSourceFromRedshiftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSourceFromRedshift");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceFromRedshiftResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataSourceFromRedshiftResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> object. A <code>DataSource</code> references data that can be used to perform
     * <code>CreateMLModel</code>, <code>CreateEvaluation</code>, or <code>CreateBatchPrediction</code> operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromS3</code> is an asynchronous operation. In response to
     * <code>CreateDataSourceFromS3</code>, Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code>. After the <code>DataSource</code> has been created and is
     * ready for use, Amazon ML sets the <code>Status</code> parameter to <code>COMPLETED</code>.
     * <code>DataSource</code> in the <code>COMPLETED</code> or <code>PENDING</code> state can be used to perform only
     * <code>CreateMLModel</code>, <code>CreateEvaluation</code> or <code>CreateBatchPrediction</code> operations.
     * </p>
     * <p>
     * If Amazon ML can't accept the input source, it sets the <code>Status</code> parameter to <code>FAILED</code> and
     * includes an error message in the <code>Message</code> attribute of the <code>GetDataSource</code> operation
     * response.
     * </p>
     * <p>
     * The observation data used in a <code>DataSource</code> should be ready to use; that is, it should have a
     * consistent structure, and missing data values should be kept to a minimum. The observation data must reside in
     * one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that
     * describes the data items by name and type. The same schema must be used for all of the data files referenced by
     * the <code>DataSource</code>.
     * </p>
     * <p>
     * After the <code>DataSource</code> has been created, it's ready to use in evaluations and batch predictions. If
     * you plan to use the <code>DataSource</code> to train an <code>MLModel</code>, the <code>DataSource</code> also
     * needs a recipe. A recipe describes how each input variable will be used in training an <code>MLModel</code>. Will
     * the variable be included or excluded from training? Will the variable be manipulated; for example, will it be
     * combined with another variable or will it be split apart into word combinations? The recipe provides answers to
     * these questions.
     * </p>
     * 
     * @param createDataSourceFromS3Request
     * @return Result of the CreateDataSourceFromS3 operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This can result from retrying a request
     *         using a parameter that was not present in the original request.
     * @sample AmazonMachineLearning.CreateDataSourceFromS3
     */
    @Override
    public CreateDataSourceFromS3Result createDataSourceFromS3(CreateDataSourceFromS3Request request) {
        request = beforeClientExecution(request);
        return executeCreateDataSourceFromS3(request);
    }

    @SdkInternalApi
    final CreateDataSourceFromS3Result executeCreateDataSourceFromS3(CreateDataSourceFromS3Request createDataSourceFromS3Request) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceFromS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceFromS3Request> request = null;
        Response<CreateDataSourceFromS3Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceFromS3RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSourceFromS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSourceFromS3");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceFromS3Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataSourceFromS3ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new <code>Evaluation</code> of an <code>MLModel</code>. An <code>MLModel</code> is evaluated on a set
     * of observations associated to a <code>DataSource</code>. Like a <code>DataSource</code> for an
     * <code>MLModel</code>, the <code>DataSource</code> for an <code>Evaluation</code> contains values for the
     * <code>Target Variable</code>. The <code>Evaluation</code> compares the predicted result for each observation to
     * the actual outcome and provides a summary so that you know how effective the <code>MLModel</code> functions on
     * the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or
     * MulticlassAvgFScore based on the corresponding <code>MLModelType</code>: <code>BINARY</code>,
     * <code>REGRESSION</code> or <code>MULTICLASS</code>.
     * </p>
     * <p>
     * <code>CreateEvaluation</code> is an asynchronous operation. In response to <code>CreateEvaluation</code>, Amazon
     * Machine Learning (Amazon ML) immediately returns and sets the evaluation status to <code>PENDING</code>. After
     * the <code>Evaluation</code> is created and ready for use, Amazon ML sets the status to <code>COMPLETED</code>.
     * </p>
     * <p>
     * You can use the <code>GetEvaluation</code> operation to check progress of the evaluation during the creation
     * operation.
     * </p>
     * 
     * @param createEvaluationRequest
     * @return Result of the CreateEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This can result from retrying a request
     *         using a parameter that was not present in the original request.
     * @sample AmazonMachineLearning.CreateEvaluation
     */
    @Override
    public CreateEvaluationResult createEvaluation(CreateEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEvaluation(request);
    }

    @SdkInternalApi
    final CreateEvaluationResult executeCreateEvaluation(CreateEvaluationRequest createEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(createEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEvaluationRequest> request = null;
        Response<CreateEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new <code>MLModel</code> using the <code>DataSource</code> and the recipe as information sources.
     * </p>
     * <p>
     * An <code>MLModel</code> is nearly immutable. Users can update only the <code>MLModelName</code> and the
     * <code>ScoreThreshold</code> in an <code>MLModel</code> without creating a new <code>MLModel</code>.
     * </p>
     * <p>
     * <code>CreateMLModel</code> is an asynchronous operation. In response to <code>CreateMLModel</code>, Amazon
     * Machine Learning (Amazon ML) immediately returns and sets the <code>MLModel</code> status to <code>PENDING</code>
     * . After the <code>MLModel</code> has been created and ready is for use, Amazon ML sets the status to
     * <code>COMPLETED</code>.
     * </p>
     * <p>
     * You can use the <code>GetMLModel</code> operation to check the progress of the <code>MLModel</code> during the
     * creation operation.
     * </p>
     * <p>
     * <code>CreateMLModel</code> requires a <code>DataSource</code> with computed statistics, which can be created by
     * setting <code>ComputeStatistics</code> to <code>true</code> in <code>CreateDataSourceFromRDS</code>,
     * <code>CreateDataSourceFromS3</code>, or <code>CreateDataSourceFromRedshift</code> operations.
     * </p>
     * 
     * @param createMLModelRequest
     * @return Result of the CreateMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This can result from retrying a request
     *         using a parameter that was not present in the original request.
     * @sample AmazonMachineLearning.CreateMLModel
     */
    @Override
    public CreateMLModelResult createMLModel(CreateMLModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMLModel(request);
    }

    @SdkInternalApi
    final CreateMLModelResult executeCreateMLModel(CreateMLModelRequest createMLModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMLModelRequest> request = null;
        Response<CreateMLModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMLModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMLModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMLModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMLModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code>. The endpoint contains the URI of the
     * <code>MLModel</code>; that is, the location to send real-time prediction requests for the specified
     * <code>MLModel</code>.
     * </p>
     * 
     * @param createRealtimeEndpointRequest
     * @return Result of the CreateRealtimeEndpoint operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.CreateRealtimeEndpoint
     */
    @Override
    public CreateRealtimeEndpointResult createRealtimeEndpoint(CreateRealtimeEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRealtimeEndpoint(request);
    }

    @SdkInternalApi
    final CreateRealtimeEndpointResult executeCreateRealtimeEndpoint(CreateRealtimeEndpointRequest createRealtimeEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createRealtimeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRealtimeEndpointRequest> request = null;
        Response<CreateRealtimeEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRealtimeEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRealtimeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRealtimeEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRealtimeEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRealtimeEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the DELETED status to a <code>BatchPrediction</code>, rendering it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteBatchPrediction</code> operation, you can use the <a>GetBatchPrediction</a> operation
     * to verify that the status of the <code>BatchPrediction</code> changed to DELETED.
     * </p>
     * <p>
     * <b>Caution:</b> The result of the <code>DeleteBatchPrediction</code> operation is irreversible.
     * </p>
     * 
     * @param deleteBatchPredictionRequest
     * @return Result of the DeleteBatchPrediction operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteBatchPrediction
     */
    @Override
    public DeleteBatchPredictionResult deleteBatchPrediction(DeleteBatchPredictionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBatchPrediction(request);
    }

    @SdkInternalApi
    final DeleteBatchPredictionResult executeDeleteBatchPrediction(DeleteBatchPredictionRequest deleteBatchPredictionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBatchPredictionRequest> request = null;
        Response<DeleteBatchPredictionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBatchPredictionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBatchPrediction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBatchPredictionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteBatchPredictionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the DELETED status to a <code>DataSource</code>, rendering it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteDataSource</code> operation, you can use the <a>GetDataSource</a> operation to verify
     * that the status of the <code>DataSource</code> changed to DELETED.
     * </p>
     * <p>
     * <b>Caution:</b> The results of the <code>DeleteDataSource</code> operation are irreversible.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteDataSource
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
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
     * Assigns the <code>DELETED</code> status to an <code>Evaluation</code>, rendering it unusable.
     * </p>
     * <p>
     * After invoking the <code>DeleteEvaluation</code> operation, you can use the <code>GetEvaluation</code> operation
     * to verify that the status of the <code>Evaluation</code> changed to <code>DELETED</code>.
     * </p>
     * <caution><title>Caution</title>
     * <p>
     * The results of the <code>DeleteEvaluation</code> operation are irreversible.
     * </p>
     * </caution>
     * 
     * @param deleteEvaluationRequest
     * @return Result of the DeleteEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteEvaluation
     */
    @Override
    public DeleteEvaluationResult deleteEvaluation(DeleteEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEvaluation(request);
    }

    @SdkInternalApi
    final DeleteEvaluationResult executeDeleteEvaluation(DeleteEvaluationRequest deleteEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEvaluationRequest> request = null;
        Response<DeleteEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the <code>DELETED</code> status to an <code>MLModel</code>, rendering it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteMLModel</code> operation, you can use the <code>GetMLModel</code> operation to verify
     * that the status of the <code>MLModel</code> changed to DELETED.
     * </p>
     * <p>
     * <b>Caution:</b> The result of the <code>DeleteMLModel</code> operation is irreversible.
     * </p>
     * 
     * @param deleteMLModelRequest
     * @return Result of the DeleteMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteMLModel
     */
    @Override
    public DeleteMLModelResult deleteMLModel(DeleteMLModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMLModel(request);
    }

    @SdkInternalApi
    final DeleteMLModelResult executeDeleteMLModel(DeleteMLModelRequest deleteMLModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMLModelRequest> request = null;
        Response<DeleteMLModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMLModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMLModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMLModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMLModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code>.
     * </p>
     * 
     * @param deleteRealtimeEndpointRequest
     * @return Result of the DeleteRealtimeEndpoint operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteRealtimeEndpoint
     */
    @Override
    public DeleteRealtimeEndpointResult deleteRealtimeEndpoint(DeleteRealtimeEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRealtimeEndpoint(request);
    }

    @SdkInternalApi
    final DeleteRealtimeEndpointResult executeDeleteRealtimeEndpoint(DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRealtimeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRealtimeEndpointRequest> request = null;
        Response<DeleteRealtimeEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRealtimeEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRealtimeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRealtimeEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRealtimeEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRealtimeEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover
     * deleted tags.
     * </p>
     * <p>
     * If you specify a tag that doesn't exist, Amazon ML ignores it.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InvalidTagException
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteTags
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match the search criteria in the request.
     * </p>
     * 
     * @param describeBatchPredictionsRequest
     * @return Result of the DescribeBatchPredictions operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeBatchPredictions
     */
    @Override
    public DescribeBatchPredictionsResult describeBatchPredictions(DescribeBatchPredictionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBatchPredictions(request);
    }

    @SdkInternalApi
    final DescribeBatchPredictionsResult executeDescribeBatchPredictions(DescribeBatchPredictionsRequest describeBatchPredictionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBatchPredictionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBatchPredictionsRequest> request = null;
        Response<DescribeBatchPredictionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBatchPredictionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeBatchPredictionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBatchPredictions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBatchPredictionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeBatchPredictionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeBatchPredictionsResult describeBatchPredictions() {
        return describeBatchPredictions(new DescribeBatchPredictionsRequest());
    }

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search criteria in the request.
     * </p>
     * 
     * @param describeDataSourcesRequest
     * @return Result of the DescribeDataSources operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeDataSources
     */
    @Override
    public DescribeDataSourcesResult describeDataSources(DescribeDataSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataSources(request);
    }

    @SdkInternalApi
    final DescribeDataSourcesResult executeDescribeDataSources(DescribeDataSourcesRequest describeDataSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourcesRequest> request = null;
        Response<DescribeDataSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDataSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDataSourcesResult describeDataSources() {
        return describeDataSources(new DescribeDataSourcesRequest());
    }

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the search criteria in the request.
     * </p>
     * 
     * @param describeEvaluationsRequest
     * @return Result of the DescribeEvaluations operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeEvaluations
     */
    @Override
    public DescribeEvaluationsResult describeEvaluations(DescribeEvaluationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvaluations(request);
    }

    @SdkInternalApi
    final DescribeEvaluationsResult executeDescribeEvaluations(DescribeEvaluationsRequest describeEvaluationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEvaluationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEvaluationsRequest> request = null;
        Response<DescribeEvaluationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEvaluationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEvaluationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvaluations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEvaluationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEvaluationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEvaluationsResult describeEvaluations() {
        return describeEvaluations(new DescribeEvaluationsRequest());
    }

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria in the request.
     * </p>
     * 
     * @param describeMLModelsRequest
     * @return Result of the DescribeMLModels operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeMLModels
     */
    @Override
    public DescribeMLModelsResult describeMLModels(DescribeMLModelsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMLModels(request);
    }

    @SdkInternalApi
    final DescribeMLModelsResult executeDescribeMLModels(DescribeMLModelsRequest describeMLModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMLModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMLModelsRequest> request = null;
        Response<DescribeMLModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMLModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMLModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMLModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMLModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMLModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeMLModelsResult describeMLModels() {
        return describeMLModels(new DescribeMLModelsRequest());
    }

    /**
     * <p>
     * Describes one or more of the tags for your Amazon ML object.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeTags
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed metadata, status, and data file information for a
     * <code>Batch Prediction</code> request.
     * </p>
     * 
     * @param getBatchPredictionRequest
     * @return Result of the GetBatchPrediction operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetBatchPrediction
     */
    @Override
    public GetBatchPredictionResult getBatchPrediction(GetBatchPredictionRequest request) {
        request = beforeClientExecution(request);
        return executeGetBatchPrediction(request);
    }

    @SdkInternalApi
    final GetBatchPredictionResult executeGetBatchPrediction(GetBatchPredictionRequest getBatchPredictionRequest) {

        ExecutionContext executionContext = createExecutionContext(getBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBatchPredictionRequest> request = null;
        Response<GetBatchPredictionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBatchPredictionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBatchPrediction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBatchPredictionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBatchPredictionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>DataSource</code> that includes metadata and data file information, as well as the current status
     * of the <code>DataSource</code>.
     * </p>
     * <p>
     * <code>GetDataSource</code> provides results in normal or verbose format. The verbose format adds the schema
     * description and the list of files pointed to by the DataSource to the normal format.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetDataSource
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
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
     * Returns an <code>Evaluation</code> that includes metadata as well as the current status of the
     * <code>Evaluation</code>.
     * </p>
     * 
     * @param getEvaluationRequest
     * @return Result of the GetEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetEvaluation
     */
    @Override
    public GetEvaluationResult getEvaluation(GetEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvaluation(request);
    }

    @SdkInternalApi
    final GetEvaluationResult executeGetEvaluation(GetEvaluationRequest getEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvaluationRequest> request = null;
        Response<GetEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an <code>MLModel</code> that includes detailed metadata, data source information, and the current status
     * of the <code>MLModel</code>.
     * </p>
     * <p>
     * <code>GetMLModel</code> provides results in normal or verbose format.
     * </p>
     * 
     * @param getMLModelRequest
     * @return Result of the GetMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetMLModel
     */
    @Override
    public GetMLModelResult getMLModel(GetMLModelRequest request) {
        request = beforeClientExecution(request);
        return executeGetMLModel(request);
    }

    @SdkInternalApi
    final GetMLModelResult executeGetMLModel(GetMLModelRequest getMLModelRequest) {

        ExecutionContext executionContext = createExecutionContext(getMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLModelRequest> request = null;
        Response<GetMLModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMLModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMLModelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMLModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a prediction for the observation using the specified <code>ML Model</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * Not all response parameters will be populated. Whether a response parameter is populated depends on the type of
     * model requested.
     * </p>
     * </note>
     * 
     * @param predictRequest
     * @return Result of the Predict operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws LimitExceededException
     *         The subscriber exceeded the maximum number of operations. This exception can occur when listing objects
     *         such as <code>DataSource</code>.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws PredictorNotMountedException
     *         The exception is thrown when a predict request is made to an unmounted <code>MLModel</code>.
     * @sample AmazonMachineLearning.Predict
     */
    @Override
    public PredictResult predict(PredictRequest request) {
        request = beforeClientExecution(request);
        return executePredict(request);
    }

    @SdkInternalApi
    final PredictResult executePredict(PredictRequest predictRequest) {

        ExecutionContext executionContext = createExecutionContext(predictRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PredictRequest> request = null;
        Response<PredictResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PredictRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(predictRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Predict");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PredictResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PredictResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the <code>BatchPredictionName</code> of a <code>BatchPrediction</code>.
     * </p>
     * <p>
     * You can use the <code>GetBatchPrediction</code> operation to view the contents of the updated data element.
     * </p>
     * 
     * @param updateBatchPredictionRequest
     * @return Result of the UpdateBatchPrediction operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateBatchPrediction
     */
    @Override
    public UpdateBatchPredictionResult updateBatchPrediction(UpdateBatchPredictionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBatchPrediction(request);
    }

    @SdkInternalApi
    final UpdateBatchPredictionResult executeUpdateBatchPrediction(UpdateBatchPredictionRequest updateBatchPredictionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBatchPredictionRequest> request = null;
        Response<UpdateBatchPredictionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBatchPredictionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBatchPrediction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBatchPredictionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateBatchPredictionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the <code>DataSourceName</code> of a <code>DataSource</code>.
     * </p>
     * <p>
     * You can use the <code>GetDataSource</code> operation to view the contents of the updated data element.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateDataSource
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
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
     * Updates the <code>EvaluationName</code> of an <code>Evaluation</code>.
     * </p>
     * <p>
     * You can use the <code>GetEvaluation</code> operation to view the contents of the updated data element.
     * </p>
     * 
     * @param updateEvaluationRequest
     * @return Result of the UpdateEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateEvaluation
     */
    @Override
    public UpdateEvaluationResult updateEvaluation(UpdateEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEvaluation(request);
    }

    @SdkInternalApi
    final UpdateEvaluationResult executeUpdateEvaluation(UpdateEvaluationRequest updateEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEvaluationRequest> request = null;
        Response<UpdateEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the <code>MLModelName</code> and the <code>ScoreThreshold</code> of an <code>MLModel</code>.
     * </p>
     * <p>
     * You can use the <code>GetMLModel</code> operation to view the contents of the updated data element.
     * </p>
     * 
     * @param updateMLModelRequest
     * @return Result of the UpdateMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateMLModel
     */
    @Override
    public UpdateMLModelResult updateMLModel(UpdateMLModelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMLModel(request);
    }

    @SdkInternalApi
    final UpdateMLModelResult executeUpdateMLModel(UpdateMLModelRequest updateMLModelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMLModelRequest> request = null;
        Response<UpdateMLModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMLModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Machine Learning");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMLModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMLModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMLModelResultJsonUnmarshaller());
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
    public AmazonMachineLearningWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonMachineLearningWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
