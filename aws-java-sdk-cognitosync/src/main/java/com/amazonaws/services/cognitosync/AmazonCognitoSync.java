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
package com.amazonaws.services.cognitosync;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cognitosync.model.*;

/**
 * Interface for accessing AmazonCognitoSync.
 * Amazon Cognito Sync <p>
 * Amazon Cognito Sync provides an AWS service and client library that
 * enable cross-device syncing of application-related user data.
 * High-level client libraries are available for both iOS and Android.
 * You can use these libraries to persist data locally so that it's
 * available even if the device is offline. Developer credentials don't
 * need to be stored on the mobile device to access the service. You can
 * use Amazon Cognito to obtain a normalized user ID and credentials.
 * User data is persisted in a dataset that can store up to 1 MB of
 * key-value pairs, and you can have up to 20 datasets per user identity.
 * </p>
 * <p>
 * With Amazon Cognito Sync, the data stored for each identity is
 * accessible only to credentials assigned to that identity. In order to
 * use the Cognito Sync service, you need to make API calls using
 * credentials retrieved with
 * <a href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/Welcome.html"> Amazon Cognito Identity service </a>
 * .
 * </p>
 * <p>
 * If you want to use Cognito Sync in an Android or iOS application, you
 * will probably want to make API calls via the AWS Mobile SDK. To learn
 * more, see the
 * <a href="http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-sync.html"> Developer Guide for Android </a> and the <a href="http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-sync.html"> Developer Guide for iOS </a>
 * .
 * </p>
 */
public interface AmazonCognitoSync {

    /**
     * Overrides the default endpoint for this client ("https://cognito-sync.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cognito-sync.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://cognito-sync.us-east-1.amazonaws.com/"). If the
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
     *            The endpoint (ex: "cognito-sync.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://cognito-sync.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCognitoSync#setEndpoint(String)}, sets the
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
     * Posts updates to records and adds and deletes records for a dataset
     * and user.
     * </p>
     * <p>
     * UpdateRecords can only be called with temporary user credentials
     * provided by Cognito Identity. You cannot make this API call with
     * developer credentials.
     * </p>
     *
     * @param updateRecordsRequest Container for the necessary parameters to
     *           execute the UpdateRecords service method on AmazonCognitoSync.
     * 
     * @return The response from the UpdateRecords service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidLambdaFunctionOutputException
     * @throws NotAuthorizedException
     * @throws LambdaThrottledException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateRecordsResult updateRecords(UpdateRecordsRequest updateRecordsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the AWS Lambda function for a given event type for an identity
     * pool. This request only updates the key/value pair specified. Other
     * key/values pairs are not updated. To remove a key value pair, pass a
     * empty value for the particular key.
     * </p>
     *
     * @param setCognitoEventsRequest Container for the necessary parameters
     *           to execute the SetCognitoEvents service method on AmazonCognitoSync.
     * 
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setCognitoEvents(SetCognitoEventsRequest setCognitoEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the events and the corresponding Lambda functions associated
     * with an identity pool
     * </p>
     *
     * @param getCognitoEventsRequest Container for the necessary parameters
     *           to execute the GetCognitoEvents service method on AmazonCognitoSync.
     * 
     * @return The response from the GetCognitoEvents service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCognitoEventsResult getCognitoEvents(GetCognitoEventsRequest getCognitoEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets usage information for an identity, including number of datasets
     * and data usage.
     * </p>
     * <p>
     * DescribeIdentityUsage can be called with temporary user credentials
     * provided by Cognito Identity or with developer credentials.
     * </p>
     *
     * @param describeIdentityUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityUsage service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the DescribeIdentityUsage service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIdentityUsageResult describeIdentityUsage(DescribeIdentityUsageRequest describeIdentityUsageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified
     * by another device.
     * </p>
     *
     * @param unsubscribeFromDatasetRequest Container for the necessary
     *           parameters to execute the UnsubscribeFromDataset service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the UnsubscribeFromDataset service method,
     *         as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidConfigurationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the necessary configuration for push sync.
     * </p>
     *
     * @param setIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the SetIdentityPoolConfiguration service method
     *           on AmazonCognitoSync.
     * 
     * @return The response from the SetIdentityPoolConfiguration service
     *         method, as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the configuration settings of an identity pool.
     * </p>
     *
     * @param getIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the GetIdentityPoolConfiguration service method
     *           on AmazonCognitoSync.
     * 
     * @return The response from the GetIdentityPoolConfiguration service
     *         method, as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityPoolConfigurationResult getIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by
     * another device.
     * </p>
     *
     * @param subscribeToDatasetRequest Container for the necessary
     *           parameters to execute the SubscribeToDataset service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the SubscribeToDataset service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidConfigurationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets usage details (for example, data storage) about a particular
     * identity pool.
     * </p>
     * <p>
     * DescribeIdentityPoolUsage can only be called with developer
     * credentials. You cannot make this API call with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     *
     * @param describeIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPoolUsage service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the DescribeIdentityPoolUsage service
     *         method, as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIdentityPoolUsageResult describeIdentityPoolUsage(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists datasets for an identity. With Amazon Cognito Sync, each
     * identity has access only to its own data. Thus, the credentials used
     * to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * ListDatasets can be called with temporary user credentials provided
     * by Cognito Identity or with developer credentials. You should use the
     * Cognito Identity credentials to make this API call.
     * </p>
     *
     * @param listDatasetsRequest Container for the necessary parameters to
     *           execute the ListDatasets service method on AmazonCognitoSync.
     * 
     * @return The response from the ListDatasets service method, as returned
     *         by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of identity pools registered with Cognito.
     * </p>
     * <p>
     * ListIdentityPoolUsage can only be called with developer credentials.
     * You cannot make this API call with the temporary user credentials
     * provided by Cognito Identity.
     * </p>
     *
     * @param listIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the ListIdentityPoolUsage service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the ListIdentityPoolUsage service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync
     * count for a dataset and identity. With Amazon Cognito Sync, each
     * identity has access only to its own data. Thus, the credentials used
     * to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * ListRecords can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials. You should use Cognito
     * Identity credentials to make this API call.
     * </p>
     *
     * @param listRecordsRequest Container for the necessary parameters to
     *           execute the ListRecords service method on AmazonCognitoSync.
     * 
     * @return The response from the ListRecords service method, as returned
     *         by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListRecordsResult listRecords(ListRecordsRequest listRecordsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the status of the last BulkPublish operation for an identity
     * pool.
     * </p>
     *
     * @param getBulkPublishDetailsRequest Container for the necessary
     *           parameters to execute the GetBulkPublishDetails service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the GetBulkPublishDetails service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetBulkPublishDetailsResult getBulkPublishDetails(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a bulk publish of all existing datasets for an Identity
     * Pool to the configured stream. Customers are limited to one successful
     * bulk publish per 24 hours. Bulk publish is an asynchronous request,
     * customers can see the status of the request via the
     * GetBulkPublishDetails operation.
     * </p>
     *
     * @param bulkPublishRequest Container for the necessary parameters to
     *           execute the BulkPublish service method on AmazonCognitoSync.
     * 
     * @return The response from the BulkPublish service method, as returned
     *         by AmazonCognitoSync.
     * 
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws DuplicateRequestException
     * @throws AlreadyStreamedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BulkPublishResult bulkPublish(BulkPublishRequest bulkPublishRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets meta data about a dataset by identity and dataset name. With
     * Amazon Cognito Sync, each identity has access only to its own data.
     * Thus, the credentials used to make this API call need to have access
     * to the identity data.
     * </p>
     * <p>
     * DescribeDataset can be called with temporary user credentials
     * provided by Cognito Identity or with developer credentials. You should
     * use Cognito Identity credentials to make this API call.
     * </p>
     *
     * @param describeDatasetRequest Container for the necessary parameters
     *           to execute the DescribeDataset service method on AmazonCognitoSync.
     * 
     * @return The response from the DescribeDataset service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specific dataset. The dataset will be deleted
     * permanently, and the action can't be undone. Datasets that this
     * dataset was merged with will no longer report the merge. Any
     * subsequent operation on this dataset will result in a
     * ResourceNotFoundException.
     * </p>
     * <p>
     * DeleteDataset can be called with temporary user credentials provided
     * by Cognito Identity or with developer credentials.
     * </p>
     *
     * @param deleteDatasetRequest Container for the necessary parameters to
     *           execute the DeleteDataset service method on AmazonCognitoSync.
     * 
     * @return The response from the DeleteDataset service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     *
     * @param registerDeviceRequest Container for the necessary parameters to
     *           execute the RegisterDevice service method on AmazonCognitoSync.
     * 
     * @return The response from the RegisterDevice service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidConfigurationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterDeviceResult registerDevice(RegisterDeviceRequest registerDeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

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
        