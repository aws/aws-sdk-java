/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.config.model.*;

/**
 * Interface for accessing AmazonConfig asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Config <p>
 * AWS Config provides a way to keep track of the configurations of all
 * the AWS resources associated with your AWS account. You can use AWS
 * Config to get the current and historical configurations of each AWS
 * resource and also to get information about the relationship between
 * the resources. An AWS resource can be an Amazon Compute Cloud (Amazon
 * EC2) instance, an Elastic Block Store (EBS) volume, an Elastic network
 * Interface (ENI), or a security group. For a complete list of resources
 * currently supported by AWS Config, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"> Supported AWS Resources </a>
 * .
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management
 * Console, the AWS Command Line Interface (AWS CLI), the AWS Config API,
 * or the AWS SDKs for AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and
 * the AWS CLI commands that you can use to manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing
 * requests. For more information about how to sign a request with this
 * protocol, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a>
 * .
 * </p>
 * <p>
 * For detailed information about AWS Config features and their
 * associated actions or commands, as well as how to work with AWS
 * Management Console, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html"> What Is AWS Config? </a>
 * in the <i>AWS Config Developer Guide</i> .
 * </p>
 */
public interface AmazonConfigAsync extends AmazonConfig {
    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The
     * results indicate which AWS Config rules were used to evaluate the
     * resource, when each rule was last used, and whether the resource
     * complies with each rule.
     * </p>
     *
     * @param getComplianceDetailsByResourceRequest Container for the
     *           necessary parameters to execute the GetComplianceDetailsByResource
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceDetailsByResource service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The
     * results indicate which AWS Config rules were used to evaluate the
     * resource, when each rule was last used, and whether the resource
     * complies with each rule.
     * </p>
     *
     * @param getComplianceDetailsByResourceRequest Container for the
     *           necessary parameters to execute the GetComplianceDetailsByResource
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceDetailsByResource service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest,
            AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS
     * Config. This action is required in every AWS Lambda function that is
     * invoked by an AWS Config rule.
     * </p>
     *
     * @param putEvaluationsRequest Container for the necessary parameters to
     *           execute the PutEvaluations operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         PutEvaluations service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest putEvaluationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS
     * Config. This action is required in every AWS Lambda function that is
     * invoked by an AWS Config rule.
     * </p>
     *
     * @param putEvaluationsRequest Container for the necessary parameters to
     *           execute the PutEvaluations operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutEvaluations service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest putEvaluationsRequest,
            AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and
     * noncompliant, up to a maximum of 25 for each.
     * </p>
     *
     * @param getComplianceSummaryByConfigRuleRequest Container for the
     *           necessary parameters to execute the GetComplianceSummaryByConfigRule
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceSummaryByConfigRule service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and
     * noncompliant, up to a maximum of 25 for each.
     * </p>
     *
     * @param getComplianceSummaryByConfigRuleRequest Container for the
     *           necessary parameters to execute the GetComplianceSummaryByConfigRule
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceSummaryByConfigRule service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest,
            AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of resources that are compliant and the number
     * that are noncompliant. You can specify one or more resource types to
     * get these numbers for each resource type. The maximum number returned
     * is 100.
     * </p>
     *
     * @param getComplianceSummaryByResourceTypeRequest Container for the
     *           necessary parameters to execute the GetComplianceSummaryByResourceType
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceSummaryByResourceType service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of resources that are compliant and the number
     * that are noncompliant. You can specify one or more resource types to
     * get these numbers for each resource type. The maximum number returned
     * is 100.
     * </p>
     *
     * @param getComplianceSummaryByResourceTypeRequest Container for the
     *           necessary parameters to execute the GetComplianceSummaryByResourceType
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceSummaryByResourceType service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest,
            AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a
     * rule is noncompliant, this action returns the number of AWS resources
     * that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it,
     * and it is noncompliant if any of these resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param describeComplianceByConfigRuleRequest Container for the
     *           necessary parameters to execute the DescribeComplianceByConfigRule
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeComplianceByConfigRule service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a
     * rule is noncompliant, this action returns the number of AWS resources
     * that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it,
     * and it is noncompliant if any of these resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param describeComplianceByConfigRuleRequest Container for the
     *           necessary parameters to execute the DescribeComplianceByConfigRule
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeComplianceByConfigRule service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest,
            AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have
     * selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully
     * start the configuration recorder.
     * </p>
     *
     * @param startConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StartConfigurationRecorder operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         StartConfigurationRecorder service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startConfigurationRecorderAsync(StartConfigurationRecorderRequest startConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have
     * selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully
     * start the configuration recorder.
     * </p>
     *
     * @param startConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StartConfigurationRecorder operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartConfigurationRecorder service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startConfigurationRecorderAsync(StartConfigurationRecorderRequest startConfigurationRecorderRequest,
            AsyncHandler<StartConfigurationRecorderRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon
     * SNS topic of the existing delivery channel. To change the Amazon S3
     * bucket or an Amazon SNS topic, call this action and specify the
     * changed values for the S3 bucket and the SNS topic. If you specify a
     * different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param putDeliveryChannelRequest Container for the necessary
     *           parameters to execute the PutDeliveryChannel operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         PutDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putDeliveryChannelAsync(PutDeliveryChannelRequest putDeliveryChannelRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon
     * SNS topic of the existing delivery channel. To change the Amazon S3
     * bucket or an Amazon SNS topic, call this action and specify the
     * changed values for the S3 bucket and the SNS topic. If you specify a
     * different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param putDeliveryChannelRequest Container for the necessary
     *           parameters to execute the PutDeliveryChannel operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putDeliveryChannelAsync(PutDeliveryChannelRequest putDeliveryChannelRequest,
            AsyncHandler<PutDeliveryChannelRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The
     * results indicate which AWS resources were evaluated by the rule, when
     * each resource was last evaluated, and whether each resource complies
     * with the rule.
     * </p>
     *
     * @param getComplianceDetailsByConfigRuleRequest Container for the
     *           necessary parameters to execute the GetComplianceDetailsByConfigRule
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceDetailsByConfigRule service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The
     * results indicate which AWS resources were evaluated by the rule, when
     * each resource was last evaluated, and whether each resource complies
     * with the rule.
     * </p>
     *
     * @param getComplianceDetailsByConfigRuleRequest Container for the
     *           necessary parameters to execute the GetComplianceDetailsByConfigRule
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetComplianceDetailsByConfigRule service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest,
            AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules.
     * The status includes information such as the last time AWS Config
     * invoked the rule, the last time AWS Config failed to invoke the rule,
     * and the related error for the last failure.
     * </p>
     *
     * @param describeConfigRuleEvaluationStatusRequest Container for the
     *           necessary parameters to execute the DescribeConfigRuleEvaluationStatus
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigRuleEvaluationStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules.
     * The status includes information such as the last time AWS Config
     * invoked the rule, the last time AWS Config failed to invoke the rule,
     * and the related error for the last failure.
     * </p>
     *
     * @param describeConfigRuleEvaluationStatusRequest Container for the
     *           necessary parameters to execute the DescribeConfigRuleEvaluationStatus
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigRuleEvaluationStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest,
            AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelsRequest Container for the necessary
     *           parameters to execute the DescribeDeliveryChannels operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannels service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelsRequest Container for the necessary
     *           parameters to execute the DescribeDeliveryChannels operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannels service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest,
            AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelStatusRequest Container for the
     *           necessary parameters to execute the DescribeDeliveryChannelStatus
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannelStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelStatusRequest Container for the
     *           necessary parameters to execute the DescribeDeliveryChannelStatus
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeliveryChannelStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest,
            AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the name of one or more specified configuration recorders. If
     * the recorder name is not specified, this action returns the names of
     * all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecordersRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationRecorders
     *           operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorders service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the name of one or more specified configuration recorders. If
     * the recorder name is not specified, this action returns the names of
     * all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecordersRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationRecorders
     *           operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorders service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest,
            AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS
     * resources comply with your desired configurations.
     * </p>
     * <p>
     * You can use this action for customer managed Config rules and AWS
     * managed Config rules. A customer managed Config rule is a custom rule
     * that you develop and maintain. An AWS managed Config rule is a
     * customizable, predefined rule that is provided by AWS Config.
     * </p>
     * <p>
     * If you are adding a new customer managed Config rule, you must first
     * create the AWS Lambda function that the rule invokes to evaluate your
     * resources. When you use the <code>PutConfigRule</code> action to add
     * the rule to AWS Config, you must specify the Amazon Resource Name
     * (ARN) that AWS Lambda assigns to the function. Specify the ARN for the
     * <code>SourceIdentifier</code> key. This key is part of the
     * <code>Source</code> object, which is part of the
     * <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding a new AWS managed Config rule, specify the rule's
     * identifier for the <code>SourceIdentifier</code> key. To reference AWS
     * managed Config rule identifiers, see
     * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"> Using AWS Managed Config Rules </a>
     * .
     * </p>
     * <p>
     * For any new rule that you add, specify the
     * <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the
     * <code>ConfigRuleId</code> . These values are generated by AWS Config
     * for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you have added previously, specify
     * the rule's <code>ConfigRuleName</code> , <code>ConfigRuleId</code> ,
     * or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type
     * that you use in this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 25.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see
     * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html"> Evaluating AWS Resource Configurations with AWS Config </a>
     * in the <i>AWS Config Developer Guide</i> .
     * </p>
     * <p>
     * 
     * </p>
     *
     * @param putConfigRuleRequest Container for the necessary parameters to
     *           execute the PutConfigRule operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         PutConfigRule service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putConfigRuleAsync(PutConfigRuleRequest putConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS
     * resources comply with your desired configurations.
     * </p>
     * <p>
     * You can use this action for customer managed Config rules and AWS
     * managed Config rules. A customer managed Config rule is a custom rule
     * that you develop and maintain. An AWS managed Config rule is a
     * customizable, predefined rule that is provided by AWS Config.
     * </p>
     * <p>
     * If you are adding a new customer managed Config rule, you must first
     * create the AWS Lambda function that the rule invokes to evaluate your
     * resources. When you use the <code>PutConfigRule</code> action to add
     * the rule to AWS Config, you must specify the Amazon Resource Name
     * (ARN) that AWS Lambda assigns to the function. Specify the ARN for the
     * <code>SourceIdentifier</code> key. This key is part of the
     * <code>Source</code> object, which is part of the
     * <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding a new AWS managed Config rule, specify the rule's
     * identifier for the <code>SourceIdentifier</code> key. To reference AWS
     * managed Config rule identifiers, see
     * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"> Using AWS Managed Config Rules </a>
     * .
     * </p>
     * <p>
     * For any new rule that you add, specify the
     * <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the
     * <code>ConfigRuleId</code> . These values are generated by AWS Config
     * for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you have added previously, specify
     * the rule's <code>ConfigRuleName</code> , <code>ConfigRuleId</code> ,
     * or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type
     * that you use in this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 25.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see
     * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html"> Evaluating AWS Resource Configurations with AWS Config </a>
     * in the <i>AWS Config Developer Guide</i> .
     * </p>
     * <p>
     * 
     * </p>
     *
     * @param putConfigRuleRequest Container for the necessary parameters to
     *           execute the PutConfigRule operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutConfigRule service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putConfigRuleAsync(PutConfigRuleRequest putConfigRuleRequest,
            AsyncHandler<PutConfigRuleRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation
     * results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until
     * the deletion is complete. You cannot update a rule while it is in this
     * state. If you make a <code>PutConfigRule</code> request for the rule,
     * you will receive a <code>ResourceInUseException</code> .
     * </p>
     * <p>
     * You can check the state of a rule by using the
     * <code>DescribeConfigRules</code> request.
     * </p>
     *
     * @param deleteConfigRuleRequest Container for the necessary parameters
     *           to execute the DeleteConfigRule operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConfigRule service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteConfigRuleAsync(DeleteConfigRuleRequest deleteConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation
     * results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until
     * the deletion is complete. You cannot update a rule while it is in this
     * state. If you make a <code>PutConfigRule</code> request for the rule,
     * you will receive a <code>ResourceInUseException</code> .
     * </p>
     * <p>
     * You can check the state of a rule by using the
     * <code>DescribeConfigRules</code> request.
     * </p>
     *
     * @param deleteConfigRuleRequest Container for the necessary parameters
     *           to execute the DeleteConfigRule operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteConfigRule service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteConfigRuleAsync(DeleteConfigRuleRequest deleteConfigRuleRequest,
            AsyncHandler<DeleteConfigRuleRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery
     * channel and the configuration recorder is still running. To delete the
     * delivery channel, stop the running configuration recorder using the
     * StopConfigurationRecorder action.
     * </p>
     *
     * @param deleteDeliveryChannelRequest Container for the necessary
     *           parameters to execute the DeleteDeliveryChannel operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery
     * channel and the configuration recorder is still running. To delete the
     * delivery channel, stop the running configuration recorder using the
     * StopConfigurationRecorder action.
     * </p>
     *
     * @param deleteDeliveryChannelRequest Container for the necessary
     *           parameters to execute the DeleteDeliveryChannel operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDeliveryChannel service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest,
            AsyncHandler<DeleteDeliveryChannelRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     *
     * @param describeConfigRulesRequest Container for the necessary
     *           parameters to execute the DescribeConfigRules operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigRules service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest describeConfigRulesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     *
     * @param describeConfigRulesRequest Container for the necessary
     *           parameters to execute the DescribeConfigRules operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigRules service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest describeConfigRulesRequest,
            AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected
     * to record in your AWS account.
     * </p>
     *
     * @param stopConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StopConfigurationRecorder operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         StopConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopConfigurationRecorderAsync(StopConfigurationRecorderRequest stopConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected
     * to record in your AWS account.
     * </p>
     *
     * @param stopConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StopConfigurationRecorder operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopConfigurationRecorderAsync(StopConfigurationRecorderRequest stopConfigurationRecorderRequest,
            AsyncHandler<StopConfigurationRecorderRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3
     * bucket in the specified delivery channel. After the delivery has
     * started, AWS Config sends following notifications using an Amazon SNS
     * topic that you have specified.
     * </p>
     * 
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was
     * successfully completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to
     * complete.</li>
     * 
     * </ul>
     *
     * @param deliverConfigSnapshotRequest Container for the necessary
     *           parameters to execute the DeliverConfigSnapshot operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DeliverConfigSnapshot service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3
     * bucket in the specified delivery channel. After the delivery has
     * started, AWS Config sends following notifications using an Amazon SNS
     * topic that you have specified.
     * </p>
     * 
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was
     * successfully completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to
     * complete.</li>
     * 
     * </ul>
     *
     * @param deliverConfigSnapshotRequest Container for the necessary
     *           parameters to execute the DeliverConfigSnapshot operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeliverConfigSnapshot service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest,
            AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code>
     * and/or the <code>recordingGroup</code> of an existing recorder. To
     * change the role, call the action on the existing configuration
     * recorder and specify a role.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account. If ConfigurationRecorder does not have the
     * recordingGroup parameter specified, the default is to record all
     * supported resource types.
     * </p>
     *
     * @param putConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the PutConfigurationRecorder operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         PutConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putConfigurationRecorderAsync(PutConfigurationRecorderRequest putConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code>
     * and/or the <code>recordingGroup</code> of an existing recorder. To
     * change the role, call the action on the existing configuration
     * recorder and specify a role.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account. If ConfigurationRecorder does not have the
     * recordingGroup parameter specified, the default is to record all
     * supported resource types.
     * </p>
     *
     * @param putConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the PutConfigurationRecorder operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutConfigurationRecorder service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putConfigurationRecorderAsync(PutConfigurationRecorderRequest putConfigurationRecorderRequest,
            AsyncHandler<PutConfigurationRecorderRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a
     * resource is noncompliant, this action returns the number of AWS Config
     * rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules
     * that evaluate it. It is noncompliant if it does not comply with one or
     * more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions about the rules that evaluate the
     * resource:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param describeComplianceByResourceRequest Container for the necessary
     *           parameters to execute the DescribeComplianceByResource operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeComplianceByResource service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(DescribeComplianceByResourceRequest describeComplianceByResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a
     * resource is noncompliant, this action returns the number of AWS Config
     * rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules
     * that evaluate it. It is noncompliant if it does not comply with one or
     * more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions about the rules that evaluate the
     * resource:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param describeComplianceByResourceRequest Container for the necessary
     *           parameters to execute the DescribeComplianceByResource operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeComplianceByResource service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(DescribeComplianceByResourceRequest describeComplianceByResourceRequest,
            AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval.
     * </p>
     * <p>
     * The response is paginated, and by default, AWS Config returns a limit
     * of 10 configuration items per page. You can customize this number with
     * the <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results,
     * run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> Each call to the API is limited to span a duration of
     * seven days. It is likely that the number of records returned is
     * smaller than the specified limit. In such cases, you can make another
     * call, using the nextToken.
     * </p>
     *
     * @param getResourceConfigHistoryRequest Container for the necessary
     *           parameters to execute the GetResourceConfigHistory operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         GetResourceConfigHistory service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval.
     * </p>
     * <p>
     * The response is paginated, and by default, AWS Config returns a limit
     * of 10 configuration items per page. You can customize this number with
     * the <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results,
     * run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> Each call to the API is limited to span a duration of
     * seven days. It is likely that the number of records returned is
     * smaller than the specified limit. In such cases, you can make another
     * call, using the nextToken.
     * </p>
     *
     * @param getResourceConfigHistoryRequest Container for the necessary
     *           parameters to execute the GetResourceConfigHistory operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetResourceConfigHistory service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest,
            AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers
     * for the resources of that type. A resource identifier includes the
     * resource type, ID, and (if available) the custom resource name. The
     * results consist of resources that AWS Config has discovered, including
     * those that AWS Config is not currently recording. You can narrow the
     * results to include only resources that have specific resource IDs or a
     * resource name.
     * </p>
     * <p>
     * <b>NOTE:</b>You can specify either resource IDs or a resource name
     * but not both in the same request.
     * </p>
     * <p>
     * The response is paginated, and by default AWS Config lists 100
     * resource identifiers on each page. You can customize this number with
     * the <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results,
     * run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     *
     * @param listDiscoveredResourcesRequest Container for the necessary
     *           parameters to execute the ListDiscoveredResources operation on
     *           AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         ListDiscoveredResources service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers
     * for the resources of that type. A resource identifier includes the
     * resource type, ID, and (if available) the custom resource name. The
     * results consist of resources that AWS Config has discovered, including
     * those that AWS Config is not currently recording. You can narrow the
     * results to include only resources that have specific resource IDs or a
     * resource name.
     * </p>
     * <p>
     * <b>NOTE:</b>You can specify either resource IDs or a resource name
     * but not both in the same request.
     * </p>
     * <p>
     * The response is paginated, and by default AWS Config lists 100
     * resource identifiers on each page. You can customize this number with
     * the <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results,
     * run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     *
     * @param listDiscoveredResourcesRequest Container for the necessary
     *           parameters to execute the ListDiscoveredResources operation on
     *           AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDiscoveredResources service method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest,
            AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecorderStatusRequest Container for the
     *           necessary parameters to execute the
     *           DescribeConfigurationRecorderStatus operation on AmazonConfig.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorderStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecorderStatusRequest Container for the
     *           necessary parameters to execute the
     *           DescribeConfigurationRecorderStatus operation on AmazonConfig.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationRecorderStatus service method, as returned by
     *         AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest,
            AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        