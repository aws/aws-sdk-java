/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.model.transform.*;

/**
 * Client for accessing CloudWatch. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * This is the <i>Amazon CloudWatch API Reference</i>. This guide provides
 * detailed information about Amazon CloudWatch actions, data types, parameters,
 * and errors. For detailed information about Amazon CloudWatch features and
 * their associated API calls, go to the <a href=
 * "http://docs.amazonwebservices.com/AmazonCloudWatch/latest/DeveloperGuide"
 * >Amazon CloudWatch Developer Guide</a>.
 * </p>
 * <p>
 * Amazon CloudWatch is a web service that enables you to publish, monitor, and
 * manage various metrics, as well as configure alarm actions based on data from
 * metrics. For more information about this product go to <a
 * href="http://aws.amazon.com/cloudwatch">http://aws.amazon.com/cloudwatch</a>.
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon CloudWatch API
 * Reference</i>:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.amazonwebservices.com/AmazonCloudWatch/latest/APIReference/API_Operations.html"
 * >Actions</a>: An alphabetical list of all Amazon CloudWatch actions.</li>
 * <li><a href=
 * "http://docs.amazonwebservices.com/AmazonCloudWatch/latest/APIReference/API_Types.html"
 * >Data Types</a>: An alphabetical list of all Amazon CloudWatch data types.</li>
 * <li><a href=
 * "http://docs.amazonwebservices.com/AmazonCloudWatch/latest/APIReference/CommonParameters.html"
 * >Common Parameters</a>: Parameters that all Query actions can use.</li>
 * <li><a href=
 * "http://docs.amazonwebservices.com/AmazonCloudWatch/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>: Client and server errors that all actions can return.</li>
 * <li><a href=
 * "http://docs.amazonwebservices.com/general/latest/gr/index.html?rande.html"
 * >Regions and Endpoints</a>: Itemized regions and endpoints for all AWS
 * products.</li>
 * <li><a
 * href="http://monitoring.amazonaws.com/doc/2010-08-01/CloudWatch.wsdl">WSDL
 * Location</a>: http://monitoring.amazonaws.com/doc/2010-08-01/CloudWatch.wsdl</li>
 * </ul>
 */
public class AmazonCloudWatchClient extends AmazonWebServiceClient implements
        AmazonCloudWatch {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudWatch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "monitoring";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "monitoring";

    /**
     * List of exception unmarshallers for all CloudWatch exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on CloudWatch. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudWatchClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudWatch (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudWatchClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudWatch (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudWatchClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonCloudWatchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudWatch (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudWatchClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CloudWatch using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudWatch (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonCloudWatchClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new MissingRequiredParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://monitoring.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/cloudwatch/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/cloudwatch/request.handler2s"));
    }

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @sample AmazonCloudWatch.DeleteAlarms
     */
    @Override
    public void deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlarmsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlarmsRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAlarmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves history for the specified alarm. Filter alarms by date range or
     * item type. If an alarm name is not specified, Amazon CloudWatch returns
     * histories for all of the owner's alarms.
     * </p>
     * <note> Amazon CloudWatch retains the history of an alarm for two weeks,
     * whether or not you delete the alarm. </note>
     * 
     * @param describeAlarmHistoryRequest
     * @return Result of the DescribeAlarmHistory operation returned by the
     *         service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.DescribeAlarmHistory
     */
    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAlarmHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmHistoryRequest> request = null;
        Response<DescribeAlarmHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmHistoryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAlarmHistoryRequest));
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
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return Result of the DescribeAlarms operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token specified is invalid.
     * @sample AmazonCloudWatch.DescribeAlarms
     */
    @Override
    public DescribeAlarmsResult describeAlarms(
            DescribeAlarmsRequest describeAlarmsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAlarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmsRequest> request = null;
        Response<DescribeAlarmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeAlarmsRequest));
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
     * Retrieves all alarms for a single metric. Specify a statistic, period, or
     * unit to filter the set of alarms further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return Result of the DescribeAlarmsForMetric operation returned by the
     *         service.
     * @sample AmazonCloudWatch.DescribeAlarmsForMetric
     */
    @Override
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAlarmsForMetricRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlarmsForMetricRequest> request = null;
        Response<DescribeAlarmsForMetricResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlarmsForMetricRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAlarmsForMetricRequest));
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
     * Disables actions for the specified alarms. When an alarm's actions are
     * disabled the alarm's state may change, but none of the alarm's actions
     * will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @sample AmazonCloudWatch.DisableAlarmActions
     */
    @Override
    public void disableAlarmActions(
            DisableAlarmActionsRequest disableAlarmActionsRequest) {
        ExecutionContext executionContext = createExecutionContext(disableAlarmActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAlarmActionsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAlarmActionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disableAlarmActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

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
     * @sample AmazonCloudWatch.EnableAlarmActions
     */
    @Override
    public void enableAlarmActions(
            EnableAlarmActionsRequest enableAlarmActionsRequest) {
        ExecutionContext executionContext = createExecutionContext(enableAlarmActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAlarmActionsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAlarmActionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(enableAlarmActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <note> The maximum number of data points returned from a single
     * <code>GetMetricStatistics</code> request is 1,440. If a request is made
     * that generates more than 1,440 data points, Amazon CloudWatch returns an
     * error. In such a case, alter the request by narrowing the specified time
     * range or increasing the specified period. Alternatively, make multiple
     * requests across adjacent time ranges. </note>
     * <p>
     * Amazon CloudWatch aggregates data points based on the length of the
     * <code>period</code> that you specify. For example, if you request
     * statistics with a one-minute granularity, Amazon CloudWatch aggregates
     * data points with time stamps that fall within the same one-minute period.
     * In such a case, the data points queried can greatly outnumber the data
     * points returned.
     * </p>
     * <note> The maximum number of data points that can be queried is 50,850;
     * whereas the maximum number of data points returned is 1,440. </note>
     * <p>
     * The following examples show various statistics allowed by the data point
     * query maximum of 50,850 when you call <code>GetMetricStatistics</code> on
     * Amazon EC2 instances with detailed (one-minute) monitoring enabled:
     * </p>
     * <ul>
     * <li>Statistics for up to 400 instances for a span of one hour</li>
     * <li>Statistics for up to 35 instances over a span of 24 hours</li>
     * <li>Statistics for up to 2 instances over a span of 2 weeks</li>
     * </ul>
     * 
     * @param getMetricStatisticsRequest
     * @return Result of the GetMetricStatistics operation returned by the
     *         service.
     * @throws InvalidParameterValueException
     *         Bad or out-of-range value was supplied for the input parameter.
     * @throws MissingRequiredParameterException
     *         An input parameter that is mandatory for processing the request
     *         is not supplied.
     * @throws InvalidParameterCombinationException
     *         Parameters that must not be used together were used together.
     * @throws InternalServiceException
     *         Indicates that the request processing has failed due to some
     *         unknown error, exception, or failure.
     * @sample AmazonCloudWatch.GetMetricStatistics
     */
    @Override
    public GetMetricStatisticsResult getMetricStatistics(
            GetMetricStatisticsRequest getMetricStatisticsRequest) {
        ExecutionContext executionContext = createExecutionContext(getMetricStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricStatisticsRequest> request = null;
        Response<GetMetricStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricStatisticsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getMetricStatisticsRequest));
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
     * Returns a list of valid metrics stored for the AWS account owner.
     * Returned metrics can be used with <code>GetMetricStatistics</code> to
     * obtain statistical data for a given metric.
     * </p>
     * <note> Up to 500 results are returned for any one call. To retrieve
     * further results, use returned <code>NextToken</code> values with
     * subsequent <code>ListMetrics</code> operations. </note> <note> If you
     * create a metric with the <a>PutMetricData</a> action, allow up to fifteen
     * minutes for the metric to appear in calls to the <code>ListMetrics</code>
     * action. </note>
     * 
     * @param listMetricsRequest
     * @return Result of the ListMetrics operation returned by the service.
     * @throws InternalServiceException
     *         Indicates that the request processing has failed due to some
     *         unknown error, exception, or failure.
     * @throws InvalidParameterValueException
     *         Bad or out-of-range value was supplied for the input parameter.
     * @sample AmazonCloudWatch.ListMetrics
     */
    @Override
    public ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest) {
        ExecutionContext executionContext = createExecutionContext(listMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMetricsRequest> request = null;
        Response<ListMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMetricsRequestMarshaller().marshall(super
                        .beforeMarshalling(listMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListMetricsResult> responseHandler = new StaxResponseHandler<ListMetricsResult>(
                    new ListMetricsResultStaxUnmarshaller());
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
     * Creates or updates an alarm and associates it with the specified Amazon
     * CloudWatch metric. Optionally, this operation can associate one or more
     * Amazon Simple Notification Service resources with the alarm.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately set
     * to <code>INSUFFICIENT_DATA</code>. The alarm is evaluated and its
     * <code>StateValue</code> is set appropriately. Any actions associated with
     * the <code>StateValue</code> is then executed.
     * </p>
     * <note> When updating an existing alarm, its <code>StateValue</code> is
     * left unchanged. </note>
     * 
     * @param putMetricAlarmRequest
     * @throws LimitExceededException
     *         The quota for alarms for this customer has already been reached.
     * @sample AmazonCloudWatch.PutMetricAlarm
     */
    @Override
    public void putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest) {
        ExecutionContext executionContext = createExecutionContext(putMetricAlarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricAlarmRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricAlarmRequestMarshaller().marshall(super
                        .beforeMarshalling(putMetricAlarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. Amazon Cloudwatch
     * associates the data points with the specified metric. If the specified
     * metric does not exist, Amazon CloudWatch creates the metric.
     * </p>
     * <note> If you create a metric with the <code>PutMetricData</code> action,
     * allow up to fifteen minutes for the metric to appear in calls to the
     * <a>ListMetrics</a> action. </note>
     * <p>
     * The size of a <function>PutMetricData</function> request is limited to 8
     * KB for HTTP GET requests and 40 KB for HTTP POST requests.
     * </p>
     * <important> Although the <code>Value</code> parameter accepts numbers of
     * type <code>Double</code>, Amazon CloudWatch truncates values with very
     * large exponents. Values with base-10 exponents greater than 126 (1 x
     * 10^126) are truncated. Likewise, values with base-10 exponents less than
     * -130 (1 x 10^-130) are also truncated. </important>
     * 
     * @param putMetricDataRequest
     * @throws InvalidParameterValueException
     *         Bad or out-of-range value was supplied for the input parameter.
     * @throws MissingRequiredParameterException
     *         An input parameter that is mandatory for processing the request
     *         is not supplied.
     * @throws InvalidParameterCombinationException
     *         Parameters that must not be used together were used together.
     * @throws InternalServiceException
     *         Indicates that the request processing has failed due to some
     *         unknown error, exception, or failure.
     * @sample AmazonCloudWatch.PutMetricData
     */
    @Override
    public void putMetricData(PutMetricDataRequest putMetricDataRequest) {
        ExecutionContext executionContext = createExecutionContext(putMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricDataRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricDataRequestMarshaller().marshall(super
                        .beforeMarshalling(putMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Temporarily sets the state of an alarm. When the updated
     * <code>StateValue</code> differs from the previous value, the action
     * configured for the appropriate state is invoked. This is not a permanent
     * change. The next periodic alarm check (in about a minute) will set the
     * alarm to its actual state.
     * </p>
     * 
     * @param setAlarmStateRequest
     * @throws ResourceNotFoundException
     *         The named resource does not exist.
     * @throws InvalidFormatException
     *         Data was not syntactically valid JSON.
     * @sample AmazonCloudWatch.SetAlarmState
     */
    @Override
    public void setAlarmState(SetAlarmStateRequest setAlarmStateRequest) {
        ExecutionContext executionContext = createExecutionContext(setAlarmStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetAlarmStateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetAlarmStateRequestMarshaller().marshall(super
                        .beforeMarshalling(setAlarmStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
