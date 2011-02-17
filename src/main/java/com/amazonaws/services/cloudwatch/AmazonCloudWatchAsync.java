/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing AmazonCloudWatch asynchronously,
 * using Java Futures.
 * Amazon CloudWatch <p>
 * Amazon CloudWatch is a web service that enables you to monitor and
 * manage various metrics, as well as configure alarm actions based on
 * data from metrics.
 * </p>
 * <p>
 * Amazon CloudWatch monitoring enables you to collect, analyze, and view
 * system and application metrics so that you can make operational and
 * business decisions more quickly and with greater confidence. You can
 * use Amazon CloudWatch to collect metrics about your AWS resources,
 * such as the performance of your Amazon EC2 instances.
 * </p>
 * <p>
 * If you are registered for an AWS product that supports Amazon
 * CloudWatch, the service automatically pushes basic metrics to
 * CloudWatch for you. Once Amazon CloudWatch contains metrics, you can
 * calculate statistics based on that data.
 * </p>
 * <p>
 * Amazon CloudWatch alarms help you implement decisions more easily by
 * enabling you do things like send notifications or automatically make
 * changes to the resources you are monitoring, based on rules that you
 * define. For example, you can create alarms that initiate Auto Scaling
 * and Simple Notification Service actions on your behalf.
 * </p> 
 */       
public interface AmazonCloudWatchAsync extends AmazonCloudWatch {
    /**
     * <p>
     * Creates or updates an alarm and associates it with the specified
     * Amazon CloudWatch metric. Optionally, this operation can associate one
     * or more Amazon Simple Notification Service resources with the alarm.
     * </p>
     * <p>
     * When this operation creates an alarm, the alarm state is immediately
     * set to <code>INSUFFICIENT_DATA</code> . The alarm is evaluated and
     * its <code>StateValue</code> is set appropriately. Any actions
     * associated with the <code>StateValue</code> is then executed.
     * </p>
     * <p>
     * <b>NOTE:</b> When updating an existing alarm, its StateValue is left
     * unchanged.
     * </p>
     *
     * @param putMetricAlarmRequest Container for the necessary parameters to
     *           execute the PutMetricAlarm operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         PutMetricAlarm service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putMetricAlarmAsync(PutMetricAlarmRequest putMetricAlarmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of valid metrics stored for the AWS account owner.
     * Returned metrics can be used with <code>GetMetricStatistics</code> to
     * obtain statistical data for a given metric.
     * </p>
     * <p>
     * <b>NOTE:</b> Up to 500 results are returned for any one call. To
     * retrieve further results, use returned NextToken values with
     * subsequent ListMetrics operations.
     * </p>
     *
     * @param listMetricsRequest Container for the necessary parameters to
     *           execute the ListMetrics operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         ListMetrics service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest listMetricsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets statistics for the specified metric.
     * </p>
     * <p>
     * <b>NOTE:</b> The maximum number of datapoints returned from a single
     * GetMetricStatistics request is 1,440. If a request is made that
     * generates more than 1,440 datapoints, Amazon CloudWatch returns an
     * error. In such a case, alter the request by narrowing the specified
     * time range or increasing the specified period. Alternatively, make
     * multiple requests across adjacent time ranges.
     * </p>
     *
     * @param getMetricStatisticsRequest Container for the necessary
     *           parameters to execute the GetMetricStatistics operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         GetMetricStatistics service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest getMetricStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables actions for the specified alarms. When an alarm's actions
     * are disabled the alarm's state may change, but none of the alarm's
     * actions will execute.
     * </p>
     *
     * @param disableAlarmActionsRequest Container for the necessary
     *           parameters to execute the DisableAlarmActions operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAlarmActions service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableAlarmActionsAsync(DisableAlarmActionsRequest disableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves alarms with the specified names. If no name is specified,
     * all alarms for the user are returned. Alarms can be retrieved by using
     * only a prefix for the alarm name, the alarm state, or a prefix for any
     * action.
     * </p>
     *
     * @param describeAlarmsRequest Container for the necessary parameters to
     *           execute the DescribeAlarms operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAlarms service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest describeAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves all alarms for a single metric. Specify a statistic,
     * period, or unit to filter the set of alarms further.
     * </p>
     *
     * @param describeAlarmsForMetricRequest Container for the necessary
     *           parameters to execute the DescribeAlarmsForMetric operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAlarmsForMetric service method, as returned by
     *         AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves history for the specified alarm. Filter alarms by date
     * range or item type. If an alarm name is not specified, Amazon
     * CloudWatch returns histories for all of the owner's alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon CloudWatch retains the history of deleted alarms
     * for a period of six weeks. If an alarm has been deleted, its history
     * can still be queried.
     * </p>
     *
     * @param describeAlarmHistoryRequest Container for the necessary
     *           parameters to execute the DescribeAlarmHistory operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAlarmHistory service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables actions for the specified alarms.
     * </p>
     *
     * @param enableAlarmActionsRequest Container for the necessary
     *           parameters to execute the EnableAlarmActions operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAlarmActions service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableAlarmActionsAsync(EnableAlarmActionsRequest enableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes all specified alarms. In the event of an error, no alarms are
     * deleted.
     * </p>
     *
     * @param deleteAlarmsRequest Container for the necessary parameters to
     *           execute the DeleteAlarms operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlarms service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAlarmsAsync(DeleteAlarmsRequest deleteAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Temporarily sets the state of an alarm. When the updated
     * <code>StateValue</code> differs from the previous value, the action
     * configured for the appropriate state is invoked. This is not a
     * permanent change. The next periodic alarm check (in about a minute)
     * will set the alarm to its actual state.
     * </p>
     *
     * @param setAlarmStateRequest Container for the necessary parameters to
     *           execute the SetAlarmState operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         SetAlarmState service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setAlarmStateAsync(SetAlarmStateRequest setAlarmStateRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        