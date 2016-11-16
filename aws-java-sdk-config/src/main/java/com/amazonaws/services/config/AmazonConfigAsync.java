/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config;

import com.amazonaws.services.config.model.*;

/**
 * Interface for accessing Config Service asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.config.AbstractAmazonConfigAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Config</fullname>
 * <p>
 * AWS Config provides a way to keep track of the configurations of all the AWS resources associated with your AWS
 * account. You can use AWS Config to get the current and historical configurations of each AWS resource and also to get
 * information about the relationship between the resources. An AWS resource can be an Amazon Compute Cloud (Amazon EC2)
 * instance, an Elastic Block Store (EBS) volume, an Elastic network Interface (ENI), or a security group. For a
 * complete list of resources currently supported by AWS Config, see <a
 * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported AWS Resources</a>.
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management Console, the AWS Command Line Interface (AWS CLI),
 * the AWS Config API, or the AWS SDKs for AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and the AWS CLI commands that you can use to
 * manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing requests. For more information about how to sign
 * a request with this protocol, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * For detailed information about AWS Config features and their associated actions or commands, as well as how to work
 * with AWS Management Console, see <a
 * href="http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html">What Is AWS Config?</a> in the
 * <i>AWS Config Developer Guide</i>.
 * </p>
 */
public interface AmazonConfigAsync extends AmazonConfig {

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until the deletion is complete. You cannot update a
     * rule while it is in this state. If you make a <code>PutConfigRule</code> or <code>DeleteConfigRule</code> request
     * for the rule, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @return A Java Future containing the result of the DeleteConfigRule operation returned by the service.
     * @sample AmazonConfigAsync.DeleteConfigRule
     */
    java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest deleteConfigRuleRequest);

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until the deletion is complete. You cannot update a
     * rule while it is in this state. If you make a <code>PutConfigRule</code> or <code>DeleteConfigRule</code> request
     * for the rule, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigRule operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteConfigRule
     */
    java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest deleteConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigRuleRequest, DeleteConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the configuration recorder.
     * </p>
     * <p>
     * After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
     * create a new configuration recorder.
     * </p>
     * <p>
     * This action does not delete the configuration information that was previously recorded. You will be able to
     * access the previously recorded information by using the <code>GetResourceConfigHistory</code> action, but you
     * will not be able to access this information in the AWS Config console until you create a new configuration
     * recorder.
     * </p>
     * 
     * @param deleteConfigurationRecorderRequest
     *        The request object for the <code>DeleteConfigurationRecorder</code> action.
     * @return A Java Future containing the result of the DeleteConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.DeleteConfigurationRecorder
     */
    java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(
            DeleteConfigurationRecorderRequest deleteConfigurationRecorderRequest);

    /**
     * <p>
     * Deletes the configuration recorder.
     * </p>
     * <p>
     * After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
     * create a new configuration recorder.
     * </p>
     * <p>
     * This action does not delete the configuration information that was previously recorded. You will be able to
     * access the previously recorded information by using the <code>GetResourceConfigHistory</code> action, but you
     * will not be able to access this information in the AWS Config console until you create a new configuration
     * recorder.
     * </p>
     * 
     * @param deleteConfigurationRecorderRequest
     *        The request object for the <code>DeleteConfigurationRecorder</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteConfigurationRecorder
     */
    java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(
            DeleteConfigurationRecorderRequest deleteConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationRecorderRequest, DeleteConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Deletes the delivery channel.
     * </p>
     * <p>
     * Before you can delete the delivery channel, you must stop the configuration recorder by using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data in JSON
     *        format.
     * @return A Java Future containing the result of the DeleteDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsync.DeleteDeliveryChannel
     */
    java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest);

    /**
     * <p>
     * Deletes the delivery channel.
     * </p>
     * <p>
     * Before you can delete the delivery channel, you must stop the configuration recorder by using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data in JSON
     *        format.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteDeliveryChannel
     */
    java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryChannelRequest, DeleteDeliveryChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes the evaluation results for the specified Config rule. You can specify one Config rule per request. After
     * you delete the evaluation results, you can call the <a>StartConfigRulesEvaluation</a> API to start evaluating
     * your AWS resources against the rule.
     * </p>
     * 
     * @param deleteEvaluationResultsRequest
     * @return A Java Future containing the result of the DeleteEvaluationResults operation returned by the service.
     * @sample AmazonConfigAsync.DeleteEvaluationResults
     */
    java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest deleteEvaluationResultsRequest);

    /**
     * <p>
     * Deletes the evaluation results for the specified Config rule. You can specify one Config rule per request. After
     * you delete the evaluation results, you can call the <a>StartConfigRulesEvaluation</a> API to start evaluating
     * your AWS resources against the rule.
     * </p>
     * 
     * @param deleteEvaluationResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEvaluationResults operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteEvaluationResults
     */
    java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest deleteEvaluationResultsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEvaluationResultsRequest, DeleteEvaluationResultsResult> asyncHandler);

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
     * the delivery has started, AWS Config sends following notifications using an Amazon SNS topic that you have
     * specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Notification of starting the delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery completed, if the delivery was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery failure, if the delivery failed to complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @return A Java Future containing the result of the DeliverConfigSnapshot operation returned by the service.
     * @sample AmazonConfigAsync.DeliverConfigSnapshot
     */
    java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest);

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
     * the delivery has started, AWS Config sends following notifications using an Amazon SNS topic that you have
     * specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Notification of starting the delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery completed, if the delivery was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery failure, if the delivery failed to complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeliverConfigSnapshot operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeliverConfigSnapshot
     */
    java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler);

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns
     * the number of AWS resources that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it, and it is noncompliant if any of these
     * resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @return A Java Future containing the result of the DescribeComplianceByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeComplianceByConfigRule
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest);

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns
     * the number of AWS resources that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it, and it is noncompliant if any of these
     * resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComplianceByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeComplianceByConfigRule
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest)
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync();

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation with an AsyncHandler.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns
     * the number of AWS Config rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it
     * does not comply with one or more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions about the rules that evaluate the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByResourceRequest
     * @return A Java Future containing the result of the DescribeComplianceByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeComplianceByResource
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest describeComplianceByResourceRequest);

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns
     * the number of AWS Config rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it
     * does not comply with one or more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions about the rules that evaluate the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComplianceByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeComplianceByResource
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest describeComplianceByResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest)
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync();

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation with an AsyncHandler.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler);

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules. The status includes information such as the
     * last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
     * for the last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @return A Java Future containing the result of the DescribeConfigRuleEvaluationStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigRuleEvaluationStatus
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest);

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules. The status includes information such as the
     * last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
     * for the last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigRuleEvaluationStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigRuleEvaluationStatus
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest)
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync();

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation with an AsyncHandler.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler);

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @return A Java Future containing the result of the DescribeConfigRules operation returned by the service.
     * @sample AmazonConfigAsync.DescribeConfigRules
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest describeConfigRulesRequest);

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigRules operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigRules
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest describeConfigRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest)
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync();

    /**
     * Simplified method form for invoking the DescribeConfigRules operation with an AsyncHandler.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
     * this action returns the status of all configuration recorder associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a> action.
     * @return A Java Future containing the result of the DescribeConfigurationRecorderStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigurationRecorderStatus
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest);

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
     * this action returns the status of all configuration recorder associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationRecorderStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigurationRecorderStatus
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest)
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync();

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
     * this action returns the details for all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @return A Java Future containing the result of the DescribeConfigurationRecorders operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigurationRecorders
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest);

    /**
     * <p>
     * Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
     * this action returns the details for all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationRecorders operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigurationRecorders
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest)
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync();

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
     * returns the current status of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @return A Java Future containing the result of the DescribeDeliveryChannelStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeDeliveryChannelStatus
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest);

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
     * returns the current status of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeliveryChannelStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeDeliveryChannelStatus
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync();

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler);

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
     * the details of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @return A Java Future containing the result of the DescribeDeliveryChannels operation returned by the service.
     * @sample AmazonConfigAsync.DescribeDeliveryChannels
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest);

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
     * the details of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeliveryChannels operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeDeliveryChannels
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync();

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
     * evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @return A Java Future containing the result of the GetComplianceDetailsByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceDetailsByConfigRule
     */
    java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
     * evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceDetailsByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceDetailsByConfigRule
     */
    java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
     * used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @return A Java Future containing the result of the GetComplianceDetailsByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceDetailsByResource
     */
    java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
     * used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceDetailsByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceDetailsByResource
     */
    java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler);

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @return A Java Future containing the result of the GetComplianceSummaryByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceSummaryByConfigRule
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest);

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceSummaryByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceSummaryByConfigRule
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest)
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync();

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
     * more resource types to get these numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @return A Java Future containing the result of the GetComplianceSummaryByResourceType operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceSummaryByResourceType
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest);

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
     * more resource types to get these numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceSummaryByResourceType operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceSummaryByResourceType
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest)
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync();

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler);

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The list contains details about each state of
     * the resource during the specified time interval.
     * </p>
     * <p>
     * The response is paginated, and by default, AWS Config returns a limit of 10 configuration items per page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string, and to get the next page of results, run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is likely that the number of records
     * returned is smaller than the specified <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @return A Java Future containing the result of the GetResourceConfigHistory operation returned by the service.
     * @sample AmazonConfigAsync.GetResourceConfigHistory
     */
    java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest);

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The list contains details about each state of
     * the resource during the specified time interval.
     * </p>
     * <p>
     * The response is paginated, and by default, AWS Config returns a limit of 10 configuration items per page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string, and to get the next page of results, run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is likely that the number of records
     * returned is smaller than the specified <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceConfigHistory operation returned by the service.
     * @sample AmazonConfigAsyncHandler.GetResourceConfigHistory
     */
    java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
     * identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
     * resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
     * narrow the results to include only resources that have specific resource IDs or a resource name.
     * </p>
     * <note>
     * <p>
     * You can specify either resource IDs or a resource name but not both in the same request.
     * </p>
     * </note>
     * <p>
     * The response is paginated, and by default AWS Config lists 100 resource identifiers on each page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string, and to get the next page of results, run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AmazonConfigAsync.ListDiscoveredResources
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
     * identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
     * resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
     * narrow the results to include only resources that have specific resource IDs or a resource name.
     * </p>
     * <note>
     * <p>
     * You can specify either resource IDs or a resource name but not both in the same request.
     * </p>
     * </note>
     * <p>
     * The response is paginated, and by default AWS Config lists 100 resource identifiers on each page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string, and to get the next page of results, run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AmazonConfigAsyncHandler.ListDiscoveredResources
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler);

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired
     * configurations.
     * </p>
     * <p>
     * You can use this action for custom Config rules and AWS managed Config rules. A custom Config rule is a rule that
     * you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides.
     * </p>
     * <p>
     * If you are adding a new custom Config rule, you must first create the AWS Lambda function that the rule invokes
     * to evaluate your resources. When you use the <code>PutConfigRule</code> action to add the rule to AWS Config, you
     * must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the
     * <code>SourceIdentifier</code> key. This key is part of the <code>Source</code> object, which is part of the
     * <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding a new AWS managed Config rule, specify the rule's identifier for the
     * <code>SourceIdentifier</code> key. To reference AWS managed Config rule identifiers, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values are generated by AWS
     * Config for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you added previously, you can specify the rule by <code>ConfigRuleName</code>,
     * <code>ConfigRuleId</code>, or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that you use in
     * this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 25.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource
     * Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.
     * </p>
     * 
     * @param putConfigRuleRequest
     * @return A Java Future containing the result of the PutConfigRule operation returned by the service.
     * @sample AmazonConfigAsync.PutConfigRule
     */
    java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest putConfigRuleRequest);

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired
     * configurations.
     * </p>
     * <p>
     * You can use this action for custom Config rules and AWS managed Config rules. A custom Config rule is a rule that
     * you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides.
     * </p>
     * <p>
     * If you are adding a new custom Config rule, you must first create the AWS Lambda function that the rule invokes
     * to evaluate your resources. When you use the <code>PutConfigRule</code> action to add the rule to AWS Config, you
     * must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the
     * <code>SourceIdentifier</code> key. This key is part of the <code>Source</code> object, which is part of the
     * <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding a new AWS managed Config rule, specify the rule's identifier for the
     * <code>SourceIdentifier</code> key. To reference AWS managed Config rule identifiers, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values are generated by AWS
     * Config for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you added previously, you can specify the rule by <code>ConfigRuleName</code>,
     * <code>ConfigRuleId</code>, or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that you use in
     * this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 25.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource
     * Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.
     * </p>
     * 
     * @param putConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigRule operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutConfigRule
     */
    java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest putConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigRuleRequest, PutConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> and/or the <code>recordingGroup</code> of an
     * existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the <b>recordingGroup</b> parameter specified, the default is
     * to record all supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @return A Java Future containing the result of the PutConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.PutConfigurationRecorder
     */
    java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest putConfigurationRecorderRequest);

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> and/or the <code>recordingGroup</code> of an
     * existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the <b>recordingGroup</b> parameter specified, the default is
     * to record all supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutConfigurationRecorder
     */
    java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest putConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationRecorderRequest, PutConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
     * topic.
     * </p>
     * <p>
     * Before you can create a delivery channel, you must create a configuration recorder.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
     * To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
     * bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * You can have only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @return A Java Future containing the result of the PutDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsync.PutDeliveryChannel
     */
    java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest putDeliveryChannelRequest);

    /**
     * <p>
     * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
     * topic.
     * </p>
     * <p>
     * Before you can create a delivery channel, you must create a configuration recorder.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
     * To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
     * bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * You can have only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutDeliveryChannel
     */
    java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest putDeliveryChannelRequest,
            com.amazonaws.handlers.AsyncHandler<PutDeliveryChannelRequest, PutDeliveryChannelResult> asyncHandler);

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
     * Lambda function that is invoked by an AWS Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @return A Java Future containing the result of the PutEvaluations operation returned by the service.
     * @sample AmazonConfigAsync.PutEvaluations
     */
    java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest putEvaluationsRequest);

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
     * Lambda function that is invoked by an AWS Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvaluations operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutEvaluations
     */
    java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest putEvaluationsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler);

    /**
     * <p>
     * Evaluates your resources against the specified Config rules. You can specify up to 25 Config rules per request.
     * </p>
     * <p>
     * An existing <a>StartConfigRulesEvaluation</a> call must complete for the specified rules before you can call the
     * API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a
     * <code>ConfigRuleEvaluationStarted</code> notification when the evaluation starts.
     * </p>
     * <note>
     * <p>
     * You don't need to call the <code>StartConfigRulesEvaluation</code> API to run an evaluation for a new rule. When
     * you create a new rule, AWS Config automatically evaluates your resources against the rule.
     * </p>
     * </note>
     * <p>
     * The <code>StartConfigRulesEvaluation</code> API is useful if you want to run on-demand evaluations, such as the
     * following example:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You have a custom rule that evaluates your IAM resources every 24 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You update your Lambda function to add additional conditions to your rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Instead of waiting for the next periodic evaluation, you call the <code>StartConfigRulesEvaluation</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config invokes your Lambda function and evaluates your IAM resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule will still run periodic evaluations every 24 hours.
     * </p>
     * </li>
     * </ol>
     * 
     * @param startConfigRulesEvaluationRequest
     * @return A Java Future containing the result of the StartConfigRulesEvaluation operation returned by the service.
     * @sample AmazonConfigAsync.StartConfigRulesEvaluation
     */
    java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(
            StartConfigRulesEvaluationRequest startConfigRulesEvaluationRequest);

    /**
     * <p>
     * Evaluates your resources against the specified Config rules. You can specify up to 25 Config rules per request.
     * </p>
     * <p>
     * An existing <a>StartConfigRulesEvaluation</a> call must complete for the specified rules before you can call the
     * API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a
     * <code>ConfigRuleEvaluationStarted</code> notification when the evaluation starts.
     * </p>
     * <note>
     * <p>
     * You don't need to call the <code>StartConfigRulesEvaluation</code> API to run an evaluation for a new rule. When
     * you create a new rule, AWS Config automatically evaluates your resources against the rule.
     * </p>
     * </note>
     * <p>
     * The <code>StartConfigRulesEvaluation</code> API is useful if you want to run on-demand evaluations, such as the
     * following example:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You have a custom rule that evaluates your IAM resources every 24 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You update your Lambda function to add additional conditions to your rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Instead of waiting for the next periodic evaluation, you call the <code>StartConfigRulesEvaluation</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config invokes your Lambda function and evaluates your IAM resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule will still run periodic evaluations every 24 hours.
     * </p>
     * </li>
     * </ol>
     * 
     * @param startConfigRulesEvaluationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigRulesEvaluation operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StartConfigRulesEvaluation
     */
    java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(
            StartConfigRulesEvaluationRequest startConfigRulesEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigRulesEvaluationRequest, StartConfigRulesEvaluationResult> asyncHandler);

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @return A Java Future containing the result of the StartConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.StartConfigurationRecorder
     */
    java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest startConfigurationRecorderRequest);

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StartConfigurationRecorder
     */
    java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest startConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationRecorderRequest, StartConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        The input for the <a>StopConfigurationRecorder</a> action.
     * @return A Java Future containing the result of the StopConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.StopConfigurationRecorder
     */
    java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest stopConfigurationRecorderRequest);

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        The input for the <a>StopConfigurationRecorder</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StopConfigurationRecorder
     */
    java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest stopConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<StopConfigurationRecorderRequest, StopConfigurationRecorderResult> asyncHandler);

}
