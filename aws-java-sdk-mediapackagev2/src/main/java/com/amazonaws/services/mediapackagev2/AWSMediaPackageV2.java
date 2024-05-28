/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediapackagev2.model.*;

/**
 * Interface for accessing mediapackagev2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediapackagev2.AbstractAWSMediaPackageV2} instead.
 * </p>
 * <p>
 * <note>
 * <p>
 * This guide is intended for creating AWS Elemental MediaPackage resources in MediaPackage Version 2 (v2) starting from
 * May 2023. To get started with MediaPackage v2, create your MediaPackage resources. There isn't an automated process
 * to migrate your resources from MediaPackage v1 to MediaPackage v2.
 * </p>
 * <p>
 * The names of the entities that you use to access this API, like URLs and ARNs, all have the versioning information
 * added, like "v2", to distinguish from the prior version. If you used MediaPackage prior to this release, you can't
 * use the MediaPackage v2 CLI or the MediaPackage v2 API to access any MediaPackage v1 resources.
 * </p>
 * <p>
 * If you created resources in MediaPackage v1, use video on demand (VOD) workflows, and aren't looking to migrate to
 * MediaPackage v2 yet, see the <a
 * href="https://docs.aws.amazon.com/mediapackage/latest/apireference/what-is.html">MediaPackage v1 Live API
 * Reference</a>.
 * </p>
 * </note>
 * <p>
 * This is the AWS Elemental MediaPackage v2 Live REST API Reference. It describes all the MediaPackage API operations
 * for live content in detail, and provides sample requests, responses, and errors for the supported web services
 * protocols.
 * </p>
 * <p>
 * We assume that you have the IAM permissions that you need to use MediaPackage via the REST API. We also assume that
 * you are familiar with the features and operations of MediaPackage, as described in the AWS Elemental MediaPackage
 * User Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaPackageV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mediapackagev2";

    /**
     * <p>
     * Create a channel to start receiving content streams. The channel represents the input to MediaPackage for
     * incoming live content from an encoder such as AWS Elemental MediaLive. The channel receives content, and after
     * packaging it, outputs it through an origin endpoint to downstream devices (such as video players or CDNs) that
     * request the content. You can create only one channel with each request. We recommend that you spread out channels
     * between channel groups, such as putting redundant channels in the same AWS Region in different channel groups.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Create a channel group to group your channels and origin endpoints. A channel group is the top-level resource
     * that consists of channels and origin endpoints that are associated with it and that provides predictable URLs for
     * stream delivery. All channels and origin endpoints within the channel group are guaranteed to share the DNS. You
     * can create only one channel group with each request.
     * </p>
     * 
     * @param createChannelGroupRequest
     * @return Result of the CreateChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.CreateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChannelGroupResult createChannelGroup(CreateChannelGroupRequest createChannelGroupRequest);

    /**
     * <p>
     * The endpoint is attached to a channel, and represents the output of the live content. You can associate multiple
     * endpoints to a single channel. Each endpoint gives players and downstream CDNs (such as Amazon CloudFront) access
     * to the content for playback. Content can't be served from a channel until it has an endpoint. You can create only
     * one endpoint with each request.
     * </p>
     * 
     * @param createOriginEndpointRequest
     * @return Result of the CreateOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    CreateOriginEndpointResult createOriginEndpoint(CreateOriginEndpointRequest createOriginEndpointRequest);

    /**
     * <p>
     * Delete a channel to stop AWS Elemental MediaPackage from receiving further content. You must delete the channel's
     * origin endpoints before you can delete the channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Delete a channel group. You must delete the channel group's channels and origin endpoints before you can delete
     * the channel group. If you delete a channel group, you'll lose access to the egress domain and will have to create
     * a new channel group to replace it.
     * </p>
     * 
     * @param deleteChannelGroupRequest
     * @return Result of the DeleteChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelGroupResult deleteChannelGroup(DeleteChannelGroupRequest deleteChannelGroupRequest);

    /**
     * <p>
     * Delete a channel policy.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @return Result of the DeleteChannelPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelPolicyResult deleteChannelPolicy(DeleteChannelPolicyRequest deleteChannelPolicyRequest);

    /**
     * <p>
     * Origin endpoints can serve content until they're deleted. Delete the endpoint if it should no longer respond to
     * playback requests. You must delete all endpoints from a channel before you can delete the channel.
     * </p>
     * 
     * @param deleteOriginEndpointRequest
     * @return Result of the DeleteOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOriginEndpointResult deleteOriginEndpoint(DeleteOriginEndpointRequest deleteOriginEndpointRequest);

    /**
     * <p>
     * Delete an origin endpoint policy.
     * </p>
     * 
     * @param deleteOriginEndpointPolicyRequest
     * @return Result of the DeleteOriginEndpointPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOriginEndpointPolicyResult deleteOriginEndpointPolicy(DeleteOriginEndpointPolicyRequest deleteOriginEndpointPolicyRequest);

    /**
     * <p>
     * Retrieves the specified channel that's configured in AWS Elemental MediaPackage, including the origin endpoints
     * that are associated with it.
     * </p>
     * 
     * @param getChannelRequest
     * @return Result of the GetChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetChannelResult getChannel(GetChannelRequest getChannelRequest);

    /**
     * <p>
     * Retrieves the specified channel group that's configured in AWS Elemental MediaPackage, including the channels and
     * origin endpoints that are associated with it.
     * </p>
     * 
     * @param getChannelGroupRequest
     * @return Result of the GetChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetChannelGroupResult getChannelGroup(GetChannelGroupRequest getChannelGroupRequest);

    /**
     * <p>
     * Retrieves the specified channel policy that's configured in AWS Elemental MediaPackage. With policies, you can
     * specify who has access to AWS resources and what actions they can perform on those resources.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @return Result of the GetChannelPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetChannelPolicyResult getChannelPolicy(GetChannelPolicyRequest getChannelPolicyRequest);

    /**
     * <p>
     * Retrieves the specified origin endpoint that's configured in AWS Elemental MediaPackage to obtain its playback
     * URL and to view the packaging settings that it's currently using.
     * </p>
     * 
     * @param getOriginEndpointRequest
     * @return Result of the GetOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetOriginEndpointResult getOriginEndpoint(GetOriginEndpointRequest getOriginEndpointRequest);

    /**
     * <p>
     * Retrieves the specified origin endpoint policy that's configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param getOriginEndpointPolicyRequest
     * @return Result of the GetOriginEndpointPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetOriginEndpointPolicyResult getOriginEndpointPolicy(GetOriginEndpointPolicyRequest getOriginEndpointPolicyRequest);

    /**
     * <p>
     * Retrieves all channel groups that are configured in AWS Elemental MediaPackage, including the channels and origin
     * endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelGroupsRequest
     * @return Result of the ListChannelGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.ListChannelGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannelGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelGroupsResult listChannelGroups(ListChannelGroupsRequest listChannelGroupsRequest);

    /**
     * <p>
     * Retrieves all channels in a specific channel group that are configured in AWS Elemental MediaPackage, including
     * the origin endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannels" target="_top">AWS
     *      API Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Retrieves all origin endpoints in a specific channel that are configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param listOriginEndpointsRequest
     * @return Result of the ListOriginEndpoints operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListOriginEndpointsResult listOriginEndpoints(ListOriginEndpointsRequest listOriginEndpointsRequest);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Attaches an IAM policy to the specified channel. With policies, you can specify who has access to AWS resources
     * and what actions they can perform on those resources. You can attach only one policy with each request.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @return Result of the PutChannelPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutChannelPolicyResult putChannelPolicy(PutChannelPolicyRequest putChannelPolicyRequest);

    /**
     * <p>
     * Attaches an IAM policy to the specified origin endpoint. You can attach only one policy with each request.
     * </p>
     * 
     * @param putOriginEndpointPolicyRequest
     * @return Result of the PutOriginEndpointPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.PutOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutOriginEndpointPolicyResult putOriginEndpointPolicy(PutOriginEndpointPolicyRequest putOriginEndpointPolicyRequest);

    /**
     * <p>
     * Assigns one of more tags (key-value pairs) to the specified MediaPackage resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values. You can use the
     * TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this
     * tag is appended to the list of tags associated with the resource. If you specify a tag key that is already
     * associated with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update the specified channel. You can edit if MediaPackage sends ingest or egress access logs to the CloudWatch
     * log group, if content will be encrypted, the description on a channel, and your channel's policy settings. You
     * can't edit the name of the channel or CloudFront distribution details.
     * </p>
     * <p>
     * Any edits you make that impact the video output may not be reflected for a few minutes.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Update the specified channel group. You can edit the description on a channel group for easier identification
     * later from the AWS Elemental MediaPackage console. You can't edit the name of the channel group.
     * </p>
     * <p>
     * Any edits you make that impact the video output may not be reflected for a few minutes.
     * </p>
     * 
     * @param updateChannelGroupRequest
     * @return Result of the UpdateChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.UpdateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChannelGroupResult updateChannelGroup(UpdateChannelGroupRequest updateChannelGroupRequest);

    /**
     * <p>
     * Update the specified origin endpoint. Edit the packaging preferences on an endpoint to optimize the viewing
     * experience. You can't edit the name of the endpoint.
     * </p>
     * <p>
     * Any edits you make that impact the video output may not be reflected for a few minutes.
     * </p>
     * 
     * @param updateOriginEndpointRequest
     * @return Result of the UpdateOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOriginEndpointResult updateOriginEndpoint(UpdateOriginEndpointRequest updateOriginEndpointRequest);

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
