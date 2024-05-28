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

import com.amazonaws.services.mediapackagev2.model.*;

/**
 * Interface for accessing mediapackagev2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediapackagev2.AbstractAWSMediaPackageV2Async} instead.
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
public interface AWSMediaPackageV2Async extends AWSMediaPackageV2 {

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
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaPackageV2Async.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * <p>
     * Create a channel group to group your channels and origin endpoints. A channel group is the top-level resource
     * that consists of channels and origin endpoints that are associated with it and that provides predictable URLs for
     * stream delivery. All channels and origin endpoints within the channel group are guaranteed to share the DNS. You
     * can create only one channel group with each request.
     * </p>
     * 
     * @param createChannelGroupRequest
     * @return A Java Future containing the result of the CreateChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2Async.CreateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelGroupResult> createChannelGroupAsync(CreateChannelGroupRequest createChannelGroupRequest);

    /**
     * <p>
     * Create a channel group to group your channels and origin endpoints. A channel group is the top-level resource
     * that consists of channels and origin endpoints that are associated with it and that provides predictable URLs for
     * stream delivery. All channels and origin endpoints within the channel group are guaranteed to share the DNS. You
     * can create only one channel group with each request.
     * </p>
     * 
     * @param createChannelGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.CreateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelGroupResult> createChannelGroupAsync(CreateChannelGroupRequest createChannelGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelGroupRequest, CreateChannelGroupResult> asyncHandler);

    /**
     * <p>
     * The endpoint is attached to a channel, and represents the output of the live content. You can associate multiple
     * endpoints to a single channel. Each endpoint gives players and downstream CDNs (such as Amazon CloudFront) access
     * to the content for playback. Content can't be served from a channel until it has an endpoint. You can create only
     * one endpoint with each request.
     * </p>
     * 
     * @param createOriginEndpointRequest
     * @return A Java Future containing the result of the CreateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2Async.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest createOriginEndpointRequest);

    /**
     * <p>
     * The endpoint is attached to a channel, and represents the output of the live content. You can associate multiple
     * endpoints to a single channel. Each endpoint gives players and downstream CDNs (such as Amazon CloudFront) access
     * to the content for playback. Content can't be served from a channel until it has an endpoint. You can create only
     * one endpoint with each request.
     * </p>
     * 
     * @param createOriginEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest createOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOriginEndpointRequest, CreateOriginEndpointResult> asyncHandler);

    /**
     * <p>
     * Delete a channel to stop AWS Elemental MediaPackage from receiving further content. You must delete the channel's
     * origin endpoints before you can delete the channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaPackageV2Async.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Delete a channel to stop AWS Elemental MediaPackage from receiving further content. You must delete the channel's
     * origin endpoints before you can delete the channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * <p>
     * Delete a channel group. You must delete the channel group's channels and origin endpoints before you can delete
     * the channel group. If you delete a channel group, you'll lose access to the egress domain and will have to create
     * a new channel group to replace it.
     * </p>
     * 
     * @param deleteChannelGroupRequest
     * @return A Java Future containing the result of the DeleteChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2Async.DeleteChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelGroupResult> deleteChannelGroupAsync(DeleteChannelGroupRequest deleteChannelGroupRequest);

    /**
     * <p>
     * Delete a channel group. You must delete the channel group's channels and origin endpoints before you can delete
     * the channel group. If you delete a channel group, you'll lose access to the egress domain and will have to create
     * a new channel group to replace it.
     * </p>
     * 
     * @param deleteChannelGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.DeleteChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelGroupResult> deleteChannelGroupAsync(DeleteChannelGroupRequest deleteChannelGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelGroupRequest, DeleteChannelGroupResult> asyncHandler);

    /**
     * <p>
     * Delete a channel policy.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @return A Java Future containing the result of the DeleteChannelPolicy operation returned by the service.
     * @sample AWSMediaPackageV2Async.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(DeleteChannelPolicyRequest deleteChannelPolicyRequest);

    /**
     * <p>
     * Delete a channel policy.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelPolicy operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(DeleteChannelPolicyRequest deleteChannelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelPolicyRequest, DeleteChannelPolicyResult> asyncHandler);

    /**
     * <p>
     * Origin endpoints can serve content until they're deleted. Delete the endpoint if it should no longer respond to
     * playback requests. You must delete all endpoints from a channel before you can delete the channel.
     * </p>
     * 
     * @param deleteOriginEndpointRequest
     * @return A Java Future containing the result of the DeleteOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2Async.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest deleteOriginEndpointRequest);

    /**
     * <p>
     * Origin endpoints can serve content until they're deleted. Delete the endpoint if it should no longer respond to
     * playback requests. You must delete all endpoints from a channel before you can delete the channel.
     * </p>
     * 
     * @param deleteOriginEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest deleteOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOriginEndpointRequest, DeleteOriginEndpointResult> asyncHandler);

    /**
     * <p>
     * Delete an origin endpoint policy.
     * </p>
     * 
     * @param deleteOriginEndpointPolicyRequest
     * @return A Java Future containing the result of the DeleteOriginEndpointPolicy operation returned by the service.
     * @sample AWSMediaPackageV2Async.DeleteOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginEndpointPolicyResult> deleteOriginEndpointPolicyAsync(
            DeleteOriginEndpointPolicyRequest deleteOriginEndpointPolicyRequest);

    /**
     * <p>
     * Delete an origin endpoint policy.
     * </p>
     * 
     * @param deleteOriginEndpointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOriginEndpointPolicy operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.DeleteOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginEndpointPolicyResult> deleteOriginEndpointPolicyAsync(
            DeleteOriginEndpointPolicyRequest deleteOriginEndpointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOriginEndpointPolicyRequest, DeleteOriginEndpointPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified channel that's configured in AWS Elemental MediaPackage, including the origin endpoints
     * that are associated with it.
     * </p>
     * 
     * @param getChannelRequest
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AWSMediaPackageV2Async.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest);

    /**
     * <p>
     * Retrieves the specified channel that's configured in AWS Elemental MediaPackage, including the origin endpoints
     * that are associated with it.
     * </p>
     * 
     * @param getChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified channel group that's configured in AWS Elemental MediaPackage, including the channels and
     * origin endpoints that are associated with it.
     * </p>
     * 
     * @param getChannelGroupRequest
     * @return A Java Future containing the result of the GetChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2Async.GetChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelGroupResult> getChannelGroupAsync(GetChannelGroupRequest getChannelGroupRequest);

    /**
     * <p>
     * Retrieves the specified channel group that's configured in AWS Elemental MediaPackage, including the channels and
     * origin endpoints that are associated with it.
     * </p>
     * 
     * @param getChannelGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.GetChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelGroupResult> getChannelGroupAsync(GetChannelGroupRequest getChannelGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelGroupRequest, GetChannelGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified channel policy that's configured in AWS Elemental MediaPackage. With policies, you can
     * specify who has access to AWS resources and what actions they can perform on those resources.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @return A Java Future containing the result of the GetChannelPolicy operation returned by the service.
     * @sample AWSMediaPackageV2Async.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(GetChannelPolicyRequest getChannelPolicyRequest);

    /**
     * <p>
     * Retrieves the specified channel policy that's configured in AWS Elemental MediaPackage. With policies, you can
     * specify who has access to AWS resources and what actions they can perform on those resources.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelPolicy operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(GetChannelPolicyRequest getChannelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelPolicyRequest, GetChannelPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified origin endpoint that's configured in AWS Elemental MediaPackage to obtain its playback
     * URL and to view the packaging settings that it's currently using.
     * </p>
     * 
     * @param getOriginEndpointRequest
     * @return A Java Future containing the result of the GetOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2Async.GetOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginEndpointResult> getOriginEndpointAsync(GetOriginEndpointRequest getOriginEndpointRequest);

    /**
     * <p>
     * Retrieves the specified origin endpoint that's configured in AWS Elemental MediaPackage to obtain its playback
     * URL and to view the packaging settings that it's currently using.
     * </p>
     * 
     * @param getOriginEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.GetOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginEndpointResult> getOriginEndpointAsync(GetOriginEndpointRequest getOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetOriginEndpointRequest, GetOriginEndpointResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified origin endpoint policy that's configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param getOriginEndpointPolicyRequest
     * @return A Java Future containing the result of the GetOriginEndpointPolicy operation returned by the service.
     * @sample AWSMediaPackageV2Async.GetOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginEndpointPolicyResult> getOriginEndpointPolicyAsync(GetOriginEndpointPolicyRequest getOriginEndpointPolicyRequest);

    /**
     * <p>
     * Retrieves the specified origin endpoint policy that's configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param getOriginEndpointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOriginEndpointPolicy operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.GetOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginEndpointPolicyResult> getOriginEndpointPolicyAsync(GetOriginEndpointPolicyRequest getOriginEndpointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetOriginEndpointPolicyRequest, GetOriginEndpointPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves all channel groups that are configured in AWS Elemental MediaPackage, including the channels and origin
     * endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelGroupsRequest
     * @return A Java Future containing the result of the ListChannelGroups operation returned by the service.
     * @sample AWSMediaPackageV2Async.ListChannelGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannelGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelGroupsResult> listChannelGroupsAsync(ListChannelGroupsRequest listChannelGroupsRequest);

    /**
     * <p>
     * Retrieves all channel groups that are configured in AWS Elemental MediaPackage, including the channels and origin
     * endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelGroups operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.ListChannelGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannelGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelGroupsResult> listChannelGroupsAsync(ListChannelGroupsRequest listChannelGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelGroupsRequest, ListChannelGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all channels in a specific channel group that are configured in AWS Elemental MediaPackage, including
     * the origin endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaPackageV2Async.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Retrieves all channels in a specific channel group that are configured in AWS Elemental MediaPackage, including
     * the origin endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all origin endpoints in a specific channel that are configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param listOriginEndpointsRequest
     * @return A Java Future containing the result of the ListOriginEndpoints operation returned by the service.
     * @sample AWSMediaPackageV2Async.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest listOriginEndpointsRequest);

    /**
     * <p>
     * Retrieves all origin endpoints in a specific channel that are configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param listOriginEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOriginEndpoints operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest listOriginEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOriginEndpointsRequest, ListOriginEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackageV2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Attaches an IAM policy to the specified channel. With policies, you can specify who has access to AWS resources
     * and what actions they can perform on those resources. You can attach only one policy with each request.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @return A Java Future containing the result of the PutChannelPolicy operation returned by the service.
     * @sample AWSMediaPackageV2Async.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(PutChannelPolicyRequest putChannelPolicyRequest);

    /**
     * <p>
     * Attaches an IAM policy to the specified channel. With policies, you can specify who has access to AWS resources
     * and what actions they can perform on those resources. You can attach only one policy with each request.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutChannelPolicy operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(PutChannelPolicyRequest putChannelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutChannelPolicyRequest, PutChannelPolicyResult> asyncHandler);

    /**
     * <p>
     * Attaches an IAM policy to the specified origin endpoint. You can attach only one policy with each request.
     * </p>
     * 
     * @param putOriginEndpointPolicyRequest
     * @return A Java Future containing the result of the PutOriginEndpointPolicy operation returned by the service.
     * @sample AWSMediaPackageV2Async.PutOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOriginEndpointPolicyResult> putOriginEndpointPolicyAsync(PutOriginEndpointPolicyRequest putOriginEndpointPolicyRequest);

    /**
     * <p>
     * Attaches an IAM policy to the specified origin endpoint. You can attach only one policy with each request.
     * </p>
     * 
     * @param putOriginEndpointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutOriginEndpointPolicy operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.PutOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOriginEndpointPolicyResult> putOriginEndpointPolicyAsync(PutOriginEndpointPolicyRequest putOriginEndpointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutOriginEndpointPolicyRequest, PutOriginEndpointPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaPackageV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackageV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaPackageV2Async.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2Async.UpdateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelGroupResult> updateChannelGroupAsync(UpdateChannelGroupRequest updateChannelGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannelGroup operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.UpdateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelGroupResult> updateChannelGroupAsync(UpdateChannelGroupRequest updateChannelGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelGroupRequest, UpdateChannelGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2Async.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest updateOriginEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageV2AsyncHandler.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest updateOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOriginEndpointRequest, UpdateOriginEndpointResult> asyncHandler);

}
