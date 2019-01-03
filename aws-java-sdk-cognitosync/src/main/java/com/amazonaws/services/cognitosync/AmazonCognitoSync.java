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
package com.amazonaws.services.cognitosync;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cognitosync.model.*;

/**
 * Interface for accessing Amazon Cognito Sync.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cognitosync.AbstractAmazonCognitoSync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Cognito Sync</fullname>
 * <p>
 * Amazon Cognito Sync provides an AWS service and client library that enable cross-device syncing of
 * application-related user data. High-level client libraries are available for both iOS and Android. You can use these
 * libraries to persist data locally so that it's available even if the device is offline. Developer credentials don't
 * need to be stored on the mobile device to access the service. You can use Amazon Cognito to obtain a normalized user
 * ID and credentials. User data is persisted in a dataset that can store up to 1 MB of key-value pairs, and you can
 * have up to 20 datasets per user identity.
 * </p>
 * <p>
 * With Amazon Cognito Sync, the data stored for each identity is accessible only to credentials assigned to that
 * identity. In order to use the Cognito Sync service, you need to make API calls using credentials retrieved with <a
 * href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/Welcome.html">Amazon Cognito Identity
 * service</a>.
 * </p>
 * <p>
 * If you want to use Cognito Sync in an Android or iOS application, you will probably want to make API calls via the
 * AWS Mobile SDK. To learn more, see the <a
 * href="http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-sync.html">Developer Guide for
 * Android</a> and the <a href="http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-sync.html">Developer
 * Guide for iOS</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCognitoSync {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cognito-sync";

    /**
     * Overrides the default endpoint for this client ("https://cognito-sync.us-east-1.amazonaws.com/"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cognito-sync.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "https://cognito-sync.us-east-1.amazonaws.com/"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "cognito-sync.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://cognito-sync.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCognitoSync#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are
     * limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see
     * the status of the request via the GetBulkPublishDetails operation.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param bulkPublishRequest
     *        The input for the BulkPublish operation.
     * @return Result of the BulkPublish operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws DuplicateRequestException
     *         An exception thrown when there is an IN_PROGRESS bulk publish operation for the given identity pool.
     * @throws AlreadyStreamedException
     *         An exception thrown when a bulk publish operation is requested less than 24 hours after a previous bulk
     *         publish operation completed successfully.
     * @sample AmazonCognitoSync.BulkPublish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/BulkPublish" target="_top">AWS API
     *      Documentation</a>
     */
    BulkPublishResult bulkPublish(BulkPublishRequest bulkPublishRequest);

    /**
     * <p>
     * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets
     * that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will
     * result in a ResourceNotFoundException.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        A request to delete the specific dataset.
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws ResourceConflictException
     *         Thrown if an update can't be applied because the resource was changed by another call and this would
     *         result in a conflict.
     * @sample AmazonCognitoSync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access
     * only to its own data. Thus, the credentials used to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials. You should use Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param describeDatasetRequest
     *        A request for meta data about a dataset (creation date, number of records, size) by owner and dataset
     *        name.
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Gets usage details (for example, data storage) about a particular identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param describeIdentityPoolUsageRequest
     *        A request for usage information about the identity pool.
     * @return Result of the DescribeIdentityPoolUsage operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.DescribeIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityPoolUsageResult describeIdentityPoolUsage(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest);

    /**
     * <p>
     * Gets usage information for an identity, including number of datasets and data usage.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials.
     * </p>
     * 
     * @param describeIdentityUsageRequest
     *        A request for information about the usage of an identity pool.
     * @return Result of the DescribeIdentityUsage operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.DescribeIdentityUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityUsage"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityUsageResult describeIdentityUsage(DescribeIdentityUsageRequest describeIdentityUsageRequest);

    /**
     * <p>
     * Get the status of the last BulkPublish operation for an identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param getBulkPublishDetailsRequest
     *        The input for the GetBulkPublishDetails operation.
     * @return Result of the GetBulkPublishDetails operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @sample AmazonCognitoSync.GetBulkPublishDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetBulkPublishDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetBulkPublishDetailsResult getBulkPublishDetails(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest);

    /**
     * <p>
     * Gets the events and the corresponding Lambda functions associated with an identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param getCognitoEventsRequest
     *        A request for a list of the configured Cognito Events
     * @return Result of the GetCognitoEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.GetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    GetCognitoEventsResult getCognitoEvents(GetCognitoEventsRequest getCognitoEventsRequest);

    /**
     * <p>
     * Gets the configuration settings of an identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param getIdentityPoolConfigurationRequest
     *        The input for the GetIdentityPoolConfiguration operation.
     * @return Result of the GetIdentityPoolConfiguration operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.GetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityPoolConfigurationResult getIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest);

    /**
     * <p>
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus,
     * the credentials used to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials. You should use the Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for a list of datasets for an identity.
     * @return Result of the ListDatasets operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Gets a list of identity pools registered with Cognito.
     * </p>
     * <p>
     * ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the
     * temporary user credentials provided by Cognito Identity.
     * </p>
     * 
     * @param listIdentityPoolUsageRequest
     *        A request for usage information on an identity pool.
     * @return Result of the ListIdentityPoolUsage operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.ListIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest);

    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon
     * Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call
     * need to have access to the identity data.
     * </p>
     * <p>
     * ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials. You should use Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param listRecordsRequest
     *        A request for a list of records.
     * @return Result of the ListRecords operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @sample AmazonCognitoSync.ListRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListRecords" target="_top">AWS API
     *      Documentation</a>
     */
    ListRecordsResult listRecords(ListRecordsRequest listRecordsRequest);

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
     * with developer credentials.
     * </p>
     * 
     * @param registerDeviceRequest
     *        A request to RegisterDevice.
     * @return Result of the RegisterDevice operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.RegisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/RegisterDevice" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterDeviceResult registerDevice(RegisterDeviceRequest registerDeviceRequest);

    /**
     * <p>
     * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value
     * pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the
     * particular key.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param setCognitoEventsRequest
     *        A request to configure Cognito Events"
     * @return Result of the SetCognitoEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.SetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    SetCognitoEventsResult setCognitoEvents(SetCognitoEventsRequest setCognitoEventsRequest);

    /**
     * <p>
     * Sets the necessary configuration for push sync.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param setIdentityPoolConfigurationRequest
     *        The input for the SetIdentityPoolConfiguration operation.
     * @return Result of the SetIdentityPoolConfiguration operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @sample AmazonCognitoSync.SetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest);

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by another device.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
     * with developer credentials.
     * </p>
     * 
     * @param subscribeToDatasetRequest
     *        A request to SubscribeToDatasetRequest.
     * @return Result of the SubscribeToDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.SubscribeToDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SubscribeToDataset"
     *      target="_top">AWS API Documentation</a>
     */
    SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest);

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified by another device.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
     * with developer credentials.
     * </p>
     * 
     * @param unsubscribeFromDatasetRequest
     *        A request to UnsubscribeFromDataset.
     * @return Result of the UnsubscribeFromDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.UnsubscribeFromDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UnsubscribeFromDataset"
     *      target="_top">AWS API Documentation</a>
     */
    UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest);

    /**
     * <p>
     * Posts updates to records and adds and deletes records for a dataset and user.
     * </p>
     * <p>
     * The sync count in the record patch is your last known sync count for that record. The server will reject an
     * UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale
     * sync count.
     * </p>
     * <p>
     * For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new
     * highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call
     * ListRecords. On a successful update of the record, the response returns the new sync count for that record. You
     * should present that sync count the next time you try to update that same record. When the record does not exist,
     * specify the sync count as 0.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials.
     * </p>
     * 
     * @param updateRecordsRequest
     *        A request to post updates to records or add and delete records for a dataset and user.
     * @return Result of the UpdateRecords operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws LimitExceededException
     *         Thrown when the limit on the number of objects or operations has been exceeded.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws ResourceConflictException
     *         Thrown if an update can't be applied because the resource was changed by another call and this would
     *         result in a conflict.
     * @throws InvalidLambdaFunctionOutputException
     *         The AWS Lambda function returned invalid output or an exception.
     * @throws LambdaThrottledException
     *         AWS Lambda throttled your account, please contact AWS Support
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @sample AmazonCognitoSync.UpdateRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UpdateRecords" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRecordsResult updateRecords(UpdateRecordsRequest updateRecordsRequest);

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
