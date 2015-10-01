/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing AWSCloudTrail asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS CloudTrail <p>
 * This is the CloudTrail API Reference. It provides descriptions of
 * actions, data types, common parameters, and common errors for
 * CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records AWS API calls for your AWS
 * account and delivers log files to an Amazon S3 bucket. The recorded
 * information includes the identity of the user, the start time of the
 * AWS API call, the source IP address, the request parameters, and the
 * response elements returned by the service.
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of
 * the AWS SDKs, which consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .NET, iOS, Android,
 * etc.). The SDKs provide a convenient way to create programmatic access
 * to AWSCloudTrail. For example, the SDKs take care of cryptographically
 * signing requests, managing errors, and retrying requests
 * automatically. For information about the AWS SDKs, including how to
 * download and install them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * See the CloudTrail User Guide for information about the data that is
 * included with each AWS API call listed in the log files.
 * </p>
 */
public interface AWSCloudTrailAsync extends AWSCloudTrail {
    /**
     * <p>
     * Lists the tags for the trail in the current region.
     * </p>
     *
     * @param listTagsRequest Container for the necessary parameters to
     *           execute the ListTags operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the ListTags
     *         service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tags for the trail in the current region.
     * </p>
     *
     * @param listTagsRequest Container for the necessary parameters to
     *           execute the ListTags operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ListTags
     *         service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information on delivery errors, Amazon SNS and
     * Amazon S3 errors, and start and stop logging times for each trail.
     * This operation returns trail status from a single region. To return
     * trail status from all regions, you must call the operation on each
     * region.
     * </p>
     *
     * @param getTrailStatusRequest Container for the necessary parameters to
     *           execute the GetTrailStatus operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrailStatus service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest getTrailStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information on delivery errors, Amazon SNS and
     * Amazon S3 errors, and start and stop logging times for each trail.
     * This operation returns trail status from a single region. To return
     * trail status from all regions, you must call the operation on each
     * region.
     * </p>
     *
     * @param getTrailStatusRequest Container for the necessary parameters to
     *           execute the GetTrailStatus operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrailStatus service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest getTrailStatusRequest,
            AsyncHandler<GetTrailStatusRequest, GetTrailStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified tags from a trail.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified tags from a trail.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in
     * which the trail was created.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest deleteTrailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in
     * which the trail was created.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest deleteTrailRequest,
            AsyncHandler<DeleteTrailRequest, DeleteTrailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Looks up API activity events captured by CloudTrail that create,
     * update, or delete resources in your account. Events for a region can
     * be looked up for the times in which you had CloudTrail turned on in
     * that region during the last seven days. Lookup supports five different
     * attributes: time range (defined by a start time and end time), user
     * name, event name, resource type, and resource name. All attributes are
     * optional. The maximum number of attributes that can be specified in
     * any one lookup request are time range and one other attribute. The
     * default number of results returned is 10, with a maximum of 50
     * possible. The response includes a token that you can use to get the
     * next page of results.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The rate of lookup requests is limited to one per
     * second per account. If this limit is exceeded, a throttling error
     * occurs.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Events that occurred during the selected time range
     * will not be available for lookup if CloudTrail logging was not enabled
     * when the events occurred.
     * </p>
     *
     * @param lookupEventsRequest Container for the necessary parameters to
     *           execute the LookupEvents operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         LookupEvents service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest lookupEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Looks up API activity events captured by CloudTrail that create,
     * update, or delete resources in your account. Events for a region can
     * be looked up for the times in which you had CloudTrail turned on in
     * that region during the last seven days. Lookup supports five different
     * attributes: time range (defined by a start time and end time), user
     * name, event name, resource type, and resource name. All attributes are
     * optional. The maximum number of attributes that can be specified in
     * any one lookup request are time range and one other attribute. The
     * default number of results returned is 10, with a maximum of 50
     * possible. The response includes a token that you can use to get the
     * next page of results.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The rate of lookup requests is limited to one per
     * second per account. If this limit is exceeded, a throttling error
     * occurs.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Events that occurred during the selected time range
     * will not be available for lookup if CloudTrail logging was not enabled
     * when the events occurred.
     * </p>
     *
     * @param lookupEventsRequest Container for the necessary parameters to
     *           execute the LookupEvents operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         LookupEvents service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest lookupEventsRequest,
            AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket.
     * </p>
     *
     * @param createTrailRequest Container for the necessary parameters to
     *           execute the CreateTrail operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrailResult> createTrailAsync(CreateTrailRequest createTrailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket.
     * </p>
     *
     * @param createTrailRequest Container for the necessary parameters to
     *           execute the CreateTrail operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrailResult> createTrailAsync(CreateTrailRequest createTrailRequest,
            AsyncHandler<CreateTrailRequest, CreateTrailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. Use this action
     * to designate an existing bucket for log delivery. If the existing
     * bucket has previously been a target for CloudTrail log files, an IAM
     * policy exists for the bucket.
     * </p>
     *
     * @param updateTrailRequest Container for the necessary parameters to
     *           execute the UpdateTrail operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest updateTrailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. Use this action
     * to designate an existing bucket for log delivery. If the existing
     * bucket has previously been a target for CloudTrail log files, an IAM
     * policy exists for the bucket.
     * </p>
     *
     * @param updateTrailRequest Container for the necessary parameters to
     *           execute the UpdateTrail operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrail service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest updateTrailRequest,
            AsyncHandler<UpdateTrailRequest, UpdateTrailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the
     * specified trail. Under most circumstances, there is no need to use
     * this action. You can update a trail without stopping it first. This
     * action is the only way to stop recording.
     * </p>
     *
     * @param stopLoggingRequest Container for the necessary parameters to
     *           execute the StopLogging operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         StopLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest stopLoggingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the
     * specified trail. Under most circumstances, there is no need to use
     * this action. You can update a trail without stopping it first. This
     * action is the only way to stop recording.
     * </p>
     *
     * @param stopLoggingRequest Container for the necessary parameters to
     *           execute the StopLogging operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest stopLoggingRequest,
            AsyncHandler<StopLoggingRequest, StopLoggingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves settings for the trail associated with the current region
     * for your account.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrails service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest describeTrailsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves settings for the trail associated with the current region
     * for your account.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrails service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest describeTrailsRequest,
            AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the
     * digest files within the specified time range. The public key is needed
     * to validate digest files that were signed with its corresponding
     * private key.
     * </p>
     * <p>
     * <b>NOTE:</b>CloudTrail uses different private/public key pairs per
     * region. Each digest file is signed with a private key unique to its
     * region. Therefore, when you validate a digest file from a particular
     * region, you must look in the same region for its corresponding public
     * key.
     * </p>
     *
     * @param listPublicKeysRequest Container for the necessary parameters to
     *           execute the ListPublicKeys operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         ListPublicKeys service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest listPublicKeysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the
     * digest files within the specified time range. The public key is needed
     * to validate digest files that were signed with its corresponding
     * private key.
     * </p>
     * <p>
     * <b>NOTE:</b>CloudTrail uses different private/public key pairs per
     * region. Each digest file is signed with a private key unique to its
     * region. Therefore, when you validate a digest file from a particular
     * region, you must look in the same region for its corresponding public
     * key.
     * </p>
     *
     * @param listPublicKeysRequest Container for the necessary parameters to
     *           execute the ListPublicKeys operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPublicKeys service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest listPublicKeysRequest,
            AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more tags to a trail, up to a limit of 10. Tags must be
     * unique per trail. Overwrites an existing tag's value when a new value
     * is specified for an existing tag key. If you specify a key without a
     * value, the tag will be created with the specified key and a value of
     * null.
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more tags to a trail, up to a limit of 10. Tags must be
     * unique per trail. Overwrites an existing tag's value when a new value
     * is specified for an existing tag key. If you specify a key without a
     * value, the tag will be created with the specified key and a value of
     * null.
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a
     * trail.
     * </p>
     *
     * @param startLoggingRequest Container for the necessary parameters to
     *           execute the StartLogging operation on AWSCloudTrail.
     * 
     * @return A Java Future object containing the response from the
     *         StartLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest startLoggingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a
     * trail.
     * </p>
     *
     * @param startLoggingRequest Container for the necessary parameters to
     *           execute the StartLogging operation on AWSCloudTrail.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartLogging service method, as returned by AWSCloudTrail.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest startLoggingRequest,
            AsyncHandler<StartLoggingRequest, StartLoggingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        