/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * </ul>
 * <p>
 * To use resource groups tagging API operations, you must add the following permissions to your IAM policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>tag:GetResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:TagResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:UntagResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:GetTagKeys</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:GetTagValues</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You'll also need permissions to access the resources of individual services so that you can tag and untag those
 * resources.
 * </p>
 * <p>
 * For more information on IAM policies, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage.html">Managing IAM Policies</a> in the
 * <i>IAM User Guide</i>.
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
 * Amazon AppStream
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS AppSync
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS App Mesh
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
 * AWS Backup
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
 * AWS CodeCommit
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodePipeline
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
 * AWS Data Exchange
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
 * AWS DataSync
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Device Farm
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
 * Amazon EKS
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
 * Amazon S3 Glacier
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Glue
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon GuardDuty
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
 * AWS IoT Events
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Greengrass
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT 1-Click
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
 * Amazon Kinesis Data Analytics
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
 * AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Quantum Ledger Database (QLDB)
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
 * AWS Security Hub
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Service Catalog
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Notification Service (SNS)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Queue Service (SQS)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Workflow Service
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
 * AWS Systems Manager
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
     * Describes the status of the <code>StartReportCreation</code> operation.
     * </p>
     * <p>
     * You can call this operation only from the organization's master account and from the us-east-1 Region.
     * </p>
     * 
     * @param describeReportCreationRequest
     * @return Result of the DescribeReportCreation operation returned by the service.
     * @throws ConstraintViolationException
     *         The request was denied because performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must meet the prerequisites for using tag policies. For information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html"
     *         >Prerequisites and Permissions for Using Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must enable the tag policies service principal (<code>tagpolicies.tag.amazonaws.com</code>) to
     *         integrate with AWS Organizations For information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html"
     *         >EnableAWSServiceAccess</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must have a tag policy attached to the organization root, an OU, or an account.
     *         </p>
     *         </li>
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @sample AWSResourceGroupsTaggingAPI.DescribeReportCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DescribeReportCreation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReportCreationResult describeReportCreation(DescribeReportCreationRequest describeReportCreationRequest);

    /**
     * <p>
     * Returns a table that shows counts of resources that are noncompliant with their tag policies.
     * </p>
     * <p>
     * For more information on tag policies, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">Tag
     * Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * You can call this operation only from the organization's master account and from the us-east-1 Region.
     * </p>
     * 
     * @param getComplianceSummaryRequest
     * @return Result of the GetComplianceSummary operation returned by the service.
     * @throws ConstraintViolationException
     *         The request was denied because performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must meet the prerequisites for using tag policies. For information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html"
     *         >Prerequisites and Permissions for Using Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must enable the tag policies service principal (<code>tagpolicies.tag.amazonaws.com</code>) to
     *         integrate with AWS Organizations For information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html"
     *         >EnableAWSServiceAccess</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must have a tag policy attached to the organization root, an OU, or an account.
     *         </p>
     *         </li>
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @sample AWSResourceGroupsTaggingAPI.GetComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetComplianceSummaryResult getComplianceSummary(GetComplianceSummaryRequest getComplianceSummaryRequest);

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
     * <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">Tag
     * Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query is complete. Queries
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
     * 
     * @param getResourcesRequest
     * @return Result of the GetResources operation returned by the service.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
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
     * Returns all tag keys in the specified Region for the AWS account.
     * </p>
     * 
     * @param getTagKeysRequest
     * @return Result of the GetTagKeys operation returned by the service.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
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
     * Returns all tag values for the specified key in the specified Region for the AWS account.
     * </p>
     * 
     * @param getTagValuesRequest
     * @return Result of the GetTagValues operation returned by the service.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
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
     * Generates a report that lists all tagged resources in accounts across your organization and tells whether each
     * resource is compliant with the effective tag policy. Compliance data is refreshed daily.
     * </p>
     * <p>
     * The generated report is saved to the following location:
     * </p>
     * <p>
     * <code>s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv</code>
     * </p>
     * <p>
     * You can call this operation only from the organization's master account and from the us-east-1 Region.
     * </p>
     * 
     * @param startReportCreationRequest
     * @return Result of the StartReportCreation operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied because performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must meet the prerequisites for using tag policies. For information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html"
     *         >Prerequisites and Permissions for Using Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must enable the tag policies service principal (<code>tagpolicies.tag.amazonaws.com</code>) to
     *         integrate with AWS Organizations For information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html"
     *         >EnableAWSServiceAccess</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must have a tag policy attached to the organization root, an OU, or an account.
     *         </p>
     *         </li>
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @sample AWSResourceGroupsTaggingAPI.StartReportCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/StartReportCreation"
     *      target="_top">AWS API Documentation</a>
     */
    StartReportCreationResult startReportCreation(StartReportCreationRequest startReportCreationRequest);

    /**
     * <p>
     * Applies one or more tags to the specified resources. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources can have tags. For a list of services that support tagging, see <a
     * href="http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html">this list</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag Naming and Usage
     * Conventions</a> in the <i>AWS General Reference.</i>
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
     * href="http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html">this list</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourcesRequest
     * @return Result of the TagResources operation returned by the service.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
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
     * href="http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html">this list</a>.
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
     * @return Result of the UntagResources operation returned by the service.
     * @throws InvalidParameterException
     *         This error indicates one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A parameter is missing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A malformed string was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An out-of-range value was supplied for the request parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The target ID is invalid, unsupported, or doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html#bucket-policies-org-report"
     *         >Additional Requirements for Organization-wide Tag Compliance Reports</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     *         </li>
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
