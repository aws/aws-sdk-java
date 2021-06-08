/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing MediaPackage Vod asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediapackagevod.AbstractAWSMediaPackageVodAsync} instead.
 * </p>
 * <p>
 * AWS Elemental MediaPackage VOD
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaPackageVodAsync extends AWSMediaPackageVod {

    /**
     * Changes the packaging group's properities to configure log subscription
     * 
     * @param configureLogsRequest
     *        The option to configure log subscription.
     * @return A Java Future containing the result of the ConfigureLogs operation returned by the service.
     * @sample AWSMediaPackageVodAsync.ConfigureLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ConfigureLogs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureLogsResult> configureLogsAsync(ConfigureLogsRequest configureLogsRequest);

    /**
     * Changes the packaging group's properities to configure log subscription
     * 
     * @param configureLogsRequest
     *        The option to configure log subscription.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfigureLogs operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.ConfigureLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ConfigureLogs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureLogsResult> configureLogsAsync(ConfigureLogsRequest configureLogsRequest,
            com.amazonaws.handlers.AsyncHandler<ConfigureLogsRequest, ConfigureLogsResult> asyncHandler);

    /**
     * Creates a new MediaPackage VOD Asset resource.
     * 
     * @param createAssetRequest
     *        A new MediaPackage VOD Asset configuration.
     * @return A Java Future containing the result of the CreateAsset operation returned by the service.
     * @sample AWSMediaPackageVodAsync.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreateAsset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest createAssetRequest);

    /**
     * Creates a new MediaPackage VOD Asset resource.
     * 
     * @param createAssetRequest
     *        A new MediaPackage VOD Asset configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAsset operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreateAsset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest createAssetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssetRequest, CreateAssetResult> asyncHandler);

    /**
     * Creates a new MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param createPackagingConfigurationRequest
     *        A new MediaPackage VOD PackagingConfiguration resource configuration.
     * @return A Java Future containing the result of the CreatePackagingConfiguration operation returned by the
     *         service.
     * @sample AWSMediaPackageVodAsync.CreatePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePackagingConfigurationResult> createPackagingConfigurationAsync(
            CreatePackagingConfigurationRequest createPackagingConfigurationRequest);

    /**
     * Creates a new MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param createPackagingConfigurationRequest
     *        A new MediaPackage VOD PackagingConfiguration resource configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePackagingConfiguration operation returned by the
     *         service.
     * @sample AWSMediaPackageVodAsyncHandler.CreatePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePackagingConfigurationResult> createPackagingConfigurationAsync(
            CreatePackagingConfigurationRequest createPackagingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePackagingConfigurationRequest, CreatePackagingConfigurationResult> asyncHandler);

    /**
     * Creates a new MediaPackage VOD PackagingGroup resource.
     * 
     * @param createPackagingGroupRequest
     *        A new MediaPackage VOD PackagingGroup resource configuration.
     * @return A Java Future containing the result of the CreatePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsync.CreatePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePackagingGroupResult> createPackagingGroupAsync(CreatePackagingGroupRequest createPackagingGroupRequest);

    /**
     * Creates a new MediaPackage VOD PackagingGroup resource.
     * 
     * @param createPackagingGroupRequest
     *        A new MediaPackage VOD PackagingGroup resource configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.CreatePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePackagingGroupResult> createPackagingGroupAsync(CreatePackagingGroupRequest createPackagingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePackagingGroupRequest, CreatePackagingGroupResult> asyncHandler);

    /**
     * Deletes an existing MediaPackage VOD Asset resource.
     * 
     * @param deleteAssetRequest
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AWSMediaPackageVodAsync.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeleteAsset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest);

    /**
     * Deletes an existing MediaPackage VOD Asset resource.
     * 
     * @param deleteAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeleteAsset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler);

    /**
     * Deletes a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param deletePackagingConfigurationRequest
     * @return A Java Future containing the result of the DeletePackagingConfiguration operation returned by the
     *         service.
     * @sample AWSMediaPackageVodAsync.DeletePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePackagingConfigurationResult> deletePackagingConfigurationAsync(
            DeletePackagingConfigurationRequest deletePackagingConfigurationRequest);

    /**
     * Deletes a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param deletePackagingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePackagingConfiguration operation returned by the
     *         service.
     * @sample AWSMediaPackageVodAsyncHandler.DeletePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePackagingConfigurationResult> deletePackagingConfigurationAsync(
            DeletePackagingConfigurationRequest deletePackagingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePackagingConfigurationRequest, DeletePackagingConfigurationResult> asyncHandler);

    /**
     * Deletes a MediaPackage VOD PackagingGroup resource.
     * 
     * @param deletePackagingGroupRequest
     * @return A Java Future containing the result of the DeletePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsync.DeletePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePackagingGroupResult> deletePackagingGroupAsync(DeletePackagingGroupRequest deletePackagingGroupRequest);

    /**
     * Deletes a MediaPackage VOD PackagingGroup resource.
     * 
     * @param deletePackagingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.DeletePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePackagingGroupResult> deletePackagingGroupAsync(DeletePackagingGroupRequest deletePackagingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePackagingGroupRequest, DeletePackagingGroupResult> asyncHandler);

    /**
     * Returns a description of a MediaPackage VOD Asset resource.
     * 
     * @param describeAssetRequest
     * @return A Java Future containing the result of the DescribeAsset operation returned by the service.
     * @sample AWSMediaPackageVodAsync.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribeAsset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest describeAssetRequest);

    /**
     * Returns a description of a MediaPackage VOD Asset resource.
     * 
     * @param describeAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAsset operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribeAsset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest describeAssetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetRequest, DescribeAssetResult> asyncHandler);

    /**
     * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param describePackagingConfigurationRequest
     * @return A Java Future containing the result of the DescribePackagingConfiguration operation returned by the
     *         service.
     * @sample AWSMediaPackageVodAsync.DescribePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackagingConfigurationResult> describePackagingConfigurationAsync(
            DescribePackagingConfigurationRequest describePackagingConfigurationRequest);

    /**
     * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param describePackagingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackagingConfiguration operation returned by the
     *         service.
     * @sample AWSMediaPackageVodAsyncHandler.DescribePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackagingConfigurationResult> describePackagingConfigurationAsync(
            DescribePackagingConfigurationRequest describePackagingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackagingConfigurationRequest, DescribePackagingConfigurationResult> asyncHandler);

    /**
     * Returns a description of a MediaPackage VOD PackagingGroup resource.
     * 
     * @param describePackagingGroupRequest
     * @return A Java Future containing the result of the DescribePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsync.DescribePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackagingGroupResult> describePackagingGroupAsync(DescribePackagingGroupRequest describePackagingGroupRequest);

    /**
     * Returns a description of a MediaPackage VOD PackagingGroup resource.
     * 
     * @param describePackagingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.DescribePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackagingGroupResult> describePackagingGroupAsync(DescribePackagingGroupRequest describePackagingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackagingGroupRequest, DescribePackagingGroupResult> asyncHandler);

    /**
     * Returns a collection of MediaPackage VOD Asset resources.
     * 
     * @param listAssetsRequest
     * @return A Java Future containing the result of the ListAssets operation returned by the service.
     * @sample AWSMediaPackageVodAsync.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest listAssetsRequest);

    /**
     * Returns a collection of MediaPackage VOD Asset resources.
     * 
     * @param listAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssets operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest listAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetsRequest, ListAssetsResult> asyncHandler);

    /**
     * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @param listPackagingConfigurationsRequest
     * @return A Java Future containing the result of the ListPackagingConfigurations operation returned by the service.
     * @sample AWSMediaPackageVodAsync.ListPackagingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackagingConfigurationsResult> listPackagingConfigurationsAsync(
            ListPackagingConfigurationsRequest listPackagingConfigurationsRequest);

    /**
     * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @param listPackagingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackagingConfigurations operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.ListPackagingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackagingConfigurationsResult> listPackagingConfigurationsAsync(
            ListPackagingConfigurationsRequest listPackagingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackagingConfigurationsRequest, ListPackagingConfigurationsResult> asyncHandler);

    /**
     * Returns a collection of MediaPackage VOD PackagingGroup resources.
     * 
     * @param listPackagingGroupsRequest
     * @return A Java Future containing the result of the ListPackagingGroups operation returned by the service.
     * @sample AWSMediaPackageVodAsync.ListPackagingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackagingGroupsResult> listPackagingGroupsAsync(ListPackagingGroupsRequest listPackagingGroupsRequest);

    /**
     * Returns a collection of MediaPackage VOD PackagingGroup resources.
     * 
     * @param listPackagingGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackagingGroups operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.ListPackagingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackagingGroupsResult> listPackagingGroupsAsync(ListPackagingGroupsRequest listPackagingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackagingGroupsRequest, ListPackagingGroupsResult> asyncHandler);

    /**
     * Returns a list of the tags assigned to the specified resource.
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackageVodAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Returns a list of the tags assigned to the specified resource.
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Adds tags to the specified resource. You can specify one or more tags to add.
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaPackageVodAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * Adds tags to the specified resource. You can specify one or more tags to add.
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * Removes tags from the specified resource. You can specify one or more tags to remove.
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackageVodAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * Removes tags from the specified resource. You can specify one or more tags to remove.
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Updates a specific packaging group. You can't change the id attribute or any other system-generated attributes.
     * 
     * @param updatePackagingGroupRequest
     *        A MediaPackage VOD PackagingGroup resource configuration.
     * @return A Java Future containing the result of the UpdatePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsync.UpdatePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/UpdatePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePackagingGroupResult> updatePackagingGroupAsync(UpdatePackagingGroupRequest updatePackagingGroupRequest);

    /**
     * Updates a specific packaging group. You can't change the id attribute or any other system-generated attributes.
     * 
     * @param updatePackagingGroupRequest
     *        A MediaPackage VOD PackagingGroup resource configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePackagingGroup operation returned by the service.
     * @sample AWSMediaPackageVodAsyncHandler.UpdatePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/UpdatePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePackagingGroupResult> updatePackagingGroupAsync(UpdatePackagingGroupRequest updatePackagingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePackagingGroupRequest, UpdatePackagingGroupResult> asyncHandler);

}
