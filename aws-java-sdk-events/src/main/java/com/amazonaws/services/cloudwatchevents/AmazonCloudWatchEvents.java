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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudwatchevents.model.*;

/**
 * Interface for accessing Amazon CloudWatch Events.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatchevents.AbstractAmazonCloudWatchEvents} instead.
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
public interface AmazonCloudWatchEvents {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "events";

    /**
     * Overrides the default endpoint for this client ("events.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "events.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "events.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "events.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "events.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudWatchEvents#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DeleteRule
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Describes the details of the specified rule.
     * </p>
     * 
     * @param describeRuleRequest
     *        Container for the parameters to the <a>DescribeRule</a> operation.
     * @return Result of the DescribeRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DescribeRule
     */
    DescribeRuleResult describeRule(DescribeRuleRequest describeRuleRequest);

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
     * @return Result of the DisableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DisableRule
     */
    DisableRuleResult disableRule(DisableRuleRequest disableRuleRequest);

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
     * @return Result of the EnableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.EnableRule
     */
    EnableRuleResult enableRule(EnableRuleRequest enableRuleRequest);

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
     * @return Result of the ListRuleNamesByTarget operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListRuleNamesByTarget
     */
    ListRuleNamesByTargetResult listRuleNamesByTarget(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest);

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
     * @return Result of the ListRules operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListRules
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists of targets assigned to the rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     *        Container for the parameters to the <a>ListTargetsByRule</a> operation.
     * @return Result of the ListTargetsByRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListTargetsByRule
     */
    ListTargetsByRuleResult listTargetsByRule(ListTargetsByRuleRequest listTargetsByRuleRequest);

    /**
     * <p>
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     *        Container for the parameters to the <a>PutEvents</a> operation.
     * @return Result of the PutEvents operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutEvents
     */
    PutEventsResult putEvents(PutEventsRequest putEventsRequest);

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
     * @return Result of the PutRule operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is invalid.
     * @throws LimitExceededException
     *         This exception occurs if you try to create more rules or add more targets to a rule than allowed by
     *         default.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutRule
     */
    PutRuleResult putRule(PutRuleRequest putRuleRequest);

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
     * @return Result of the PutTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws LimitExceededException
     *         This exception occurs if you try to create more rules or add more targets to a rule than allowed by
     *         default.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutTargets
     */
    PutTargetsResult putTargets(PutTargetsRequest putTargetsRequest);

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
     * @return Result of the RemoveTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.RemoveTargets
     */
    RemoveTargetsResult removeTargets(RemoveTargetsRequest removeTargetsRequest);

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
     * @return Result of the TestEventPattern operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is invalid.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.TestEventPattern
     */
    TestEventPatternResult testEventPattern(TestEventPatternRequest testEventPatternRequest);

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
