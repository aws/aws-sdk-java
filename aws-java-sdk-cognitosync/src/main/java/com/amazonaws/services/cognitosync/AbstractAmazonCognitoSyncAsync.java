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
 * Abstract implementation of {@code AmazonCognitoSyncAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCognitoSyncAsync extends AbstractAmazonCognitoSync implements AmazonCognitoSyncAsync {

    protected AbstractAmazonCognitoSyncAsync() {
    }

    @Override
    public java.util.concurrent.Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest request) {

        return bulkPublishAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest request,
            com.amazonaws.handlers.AsyncHandler<BulkPublishRequest, BulkPublishResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request) {

        return describeDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest request) {

        return describeIdentityPoolUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityPoolUsageRequest, DescribeIdentityPoolUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest request) {

        return describeIdentityUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityUsageRequest, DescribeIdentityUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest request) {

        return getBulkPublishDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBulkPublishDetailsRequest, GetBulkPublishDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest request) {

        return getCognitoEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCognitoEventsRequest, GetCognitoEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(GetIdentityPoolConfigurationRequest request) {

        return getIdentityPoolConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(GetIdentityPoolConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoolConfigurationRequest, GetIdentityPoolConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest request) {

        return listIdentityPoolUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoolUsageRequest, ListIdentityPoolUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest request) {

        return listRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecordsRequest, ListRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest request) {

        return registerDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterDeviceRequest, RegisterDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetCognitoEventsResult> setCognitoEventsAsync(SetCognitoEventsRequest request) {

        return setCognitoEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetCognitoEventsResult> setCognitoEventsAsync(SetCognitoEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<SetCognitoEventsRequest, SetCognitoEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(SetIdentityPoolConfigurationRequest request) {

        return setIdentityPoolConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(SetIdentityPoolConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<SetIdentityPoolConfigurationRequest, SetIdentityPoolConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest request) {

        return subscribeToDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<SubscribeToDatasetRequest, SubscribeToDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest request) {

        return unsubscribeFromDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeFromDatasetRequest, UnsubscribeFromDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest request) {

        return updateRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRecordsRequest, UpdateRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
