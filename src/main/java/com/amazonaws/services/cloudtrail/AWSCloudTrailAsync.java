/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Cloud Trail <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records AWS API calls for your AWS account and delivers log files to an Amazon S3 bucket. The recorded information
 * includes the identity of the user, the start time of the AWS API call, the source IP address, the request parameters, and the response elements
 * returned by the service.
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various programming
 * languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWSCloudTrail. For
 * example, the SDKs take care of cryptographically signing requests, managing errors, and retrying requests automatically. For information about the AWS
 * SDKs, including how to download and install them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * See the CloudTrail User Guide for information about the data that is included with each AWS API call listed in the log files.
 * </p>
 */
public interface AWSCloudTrailAsync extends AWSCloudTrail {
    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information such as delivery errors, Amazon SNS
     * and Amazon S3 errors, and times that logging started and stopped for
     * each trail.
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
     * trail. Fields include information such as delivery errors, Amazon SNS
     * and Amazon S3 errors, and times that logging started and stopped for
     * each trail.
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
     * Deletes a trail.
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
     * Deletes a trail.
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
     * From the command line, use create-subscription.
     * </p>
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket. The request includes a Trail structure that
     * specifies the following:
     * </p>
     * 
     * <ul>
     * <li>Trail name.</li>
     * <li>The name of an existing Amazon S3 bucket to which CloudTrail
     * delivers your log files.</li>
     * <li>The name of the Amazon S3 key prefix that precedes each log
     * file.</li>
     * <li>The name of an existing Amazon SNS topic that notifies you that a
     * new file is available in your bucket.</li>
     * <li>Whether the log file should include AWS API calls from global
     * services. Currently, the only global AWS API calls included in
     * CloudTrail log files are from IAM and AWS STS.</li>
     * 
     * </ul>
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
     * From the command line, use create-subscription.
     * </p>
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket. The request includes a Trail structure that
     * specifies the following:
     * </p>
     * 
     * <ul>
     * <li>Trail name.</li>
     * <li>The name of an existing Amazon S3 bucket to which CloudTrail
     * delivers your log files.</li>
     * <li>The name of the Amazon S3 key prefix that precedes each log
     * file.</li>
     * <li>The name of an existing Amazon SNS topic that notifies you that a
     * new file is available in your bucket.</li>
     * <li>Whether the log file should include AWS API calls from global
     * services. Currently, the only global AWS API calls included in
     * CloudTrail log files are from IAM and AWS STS.</li>
     * 
     * </ul>
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
     * From the command line, use update-subscription.
     * </p>
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. You use this
     * action to designate an existing bucket for log delivery. If the
     * existing bucket has previously been a target for CloudTrail log files,
     * an IAM policy exists for the bucket. Use a Trail data type to pass
     * updated bucket or topic names.
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
     * From the command line, use update-subscription.
     * </p>
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. You use this
     * action to designate an existing bucket for log delivery. If the
     * existing bucket has previously been a target for CloudTrail log files,
     * an IAM policy exists for the bucket. Use a Trail data type to pass
     * updated bucket or topic names.
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
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
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
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
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
        