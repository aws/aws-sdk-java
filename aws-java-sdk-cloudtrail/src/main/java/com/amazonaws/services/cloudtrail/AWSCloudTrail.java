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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing AWSCloudTrail.
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
     * Lists the tags for the trail in the current region.
     * </p>
     *
     * @param listTagsRequest Container for the necessary parameters to
     *           execute the ListTags service method on AWSCloudTrail.
     * 
     * @return The response from the ListTags service method, as returned by
     *         AWSCloudTrail.
     * 
     * @throws ResourceTypeNotSupportedException
     * @throws ResourceNotFoundException
     * @throws UnsupportedOperationException
     * @throws CloudTrailARNInvalidException
     * @throws InvalidTrailNameException
     * @throws InvalidTokenException
     * @throws OperationNotPermittedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTagsResult listTags(ListTagsRequest listTagsRequest) 
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
     *           execute the GetTrailStatus service method on AWSCloudTrail.
     * 
     * @return The response from the GetTrailStatus service method, as
     *         returned by AWSCloudTrail.
     * 
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
     * Removes the specified tags from a trail.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags service method on AWSCloudTrail.
     * 
     * @return The response from the RemoveTags service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws ResourceTypeNotSupportedException
     * @throws ResourceNotFoundException
     * @throws UnsupportedOperationException
     * @throws CloudTrailARNInvalidException
     * @throws InvalidTrailNameException
     * @throws InvalidTagParameterException
     * @throws OperationNotPermittedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in
     * which the trail was created.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail service method on AWSCloudTrail.
     * 
     * @return The response from the DeleteTrail service method, as returned
     *         by AWSCloudTrail.
     * 
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
     *           execute the LookupEvents service method on AWSCloudTrail.
     * 
     * @return The response from the LookupEvents service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InvalidMaxResultsException
     * @throws InvalidNextTokenException
     * @throws InvalidLookupAttributesException
     * @throws InvalidTimeRangeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public LookupEventsResult lookupEvents(LookupEventsRequest lookupEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket.
     * </p>
     *
     * @param createTrailRequest Container for the necessary parameters to
     *           execute the CreateTrail service method on AWSCloudTrail.
     * 
     * @return The response from the CreateTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InsufficientEncryptionPolicyException
     * @throws InvalidTrailNameException
     * @throws InvalidCloudWatchLogsLogGroupArnException
     * @throws TrailAlreadyExistsException
     * @throws InvalidS3BucketNameException
     * @throws KmsKeyDisabledException
     * @throws TrailNotProvidedException
     * @throws InvalidSnsTopicNameException
     * @throws S3BucketDoesNotExistException
     * @throws UnsupportedOperationException
     * @throws KmsKeyNotFoundException
     * @throws InvalidS3PrefixException
     * @throws InvalidCloudWatchLogsRoleArnException
     * @throws MaximumNumberOfTrailsExceededException
     * @throws InvalidKmsKeyIdException
     * @throws InsufficientSnsTopicPolicyException
     * @throws CloudWatchLogsDeliveryUnavailableException
     * @throws OperationNotPermittedException
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
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. Use this action
     * to designate an existing bucket for log delivery. If the existing
     * bucket has previously been a target for CloudTrail log files, an IAM
     * policy exists for the bucket.
     * </p>
     *
     * @param updateTrailRequest Container for the necessary parameters to
     *           execute the UpdateTrail service method on AWSCloudTrail.
     * 
     * @return The response from the UpdateTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InsufficientEncryptionPolicyException
     * @throws InvalidTrailNameException
     * @throws InvalidCloudWatchLogsLogGroupArnException
     * @throws InvalidS3BucketNameException
     * @throws KmsKeyDisabledException
     * @throws TrailNotProvidedException
     * @throws InvalidSnsTopicNameException
     * @throws S3BucketDoesNotExistException
     * @throws UnsupportedOperationException
     * @throws KmsKeyNotFoundException
     * @throws InvalidCloudWatchLogsRoleArnException
     * @throws InvalidS3PrefixException
     * @throws InvalidKmsKeyIdException
     * @throws InsufficientSnsTopicPolicyException
     * @throws CloudWatchLogsDeliveryUnavailableException
     * @throws OperationNotPermittedException
     * @throws TrailNotFoundException
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
    public UpdateTrailResult updateTrail(UpdateTrailRequest updateTrailRequest) 
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
     * Retrieves settings for the trail associated with the current region
     * for your account.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails service method on AWSCloudTrail.
     * 
     * @return The response from the DescribeTrails service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws UnsupportedOperationException
     * @throws OperationNotPermittedException
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
     *           execute the ListPublicKeys service method on AWSCloudTrail.
     * 
     * @return The response from the ListPublicKeys service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws UnsupportedOperationException
     * @throws InvalidTokenException
     * @throws OperationNotPermittedException
     * @throws InvalidTimeRangeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPublicKeysResult listPublicKeys(ListPublicKeysRequest listPublicKeysRequest) 
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
     *           execute the AddTags service method on AWSCloudTrail.
     * 
     * @return The response from the AddTags service method, as returned by
     *         AWSCloudTrail.
     * 
     * @throws ResourceTypeNotSupportedException
     * @throws TagsLimitExceededException
     * @throws ResourceNotFoundException
     * @throws UnsupportedOperationException
     * @throws CloudTrailARNInvalidException
     * @throws InvalidTrailNameException
     * @throws InvalidTagParameterException
     * @throws OperationNotPermittedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddTagsResult addTags(AddTagsRequest addTagsRequest) 
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
    public StartLoggingResult startLogging(StartLoggingRequest startLoggingRequest) 
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
     * @return The response from the LookupEvents service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InvalidMaxResultsException
     * @throws InvalidNextTokenException
     * @throws InvalidLookupAttributesException
     * @throws InvalidTimeRangeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public LookupEventsResult lookupEvents() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Retrieves settings for the trail associated with the current region
     * for your account.
     * </p>
     * 
     * @return The response from the DescribeTrails service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws UnsupportedOperationException
     * @throws OperationNotPermittedException
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
     * @return The response from the ListPublicKeys service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws UnsupportedOperationException
     * @throws InvalidTokenException
     * @throws OperationNotPermittedException
     * @throws InvalidTimeRangeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPublicKeysResult listPublicKeys() throws AmazonServiceException, AmazonClientException;
    
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
        