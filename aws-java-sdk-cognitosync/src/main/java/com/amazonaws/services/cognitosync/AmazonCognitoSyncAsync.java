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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cognitosync.model.*;

/**
 * Interface for accessing AmazonCognitoSync asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
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
public interface AmazonCognitoSyncAsync extends AmazonCognitoSync {
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
     *           execute the UpdateRecords operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest updateRecordsRequest) 
            throws AmazonServiceException, AmazonClientException;

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
     *           execute the UpdateRecords operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest updateRecordsRequest,
            AsyncHandler<UpdateRecordsRequest, UpdateRecordsResult> asyncHandler)
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
     *           to execute the SetCognitoEvents operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         SetCognitoEvents service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setCognitoEventsAsync(SetCognitoEventsRequest setCognitoEventsRequest) 
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
     *           to execute the SetCognitoEvents operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetCognitoEvents service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setCognitoEventsAsync(SetCognitoEventsRequest setCognitoEventsRequest,
            AsyncHandler<SetCognitoEventsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the events and the corresponding Lambda functions associated
     * with an identity pool
     * </p>
     *
     * @param getCognitoEventsRequest Container for the necessary parameters
     *           to execute the GetCognitoEvents operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         GetCognitoEvents service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest getCognitoEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the events and the corresponding Lambda functions associated
     * with an identity pool
     * </p>
     *
     * @param getCognitoEventsRequest Container for the necessary parameters
     *           to execute the GetCognitoEvents operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetCognitoEvents service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest getCognitoEventsRequest,
            AsyncHandler<GetCognitoEventsRequest, GetCognitoEventsResult> asyncHandler)
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
     *           parameters to execute the DescribeIdentityUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest describeIdentityUsageRequest) 
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
     *           parameters to execute the DescribeIdentityUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest describeIdentityUsageRequest,
            AsyncHandler<DescribeIdentityUsageRequest, DescribeIdentityUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified
     * by another device.
     * </p>
     *
     * @param unsubscribeFromDatasetRequest Container for the necessary
     *           parameters to execute the UnsubscribeFromDataset operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         UnsubscribeFromDataset service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified
     * by another device.
     * </p>
     *
     * @param unsubscribeFromDatasetRequest Container for the necessary
     *           parameters to execute the UnsubscribeFromDataset operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnsubscribeFromDataset service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest,
            AsyncHandler<UnsubscribeFromDatasetRequest, UnsubscribeFromDatasetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the necessary configuration for push sync.
     * </p>
     *
     * @param setIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the SetIdentityPoolConfiguration operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityPoolConfiguration service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the necessary configuration for push sync.
     * </p>
     *
     * @param setIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the SetIdentityPoolConfiguration operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityPoolConfiguration service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest,
            AsyncHandler<SetIdentityPoolConfigurationRequest, SetIdentityPoolConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the configuration settings of an identity pool.
     * </p>
     *
     * @param getIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the GetIdentityPoolConfiguration operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityPoolConfiguration service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the configuration settings of an identity pool.
     * </p>
     *
     * @param getIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the GetIdentityPoolConfiguration operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityPoolConfiguration service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest,
            AsyncHandler<GetIdentityPoolConfigurationRequest, GetIdentityPoolConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by
     * another device.
     * </p>
     *
     * @param subscribeToDatasetRequest Container for the necessary
     *           parameters to execute the SubscribeToDataset operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         SubscribeToDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest subscribeToDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by
     * another device.
     * </p>
     *
     * @param subscribeToDatasetRequest Container for the necessary
     *           parameters to execute the SubscribeToDataset operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SubscribeToDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest subscribeToDatasetRequest,
            AsyncHandler<SubscribeToDatasetRequest, SubscribeToDatasetResult> asyncHandler)
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
     *           parameters to execute the DescribeIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) 
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
     *           parameters to execute the DescribeIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest,
            AsyncHandler<DescribeIdentityPoolUsageRequest, DescribeIdentityPoolUsageResult> asyncHandler)
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
     *           execute the ListDatasets operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest) 
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
     *           execute the ListDatasets operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler)
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
     *           parameters to execute the ListIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) 
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
     *           parameters to execute the ListIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest,
            AsyncHandler<ListIdentityPoolUsageRequest, ListIdentityPoolUsageResult> asyncHandler)
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
     *           execute the ListRecords operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest listRecordsRequest) 
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
     *           execute the ListRecords operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest listRecordsRequest,
            AsyncHandler<ListRecordsRequest, ListRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the status of the last BulkPublish operation for an identity
     * pool.
     * </p>
     *
     * @param getBulkPublishDetailsRequest Container for the necessary
     *           parameters to execute the GetBulkPublishDetails operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         GetBulkPublishDetails service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the status of the last BulkPublish operation for an identity
     * pool.
     * </p>
     *
     * @param getBulkPublishDetailsRequest Container for the necessary
     *           parameters to execute the GetBulkPublishDetails operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetBulkPublishDetails service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest,
            AsyncHandler<GetBulkPublishDetailsRequest, GetBulkPublishDetailsResult> asyncHandler)
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
     *           execute the BulkPublish operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         BulkPublish service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest bulkPublishRequest) 
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
     *           execute the BulkPublish operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BulkPublish service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest bulkPublishRequest,
            AsyncHandler<BulkPublishRequest, BulkPublishResult> asyncHandler)
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
     *           to execute the DescribeDataset operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest) 
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
     *           to execute the DescribeDataset operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler)
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
     *           execute the DeleteDataset operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest) 
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
     *           execute the DeleteDataset operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     *
     * @param registerDeviceRequest Container for the necessary parameters to
     *           execute the RegisterDevice operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDevice service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest registerDeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     *
     * @param registerDeviceRequest Container for the necessary parameters to
     *           execute the RegisterDevice operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDevice service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest registerDeviceRequest,
            AsyncHandler<RegisterDeviceRequest, RegisterDeviceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        