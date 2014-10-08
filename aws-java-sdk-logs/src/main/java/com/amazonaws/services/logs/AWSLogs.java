/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.logs.model.*;

/**
 * Interface for accessing AWSLogs.
 * Amazon CloudWatch Logs Service API Reference <p>
 * This is the <i>Amazon CloudWatch Logs API Reference</i> . Amazon
 * CloudWatch Logs is a managed service for real time monitoring and
 * archival of application logs. This guide provides detailed information
 * about Amazon CloudWatch Logs actions, data types, parameters, and
 * errors. For detailed information about Amazon CloudWatch Logs features
 * and their associated API calls, go to the
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/DeveloperGuide"> Amazon CloudWatch Logs Developer Guide </a>
 * .
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon CloudWatch
 * Logs API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Operations.html"> Actions </a>
 * : An alphabetical list of all Amazon CloudWatch Logs actions.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Types.html"> Data Types </a>
 * : An alphabetical list of all Amazon CloudWatch Logs data types.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonParameters.html"> Common Parameters </a>
 * : Parameters that all Query actions can use.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonErrors.html"> Common Errors </a>
 * : Client and server errors that all actions can return.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a>
 * : Itemized regions and endpoints for all AWS products.</li>
 * 
 * </ul>
 * <p>
 * In addition to using the Amazon CloudWatch Logs API, you can also use
 * the following SDKs and third-party libraries to access Amazon
 * CloudWatch Logs programmatically.
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforjava/"> AWS SDK for Java Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkfornet/"> AWS SDK for .NET Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforphp/"> AWS SDK for PHP Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforruby/"> AWS SDK for Ruby Documentation </a>
 * </li>
 * 
 * </ul>
 * <p>
 * Developers in the AWS developer community also provide their own
 * libraries, which you can find at the following AWS developer centers:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://aws.amazon.com/java/"> AWS Java Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/php/"> AWS PHP Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/python/"> AWS Python Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/ruby/"> AWS Ruby Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/net/"> AWS Windows and .NET Developer Center </a>
 * </li>
 * 
 * </ul>
 */
public interface AWSLogs {

    /**
     * Overrides the default endpoint for this client ("https://logs.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "logs.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://logs.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "logs.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://logs.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSLogs#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy
     * allows you to configure the number of days you want to retain log
     * events in the specified log group.
     * </p>
     *
     * @param putRetentionPolicyRequest Container for the necessary
     *           parameters to execute the PutRetentionPolicy service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all the metrics filters associated with the specified log
     * group. The list returned in the response is ASCII-sorted by filter
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there
     * are more metric filters to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of metric filters returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeMetricFiltersRequest Container for the necessary
     *           parameters to execute the DescribeMetricFilters service method on
     *           AWSLogs.
     * 
     * @return The response from the DescribeMetricFilters service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all the log streams that are associated with the specified
     * log group. The list returned in the response is ASCII-sorted by log
     * stream name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are
     * more log streams to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log streams returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogStreamsRequest Container for the necessary
     *           parameters to execute the DescribeLogStreams service method on
     *           AWSLogs.
     * 
     * @return The response from the DescribeLogStreams service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes
     * all the archived log events associated with it.
     * </p>
     *
     * @param deleteLogGroupRequest Container for the necessary parameters to
     *           execute the DeleteLogGroup service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log
     * group must be unique within a region for an AWS account. You can
     * create up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * <ul>
     * <li>Log group names can be between 1 and 512 characters long.</li>
     * <li>Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogGroupRequest Container for the necessary parameters to
     *           execute the CreateLogGroup service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLogGroup(CreateLogGroupRequest createLogGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the
     * specified log group. Metric filters allow you to configure rules to
     * extract metric data from log events ingested through
     * <code>PutLogEvents</code> requests.
     * </p>
     *
     * @param putMetricFilterRequest Container for the necessary parameters
     *           to execute the PutMetricFilter service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putMetricFilter(PutMetricFilterRequest putMetricFilterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     *
     * @param deleteMetricFilterRequest Container for the necessary
     *           parameters to execute the DeleteMetricFilter service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log
     * event messages. You can use this operation to validate the correctness
     * of a metric filter pattern.
     * </p>
     *
     * @param testMetricFilterRequest Container for the necessary parameters
     *           to execute the TestMetricFilter service method on AWSLogs.
     * 
     * @return The response from the TestMetricFilter service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TestMetricFilterResult testMetricFilter(TestMetricFilterRequest testMetricFilterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the
     * <code>sequenceToken</code> obtained from the response of the previous
     * request. An upload in a newly created log stream does not require a
     * <code>sequenceToken</code> .
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * <ul>
     * <li>The maximum batch size is 32,768 bytes, and this size is
     * calculated as the sum of all event messages in UTF-8, plus 26 bytes
     * for each log event.</li>
     * <li>None of the log events in the batch can be more than 2 hours in
     * the future.</li>
     * <li>None of the log events in the batch can be older than 14 days or
     * the retention period of the log group.</li>
     * <li>The log events in the batch must be in chronological ordered by
     * their <code>timestamp</code> .</li>
     * <li>The maximum number of log events in a batch is 1,000.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putLogEventsRequest Container for the necessary parameters to
     *           execute the PutLogEvents service method on AWSLogs.
     * 
     * @return The response from the PutLogEvents service method, as returned
     *         by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws InvalidSequenceTokenException
     * @throws DataAlreadyAcceptedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutLogEventsResult putLogEvents(PutLogEventsRequest putLogEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events
     * would not expire if they belong to log groups without a retention
     * policy.
     * </p>
     *
     * @param deleteRetentionPolicyRequest Container for the necessary
     *           parameters to execute the DeleteRetentionPolicy service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide
     * an optional time range to filter the results on the event
     * <code>timestamp</code> .
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a
     * response size of 1MB, up to 10,000 log events. The response will
     * always include a <code>nextForwardToken</code> and a
     * <code>nextBackwardToken</code> in the response body. You can use any
     * of these tokens in subsequent <code>GetLogEvents</code> requests to
     * paginate through events in either forward or backward direction. You
     * can also limit the number of log events returned in the response by
     * specifying the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param getLogEventsRequest Container for the necessary parameters to
     *           execute the GetLogEvents service method on AWSLogs.
     * 
     * @return The response from the GetLogEvents service method, as returned
     *         by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the
     * log stream must be unique within the log group. There is no limit on
     * the number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * <ul>
     * <li>Log stream names can be between 1 and 512 characters long.</li>
     * <li>The ':' colon character is not allowed.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogStreamRequest Container for the necessary parameters
     *           to execute the CreateLogStream service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLogStream(CreateLogStreamRequest createLogStreamRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log
     * events associated with it.
     * </p>
     *
     * @param deleteLogStreamRequest Container for the necessary parameters
     *           to execute the DeleteLogStream service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are
     * more log groups to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log groups returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogGroupsRequest Container for the necessary parameters
     *           to execute the DescribeLogGroups service method on AWSLogs.
     * 
     * @return The response from the DescribeLogGroups service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest describeLogGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are
     * more log groups to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log groups returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     * 
     * @return The response from the DescribeLogGroups service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLogGroupsResult describeLogGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        