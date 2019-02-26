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

import com.amazonaws.services.cognitosync.model.*;

/**
 * Interface for accessing Amazon Cognito Sync asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cognitosync.AbstractAmazonCognitoSyncAsync} instead.
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
public interface AmazonCognitoSyncAsync extends AmazonCognitoSync {

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
     * @return A Java Future containing the result of the BulkPublish operation returned by the service.
     * @sample AmazonCognitoSyncAsync.BulkPublish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/BulkPublish" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest bulkPublishRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BulkPublish operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.BulkPublish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/BulkPublish" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest bulkPublishRequest,
            com.amazonaws.handlers.AsyncHandler<BulkPublishRequest, BulkPublishResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeIdentityPoolUsage operation returned by the service.
     * @sample AmazonCognitoSyncAsync.DescribeIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(
            DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityPoolUsage operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.DescribeIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(
            DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityPoolUsageRequest, DescribeIdentityPoolUsageResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeIdentityUsage operation returned by the service.
     * @sample AmazonCognitoSyncAsync.DescribeIdentityUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest describeIdentityUsageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityUsage operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.DescribeIdentityUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest describeIdentityUsageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityUsageRequest, DescribeIdentityUsageResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBulkPublishDetails operation returned by the service.
     * @sample AmazonCognitoSyncAsync.GetBulkPublishDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetBulkPublishDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBulkPublishDetails operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.GetBulkPublishDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetBulkPublishDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBulkPublishDetailsRequest, GetBulkPublishDetailsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCognitoEvents operation returned by the service.
     * @sample AmazonCognitoSyncAsync.GetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest getCognitoEventsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCognitoEvents operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.GetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest getCognitoEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCognitoEventsRequest, GetCognitoEventsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetIdentityPoolConfiguration operation returned by the
     *         service.
     * @sample AmazonCognitoSyncAsync.GetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(
            GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityPoolConfiguration operation returned by the
     *         service.
     * @sample AmazonCognitoSyncAsyncHandler.GetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(
            GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoolConfigurationRequest, GetIdentityPoolConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonCognitoSyncAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListIdentityPoolUsage operation returned by the service.
     * @sample AmazonCognitoSyncAsync.ListIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityPoolUsage operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.ListIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoolUsageRequest, ListIdentityPoolUsageResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListRecords operation returned by the service.
     * @sample AmazonCognitoSyncAsync.ListRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListRecords" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest listRecordsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecords operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.ListRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListRecords" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest listRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecordsRequest, ListRecordsResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterDevice operation returned by the service.
     * @sample AmazonCognitoSyncAsync.RegisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/RegisterDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest registerDeviceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDevice operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.RegisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/RegisterDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest registerDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDeviceRequest, RegisterDeviceResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetCognitoEvents operation returned by the service.
     * @sample AmazonCognitoSyncAsync.SetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetCognitoEventsResult> setCognitoEventsAsync(SetCognitoEventsRequest setCognitoEventsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetCognitoEvents operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.SetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetCognitoEventsResult> setCognitoEventsAsync(SetCognitoEventsRequest setCognitoEventsRequest,
            com.amazonaws.handlers.AsyncHandler<SetCognitoEventsRequest, SetCognitoEventsResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetIdentityPoolConfiguration operation returned by the
     *         service.
     * @sample AmazonCognitoSyncAsync.SetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(
            SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityPoolConfiguration operation returned by the
     *         service.
     * @sample AmazonCognitoSyncAsyncHandler.SetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(
            SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityPoolConfigurationRequest, SetIdentityPoolConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the SubscribeToDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsync.SubscribeToDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SubscribeToDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest subscribeToDatasetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubscribeToDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.SubscribeToDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SubscribeToDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest subscribeToDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<SubscribeToDatasetRequest, SubscribeToDatasetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UnsubscribeFromDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsync.UnsubscribeFromDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UnsubscribeFromDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnsubscribeFromDataset operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.UnsubscribeFromDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UnsubscribeFromDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeFromDatasetRequest, UnsubscribeFromDatasetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRecords operation returned by the service.
     * @sample AmazonCognitoSyncAsync.UpdateRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UpdateRecords" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest updateRecordsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecords operation returned by the service.
     * @sample AmazonCognitoSyncAsyncHandler.UpdateRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UpdateRecords" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest updateRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecordsRequest, UpdateRecordsResult> asyncHandler);

}
