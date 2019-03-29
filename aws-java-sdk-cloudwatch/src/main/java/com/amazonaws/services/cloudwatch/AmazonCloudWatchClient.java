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
package com.amazonaws.services.cloudwatch;

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

import com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder;
import com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.model.transform.*;

/**
 * Client for accessing CloudWatch. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the applications you run on AWS in real time.
 * You can use CloudWatch to collect and track metrics, which are the variables you want to measure for your resources
 * and applications.
 * </p>
 * <p>
 * CloudWatch alarms send notifications or automatically change the resources you are monitoring based on rules that you
 * define. For example, you can monitor the CPU usage and disk reads and writes of your Amazon EC2 instances. Then, use
 * this data to determine whether you should launch additional instances to handle increased load. You can also use this
 * data to stop under-used instances to save money.
 * </p>
 * <p>
 * In addition to monitoring the built-in metrics that come with AWS, you can monitor your own custom metrics. With
 * CloudWatch, you gain system-wide visibility into resource utilization, application performance, and operational
 * health.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchClient extends AmazonWebServiceClient implements AmazonCloudWatch {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudWatch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "monitoring";

    private volatile AmazonCloudWatchWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on CloudWatch. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudWatchClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudWatchClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to CloudWatch (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudWatchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudWatchClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudWatchClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudWatchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudWatch (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonCloudWatchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudWatchClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudWatch (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonCloudWatchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudWatch (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudWatchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudWatchClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudWatchClientBuilder builder() {
        return AmazonCloudWatchClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingRequiredParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DashboardNotFoundErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DashboardInvalidInputErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.cloudwatch.model.AmazonCloudWatchException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://monitoring.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudwatch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudwatch/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified alarms. In the event of an error, no alarms are deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @return Result of the DeleteAlarms operation returned by the service.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @sample AmazonCloudWatch.DeleteAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAlarmsResult deleteAlarms(DeleteAlarmsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlarms(request);
    }

    @SdkInternalApi
    final DeleteAlarmsResult executeDeleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlarmsRequest> request = null;
        Response<DeleteAlarmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlarmsRequestMarshaller().marshall(super.beforeMarshalling(deleteAlarmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlarms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAlarmsResult> responseHandler = new StaxResponseHandler<DeleteAlarmsResult>(new DeleteAlarmsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all dashboards that you specify. You may specify up to 100 dashboards to delete. If there is an error
     * during this call, no dashboards are deleted.
     * </p>
     * 
     * @param deleteDashboardsRequest
     * @return Result of the DeleteDashboards operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws DashboardNotFoundErrorException
     *         The specified dashboard does not exist.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.DeleteDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDashboardsResult deleteDashboards(DeleteDashboardsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDashboards(request);
    }

    @SdkInternalApi
    final DeleteDashboardsResult executeDeleteDashboards(DeleteDashboardsRequest deleteDashboardsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDashboardsRequest> request = null;
        Response<DeleteDashboardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDashboardsRequestMarshaller().marshall(super.beforeMarshalling(deleteDashboardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDashboards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDashboardsResult> responseHandler = new StaxResponseHandler<DeleteDashboardsResult>(
                    new DeleteDashboardsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm
     * name is not specified, the histories for all alarms are returned.
     * </p>
     * <p>
     * CloudWatch retains the history of an alarm even if you delete the alarm.
     * </p>
     * 
     * @param describeAlarmHistoryRequest
     * @return Result of the DescribeAlarmHistory operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.DescribeAlarmHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlarmHistory(request);
    }

    @SdkInternalApi
    final DescribeAlarmHistoryResult executeDescribeAlarmHistory(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlarmHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmHistoryRequest> request = null;
        Response<DescribeAlarmHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmHistoryRequestMarshaller().marshall(super.beforeMarshalling(describeAlarmHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlarmHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAlarmHistoryResult> responseHandler = new StaxResponseHandler<DescribeAlarmHistoryResult>(
                    new DescribeAlarmHistoryResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory() {
        return describeAlarmHistory(new DescribeAlarmHistoryRequest());
    }

    /**
     * <p>
     * Retrieves the specified alarms. If no alarms are specified, all alarms are returned. Alarms can be retrieved by
     * using only a prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return Result of the DescribeAlarms operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.DescribeAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlarms(request);
    }

    @SdkInternalApi
    final DescribeAlarmsResult executeDescribeAlarms(DescribeAlarmsRequest describeAlarmsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmsRequest> request = null;
        Response<DescribeAlarmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmsRequestMarshaller().marshall(super.beforeMarshalling(describeAlarmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlarms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAlarmsResult> responseHandler = new StaxResponseHandler<DescribeAlarmsResult>(
                    new DescribeAlarmsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeAlarmsResult describeAlarms() {
        return describeAlarms(new DescribeAlarmsRequest());
    }

    /**
     * <p>
     * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return Result of the DescribeAlarmsForMetric operation returned by the service.
     * @sample AmazonCloudWatch.DescribeAlarmsForMetric
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmsForMetric"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlarmsForMetric(request);
    }

    @SdkInternalApi
    final DescribeAlarmsForMetricResult executeDescribeAlarmsForMetric(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlarmsForMetricRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmsForMetricRequest> request = null;
        Response<DescribeAlarmsForMetricResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmsForMetricRequestMarshaller().marshall(super.beforeMarshalling(describeAlarmsForMetricRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlarmsForMetric");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAlarmsForMetricResult> responseHandler = new StaxResponseHandler<DescribeAlarmsForMetricResult>(
                    new DescribeAlarmsForMetricResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the actions for the specified alarms. When an alarm's actions are disabled, the alarm actions do not
     * execute when the alarm state changes.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @return Result of the DisableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatch.DisableAlarmActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DisableAlarmActions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableAlarmActionsResult disableAlarmActions(DisableAlarmActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDisableAlarmActions(request);
    }

    @SdkInternalApi
    final DisableAlarmActionsResult executeDisableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(disableAlarmActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAlarmActionsRequest> request = null;
        Response<DisableAlarmActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAlarmActionsRequestMarshaller().marshall(super.beforeMarshalling(disableAlarmActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableAlarmActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisableAlarmActionsResult> responseHandler = new StaxResponseHandler<DisableAlarmActionsResult>(
                    new DisableAlarmActionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @return Result of the EnableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatch.EnableAlarmActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/EnableAlarmActions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) {
        request = beforeClientExecution(request);
        return executeEnableAlarmActions(request);
    }

    @SdkInternalApi
    final EnableAlarmActionsResult executeEnableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(enableAlarmActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAlarmActionsRequest> request = null;
        Response<EnableAlarmActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAlarmActionsRequestMarshaller().marshall(super.beforeMarshalling(enableAlarmActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableAlarmActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EnableAlarmActionsResult> responseHandler = new StaxResponseHandler<EnableAlarmActionsResult>(
                    new EnableAlarmActionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the details of the dashboard that you specify.
     * </p>
     * <p>
     * To copy an existing dashboard, use <code>GetDashboard</code>, and then use the data returned within
     * <code>DashboardBody</code> as the template for the new dashboard when you call <code>PutDashboard</code> to
     * create the copy.
     * </p>
     * 
     * @param getDashboardRequest
     * @return Result of the GetDashboard operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws DashboardNotFoundErrorException
     *         The specified dashboard does not exist.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.GetDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDashboardResult getDashboard(GetDashboardRequest request) {
        request = beforeClientExecution(request);
        return executeGetDashboard(request);
    }

    @SdkInternalApi
    final GetDashboardResult executeGetDashboard(GetDashboardRequest getDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(getDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDashboardRequest> request = null;
        Response<GetDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDashboardRequestMarshaller().marshall(super.beforeMarshalling(getDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetDashboardResult> responseHandler = new StaxResponseHandler<GetDashboardResult>(new GetDashboardResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can use the <code>GetMetricData</code> API to retrieve as many as 100 different metrics in a single request,
     * with a total of as many as 100,800 datapoints. You can also optionally perform math expressions on the values of
     * the returned statistics, to create new time series that represent new insights into your data. For example, using
     * Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series.
     * For more information about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Calls to the <code>GetMetricData</code> API have a different pricing structure than calls to
     * <code>GetMetricStatistics</code>. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * Amazon CloudWatch retains metric data as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of less than 60 seconds are available for 3 hours. These data points are
     * high-resolution metrics and are available only for custom metrics that have been defined with a
     * <code>StorageResolution</code> of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Data points that are initially published with a shorter period are aggregated together for long-term storage. For
     * example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
     * resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
     * of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return Result of the GetMetricData operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMetricDataResult getMetricData(GetMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetricData(request);
    }

    @SdkInternalApi
    final GetMetricDataResult executeGetMetricData(GetMetricDataRequest getMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricDataRequest> request = null;
        Response<GetMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricDataRequestMarshaller().marshall(super.beforeMarshalling(getMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetMetricDataResult> responseHandler = new StaxResponseHandler<GetMetricDataResult>(new GetMetricDataResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data
     * points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range
     * and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are
     * not returned in chronological order.
     * </p>
     * <p>
     * CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request
     * statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each
     * one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data
     * points returned.
     * </p>
     * <p>
     * CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
     * instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The SampleCount value of the statistic set is 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Min and the Max values of the statistic set are equal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Percentile statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * <p>
     * Amazon CloudWatch retains metric data as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of less than 60 seconds are available for 3 hours. These data points are
     * high-resolution metrics and are available only for custom metrics that have been defined with a
     * <code>StorageResolution</code> of 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Data points that are initially published with a shorter period are aggregated together for long-term storage. For
     * example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
     * resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
     * of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
     * </p>
     * <p>
     * CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016.
     * </p>
     * <p>
     * For information about metrics and dimensions supported by AWS services, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CW_Support_For_AWS.html">Amazon CloudWatch
     * Metrics and Dimensions Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param getMetricStatisticsRequest
     * @return Result of the GetMetricStatistics operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws MissingRequiredParameterException
     *         An input parameter that is required is missing.
     * @throws InvalidParameterCombinationException
     *         Parameters were used together that cannot be used together.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.GetMetricStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetricStatistics(request);
    }

    @SdkInternalApi
    final GetMetricStatisticsResult executeGetMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetricStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricStatisticsRequest> request = null;
        Response<GetMetricStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricStatisticsRequestMarshaller().marshall(super.beforeMarshalling(getMetricStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetricStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetMetricStatisticsResult> responseHandler = new StaxResponseHandler<GetMetricStatisticsResult>(
                    new GetMetricStatisticsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can use the <code>GetMetricWidgetImage</code> API to retrieve a snapshot graph of one or more Amazon
     * CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki
     * pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your
     * own custom live dashboard.
     * </p>
     * <p>
     * The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and
     * vertical annotations.
     * </p>
     * <p>
     * There is a limit of 20 transactions per second for this API. Each <code>GetMetricWidgetImage</code> action has
     * the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * As many as 100 metrics in the graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * Up to 100 KB uncompressed payload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMetricWidgetImageRequest
     * @return Result of the GetMetricWidgetImage operation returned by the service.
     * @sample AmazonCloudWatch.GetMetricWidgetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricWidgetImage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMetricWidgetImageResult getMetricWidgetImage(GetMetricWidgetImageRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetricWidgetImage(request);
    }

    @SdkInternalApi
    final GetMetricWidgetImageResult executeGetMetricWidgetImage(GetMetricWidgetImageRequest getMetricWidgetImageRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetricWidgetImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricWidgetImageRequest> request = null;
        Response<GetMetricWidgetImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricWidgetImageRequestMarshaller().marshall(super.beforeMarshalling(getMetricWidgetImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetricWidgetImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetMetricWidgetImageResult> responseHandler = new StaxResponseHandler<GetMetricWidgetImageResult>(
                    new GetMetricWidgetImageResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the dashboards for your account. If you include <code>DashboardNamePrefix</code>, only those
     * dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.
     * </p>
     * <p>
     * <code>ListDashboards</code> returns up to 1000 results on one page. If there are more than 1000 dashboards, you
     * can call <code>ListDashboards</code> again and include the value you received for <code>NextToken</code> in the
     * first call, to receive the next 1000 results.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return Result of the ListDashboards operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDashboardsResult listDashboards(ListDashboardsRequest request) {
        request = beforeClientExecution(request);
        return executeListDashboards(request);
    }

    @SdkInternalApi
    final ListDashboardsResult executeListDashboards(ListDashboardsRequest listDashboardsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardsRequest> request = null;
        Response<ListDashboardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardsRequestMarshaller().marshall(super.beforeMarshalling(listDashboardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDashboards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDashboardsResult> responseHandler = new StaxResponseHandler<ListDashboardsResult>(
                    new ListDashboardsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the specified metrics. You can use the returned metrics with <a>GetMetricData</a> or
     * <a>GetMetricStatistics</a> to obtain statistical data.
     * </p>
     * <p>
     * Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with
     * subsequent calls.
     * </p>
     * <p>
     * After you create a metric, allow up to fifteen minutes before the metric appears. Statistics about the metric,
     * however, are available sooner using <a>GetMetricData</a> or <a>GetMetricStatistics</a>.
     * </p>
     * 
     * @param listMetricsRequest
     * @return Result of the ListMetrics operation returned by the service.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @sample AmazonCloudWatch.ListMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMetricsResult listMetrics(ListMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeListMetrics(request);
    }

    @SdkInternalApi
    final ListMetricsResult executeListMetrics(ListMetricsRequest listMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMetricsRequest> request = null;
        Response<ListMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMetricsRequestMarshaller().marshall(super.beforeMarshalling(listMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListMetricsResult> responseHandler = new StaxResponseHandler<ListMetricsResult>(new ListMetricsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListMetricsResult listMetrics() {
        return listMetrics(new ListMetricsRequest());
    }

    /**
     * <p>
     * Displays the tags associated with a CloudWatch resource. Alarms support tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTagsForResourceResult> responseHandler = new StaxResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard,
     * the entire contents are replaced with what you specify here.
     * </p>
     * <p>
     * There is no limit to the number of dashboards in your account. All dashboards in your account are global, not
     * region-specific.
     * </p>
     * <p>
     * A simple way to create a dashboard using <code>PutDashboard</code> is to copy an existing dashboard. To copy an
     * existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the
     * Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use
     * <code>GetDashboard</code>, and then use the data returned within <code>DashboardBody</code> as the template for
     * the new dashboard when you call <code>PutDashboard</code>.
     * </p>
     * <p>
     * When you create a dashboard with <code>PutDashboard</code>, a good practice is to add a text widget at the top of
     * the dashboard with a message that the dashboard was created by script and should not be changed in the console.
     * This message could also point console users to the location of the <code>DashboardBody</code> script or the
     * CloudFormation template used to create the dashboard.
     * </p>
     * 
     * @param putDashboardRequest
     * @return Result of the PutDashboard operation returned by the service.
     * @throws DashboardInvalidInputErrorException
     *         Some part of the dashboard data is invalid.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.PutDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDashboardResult putDashboard(PutDashboardRequest request) {
        request = beforeClientExecution(request);
        return executePutDashboard(request);
    }

    @SdkInternalApi
    final PutDashboardResult executePutDashboard(PutDashboardRequest putDashboardRequest) {

        ExecutionContext executionContext = createExecutionContext(putDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDashboardRequest> request = null;
        Response<PutDashboardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDashboardRequestMarshaller().marshall(super.beforeMarshalling(putDashboardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDashboard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutDashboardResult> responseHandler = new StaxResponseHandler<PutDashboardResult>(new PutDashboardResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an alarm and associates it with the specified metric or metric math expression.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm.
     * </p>
     * <p>
     * If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iam:CreateServiceLinkedRole</code> for all alarms with EC2 actions
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeInstanceStatus</code> and <code>ec2:DescribeInstances</code> for all alarms on EC2 instance
     * status metrics
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:StopInstances</code> for alarms with stop actions
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:TerminateInstances</code> for alarms with terminate actions
     * </p>
     * </li>
     * <li>
     * <p>
     * No specific permissions are needed for alarms with recover actions
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm,
     * but the stop or terminate actions are not performed. However, if you are later granted the required permissions,
     * the alarm actions that you created earlier are performed.
     * </p>
     * <p>
     * If you are using an IAM role (for example, an EC2 instance profile), you cannot stop or terminate the instance
     * using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS
     * notifications or Auto Scaling policies.
     * </p>
     * <p>
     * If you are using temporary security credentials granted using AWS STS, you cannot stop or terminate an EC2
     * instance using alarm actions.
     * </p>
     * <p>
     * The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API,
     * CloudWatch creates the necessary service-linked role for you. The service-linked role is called
     * <code>AWSServiceRoleForCloudWatchEvents</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role"
     * >AWS service-linked role</a>.
     * </p>
     * 
     * @param putMetricAlarmRequest
     * @return Result of the PutMetricAlarm operation returned by the service.
     * @throws LimitExceededException
     *         The quota for alarms for this customer has already been reached.
     * @sample AmazonCloudWatch.PutMetricAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutMetricAlarmResult putMetricAlarm(PutMetricAlarmRequest request) {
        request = beforeClientExecution(request);
        return executePutMetricAlarm(request);
    }

    @SdkInternalApi
    final PutMetricAlarmResult executePutMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest) {

        ExecutionContext executionContext = createExecutionContext(putMetricAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricAlarmRequest> request = null;
        Response<PutMetricAlarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricAlarmRequestMarshaller().marshall(super.beforeMarshalling(putMetricAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMetricAlarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutMetricAlarmResult> responseHandler = new StaxResponseHandler<PutMetricAlarmResult>(
                    new PutMetricAlarmResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric,
     * it can take up to fifteen minutes for the metric to appear in calls to <a>ListMetrics</a>.
     * </p>
     * <p>
     * You can publish either individual data points in the <code>Value</code> field, or arrays of values and the number
     * of times each value occurred during the period by using the <code>Values</code> and <code>Counts</code> fields in
     * the <code>MetricDatum</code> structure. Using the <code>Values</code> and <code>Counts</code> method enables you
     * to publish up to 150 values per metric with one <code>PutMetricData</code> request, and supports retrieving
     * percentile statistics on this data.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 40 KB in size for HTTP POST requests. You can send a
     * payload compressed by gzip. Each request is also limited to no more than 20 different metrics.
     * </p>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
     * or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     * <p>
     * You can use up to 10 dimensions per metric to further clarify what data the metric collects. Each dimension
     * consists of a Name and Value pair. For more information about specifying dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for
     * <a>GetMetricData</a> or <a>GetMetricStatistics</a> from the time they are submitted.
     * </p>
     * <p>
     * CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
     * instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>SampleCount</code> value of the statistic set is 1 and <code>Min</code>, <code>Max</code>, and
     * <code>Sum</code> are all equal.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Min</code> and <code>Max</code> are equal, and <code>Sum</code> is equal to <code>Min</code> multiplied
     * by <code>SampleCount</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putMetricDataRequest
     * @return Result of the PutMetricData operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws MissingRequiredParameterException
     *         An input parameter that is required is missing.
     * @throws InvalidParameterCombinationException
     *         Parameters were used together that cannot be used together.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.PutMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutMetricDataResult putMetricData(PutMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executePutMetricData(request);
    }

    @SdkInternalApi
    final PutMetricDataResult executePutMetricData(PutMetricDataRequest putMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(putMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricDataRequest> request = null;
        Response<PutMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricDataRequestMarshaller().marshall(super.beforeMarshalling(putMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutMetricDataResult> responseHandler = new StaxResponseHandler<PutMetricDataResult>(new PutMetricDataResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Temporarily sets the state of an alarm for testing purposes. When the updated state differs from the previous
     * value, the action configured for the appropriate state is invoked. For example, if your alarm is configured to
     * send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm state to <code>ALARM</code>
     * sends an SNS message. The alarm returns to its actual state (often within seconds). Because the alarm state
     * change happens quickly, it is typically only visible in the alarm's <b>History</b> tab in the Amazon CloudWatch
     * console or through <a>DescribeAlarmHistory</a>.
     * </p>
     * 
     * @param setAlarmStateRequest
     * @return Result of the SetAlarmState operation returned by the service.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @throws InvalidFormatException
     *         Data was not syntactically valid JSON.
     * @sample AmazonCloudWatch.SetAlarmState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/SetAlarmState" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetAlarmStateResult setAlarmState(SetAlarmStateRequest request) {
        request = beforeClientExecution(request);
        return executeSetAlarmState(request);
    }

    @SdkInternalApi
    final SetAlarmStateResult executeSetAlarmState(SetAlarmStateRequest setAlarmStateRequest) {

        ExecutionContext executionContext = createExecutionContext(setAlarmStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetAlarmStateRequest> request = null;
        Response<SetAlarmStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetAlarmStateRequestMarshaller().marshall(super.beforeMarshalling(setAlarmStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetAlarmState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetAlarmStateResult> responseHandler = new StaxResponseHandler<SetAlarmStateResult>(new SetAlarmStateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch resource. Tags can help you organize and
     * categorize your resources. You can also use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values. In CloudWatch, alarms can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TagResourceResult> responseHandler = new StaxResponseHandler<TagResourceResult>(new TagResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value of an input parameter is bad or out-of-range.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServiceException
     *         Request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UntagResourceResult> responseHandler = new StaxResponseHandler<UntagResourceResult>(new UntagResourceResultStaxUnmarshaller());
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

    @Override
    public AmazonCloudWatchWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonCloudWatchWaiters(this);
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
