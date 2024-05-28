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
package com.amazonaws.services.repostspace;

import javax.annotation.Generated;

import com.amazonaws.services.repostspace.model.*;

/**
 * Interface for accessing AWS re:Post Private asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.repostspace.AbstractAWSRepostspaceAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS re:Post Private is a private version of AWS re:Post for enterprises with Enterprise Support or Enterprise On-Ramp
 * Support plans. It provides access to knowledge and experts to accelerate cloud adoption and increase developer
 * productivity. With your organization-specific private re:Post, you can build an organization-specific developer
 * community that drives efficiencies at scale and provides access to valuable knowledge resources. Additionally,
 * re:Post Private centralizes trusted AWS technical content and offers private discussion forums to improve how your
 * teams collaborate internally and with AWS to remove technical obstacles, accelerate innovation, and scale more
 * efficiently in the cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRepostspaceAsync extends AWSRepostspace {

    /**
     * <p>
     * Creates an AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param createSpaceRequest
     * @return A Java Future containing the result of the CreateSpace operation returned by the service.
     * @sample AWSRepostspaceAsync.CreateSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/CreateSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSpaceResult> createSpaceAsync(CreateSpaceRequest createSpaceRequest);

    /**
     * <p>
     * Creates an AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param createSpaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSpace operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.CreateSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/CreateSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSpaceResult> createSpaceAsync(CreateSpaceRequest createSpaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSpaceRequest, CreateSpaceResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param deleteSpaceRequest
     * @return A Java Future containing the result of the DeleteSpace operation returned by the service.
     * @sample AWSRepostspaceAsync.DeleteSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeleteSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSpaceResult> deleteSpaceAsync(DeleteSpaceRequest deleteSpaceRequest);

    /**
     * <p>
     * Deletes an AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param deleteSpaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSpace operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.DeleteSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeleteSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSpaceResult> deleteSpaceAsync(DeleteSpaceRequest deleteSpaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSpaceRequest, DeleteSpaceResult> asyncHandler);

    /**
     * <p>
     * Removes the user or group from the list of administrators of the private re:Post.
     * </p>
     * 
     * @param deregisterAdminRequest
     * @return A Java Future containing the result of the DeregisterAdmin operation returned by the service.
     * @sample AWSRepostspaceAsync.DeregisterAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeregisterAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterAdminResult> deregisterAdminAsync(DeregisterAdminRequest deregisterAdminRequest);

    /**
     * <p>
     * Removes the user or group from the list of administrators of the private re:Post.
     * </p>
     * 
     * @param deregisterAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterAdmin operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.DeregisterAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeregisterAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterAdminResult> deregisterAdminAsync(DeregisterAdminRequest deregisterAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterAdminRequest, DeregisterAdminResult> asyncHandler);

    /**
     * <p>
     * Displays information about the AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param getSpaceRequest
     * @return A Java Future containing the result of the GetSpace operation returned by the service.
     * @sample AWSRepostspaceAsync.GetSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/GetSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSpaceResult> getSpaceAsync(GetSpaceRequest getSpaceRequest);

    /**
     * <p>
     * Displays information about the AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param getSpaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSpace operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.GetSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/GetSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSpaceResult> getSpaceAsync(GetSpaceRequest getSpaceRequest,
            com.amazonaws.handlers.AsyncHandler<GetSpaceRequest, GetSpaceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of AWS re:Post Private private re:Posts in the account with some information about each private
     * re:Post.
     * </p>
     * 
     * @param listSpacesRequest
     * @return A Java Future containing the result of the ListSpaces operation returned by the service.
     * @sample AWSRepostspaceAsync.ListSpaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/ListSpaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSpacesResult> listSpacesAsync(ListSpacesRequest listSpacesRequest);

    /**
     * <p>
     * Returns a list of AWS re:Post Private private re:Posts in the account with some information about each private
     * re:Post.
     * </p>
     * 
     * @param listSpacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSpaces operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.ListSpaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/ListSpaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSpacesResult> listSpacesAsync(ListSpacesRequest listSpacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSpacesRequest, ListSpacesResult> asyncHandler);

    /**
     * <p>
     * Returns the tags that are associated with the AWS re:Post Private resource specified by the resourceArn. The only
     * resource that can be tagged is a private re:Post.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRepostspaceAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the tags that are associated with the AWS re:Post Private resource specified by the resourceArn. The only
     * resource that can be tagged is a private re:Post.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds a user or group to the list of administrators of the private re:Post.
     * </p>
     * 
     * @param registerAdminRequest
     * @return A Java Future containing the result of the RegisterAdmin operation returned by the service.
     * @sample AWSRepostspaceAsync.RegisterAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/RegisterAdmin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterAdminResult> registerAdminAsync(RegisterAdminRequest registerAdminRequest);

    /**
     * <p>
     * Adds a user or group to the list of administrators of the private re:Post.
     * </p>
     * 
     * @param registerAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterAdmin operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.RegisterAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/RegisterAdmin" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterAdminResult> registerAdminAsync(RegisterAdminRequest registerAdminRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterAdminRequest, RegisterAdminResult> asyncHandler);

    /**
     * <p>
     * Sends an invitation email to selected users and groups.
     * </p>
     * 
     * @param sendInvitesRequest
     * @return A Java Future containing the result of the SendInvites operation returned by the service.
     * @sample AWSRepostspaceAsync.SendInvites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/SendInvites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendInvitesResult> sendInvitesAsync(SendInvitesRequest sendInvitesRequest);

    /**
     * <p>
     * Sends an invitation email to selected users and groups.
     * </p>
     * 
     * @param sendInvitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendInvites operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.SendInvites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/SendInvites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendInvitesResult> sendInvitesAsync(SendInvitesRequest sendInvitesRequest,
            com.amazonaws.handlers.AsyncHandler<SendInvitesRequest, SendInvitesResult> asyncHandler);

    /**
     * <p>
     * Associates tags with an AWS re:Post Private resource. Currently, the only resource that can be tagged is the
     * private re:Post. If you specify a new tag key for the resource, the tag is appended to the list of tags that are
     * associated with the resource. If you specify a tag key that’s already associated with the resource, the new tag
     * value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRepostspaceAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates tags with an AWS re:Post Private resource. Currently, the only resource that can be tagged is the
     * private re:Post. If you specify a new tag key for the resource, the tag is appended to the list of tags that are
     * associated with the resource. If you specify a tag key that’s already associated with the resource, the new tag
     * value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the association of the tag with the AWS re:Post Private resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRepostspaceAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of the tag with the AWS re:Post Private resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param updateSpaceRequest
     * @return A Java Future containing the result of the UpdateSpace operation returned by the service.
     * @sample AWSRepostspaceAsync.UpdateSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UpdateSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSpaceResult> updateSpaceAsync(UpdateSpaceRequest updateSpaceRequest);

    /**
     * <p>
     * Modifies an existing AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param updateSpaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSpace operation returned by the service.
     * @sample AWSRepostspaceAsyncHandler.UpdateSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UpdateSpace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSpaceResult> updateSpaceAsync(UpdateSpaceRequest updateSpaceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSpaceRequest, UpdateSpaceResult> asyncHandler);

}
