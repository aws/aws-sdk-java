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

import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing CloudWatch asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public interface AmazonCloudWatchAsync extends AmazonCloudWatch {

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @sample AmazonCloudWatchAsync.DeleteAlarms
     */
    java.util.concurrent.Future<Void> deleteAlarmsAsync(
            DeleteAlarmsRequest deleteAlarmsRequest);

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     * 
     * @param deleteAlarmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudWatchAsyncHandler.DeleteAlarms
     */
    java.util.concurrent.Future<Void> deleteAlarmsAsync(
            DeleteAlarmsRequest deleteAlarmsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlarmsRequest, Void> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAlarmHistory
     *         operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAlarmHistory
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarmHistory
     *         operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAlarmHistory
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest)
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync();

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation
     * with an AsyncHandler.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @return A Java Future containing the result of the DescribeAlarms
     *         operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAlarms
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            DescribeAlarmsRequest describeAlarmsRequest);

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified, all
     * alarms for the user are returned. Alarms can be retrieved by using only a
     * prefix for the alarm name, the alarm state, or a prefix for any action.
     * </p>
     * 
     * @param describeAlarmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarms
     *         operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAlarms
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            DescribeAlarmsRequest describeAlarmsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest)
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync();

    /**
     * Simplified method form for invoking the DescribeAlarms operation with an
     * AsyncHandler.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic, period, or
     * unit to filter the set of alarms further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @return A Java Future containing the result of the
     *         DescribeAlarmsForMetric operation returned by the service.
     * @sample AmazonCloudWatchAsync.DescribeAlarmsForMetric
     */
    java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest);

    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic, period, or
     * unit to filter the set of alarms further.
     * </p>
     * 
     * @param describeAlarmsForMetricRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeAlarmsForMetric operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.DescribeAlarmsForMetric
     */
    java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler);

    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions are
     * disabled the alarm's state may change, but none of the alarm's actions
     * will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @sample AmazonCloudWatchAsync.DisableAlarmActions
     */
    java.util.concurrent.Future<Void> disableAlarmActionsAsync(
            DisableAlarmActionsRequest disableAlarmActionsRequest);

    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions are
     * disabled the alarm's state may change, but none of the alarm's actions
     * will execute.
     * </p>
     * 
     * @param disableAlarmActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudWatchAsyncHandler.DisableAlarmActions
     */
    java.util.concurrent.Future<Void> disableAlarmActionsAsync(
            DisableAlarmActionsRequest disableAlarmActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DisableAlarmActionsRequest, Void> asyncHandler);

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @sample AmazonCloudWatchAsync.EnableAlarmActions
     */
    java.util.concurrent.Future<Void> enableAlarmActionsAsync(
            EnableAlarmActionsRequest enableAlarmActionsRequest);

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     * 
     * @param enableAlarmActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudWatchAsyncHandler.EnableAlarmActions
     */
    java.util.concurrent.Future<Void> enableAlarmActionsAsync(
            EnableAlarmActionsRequest enableAlarmActionsRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAlarmActionsRequest, Void> asyncHandler);

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
     * @return A Java Future containing the result of the GetMetricStatistics
     *         operation returned by the service.
     * @sample AmazonCloudWatchAsync.GetMetricStatistics
     */
    java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(
            GetMetricStatisticsRequest getMetricStatisticsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricStatistics
     *         operation returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.GetMetricStatistics
     */
    java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(
            GetMetricStatisticsRequest getMetricStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMetrics operation
     *         returned by the service.
     * @sample AmazonCloudWatchAsync.ListMetrics
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            ListMetricsRequest listMetricsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetrics operation
     *         returned by the service.
     * @sample AmazonCloudWatchAsyncHandler.ListMetrics
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            ListMetricsRequest listMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetricsAsync(ListMetricsRequest)
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync();

    /**
     * Simplified method form for invoking the ListMetrics operation with an
     * AsyncHandler.
     *
     * @see #listMetricsAsync(ListMetricsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler);

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
     * @sample AmazonCloudWatchAsync.PutMetricAlarm
     */
    java.util.concurrent.Future<Void> putMetricAlarmAsync(
            PutMetricAlarmRequest putMetricAlarmRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudWatchAsyncHandler.PutMetricAlarm
     */
    java.util.concurrent.Future<Void> putMetricAlarmAsync(
            PutMetricAlarmRequest putMetricAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricAlarmRequest, Void> asyncHandler);

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
     * @sample AmazonCloudWatchAsync.PutMetricData
     */
    java.util.concurrent.Future<Void> putMetricDataAsync(
            PutMetricDataRequest putMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudWatchAsyncHandler.PutMetricData
     */
    java.util.concurrent.Future<Void> putMetricDataAsync(
            PutMetricDataRequest putMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricDataRequest, Void> asyncHandler);

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
     * @sample AmazonCloudWatchAsync.SetAlarmState
     */
    java.util.concurrent.Future<Void> setAlarmStateAsync(
            SetAlarmStateRequest setAlarmStateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudWatchAsyncHandler.SetAlarmState
     */
    java.util.concurrent.Future<Void> setAlarmStateAsync(
            SetAlarmStateRequest setAlarmStateRequest,
            com.amazonaws.handlers.AsyncHandler<SetAlarmStateRequest, Void> asyncHandler);

}
