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
package com.amazonaws.services.logs;

import com.amazonaws.services.logs.model.*;

/**
 * Interface for accessing Amazon CloudWatch Logs asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.logs.AbstractAWSLogsAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from EC2 instances, Amazon
 * CloudTrail, or other sources. You can then retrieve the associated log data from CloudWatch Logs using the Amazon
 * CloudWatch console, the CloudWatch Logs commands in the AWS CLI, the CloudWatch Logs API, or the CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor Logs from Amazon EC2 Instances in Real-time</b>: You can use CloudWatch Logs to monitor applications and
 * systems using log data. For example, CloudWatch Logs can track the number of errors that occur in your application
 * logs and send you a notification whenever the rate of errors exceeds a threshold you specify. CloudWatch Logs uses
 * your log data for monitoring; so, no code changes are required. For example, you can monitor application logs for
 * specific literal terms (such as "NullReferenceException") or count the number of occurrences of a literal term at a
 * particular position in log data (such as "404" status codes in an Apache access log). When the term you are searching
 * for is found, CloudWatch Logs reports the data to a Amazon CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor Amazon CloudTrail Logged Events</b>: You can create alarms in Amazon CloudWatch and receive notifications
 * of particular API activity as captured by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive Log Data</b>: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
 * the log retention setting so that any log events older than this setting are automatically deleted. The CloudWatch
 * Logs agent makes it easy to quickly send both rotated and non-rotated log data off of a host and into the log
 * service. You can then access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 */
public interface AWSLogsAsync extends AWSLogs {

    /**
     * <p>
     * Cancels the specified export task.
     * </p>
     * <p>
     * The task must be in the <code>PENDING</code> or <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return A Java Future containing the result of the CancelExportTask operation returned by the service.
     * @sample AWSLogsAsync.CancelExportTask
     */
    java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Cancels the specified export task.
     * </p>
     * <p>
     * The task must be in the <code>PENDING</code> or <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelExportTask operation returned by the service.
     * @sample AWSLogsAsyncHandler.CancelExportTask
     */
    java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler);

    /**
     * <p>
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is provided, this operation initiates an export
     * task and responds with the ID of the task. After the task has started, you can use <a>DescribeExportTasks</a> to
     * get the status of the export task. Each account can only have one active (<code>RUNNING</code> or
     * <code>PENDING</code>) export task at a time. To cancel an export task, use <a>CancelExportTask</a>.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log
     * data for each export task, you can specify a prefix that will be used as the Amazon S3 key prefix for all
     * exported objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @return A Java Future containing the result of the CreateExportTask operation returned by the service.
     * @sample AWSLogsAsync.CreateExportTask
     */
    java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(CreateExportTaskRequest createExportTaskRequest);

    /**
     * <p>
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is provided, this operation initiates an export
     * task and responds with the ID of the task. After the task has started, you can use <a>DescribeExportTasks</a> to
     * get the status of the export task. Each account can only have one active (<code>RUNNING</code> or
     * <code>PENDING</code>) export task at a time. To cancel an export task, use <a>CancelExportTask</a>.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log
     * data for each export task, you can specify a prefix that will be used as the Amazon S3 key prefix for all
     * exported objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExportTask operation returned by the service.
     * @sample AWSLogsAsyncHandler.CreateExportTask
     */
    java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(CreateExportTaskRequest createExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExportTaskRequest, CreateExportTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a log group with the specified name.
     * </p>
     * <p>
     * You can create up to 5000 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names must be unique within a region for an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward
     * slash), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogGroupRequest
     * @return A Java Future containing the result of the CreateLogGroup operation returned by the service.
     * @sample AWSLogsAsync.CreateLogGroup
     */
    java.util.concurrent.Future<CreateLogGroupResult> createLogGroupAsync(CreateLogGroupRequest createLogGroupRequest);

    /**
     * <p>
     * Creates a log group with the specified name.
     * </p>
     * <p>
     * You can create up to 5000 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names must be unique within a region for an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward
     * slash), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLogGroup operation returned by the service.
     * @sample AWSLogsAsyncHandler.CreateLogGroup
     */
    java.util.concurrent.Future<CreateLogGroupResult> createLogGroupAsync(CreateLogGroupRequest createLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLogGroupRequest, CreateLogGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a log stream for the specified log group.
     * </p>
     * <p>
     * There is no limit on the number of log streams that you can create for a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log stream names must be unique within the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log stream names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ':' (colon) and '*' (asterisk) characters are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogStreamRequest
     * @return A Java Future containing the result of the CreateLogStream operation returned by the service.
     * @sample AWSLogsAsync.CreateLogStream
     */
    java.util.concurrent.Future<CreateLogStreamResult> createLogStreamAsync(CreateLogStreamRequest createLogStreamRequest);

    /**
     * <p>
     * Creates a log stream for the specified log group.
     * </p>
     * <p>
     * There is no limit on the number of log streams that you can create for a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log stream names must be unique within the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log stream names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ':' (colon) and '*' (asterisk) characters are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLogStream operation returned by the service.
     * @sample AWSLogsAsyncHandler.CreateLogStream
     */
    java.util.concurrent.Future<CreateLogStreamResult> createLogStreamAsync(CreateLogStreamRequest createLogStreamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLogStreamRequest, CreateLogStreamResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This
     * operation does not delete the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return A Java Future containing the result of the DeleteDestination operation returned by the service.
     * @sample AWSLogsAsync.DeleteDestination
     */
    java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This
     * operation does not delete the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDestination operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteDestination
     */
    java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest deleteDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log
     * group.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @return A Java Future containing the result of the DeleteLogGroup operation returned by the service.
     * @sample AWSLogsAsync.DeleteLogGroup
     */
    java.util.concurrent.Future<DeleteLogGroupResult> deleteLogGroupAsync(DeleteLogGroupRequest deleteLogGroupRequest);

    /**
     * <p>
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log
     * group.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLogGroup operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteLogGroup
     */
    java.util.concurrent.Future<DeleteLogGroupResult> deleteLogGroupAsync(DeleteLogGroupRequest deleteLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLogGroupRequest, DeleteLogGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log
     * stream.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @return A Java Future containing the result of the DeleteLogStream operation returned by the service.
     * @sample AWSLogsAsync.DeleteLogStream
     */
    java.util.concurrent.Future<DeleteLogStreamResult> deleteLogStreamAsync(DeleteLogStreamRequest deleteLogStreamRequest);

    /**
     * <p>
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log
     * stream.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLogStream operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteLogStream
     */
    java.util.concurrent.Future<DeleteLogStreamResult> deleteLogStreamAsync(DeleteLogStreamRequest deleteLogStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLogStreamRequest, DeleteLogStreamResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified metric filter.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @return A Java Future containing the result of the DeleteMetricFilter operation returned by the service.
     * @sample AWSLogsAsync.DeleteMetricFilter
     */
    java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(DeleteMetricFilterRequest deleteMetricFilterRequest);

    /**
     * <p>
     * Deletes the specified metric filter.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMetricFilter operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteMetricFilter
     */
    java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(DeleteMetricFilterRequest deleteMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricFilterRequest, DeleteMetricFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified retention policy.
     * </p>
     * <p>
     * Log events do not expire if they belong to log groups without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service.
     * @sample AWSLogsAsync.DeleteRetentionPolicy
     */
    java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest);

    /**
     * <p>
     * Deletes the specified retention policy.
     * </p>
     * <p>
     * Log events do not expire if they belong to log groups without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteRetentionPolicy
     */
    java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, DeleteRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified subscription filter.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @return A Java Future containing the result of the DeleteSubscriptionFilter operation returned by the service.
     * @sample AWSLogsAsync.DeleteSubscriptionFilter
     */
    java.util.concurrent.Future<DeleteSubscriptionFilterResult> deleteSubscriptionFilterAsync(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest);

    /**
     * <p>
     * Deletes the specified subscription filter.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriptionFilter operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteSubscriptionFilter
     */
    java.util.concurrent.Future<DeleteSubscriptionFilterResult> deleteSubscriptionFilterAsync(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionFilterRequest, DeleteSubscriptionFilterResult> asyncHandler);

    /**
     * <p>
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @return A Java Future containing the result of the DescribeDestinations operation returned by the service.
     * @sample AWSLogsAsync.DescribeDestinations
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(DescribeDestinationsRequest describeDestinationsRequest);

    /**
     * <p>
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDestinations operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeDestinations
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(DescribeDestinationsRequest describeDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDestinations operation.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest)
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync();

    /**
     * Simplified method form for invoking the DescribeDestinations operation with an AsyncHandler.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler);

    /**
     * <p>
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or
     * task status.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AWSLogsAsync.DescribeExportTasks
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or
     * task status.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportTasks operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeExportTasks
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler);

    /**
     * <p>
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are
     * ASCII-sorted by log group name.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @return A Java Future containing the result of the DescribeLogGroups operation returned by the service.
     * @sample AWSLogsAsync.DescribeLogGroups
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(DescribeLogGroupsRequest describeLogGroupsRequest);

    /**
     * <p>
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are
     * ASCII-sorted by log group name.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLogGroups operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeLogGroups
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(DescribeLogGroupsRequest describeLogGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLogGroups operation.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest)
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeLogGroups operation with an AsyncHandler.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by
     * prefix. You can also control how the results are ordered.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second, after which transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     * @return A Java Future containing the result of the DescribeLogStreams operation returned by the service.
     * @sample AWSLogsAsync.DescribeLogStreams
     */
    java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(DescribeLogStreamsRequest describeLogStreamsRequest);

    /**
     * <p>
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by
     * prefix. You can also control how the results are ordered.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second, after which transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLogStreams operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeLogStreams
     */
    java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(DescribeLogStreamsRequest describeLogStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLogStreamsRequest, DescribeLogStreamsResult> asyncHandler);

    /**
     * <p>
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name,
     * prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @return A Java Future containing the result of the DescribeMetricFilters operation returned by the service.
     * @sample AWSLogsAsync.DescribeMetricFilters
     */
    java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(DescribeMetricFiltersRequest describeMetricFiltersRequest);

    /**
     * <p>
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name,
     * prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMetricFilters operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeMetricFilters
     */
    java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(DescribeMetricFiltersRequest describeMetricFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
     * the results by prefix. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return A Java Future containing the result of the DescribeSubscriptionFilters operation returned by the service.
     * @sample AWSLogsAsync.DescribeSubscriptionFilters
     */
    java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest);

    /**
     * <p>
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
     * the results by prefix. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscriptionFilters operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeSubscriptionFilters
     */
    java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists log events from the specified log group. You can list all the log events or filter the results using a
     * filter pattern, a time range, and the name of the log stream.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in 1MB (up to 10,000 log events), or all the
     * events found within the time range that you specify. If the results include a token, then there are more log
     * events available, and you can get additional results by specifying the token in a subsequent call.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @return A Java Future containing the result of the FilterLogEvents operation returned by the service.
     * @sample AWSLogsAsync.FilterLogEvents
     */
    java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest filterLogEventsRequest);

    /**
     * <p>
     * Lists log events from the specified log group. You can list all the log events or filter the results using a
     * filter pattern, a time range, and the name of the log stream.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in 1MB (up to 10,000 log events), or all the
     * events found within the time range that you specify. If the results include a token, then there are more log
     * events available, and you can get additional results by specifying the token in a subsequent call.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FilterLogEvents operation returned by the service.
     * @sample AWSLogsAsyncHandler.FilterLogEvents
     */
    java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest filterLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<FilterLogEventsRequest, FilterLogEventsResult> asyncHandler);

    /**
     * <p>
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
     * events). If the results include tokens, there are more log events available. You can get additional log events by
     * specifying one of the tokens in a subsequent call.
     * </p>
     * 
     * @param getLogEventsRequest
     * @return A Java Future containing the result of the GetLogEvents operation returned by the service.
     * @sample AWSLogsAsync.GetLogEvents
     */
    java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest getLogEventsRequest);

    /**
     * <p>
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
     * events). If the results include tokens, there are more log events available. You can get additional log events by
     * specifying one of the tokens in a subsequent call.
     * </p>
     * 
     * @param getLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLogEvents operation returned by the service.
     * @sample AWSLogsAsyncHandler.GetLogEvents
     */
    java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest getLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a destination. A destination encapsulates a physical resource (such as a Kinesis stream) and
     * enables you to subscribe to a real-time stream of log events of a different account, ingested using
     * <a>PutLogEvents</a>. Currently, the only supported physical resource is a Amazon Kinesis stream belonging to the
     * same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream through an access policy. By default,
     * <code>PutDestination</code> does not set any access policy with the destination, which means a cross-account user
     * cannot call <a>PutSubscriptionFilter</a> against this destination. To enable this, the destination owner must
     * call <a>PutDestinationPolicy</a> after <code>PutDestination</code>.
     * </p>
     * 
     * @param putDestinationRequest
     * @return A Java Future containing the result of the PutDestination operation returned by the service.
     * @sample AWSLogsAsync.PutDestination
     */
    java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest putDestinationRequest);

    /**
     * <p>
     * Creates or updates a destination. A destination encapsulates a physical resource (such as a Kinesis stream) and
     * enables you to subscribe to a real-time stream of log events of a different account, ingested using
     * <a>PutLogEvents</a>. Currently, the only supported physical resource is a Amazon Kinesis stream belonging to the
     * same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream through an access policy. By default,
     * <code>PutDestination</code> does not set any access policy with the destination, which means a cross-account user
     * cannot call <a>PutSubscriptionFilter</a> against this destination. To enable this, the destination owner must
     * call <a>PutDestinationPolicy</a> after <code>PutDestination</code>.
     * </p>
     * 
     * @param putDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDestination operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutDestination
     */
    java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest putDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<PutDestinationRequest, PutDestinationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @return A Java Future containing the result of the PutDestinationPolicy operation returned by the service.
     * @sample AWSLogsAsync.PutDestinationPolicy
     */
    java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(PutDestinationPolicyRequest putDestinationPolicyRequest);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDestinationPolicy operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutDestinationPolicy
     */
    java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(PutDestinationPolicyRequest putDestinationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutDestinationPolicyRequest, PutDestinationPolicyResult> asyncHandler);

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * You must include the sequence token obtained from the response of the previous call. An upload in a newly created
     * log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>.
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8,
     * plus 26 bytes for each log event.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be more than 2 hours in the future.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be older than 14 days or the retention period of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The log events in the batch must be in chronological ordered by their timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single PutLogEvents request cannot span more than 24 hours. Otherwise, the
     * PutLogEvents operation will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putLogEventsRequest
     * @return A Java Future containing the result of the PutLogEvents operation returned by the service.
     * @sample AWSLogsAsync.PutLogEvents
     */
    java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(PutLogEventsRequest putLogEventsRequest);

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * You must include the sequence token obtained from the response of the previous call. An upload in a newly created
     * log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>.
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8,
     * plus 26 bytes for each log event.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be more than 2 hours in the future.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be older than 14 days or the retention period of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The log events in the batch must be in chronological ordered by their timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single PutLogEvents request cannot span more than 24 hours. Otherwise, the
     * PutLogEvents operation will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLogEvents operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutLogEvents
     */
    java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(PutLogEventsRequest putLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutLogEventsRequest, PutLogEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to
     * configure rules to extract metric data from log events ingested through <a>PutLogEvents</a>.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     * @return A Java Future containing the result of the PutMetricFilter operation returned by the service.
     * @sample AWSLogsAsync.PutMetricFilter
     */
    java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(PutMetricFilterRequest putMetricFilterRequest);

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to
     * configure rules to extract metric data from log events ingested through <a>PutLogEvents</a>.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMetricFilter operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutMetricFilter
     */
    java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(PutMetricFilterRequest putMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricFilterRequest, PutMetricFilterResult> asyncHandler);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days you
     * want to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AWSLogsAsync.PutRetentionPolicy
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days you
     * want to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutRetentionPolicy
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, PutRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters
     * allow you to subscribe to a real-time stream of log events ingested through <a>PutLogEvents</a> and have them
     * delivered to a specific destination. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination that belongs to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose stream that belongs to the same account as the subscription filter, for same-account
     * delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There can only be one subscription filter associated with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @return A Java Future containing the result of the PutSubscriptionFilter operation returned by the service.
     * @sample AWSLogsAsync.PutSubscriptionFilter
     */
    java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(PutSubscriptionFilterRequest putSubscriptionFilterRequest);

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters
     * allow you to subscribe to a real-time stream of log events ingested through <a>PutLogEvents</a> and have them
     * delivered to a specific destination. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination that belongs to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose stream that belongs to the same account as the subscription filter, for same-account
     * delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There can only be one subscription filter associated with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSubscriptionFilter operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutSubscriptionFilter
     */
    java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(PutSubscriptionFilterRequest putSubscriptionFilterRequest,
            com.amazonaws.handlers.AsyncHandler<PutSubscriptionFilterRequest, PutSubscriptionFilterResult> asyncHandler);

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
     * validate the correctness of a metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @return A Java Future containing the result of the TestMetricFilter operation returned by the service.
     * @sample AWSLogsAsync.TestMetricFilter
     */
    java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(TestMetricFilterRequest testMetricFilterRequest);

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
     * validate the correctness of a metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestMetricFilter operation returned by the service.
     * @sample AWSLogsAsyncHandler.TestMetricFilter
     */
    java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(TestMetricFilterRequest testMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler);

}
