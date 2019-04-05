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
package com.amazonaws.services.resourcegroupstaggingapi;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;

/**
 * Interface for accessing AWS Resource Groups Tagging API asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resourcegroupstaggingapi.AbstractAWSResourceGroupsTaggingAPIAsync} instead.
 * </p>
 * <p>
 * <fullname>Resource Groups Tagging API</fullname>
 * <p>
 * This guide describes the API operations for the resource groups tagging.
 * </p>
 * <p>
 * A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
 * For example, if you have two Amazon EC2 instances, you might assign both a tag key of "Stack." But the value of
 * "Stack" might be "Testing" for one and "Production" for the other.
 * </p>
 * <p>
 * Tagging can help you organize your resources and enables you to simplify resource management, access management and
 * cost allocation. For more information about tagging, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html">Working with Tag Editor</a> and <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/resource-groups.html">Working with Resource
 * Groups</a>. For more information about permissions you need to use the resource groups tagging APIs, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-resource-groups.html"
 * >Obtaining Permissions for Resource Groups </a> and <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
 * Permissions for Tagging </a>.
 * </p>
 * <p>
 * You can use the resource groups tagging APIs to complete the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag and untag supported resources located in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * Use tag-based filters to search for resources located in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing tag keys in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing values for the specified key in the specified region for the AWS account
 * </p>
 * </li>
 * </ul>
 * <p>
 * Not all resources can have tags. For a lists of resources that you can tag, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html">Supported Resources</a> in
 * the <i>AWS Resource Groups and Tag Editor User Guide</i>.
 * </p>
 * <p>
 * To make full use of the resource groups tagging APIs, you might need additional IAM permissions, including permission
 * to access the resources of individual services as well as permission to view and apply tags to those resources. For
 * more information, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
 * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResourceGroupsTaggingAPIAsync extends AWSResourceGroupsTaggingAPI {

    /**
     * <p>
     * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the
     * specified region for the AWS account. The tags and the resource types that you specify in the request are known
     * as <i>filters</i>. The response includes all tags that are associated with the requested resources. If no filter
     * is provided, this action returns a paginated resource list with the associated tags.
     * </p>
     * 
     * @param getResourcesRequest
     * @return A Java Future containing the result of the GetResources operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the
     * specified region for the AWS account. The tags and the resource types that you specify in the request are known
     * as <i>filters</i>. The response includes all tags that are associated with the requested resources. If no filter
     * is provided, this action returns a paginated resource list with the associated tags.
     * </p>
     * 
     * @param getResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResources operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest getResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns all tag keys in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagKeysRequest
     * @return A Java Future containing the result of the GetTagKeys operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.GetTagKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(GetTagKeysRequest getTagKeysRequest);

    /**
     * <p>
     * Returns all tag keys in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTagKeys operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.GetTagKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(GetTagKeysRequest getTagKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagKeysRequest, GetTagKeysResult> asyncHandler);

    /**
     * <p>
     * Returns all tag values for the specified key in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagValuesRequest
     * @return A Java Future containing the result of the GetTagValues operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.GetTagValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagValues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(GetTagValuesRequest getTagValuesRequest);

    /**
     * <p>
     * Returns all tag values for the specified key in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagValuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTagValues operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.GetTagValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagValues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(GetTagValuesRequest getTagValuesRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagValuesRequest, GetTagValuesResult> asyncHandler);

    /**
     * <p>
     * Applies one or more tags to the specified resources. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources can have tags. For a list of resources that support tagging, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html">Supported Resources</a>
     * in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-restrictions">Tag Restrictions</a>
     * in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
     * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourcesRequest
     * @return A Java Future containing the result of the TagResources operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.TagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(TagResourcesRequest tagResourcesRequest);

    /**
     * <p>
     * Applies one or more tags to the specified resources. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources can have tags. For a list of resources that support tagging, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html">Supported Resources</a>
     * in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-restrictions">Tag Restrictions</a>
     * in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
     * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResources operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.TagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(TagResourcesRequest tagResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourcesRequest, TagResourcesResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
     * key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
     * already removed. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
     * as well as permissions for removing tags. For more information, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
     * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified region for the AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param untagResourcesRequest
     * @return A Java Future containing the result of the UntagResources operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.UntagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/UntagResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(UntagResourcesRequest untagResourcesRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
     * key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
     * already removed. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
     * as well as permissions for removing tags. For more information, see <a
     * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
     * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified region for the AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param untagResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResources operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.UntagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/UntagResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(UntagResourcesRequest untagResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourcesRequest, UntagResourcesResult> asyncHandler);

}
