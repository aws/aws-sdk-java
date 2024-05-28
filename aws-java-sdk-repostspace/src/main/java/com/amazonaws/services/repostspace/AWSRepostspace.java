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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.repostspace.model.*;

/**
 * Interface for accessing AWS re:Post Private.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.repostspace.AbstractAWSRepostspace} instead.
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
public interface AWSRepostspace {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "repostspace";

    /**
     * <p>
     * Creates an AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param createSpaceRequest
     * @return Result of the CreateSpace operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.CreateSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/CreateSpace" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSpaceResult createSpace(CreateSpaceRequest createSpaceRequest);

    /**
     * <p>
     * Deletes an AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param deleteSpaceRequest
     * @return Result of the DeleteSpace operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.DeleteSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeleteSpace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSpaceResult deleteSpace(DeleteSpaceRequest deleteSpaceRequest);

    /**
     * <p>
     * Removes the user or group from the list of administrators of the private re:Post.
     * </p>
     * 
     * @param deregisterAdminRequest
     * @return Result of the DeregisterAdmin operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.DeregisterAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeregisterAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterAdminResult deregisterAdmin(DeregisterAdminRequest deregisterAdminRequest);

    /**
     * <p>
     * Displays information about the AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param getSpaceRequest
     * @return Result of the GetSpace operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.GetSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/GetSpace" target="_top">AWS API
     *      Documentation</a>
     */
    GetSpaceResult getSpace(GetSpaceRequest getSpaceRequest);

    /**
     * <p>
     * Returns a list of AWS re:Post Private private re:Posts in the account with some information about each private
     * re:Post.
     * </p>
     * 
     * @param listSpacesRequest
     * @return Result of the ListSpaces operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.ListSpaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/ListSpaces" target="_top">AWS API
     *      Documentation</a>
     */
    ListSpacesResult listSpaces(ListSpacesRequest listSpacesRequest);

    /**
     * <p>
     * Returns the tags that are associated with the AWS re:Post Private resource specified by the resourceArn. The only
     * resource that can be tagged is a private re:Post.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds a user or group to the list of administrators of the private re:Post.
     * </p>
     * 
     * @param registerAdminRequest
     * @return Result of the RegisterAdmin operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.RegisterAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/RegisterAdmin" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterAdminResult registerAdmin(RegisterAdminRequest registerAdminRequest);

    /**
     * <p>
     * Sends an invitation email to selected users and groups.
     * </p>
     * 
     * @param sendInvitesRequest
     * @return Result of the SendInvites operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.SendInvites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/SendInvites" target="_top">AWS API
     *      Documentation</a>
     */
    SendInvitesResult sendInvites(SendInvitesRequest sendInvitesRequest);

    /**
     * <p>
     * Associates tags with an AWS re:Post Private resource. Currently, the only resource that can be tagged is the
     * private re:Post. If you specify a new tag key for the resource, the tag is appended to the list of tags that are
     * associated with the resource. If you specify a tag key that’s already associated with the resource, the new tag
     * value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the association of the tag with the AWS re:Post Private resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies an existing AWS re:Post Private private re:Post.
     * </p>
     * 
     * @param updateSpaceRequest
     * @return Result of the UpdateSpace operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSRepostspace.UpdateSpace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UpdateSpace" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSpaceResult updateSpace(UpdateSpaceRequest updateSpaceRequest);

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
