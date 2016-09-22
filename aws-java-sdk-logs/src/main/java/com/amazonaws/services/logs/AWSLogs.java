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
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from Amazon Elastic Compute Cloud
 * (Amazon EC2) instances, Amazon CloudTrail, or other sources. You can then retrieve the associated log data from
 * CloudWatch Logs using the Amazon CloudWatch console, the CloudWatch Logs commands in the AWS CLI, the CloudWatch Logs
 * API, or the CloudWatch Logs SDK.
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
     * Cancels an export task if it is in <code>PENDING</code> or <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return Result of the CancelExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws InvalidOperationException
     *         Returned if the operation is not valid on the specified resource
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.CancelExportTask
     */
    CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Creates an <code>ExportTask</code> which allows you to efficiently export data from a Log Group to your Amazon S3
     * bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is provided, this API will initiate an export task
     * and respond with the task Id. Once started, <code>DescribeExportTasks</code> can be used to get the status of an
     * export task. You can only have one active (<code>RUNNING</code> or <code>PENDING</code>) export task at a time,
     * per account.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to the same Amazon S3 bucket. To separate
     * out log data for each export task, you can specify a prefix that will be used as the Amazon S3 key prefix for all
     * exported objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @return Result of the CreateExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         Returned if the specified resource already exists.
     * @sample AWSLogs.CreateExportTask
     */
    CreateExportTaskResult createExportTask(CreateExportTaskRequest createExportTaskRequest);

    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log group must be unique within a region for an
     * AWS account. You can create up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogGroupRequest
     * @return Result of the CreateLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceAlreadyExistsException
     *         Returned if the specified resource already exists.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.CreateLogGroup
     */
    CreateLogGroupResult createLogGroup(CreateLogGroupRequest createLogGroupRequest);

    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the log stream must be unique within the log
     * group. There is no limit on the number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log stream names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ':' colon character is not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogStreamRequest
     * @return Result of the CreateLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceAlreadyExistsException
     *         Returned if the specified resource already exists.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.CreateLogStream
     */
    CreateLogStreamResult createLogStream(CreateLogStreamRequest createLogStreamRequest);

    /**
     * <p>
     * Deletes the destination with the specified name and eventually disables all the subscription filters that publish
     * to it. This will not delete the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteDestination
     */
    DeleteDestinationResult deleteDestination(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes all the archived log events associated with
     * it.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @return Result of the DeleteLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteLogGroup
     */
    DeleteLogGroupResult deleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest);

    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log events associated with it.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @return Result of the DeleteLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteLogStream
     */
    DeleteLogStreamResult deleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest);

    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @return Result of the DeleteMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteMetricFilter
     */
    DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest);

    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events would not expire if they belong to log groups
     * without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return Result of the DeleteRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteRetentionPolicy
     */
    DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest);

    /**
     * <p>
     * Deletes a subscription filter associated with the specified log group.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @return Result of the DeleteSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteSubscriptionFilter
     */
    DeleteSubscriptionFilterResult deleteSubscriptionFilter(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest);

    /**
     * <p>
     * Returns all the destinations that are associated with the AWS account making the request. The list returned in
     * the response is ASCII-sorted by destination name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 destinations. If there are more destinations to list, the response
     * would contain a <code>nextToken</code> value in the response body. You can also limit the number of destinations
     * returned in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @return Result of the DescribeDestinations operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
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
     * Returns all the export tasks that are associated with the AWS account making the request. The export tasks can be
     * filtered based on <code>TaskId</code> or <code>TaskStatus</code>.
     * </p>
     * <p>
     * By default, this operation returns up to 50 export tasks that satisfy the specified filters. If there are more
     * export tasks to list, the response would contain a <code>nextToken</code> value in the response body. You can
     * also limit the number of export tasks returned in the response by specifying the <code>limit</code> parameter in
     * the request.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeExportTasks
     */
    DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account making the request. The list returned in the
     * response is ASCII-sorted by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are more log groups to list, the response would
     * contain a <code>nextToken</code> value in the response body. You can also limit the number of log groups returned
     * in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @return Result of the DescribeLogGroups operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
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
     * Returns all the log streams that are associated with the specified log group. The list returned in the response
     * is ASCII-sorted by log stream name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are more log streams to list, the response
     * would contain a <code>nextToken</code> value in the response body. You can also limit the number of log streams
     * returned in the response by specifying the <code>limit</code> parameter in the request. This operation has a
     * limit of five transactions per second, after which transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     * @return Result of the DescribeLogStreams operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeLogStreams
     */
    DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest);

    /**
     * <p>
     * Returns all the metrics filters associated with the specified log group. The list returned in the response is
     * ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there are more metric filters to list, the
     * response would contain a <code>nextToken</code> value in the response body. You can also limit the number of
     * metric filters returned in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @return Result of the DescribeMetricFilters operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeMetricFilters
     */
    DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest);

    /**
     * <p>
     * Returns all the subscription filters associated with the specified log group. The list returned in the response
     * is ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 subscription filters. If there are more subscription filters to list,
     * the response would contain a <code>nextToken</code> value in the response body. You can also limit the number of
     * subscription filters returned in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return Result of the DescribeSubscriptionFilters operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeSubscriptionFilters
     */
    DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest);

    /**
     * <p>
     * Retrieves log events, optionally filtered by a filter pattern from the specified log group. You can provide an
     * optional time range to filter the results on the event <code>timestamp</code>. You can limit the streams searched
     * to an explicit list of <code>logStreamNames</code>.
     * </p>
     * <p>
     * By default, this operation returns as much matching log events as can fit in a response size of 1MB, up to 10,000
     * log events, or all the events found within a time-bounded scan window. If the response includes a
     * <code>nextToken</code>, then there is more data to search, and the search can be resumed with a new request
     * providing the nextToken. The response will contain a list of <code>searchedLogStreams</code> that contains
     * information about which streams were searched in the request and whether they have been searched completely or
     * require further pagination. The <code>limit</code> parameter in the request can be used to specify the maximum
     * number of events to return in a page.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @return Result of the FilterLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.FilterLogEvents
     */
    FilterLogEventsResult filterLogEvents(FilterLogEventsRequest filterLogEventsRequest);

    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide an optional time range to filter the results
     * on the event <code>timestamp</code>.
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a response size of 1MB, up to 10,000 log
     * events. The response will always include a <code>nextForwardToken</code> and a <code>nextBackwardToken</code> in
     * the response body. You can use any of these tokens in subsequent <code>GetLogEvents</code> requests to paginate
     * through events in either forward or backward direction. You can also limit the number of log events returned in
     * the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param getLogEventsRequest
     * @return Result of the GetLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.GetLogEvents
     */
    GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest);

    /**
     * <p>
     * Creates or updates a <code>Destination</code>. A destination encapsulates a physical resource (such as a Kinesis
     * stream) and allows you to subscribe to a real-time stream of log events of a different account, ingested through
     * <code>PutLogEvents</code> requests. Currently, the only supported physical resource is a Amazon Kinesis stream
     * belonging to the same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream through an access policy. By default,
     * PutDestination does not set any access policy with the destination, which means a cross-account user will not be
     * able to call <code>PutSubscriptionFilter</code> against this destination. To enable that, the destination owner
     * must call <code>PutDestinationPolicy</code> after PutDestination.
     * </p>
     * 
     * @param putDestinationRequest
     * @return Result of the PutDestination operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutDestination
     */
    PutDestinationResult putDestination(PutDestinationRequest putDestinationRequest);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing <code>Destination</code>. An access policy is an
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @return Result of the PutDestinationPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutDestinationPolicy
     */
    PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest);

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the <code>sequenceToken</code> obtained from the response of the previous
     * request. An upload in a newly created log stream does not require a <code>sequenceToken</code>. You can also get
     * the <code>sequenceToken</code> using <a>DescribeLogStreams</a>.
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
     * The log events in the batch must be in chronological ordered by their <code>timestamp</code>.
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
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws InvalidSequenceTokenException
     * @throws DataAlreadyAcceptedException
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutLogEvents
     */
    PutLogEventsResult putLogEvents(PutLogEventsRequest putLogEventsRequest);

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to
     * configure rules to extract metric data from log events ingested through <code>PutLogEvents</code> requests.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     * @return Result of the PutMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
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
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutRetentionPolicy
     */
    PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest);

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters
     * allow you to subscribe to a real-time stream of log events ingested through <code>PutLogEvents</code> requests
     * and have them delivered to a specific destination. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (used via an ARN of <code>Destination</code>) belonging to a different account, for
     * cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose stream belonging to the same account as the subscription filter, for same-account
     * delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Currently there can only be one subscription filter associated with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @return Result of the PutSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
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
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
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
