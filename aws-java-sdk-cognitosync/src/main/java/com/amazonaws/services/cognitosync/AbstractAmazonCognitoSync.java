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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonCognitoSync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCognitoSync implements AmazonCognitoSync {

    protected AbstractAmazonCognitoSync() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BulkPublishResult bulkPublish(BulkPublishRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIdentityPoolUsageResult describeIdentityPoolUsage(DescribeIdentityPoolUsageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeIdentityUsageResult describeIdentityUsage(DescribeIdentityUsageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBulkPublishDetailsResult getBulkPublishDetails(GetBulkPublishDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCognitoEventsResult getCognitoEvents(GetCognitoEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIdentityPoolConfigurationResult getIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecordsResult listRecords(ListRecordsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetCognitoEventsResult setCognitoEvents(SetCognitoEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRecordsResult updateRecords(UpdateRecordsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
