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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing AWSCloudTrail.
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
public interface AWSCloudTrail {

    /**
     * Overrides the default endpoint for this client ("https://cloudtrail.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudtrail.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://cloudtrail.us-east-1.amazonaws.com"). If the
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
     *            The endpoint (ex: "cloudtrail.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://cloudtrail.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCloudTrail#setEndpoint(String)}, sets the
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
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information such as delivery errors, Amazon SNS
     * and Amazon S3 errors, and times that logging started and stopped for
     * each trail.
     * </p>
     *
     * @param getTrailStatusRequest Container for the necessary parameters to
     *           execute the GetTrailStatus service method on AWSCloudTrail.
     * 
     * @return The response from the GetTrailStatus service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTrailStatusResult getTrailStatus(GetTrailStatusRequest getTrailStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a trail.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail service method on AWSCloudTrail.
     * 
     * @return The response from the DeleteTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTrailResult deleteTrail(DeleteTrailRequest deleteTrailRequest) 
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
     *           execute the CreateTrail service method on AWSCloudTrail.
     * 
     * @return The response from the CreateTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws S3BucketDoesNotExistException
     * @throws InternalErrorException
     * @throws InvalidS3PrefixException
     * @throws InvalidTrailNameException
     * @throws TrailAlreadyExistsException
     * @throws MaximumNumberOfTrailsExceededException
     * @throws InvalidS3BucketNameException
     * @throws TrailNotProvidedException
     * @throws InsufficientSnsTopicPolicyException
     * @throws InvalidSnsTopicNameException
     * @throws InsufficientS3BucketPolicyException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTrailResult createTrail(CreateTrailRequest createTrailRequest) 
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
     *           execute the UpdateTrail service method on AWSCloudTrail.
     * 
     * @return The response from the UpdateTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws S3BucketDoesNotExistException
     * @throws InternalErrorException
     * @throws InvalidS3PrefixException
     * @throws InvalidTrailNameException
     * @throws InvalidS3BucketNameException
     * @throws TrailNotProvidedException
     * @throws InsufficientSnsTopicPolicyException
     * @throws InvalidSnsTopicNameException
     * @throws InsufficientS3BucketPolicyException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTrailResult updateTrail(UpdateTrailRequest updateTrailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails service method on AWSCloudTrail.
     * 
     * @return The response from the DescribeTrails service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrailsResult describeTrails(DescribeTrailsRequest describeTrailsRequest) 
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
     *           execute the StopLogging service method on AWSCloudTrail.
     * 
     * @return The response from the StopLogging service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopLoggingResult stopLogging(StopLoggingRequest stopLoggingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a
     * trail.
     * </p>
     *
     * @param startLoggingRequest Container for the necessary parameters to
     *           execute the StartLogging service method on AWSCloudTrail.
     * 
     * @return The response from the StartLogging service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws S3BucketDoesNotExistException
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws InsufficientSnsTopicPolicyException
     * @throws InsufficientS3BucketPolicyException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StartLoggingResult startLogging(StartLoggingRequest startLoggingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
     * </p>
     * 
     * @return The response from the DescribeTrails service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrailsResult describeTrails() throws AmazonServiceException, AmazonClientException;
    
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
        