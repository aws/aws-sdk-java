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
package com.amazonaws.services.cloudwatchevents;

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
 * state they automatically send events into an event stream. You can create rules that match selected events in the
 * stream and route them to targets to take action. You can also use rules to take action on a pre-determined schedule.
 * For example, you can configure rules to:
 * </p>
 * <ul>
 * <li>Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2
 * instance enters the running state.</li>
 * <li>Direct specific API records from CloudTrail to an Amazon Kinesis stream for detailed analysis of potential
 * security or availability risks.</li>
 * <li>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</li>
 * </ul>
 * <p>
 * For more information about Amazon CloudWatch Events features, see the <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide">Amazon CloudWatch Developer Guide</a>.
 * </p>
 */
public interface AmazonCloudWatchEventsAsync extends AmazonCloudWatchEvents {

    /**
     * <p>
     * Deletes a rule. You must remove all targets from a rule using <a>RemoveTargets</a> before you can delete the
     * rule.
     * </p>
     * <p>
     * <b>Note:</b> When you delete a rule, incoming events might still continue to match to the deleted rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param deleteRuleRequest
     *        Container for the parameters to the <a>DeleteRule</a> operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.DeleteRule
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes a rule. You must remove all targets from a rule using <a>RemoveTargets</a> before you can delete the
     * rule.
     * </p>
     * <p>
     * <b>Note:</b> When you delete a rule, incoming events might still continue to match to the deleted rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param deleteRuleRequest
     *        Container for the parameters to the <a>DeleteRule</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.DeleteRule
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Describes the details of the specified rule.
     * </p>
     * 
     * @param describeRuleRequest
     *        Container for the parameters to the <a>DescribeRule</a> operation.
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.DescribeRule
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest);

    /**
     * <p>
     * Describes the details of the specified rule.
     * </p>
     * 
     * @param describeRuleRequest
     *        Container for the parameters to the <a>DescribeRule</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.DescribeRule
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler);

    /**
     * <p>
     * Disables a rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression.
     * </p>
     * <p>
     * <b>Note:</b> When you disable a rule, incoming events might still continue to match to the disabled rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     *        Container for the parameters to the <a>DisableRule</a> operation.
     * @return A Java Future containing the result of the DisableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.DisableRule
     */
    java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest disableRuleRequest);

    /**
     * <p>
     * Disables a rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression.
     * </p>
     * <p>
     * <b>Note:</b> When you disable a rule, incoming events might still continue to match to the disabled rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     *        Container for the parameters to the <a>DisableRule</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.DisableRule
     */
    java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest disableRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler);

    /**
     * <p>
     * Enables a rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * <b>Note:</b> When you enable a rule, incoming events might not immediately start matching to a newly enabled
     * rule. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     *        Container for the parameters to the <a>EnableRule</a> operation.
     * @return A Java Future containing the result of the EnableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.EnableRule
     */
    java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest enableRuleRequest);

    /**
     * <p>
     * Enables a rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * <b>Note:</b> When you enable a rule, incoming events might not immediately start matching to a newly enabled
     * rule. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     *        Container for the parameters to the <a>EnableRule</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.EnableRule
     */
    java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest enableRuleRequest,
            com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler);

    /**
     * <p>
     * Lists the names of the rules that the given target is put to. You can see which of the rules in Amazon CloudWatch
     * Events can invoke a specific target in your account. If you have more rules in your account than the given limit,
     * the results will be paginated. In that case, use the next token returned in the response and repeat
     * ListRulesByTarget until the NextToken in the response is returned as null.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     *        Container for the parameters to the <a>ListRuleNamesByTarget</a> operation.
     * @return A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.ListRuleNamesByTarget
     */
    java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest);

    /**
     * <p>
     * Lists the names of the rules that the given target is put to. You can see which of the rules in Amazon CloudWatch
     * Events can invoke a specific target in your account. If you have more rules in your account than the given limit,
     * the results will be paginated. In that case, use the next token returned in the response and repeat
     * ListRulesByTarget until the NextToken in the response is returned as null.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     *        Container for the parameters to the <a>ListRuleNamesByTarget</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.ListRuleNamesByTarget
     */
    java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon CloudWatch Events rules in your account. You can either list all the rules or you can provide a
     * prefix to match to the rule names. If you have more rules in your account than the given limit, the results will
     * be paginated. In that case, use the next token returned in the response and repeat ListRules until the NextToken
     * in the response is returned as null.
     * </p>
     * 
     * @param listRulesRequest
     *        Container for the parameters to the <a>ListRules</a> operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.ListRules
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists the Amazon CloudWatch Events rules in your account. You can either list all the rules or you can provide a
     * prefix to match to the rule names. If you have more rules in your account than the given limit, the results will
     * be paginated. In that case, use the next token returned in the response and repeat ListRules until the NextToken
     * in the response is returned as null.
     * </p>
     * 
     * @param listRulesRequest
     *        Container for the parameters to the <a>ListRules</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.ListRules
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Lists of targets assigned to the rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     *        Container for the parameters to the <a>ListTargetsByRule</a> operation.
     * @return A Java Future containing the result of the ListTargetsByRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.ListTargetsByRule
     */
    java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest listTargetsByRuleRequest);

    /**
     * <p>
     * Lists of targets assigned to the rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     *        Container for the parameters to the <a>ListTargetsByRule</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetsByRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.ListTargetsByRule
     */
    java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest listTargetsByRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler);

    /**
     * <p>
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     *        Container for the parameters to the <a>PutEvents</a> operation.
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.PutEvents
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     *        Container for the parameters to the <a>PutEvents</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.PutEvents
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a rule. Rules are enabled by default, or based on value of the State parameter. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * <b>Note:</b> When you create or update a rule, incoming events might not immediately start matching to new or
     * updated rules. Please allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule will trigger on matching events as
     * well as on a schedule.
     * </p>
     * <p>
     * <b>Note:</b> Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However,
     * CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when
     * creating event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param putRuleRequest
     *        Container for the parameters to the <a>PutRule</a> operation.
     * @return A Java Future containing the result of the PutRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.PutRule
     */
    java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest putRuleRequest);

    /**
     * <p>
     * Creates or updates a rule. Rules are enabled by default, or based on value of the State parameter. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * <b>Note:</b> When you create or update a rule, incoming events might not immediately start matching to new or
     * updated rules. Please allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule will trigger on matching events as
     * well as on a schedule.
     * </p>
     * <p>
     * <b>Note:</b> Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However,
     * CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when
     * creating event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param putRuleRequest
     *        Container for the parameters to the <a>PutRule</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRule operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.PutRule
     */
    java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest putRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler);

    /**
     * <p>
     * Adds target(s) to a rule. Targets are the resources that can be invoked when a rule is triggered. For example,
     * AWS Lambda functions, Amazon Kinesis streams, and built-in targets. Updates the target(s) if they are already
     * associated with the role. In other words, if there is already a target with the given target ID, then the target
     * associated with that ID is updated.
     * </p>
     * <p>
     * In order to be able to make API calls against the resources you own, Amazon CloudWatch Events needs the
     * appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based
     * policies. For Amazon Kinesis streams, CloudWatch Events relies on IAM roles. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/EventsTargetPermissions.html">Permissions
     * for Sending Events to Targets</a> in the <b><i>Amazon CloudWatch Developer Guide</i></b>.
     * </p>
     * <p>
     * <b>Input</b> and <b>InputPath</b> are mutually-exclusive and optional parameters of a target. When a rule is
     * triggered due to a matched event, if for a target:
     * </p>
     * <ul>
     * <li>Neither <b>Input</b> nor <b>InputPath</b> is specified, then the entire event is passed to the target in JSON
     * form.</li>
     * <li><b>InputPath</b> is specified in the form of JSONPath (e.g. <b>$.detail</b>), then only the part of the event
     * specified in the path is passed to the target (e.g. only the detail part of the event is passed).</li>
     * <li><b>Input</b> is specified in the form of a valid JSON, then the matched event is overridden with this
     * constant.</li>
     * </ul>
     * <p>
     * <b>Note:</b> When you add targets to a rule, when the associated rule triggers, new or updated targets might not
     * be immediately invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param putTargetsRequest
     *        Container for the parameters to the <a>PutTargets</a> operation.
     * @return A Java Future containing the result of the PutTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.PutTargets
     */
    java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest putTargetsRequest);

    /**
     * <p>
     * Adds target(s) to a rule. Targets are the resources that can be invoked when a rule is triggered. For example,
     * AWS Lambda functions, Amazon Kinesis streams, and built-in targets. Updates the target(s) if they are already
     * associated with the role. In other words, if there is already a target with the given target ID, then the target
     * associated with that ID is updated.
     * </p>
     * <p>
     * In order to be able to make API calls against the resources you own, Amazon CloudWatch Events needs the
     * appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based
     * policies. For Amazon Kinesis streams, CloudWatch Events relies on IAM roles. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/EventsTargetPermissions.html">Permissions
     * for Sending Events to Targets</a> in the <b><i>Amazon CloudWatch Developer Guide</i></b>.
     * </p>
     * <p>
     * <b>Input</b> and <b>InputPath</b> are mutually-exclusive and optional parameters of a target. When a rule is
     * triggered due to a matched event, if for a target:
     * </p>
     * <ul>
     * <li>Neither <b>Input</b> nor <b>InputPath</b> is specified, then the entire event is passed to the target in JSON
     * form.</li>
     * <li><b>InputPath</b> is specified in the form of JSONPath (e.g. <b>$.detail</b>), then only the part of the event
     * specified in the path is passed to the target (e.g. only the detail part of the event is passed).</li>
     * <li><b>Input</b> is specified in the form of a valid JSON, then the matched event is overridden with this
     * constant.</li>
     * </ul>
     * <p>
     * <b>Note:</b> When you add targets to a rule, when the associated rule triggers, new or updated targets might not
     * be immediately invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param putTargetsRequest
     *        Container for the parameters to the <a>PutTargets</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.PutTargets
     */
    java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest putTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler);

    /**
     * <p>
     * Removes target(s) from a rule so that when the rule is triggered, those targets will no longer be invoked.
     * </p>
     * <p>
     * <b>Note:</b> When you remove a target, when the associated rule triggers, removed targets might still continue to
     * be invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param removeTargetsRequest
     *        Container for the parameters to the <a>RemoveTargets</a> operation.
     * @return A Java Future containing the result of the RemoveTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.RemoveTargets
     */
    java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest removeTargetsRequest);

    /**
     * <p>
     * Removes target(s) from a rule so that when the rule is triggered, those targets will no longer be invoked.
     * </p>
     * <p>
     * <b>Note:</b> When you remove a target, when the associated rule triggers, removed targets might still continue to
     * be invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param removeTargetsRequest
     *        Container for the parameters to the <a>RemoveTargets</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTargets operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.RemoveTargets
     */
    java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest removeTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler);

    /**
     * <p>
     * Tests whether an event pattern matches the provided event.
     * </p>
     * <p>
     * <b>Note:</b> Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However,
     * CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when
     * creating event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     *        Container for the parameters to the <a>TestEventPattern</a> operation.
     * @return A Java Future containing the result of the TestEventPattern operation returned by the service.
     * @sample AmazonCloudWatchEventsAsync.TestEventPattern
     */
    java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest testEventPatternRequest);

    /**
     * <p>
     * Tests whether an event pattern matches the provided event.
     * </p>
     * <p>
     * <b>Note:</b> Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However,
     * CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when
     * creating event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     *        Container for the parameters to the <a>TestEventPattern</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestEventPattern operation returned by the service.
     * @sample AmazonCloudWatchEventsAsyncHandler.TestEventPattern
     */
    java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest testEventPatternRequest,
            com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler);

}
