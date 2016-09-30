/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
import com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.model.transform.*;

/**
 * Client for accessing CloudWatch. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the applications you run on AWS in real-time.
 * You can use CloudWatch to collect and track metrics, which are the variables you want to measure for your resources
 * and applications.
 * </p>
 * <p>
 * CloudWatch alarms send notifications or automatically make changes to the resources you are monitoring based on rules
 * that you define. For example, you can monitor the CPU usage and disk reads and writes of your Amazon Elastic Compute
 * Cloud (Amazon EC2) instances and then use this data to determine whether you should launch additional instances to
 * handle increased load. You can also use this data to stop under-used instances to save money.
 * </p>
 * <p>
 * In addition to monitoring the built-in metrics that come with AWS, you can monitor your own custom metrics. With
 * CloudWatch, you gain system-wide visibility into resource utilization, application performance, and operational
 * health.
 * </p>
 */
@ThreadSafe
public class AmazonCloudWatchClient extends AmazonWebServiceClient implements AmazonCloudWatch {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudWatch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "monitoring";

    private volatile AmazonCloudWatchWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

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
     */
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
     */
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
     */
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
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingRequiredParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
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
    }

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     *        Describes the inputs for DeleteAlarms.
     * @return Result of the DeleteAlarms operation returned by the service.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @sample AmazonCloudWatch.DeleteAlarms
     */
    @Override
    public DeleteAlarmsResult deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest) {
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
     * Retrieves history for the specified alarm. Filter alarms by date range or item type. If an alarm name is not
     * specified, Amazon CloudWatch returns histories for all of the owner's alarms.
     * </p>
     * <note>
     * <p>
     * Amazon CloudWatch retains the history of an alarm for two weeks, whether or not you delete the alarm.
     * </p>
     * </note>
     * 
     * @param describeAlarmHistoryRequest
     *        Describes the inputs for DescribeAlarmHistory.
     * @return Result of the DescribeAlarmHistory operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.DescribeAlarmHistory
     */
    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {
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
     * Retrieves alarms with the specified names. If no name is specified, all alarms for the user are returned. Alarms
     * can be retrieved by using only a prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     *        Describes the inputs for DescribeAlarms.
     * @return Result of the DescribeAlarms operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.DescribeAlarms
     */
    @Override
    public DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest) {
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
     * Retrieves all alarms for a single metric. Specify a statistic, period, or unit to filter the set of alarms
     * further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     *        Describes the inputs for DescribeAlarmsForMetric.
     * @return Result of the DescribeAlarmsForMetric operation returned by the service.
     * @sample AmazonCloudWatch.DescribeAlarmsForMetric
     */
    @Override
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {
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
     * Disables actions for the specified alarms. When an alarm's actions are disabled the alarm's state may change, but
     * none of the alarm's actions will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @return Result of the DisableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatch.DisableAlarmActions
     */
    @Override
    public DisableAlarmActionsResult disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest) {
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
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     *        Describes the inputs for EnableAlarmActions.
     * @return Result of the EnableAlarmActions operation returned by the service.
     * @sample AmazonCloudWatch.EnableAlarmActions
     */
    @Override
    public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest) {
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
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * The maximum number of data points that can be queried is 50,850, whereas the maximum number of data points
     * returned from a single <code>GetMetricStatistics</code> request is 1,440. If you make a request that generates
     * more than 1,440 data points, Amazon CloudWatch returns an error. In such a case, you can alter the request by
     * narrowing the specified time range or increasing the specified period. A period can be as short as one minute (60
     * seconds) or as long as one day (86,400 seconds). Alternatively, you can make multiple requests across adjacent
     * time ranges. <code>GetMetricStatistics</code> does not return the data in chronological order.
     * </p>
     * <p>
     * Amazon CloudWatch aggregates data points based on the length of the <code>period</code> that you specify. For
     * example, if you request statistics with a one-minute granularity, Amazon CloudWatch aggregates data points with
     * time stamps that fall within the same one-minute period. In such a case, the data points queried can greatly
     * outnumber the data points returned.
     * </p>
     * <p>
     * The following examples show various statistics allowed by the data point query maximum of 50,850 when you call
     * <code>GetMetricStatistics</code> on Amazon EC2 instances with detailed (one-minute) monitoring enabled:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Statistics for up to 400 instances for a span of one hour
     * </p>
     * </li>
     * <li>
     * <p>
     * Statistics for up to 35 instances over a span of 24 hours
     * </p>
     * </li>
     * <li>
     * <p>
     * Statistics for up to 2 instances over a span of 2 weeks
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about the namespace, metric names, and dimensions that other Amazon Web Services products use to
     * send metrics to CloudWatch, go to <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Metrics, Namespaces, and Dimensions Reference</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * 
     * @param getMetricStatisticsRequest
     *        Describes the inputs for GetMetricStatistics.
     * @return Result of the GetMetricStatistics operation returned by the service.
     * @throws InvalidParameterValueException
     *         Bad or out-of-range value was supplied for the input parameter.
     * @throws MissingRequiredParameterException
     *         An input parameter that is mandatory for processing the request is not supplied.
     * @throws InvalidParameterCombinationException
     *         Parameters that must not be used together were used together.
     * @throws InternalServiceException
     *         Indicates that the request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.GetMetricStatistics
     */
    @Override
    public GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest) {
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
     * Returns a list of valid metrics stored for the AWS account owner. Returned metrics can be used with
     * <a>GetMetricStatistics</a> to obtain statistical data for a given metric.
     * </p>
     * <note>
     * <p>
     * Up to 500 results are returned for any one call. To retrieve further results, use returned <code>NextToken</code>
     * values with subsequent <code>ListMetrics</code> operations.
     * </p>
     * </note> <note>
     * <p>
     * If you create a metric with <a>PutMetricData</a>, allow up to fifteen minutes for the metric to appear in calls
     * to <code>ListMetrics</code>. Statistics about the metric, however, are available sooner using
     * <a>GetMetricStatistics</a>.
     * </p>
     * </note>
     * 
     * @param listMetricsRequest
     *        Describes the inputs for ListMetrics.
     * @return Result of the ListMetrics operation returned by the service.
     * @throws InternalServiceException
     *         Indicates that the request processing has failed due to some unknown error, exception, or failure.
     * @throws InvalidParameterValueException
     *         Bad or out-of-range value was supplied for the input parameter.
     * @sample AmazonCloudWatch.ListMetrics
     */
    @Override
    public ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest) {
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
     * Creates or updates an alarm and associates it with the specified Amazon CloudWatch metric. Optionally, this
     * operation can associate one or more Amazon SNS resources with the alarm.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is evaluated and its <code>StateValue</code> is set appropriately. Any actions associated with the
     * <code>StateValue</code> are then executed.
     * </p>
     * <note>
     * <p>
     * When updating an existing alarm, its <code>StateValue</code> is left unchanged, but it completely overwrites the
     * alarm's previous configuration.
     * </p>
     * </note> <note>
     * <p>
     * If you are using an AWS Identity and Access Management (IAM) account to create or modify an alarm, you must have
     * the following Amazon EC2 permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeInstanceStatus</code> and <code>ec2:DescribeInstances</code> for all alarms on Amazon EC2
     * instance status metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:StopInstances</code> for alarms with stop actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:TerminateInstances</code> for alarms with terminate actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeInstanceRecoveryAttribute</code>, and <code>ec2:RecoverInstances</code> for alarms with recover
     * actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm
     * but the stop or terminate actions won't be performed on the Amazon EC2 instance. However, if you are later
     * granted permission to use the associated Amazon EC2 APIs, the alarm actions you created earlier will be
     * performed. For more information about IAM permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html">Permissions and Policies</a>
     * in <i>Using IAM</i>.
     * </p>
     * <p>
     * If you are using an IAM role (e.g., an Amazon EC2 instance profile), you cannot stop or terminate the instance
     * using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS
     * notifications or Auto Scaling policies.
     * </p>
     * <p>
     * If you are using temporary security credentials granted using the AWS Security Token Service (AWS STS), you
     * cannot stop or terminate an Amazon EC2 instance using alarm actions.
     * </p>
     * </note>
     * 
     * @param putMetricAlarmRequest
     *        Describes the inputs for PutMetricAlarm.
     * @return Result of the PutMetricAlarm operation returned by the service.
     * @throws LimitExceededException
     *         The quota for alarms for this customer has already been reached.
     * @sample AmazonCloudWatch.PutMetricAlarm
     */
    @Override
    public PutMetricAlarmResult putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest) {
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
     * Publishes metric data points to Amazon CloudWatch. Amazon CloudWatch associates the data points with the
     * specified metric. If the specified metric does not exist, Amazon CloudWatch creates the metric. When Amazon
     * CloudWatch creates a metric, it can take up to fifteen minutes for the metric to appear in calls to
     * <a>ListMetrics</a>.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 8 KB in size for HTTP GET requests and is limited to 40 KB
     * in size for HTTP POST requests.
     * </p>
     * <important>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type <code>Double</code>, Amazon CloudWatch rejects
     * values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108
     * (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (e.g., NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     * </important>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available from
     * submission time using <code>GetMetricStatistics</code>.
     * </p>
     * 
     * @param putMetricDataRequest
     *        Describes the inputs for PutMetricData.
     * @return Result of the PutMetricData operation returned by the service.
     * @throws InvalidParameterValueException
     *         Bad or out-of-range value was supplied for the input parameter.
     * @throws MissingRequiredParameterException
     *         An input parameter that is mandatory for processing the request is not supplied.
     * @throws InvalidParameterCombinationException
     *         Parameters that must not be used together were used together.
     * @throws InternalServiceException
     *         Indicates that the request processing has failed due to some unknown error, exception, or failure.
     * @sample AmazonCloudWatch.PutMetricData
     */
    @Override
    public PutMetricDataResult putMetricData(PutMetricDataRequest putMetricDataRequest) {
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
     * Temporarily sets the state of an alarm for testing purposes. When the updated <code>StateValue</code> differs
     * from the previous value, the action configured for the appropriate state is invoked. For example, if your alarm
     * is configured to send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm's state to
     * <b>ALARM</b> sends an Amazon SNS message. The alarm returns to its actual state (often within seconds). Because
     * the alarm state change happens very quickly, it is typically only visible in the alarm's <b>History</b> tab in
     * the Amazon CloudWatch console or through <code>DescribeAlarmHistory</code>.
     * </p>
     * 
     * @param setAlarmStateRequest
     *        Describes the inputs for SetAlarmState.
     * @return Result of the SetAlarmState operation returned by the service.
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @throws InvalidFormatException
     *         Data was not syntactically valid JSON.
     * @sample AmazonCloudWatch.SetAlarmState
     */
    @Override
    public SetAlarmStateResult setAlarmState(SetAlarmStateRequest setAlarmStateRequest) {
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

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

}
