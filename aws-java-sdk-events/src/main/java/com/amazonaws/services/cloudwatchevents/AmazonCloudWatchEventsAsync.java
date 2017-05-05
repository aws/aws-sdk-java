/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;

/**
 * Interface for accessing Amazon CloudWatch Events asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatchevents.AbstractAmazonCloudWatchEventsAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon CloudWatch Events helps you to respond to state changes in your AWS resources. When your resources change
 * state, they automatically send events into an event stream. You can create rules that match selected events in the
 * stream and route them to targets to take action. You can also use rules to take action on a pre-determined schedule.
 * For example, you can configure rules to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance
 * enters the running state.
 * </p>
 * </li>
 * <li>
 * <p>
 * Direct specific API records from CloudTrail to an Amazon Kinesis stream for detailed analysis of potential security
 * or availability risks.
 * </p>
 * </li>
 * <li>
 * <p>
 * Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about the features of Amazon CloudWatch Events, see the <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events">Amazon CloudWatch Events User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudWatchEventsAsync extends AmazonCloudWatchEvents {

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * You must remove all targets from a rule using <a>RemoveTargets</a> before you can delete the rule.
     * </p>
     * <p>
     * When you delete a rule, incoming events might continue to match to the deleted rule. Please allow a short period
     * of time for changes to take effect.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * You must remove all targets from a rule using <a>RemoveTargets</a> before you can delete the rule.
     * </p>
     * <p>
     * When you delete a rule, incoming events might continue to match to the deleted rule. Please allow a short period
     * of time for changes to take effect.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Describes the specified rule.
     * </p>
     * 
     * @param describeRuleRequest
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest);

    /**
     * <p>
     * Describes the specified rule.
     * </p>
     * 
     * @param describeRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler);

    /**
     * <p>
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule
     * expression.
     * </p>
     * <p>
     * When you disable a rule, incoming events might continue to match to the disabled rule. Please allow a short
     * period of time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     * @return A Java Future containing the result of the DisableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.DisableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DisableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest disableRuleRequest);

    /**
     * <p>
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule
     * expression.
     * </p>
     * <p>
     * When you disable a rule, incoming events might continue to match to the disabled rule. Please allow a short
     * period of time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.DisableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DisableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest disableRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler);

    /**
     * <p>
     * Enables the specified rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     * @return A Java Future containing the result of the EnableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.EnableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/EnableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest enableRuleRequest);

    /**
     * <p>
     * Enables the specified rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.EnableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/EnableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest enableRuleRequest,
            com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler);

    /**
     * <p>
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a
     * specific target in your account.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     * @return A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.ListRuleNamesByTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRuleNamesByTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest);

    /**
     * <p>
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a
     * specific target in your account.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.ListRuleNamesByTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRuleNamesByTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler);

    /**
     * <p>
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match
     * to the rule names.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match
     * to the rule names.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the targets assigned to the specified rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     * @return A Java Future containing the result of the ListTargetsByRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.ListTargetsByRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListTargetsByRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest listTargetsByRuleRequest);

    /**
     * <p>
     * Lists the targets assigned to the specified rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetsByRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.ListTargetsByRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListTargetsByRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest listTargetsByRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler);

    /**
     * <p>
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
     * Please allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as
     * on a schedule.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch
     * Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating
     * event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param putRuleRequest
     * @return A Java Future containing the result of the PutRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.PutRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest putRuleRequest);

    /**
     * <p>
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
     * Please allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as
     * on a schedule.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch
     * Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating
     * event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param putRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.PutRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest putRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler);

    /**
     * <p>
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the
     * rule.
     * </p>
     * <p>
     * Targets are the resources that are invoked when a rule is triggered. Example targets include EC2 instances, AWS
     * Lambda functions, Amazon Kinesis streams, Amazon ECS tasks, AWS Step Functions state machines, and built-in
     * targets. Note that creating rules with built-in targets is supported only in the AWS Management Console.
     * </p>
     * <p>
     * For some target types, <code>PutTargets</code> provides target-specific parameters. If the target is an Amazon
     * Kinesis stream, you can optionally specify which shard the event goes to by using the
     * <code>KinesisParameters</code> argument. To invoke a command on multiple EC2 instances with one rule, you can use
     * the <code>RunCommandParameters</code> field.
     * </p>
     * <p>
     * To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate
     * permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For
     * EC2 instances, Amazon Kinesis streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM
     * roles that you specify in the <code>RoleARN</code> argument in <code>PutTarget</code>. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/auth-and-access-control-cwe.html">
     * Authentication and Access Control</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * <b>Input</b>, <b>InputPath</b> and <b>InputTransformer</b> are mutually exclusive and optional parameters of a
     * target. When a rule is triggered due to a matched event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If none of the following arguments are specified for a target, then the entire event is passed to the target in
     * JSON form (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event
     * is passed to the target).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>Input</b> is specified in the form of valid JSON, then the matched event is overridden with this constant.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>InputPath</b> is specified in the form of JSONPath (for example, <code>$.detail</code>), then only the part
     * of the event specified in the path is passed to the target (for example, only the detail part of the event is
     * passed).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>InputTransformer</b> is specified, then one or more specified JSONPaths are extracted from the event and
     * used as values in a template that you specify as the input to the target.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
     * immediately invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param putTargetsRequest
     * @return A Java Future containing the result of the PutTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.PutTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest putTargetsRequest);

    /**
     * <p>
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the
     * rule.
     * </p>
     * <p>
     * Targets are the resources that are invoked when a rule is triggered. Example targets include EC2 instances, AWS
     * Lambda functions, Amazon Kinesis streams, Amazon ECS tasks, AWS Step Functions state machines, and built-in
     * targets. Note that creating rules with built-in targets is supported only in the AWS Management Console.
     * </p>
     * <p>
     * For some target types, <code>PutTargets</code> provides target-specific parameters. If the target is an Amazon
     * Kinesis stream, you can optionally specify which shard the event goes to by using the
     * <code>KinesisParameters</code> argument. To invoke a command on multiple EC2 instances with one rule, you can use
     * the <code>RunCommandParameters</code> field.
     * </p>
     * <p>
     * To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate
     * permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For
     * EC2 instances, Amazon Kinesis streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM
     * roles that you specify in the <code>RoleARN</code> argument in <code>PutTarget</code>. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/auth-and-access-control-cwe.html">
     * Authentication and Access Control</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * <b>Input</b>, <b>InputPath</b> and <b>InputTransformer</b> are mutually exclusive and optional parameters of a
     * target. When a rule is triggered due to a matched event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If none of the following arguments are specified for a target, then the entire event is passed to the target in
     * JSON form (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event
     * is passed to the target).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>Input</b> is specified in the form of valid JSON, then the matched event is overridden with this constant.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>InputPath</b> is specified in the form of JSONPath (for example, <code>$.detail</code>), then only the part
     * of the event specified in the path is passed to the target (for example, only the detail part of the event is
     * passed).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>InputTransformer</b> is specified, then one or more specified JSONPaths are extracted from the event and
     * used as values in a template that you specify as the input to the target.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
     * immediately invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param putTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.PutTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest putTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
     * invoked.
     * </p>
     * <p>
     * When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param removeTargetsRequest
     * @return A Java Future containing the result of the RemoveTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.RemoveTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemoveTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest removeTargetsRequest);

    /**
     * <p>
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
     * invoked.
     * </p>
     * <p>
     * When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param removeTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.RemoveTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemoveTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest removeTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler);

    /**
     * <p>
     * Tests whether the specified event pattern matches the provided event.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch
     * Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating
     * event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     * @return A Java Future containing the result of the TestEventPattern operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.TestEventPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/TestEventPattern" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest testEventPatternRequest);

    /**
     * <p>
     * Tests whether the specified event pattern matches the provided event.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch
     * Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating
     * event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestEventPattern operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.TestEventPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/TestEventPattern" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest testEventPatternRequest,
            com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler);

}
