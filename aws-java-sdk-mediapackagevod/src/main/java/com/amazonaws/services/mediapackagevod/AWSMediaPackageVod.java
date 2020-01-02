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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediapackagevod.model.*;

/**
 * Interface for accessing MediaPackage Vod.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediapackagevod.AbstractAWSMediaPackageVod} instead.
 * </p>
 * <p>
 * AWS Elemental MediaPackage VOD
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaPackageVod {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mediapackage-vod";

    /**
     * Creates a new MediaPackage VOD Asset resource.
     * 
     * @param createAssetRequest
     *        A new MediaPackage VOD Asset configuration.
     * @return Result of the CreateAsset operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreateAsset" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAssetResult createAsset(CreateAssetRequest createAssetRequest);

    /**
     * Creates a new MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param createPackagingConfigurationRequest
     *        A new MediaPackage VOD PackagingConfiguration resource configuration.
     * @return Result of the CreatePackagingConfiguration operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.CreatePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePackagingConfigurationResult createPackagingConfiguration(CreatePackagingConfigurationRequest createPackagingConfigurationRequest);

    /**
     * Creates a new MediaPackage VOD PackagingGroup resource.
     * 
     * @param createPackagingGroupRequest
     *        A new MediaPackage VOD PackagingGroup resource configuration.
     * @return Result of the CreatePackagingGroup operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.CreatePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/CreatePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePackagingGroupResult createPackagingGroup(CreatePackagingGroupRequest createPackagingGroupRequest);

    /**
     * Deletes an existing MediaPackage VOD Asset resource.
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeleteAsset" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAssetResult deleteAsset(DeleteAssetRequest deleteAssetRequest);

    /**
     * Deletes a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param deletePackagingConfigurationRequest
     * @return Result of the DeletePackagingConfiguration operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DeletePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePackagingConfigurationResult deletePackagingConfiguration(DeletePackagingConfigurationRequest deletePackagingConfigurationRequest);

    /**
     * Deletes a MediaPackage VOD PackagingGroup resource.
     * 
     * @param deletePackagingGroupRequest
     * @return Result of the DeletePackagingGroup operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DeletePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DeletePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePackagingGroupResult deletePackagingGroup(DeletePackagingGroupRequest deletePackagingGroupRequest);

    /**
     * Returns a description of a MediaPackage VOD Asset resource.
     * 
     * @param describeAssetRequest
     * @return Result of the DescribeAsset operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribeAsset" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAssetResult describeAsset(DescribeAssetRequest describeAssetRequest);

    /**
     * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
     * 
     * @param describePackagingConfigurationRequest
     * @return Result of the DescribePackagingConfiguration operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DescribePackagingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePackagingConfigurationResult describePackagingConfiguration(DescribePackagingConfigurationRequest describePackagingConfigurationRequest);

    /**
     * Returns a description of a MediaPackage VOD PackagingGroup resource.
     * 
     * @param describePackagingGroupRequest
     * @return Result of the DescribePackagingGroup operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.DescribePackagingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePackagingGroupResult describePackagingGroup(DescribePackagingGroupRequest describePackagingGroupRequest);

    /**
     * Returns a collection of MediaPackage VOD Asset resources.
     * 
     * @param listAssetsRequest
     * @return Result of the ListAssets operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListAssets" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssetsResult listAssets(ListAssetsRequest listAssetsRequest);

    /**
     * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
     * 
     * @param listPackagingConfigurationsRequest
     * @return Result of the ListPackagingConfigurations operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.ListPackagingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPackagingConfigurationsResult listPackagingConfigurations(ListPackagingConfigurationsRequest listPackagingConfigurationsRequest);

    /**
     * Returns a collection of MediaPackage VOD PackagingGroup resources.
     * 
     * @param listPackagingGroupsRequest
     * @return Result of the ListPackagingGroups operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackageVod.ListPackagingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/ListPackagingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListPackagingGroupsResult listPackagingGroups(ListPackagingGroupsRequest listPackagingGroupsRequest);

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
