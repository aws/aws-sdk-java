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
package com.amazonaws.services.mediatailor;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediatailor.model.*;

/**
 * Interface for accessing MediaTailor.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediatailor.AbstractAWSMediaTailor} instead.
 * </p>
 * <p>
 * <p>
 * Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for your live and VOD content. With AWS
 * Elemental MediaTailor, you can serve targeted ads to viewers while maintaining broadcast quality in over-the-top
 * (OTT) video applications. For information about using the service, including detailed information about the settings
 * covered in this guide, see the AWS Elemental MediaTailor User Guide.
 * <p>
 * Through the SDK, you manage AWS Elemental MediaTailor configurations the same as you do through the console. For
 * example, you specify ad insertion behavior and mapping information for the origin server and the ad decision server
 * (ADS).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaTailor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.mediatailor";

    /**
     * <p>
     * Deletes the playback configuration for the specified name.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @return Result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePlaybackConfigurationResult deletePlaybackConfiguration(DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest);

    /**
     * <p>
     * Returns the playback configuration for the specified name.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @return Result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetPlaybackConfigurationResult getPlaybackConfiguration(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest);

    /**
     * <p>
     * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum
     * number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If
     * MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you
     * can use to retrieve the next pageful.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @return Result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailor.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPlaybackConfigurationsResult listPlaybackConfigurations(ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified playback configuration resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds a new playback configuration to AWS Elemental MediaTailor.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @return Result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutPlaybackConfigurationResult putPlaybackConfiguration(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest);

    /**
     * <p>
     * Adds tags to the specified playback configuration resource. You can specify one or more tags to add.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
