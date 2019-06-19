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
 * A tag is a key-value pair that you can add to an AWS resource. A tag consists of a key and a value, both of which you
 * define. For example, if you have two Amazon EC2 instances, you might assign both a tag key of "Stack." But the value
 * of "Stack" might be "Testing" for one and "Production" for the other.
 * </p>
 * <p>
 * Tagging can help you organize your resources and enables you to simplify resource management, access management, and
 * cost allocation.
 * </p>
 * <p>
 * You can use the resource groups tagging API operations to complete the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag and untag supported resources located in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use tag-based filters to search for resources located in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing tag keys in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing values for the specified key in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure <i>tag policies</i> to help maintain standardized tags across your organization's resources. For more
 * information on tag policies, see <a href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag
 * Policies</a>in the <i>AWS Resource Groups User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To make full use of the resource groups tagging API operations, you might need additional IAM permissions, including
 * permission to access the resources of individual services as well as permission to view and apply tags to those
 * resources. For more information, see <a
 * href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
 * Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
 * </p>
 * <p>
 * You can use the Resource Groups Tagging API to tag resources for the following AWS services.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Alexa for Business (a4b)
 * </p>
 * </li>
 * <li>
 * <p>
 * API Gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS AppStream
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Athena
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Certificate Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Certificate Manager Private CA
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cloud Directory
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CloudFormation
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudFront
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CloudHSM
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CloudTrail
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch (alarms only)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch Events
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch Logs
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodeBuild
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodeStar
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cognito Identity
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cognito User Pools
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Comprehend
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Config
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Data Pipeline
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Database Migration Service
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Datasync
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Direct Connect
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Directory Service
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon DynamoDB
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EBS
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon ECR
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon ECS
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elastic Beanstalk
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Elastic File System
 * </p>
 * </li>
 * <li>
 * <p>
 * Elastic Load Balancing
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon ElastiCache
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Elasticsearch Service
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elemental MediaLive
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elemental MediaPackage
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elemental MediaTailor
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon FSx
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Glacier
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Glue
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Inspector
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Analytics
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Core
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Device Defender
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Device Management
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Key Management Service
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Kinesis
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Kinesis Data Firehose
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Lambda
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS License Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Machine Learning
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon MQ
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon MSK
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Neptune
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS OpsWorks
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon RDS
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Redshift
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Resource Access Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Resource Groups
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS RoboMaker
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Route 53
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Route 53 Resolver
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon S3 (buckets only)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Secrets Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Service Catalog
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Queue Service (SQS)
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Simple System Manager (SSM)
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Step Functions
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Storage Gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Transfer for SFTP
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon VPC
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon WorkSpaces
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResourceGroupsTaggingAPIAsync extends AWSResourceGroupsTaggingAPI {

    /**
     * <p>
     * Deletes the policy that is attached to the specified organization root or account.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param deleteTagPolicyRequest
     * @return A Java Future containing the result of the DeleteTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.DeleteTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DeleteTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagPolicyResult> deleteTagPolicyAsync(DeleteTagPolicyRequest deleteTagPolicyRequest);

    /**
     * <p>
     * Deletes the policy that is attached to the specified organization root or account.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param deleteTagPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.DeleteTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DeleteTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagPolicyResult> deleteTagPolicyAsync(DeleteTagPolicyRequest deleteTagPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagPolicyRequest, DeleteTagPolicyResult> asyncHandler);

    /**
     * <p>
     * Describes the status of the <code>StartReportCreation</code> operation.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
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
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
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
     * Disables tag policies for your organization and deletes all tag policies.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * <important>
     * <p>
     * Use caution when disabling tag policies, as this is a destructive operation that applies to your entire
     * organization. You cannot undo this operation.
     * </p>
     * </important>
     * 
     * @param disableTagPoliciesRequest
     * @return A Java Future containing the result of the DisableTagPolicies operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.DisableTagPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DisableTagPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableTagPoliciesResult> disableTagPoliciesAsync(DisableTagPoliciesRequest disableTagPoliciesRequest);

    /**
     * <p>
     * Disables tag policies for your organization and deletes all tag policies.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * <important>
     * <p>
     * Use caution when disabling tag policies, as this is a destructive operation that applies to your entire
     * organization. You cannot undo this operation.
     * </p>
     * </important>
     * 
     * @param disableTagPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableTagPolicies operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.DisableTagPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DisableTagPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableTagPoliciesResult> disableTagPoliciesAsync(DisableTagPoliciesRequest disableTagPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DisableTagPoliciesRequest, DisableTagPoliciesResult> asyncHandler);

    /**
     * <p>
     * Enables tag policies for your organization. To use tag policies, you must be using AWS Organizations with all
     * features enabled.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * <p>
     * This operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enables tag policies for the specified organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls the <a href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html">
     * EnableAWSServiceAccess</a> API on your behalf to allow service access with the
     * <code>tagpolicies.tag.amazonaws.com</code> service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * Creates a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a>
     * named <code>AWSServiceRoleForTagPolicies</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on tag policies, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * 
     * @param enableTagPoliciesRequest
     * @return A Java Future containing the result of the EnableTagPolicies operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.EnableTagPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/EnableTagPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableTagPoliciesResult> enableTagPoliciesAsync(EnableTagPoliciesRequest enableTagPoliciesRequest);

    /**
     * <p>
     * Enables tag policies for your organization. To use tag policies, you must be using AWS Organizations with all
     * features enabled.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * <p>
     * This operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enables tag policies for the specified organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls the <a href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html">
     * EnableAWSServiceAccess</a> API on your behalf to allow service access with the
     * <code>tagpolicies.tag.amazonaws.com</code> service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * Creates a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a>
     * named <code>AWSServiceRoleForTagPolicies</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on tag policies, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * 
     * @param enableTagPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableTagPolicies operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.EnableTagPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/EnableTagPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableTagPoliciesResult> enableTagPoliciesAsync(EnableTagPoliciesRequest enableTagPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<EnableTagPoliciesRequest, EnableTagPoliciesResult> asyncHandler);

    /**
     * <p>
     * Returns a table that shows counts of resources that are noncompliant with their tag policies.
     * </p>
     * <p>
     * For more information on tag policies, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
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
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
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
     * Returns the contents of the effective tag policy for the AWS account. Depending on how you use tag policies, the
     * effective tag policy for an account is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The tag policy attached to the organization that the account belongs to.
     * </p>
     * </li>
     * <li>
     * <p>
     * The tag policy attached to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The combination of both policies if tag policies are attached to the organization root and account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getEffectiveTagPolicyRequest
     * @return A Java Future containing the result of the GetEffectiveTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.GetEffectiveTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetEffectiveTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectiveTagPolicyResult> getEffectiveTagPolicyAsync(GetEffectiveTagPolicyRequest getEffectiveTagPolicyRequest);

    /**
     * <p>
     * Returns the contents of the effective tag policy for the AWS account. Depending on how you use tag policies, the
     * effective tag policy for an account is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The tag policy attached to the organization that the account belongs to.
     * </p>
     * </li>
     * <li>
     * <p>
     * The tag policy attached to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The combination of both policies if tag policies are attached to the organization root and account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getEffectiveTagPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEffectiveTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.GetEffectiveTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetEffectiveTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectiveTagPolicyResult> getEffectiveTagPolicyAsync(GetEffectiveTagPolicyRequest getEffectiveTagPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetEffectiveTagPolicyRequest, GetEffectiveTagPolicyResult> asyncHandler);

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
     * Information about compliance with tag policies. If supplied, the compliance check follows the specified tag
     * policy instead of following the effective tag policy. For more information on tag policies, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     * Information about compliance with tag policies. If supplied, the compliance check follows the specified tag
     * policy instead of following the effective tag policy. For more information on tag policies, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     * Returns all tag keys in the specified Region for the AWS account.
     * </p>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     * Returns all tag keys in the specified Region for the AWS account.
     * </p>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     * Returns the policy that is attached to the specified target.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param getTagPolicyRequest
     * @return A Java Future containing the result of the GetTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.GetTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTagPolicyResult> getTagPolicyAsync(GetTagPolicyRequest getTagPolicyRequest);

    /**
     * <p>
     * Returns the policy that is attached to the specified target.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param getTagPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.GetTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTagPolicyResult> getTagPolicyAsync(GetTagPolicyRequest getTagPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagPolicyRequest, GetTagPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns all tag values for the specified key in the specified Region for the AWS account.
     * </p>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     * Returns all tag values for the specified key in the specified Region for the AWS account.
     * </p>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     * Validates the tag policy and then attaches it to the account or organization root. This policy determines whether
     * a resource is compliant.
     * </p>
     * <p>
     * Validating the tag policy includes checking that the tag policy document includes the required components, uses
     * JSON syntax, and has fewer than 5,000 characters (including spaces). For more information, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-structure.html">Tag Policy Structure</a> in
     * the <i>AWS Resource Groups User Guide.</i>
     * </p>
     * <note>
     * <p>
     * If you later call this operation to attach a tag policy to the same organization root or account, it overwrites
     * the original call without prompting you to confirm.
     * </p>
     * </note>
     * <p>
     * You can call this operation from the organization's master account only, and from the us-east-1 Region only.
     * </p>
     * 
     * @param putTagPolicyRequest
     * @return A Java Future containing the result of the PutTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsync.PutTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/PutTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutTagPolicyResult> putTagPolicyAsync(PutTagPolicyRequest putTagPolicyRequest);

    /**
     * <p>
     * Validates the tag policy and then attaches it to the account or organization root. This policy determines whether
     * a resource is compliant.
     * </p>
     * <p>
     * Validating the tag policy includes checking that the tag policy document includes the required components, uses
     * JSON syntax, and has fewer than 5,000 characters (including spaces). For more information, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-structure.html">Tag Policy Structure</a> in
     * the <i>AWS Resource Groups User Guide.</i>
     * </p>
     * <note>
     * <p>
     * If you later call this operation to attach a tag policy to the same organization root or account, it overwrites
     * the original call without prompting you to confirm.
     * </p>
     * </note>
     * <p>
     * You can call this operation from the organization's master account only, and from the us-east-1 Region only.
     * </p>
     * 
     * @param putTagPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTagPolicy operation returned by the service.
     * @sample AWSResourceGroupsTaggingAPIAsyncHandler.PutTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/PutTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutTagPolicyResult> putTagPolicyAsync(PutTagPolicyRequest putTagPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutTagPolicyRequest, PutTagPolicyResult> asyncHandler);

    /**
     * <p>
     * Generates a report that lists all tagged resources in accounts across your organization, and whether each
     * resource is compliant with the effective tag policy.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
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
     * Generates a report that lists all tagged resources in accounts across your organization, and whether each
     * resource is compliant with the effective tag policy.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
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
     * Not all resources can have tags. For a list of resources that support tagging, see <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html">this list</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     * Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
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
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html">this list</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified Region for the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
     * well as permissions for adding tags. For more information, see <a
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     * Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
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
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     * Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified Region for the AWS account.
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
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     * Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified Region for the AWS account.
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
