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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.logs.model.*;

/**
 * Interface for accessing Amazon CloudWatch Logs.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.logs.AbstractAWSLogs} instead.
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
public interface AWSLogs {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "logs";

    /**
     * Overrides the default endpoint for this client ("https://logs.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "logs.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://logs.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "logs.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://logs.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSLogs#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * Cancels the specified export task.
     * </p>
     * <p>
     * The task must be in the <code>PENDING</code> or <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return Result of the CancelExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidOperationException
     *         The operation is not valid on the specified resource.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.CancelExportTask
     */
    CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest);

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
     * @return Result of the CreateExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AWSLogs.CreateExportTask
     */
    CreateExportTaskResult createExportTask(CreateExportTaskRequest createExportTaskRequest);

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
     * @return Result of the CreateLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.CreateLogGroup
     */
    CreateLogGroupResult createLogGroup(CreateLogGroupRequest createLogGroupRequest);

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
     * @return Result of the CreateLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.CreateLogStream
     */
    CreateLogStreamResult createLogStream(CreateLogStreamRequest createLogStreamRequest);

    /**
     * <p>
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This
     * operation does not delete the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteDestination
     */
    DeleteDestinationResult deleteDestination(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log
     * group.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @return Result of the DeleteLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteLogGroup
     */
    DeleteLogGroupResult deleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest);

    /**
     * <p>
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log
     * stream.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @return Result of the DeleteLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteLogStream
     */
    DeleteLogStreamResult deleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest);

    /**
     * <p>
     * Deletes the specified metric filter.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @return Result of the DeleteMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteMetricFilter
     */
    DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest);

    /**
     * <p>
     * Deletes the specified retention policy.
     * </p>
     * <p>
     * Log events do not expire if they belong to log groups without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return Result of the DeleteRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteRetentionPolicy
     */
    DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest);

    /**
     * <p>
     * Deletes the specified subscription filter.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @return Result of the DeleteSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteSubscriptionFilter
     */
    DeleteSubscriptionFilterResult deleteSubscriptionFilter(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest);

    /**
     * <p>
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @return Result of the DescribeDestinations operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeDestinations
     */
    DescribeDestinationsResult describeDestinations(DescribeDestinationsRequest describeDestinationsRequest);

    /**
     * Simplified method form for invoking the DescribeDestinations operation.
     *
     * @see #describeDestinations(DescribeDestinationsRequest)
     */
    DescribeDestinationsResult describeDestinations();

    /**
     * <p>
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or
     * task status.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeExportTasks
     */
    DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are
     * ASCII-sorted by log group name.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @return Result of the DescribeLogGroups operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeLogGroups
     */
    DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest describeLogGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeLogGroups operation.
     *
     * @see #describeLogGroups(DescribeLogGroupsRequest)
     */
    DescribeLogGroupsResult describeLogGroups();

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
     * @return Result of the DescribeLogStreams operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeLogStreams
     */
    DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest);

    /**
     * <p>
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name,
     * prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @return Result of the DescribeMetricFilters operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeMetricFilters
     */
    DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest);

    /**
     * <p>
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
     * the results by prefix. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return Result of the DescribeSubscriptionFilters operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeSubscriptionFilters
     */
    DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest);

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
     * @return Result of the FilterLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.FilterLogEvents
     */
    FilterLogEventsResult filterLogEvents(FilterLogEventsRequest filterLogEventsRequest);

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
     * @return Result of the GetLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogEvents
     */
    GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest);

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
     * @return Result of the PutDestination operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutDestination
     */
    PutDestinationResult putDestination(PutDestinationRequest putDestinationRequest);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @return Result of the PutDestinationPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutDestinationPolicy
     */
    PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest);

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
     * @return Result of the PutLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws InvalidSequenceTokenException
     *         The sequence token is not valid.
     * @throws DataAlreadyAcceptedException
     *         The event was already logged.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutLogEvents
     */
    PutLogEventsResult putLogEvents(PutLogEventsRequest putLogEventsRequest);

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
     * @return Result of the PutMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutMetricFilter
     */
    PutMetricFilterResult putMetricFilter(PutMetricFilterRequest putMetricFilterRequest);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days you
     * want to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return Result of the PutRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutRetentionPolicy
     */
    PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest);

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
     * @return Result of the PutSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutSubscriptionFilter
     */
    PutSubscriptionFilterResult putSubscriptionFilter(PutSubscriptionFilterRequest putSubscriptionFilterRequest);

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
     * validate the correctness of a metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @return Result of the TestMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.TestMetricFilter
     */
    TestMetricFilterResult testMetricFilter(TestMetricFilterRequest testMetricFilterRequest);

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

}
