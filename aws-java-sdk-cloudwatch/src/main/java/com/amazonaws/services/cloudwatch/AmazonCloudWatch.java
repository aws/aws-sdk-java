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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing CloudWatch.
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
public interface AmazonCloudWatch {

    /**
     * Overrides the default endpoint for this client
     * ("https://monitoring.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "monitoring.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://monitoring.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "monitoring.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://monitoring.us-east-1.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudWatch#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
    void deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest);

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
    DescribeAlarmHistoryResult describeAlarmHistory(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest);

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistory(DescribeAlarmHistoryRequest)
     */
    DescribeAlarmHistoryResult describeAlarmHistory();

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
    DescribeAlarmsResult describeAlarms(
            DescribeAlarmsRequest describeAlarmsRequest);

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarms(DescribeAlarmsRequest)
     */
    DescribeAlarmsResult describeAlarms();

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
    DescribeAlarmsForMetricResult describeAlarmsForMetric(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest);

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
    void disableAlarmActions(
            DisableAlarmActionsRequest disableAlarmActionsRequest);

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @sample AmazonCloudWatch.EnableAlarmActions
     */
    void enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest);

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
    GetMetricStatisticsResult getMetricStatistics(
            GetMetricStatisticsRequest getMetricStatisticsRequest);

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
    ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest);

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetrics(ListMetricsRequest)
     */
    ListMetricsResult listMetrics();

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
    void putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest);

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
    void putMetricData(PutMetricDataRequest putMetricDataRequest);

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
    void setAlarmState(SetAlarmStateRequest setAlarmStateRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
