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
package com.amazonaws.services.resourcegroups;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.resourcegroups.model.*;

/**
 * Interface for accessing Resource Groups.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resourcegroups.AbstractAWSResourceGroups} instead.
 * </p>
 * <p>
 * <fullname>AWS Resource Groups</fullname>
 * <p>
 * AWS Resource Groups lets you organize AWS resources such as Amazon EC2 instances, Amazon Relational Database Service
 * databases, and Amazon S3 buckets into groups using criteria that you define as tags. A resource group is a collection
 * of resources that match the resource types specified in a query, and share one or more tags or portions of tags. You
 * can create a group of resources based on their roles in your cloud infrastructure, lifecycle stages, regions,
 * application layers, or virtually any criteria. Resource groups enable you to automate management tasks, such as those
 * in AWS Systems Manager Automation documents, on tag-related resources in AWS Systems Manager. Groups of tagged
 * resources also let you quickly view a custom console in AWS Systems Manager that shows AWS Config compliance and
 * other monitoring data about member resources.
 * </p>
 * <p>
 * To create a resource group, build a resource query, and specify tags that identify the criteria that members of the
 * group have in common. Tags are key-value pairs.
 * </p>
 * <p>
 * For more information about Resource Groups, see the <a
 * href="https://docs.aws.amazon.com/ARG/latest/userguide/welcome.html">AWS Resource Groups User Guide</a>.
 * </p>
 * <p>
 * AWS Resource Groups uses a REST-compliant API that you can use to perform the following types of operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create, Read, Update, and Delete (CRUD) operations on resource groups and resource query entities
 * </p>
 * </li>
 * <li>
 * <p>
 * Applying, editing, and removing tags from resource groups
 * </p>
 * </li>
 * <li>
 * <p>
 * Resolving resource group member ARNs so they can be returned as search results
 * </p>
 * </li>
 * <li>
 * <p>
 * Getting data about resources that are members of a group
 * </p>
 * </li>
 * <li>
 * <p>
 * Searching AWS resources based on a resource query
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResourceGroups {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "resource-groups";

    /**
     * <p>
     * Creates a group with a specified name, description, and resource query.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
     * group; it only deletes the group structure.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/DeleteGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Returns information about a specified resource group.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Returns the resource query associated with the specified resource group.
     * </p>
     * 
     * @param getGroupQueryRequest
     * @return Result of the GetGroupQuery operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.GetGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupQuery" target="_top">AWS
     *      API Documentation</a>
     */
    GetGroupQueryResult getGroupQuery(GetGroupQueryRequest getGroupQueryRequest);

    /**
     * <p>
     * Returns a list of tags that are associated with a resource group, specified by an ARN.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Returns a list of ARNs of resources that are members of a specified resource group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @return Result of the ListGroupResources operation returned by the service.
     * @throws UnauthorizedException
     *         The request has not been applied because it lacks valid authentication credentials for the target
     *         resource.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupResourcesResult listGroupResources(ListGroupResourcesRequest listGroupResourcesRequest);

    /**
     * <p>
     * Returns a list of existing resource groups in your account.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
     * resource query in a CreateGroup or UpdateGroupQuery operation.
     * </p>
     * 
     * @param searchResourcesRequest
     * @return Result of the SearchResources operation returned by the service.
     * @throws UnauthorizedException
     *         The request has not been applied because it lacks valid authentication credentials for the target
     *         resource.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/SearchResources"
     *      target="_top">AWS API Documentation</a>
     */
    SearchResourcesResult searchResources(SearchResourcesRequest searchResourcesRequest);

    /**
     * <p>
     * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
     * are not specified in the request parameters.
     * </p>
     * 
     * @param tagRequest
     * @return Result of the Tag operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.Tag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Tag" target="_top">AWS API
     *      Documentation</a>
     */
    TagResult tag(TagRequest tagRequest);

    /**
     * <p>
     * Deletes specified tags from a specified resource.
     * </p>
     * 
     * @param untagRequest
     * @return Result of the Untag operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.Untag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Untag" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResult untag(UntagRequest untagRequest);

    /**
     * <p>
     * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Updates the resource query of a group.
     * </p>
     * 
     * @param updateGroupQueryRequest
     * @return Result of the UpdateGroupQuery operation returned by the service.
     * @throws BadRequestException
     *         The request does not comply with validation rules that are defined for the request parameters.
     * @throws ForbiddenException
     *         The caller is not authorized to make the request.
     * @throws NotFoundException
     *         One or more resources specified in the request do not exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method which is not allowed for the specified resource.
     * @throws TooManyRequestsException
     *         The caller has exceeded throttling limits.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request.
     * @sample AWSResourceGroups.UpdateGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroupQuery"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGroupQueryResult updateGroupQuery(UpdateGroupQueryRequest updateGroupQueryRequest);

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
