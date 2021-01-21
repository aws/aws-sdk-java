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
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResourceGroupsTaggingAPIAsync extends AWSResourceGroupsTaggingAPI {

    /**
     * <p>
     * Describes the status of the <code>StartReportCreation</code> operation.
     * </p>
     * <p>
     * You can call this operation only from the organization's management account and from the us-east-1 Region.
     * </p>
     * 
     * @param describeReportCreationRequest
     * @return A Java Future containing the result of the DescribeReportCreation operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.DescribeReportCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DescribeReportCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReportCreationResult> describeReportCreationAsync(DescribeReportCreationRequest describeReportCreationRequest);

    /**
     * <p>
     * Describes the status of the <code>StartReportCreation</code> operation.
     * </p>
     * <p>
     * You can call this operation only from the organization's management account and from the us-east-1 Region.
     * </p>
     * 
     * @param describeReportCreationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReportCreation operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.DescribeReportCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DescribeReportCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReportCreationResult> describeReportCreationAsync(DescribeReportCreationRequest describeReportCreationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReportCreationRequest, DescribeReportCreationResult> asyncHandler);

    /**
     * <p>
     * Returns a table that shows counts of resources that are noncompliant with their tag policies.
     * </p>
     * <p>
     * For more information on tag policies, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">Tag
     * Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * You can call this operation only from the organization's management account and from the us-east-1 Region.
     * </p>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
     * </p>
     * 
     * @param getComplianceSummaryRequest
     * @return A Java Future containing the result of the GetComplianceSummary operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.GetComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceSummaryResult> getComplianceSummaryAsync(GetComplianceSummaryRequest getComplianceSummaryRequest);

    /**
     * <p>
     * Returns a table that shows counts of resources that are noncompliant with their tag policies.
     * </p>
     * <p>
     * For more information on tag policies, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">Tag
     * Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * You can call this operation only from the organization's management account and from the us-east-1 Region.
     * </p>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
     * </p>
     * 
     * @param getComplianceSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceSummary operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.GetComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceSummaryResult> getComplianceSummaryAsync(GetComplianceSummaryRequest getComplianceSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryRequest, GetComplianceSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns all the tagged or previously tagged resources that are located in the specified Region for the AWS
     * account.
     * </p>
     * <p>
     * Depending on what information you want returned, you can also specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Filters</i> that specify what tags and resource types you want returned. The response includes all tags that
     * are associated with the requested resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about compliance with the account's effective tag policy. For more information on tag policies, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">Tag
     * Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
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
     * Returns all the tagged or previously tagged resources that are located in the specified Region for the AWS
     * account.
     * </p>
     * <p>
     * Depending on what information you want returned, you can also specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Filters</i> that specify what tags and resource types you want returned. The response includes all tags that
     * are associated with the requested resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about compliance with the account's effective tag policy. For more information on tag policies, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">Tag
     * Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
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
     * Returns all tag keys currently in use in the specified Region for the calling AWS account.
     * </p>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
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
     * Returns all tag keys currently in use in the specified Region for the calling AWS account.
     * </p>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
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
     * Returns all tag values for the specified key that are used in the specified AWS Region for the calling AWS
     * account.
     * </p>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
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
     * Returns all tag values for the specified key that are used in the specified AWS Region for the calling AWS
     * account.
     * </p>
     * <p>
     * This operation supports pagination, where the response can be sent in multiple pages. You should check the
     * <code>PaginationToken</code> response parameter to determine if there are additional results available to return.
     * Repeat the query, passing the <code>PaginationToken</code> response parameter value as an input to the next
     * request until you recieve a <code>null</code> value. A null value for <code>PaginationToken</code> indicates that
     * there are no more results waiting to be returned.
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
     * Generates a report that lists all tagged resources in the accounts across your organization and tells whether
     * each resource is compliant with the effective tag policy. Compliance data is refreshed daily. The report is
     * generated asynchronously.
     * </p>
     * <p>
     * The generated report is saved to the following location:
     * </p>
     * <p>
     * <code>s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv</code>
     * </p>
     * <p>
     * You can call this operation only from the organization's management account and from the us-east-1 Region.
     * </p>
     * 
     * @param startReportCreationRequest
     * @return A Java Future containing the result of the StartReportCreation operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.StartReportCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/StartReportCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReportCreationResult> startReportCreationAsync(StartReportCreationRequest startReportCreationRequest);

    /**
     * <p>
     * Generates a report that lists all tagged resources in the accounts across your organization and tells whether
     * each resource is compliant with the effective tag policy. Compliance data is refreshed daily. The report is
     * generated asynchronously.
     * </p>
     * <p>
     * The generated report is saved to the following location:
     * </p>
     * <p>
     * <code>s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv</code>
     * </p>
     * <p>
     * You can call this operation only from the organization's management account and from the us-east-1 Region.
     * </p>
     * 
     * @param startReportCreationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReportCreation operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.StartReportCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/StartReportCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReportCreationResult> startReportCreationAsync(StartReportCreationRequest startReportCreationRequest,
            com.amazonaws.handlers.AsyncHandler<StartReportCreationRequest, StartReportCreationResult> asyncHandler);

    /**
     * <p>
     * Applies one or more tags to the specified resources. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources can have tags. For a list of services with resources that support tagging using this operation,
     * see <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
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
     * Not all resources can have tags. For a list of services with resources that support tagging using this operation,
     * see <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/supported-services.html">Services
     * that support the Resource Groups Tagging API</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see the documentation for each service.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
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
     * as well as permissions for removing tags. For more information, see the documentation for the service whose
     * resource you want to untag.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the calling AWS account.
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
     * as well as permissions for removing tags. For more information, see the documentation for the service whose
     * resource you want to untag.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the calling AWS account.
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
