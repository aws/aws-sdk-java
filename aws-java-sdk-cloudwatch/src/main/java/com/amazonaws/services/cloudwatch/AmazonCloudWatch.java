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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters;

/**
 * Interface for accessing CloudWatch.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatch.AbstractAmazonCloudWatch} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "monitoring.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://monitoring.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
    DeleteAlarmsResult deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest);

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
    DeleteDashboardsResult deleteDashboards(DeleteDashboardsRequest deleteDashboardsRequest);

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
    DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest describeAlarmHistoryRequest);

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistory(DescribeAlarmHistoryRequest)
     */
    DescribeAlarmHistoryResult describeAlarmHistory();

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
    DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest);

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarms(DescribeAlarmsRequest)
     */
    DescribeAlarmsResult describeAlarms();

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
    DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest);

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
    DisableAlarmActionsResult disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest);

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
    EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest);

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
    GetDashboardResult getDashboard(GetDashboardRequest getDashboardRequest);

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
    GetMetricDataResult getMetricData(GetMetricDataRequest getMetricDataRequest);

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
    GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest);

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
    GetMetricWidgetImageResult getMetricWidgetImage(GetMetricWidgetImageRequest getMetricWidgetImageRequest);

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
    ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest);

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
    ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest);

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetrics(ListMetricsRequest)
     */
    ListMetricsResult listMetrics();

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    PutDashboardResult putDashboard(PutDashboardRequest putDashboardRequest);

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
    PutMetricAlarmResult putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest);

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
    PutMetricDataResult putMetricData(PutMetricDataRequest putMetricDataRequest);

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
    SetAlarmStateResult setAlarmState(SetAlarmStateRequest setAlarmStateRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
