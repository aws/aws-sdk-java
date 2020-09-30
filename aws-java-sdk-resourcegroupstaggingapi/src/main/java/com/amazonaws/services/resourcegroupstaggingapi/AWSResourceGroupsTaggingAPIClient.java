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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;
import com.amazonaws.services.resourcegroupstaggingapi.model.transform.*;

/**
 * Client for accessing AWS Resource Groups Tagging API. All service calls made using this client are blocking, and will
 * not return until the service call completes.
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
 * <important>
 * <p>
 * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use
 * tags to provide you with billing and administration services. Tags are not intended to be used for private or
 * sensitive data.
 * </p>
 * </important>
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
 * <i> <b>Services that support the Resource Groups Tagging API</b> </i>
 * </p>
 * <p>
 * You can use the Resource Groups Tagging API to tag resources for the following AWS services.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/a4b">Alexa for Business (a4b)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/apigateway">API Gateway</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appstream2">Amazon AppStream</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appsync">AWS AppSync</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/app-mesh">AWS App Mesh</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/athena">Amazon Athena</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide">Amazon Aurora</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/aws-backup">AWS Backup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/acm">AWS Certificate Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/acm">AWS Certificate Manager Private CA</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/clouddirectory">Amazon Cloud Directory</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloud-map">AWS Cloud Map</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudformation">AWS CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudfront">Amazon CloudFront</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudhsm">AWS CloudHSM</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudtrail">AWS CloudTrail</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch">Amazon CloudWatch (alarms only)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch/?id=docs_gateway#amazon-cloudwatch-events">Amazon CloudWatch
 * Events</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch/?id=docs_gateway#amazon-cloudwatch-logs">Amazon CloudWatch Logs</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch">Amazon Cloudwatch Synthetics</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codebuild">AWS CodeBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codecommit">AWS CodeCommit</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-ug/">AWS CodeGuru Profiler</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codepipeline">AWS CodePipeline</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codestar">AWS CodeStar</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/">AWS CodeStar Connections</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cognito">Amazon Cognito Identity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cognito">Amazon Cognito User Pools</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/comprehend">Amazon Comprehend</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/config">AWS Config</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/connect/resources/?whats-new-cards#Documentation">Amazon Connect</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/data-exchange">AWS Data Exchange</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/data-pipeline">AWS Data Pipeline</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/dms">AWS Database Migration Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/datasync">AWS DataSync</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/devicefarm">AWS Device Farm</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/directconnect">AWS Direct Connect</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/directory-service">AWS Directory Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/dynamodb">Amazon DynamoDB</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ebs">Amazon EBS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ec2">Amazon EC2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/imagebuilder">EC2 Image Builder</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ecr">Amazon ECR</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ecs">Amazon ECS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/eks">Amazon EKS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elastic-beanstalk">AWS Elastic Beanstalk</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/efs">Amazon Elastic File System</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elasticloadbalancing">Elastic Load Balancing</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elastic-inference">Amazon Elastic Inference</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elasticache">Amazon ElastiCache</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elasticsearch-service">Amazon Elasticsearch Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/medialive">AWS Elemental MediaLive</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mediapackage">AWS Elemental MediaPackage</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mediapackage">AWS Elemental MediaPackage VoD</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mediatailor">AWS Elemental MediaTailor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/emr">Amazon EMR</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/eventbridge">Amazon EventBridge Schema</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/firewall-manager">AWS Firewall Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/forecast">Amazon Forecast</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/frauddetector">Amazon Fraud Detector</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/fsx">Amazon FSx</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/s3/?id=docs_gateway#amazon-s3-glacier">Amazon S3 Glacier</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/global-accelerator">AWS Global Accelerator</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ground-station">AWS Ground Station</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/glue">AWS Glue</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/guardduty">Amazon GuardDuty</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/inspector">Amazon Inspector</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ivs">Amazon Interactive Video Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotanalytics">AWS IoT Analytics</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot">AWS IoT Core</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-device-defender">AWS IoT Device Defender</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-device-management">AWS IoT Device Management</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents">AWS IoT Events</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/greengrass">AWS IoT Greengrass</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-1-click">AWS IoT 1-Click</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-sitewise">AWS IoT Sitewise</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/thingsgraph">AWS IoT Things Graph</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kendra">Amazon Kendra</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kms">AWS Key Management Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kinesis">Amazon Kinesis</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kinesis/?id=docs_gateway#amazon-kinesis-data-analytics">Amazon Kinesis Data
 * Analytics</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kinesis/?id=docs_gateway#amazon-kinesis-data-firehose">Amazon Kinesis Data
 * Firehose</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/lambda">AWS Lambda</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/lex">Amazon Lex</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/license-manager">AWS License Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/lightsail">Amazon Lightsail</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/macie">Amazon Macie</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/machine-learning">Amazon Machine Learning</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/amazon-mq">Amazon MQ</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/msk">Amazon MSK</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/msk">Amazon MSK</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/neptune">Amazon Neptune</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/vpc/latest/tgw/what-is-network-manager.html">AWS Network Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/opsworks">AWS OpsWorks</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/opsworks">AWS OpsWorks CM</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/organizations">AWS Organizations</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/pinpoint">Amazon Pinpoint</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/qldb">Amazon Quantum Ledger Database (QLDB)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rds">Amazon RDS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/redshift">Amazon Redshift</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ram">AWS Resource Access Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ARG">AWS Resource Groups</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/robomaker">AWS RoboMaker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/route53">Amazon Route 53</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/route53">Amazon Route 53 Resolver</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/s3">Amazon S3 (buckets only)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker">Amazon SageMaker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/savingsplans">Savings Plans</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/secretsmanager">AWS Secrets Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/securityhub">AWS Security Hub</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/servicecatalog">AWS Service Catalog</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ses">Amazon Simple Email Service (SES)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sns">Amazon Simple Notification Service (SNS)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sqs">Amazon Simple Queue Service (SQS)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/swf">Amazon Simple Workflow Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/step-functions">AWS Step Functions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway">AWS Storage Gateway</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/systems-manager">AWS Systems Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/transfer">AWS Transfer for SFTP</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/vpc">Amazon VPC</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/waf">AWS WAF</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/waf">AWS WAF Regional</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/worklink">Amazon WorkLink</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/workspaces">Amazon WorkSpaces</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceGroupsTaggingAPIClient extends AmazonWebServiceClient implements AWSResourceGroupsTaggingAPI {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSResourceGroupsTaggingAPI.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "tagging";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConstraintViolationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.transform.ConstraintViolationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.transform.ThrottledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.transform.InternalServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PaginationTokenExpiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.transform.PaginationTokenExpiredExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.resourcegroupstaggingapi.model.AWSResourceGroupsTaggingAPIException.class));

    public static AWSResourceGroupsTaggingAPIClientBuilder builder() {
        return AWSResourceGroupsTaggingAPIClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resource Groups Tagging API using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsTaggingAPIClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resource Groups Tagging API using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsTaggingAPIClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("tagging.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/resourcegroupstaggingapi/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/resourcegroupstaggingapi/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public DescribeReportCreationResult describeReportCreation(DescribeReportCreationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReportCreation(request);
    }

    @SdkInternalApi
    final DescribeReportCreationResult executeDescribeReportCreation(DescribeReportCreationRequest describeReportCreationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReportCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReportCreationRequest> request = null;
        Response<DescribeReportCreationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReportCreationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReportCreationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReportCreation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReportCreationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReportCreationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetComplianceSummaryResult getComplianceSummary(GetComplianceSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetComplianceSummary(request);
    }

    @SdkInternalApi
    final GetComplianceSummaryResult executeGetComplianceSummary(GetComplianceSummaryRequest getComplianceSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getComplianceSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceSummaryRequest> request = null;
        Response<GetComplianceSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComplianceSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComplianceSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComplianceSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComplianceSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetResourcesResult getResources(GetResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetResources(request);
    }

    @SdkInternalApi
    final GetResourcesResult executeGetResources(GetResourcesRequest getResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTagKeysResult getTagKeys(GetTagKeysRequest request) {
        request = beforeClientExecution(request);
        return executeGetTagKeys(request);
    }

    @SdkInternalApi
    final GetTagKeysResult executeGetTagKeys(GetTagKeysRequest getTagKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagKeysRequest> request = null;
        Response<GetTagKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTagKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagKeysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTagValuesResult getTagValues(GetTagValuesRequest request) {
        request = beforeClientExecution(request);
        return executeGetTagValues(request);
    }

    @SdkInternalApi
    final GetTagValuesResult executeGetTagValues(GetTagValuesRequest getTagValuesRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagValuesRequest> request = null;
        Response<GetTagValuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagValuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagValuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTagValues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagValuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagValuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartReportCreationResult startReportCreation(StartReportCreationRequest request) {
        request = beforeClientExecution(request);
        return executeStartReportCreation(request);
    }

    @SdkInternalApi
    final StartReportCreationResult executeStartReportCreation(StartReportCreationRequest startReportCreationRequest) {

        ExecutionContext executionContext = createExecutionContext(startReportCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReportCreationRequest> request = null;
        Response<StartReportCreationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReportCreationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReportCreationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReportCreation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReportCreationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartReportCreationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * <important>
     * <p>
     * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We
     * use tags to provide you with billing and administration services. Tags are not intended to be used for private or
     * sensitive data.
     * </p>
     * </important>
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
    @Override
    public TagResourcesResult tagResources(TagResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeTagResources(request);
    }

    @SdkInternalApi
    final TagResourcesResult executeTagResources(TagResourcesRequest tagResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourcesRequest> request = null;
        Response<TagResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UntagResourcesResult untagResources(UntagResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResources(request);
    }

    @SdkInternalApi
    final UntagResourcesResult executeUntagResources(UntagResourcesRequest untagResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourcesRequest> request = null;
        Response<UntagResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
