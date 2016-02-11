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
 * Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the
 * applications you run on AWS in real-time. You can use CloudWatch to collect
 * and track metrics, which are the variables you want to measure for your
 * resources and applications.
 * </p>
 * <p>
 * CloudWatch alarms send notifications or automatically make changes to the
 * resources you are monitoring based on rules that you define. For example, you
 * can monitor the CPU usage and disk reads and writes of your Amazon Elastic
 * Compute Cloud (Amazon EC2) instances and then use this data to determine
 * whether you should launch additional instances to handle increased load. You
 * can also use this data to stop under-used instances to save money.
 * </p>
 * <p>
 * In addition to monitoring the built-in metrics that come with AWS, you can
 * monitor your own custom metrics. With CloudWatch, you gain system-wide
 * visibility into resource utilization, application performance, and
 * operational health.
 * </p>
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
     * <p>
     * The maximum number of data points that can be queried is 50,850, whereas
     * the maximum number of data points returned from a single
     * <code>GetMetricStatistics</code> request is 1,440. If you make a request
     * that generates more than 1,440 data points, Amazon CloudWatch returns an
     * error. In such a case, you can alter the request by narrowing the
     * specified time range or increasing the specified period. Alternatively,
     * you can make multiple requests across adjacent time ranges.
     * <code>GetMetricStatistics</code> does not return the data in
     * chronological order.
     * </p>
     * <p>
     * Amazon CloudWatch aggregates data points based on the length of the
     * <code>period</code> that you specify. For example, if you request
     * statistics with a one-minute granularity, Amazon CloudWatch aggregates
     * data points with time stamps that fall within the same one-minute period.
     * In such a case, the data points queried can greatly outnumber the data
     * points returned.
     * </p>
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
     * <p>
     * For information about the namespace, metric names, and dimensions that
     * other Amazon Web Services products use to send metrics to CloudWatch, go
     * to <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Metrics, Namespaces, and Dimensions Reference</a> in
     * the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
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
     * <p>
     * The maximum number of data points that can be queried is 50,850, whereas
     * the maximum number of data points returned from a single
     * <code>GetMetricStatistics</code> request is 1,440. If you make a request
     * that generates more than 1,440 data points, Amazon CloudWatch returns an
     * error. In such a case, you can alter the request by narrowing the
     * specified time range or increasing the specified period. Alternatively,
     * you can make multiple requests across adjacent time ranges.
     * <code>GetMetricStatistics</code> does not return the data in
     * chronological order.
     * </p>
     * <p>
     * Amazon CloudWatch aggregates data points based on the length of the
     * <code>period</code> that you specify. For example, if you request
     * statistics with a one-minute granularity, Amazon CloudWatch aggregates
     * data points with time stamps that fall within the same one-minute period.
     * In such a case, the data points queried can greatly outnumber the data
     * points returned.
     * </p>
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
     * <p>
     * For information about the namespace, metric names, and dimensions that
     * other Amazon Web Services products use to send metrics to CloudWatch, go
     * to <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Metrics, Namespaces, and Dimensions Reference</a> in
     * the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
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
     * Returned metrics can be used with <a>GetMetricStatistics</a> to obtain
     * statistical data for a given metric.
     * </p>
     * <note> Up to 500 results are returned for any one call. To retrieve
     * further results, use returned <code>NextToken</code> values with
     * subsequent <code>ListMetrics</code> operations. </note> <note> If you
     * create a metric with the <a>PutMetricData</a> action, allow up to fifteen
     * minutes for the metric to appear in calls to the <code>ListMetrics</code>
     * action. Statistics about the metric, however, are available sooner using
     * <a>GetMetricStatistics</a>. </note>
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
     * Returned metrics can be used with <a>GetMetricStatistics</a> to obtain
     * statistical data for a given metric.
     * </p>
     * <note> Up to 500 results are returned for any one call. To retrieve
     * further results, use returned <code>NextToken</code> values with
     * subsequent <code>ListMetrics</code> operations. </note> <note> If you
     * create a metric with the <a>PutMetricData</a> action, allow up to fifteen
     * minutes for the metric to appear in calls to the <code>ListMetrics</code>
     * action. Statistics about the metric, however, are available sooner using
     * <a>GetMetricStatistics</a>. </note>
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
     * left unchanged. </note> <note> If you are using an AWS Identity and
     * Access Management (IAM) account to create or modify an alarm, you must
     * have the following Amazon EC2 permissions:
     * <ul>
     * <li><code>ec2:DescribeInstanceStatus</code> and
     * <code>ec2:DescribeInstances</code> for all alarms on Amazon EC2 instance
     * status metrics.</li>
     * <li><code>ec2:StopInstances</code> for alarms with stop actions.</li>
     * <li><code>ec2:TerminateInstances</code> for alarms with terminate
     * actions.</li>
     * <li><code>ec2:DescribeInstanceRecoveryAttribute</code>, and
     * <code>ec2:RecoverInstances</code> for alarms with recover actions.</li>
     * </ul>
     * <p>
     * If you have read/write permissions for Amazon CloudWatch but not for
     * Amazon EC2, you can still create an alarm but the stop or terminate
     * actions won't be performed on the Amazon EC2 instance. However, if you
     * are later granted permission to use the associated Amazon EC2 APIs, the
     * alarm actions you created earlier will be performed. For more information
     * about IAM permissions, see <a href=
     * "http://docs.aws.amazon.com//IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * >Permissions and Policies</a> in <i>Using IAM</i>.
     * </p>
     * <p>
     * If you are using an IAM role (e.g., an Amazon EC2 instance profile), you
     * cannot stop or terminate the instance using alarm actions. However, you
     * can still see the alarm state and perform any other actions such as
     * Amazon SNS notifications or Auto Scaling policies.
     * </p>
     * <p>
     * If you are using temporary security credentials granted using the AWS
     * Security Token Service (AWS STS), you cannot stop or terminate an Amazon
     * EC2 instance using alarm actions.
     * </p>
     * </note>
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
     * left unchanged. </note> <note> If you are using an AWS Identity and
     * Access Management (IAM) account to create or modify an alarm, you must
     * have the following Amazon EC2 permissions:
     * <ul>
     * <li><code>ec2:DescribeInstanceStatus</code> and
     * <code>ec2:DescribeInstances</code> for all alarms on Amazon EC2 instance
     * status metrics.</li>
     * <li><code>ec2:StopInstances</code> for alarms with stop actions.</li>
     * <li><code>ec2:TerminateInstances</code> for alarms with terminate
     * actions.</li>
     * <li><code>ec2:DescribeInstanceRecoveryAttribute</code>, and
     * <code>ec2:RecoverInstances</code> for alarms with recover actions.</li>
     * </ul>
     * <p>
     * If you have read/write permissions for Amazon CloudWatch but not for
     * Amazon EC2, you can still create an alarm but the stop or terminate
     * actions won't be performed on the Amazon EC2 instance. However, if you
     * are later granted permission to use the associated Amazon EC2 APIs, the
     * alarm actions you created earlier will be performed. For more information
     * about IAM permissions, see <a href=
     * "http://docs.aws.amazon.com//IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * >Permissions and Policies</a> in <i>Using IAM</i>.
     * </p>
     * <p>
     * If you are using an IAM role (e.g., an Amazon EC2 instance profile), you
     * cannot stop or terminate the instance using alarm actions. However, you
     * can still see the alarm state and perform any other actions such as
     * Amazon SNS notifications or Auto Scaling policies.
     * </p>
     * <p>
     * If you are using temporary security credentials granted using the AWS
     * Security Token Service (AWS STS), you cannot stop or terminate an Amazon
     * EC2 instance using alarm actions.
     * </p>
     * </note>
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
     * Publishes metric data points to Amazon CloudWatch. Amazon CloudWatch
     * associates the data points with the specified metric. If the specified
     * metric does not exist, Amazon CloudWatch creates the metric. When Amazon
     * CloudWatch creates a metric, it can take up to fifteen minutes for the
     * metric to appear in calls to the <a>ListMetrics</a> action.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 8 KB in size for
     * HTTP GET requests and is limited to 40 KB in size for HTTP POST requests.
     * </p>
     * <important>Although the <code>Value</code> parameter accepts numbers of
     * type <code>Double</code>, Amazon CloudWatch rejects values that are
     * either too small or too large. Values must be in the range of
     * 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (e.g., NaN, +Infinity, -Infinity) are not
     * supported. </important>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
     * 
     * @param putMetricDataRequest
     * @sample AmazonCloudWatchAsync.PutMetricData
     */
    java.util.concurrent.Future<Void> putMetricDataAsync(
            PutMetricDataRequest putMetricDataRequest);

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. Amazon CloudWatch
     * associates the data points with the specified metric. If the specified
     * metric does not exist, Amazon CloudWatch creates the metric. When Amazon
     * CloudWatch creates a metric, it can take up to fifteen minutes for the
     * metric to appear in calls to the <a>ListMetrics</a> action.
     * </p>
     * <p>
     * Each <code>PutMetricData</code> request is limited to 8 KB in size for
     * HTTP GET requests and is limited to 40 KB in size for HTTP POST requests.
     * </p>
     * <important>Although the <code>Value</code> parameter accepts numbers of
     * type <code>Double</code>, Amazon CloudWatch rejects values that are
     * either too small or too large. Values must be in the range of
     * 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (e.g., NaN, +Infinity, -Infinity) are not
     * supported. </important>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
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
     * configured for the appropriate state is invoked. For example, if your
     * alarm is configured to send an Amazon SNS message when an alarm is
     * triggered, temporarily changing the alarm's state to <b>ALARM</b> will
     * send an Amazon SNS message. This is not a permanent change. The next
     * periodic alarm check (in about a minute) will set the alarm to its actual
     * state. Because the alarm state change happens very quickly, it is
     * typically only visibile in the alarm's <b>History</b> tab in the Amazon
     * CloudWatch console or through <code>DescribeAlarmHistory</code>.
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
     * configured for the appropriate state is invoked. For example, if your
     * alarm is configured to send an Amazon SNS message when an alarm is
     * triggered, temporarily changing the alarm's state to <b>ALARM</b> will
     * send an Amazon SNS message. This is not a permanent change. The next
     * periodic alarm check (in about a minute) will set the alarm to its actual
     * state. Because the alarm state change happens very quickly, it is
     * typically only visibile in the alarm's <b>History</b> tab in the Amazon
     * CloudWatch console or through <code>DescribeAlarmHistory</code>.
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
