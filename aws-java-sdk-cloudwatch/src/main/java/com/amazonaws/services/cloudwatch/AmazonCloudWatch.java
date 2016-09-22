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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters;

/**
 * Interface for accessing CloudWatch.
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
public interface AmazonCloudWatch {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "monitoring";

    /**
     * Overrides the default endpoint for this client ("https://monitoring.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "monitoring.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://monitoring.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "monitoring.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://monitoring.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudWatch#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
    DeleteAlarmsResult deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest);

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
    DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest describeAlarmHistoryRequest);

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistory(DescribeAlarmHistoryRequest)
     */
    DescribeAlarmHistoryResult describeAlarmHistory();

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
    DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest);

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarms(DescribeAlarmsRequest)
     */
    DescribeAlarmsResult describeAlarms();

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
    DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest);

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
    DisableAlarmActionsResult disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest);

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
    EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest);

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
    GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest);

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
    ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest);

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetrics(ListMetricsRequest)
     */
    ListMetricsResult listMetrics();

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
    PutMetricAlarmResult putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest);

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
    PutMetricDataResult putMetricData(PutMetricDataRequest putMetricDataRequest);

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
    SetAlarmStateResult setAlarmState(SetAlarmStateRequest setAlarmStateRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonCloudWatchWaiters waiters();
}
