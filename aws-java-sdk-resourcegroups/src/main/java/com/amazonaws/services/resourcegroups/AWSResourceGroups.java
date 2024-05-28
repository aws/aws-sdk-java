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
 * <p>
 * Resource Groups lets you organize Amazon Web Services resources such as Amazon Elastic Compute Cloud instances,
 * Amazon Relational Database Service databases, and Amazon Simple Storage Service buckets into groups using criteria
 * that you define as tags. A resource group is a collection of resources that match the resource types specified in a
 * query, and share one or more tags or portions of tags. You can create a group of resources based on their roles in
 * your cloud infrastructure, lifecycle stages, regions, application layers, or virtually any criteria. Resource Groups
 * enable you to automate management tasks, such as those in Amazon Web Services Systems Manager Automation documents,
 * on tag-related resources in Amazon Web Services Systems Manager. Groups of tagged resources also let you quickly view
 * a custom console in Amazon Web Services Systems Manager that shows Config compliance and other monitoring data about
 * member resources.
 * </p>
 * <p>
 * To create a resource group, build a resource query, and specify tags that identify the criteria that members of the
 * group have in common. Tags are key-value pairs.
 * </p>
 * <p>
 * For more information about Resource Groups, see the <a
 * href="https://docs.aws.amazon.com/ARG/latest/userguide/welcome.html">Resource Groups User Guide</a>.
 * </p>
 * <p>
 * Resource Groups uses a REST-compliant API that you can use to perform the following types of operations.
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
 * Searching Amazon Web Services resources based on a resource query
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
     * Creates a resource group with the specified name and description. You can optionally include either a resource
     * query or a service configuration. For more information about constructing a resource query, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/getting_started-query.html">Build queries and groups in
     * Resource Groups</a> in the <i>Resource Groups User Guide</i>. For more information about service-linked groups
     * and service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for Resource
     * Groups</a>.
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
     * @return Result of the CreateGroup operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

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
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/DeleteGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Retrieves the current status of optional features in Resource Groups.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

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
     * @return Result of the GetGroup operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Retrieves the service configuration associated with the specified resource group. For details about the service
     * configuration syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service
     * configurations for Resource Groups</a>.
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
     * @return Result of the GetGroupConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.GetGroupConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetGroupConfigurationResult getGroupConfiguration(GetGroupConfigurationRequest getGroupConfigurationRequest);

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
     * @return Result of the GetGroupQuery operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.GetGroupQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupQuery" target="_top">AWS
     *      API Documentation</a>
     */
    GetGroupQueryResult getGroupQuery(GetGroupQueryRequest getGroupQueryRequest);

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
     * @return Result of the GetTags operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Adds the specified resources to the specified group.
     * </p>
     * <important>
     * <p>
     * You can use this operation with only resource groups that are configured with the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::HostManagement</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Other resource group type and resource types aren't currently supported by this operation.
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
     * <code>resource-groups:GroupResources</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupResourcesRequest
     * @return Result of the GroupResources operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.GroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    GroupResourcesResult groupResources(GroupResourcesRequest groupResourcesRequest);

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
     * @return Result of the ListGroupResources operation returned by the service.
     * @throws UnauthorizedException
     *         The request was rejected because it doesn't have valid credentials for the target resource.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupResourcesResult listGroupResources(ListGroupResourcesRequest listGroupResourcesRequest);

    /**
     * <p>
     * Returns a list of existing Resource Groups in your account.
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
     * @return Result of the ListGroups operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

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
     * @return Result of the PutGroupConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.PutGroupConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/PutGroupConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutGroupConfigurationResult putGroupConfiguration(PutGroupConfigurationRequest putGroupConfigurationRequest);

    /**
     * <p>
     * Returns a list of Amazon Web Services resource identifiers that matches the specified query. The query uses the
     * same format as a resource query in a <a>CreateGroup</a> or <a>UpdateGroupQuery</a> operation.
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
     * @return Result of the SearchResources operation returned by the service.
     * @throws UnauthorizedException
     *         The request was rejected because it doesn't have valid credentials for the target resource.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
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
     * @return Result of the Tag operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.Tag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Tag" target="_top">AWS API
     *      Documentation</a>
     */
    TagResult tag(TagRequest tagRequest);

    /**
     * <p>
     * Removes the specified resources from the specified group. This operation works only with static groups that you
     * populated using the <a>GroupResources</a> operation. It doesn't work with any resource groups that are
     * automatically populated by tag-based or CloudFormation stack-based queries.
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
     * @return Result of the UngroupResources operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.UngroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UngroupResources"
     *      target="_top">AWS API Documentation</a>
     */
    UngroupResourcesResult ungroupResources(UngroupResourcesRequest ungroupResourcesRequest);

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
     * @return Result of the Untag operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.Untag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Untag" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResult untag(UntagRequest untagRequest);

    /**
     * <p>
     * Turns on or turns off optional features in Resource Groups.
     * </p>
     * <p>
     * The preceding example shows that the request to turn on group lifecycle events is <code>IN_PROGRESS</code>. You
     * can call the <a>GetAccountSettings</a> operation to check for completion by looking for
     * <code>GroupLifecycleEventsStatus</code> to change to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest);

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
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
     * @sample AWSResourceGroups.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

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
     * @return Result of the UpdateGroupQuery operation returned by the service.
     * @throws BadRequestException
     *         The request includes one or more parameters that violate validation rules.
     * @throws ForbiddenException
     *         The caller isn't authorized to make the request. Check permissions.
     * @throws NotFoundException
     *         One or more of the specified resources don't exist.
     * @throws MethodNotAllowedException
     *         The request uses an HTTP method that isn't allowed for the specified resource.
     * @throws TooManyRequestsException
     *         You've exceeded throttling limits by making too many requests in a period of time.
     * @throws InternalServerErrorException
     *         An internal error occurred while processing the request. Try again later.
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
