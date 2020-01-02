/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagevod.model.*;

/**
 * Abstract implementation of {@code AWSMediaPackageVodAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaPackageVodAsync extends AbstractAWSMediaPackageVod implements AWSMediaPackageVodAsync {

    protected AbstractAWSMediaPackageVodAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest request) {

        return createAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssetRequest, CreateAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingConfigurationResult> createPackagingConfigurationAsync(CreatePackagingConfigurationRequest request) {

        return createPackagingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingConfigurationResult> createPackagingConfigurationAsync(CreatePackagingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePackagingConfigurationRequest, CreatePackagingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingGroupResult> createPackagingGroupAsync(CreatePackagingGroupRequest request) {

        return createPackagingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePackagingGroupResult> createPackagingGroupAsync(CreatePackagingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePackagingGroupRequest, CreatePackagingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest request) {

        return deleteAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingConfigurationResult> deletePackagingConfigurationAsync(DeletePackagingConfigurationRequest request) {

        return deletePackagingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingConfigurationResult> deletePackagingConfigurationAsync(DeletePackagingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePackagingConfigurationRequest, DeletePackagingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingGroupResult> deletePackagingGroupAsync(DeletePackagingGroupRequest request) {

        return deletePackagingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackagingGroupResult> deletePackagingGroupAsync(DeletePackagingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePackagingGroupRequest, DeletePackagingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest request) {

        return describeAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetRequest, DescribeAssetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingConfigurationResult> describePackagingConfigurationAsync(DescribePackagingConfigurationRequest request) {

        return describePackagingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingConfigurationResult> describePackagingConfigurationAsync(DescribePackagingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePackagingConfigurationRequest, DescribePackagingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingGroupResult> describePackagingGroupAsync(DescribePackagingGroupRequest request) {

        return describePackagingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackagingGroupResult> describePackagingGroupAsync(DescribePackagingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePackagingGroupRequest, DescribePackagingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest request) {

        return listAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssetsRequest, ListAssetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackagingConfigurationsResult> listPackagingConfigurationsAsync(ListPackagingConfigurationsRequest request) {

        return listPackagingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagingConfigurationsResult> listPackagingConfigurationsAsync(ListPackagingConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackagingConfigurationsRequest, ListPackagingConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPackagingGroupsResult> listPackagingGroupsAsync(ListPackagingGroupsRequest request) {

        return listPackagingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagingGroupsResult> listPackagingGroupsAsync(ListPackagingGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPackagingGroupsRequest, ListPackagingGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
