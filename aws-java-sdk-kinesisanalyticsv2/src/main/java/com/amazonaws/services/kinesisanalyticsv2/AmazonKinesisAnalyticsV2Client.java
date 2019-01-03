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
package com.amazonaws.services.kinesisanalyticsv2;

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

import com.amazonaws.services.kinesisanalyticsv2.AmazonKinesisAnalyticsV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.services.kinesisanalyticsv2.model.transform.*;

/**
 * Client for accessing Kinesis Analytics V2. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Documentation for Kinesis Data Analytics API v2
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisAnalyticsV2Client extends AmazonWebServiceClient implements AmazonKinesisAnalyticsV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisAnalyticsV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kinesisanalytics";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnableToDetectSchemaException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.UnableToDetectSchemaException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceProvisionedThroughputExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.ResourceProvisionedThroughputExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidApplicationConfigurationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.InvalidApplicationConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeValidationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.CodeValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.UnsupportedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.kinesisanalyticsv2.model.ServiceUnavailableException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesisanalyticsv2.model.AmazonKinesisAnalyticsV2Exception.class));

    public static AmazonKinesisAnalyticsV2ClientBuilder builder() {
        return AmazonKinesisAnalyticsV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAnalyticsV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAnalyticsV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kinesisanalytics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisanalyticsv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisanalyticsv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @param addApplicationCloudWatchLoggingOptionRequest
     * @return Result of the AddApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddApplicationCloudWatchLoggingOptionResult addApplicationCloudWatchLoggingOption(AddApplicationCloudWatchLoggingOptionRequest request) {
        request = beforeClientExecution(request);
        return executeAddApplicationCloudWatchLoggingOption(request);
    }

    @SdkInternalApi
    final AddApplicationCloudWatchLoggingOptionResult executeAddApplicationCloudWatchLoggingOption(
            AddApplicationCloudWatchLoggingOptionRequest addApplicationCloudWatchLoggingOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(addApplicationCloudWatchLoggingOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddApplicationCloudWatchLoggingOptionRequest> request = null;
        Response<AddApplicationCloudWatchLoggingOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddApplicationCloudWatchLoggingOptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addApplicationCloudWatchLoggingOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddApplicationCloudWatchLoggingOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddApplicationCloudWatchLoggingOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddApplicationCloudWatchLoggingOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * You can add a streaming source when you create an application, or you can use this operation to add a streaming
     * source after you create an application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @return Result of the AddApplicationInput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws CodeValidationException
     *         The user-provided application code (query) is not valid. This can be a simple syntax error.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddApplicationInputResult addApplicationInput(AddApplicationInputRequest request) {
        request = beforeClientExecution(request);
        return executeAddApplicationInput(request);
    }

    @SdkInternalApi
    final AddApplicationInputResult executeAddApplicationInput(AddApplicationInputRequest addApplicationInputRequest) {

        ExecutionContext executionContext = createExecutionContext(addApplicationInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddApplicationInputRequest> request = null;
        Response<AddApplicationInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddApplicationInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addApplicationInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddApplicationInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddApplicationInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddApplicationInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an <a>InputProcessingConfiguration</a> to an SQL-based Kinesis Data Analytics application. An input
     * processor pre-processes records on the input stream before the application's SQL code executes. Currently, the
     * only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
     * </p>
     * 
     * @param addApplicationInputProcessingConfigurationRequest
     * @return Result of the AddApplicationInputProcessingConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddApplicationInputProcessingConfigurationResult addApplicationInputProcessingConfiguration(AddApplicationInputProcessingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeAddApplicationInputProcessingConfiguration(request);
    }

    @SdkInternalApi
    final AddApplicationInputProcessingConfigurationResult executeAddApplicationInputProcessingConfiguration(
            AddApplicationInputProcessingConfigurationRequest addApplicationInputProcessingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(addApplicationInputProcessingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddApplicationInputProcessingConfigurationRequest> request = null;
        Response<AddApplicationInputProcessingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddApplicationInputProcessingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addApplicationInputProcessingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddApplicationInputProcessingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddApplicationInputProcessingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AddApplicationInputProcessingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an
     * external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda
     * function), you add the relevant configuration to your application using this operation. You can configure one or
     * more outputs for your application. Each output configuration maps an in-application stream and an external
     * destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your in-application error stream to an external
     * destination so that you can analyze the errors.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @return Result of the AddApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddApplicationOutputResult addApplicationOutput(AddApplicationOutputRequest request) {
        request = beforeClientExecution(request);
        return executeAddApplicationOutput(request);
    }

    @SdkInternalApi
    final AddApplicationOutputResult executeAddApplicationOutput(AddApplicationOutputRequest addApplicationOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(addApplicationOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddApplicationOutputRequest> request = null;
        Response<AddApplicationOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddApplicationOutputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addApplicationOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddApplicationOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddApplicationOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddApplicationOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
     * within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
     * in-application table to create, and the necessary mapping information that describes how data in an Amazon S3
     * object maps to columns in the resulting in-application table.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @return Result of the AddApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddApplicationReferenceDataSourceResult addApplicationReferenceDataSource(AddApplicationReferenceDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddApplicationReferenceDataSource(request);
    }

    @SdkInternalApi
    final AddApplicationReferenceDataSourceResult executeAddApplicationReferenceDataSource(
            AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addApplicationReferenceDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddApplicationReferenceDataSourceRequest> request = null;
        Response<AddApplicationReferenceDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddApplicationReferenceDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addApplicationReferenceDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddApplicationReferenceDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddApplicationReferenceDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddApplicationReferenceDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics
     * application, see <a href="https://docs.aws.amazon.com/kinesisanalytics/latest/Java/creating-app.html">Creating an
     * Application</a>.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta release. Using SQL parameters (such as
     * <a>SqlApplicationConfiguration</a>) will result in an error.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws CodeValidationException
     *         The user-provided application code (query) is not valid. This can be a simple syntax error.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws LimitExceededException
     *         The number of allowed resources has been exceeded.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of the application's state data.
     * </p>
     * 
     * @param createApplicationSnapshotRequest
     * @return Result of the CreateApplicationSnapshot operation returned by the service.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws LimitExceededException
     *         The number of allowed resources has been exceeded.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.CreateApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationSnapshotResult createApplicationSnapshot(CreateApplicationSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplicationSnapshot(request);
    }

    @SdkInternalApi
    final CreateApplicationSnapshotResult executeCreateApplicationSnapshot(CreateApplicationSnapshotRequest createApplicationSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationSnapshotRequest> request = null;
        Response<CreateApplicationSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createApplicationSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplicationSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateApplicationSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the
     * application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application.
     * </p>
     * 
     * @param deleteApplicationCloudWatchLoggingOptionRequest
     * @return Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationCloudWatchLoggingOptionResult deleteApplicationCloudWatchLoggingOption(DeleteApplicationCloudWatchLoggingOptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationCloudWatchLoggingOption(request);
    }

    @SdkInternalApi
    final DeleteApplicationCloudWatchLoggingOptionResult executeDeleteApplicationCloudWatchLoggingOption(
            DeleteApplicationCloudWatchLoggingOptionRequest deleteApplicationCloudWatchLoggingOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationCloudWatchLoggingOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationCloudWatchLoggingOptionRequest> request = null;
        Response<DeleteApplicationCloudWatchLoggingOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationCloudWatchLoggingOptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationCloudWatchLoggingOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationCloudWatchLoggingOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationCloudWatchLoggingOptionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteApplicationCloudWatchLoggingOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an <a>InputProcessingConfiguration</a> from an input.
     * </p>
     * 
     * @param deleteApplicationInputProcessingConfigurationRequest
     * @return Result of the DeleteApplicationInputProcessingConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationInputProcessingConfigurationResult deleteApplicationInputProcessingConfiguration(
            DeleteApplicationInputProcessingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationInputProcessingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteApplicationInputProcessingConfigurationResult executeDeleteApplicationInputProcessingConfiguration(
            DeleteApplicationInputProcessingConfigurationRequest deleteApplicationInputProcessingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationInputProcessingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationInputProcessingConfigurationRequest> request = null;
        Response<DeleteApplicationInputProcessingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationInputProcessingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationInputProcessingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationInputProcessingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationInputProcessingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteApplicationInputProcessingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's
     * configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to
     * the external output destination.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @return Result of the DeleteApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationOutputResult deleteApplicationOutput(DeleteApplicationOutputRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationOutput(request);
    }

    @SdkInternalApi
    final DeleteApplicationOutputResult executeDeleteApplicationOutput(DeleteApplicationOutputRequest deleteApplicationOutputRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationOutputRequest> request = null;
        Response<DeleteApplicationOutputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationOutputRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationOutputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationOutput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationOutputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationOutputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics
     * application's configuration.
     * </p>
     * <p>
     * If the application is running, Kinesis Data Analytics immediately removes the in-application table that you
     * created using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @return Result of the DeleteApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationReferenceDataSource(request);
    }

    @SdkInternalApi
    final DeleteApplicationReferenceDataSourceResult executeDeleteApplicationReferenceDataSource(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationReferenceDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationReferenceDataSourceRequest> request = null;
        Response<DeleteApplicationReferenceDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationReferenceDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationReferenceDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationReferenceDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationReferenceDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationReferenceDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a snapshot of application state.
     * </p>
     * 
     * @param deleteApplicationSnapshotRequest
     * @return Result of the DeleteApplicationSnapshot operation returned by the service.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationSnapshotResult deleteApplicationSnapshot(DeleteApplicationSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationSnapshot(request);
    }

    @SdkInternalApi
    final DeleteApplicationSnapshotResult executeDeleteApplicationSnapshot(DeleteApplicationSnapshotRequest deleteApplicationSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationSnapshotRequest> request = null;
        Response<DeleteApplicationSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use the <a>ListApplications</a> operation.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationResult describeApplication(DescribeApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplication(request);
    }

    @SdkInternalApi
    final DescribeApplicationResult executeDescribeApplication(DescribeApplicationRequest describeApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationRequest> request = null;
        Response<DescribeApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a snapshot of application state data.
     * </p>
     * 
     * @param describeApplicationSnapshotRequest
     * @return Result of the DescribeApplicationSnapshot operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AmazonKinesisAnalyticsV2.DescribeApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationSnapshotResult describeApplicationSnapshot(DescribeApplicationSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationSnapshot(request);
    }

    @SdkInternalApi
    final DescribeApplicationSnapshotResult executeDescribeApplicationSnapshot(DescribeApplicationSnapshotRequest describeApplicationSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationSnapshotRequest> request = null;
        Response<DescribeApplicationSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicationSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeApplicationSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the
     * specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In
     * the response, the operation returns the inferred schema and also the sample records that the operation used to
     * infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for your application. When you create an
     * application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show
     * it in the console user interface.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @return Result of the DiscoverInputSchema operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnableToDetectSchemaException
     *         The data format is not valid. Amazon Kinesis Data Analytics cannot detect the schema for the given
     *         streaming source.
     * @throws ResourceProvisionedThroughputExceededException
     *         Discovery failed to get a record from the streaming source because of the Amazon Kinesis Streams
     *         <code>ProvisionedThroughputExceededException</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html">GetRecords</a> in the
     *         Amazon Kinesis Streams API Reference.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DiscoverInputSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DiscoverInputSchema"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DiscoverInputSchemaResult discoverInputSchema(DiscoverInputSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeDiscoverInputSchema(request);
    }

    @SdkInternalApi
    final DiscoverInputSchemaResult executeDiscoverInputSchema(DiscoverInputSchemaRequest discoverInputSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(discoverInputSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DiscoverInputSchemaRequest> request = null;
        Response<DiscoverInputSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DiscoverInputSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(discoverInputSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DiscoverInputSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DiscoverInputSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DiscoverInputSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about the current application snapshots.
     * </p>
     * 
     * @param listApplicationSnapshotsRequest
     * @return Result of the ListApplicationSnapshots operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AmazonKinesisAnalyticsV2.ListApplicationSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationSnapshotsResult listApplicationSnapshots(ListApplicationSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationSnapshots(request);
    }

    @SdkInternalApi
    final ListApplicationSnapshotsResult executeListApplicationSnapshots(ListApplicationSnapshotsRequest listApplicationSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationSnapshotsRequest> request = null;
        Response<ListApplicationSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response
     * includes the application name, Amazon Resource Name (ARN), and status.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use <a>DescribeApplication</a>.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must
     * exclusively call this operation to start your application.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta. Using SQL parameters (such as
     * <a>RunConfiguration$SqlRunConfigurations</a>) will result in an error.
     * </p>
     * </note>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidApplicationConfigurationException
     *         The user-provided application configuration is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartApplicationResult startApplication(StartApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStartApplication(request);
    }

    @SdkInternalApi
    final StartApplicationResult executeStartApplication(StartApplicationRequest startApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(startApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartApplicationRequest> request = null;
        Response<StartApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the application from processing data. You can stop an application only if it is in the running state. You
     * can use the <a>DescribeApplication</a> operation to find the application state.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StopApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopApplicationResult stopApplication(StopApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStopApplication(request);
    }

    @SdkInternalApi
    final StopApplicationResult executeStopApplication(StopApplicationRequest stopApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopApplicationRequest> request = null;
        Response<StopApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application
     * code, input configuration, and output configuration.
     * </p>
     * <p>
     * Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time you update your application.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta. Using SQL parameters (such as <a>SqlApplicationConfigurationUpdate</a>)
     * will result in an error.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws CodeValidationException
     *         The user-provided application code (query) is not valid. This can be a simple syntax error.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
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
