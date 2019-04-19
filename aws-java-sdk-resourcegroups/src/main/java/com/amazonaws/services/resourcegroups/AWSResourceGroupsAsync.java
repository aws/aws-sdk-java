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

import com.amazonaws.services.resourcegroups.model.*;

/**
 * Interface for accessing Resource Groups asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resourcegroups.AbstractAWSResourceGroupsAsync} instead.
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
public interface AWSResourceGroupsAsync extends AWSResourceGroups {

    /**
     * <p>
     * Creates a group with a specified name, description, and resource query.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSResourceGroupsAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a group with a specified name, description, and resource query.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
     * group; it only deletes the group structure.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSResourceGroupsAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/DeleteGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the
     * group; it only deletes the group structure.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/DeleteGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified resource group.
     * </p>
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSResourceGroupsAsync.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Returns information about a specified resource group.
     * </p>
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * <p>
     * Returns the resource query associated with the specified resource group.
     * </p>
     * 
     * @param getGroupQueryRequest
     * @return A Java Future containing the result of the GetGroupQuery operation returned by the service.
     * @sample AWSResourceGroupsAsync.GetGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupQueryResult> getGroupQueryAsync(GetGroupQueryRequest getGroupQueryRequest);

    /**
     * <p>
     * Returns the resource query associated with the specified resource group.
     * </p>
     * 
     * @param getGroupQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupQuery operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.GetGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupQueryResult> getGroupQueryAsync(GetGroupQueryRequest getGroupQueryRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupQueryRequest, GetGroupQueryResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags that are associated with a resource group, specified by an ARN.
     * </p>
     * 
     * @param getTagsRequest
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AWSResourceGroupsAsync.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Returns a list of tags that are associated with a resource group, specified by an ARN.
     * </p>
     * 
     * @param getTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of ARNs of resources that are members of a specified resource group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @return A Java Future containing the result of the ListGroupResources operation returned by the service.
     * @sample AWSResourceGroupsAsync.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest listGroupResourcesRequest);

    /**
     * <p>
     * Returns a list of ARNs of resources that are members of a specified resource group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupResources operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest listGroupResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupResourcesRequest, ListGroupResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing resource groups in your account.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSResourceGroupsAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Returns a list of existing resource groups in your account.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
     * resource query in a CreateGroup or UpdateGroupQuery operation.
     * </p>
     * 
     * @param searchResourcesRequest
     * @return A Java Future containing the result of the SearchResources operation returned by the service.
     * @sample AWSResourceGroupsAsync.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/SearchResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest searchResourcesRequest);

    /**
     * <p>
     * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a
     * resource query in a CreateGroup or UpdateGroupQuery operation.
     * </p>
     * 
     * @param searchResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchResources operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/SearchResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest searchResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchResourcesRequest, SearchResourcesResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
     * are not specified in the request parameters.
     * </p>
     * 
     * @param tagRequest
     * @return A Java Future containing the result of the Tag operation returned by the service.
     * @sample AWSResourceGroupsAsync.Tag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Tag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResult> tagAsync(TagRequest tagRequest);

    /**
     * <p>
     * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they
     * are not specified in the request parameters.
     * </p>
     * 
     * @param tagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Tag operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.Tag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Tag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResult> tagAsync(TagRequest tagRequest, com.amazonaws.handlers.AsyncHandler<TagRequest, TagResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a specified resource.
     * </p>
     * 
     * @param untagRequest
     * @return A Java Future containing the result of the Untag operation returned by the service.
     * @sample AWSResourceGroupsAsync.Untag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Untag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResult> untagAsync(UntagRequest untagRequest);

    /**
     * <p>
     * Deletes specified tags from a specified resource.
     * </p>
     * 
     * @param untagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Untag operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.Untag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Untag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResult> untagAsync(UntagRequest untagRequest, com.amazonaws.handlers.AsyncHandler<UntagRequest, UntagResult> asyncHandler);

    /**
     * <p>
     * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
     * </p>
     * 
     * @param updateGroupRequest
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSResourceGroupsAsync.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
     * </p>
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the resource query of a group.
     * </p>
     * 
     * @param updateGroupQueryRequest
     * @return A Java Future containing the result of the UpdateGroupQuery operation returned by the service.
     * @sample AWSResourceGroupsAsync.UpdateGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroupQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupQueryResult> updateGroupQueryAsync(UpdateGroupQueryRequest updateGroupQueryRequest);

    /**
     * <p>
     * Updates the resource query of a group.
     * </p>
     * 
     * @param updateGroupQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroupQuery operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.UpdateGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroupQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupQueryResult> updateGroupQueryAsync(UpdateGroupQueryRequest updateGroupQueryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupQueryRequest, UpdateGroupQueryResult> asyncHandler);

}
