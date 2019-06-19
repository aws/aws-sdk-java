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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConstraintViolationException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.ConstraintViolationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.ThrottledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PaginationTokenExpiredException").withModeledClass(
                                    com.amazonaws.services.resourcegroupstaggingapi.model.PaginationTokenExpiredException.class))
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
     * Deletes the policy that is attached to the specified organization root or account.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param deleteTagPolicyRequest
     * @return Result of the DeleteTagPolicy operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
     *         </p>
     *         </li>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.DeleteTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DeleteTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTagPolicyResult deleteTagPolicy(DeleteTagPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTagPolicy(request);
    }

    @SdkInternalApi
    final DeleteTagPolicyResult executeDeleteTagPolicy(DeleteTagPolicyRequest deleteTagPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagPolicyRequest> request = null;
        Response<DeleteTagPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTagPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the status of the <code>StartReportCreation</code> operation.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param describeReportCreationRequest
     * @return Result of the DescribeReportCreation operation returned by the service.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     * @return Result of the DisableTagPolicies operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
     *         </p>
     *         </li>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.DisableTagPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/DisableTagPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableTagPoliciesResult disableTagPolicies(DisableTagPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDisableTagPolicies(request);
    }

    @SdkInternalApi
    final DisableTagPoliciesResult executeDisableTagPolicies(DisableTagPoliciesRequest disableTagPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(disableTagPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableTagPoliciesRequest> request = null;
        Response<DisableTagPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableTagPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableTagPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableTagPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableTagPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableTagPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the EnableTagPolicies operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
     *         </p>
     *         </li>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.EnableTagPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/EnableTagPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableTagPoliciesResult enableTagPolicies(EnableTagPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeEnableTagPolicies(request);
    }

    @SdkInternalApi
    final EnableTagPoliciesResult executeEnableTagPolicies(EnableTagPoliciesRequest enableTagPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(enableTagPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableTagPoliciesRequest> request = null;
        Response<EnableTagPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableTagPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableTagPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableTagPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableTagPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableTagPoliciesResultJsonUnmarshaller());
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
     * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies.html">Tag Policies</a> in the <i>AWS Resource
     * Groups User Guide.</i>
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param getComplianceSummaryRequest
     * @return Result of the GetComplianceSummary operation returned by the service.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     * @return Result of the GetEffectiveTagPolicy operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
     *         </p>
     *         </li>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.GetEffectiveTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetEffectiveTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEffectiveTagPolicyResult getEffectiveTagPolicy(GetEffectiveTagPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetEffectiveTagPolicy(request);
    }

    @SdkInternalApi
    final GetEffectiveTagPolicyResult executeGetEffectiveTagPolicy(GetEffectiveTagPolicyRequest getEffectiveTagPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getEffectiveTagPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEffectiveTagPolicyRequest> request = null;
        Response<GetEffectiveTagPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEffectiveTagPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEffectiveTagPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEffectiveTagPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEffectiveTagPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetEffectiveTagPolicyResultJsonUnmarshaller());
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     * Returns the policy that is attached to the specified target.
     * </p>
     * <p>
     * You can call this operation from the organization's master account only and from the us-east-1 Region only.
     * </p>
     * 
     * @param getTagPolicyRequest
     * @return Result of the GetTagPolicy operation returned by the service.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
     *         </p>
     *         </li>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.GetTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTagPolicyResult getTagPolicy(GetTagPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetTagPolicy(request);
    }

    @SdkInternalApi
    final GetTagPolicyResult executeGetTagPolicy(GetTagPolicyRequest getTagPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagPolicyRequest> request = null;
        Response<GetTagPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTagPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagPolicyResultJsonUnmarshaller());
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
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to determine if a query completed. Queries can
     * occasionally return fewer results on a page than allowed. The <code>PaginationToken</code> response parameter
     * value is <code>null</code> <i>only</i> when there are no more results to display.
     * </p>
     * </note>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     * @return Result of the PutTagPolicy operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
     *         </p>
     *         </li>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
     *         </p>
     *         </li>
     * @throws ThrottledException
     *         The request was denied to limit the frequency of submitted requests.
     * @throws InternalServiceException
     *         The request processing failed because of an unknown error, exception, or failure. You can retry the
     *         request.
     * @sample AWSResourceGroupsTaggingAPI.PutTagPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/PutTagPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutTagPolicyResult putTagPolicy(PutTagPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutTagPolicy(request);
    }

    @SdkInternalApi
    final PutTagPolicyResult executePutTagPolicy(PutTagPolicyRequest putTagPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putTagPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutTagPolicyRequest> request = null;
        Response<PutTagPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutTagPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putTagPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Resource Groups Tagging API");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutTagPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutTagPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutTagPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the StartReportCreation operation returned by the service.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         The request was denied as performing this operation violates a constraint. </p>
     *         <p>
     *         Some of the reasons in the following list might not apply to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
     *         href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
     *         Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The previous report expired.
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
     *         There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't access the Amazon S3 bucket for report storage. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report"
     *         >Additional Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource
     *         Groups User Guide.</i>
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
