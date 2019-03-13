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
package com.amazonaws.services.logs;

import javax.annotation.Generated;

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
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from Amazon EC2 instances, AWS
 * CloudTrail, or other sources. You can then retrieve the associated log data from CloudWatch Logs using the CloudWatch
 * console, CloudWatch Logs commands in the AWS CLI, CloudWatch Logs API, or CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor logs from EC2 instances in real-time</b>: You can use CloudWatch Logs to monitor applications and systems
 * using log data. For example, CloudWatch Logs can track the number of errors that occur in your application logs and
 * send you a notification whenever the rate of errors exceeds a threshold that you specify. CloudWatch Logs uses your
 * log data for monitoring; so, no code changes are required. For example, you can monitor application logs for specific
 * literal terms (such as "NullReferenceException") or count the number of occurrences of a literal term at a particular
 * position in log data (such as "404" status codes in an Apache access log). When the term you are searching for is
 * found, CloudWatch Logs reports the data to a CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor AWS CloudTrail logged events</b>: You can create alarms in CloudWatch and receive notifications of
 * particular API activity as captured by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive log data</b>: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
 * the log retention setting so that any log events older than this setting are automatically deleted. The CloudWatch
 * Logs agent makes it easy to quickly send both rotated and non-rotated log data off of a host and into the log
 * service. You can then access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLogsAsync extends AWSLogs {

    /**
     * <p>
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log
     * group.
     * </p>
     * <p>
     * Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK.
     * After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK.
     * This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs.
     * This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * <p>
     * If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will
     * receive an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param associateKmsKeyRequest
     * @return A Java Future containing the result of the AssociateKmsKey operation returned by the service.
     * @sample AWSLogsAsync.AssociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AssociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateKmsKeyResult> associateKmsKeyAsync(AssociateKmsKeyRequest associateKmsKeyRequest);

    /**
     * <p>
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log
     * group.
     * </p>
     * <p>
     * Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK.
     * After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK.
     * This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs.
     * This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * <p>
     * If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will
     * receive an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param associateKmsKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateKmsKey operation returned by the service.
     * @sample AWSLogsAsyncHandler.AssociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AssociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateKmsKeyResult> associateKmsKeyAsync(AssociateKmsKeyRequest associateKmsKeyRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateKmsKeyRequest, AssociateKmsKeyResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
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
     * data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported
     * objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @return A Java Future containing the result of the CreateExportTask operation returned by the service.
     * @sample AWSLogsAsync.CreateExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateExportTask" target="_top">AWS API
     *      Documentation</a>
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
     * data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported
     * objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExportTask operation returned by the service.
     * @sample AWSLogsAsyncHandler.CreateExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateExportTask" target="_top">AWS API
     *      Documentation</a>
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
     * <p>
     * If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested
     * data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still
     * within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will
     * receive an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param createLogGroupRequest
     * @return A Java Future containing the result of the CreateLogGroup operation returned by the service.
     * @sample AWSLogsAsync.CreateLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogGroup" target="_top">AWS API
     *      Documentation</a>
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
     * <p>
     * If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested
     * data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still
     * within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will
     * receive an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param createLogGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLogGroup operation returned by the service.
     * @sample AWSLogsAsyncHandler.CreateLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogGroup" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogStream" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogStream" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDestination" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDestination" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogGroup" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogGroup" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogStream" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogStream" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteMetricFilter" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(DeleteMetricFilterRequest deleteMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricFilterRequest, DeleteMetricFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log
     * events to this account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSLogsAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log
     * events to this account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSLogsAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteSubscriptionFilter" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteSubscriptionFilter" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDestinations" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDestinations" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogGroups" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogGroups" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogStreams" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogStreams" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeMetricFilters" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeMetricFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(DescribeMetricFiltersRequest describeMetricFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently
     * in this account. You can request all queries, or limit it to queries of a specific log group or queries with a
     * certain status.
     * </p>
     * 
     * @param describeQueriesRequest
     * @return A Java Future containing the result of the DescribeQueries operation returned by the service.
     * @sample AWSLogsAsync.DescribeQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeQueriesResult> describeQueriesAsync(DescribeQueriesRequest describeQueriesRequest);

    /**
     * <p>
     * Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently
     * in this account. You can request all queries, or limit it to queries of a specific log group or queries with a
     * certain status.
     * </p>
     * 
     * @param describeQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeQueries operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeQueriesResult> describeQueriesAsync(DescribeQueriesRequest describeQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeQueriesRequest, DescribeQueriesResult> asyncHandler);

    /**
     * <p>
     * Lists the resource policies in this account.
     * </p>
     * 
     * @param describeResourcePoliciesRequest
     * @return A Java Future containing the result of the DescribeResourcePolicies operation returned by the service.
     * @sample AWSLogsAsync.DescribeResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeResourcePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourcePoliciesResult> describeResourcePoliciesAsync(DescribeResourcePoliciesRequest describeResourcePoliciesRequest);

    /**
     * <p>
     * Lists the resource policies in this account.
     * </p>
     * 
     * @param describeResourcePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResourcePolicies operation returned by the service.
     * @sample AWSLogsAsyncHandler.DescribeResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeResourcePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourcePoliciesResult> describeResourcePoliciesAsync(DescribeResourcePoliciesRequest describeResourcePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourcePoliciesRequest, DescribeResourcePoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
     * the results by prefix. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return A Java Future containing the result of the DescribeSubscriptionFilters operation returned by the service.
     * @sample AWSLogsAsync.DescribeSubscriptionFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeSubscriptionFilters"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeSubscriptionFilters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResult> asyncHandler);

    /**
     * <p>
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified
     * log group.
     * </p>
     * <p>
     * After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested
     * data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
     * permissions for the CMK whenever the encrypted data is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * 
     * @param disassociateKmsKeyRequest
     * @return A Java Future containing the result of the DisassociateKmsKey operation returned by the service.
     * @sample AWSLogsAsync.DisassociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DisassociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateKmsKeyResult> disassociateKmsKeyAsync(DisassociateKmsKeyRequest disassociateKmsKeyRequest);

    /**
     * <p>
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified
     * log group.
     * </p>
     * <p>
     * After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested
     * data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
     * permissions for the CMK whenever the encrypted data is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * 
     * @param disassociateKmsKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateKmsKey operation returned by the service.
     * @sample AWSLogsAsyncHandler.DisassociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DisassociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateKmsKeyResult> disassociateKmsKeyAsync(DisassociateKmsKeyRequest disassociateKmsKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateKmsKeyRequest, DisassociateKmsKeyResult> asyncHandler);

    /**
     * <p>
     * Lists log events from the specified log group. You can list all the log events or filter the results using a
     * filter pattern, a time range, and the name of the log stream.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the
     * events found within the time range that you specify. If the results include a token, then there are more log
     * events available, and you can get additional results by specifying the token in a subsequent call.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @return A Java Future containing the result of the FilterLogEvents operation returned by the service.
     * @sample AWSLogsAsync.FilterLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilterLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest filterLogEventsRequest);

    /**
     * <p>
     * Lists log events from the specified log group. You can list all the log events or filter the results using a
     * filter pattern, a time range, and the name of the log stream.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilterLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest filterLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<FilterLogEventsRequest, FilterLogEventsResult> asyncHandler);

    /**
     * <p>
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
     * events). You can get additional log events by specifying one of the tokens in a subsequent call.
     * </p>
     * 
     * @param getLogEventsRequest
     * @return A Java Future containing the result of the GetLogEvents operation returned by the service.
     * @sample AWSLogsAsync.GetLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest getLogEventsRequest);

    /**
     * <p>
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
     * events). You can get additional log events by specifying one of the tokens in a subsequent call.
     * </p>
     * 
     * @param getLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLogEvents operation returned by the service.
     * @sample AWSLogsAsyncHandler.GetLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest getLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the fields that are included in log events in the specified log group, along with the
     * percentage of log events that contain each field. The search is limited to a time period that you specify.
     * </p>
     * <p>
     * In the results, fields that start with @ are fields generated by CloudWatch Logs. For example,
     * <code>@timestamp</code> is the timestamp of each log event.
     * </p>
     * <p>
     * The response results are sorted by the frequency percentage, starting with the highest percentage.
     * </p>
     * 
     * @param getLogGroupFieldsRequest
     * @return A Java Future containing the result of the GetLogGroupFields operation returned by the service.
     * @sample AWSLogsAsync.GetLogGroupFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogGroupFields" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLogGroupFieldsResult> getLogGroupFieldsAsync(GetLogGroupFieldsRequest getLogGroupFieldsRequest);

    /**
     * <p>
     * Returns a list of the fields that are included in log events in the specified log group, along with the
     * percentage of log events that contain each field. The search is limited to a time period that you specify.
     * </p>
     * <p>
     * In the results, fields that start with @ are fields generated by CloudWatch Logs. For example,
     * <code>@timestamp</code> is the timestamp of each log event.
     * </p>
     * <p>
     * The response results are sorted by the frequency percentage, starting with the highest percentage.
     * </p>
     * 
     * @param getLogGroupFieldsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLogGroupFields operation returned by the service.
     * @sample AWSLogsAsyncHandler.GetLogGroupFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogGroupFields" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLogGroupFieldsResult> getLogGroupFieldsAsync(GetLogGroupFieldsRequest getLogGroupFieldsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLogGroupFieldsRequest, GetLogGroupFieldsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query
     * that produced the <code>logRecordPointer</code> retrieved only a subset of fields. Fields are returned as field
     * name/field value pairs.
     * </p>
     * <p>
     * Additionally, the entire unparsed log event is returned within <code>@message</code>.
     * </p>
     * 
     * @param getLogRecordRequest
     * @return A Java Future containing the result of the GetLogRecord operation returned by the service.
     * @sample AWSLogsAsync.GetLogRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogRecord" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLogRecordResult> getLogRecordAsync(GetLogRecordRequest getLogRecordRequest);

    /**
     * <p>
     * Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query
     * that produced the <code>logRecordPointer</code> retrieved only a subset of fields. Fields are returned as field
     * name/field value pairs.
     * </p>
     * <p>
     * Additionally, the entire unparsed log event is returned within <code>@message</code>.
     * </p>
     * 
     * @param getLogRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLogRecord operation returned by the service.
     * @sample AWSLogsAsyncHandler.GetLogRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogRecord" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLogRecordResult> getLogRecordAsync(GetLogRecordRequest getLogRecordRequest,
            com.amazonaws.handlers.AsyncHandler<GetLogRecordRequest, GetLogRecordResult> asyncHandler);

    /**
     * <p>
     * Returns the results from the specified query. If the query is in progress, partial results of that current
     * execution are returned. Only the fields requested in the query are returned.
     * </p>
     * <p>
     * <code>GetQueryResults</code> does not start a query execution. To run a query, use .
     * </p>
     * 
     * @param getQueryResultsRequest
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AWSLogsAsync.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Returns the results from the specified query. If the query is in progress, partial results of that current
     * execution are returned. Only the fields requested in the query are returned.
     * </p>
     * <p>
     * <code>GetQueryResults</code> does not start a query execution. To run a query, use .
     * </p>
     * 
     * @param getQueryResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AWSLogsAsyncHandler.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified log group.
     * </p>
     * 
     * @param listTagsLogGroupRequest
     * @return A Java Future containing the result of the ListTagsLogGroup operation returned by the service.
     * @sample AWSLogsAsync.ListTagsLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListTagsLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest listTagsLogGroupRequest);

    /**
     * <p>
     * Lists the tags for the specified log group.
     * </p>
     * 
     * @param listTagsLogGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsLogGroup operation returned by the service.
     * @sample AWSLogsAsyncHandler.ListTagsLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListTagsLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest listTagsLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsLogGroupRequest, ListTagsLogGroupResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis
     * stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using
     * <a>PutLogEvents</a>. Currently, the only supported physical resource is a Kinesis stream belonging to the same
     * account as the destination.
     * </p>
     * <p>
     * Through an access policy, a destination controls what is written to its Kinesis stream. By default,
     * <code>PutDestination</code> does not set any access policy with the destination, which means a cross-account user
     * cannot call <a>PutSubscriptionFilter</a> against this destination. To enable this, the destination owner must
     * call <a>PutDestinationPolicy</a> after <code>PutDestination</code>.
     * </p>
     * 
     * @param putDestinationRequest
     * @return A Java Future containing the result of the PutDestination operation returned by the service.
     * @sample AWSLogsAsync.PutDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestination" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest putDestinationRequest);

    /**
     * <p>
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis
     * stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using
     * <a>PutLogEvents</a>. Currently, the only supported physical resource is a Kinesis stream belonging to the same
     * account as the destination.
     * </p>
     * <p>
     * Through an access policy, a destination controls what is written to its Kinesis stream. By default,
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestination" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest putDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<PutDestinationRequest, PutDestinationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @return A Java Future containing the result of the PutDestinationPolicy operation returned by the service.
     * @sample AWSLogsAsync.PutDestinationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestinationPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(PutDestinationPolicyRequest putDestinationPolicyRequest);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestinationPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
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
     * The log events in the batch must be in chronological ordered by their timestamp. The timestamp is the time the
     * event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for
     * PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example,
     * 2017-09-15T13:45:30.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access
     * key ID or secret key.
     * </p>
     * 
     * @param putLogEventsRequest
     * @return A Java Future containing the result of the PutLogEvents operation returned by the service.
     * @sample AWSLogsAsync.PutLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(PutLogEventsRequest putLogEventsRequest);

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * You must include the sequence token obtained from the response of the previous call. An upload in a newly created
     * log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
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
     * The log events in the batch must be in chronological ordered by their timestamp. The timestamp is the time the
     * event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for
     * PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example,
     * 2017-09-15T13:45:30.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access
     * key ID or secret key.
     * </p>
     * 
     * @param putLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLogEvents operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutLogEvents" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutMetricFilter" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(PutMetricFilterRequest putMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricFilterRequest, PutMetricFilterResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as
     * Amazon Route 53. An account can have up to 10 resource policies per region.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSLogsAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as
     * Amazon Route 53. An account can have up to 10 resource policies per region.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for
     * which to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AWSLogsAsync.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for
     * which to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There can only be one subscription filter associated with a log group. If you are updating an existing filter,
     * you must specify the correct name in <code>filterName</code>. Otherwise, the call fails because you cannot
     * associate a second filter with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @return A Java Future containing the result of the PutSubscriptionFilter operation returned by the service.
     * @sample AWSLogsAsync.PutSubscriptionFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutSubscriptionFilter" target="_top">AWS API
     *      Documentation</a>
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
     * An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There can only be one subscription filter associated with a log group. If you are updating an existing filter,
     * you must specify the correct name in <code>filterName</code>. Otherwise, the call fails because you cannot
     * associate a second filter with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSubscriptionFilter operation returned by the service.
     * @sample AWSLogsAsyncHandler.PutSubscriptionFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutSubscriptionFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(PutSubscriptionFilterRequest putSubscriptionFilterRequest,
            com.amazonaws.handlers.AsyncHandler<PutSubscriptionFilterRequest, PutSubscriptionFilterResult> asyncHandler);

    /**
     * <p>
     * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to
     * query, and the query string to use.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param startQueryRequest
     * @return A Java Future containing the result of the StartQuery operation returned by the service.
     * @sample AWSLogsAsync.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest startQueryRequest);

    /**
     * <p>
     * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to
     * query, and the query string to use.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param startQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartQuery operation returned by the service.
     * @sample AWSLogsAsyncHandler.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest startQueryRequest,
            com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler);

    /**
     * <p>
     * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns
     * an error indicating that the specified query is not running.
     * </p>
     * 
     * @param stopQueryRequest
     * @return A Java Future containing the result of the StopQuery operation returned by the service.
     * @sample AWSLogsAsync.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest stopQueryRequest);

    /**
     * <p>
     * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns
     * an error indicating that the specified query is not running.
     * </p>
     * 
     * @param stopQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopQuery operation returned by the service.
     * @sample AWSLogsAsyncHandler.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest stopQueryRequest,
            com.amazonaws.handlers.AsyncHandler<StopQueryRequest, StopQueryResult> asyncHandler);

    /**
     * <p>
     * Adds or updates the specified tags for the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To remove tags, use <a>UntagLogGroup</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/log-group-tagging.html">Tag Log Groups in Amazon
     * CloudWatch Logs</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @param tagLogGroupRequest
     * @return A Java Future containing the result of the TagLogGroup operation returned by the service.
     * @sample AWSLogsAsync.TagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest tagLogGroupRequest);

    /**
     * <p>
     * Adds or updates the specified tags for the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To remove tags, use <a>UntagLogGroup</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/log-group-tagging.html">Tag Log Groups in Amazon
     * CloudWatch Logs</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * 
     * @param tagLogGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagLogGroup operation returned by the service.
     * @sample AWSLogsAsyncHandler.TagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest tagLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<TagLogGroupRequest, TagLogGroupResult> asyncHandler);

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
     * validate the correctness of a metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @return A Java Future containing the result of the TestMetricFilter operation returned by the service.
     * @sample AWSLogsAsync.TestMetricFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TestMetricFilter" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TestMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(TestMetricFilterRequest testMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To add tags, use <a>UntagLogGroup</a>.
     * </p>
     * 
     * @param untagLogGroupRequest
     * @return A Java Future containing the result of the UntagLogGroup operation returned by the service.
     * @sample AWSLogsAsync.UntagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UntagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest untagLogGroupRequest);

    /**
     * <p>
     * Removes the specified tags from the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To add tags, use <a>UntagLogGroup</a>.
     * </p>
     * 
     * @param untagLogGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagLogGroup operation returned by the service.
     * @sample AWSLogsAsyncHandler.UntagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UntagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest untagLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UntagLogGroupRequest, UntagLogGroupResult> asyncHandler);

}
