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
 * application layers, or virtually any criteria. Resource Groups enable you to automate management tasks, such as those
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
     * Creates a resource group with the specified name and description. You can optionally include a resource query, or
     * a service configuration. For more information about constructing a resource query, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>. For more information about service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:CreateGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * Creates a resource group with the specified name and description. You can optionally include a resource query, or
     * a service configuration. For more information about constructing a resource query, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>. For more information about service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:CreateGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * Deletes the specified resource group. Deleting a resource group does not delete any resources that are members of
     * the group; it only deletes the group structure.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:DeleteGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * Deletes the specified resource group. Deleting a resource group does not delete any resources that are members of
     * the group; it only deletes the group structure.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:DeleteGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * Returns the service configuration associated with the specified resource group. For details about the service
     * configuration syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service
     * configurations for resource groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetGroupConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getGroupConfigurationRequest
     * @return A Java Future containing the result of the GetGroupConfiguration operation returned by the service.
     * @sample AWSResourceGroupsAsync.GetGroupConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupConfigurationResult> getGroupConfigurationAsync(GetGroupConfigurationRequest getGroupConfigurationRequest);

    /**
     * <p>
     * Returns the service configuration associated with the specified resource group. For details about the service
     * configuration syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service
     * configurations for resource groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetGroupConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getGroupConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupConfiguration operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.GetGroupConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupConfigurationResult> getGroupConfigurationAsync(GetGroupConfigurationRequest getGroupConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupConfigurationRequest, GetGroupConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource query associated with the specified resource group. For more information about resource
     * queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetGroupQuery</code>
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the resource query associated with the specified resource group. For more information about resource
     * queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetGroupQuery</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetTags</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GetTags</code>
     * </p>
     * </li>
     * </ul>
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
     * Adds the specified resources to the specified group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GroupResources</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupResourcesRequest
     * @return A Java Future containing the result of the GroupResources operation returned by the service.
     * @sample AWSResourceGroupsAsync.GroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GroupResourcesResult> groupResourcesAsync(GroupResourcesRequest groupResourcesRequest);

    /**
     * <p>
     * Adds the specified resources to the specified group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:GroupResources</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GroupResources operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.GroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GroupResourcesResult> groupResourcesAsync(GroupResourcesRequest groupResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GroupResourcesRequest, GroupResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of ARNs of the resources that are members of a specified resource group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:ListGroupResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:DescribeStacks</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:ListStackResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:GetResources</code>
     * </p>
     * </li>
     * </ul>
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
     * Returns a list of ARNs of the resources that are members of a specified resource group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:ListGroupResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:DescribeStacks</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:ListStackResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:GetResources</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:ListGroups</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:ListGroups</code>
     * </p>
     * </li>
     * </ul>
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
     * Attaches a service configuration to the specified group. This occurs asynchronously, and can take time to
     * complete. You can use <a>GetGroupConfiguration</a> to check the status of the update.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:PutGroupConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putGroupConfigurationRequest
     * @return A Java Future containing the result of the PutGroupConfiguration operation returned by the service.
     * @sample AWSResourceGroupsAsync.PutGroupConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/PutGroupConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutGroupConfigurationResult> putGroupConfigurationAsync(PutGroupConfigurationRequest putGroupConfigurationRequest);

    /**
     * <p>
     * Attaches a service configuration to the specified group. This occurs asynchronously, and can take time to
     * complete. You can use <a>GetGroupConfiguration</a> to check the status of the update.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:PutGroupConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putGroupConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutGroupConfiguration operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.PutGroupConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/PutGroupConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutGroupConfigurationResult> putGroupConfigurationAsync(PutGroupConfigurationRequest putGroupConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutGroupConfigurationRequest, PutGroupConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of AWS resource identifiers that matches the specified query. The query uses the same format as a
     * resource query in a CreateGroup or UpdateGroupQuery operation.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:SearchResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:DescribeStacks</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:ListStackResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:GetResources</code>
     * </p>
     * </li>
     * </ul>
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
     * Returns a list of AWS resource identifiers that matches the specified query. The query uses the same format as a
     * resource query in a CreateGroup or UpdateGroupQuery operation.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:SearchResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:DescribeStacks</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudformation:ListStackResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:GetResources</code>
     * </p>
     * </li>
     * </ul>
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
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:Tag</code>
     * </p>
     * </li>
     * </ul>
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
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:Tag</code>
     * </p>
     * </li>
     * </ul>
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
     * Removes the specified resources from the specified group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:UngroupResources</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param ungroupResourcesRequest
     * @return A Java Future containing the result of the UngroupResources operation returned by the service.
     * @sample AWSResourceGroupsAsync.UngroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UngroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UngroupResourcesResult> ungroupResourcesAsync(UngroupResourcesRequest ungroupResourcesRequest);

    /**
     * <p>
     * Removes the specified resources from the specified group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:UngroupResources</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param ungroupResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UngroupResources operation returned by the service.
     * @sample AWSResourceGroupsAsyncHandler.UngroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UngroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UngroupResourcesResult> ungroupResourcesAsync(UngroupResourcesRequest ungroupResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<UngroupResourcesRequest, UngroupResourcesResult> asyncHandler);

    /**
     * <p>
     * Deletes tags from a specified resource group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:Untag</code>
     * </p>
     * </li>
     * </ul>
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
     * Deletes tags from a specified resource group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:Untag</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates the description for an existing group. You cannot update the name of a resource group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:UpdateGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates the description for an existing group. You cannot update the name of a resource group.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:UpdateGroup</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates the resource query of a group. For more information about resource queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:UpdateGroupQuery</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates the resource query of a group. For more information about resource queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * To run this command, you must have the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-groups:UpdateGroupQuery</code>
     * </p>
     * </li>
     * </ul>
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
