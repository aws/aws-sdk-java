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
package com.amazonaws.services.kinesisanalytics;

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

import com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalyticsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.services.kinesisanalytics.model.transform.*;

/**
 * Client for accessing Kinesis Analytics. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisAnalyticsClient extends AmazonWebServiceClient implements AmazonKinesisAnalytics {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisAnalytics.class);

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
                                    com.amazonaws.services.kinesisanalytics.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnableToDetectSchemaException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.UnableToDetectSchemaException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceProvisionedThroughputExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.ResourceProvisionedThroughputExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidApplicationConfigurationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.InvalidApplicationConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CodeValidationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.CodeValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.UnsupportedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.kinesisanalytics.model.ServiceUnavailableException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesisanalytics.model.AmazonKinesisAnalyticsException.class));

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics. A credentials provider chain will be used
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
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Kinesis Analytics (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonKinesisAnalyticsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Kinesis Analytics (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Kinesis Analytics (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Kinesis Analytics (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonKinesisAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisAnalyticsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonKinesisAnalyticsClientBuilder builder() {
        return AmazonKinesisAnalyticsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAnalyticsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Analytics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAnalyticsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://kinesisanalytics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisanalytics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisanalytics/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a CloudWatch log stream to monitor application configuration errors. For more information about using
     * CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @param addApplicationCloudWatchLoggingOptionRequest
     * @return Result of the AddApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationCloudWatchLoggingOption"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Adds a streaming source to your Amazon Kinesis application. For conceptual information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * <p>
     * You can add a streaming source either when you create an application or you can use this operation to add a
     * streaming source after you create an application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:AddApplicationInput</code> action.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @return Result of the AddApplicationInput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws CodeValidationException
     *         User-provided application code (query) is invalid. This can be a simple syntax error.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationInput"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Adds an <a>InputProcessingConfiguration</a> to an application. An input processor preprocesses records on the
     * input stream before the application's SQL code executes. Currently, the only input processor available is <a
     * href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
     * </p>
     * 
     * @param addApplicationInputProcessingConfigurationRequest
     * @return Result of the AddApplicationInputProcessingConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationInputProcessingConfiguration"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Adds an external destination to your Amazon Kinesis Analytics application.
     * </p>
     * <p>
     * If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an
     * external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS
     * Lambda function), you add the relevant configuration to your application using this operation. You can configure
     * one or more outputs for your application. Each output configuration maps an in-application stream and an external
     * destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your in-application error stream to an external
     * destination so that you can analyze the errors. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Understanding Application
     * Output (Destination)</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * <p>
     * For the limits on the number of application inputs and outputs you can configure, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @return Result of the AddApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationOutput"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Adds a reference data source to an existing application.
     * </p>
     * <p>
     * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
     * within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
     * in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object
     * maps to columns in the resulting in-application table.
     * </p>
     * <p>
     * For conceptual information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>. For the limits on data sources you can add to your application, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @return Result of the AddApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationReferenceDataSource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as
     * input, application code to process the input, and up to three destinations where you want Amazon Kinesis
     * Analytics to write the output data from your application. For an overview, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works.html">How it Works</a>.
     * </p>
     * <p>
     * In the input configuration, you map the streaming source to an in-application stream, which you can think of as a
     * constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each
     * data column in the in-application stream to a data element in the streaming source.
     * </p>
     * <p>
     * Your application code is one or more SQL statements that read input data, transform it, and generate output. Your
     * application code can create one or more SQL artifacts like SQL streams or pumps.
     * </p>
     * <p>
     * In the output configuration, you can configure the application to write data from in-application streams created
     * in your applications to up to three destinations.
     * </p>
     * <p>
     * To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your
     * permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform
     * the <code>kinesisanalytics:CreateApplication</code> action.
     * </p>
     * <p>
     * For introductory exercises to create an Amazon Kinesis Analytics application, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/getting-started.html">Getting Started</a>.
     * </p>
     * 
     * @param createApplicationRequest
     *        TBD
     * @return Result of the CreateApplication operation returned by the service.
     * @throws CodeValidationException
     *         User-provided application code (query) is invalid. This can be a simple syntax error.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws LimitExceededException
     *         Exceeded the number of applications allowed.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @sample AmazonKinesisAnalytics.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/CreateApplication"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the
     * application, including any application artifacts (such as in-application streams, reference table, and
     * application code).
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DeleteApplication</code> action.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplication"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with
     * Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @param deleteApplicationCloudWatchLoggingOptionRequest
     * @return Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationCloudWatchLoggingOption"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationInputProcessingConfiguration"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no
     * longer write data from the corresponding in-application stream to the external output destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DeleteApplicationOutput</code> action.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @return Result of the DeleteApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationOutput"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Deletes a reference data source configuration from the specified application configuration.
     * </p>
     * <p>
     * If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you
     * created using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics.DeleteApplicationReferenceDataSource</code> action.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @return Result of the DeleteApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationReferenceDataSource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Returns information about a specific Amazon Kinesis Analytics application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use the <a>ListApplications</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DescribeApplication</code> action. You
     * can use <code>DescribeApplication</code> to get the current application versionId, which you need to call other
     * operations such as <code>Update</code>.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DescribeApplication"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon
     * Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and
     * also the sample records that the operation used to infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for your application. For conceptual
     * information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses
     * this operation to infer a schema and show it in the console user interface.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DiscoverInputSchema</code> action.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @return Result of the DiscoverInputSchema operation returned by the service.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws UnableToDetectSchemaException
     *         Data format is not valid. Amazon Kinesis Analytics is not able to detect schema for the given streaming
     *         source.
     * @throws ResourceProvisionedThroughputExceededException
     *         Discovery failed to get a record from the streaming source because of the Amazon Kinesis Streams
     *         ProvisionedThroughputExceededException. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html">GetRecords</a> in the
     *         Amazon Kinesis Streams API Reference.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonKinesisAnalytics.DiscoverInputSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DiscoverInputSchema"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response
     * includes the application name, Amazon Resource Name (ARN), and status. If the response returns the
     * <code>HasMoreApplications</code> value as true, you can send another request by adding the
     * <code>ExclusiveStartApplicationName</code> in the request body, and set the value of this to the last application
     * name from the previous response.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use <a>DescribeApplication</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:ListApplications</code> action.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @sample AmazonKinesisAnalytics.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/ListApplications"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively
     * call this operation to start your application.
     * </p>
     * <p>
     * After the application starts, it begins consuming the input data, processes it, and writes the output to the
     * configured destination.
     * </p>
     * <p>
     * The application status must be <code>READY</code> for you to start an application. You can get the application
     * status in the console or using the <a>DescribeApplication</a> operation.
     * </p>
     * <p>
     * After you start the application, you can stop the application from processing the input by calling the
     * <a>StopApplication</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:StartApplication</code> action.
     * </p>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws InvalidApplicationConfigurationException
     *         User-provided application configuration is not valid.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/StartApplication"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Stops the application from processing input data. You can stop an application only if it is in the running state.
     * You can use the <a>DescribeApplication</a> operation to find the application state. After the application is
     * stopped, Amazon Kinesis Analytics stops reading data from the input, the application stops processing data, and
     * there is no output written to the destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:StopApplication</code> action.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/StopApplication"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
     * Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input
     * configuration, and output configuration.
     * </p>
     * <p>
     * Note that Amazon Kinesis Analytics updates the <code>CurrentApplicationVersionId</code> each time you update your
     * application.
     * </p>
     * <p>
     * This operation requires permission for the <code>kinesisanalytics:UpdateApplication</code> action.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws CodeValidationException
     *         User-provided application code (query) is invalid. This can be a simple syntax error.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/UpdateApplication"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis Analytics");
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
