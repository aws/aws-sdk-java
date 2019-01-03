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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;

/**
 * Interface for accessing AWS Resource Groups Tagging API.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resourcegroupstaggingapi.AbstractAWSResourceGroupsTaggingAPI} instead.
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
public interface AWSResourceGroupsTaggingAPI {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "tagging";

    /**
     * <p>
     * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the
     * specified region for the AWS account. The tags and the resource types that you specify in the request are known
     * as <i>filters</i>. The response includes all tags that are associated with the requested resources. If no filter
     * is provided, this action returns a paginated resource list with the associated tags.
     * </p>
     * 
     * @param getResourcesRequest
     * @return Result of the GetResources operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws PaginationTokenExpiredException
     *         A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the
     *         specified <code>PaginationToken</code> has expired.
     * @sample AWSResourceGroupsTaggingAPI.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetResources"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcesResult getResources(GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Returns all tag keys in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagKeysRequest
     * @return Result of the GetTagKeys operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws PaginationTokenExpiredException
     *         A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the
     *         specified <code>PaginationToken</code> has expired.
     * @sample AWSResourceGroupsTaggingAPI.GetTagKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagKeys"
     *      target="_top">AWS API Documentation</a>
     */
    GetTagKeysResult getTagKeys(GetTagKeysRequest getTagKeysRequest);

    /**
     * <p>
     * Returns all tag values for the specified key in the specified region for the AWS account.
     * </p>
     * 
     * @param getTagValuesRequest
     * @return Result of the GetTagValues operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws PaginationTokenExpiredException
     *         A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the
     *         specified <code>PaginationToken</code> has expired.
     * @sample AWSResourceGroupsTaggingAPI.GetTagValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagValues"
     *      target="_top">AWS API Documentation</a>
     */
    GetTagValuesResult getTagValues(GetTagValuesRequest getTagValuesRequest);

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
     * @return Result of the TagResources operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.TagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/TagResources"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourcesResult tagResources(TagResourcesRequest tagResourcesRequest);

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
     * @return Result of the UntagResources operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the
     *         request parameter.
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.UntagResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/UntagResources"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourcesResult untagResources(UntagResourcesRequest untagResourcesRequest);

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
