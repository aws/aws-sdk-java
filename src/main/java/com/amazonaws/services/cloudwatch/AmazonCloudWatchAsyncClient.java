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
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;

import com.amazonaws.services.cloudwatch.model.*;


/**
 * Client for accessing AmazonCloudWatch.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
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
public class AmazonCloudWatchAsyncClient extends AmazonCloudWatchClient
        implements AmazonCloudWatchAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonCloudWatch using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be 
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */                                      
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudWatch using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials 
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }
     
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudWatch using the specified AWS account credentials,
     * executor service, and client configuration options.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials 
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCloudWatchAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }
     
    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *   
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }
            
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
    public Future<Void> putMetricAlarmAsync(final PutMetricAlarmRequest putMetricAlarmRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putMetricAlarm(putMetricAlarmRequest);
                return null;
		    }
		});
    }
    
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
    public Future<ListMetricsResult> listMetricsAsync(final ListMetricsRequest listMetricsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMetricsResult>() {
            public ListMetricsResult call() throws Exception {
                return listMetrics(listMetricsRequest);
		    }
		});
    }
    
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
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(final GetMetricStatisticsRequest getMetricStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMetricStatisticsResult>() {
            public GetMetricStatisticsResult call() throws Exception {
                return getMetricStatistics(getMetricStatisticsRequest);
		    }
		});
    }
    
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
    public Future<Void> disableAlarmActionsAsync(final DisableAlarmActionsRequest disableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableAlarmActions(disableAlarmActionsRequest);
                return null;
		    }
		});
    }
    
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
    public Future<DescribeAlarmsResult> describeAlarmsAsync(final DescribeAlarmsRequest describeAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsResult>() {
            public DescribeAlarmsResult call() throws Exception {
                return describeAlarms(describeAlarmsRequest);
		    }
		});
    }
    
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
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(final DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmsForMetricResult>() {
            public DescribeAlarmsForMetricResult call() throws Exception {
                return describeAlarmsForMetric(describeAlarmsForMetricRequest);
		    }
		});
    }
    
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
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(final DescribeAlarmHistoryRequest describeAlarmHistoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAlarmHistoryResult>() {
            public DescribeAlarmHistoryResult call() throws Exception {
                return describeAlarmHistory(describeAlarmHistoryRequest);
		    }
		});
    }
    
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
    public Future<Void> enableAlarmActionsAsync(final EnableAlarmActionsRequest enableAlarmActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableAlarmActions(enableAlarmActionsRequest);
                return null;
		    }
		});
    }
    
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
    public Future<Void> deleteAlarmsAsync(final DeleteAlarmsRequest deleteAlarmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAlarms(deleteAlarmsRequest);
                return null;
		    }
		});
    }
    
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
    public Future<Void> setAlarmStateAsync(final SetAlarmStateRequest setAlarmStateRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setAlarmState(setAlarmStateRequest);
                return null;
		    }
		});
    }
    
}
        