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
     *        The endpoint (ex: "logs.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://logs.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the AssociateKmsKey operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.AssociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AssociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateKmsKeyResult associateKmsKey(AssociateKmsKeyRequest associateKmsKeyRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
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
     * data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported
     * objects.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateExportTask" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogGroup" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogStream" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDestination" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogGroup" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogStream" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest);

    /**
     * <p>
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log
     * events to this account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteSubscriptionFilter" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDestinations" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogGroups" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogStreams" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeMetricFilters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest);

    /**
     * <p>
     * Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently
     * in this account. You can request all queries, or limit it to queries of a specific log group or queries with a
     * certain status.
     * </p>
     * 
     * @param describeQueriesRequest
     * @return Result of the DescribeQueries operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueries" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeQueriesResult describeQueries(DescribeQueriesRequest describeQueriesRequest);

    /**
     * <p>
     * Lists the resource policies in this account.
     * </p>
     * 
     * @param describeResourcePoliciesRequest
     * @return Result of the DescribeResourcePolicies operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeResourcePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeResourcePoliciesResult describeResourcePolicies(DescribeResourcePoliciesRequest describeResourcePoliciesRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeSubscriptionFilters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest);

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
     * @return Result of the DisassociateKmsKey operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DisassociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DisassociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateKmsKeyResult disassociateKmsKey(DisassociateKmsKeyRequest disassociateKmsKeyRequest);

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
     * @return Result of the FilterLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.FilterLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilterLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    FilterLogEventsResult filterLogEvents(FilterLogEventsRequest filterLogEventsRequest);

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
     * @return Result of the GetLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest);

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
     * @return Result of the GetLogGroupFields operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogGroupFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogGroupFields" target="_top">AWS API
     *      Documentation</a>
     */
    GetLogGroupFieldsResult getLogGroupFields(GetLogGroupFieldsRequest getLogGroupFieldsRequest);

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
     * @return Result of the GetLogRecord operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogRecord" target="_top">AWS API
     *      Documentation</a>
     */
    GetLogRecordResult getLogRecord(GetLogRecordRequest getLogRecordRequest);

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
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    GetQueryResultsResult getQueryResults(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Lists the tags for the specified log group.
     * </p>
     * 
     * @param listTagsLogGroupRequest
     * @return Result of the ListTagsLogGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.ListTagsLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListTagsLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsLogGroupResult listTagsLogGroup(ListTagsLogGroupRequest listTagsLogGroupRequest);

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
     * @return Result of the PutDestination operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestination" target="_top">AWS API
     *      Documentation</a>
     */
    PutDestinationResult putDestination(PutDestinationRequest putDestinationRequest);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestinationPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest);

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
     * @throws UnrecognizedClientException
     *         The most likely cause is an invalid AWS access key ID or secret key.
     * @sample AWSLogs.PutLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutLogEvents" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    PutMetricFilterResult putMetricFilter(PutMetricFilterRequest putMetricFilterRequest);

    /**
     * <p>
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as
     * Amazon Route 53. An account can have up to 10 resource policies per region.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for
     * which to retain log events in the specified log group.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutSubscriptionFilter" target="_top">AWS API
     *      Documentation</a>
     */
    PutSubscriptionFilterResult putSubscriptionFilter(PutSubscriptionFilterRequest putSubscriptionFilterRequest);

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
     * @return Result of the StartQuery operation returned by the service.
     * @throws MalformedQueryException
     *         The query string is not valid. Details about this error are displayed in a <code>QueryCompileError</code>
     *         object. For more information, see .</p>
     *         <p>
     *         For more information about valid query syntax, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *         Insights Query Syntax</a>.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    StartQueryResult startQuery(StartQueryRequest startQueryRequest);

    /**
     * <p>
     * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns
     * an error indicating that the specified query is not running.
     * </p>
     * 
     * @param stopQueryRequest
     * @return Result of the StopQuery operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    StopQueryResult stopQuery(StopQueryRequest stopQueryRequest);

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
     * @return Result of the TagLogGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @sample AWSLogs.TagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    TagLogGroupResult tagLogGroup(TagLogGroupRequest tagLogGroupRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TestMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    TestMetricFilterResult testMetricFilter(TestMetricFilterRequest testMetricFilterRequest);

    /**
     * <p>
     * Removes the specified tags from the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To add tags, use <a>UntagLogGroup</a>.
     * </p>
     * 
     * @param untagLogGroupRequest
     * @return Result of the UntagLogGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSLogs.UntagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UntagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UntagLogGroupResult untagLogGroup(UntagLogGroupRequest untagLogGroupRequest);

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
